/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import beans.book_bean;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Oops
 */
public class book extends HttpServlet {

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
       response.setContentType("text/html;charset=UTF-8");
        
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
        processRequest(request, response);
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
        //processRequest(request, response);
        
         response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
           
           book_bean bb = new book_bean();
           bb.setEmail(request.getParameter("email").trim());
           bb.setSpackage(request.getParameter("package"));
           bb.setBookdate(request.getParameter("bookdate"));
           bb.setCoffee(request.getParameter("coffee"));
           bb.setVehicle(request.getParameter("vehicle"));
           bb.setChild(request.getParameter("child"));
          
           MyDB db = new MyDB();
           Connection con =db.getCon();
           Statement stmt = con.createStatement();
          
//           stmt.execute("insert into members (name,address,email,organization,password)values('"+name+"','"+address+"','"+email+"','"+org+"','"+pass+"')");
           stmt.execute("insert into bookings (type,date,coffee,vehicle,child,email)values('"+bb.getSpackage()+"','"+bb.getBookdate()+"','"+bb.getCoffee()+"','"+bb.getVehicle()+"','"+bb.getChild()+"','"+bb.getEmail()+"')");
           
           
  
            stmt.close();
            con.close();
           
          
//           HttpSession session=request.getSession();  
//           session.setAttribute("mail",email);
//           session.setAttribute("role","member");
          String redirectedPage = "/parentPage";
          response.sendRedirect("booking.jsp");
        }
          catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } 
//        response.sendRedirect("booking.jsp");
    }
        
        
          
       
        
  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

       