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
import admin.model.EmployeeBlueprint;

/**
 *
 * @author John
 */
public class inventory extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();

        switch (action) {
            case "/inventory/add/form":
                viewAddForm(request, response);
                break;
            case "/inventory/add":
                viewAdd(request, response);
                break;
            default:
                viewInventory(request, response);
                break;
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    private void viewInventory(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher rd = getServletContext().getRequestDispatcher(
                "/WEB-INF/Inventor/inventory.jsp");
        rd.forward(request, response);
    }

    private void viewAdd(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher rd = getServletContext().getRequestDispatcher(
                "/WEB-INF/Inventor/inventoryUpdated.jsp");
        rd.forward(request, response);
    }

    private void viewAddForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        if (request.getParameter("addItem") != null) {
            String firstName = request.getParameter("firstName");
            String middleName = request.getParameter("middleName");
            String lastName = request.getParameter("lastName");
            String department = request.getParameter("department");
            String employmentStatus = request.getParameter("employmentStatus");
            EmployeeBlueprint newEmployee = new EmployeeBlueprint(firstName, middleName, lastName, department, employmentStatus);
            EmployeeDao employeeDao = new EmployeeDao();
            boolean employeeDetails = employeeDao.createEmployee(newEmployee);

            if (employeeDetails) {
                String message = "Reg for" + firstName + " " + middleName + " " + lastName + " is successful";
                request.setAttribute("message", message);
            } else {
                String message = "Error";
                request.setAttribute("message", message);
            }

        }

        //request.setAttribute("employeeDetails", employeeDetails);
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/Inventor/add.jsp");
        rd.forward(request, response);

    }

}
