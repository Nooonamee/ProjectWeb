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

    public editupdate() throws SQLException {
        this.db = new CRUD();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {

            int id = (int) request.getAttribute("id");
            String ten = (String) request.getAttribute("ten");
            String moTa = (String) request.getAttribute("moTa");
            String loai = (String) request.getAttribute("loai");
            String mau = (String) request.getAttribute("mau");
            int gia = (int) request.getAttribute("gia");
            int soLuong = (int) request.getAttribute("soLuong");
            int daBan = (int) request.getAttribute("daBan");

            db.update(id, ten, moTa, loai,mau,gia,soLuong,daBan);

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
