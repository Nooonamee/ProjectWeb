/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.CRUD;
import DAO.dondamuaDAO;
import DAO.listproductDAO;
import Model.Cart;
import Model.TaiKhoan;
import Model.sanPham;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
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
 * @author Dell
 */
@WebServlet(name = "dondamua", urlPatterns = {"/dondamua"})
public class dondamua extends HttpServlet{
    private dondamuaDAO db;

    public dondamua() throws SQLException, SQLServerException, ClassNotFoundException {
        this.db = new dondamuaDAO();
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession sess = req.getSession();
        TaiKhoan tk = (TaiKhoan)sess.getAttribute("user");
        ArrayList<Cart> list = null;
        try {
            list = (ArrayList<Cart>) db.laySPDaMuaUser(tk.getUser_name());
        } catch (SQLException ex) {
            Logger.getLogger(dondamua.class.getName()).log(Level.SEVERE, null, ex);
        }
        req.setAttribute("list", list);
        try {
            System.out.println(db.laygiasp("1")+".....................................");
        } catch (SQLException ex) {
            Logger.getLogger(dondamua.class.getName()).log(Level.SEVERE, null, ex);
        }
        getServletContext().getRequestDispatcher("/dondamua.jsp").forward(req, resp);
    }
   
}