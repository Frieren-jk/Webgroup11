
package admin.access;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import admin.dao.UserDao;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




public class login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();

        switch (action) {

            case "/login":
                viewLogin(request, response);
                break;
            case "/user":
            {
                try {
                    logUser(request, response);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
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
    private void viewLogin(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RequestDispatcher rd = getServletContext().getRequestDispatcher(
                "/log-in.jsp");
        rd.forward(request, response);
    }
    
    private void logUser(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
        
        HttpSession session = request.getSession();
        RequestDispatcher dispatcher = null;
        
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        
        UserDao userdao = new UserDao();
        boolean loginUser = userdao.checkUserExists(userName, password);
        
        if (loginUser) {
            session.setAttribute("userName", userName);
            dispatcher = request.getRequestDispatcher("index.jsp");
        } else {
            
            request.setAttribute("status", "failed");
            dispatcher = request.getRequestDispatcher("log-in.jsp");
            
        
        }
        dispatcher.forward(request,response);
        
        
    }

   

}

