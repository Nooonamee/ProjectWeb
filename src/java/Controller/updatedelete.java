 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CRUD;
import Model.sanPham;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
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
@WebServlet(name = "updatedelete", urlPatterns = {"/updatedelete"})
public class updatedelete extends HttpServlet {
    public final CRUD db;
    public String url;
    public updatedelete() throws SQLException, SQLServerException, ClassNotFoundException {
        this.db = new CRUD();
    }
   
   

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       try {
            String code = request.getParameter("txtid");
            
            db.delete(code);
          List<sanPham> list =db.getProduct();
        request.setAttribute("list", list);
        getServletContext().getRequestDispatcher("/quanlisanpham.jsp").forward(request, response); 
        } catch (SQLException ex) {
            Logger.getLogger(updatedelete.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(updatedelete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
