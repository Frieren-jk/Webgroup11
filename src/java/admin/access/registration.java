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
            long mobileNumber = Long.parseLong(request.getParameter("mobileNumber"));
            String department = request.getParameter("department");
            String employmentStatus = request.getParameter("employmentStatus");
            EmployeeBlueprint newEmployee = new EmployeeBlueprint(
                    userName,
                    password,
                    firstName, 
                    middleName, 
                    lastName, 
                    address,
                    birthday,
                    mobileNumber,
                    department, 
                    employmentStatus);
            EmployeeDao employeeDao = new EmployeeDao();
            boolean employeeDetails = employeeDao.createEmployee(newEmployee);

            if (employeeDetails) {
                
                System.out.println("Registration for" + userName + " is successful");
                
            } else {
                System.out.println("Registration is not successful");
            }

        }
        
        

        RequestDispatcher rd = getServletContext().getRequestDispatcher(
                "/registration.jsp");
        rd.forward(request, response);
        
    }
    
   
  

}
