/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAO.DreamStayDAO;
import Model.Account;
import Model.Infouser;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author win
 */
public class SignUpController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DreamStayDAO dao = new DreamStayDAO();
        String fname = request.getParameter("fname");
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        String cpass = request.getParameter("cpass");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        int age = Integer.parseInt(request.getParameter("age"));
        
        Account acc = dao.checkMatchUser(user);
        Infouser info = dao.checkMatchPhone(phone);
        
        
        
        if(acc != null){
            request.setAttribute("check", "User already exits!");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }else if(!pass.equals(cpass)){
            request.setAttribute("check", "Password do not match!");
            request.getRequestDispatcher("login.jsp").forward(request, response);
            return ;       
        }else if(info!= null){
            request.setAttribute("check", "Phone already exits!");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
        else if(age < 18){
            request.setAttribute("check", "You are not old enough!(18+)");
            request.getRequestDispatcher("login.jsp").forward(request, response);
            return ;
        }
        
        
        
        
            
        
        dao.insertAcc(user, pass);
        String id = dao.getAccId(user, pass);
        dao.insertUserInfo(fname, address, phone, age, id);
        request.setAttribute("user", user);
        request.setAttribute("pass", pass);
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
