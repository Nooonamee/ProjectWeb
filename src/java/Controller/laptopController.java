/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.listproductDAO;
import Model.sanPham;
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

/**
 *
 * @author Dell
 */

@WebServlet(name = "laptop", urlPatterns = {"/laptop"})
public class laptopController extends HttpServlet{
    private listproductDAO db;

    public laptopController() {
        this.db = new listproductDAO();
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<sanPham> listSP = null;
        try {
            listSP = db.laySanPhamLoai("laptop");
        } catch (SQLException ex) {
            Logger.getLogger(laptopController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(laptopController.class.getName()).log(Level.SEVERE, null, ex);
        }
        req.setAttribute("listSPLap", listSP);
        req.getRequestDispatcher("laptop.jsp").forward(req, resp);
    }
    
}
