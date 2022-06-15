/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DangnhapDAO;
import Model.Taikhoan;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author VAN TAI
 */
@WebServlet(name = "Dangnhapservlet", urlPatterns = {"/Dangnhapservlet"})
public class Dangnhapservlet extends HttpServlet {
    public final DangnhapDAO db;
    public String url;
    public Dangnhapservlet() throws SQLException {
        this.db = new DangnhapDAO();
    }
    
   

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String tendn=request.getParameter("Tendn");
       String mk=request.getParameter("Matkhau");
       Taikhoan tk= new Taikhoan();
       tk.setTendn(tendn);
       tk.setMk(mk);
       if(tendn.equals("admin")&&mk.equals("123")){
        getServletContext().getRequestDispatcher("/admin.jsp").forward(request, response);   
       }
       else{
           try {
               if(db.layTK(tk)){
                   url = "/index.html";
               }
               else{
                  url = "/dangnhap.html"; 
               }
           } catch (SQLException ex) {
               Logger.getLogger(Dangnhapservlet.class.getName()).log(Level.SEVERE, null, ex);
           }
           
       }
       getServletContext().getRequestDispatcher(url).forward(request, response);   
       
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}



