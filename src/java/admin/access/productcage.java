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

/**
 *
 * @author IAN
 */
public class productcage extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();

        switch (action) {
            case "/cage1":
                viewCage1(request, response);
                break;
            case "/cage2":
                viewCage2(request, response);
                break;
            case "/cage3":
                viewCage3(request, response);
                break;
            case "/cage4":
                viewCage4(request, response);
                break;
            case "/cage5":
                viewCage5(request, response);
                break;
            case "/cage6":
                viewCage6(request, response);
                break;
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    private void viewCage1(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher rd = getServletContext().getRequestDispatcher(
                "/product/cage1.jsp");
        rd.forward(request, response);
    }

    private void viewCage2(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher rd = getServletContext().getRequestDispatcher(
                "/product/cage2.jsp");
        rd.forward(request, response);
    }

    private void viewCage3(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher rd = getServletContext().getRequestDispatcher(
                "/product/cage3.jsp");
        rd.forward(request, response);
    }

    private void viewCage4(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher rd = getServletContext().getRequestDispatcher(
                "/product/cage4.jsp");
        rd.forward(request, response);
    }
    
    private void viewCage5(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher rd = getServletContext().getRequestDispatcher(
                "/product/cage5.jsp");
        rd.forward(request, response);
    }
    
    private void viewCage6(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher rd = getServletContext().getRequestDispatcher(
                "/product/cage6.jsp");
        rd.forward(request, response);
    }

}
