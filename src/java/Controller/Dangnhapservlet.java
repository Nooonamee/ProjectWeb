/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CRUD;
import DAO.DangnhapDAO;
import Model.Cart;
import Model.TaiKhoan;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.io.IOException;
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
import javax.servlet.http.HttpSession;

/**
 *
 * @author VAN TAI
 */
@WebServlet(name = "Dangnhapservlet", urlPatterns = {"/Dangnhapservlet"})
public class Dangnhapservlet extends HttpServlet {
    public final DangnhapDAO db;
    public  CRUD crud;
    public String url;
    public Dangnhapservlet() throws SQLException, SQLServerException, ClassNotFoundException {
        this.db = new DangnhapDAO();
        this.crud = new CRUD();
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
        List<Cart> listSanPham = null;
        try {
            loai = db.layTK(tk).getLoai();
            tk2 = db.layTK(tk);
            listSanPham = crud.getCart(tk2.getUser_name());
            System.out.println(listSanPham.size());
        } catch (SQLException ex) {
            Logger.getLogger(Dangnhapservlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Dangnhapservlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(loai == null) loai = "";
        else {
            HttpSession sess = request.getSession();
            sess.setAttribute("user", tk2);
            sess.setAttribute("listSanPham", listSanPham);
        }
        if(loai.equals("admin")){
            url = "/admin.jsp";
        }
        else if(loai.equals("khach")){
            url = "";
        }
        else{
            url = "/dangnhap.html"; 
        }
        response.sendRedirect("/BTLWeb"+url);   
       
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}



