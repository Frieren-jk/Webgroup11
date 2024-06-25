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

                response.sendRedirect(request.getContextPath() + "/inventory/add/form");
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
        productDao.deleteProduct(productID);

        response.sendRedirect(request.getContextPath() + "/inventory/products");

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

        ProductDao update = new ProductDao();
        
        boolean editRegister = update.updateProduct(productName, description, size, price,  quantity, productID);
        
        if (editRegister) {
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
}
