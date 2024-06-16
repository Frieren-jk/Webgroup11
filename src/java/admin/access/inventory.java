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
import java.util.ArrayList;

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

        SearchInventory search = new SearchInventory();
        ArrayList<EmployeeBlueprint> AllUser = search.getAllUser();
        System.out.println(AllUser);
        request.setAttribute("AllUser", AllUser);

        ArrayList<ProductBlueprint> AllProducts = search.getAllProducts();
        System.out.println(AllProducts);
        request.setAttribute("AllProducts", AllProducts);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/Inventor/inventory.jsp");
        dispatcher.forward(request, response);

//        RequestDispatcher rd = getServletContext().getRequestDispatcher(
//                "/WEB-INF/Inventor/inventory.jsp");
//        rd.forward(request, response);
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
            } else {
                System.out.println("Did not added product");
            }

           
        }
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/Inventor/add.jsp");
        rd.forward(request, response);

    }

}
