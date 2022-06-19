/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DangkiDAO;
import Model.TaiKhoan;
import com.microsoft.sqlserver.jdbc.SQLServerException;
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
@WebServlet(name = "Dangkiservlet", urlPatterns = {"/Dangkiservlet"})
public class Dangkiservlet extends HttpServlet {
    public final DangkiDAO db;
    public String url;
    public Dangkiservlet() throws SQLException, SQLServerException, ClassNotFoundException {
        this.db = new DangkiDAO();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String hoten= request.getParameter("Hovaten");
        String tendn= request.getParameter("Tendn");
        String email= request.getParameter("Email");
        String mk= request.getParameter("Matkhau");
        String nlmk= request.getParameter("Nmk");
        
        TaiKhoan tk= new TaiKhoan(hoten, tendn, mk, nlmk, email, "khach");
        if(nlmk.equals(mk)){
            try {
                db.dangki(tk);
                url="/dangnhap.html";
            } catch (SQLException ex) {
                Logger.getLogger(Dangkiservlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            url = "/dangki.html";
        }
        getServletContext().getRequestDispatcher(url).forward(request, response);
       
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
