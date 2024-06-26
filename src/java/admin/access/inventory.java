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
import admin.dao.ProductDao;
import admin.dao.SearchInventory;
import admin.model.EmployeeBlueprint;
import admin.model.ProductBlueprint;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;

/**
 *
 * @author John
 */
@WebServlet(name = "inventory", urlPatterns = {
    "/inventory",
    "/inventory/add/form",
    "/inventory/delete/product",
    "/inventory/update/product",
    "/inventory/users",
    "/inventory/update",
    "/inventory/update/form/product",
    "/inventory/users",
    "/inventory/add/form/user",
    "/inventory/add/user",
    "/inventory/update/form/user",
    "/inventory/delete/user",
    "/inventory/update/user",
    "/inventory/add"})
public class inventory extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();

        switch (action) {
            //PRODUCT INVENTORY CASES
            case "/inventory/products":
                viewInventoryProducts(request, response); //view inventory table method
                break;
            case "/inventory/add/form/product":
                viewAddFormProduct(request, response); //view form
                break;
            case "/inventory/add/product":
                AddProduct(request, response); //add product method
                break;
            case "/inventory/update/product": {
                try {
                    UpdateProduct(request, response);
                } catch (SQLException ex) {
                    System.out.println("UPDATE PRODUCT CASE ERROR:" + ex);
                }
            }
            break;
            case "/inventory/update/form/product": {
                try {
                    ShowEditProduct(request, response);
                } catch (SQLException ex) {
                    System.out.println("SHOW EDIT PRODUCT CASE ERROR:" + ex);
                }
            }
            break;
            case "/inventory/delete/product": {
                try {
                    DeleteProduct(request, response);
                } catch (SQLException ex) {
                    System.out.println("DELTE PRODUCT CASE ERROR:" + ex);
                }
            }
            break;

            //USERS INVENTORY CASES
            case "/inventory/users":
                viewInventoryUsers(request, response); //view inventory table method
                break;
            case "/inventory/add/form/user":
                viewAddFormUser(request, response); //view form
                break;
            case "/inventory/add/user":
                AddUser(request, response); //add product method
                break;
            case "/inventory/update/form/user": {
                try {
                    ShowEditUser(request, response);
                } catch (SQLException ex) {
                    System.out.println("SHOW EDIT USER CASE ERROR:" + ex);
                }
            }
            break;
            case "/inventory/delete/user": {
                try {
                    DeleteUser(request, response);
                } catch (SQLException ex) {
                    System.out.println("DELETE USER CASE ERROR:" + ex);
                }
            }
            break;

            case "/inventory/update/user": {
                try {
                    UpdateUser(request, response);
                } catch (SQLException ex) {
                    System.out.println("UPDATE USER CASE ERROR:" + ex);
                }
            }
            break;

            //end of switch case
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    //INVENTORY METHODS FOR PRODUCT
    private void viewInventoryProducts(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        SearchInventory search = new SearchInventory();

        ArrayList<ProductBlueprint> AllProducts = search.getAllProducts();

        request.setAttribute("AllProducts", AllProducts);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/Inventor/inventoryProducts.jsp");
        dispatcher.forward(request, response);

    }

    private void AddProduct(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        if (request.getParameter("addItem") != null) {
            int productID = Integer.parseInt(request.getParameter("productID"));
            String productName = request.getParameter("productName");
            String description = request.getParameter("description");
            String size = request.getParameter("size");
            BigDecimal price = new BigDecimal(request.getParameter("price"));
            int quantity = Integer.parseInt(request.getParameter("quantity"));

            // Create a new product instance
            ProductBlueprint newProduct = new ProductBlueprint(productID, productName, description, size, price, quantity);
            // Instantiate the ProductDao
            ProductDao productDao = new ProductDao();

            // Insert the new product into the database
            boolean productAdded = productDao.createProduct(newProduct);

            // Prepare a message to display on the UI
            if (productAdded) {
                System.out.println("Succesfully added product");
                response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
                response.setHeader("Pragma", "no-cache"); // HTTP 1.0
                response.setHeader("Expires", "0");
                response.sendRedirect(request.getContextPath() + "/inventory/products");
            } else {
                System.out.println("Did not add product");

                response.sendRedirect(request.getContextPath() + "/inventory/add/form/product");
            }
        }
    }

    private void viewAddFormProduct(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/Inventor/add_products.jsp");
        rd.forward(request, response);

    }

    private void DeleteProduct(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        int productID = Integer.parseInt(request.getParameter("productID"));
        ProductDao productDao = new ProductDao();
        boolean deletedproduct = productDao.deleteProduct(productID);
        HttpSession session = request.getSession();

        // Remove session attribute based on type
        if (deletedproduct) {
            session.setAttribute("deleteProduct", true);
            session.setAttribute("productID", productID);

            // Redirect to prevent form resubmission
            response.sendRedirect(request.getContextPath() + "/inventory/products");
        }

    }

    private void ShowEditProduct(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        // Fetch productID from request parameter
        String productIDParam = request.getParameter("productID");

        try {
            // Convert productIDParam to an integer
            int productID = Integer.parseInt(productIDParam);

            // Instantiate your DAO and call selectProduct
            ProductDao productDao = new ProductDao();
            ArrayList<ProductBlueprint> product = productDao.selectProduct(productID);

            // Set the 'product' attribute in request scope
            request.setAttribute("product", product);

            // Forward the request to the JSP page
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/Inventor/edit_products.jsp");
            dispatcher.forward(request, response);

        } catch (NumberFormatException e) { // Handle the case where productIDParam is not a valid integer

            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid productID");
        }
    }

    private void UpdateProduct(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {

        int productID = Integer.parseInt(request.getParameter("productID"));
        String productName = request.getParameter("productName");
        String description = request.getParameter("description");
        String size = request.getParameter("size");
        BigDecimal price = new BigDecimal(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        HttpSession session = request.getSession();

        ProductDao update = new ProductDao();

        boolean editProduct = update.updateProduct(productName, description, size, price, quantity, productID);

        if (editProduct) {
            session.setAttribute("editProduct", true);
            session.setAttribute("productName", productName);
            response.sendRedirect(request.getContextPath() + "/inventory/products");

        } else {
            System.out.println("Error Occured");
        }
    }

    // INVENTORY METHODS FOR USER
    // INVENTORY METHODS FOR USER
    // INVENTORY METHODS FOR USER
    // INVENTORY METHODS FOR USER
    private void viewAddFormUser(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/Inventor/add_users.jsp");
        rd.forward(request, response);

    }

    private void viewInventoryUsers(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        SearchInventory search = new SearchInventory();
        ArrayList<EmployeeBlueprint> AllUser = search.getAllUser();

        request.setAttribute("AllUser", AllUser);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/Inventor/inventoryUsers.jsp");
        dispatcher.forward(request, response);

    }

    private void AddUser(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        if (request.getParameter("AddUser") != null) {
            String userName = request.getParameter("userName");
            String firstName = request.getParameter("firstName");
            String password = "Secret@123"; //Default Password
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
            boolean userAdded = employeeDao.createEmployee(newEmployee);

            if (userAdded) {
                System.out.println("Add Inventory for " + userName + " is successful");
                response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
                response.setHeader("Pragma", "no-cache"); // HTTP 1.0
                response.setHeader("Expires", "0");
                response.sendRedirect(request.getContextPath() + "/inventory/users");
            } else {
                System.out.println("Did not add product");

                response.sendRedirect(request.getContextPath() + "/inventory/add/form/user");
            }

        } else {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid Add Inventory request");
        }
    }

    private void ShowEditUser(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        // Fetch productID from request parameter
        String userNameParam = request.getParameter("userName");

        try {
            // Convert productIDParam to an integer
            String userName = userNameParam;

            // Instantiate your DAO and call selectProduct
            EmployeeDao employeedao = new EmployeeDao();
            ArrayList<EmployeeBlueprint> user = employeedao.selectUser(userName);

            // Set the 'product' attribute in request scope
            request.setAttribute("user", user);

            // Forward the request to the JSP page
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/Inventor/edit_users.jsp");
            dispatcher.forward(request, response);

        } catch (NumberFormatException e) { // Handle the case where productIDParam is not a valid integer

            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid username");
        }
    }

    private void DeleteUser(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        String userName = request.getParameter("userName");
        EmployeeDao employeedao = new EmployeeDao();
        boolean deleteUser = employeedao.deleteUser(userName);
        HttpSession session = request.getSession();

        if (deleteUser) {
            session.setAttribute("deleteUser", true);
            session.setAttribute("userName", userName);

            // Redirect to prevent form resubmission
            response.sendRedirect(request.getContextPath() + "/inventory/users");

        }

    }

    private void UpdateUser(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {

        try {
            String userName = request.getParameter("userName");
            String password = request.getParameter("password");
            String firstName = request.getParameter("firstName");
            String middleName = request.getParameter("middleName");
            String lastName = request.getParameter("lastName");
            String address = request.getParameter("address");
            String birthday = request.getParameter("birthday");
            String mobileNumber = request.getParameter("mobileNumber");
            HttpSession session = request.getSession();

            EmployeeDao employeedao = new EmployeeDao();
            boolean editUser = employeedao.updateUser(
                    password,
                    firstName,
                    middleName,
                    lastName,
                    address,
                    birthday,
                    mobileNumber,
                    userName);

            if (editUser) {
                session.setAttribute("editUser", true);
                session.setAttribute("userName", userName);
                response.sendRedirect(request.getContextPath() + "/inventory/users");
            } else {
                System.out.println("Error Occurred: Failed to update user.");
                response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Failed to update user.");
            }
        } catch (IOException e) {
            System.out.println("Unexpected Error: " + e.getMessage());
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "An unexpected error occurred. Please try again later.");
        }
    }

}
