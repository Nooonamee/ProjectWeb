/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CRUD;
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
@WebServlet(name = "editupdate", urlPatterns = {"/editupdate"})
public class editupdate extends HttpServlet {

    private final CRUD db;

    public editupdate() throws SQLException, SQLServerException, ClassNotFoundException {
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

            int id = Integer.parseInt(request.getParameter("id"));
            String ten = request.getParameter("ten");
            String loai = request.getParameter("loai");
            int gia = Integer.parseInt(request.getParameter("gia"));
            int soLuong = Integer.parseInt(request.getParameter("soLuong"));
            
            System.out.println("chuan bị update...............");
            db.update(id, ten, loai,gia,soLuong);
            System.out.println("da update.........");

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
