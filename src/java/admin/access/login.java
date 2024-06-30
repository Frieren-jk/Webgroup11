/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package admin.access;

import admin.dao.EmployeeDao;
import admin.model.EmployeeBlueprint;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.catalina.User;

/**
 *
 * @author John
 */

public class login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();

        switch (action) {
            default:
                viewDefault(request, response);
                break;
        }

    }
    
    private void viewDefault(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher rd = getServletContext().getRequestDispatcher(
                "/login.jsp");
        rd.forward(request, response);
    }
    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");

        try {
            EmployeeDao dao = new EmployeeDao();
            EmployeeBlueprint user = dao.checkUserExists(userName, password);

            if (user != null) {
                // Check if the user exists in the database
                if (dao.isUserInDatabase(user)) {
                    // User exists and password is correct, authenticate user
                    request.getSession().setAttribute("authenticated", true);
                    request.getSession().setAttribute("userName", userName);
                    response.sendRedirect(request.getContextPath() + "/home");
                } else {
                    // User does not exist in the database
                    request.setAttribute("error", "User not found in database");
                    RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.jsp");
                    rd.forward(request, response);
                }
            } else {
                // User does not exist or password is incorrect
                request.setAttribute("error", "Invaslid username or password");
                RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.jsp");
                rd.forward(request, response);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException: " + e.getMessage());
            // Log the error or display it to the user
            request.setAttribute("error", "An error occurred: " + e.getMessage());
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.jsp");
            rd.forward(request, response);
        }
    }
}

    /*private void UserLoginServlet HttpServlet {

        private static final long serialVersionUID = 1L;
        
        
        String userName  = request.getParameter("userName");
        String password = request.getParameter("password");

        UserDao userDao = new UserDao();

        
            try {
                boolean user = userDao.checkUserExists(userName, password);
            String destPage = "login.jsp";

            if (user) {
                HttpSession session = request.getSession();
                session.setAttribute("user", user);
                destPage = "home.jsp";
            } else {
                String message = "Invalid username/password";
                request.setAttribute("message", message);
            }

            RequestDispatcher dispatcher = request.getRequestDispatcher(destPage);
            dispatcher.forward(request, response);

        } catch (ClassNotFoundException | ServletException ex) {

        }
    }
} */
 /*private void UserLoginServlet HttpServlet {

        private static final long serialVersionUID = 1L;
        
        
        String userName  = request.getParameter("userName");
        String password = request.getParameter("password");

        UserDao userDao = new UserDao();

        
            try {
                boolean user = userDao.checkUserExists(userName, password);
            String destPage = "login.jsp";

            if (user) {
                HttpSession session = request.getSession();
                session.setAttribute("user", user);
                destPage = "home.jsp";
            } else {
                String message = "Invalid username/password";
                request.setAttribute("message", message);
            }

            RequestDispatcher dispatcher = request.getRequestDispatcher(destPage);
            dispatcher.forward(request, response);

        } catch (ClassNotFoundException | ServletException ex) {

        }
    }
} */
