package admin.access;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
import admin.dao.SearchInventory;
import admin.model.ProductBlueprint;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author John
 */
public class cart extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();

        switch (action) {
            case "/cart":
                viewcart(request, response);
                break;

        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    private void viewcart(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String userName = (String) session.getAttribute("userNamelog");

        SearchInventory search = new SearchInventory();

        ArrayList<ProductBlueprint> AllProducts = search.getAllCart(userName);
        
        request.setAttribute("cartProducts", AllProducts);

        RequestDispatcher rd = getServletContext().getRequestDispatcher(
                "/cart.jsp");
        rd.forward(request, response);
    }

}
