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

@WebServlet(name = "dienthoai", urlPatterns = {"/dienthoai"})
public class dienthoaiController extends HttpServlet{
    private listproductDAO db;

    public dienthoaiController() {
        this.db = new listproductDAO();
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<sanPham> listSP1 = null;
        List<sanPham> listSP2 = null;
        try {
            listSP1 = db.laySanPhamLoai("dienthoai");
            listSP2 = db.laySanPhamLoai("maytinhbang");
        } catch (SQLException ex) {
            Logger.getLogger(laptopController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(laptopController.class.getName()).log(Level.SEVERE, null, ex);
        }
        req.setAttribute("listSPdt1", listSP1);
        req.setAttribute("listSPdt2", listSP2);
        req.getRequestDispatcher("dienthoai.jsp").forward(req, resp);
        
    }
   
}