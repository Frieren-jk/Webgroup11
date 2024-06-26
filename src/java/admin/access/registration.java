package admin.access;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import admin.dao.EmployeeDao;
import admin.model.EmployeeBlueprint;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet(name = "registration", urlPatterns = {"/registration", "/registration/add"})
public class registration extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();

        switch (action) {
            case "/registration":
                viewReg(request, response);
                break;
            case "/registration/add":
                addReg(request, response);
                break;
            default:
                // Handle unexpected paths or methods
                response.sendError(HttpServletResponse.SC_NOT_FOUND);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    private void viewReg(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/registration.jsp");
        rd.forward(request, response);
    }

    private void addReg(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("RegisterItem") != null) {
            String userName = request.getParameter("userName");
            String password = request.getParameter("password");
            String firstName = request.getParameter("firstName");
            String middleName = request.getParameter("middleName");
            String lastName = request.getParameter("lastName");
            String address = request.getParameter("address");
            String birthday = request.getParameter("birthday");
            String mobileNumber = request.getParameter("mobileNumber");
            EmployeeBlueprint newEmployee = new EmployeeBlueprint(
                    userName,
                    password,
                    firstName,
                    middleName,
                    lastName,
                    address,
                    birthday,
                    mobileNumber);
            EmployeeDao employeeDao = new EmployeeDao();
            boolean createUser = employeeDao.createEmployee(newEmployee);
            HttpSession session = request.getSession();

            if (createUser) {
                // Ensure no form resubmission
                response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
                response.setHeader("Pragma", "no-cache"); // HTTP 1.0
                response.setHeader("Expires", "0");
                session.setAttribute("regUser", true);
                session.setAttribute("userName", userName);

                response.sendRedirect(request.getContextPath() + "/home");
            }

        } else {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid registration request");
        }
    }

}
