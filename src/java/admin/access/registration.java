package admin.access;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import admin.dao.EmployeeDao;
import admin.dao.SearchInventory;
import admin.model.EmployeeBlueprint;
import java.util.ArrayList;

/**
 *
 * @author John
 */
public class registration extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();

        switch (action) {
            case "/registration":
                viewReg(request, response);
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
            boolean employeeDetails = employeeDao.createEmployee(newEmployee);

            if (employeeDetails) {

                System.out.println("Registration for" + userName + " is successful");

            } else {
                System.out.println("Registration is not successful");
            }

        }

        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
        response.setHeader("Pragma", "no-cache"); // HTTP 1.0
        response.setHeader("Expires", "0");

        RequestDispatcher rd = getServletContext().getRequestDispatcher(
                "/registration.jsp");
        rd.forward(request, response);

    }

}
