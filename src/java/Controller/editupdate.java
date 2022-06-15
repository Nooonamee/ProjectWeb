/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CRUD;
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
@WebServlet(name = "editupdate", urlPatterns = {"/editupdate"})
public class editupdate extends HttpServlet {
    private final CRUD db;
    public editupdate() throws SQLException{
        this.db=new CRUD();
    }
    
    

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            
            String id = request.getParameter("id");
            String ten = request.getParameter("ten");
            String loai = request.getParameter("loaisp");
            String nam = request.getParameter("namsx");
            String sl = request.getParameter("slcon");
            String code1 = request.getParameter("code1");
      
            db.update(id, ten, loai,nam,sl,code1);
            
            getServletContext().getRequestDispatcher("/viewedit.jsp").forward(request, response);
            
        } catch (SQLException ex) {
            Logger.getLogger(editupdate.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
    

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
