package admin.access;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
import admin.dao.ProductDao;
import admin.model.ProductBlueprint;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author John
 */
public class addtocart extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();

        switch (action) {
            case "/addtocart": {
                try {
                    addcart(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(addtocart.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case "/deletecart": {
                try {
                    deletecart(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(addtocart.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case "/checkoutcart": {
                try {
                    checkout(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(addtocart.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;

        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    private void addcart(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        int productID = Integer.parseInt(request.getParameter("productID"));
        HttpSession session = request.getSession();
        String userName = (String) session.getAttribute("userNamelog");
        ProductDao productDao = new ProductDao();

        // Fetch the product from the database
        ArrayList<ProductBlueprint> productList = productDao.selectProduct(productID);
        ProductBlueprint product = productList.isEmpty() ? null : productList.get(0);

        // Get the existing cart from the session
        boolean insertSuccess = productDao.createCart(userName, product);
        if (!insertSuccess) {
            System.out.println("error adding products to cart");
        }

        // Update the cart in the session
        // Redirect to the cart page
        response.sendRedirect(request.getContextPath() + "/cart");
    }

    private void deletecart(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        int productID = Integer.parseInt(request.getParameter("productID"));
        ProductDao productDao = new ProductDao();
        boolean deletedproduct = productDao.deleteCart(productID);
        HttpSession session = request.getSession();
        System.out.println(deletedproduct);
        // Remove session attribute based on type
        if (deletedproduct) {
            session.setAttribute("deleteCart", true);

            // Redirect to prevent form resubmission
            response.sendRedirect(request.getContextPath() + "/cart");
        }

    }

    private void checkout(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        HttpSession session = request.getSession();
        String userName = (String) session.getAttribute("userNamelog");

        ProductDao productDao = new ProductDao();
        boolean allDeleted = productDao.deleteAllCart(userName);
        if (allDeleted) {
            // Clear the cartProducts session attribute
            session.removeAttribute("cartProducts");
            session.setAttribute("checkout", "success");

            // Redirect to a confirmation page or home page after checkout
           response.sendRedirect(request.getContextPath() + "/cart");
        } else {
            // Handle deletion failure
            System.out.println("Error deleting cart items.");
            // Redirect to an error page or handle the failure gracefully
           response.sendRedirect(request.getContextPath() + "/cart");
        }

    }

}
