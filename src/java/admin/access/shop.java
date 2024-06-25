package admin.access;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author IAN
 */
public class shop extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();

        switch (action) {
            case "/bowls":
                viewBowls(request, response);
                break;
            case "/cages":
                viewCages(request, response);
                break;
            case "/clothes":
                viewClothes(request, response);
                break;
            case "/foods":
                viewFoods(request, response);
                break;
            case "/leashes":
                viewLeashes(request, response);
                break;
            case "/litterboxes":
                viewLitterboxes(request, response);
                break;
            case "/toys":
                viewToys(request, response);
                break;

        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    private void viewBowls(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher rd = getServletContext().getRequestDispatcher(
                "/shop/bowls.jsp");
        rd.forward(request, response);
    }

    private void viewCages(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher rd = getServletContext().getRequestDispatcher(
                "/shop/cages.jsp");
        rd.forward(request, response);
    }

    private void viewClothes(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher rd = getServletContext().getRequestDispatcher(
                "/shop/clothes.jsp");
        rd.forward(request, response);
    }

    private void viewFoods(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher rd = getServletContext().getRequestDispatcher(
                "/shop/foods.jsp");
        rd.forward(request, response);
    }
    
    private void viewLeashes(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher rd = getServletContext().getRequestDispatcher(
                "/shop/leashes.jsp");
        rd.forward(request, response);
    }
    
    private void viewLitterboxes(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher rd = getServletContext().getRequestDispatcher(
                "/shop/litterboxes.jsp");
        rd.forward(request, response);
    }
    
     private void viewToys(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher rd = getServletContext().getRequestDispatcher(
                "/shop/toys.jsp");
        rd.forward(request, response);
    }
}
