package admin.access;

import admin.dao.UserDao;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.mindrot.jbcrypt.BCrypt;

public class login extends HttpServlet {

    private static final int MAX_ATTEMPTS = 3; // Maximum login attempts
    private static final long LOCKOUT_TIME = 60000; //  (1 minute) or 300000 for 5 minutes
    private static final HashMap<String, Integer> attempts = new HashMap<>();
    private static final HashMap<String, Long> lockout = new HashMap<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();

        switch (action) {
            case "/login":
                viewLogin(request, response);
                break;
            case "/changePassword": {
                try {
                    changePassword(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;

            case "/user":
                try {
                    logUser(request, response);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    private void viewLogin(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/log-in.jsp");
        rd.forward(request, response);
    }

    private void changePassword(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {

        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String newPassword = request.getParameter("newPassword");

        System.out.println(username + newPassword);
        UserDao userDao = new UserDao();
        boolean passwordChanged = userDao.changePass(username, newPassword);
        String newpass = userDao.getLatestPass(username);
        String hashpass = hashPassword(newpass);
        System.out.println("both pass: " + newpass + "and " + hashpass);
        if (passwordChanged) {
            session.removeAttribute("currentPassword");
            session.setAttribute("latestpass", newPassword);
            System.out.println("Success Change Password");
            
            response.sendRedirect(request.getContextPath() + "/home");
        } else {
            session.setAttribute("latestpass", "samepass");
            System.out.println("Failed Change Password");
            response.sendRedirect(request.getContextPath() + "/home");
        }
    }

    private void logUser(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
        HttpSession session = request.getSession();
        String userName = request.getParameter("userNamelog");
        String password = request.getParameter("passwordlog");

        if (lockout.containsKey(userName) && lockout.get(userName) > System.currentTimeMillis()) {
            // User is currently locked out
            session.setAttribute("lockoutTime", lockout.get(userName));
            response.sendRedirect(request.getContextPath() + "/login");
            return;
        }

        UserDao userdao = new UserDao();
        boolean loginUser = userdao.checkUserExists(userName, password);

        if (loginUser) {
            // Reset attempts after successful login
            attempts.remove(userName);
            lockout.remove(userName);
            session.setAttribute("userNamelog", userName);
            session.setAttribute("currentPassword", password);
            session.setAttribute("userSuccess", "success");
            response.sendRedirect(request.getContextPath() + "/home");
        } else {
            // Increment the attempt count
            int attemptCount = attempts.getOrDefault(userName, 0) + 1;
            attempts.put(userName, attemptCount);

            if (attemptCount >= MAX_ATTEMPTS) {
                // Lock the user out if the maximum attempts are reached
                long lockoutExpiration = System.currentTimeMillis() + LOCKOUT_TIME;
                lockout.put(userName, System.currentTimeMillis() + LOCKOUT_TIME);
                attempts.remove(userName);
                session.setAttribute("lockoutTime", lockoutExpiration);
                response.sendRedirect(request.getContextPath() + "/login");
            } else {
                session.setAttribute("status", "failed");
                response.sendRedirect(request.getContextPath() + "/login");
            }
        }
    }

    private String hashPassword(String password) {
        String salt = BCrypt.gensalt(12); // Use a strong salt (12 rounds is recommended)
        return BCrypt.hashpw(password, salt);
    }
}
