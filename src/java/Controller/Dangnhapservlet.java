/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DangnhapDAO;
import Model.TaiKhoan;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author VAN TAI
 */
@WebServlet(name = "Dangnhapservlet", urlPatterns = {"/Dangnhapservlet"})
public class Dangnhapservlet extends HttpServlet {
    public final DangnhapDAO db;
    public String url;
    public Dangnhapservlet() throws SQLException, SQLServerException, ClassNotFoundException {
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
        TaiKhoan tk= new TaiKhoan();
        TaiKhoan tk2= null;
        tk.setUser_name(tendn);
        tk.setPassword(mk);
        String loai = "";
        try {
            loai = db.layTK(tk).getLoai();
            tk2 = db.layTK(tk);
        } catch (SQLException ex) {
            Logger.getLogger(Dangnhapservlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(loai.equals("admin")){
            getServletContext().getRequestDispatcher("/admin.jsp").forward(request, response);   
        }
        if(loai.equals("khach")){
            url = "/index.jsp";
        }
        else{
            url = "/dangnhap.html"; 
        }
        HttpSession sess = request.getSession();
        sess.setAttribute("user", tk2);
        getServletContext().getRequestDispatcher(url).forward(request, response);   
       
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}



