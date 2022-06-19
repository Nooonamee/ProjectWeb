package Controller;

import DAO.CRUD;
import Model.SanPham;
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

@WebServlet(name = "quanlidonhangservlet", urlPatterns = {"/quanlidonhangservlet"})
public class quanlidonhangservlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            CRUD db= new CRUD();
            List<SanPham> list;
            
            list = db.getProduct();
            
            request.setAttribute("list",list);
            request.getRequestDispatcher("/quanlidonhang.jsp").forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(quanlidonhangservlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(quanlidonhangservlet.class.getName()).log(Level.SEVERE, null, ex);
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
