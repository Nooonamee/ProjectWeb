/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.xemchitietDAO;
import Model.Product;
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
@WebServlet(name = "viewdelete", urlPatterns = {"/viewdelete"})
public class viewdelete extends HttpServlet {
    public final xemchitietDAO db;
    public String url;
    public viewdelete() throws SQLException {
        this.db = new xemchitietDAO();
    }
    
   

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       try {
            String code= request.getParameter("txtiD");
            Product b= db.getproduct(code);
            request.setAttribute("b", b);
            request.getRequestDispatcher("/viewdelete.jsp").forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(viewdelete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
