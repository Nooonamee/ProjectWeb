/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAO.CRUD;
import DAO.dondamuaDAO;
import Model.Cart;
import Model.TaiKhoan;
import Model.sanPham;
import java.io.IOException;
import java.io.PrintWriter;
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
 * @author ADMIN
 */
@WebServlet(name = "quanlidonhang", urlPatterns = {"/quanlidonhang"})
public class quanlidonhang extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sess = request.getSession();
        TaiKhoan tk = (TaiKhoan)sess.getAttribute("user");
        dondamuaDAO db =new dondamuaDAO();
        ArrayList<Cart> list = null;
        try {
            list = (ArrayList<Cart>) db.laySPDaMuaAdmin();
        } catch (SQLException ex) {
            Logger.getLogger(dondamua.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("list", list);
        try {
            System.out.println(db.laygiasp("1")+".....................................");
        } catch (SQLException ex) {
            Logger.getLogger(dondamua.class.getName()).log(Level.SEVERE, null, ex);
        }
        getServletContext().getRequestDispatcher("/quanlidonhang.jsp").forward(request, response);
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
