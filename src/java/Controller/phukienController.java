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

@WebServlet(name = "phukien", urlPatterns = {"/phukien"})
public class phukienController extends HttpServlet{
    private listproductDAO db;

    public phukienController() {
        this.db = new listproductDAO();
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<sanPham> listSP1 = null;
        List<sanPham> listSP2 = null;
        List<sanPham> listSP3 = null;
        List<sanPham> listSP4 = null;
        try {
            listSP1 = db.laySanPhamLoai("Sac");
            listSP2 = db.laySanPhamLoai("Chuot");
            listSP3 = db.laySanPhamLoai("Tai nghe");
            listSP4 = db.laySanPhamLoai("Tai nghe khong day");
        } catch (SQLException ex) {
            Logger.getLogger(laptopController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(laptopController.class.getName()).log(Level.SEVERE, null, ex);
        }
        req.setAttribute("listpk1", listSP1);
        req.setAttribute("listpk2", listSP2);
        req.setAttribute("listpk3", listSP3);
        req.setAttribute("listpk4", listSP4);
        req.getRequestDispatcher("phukien.jsp").forward(req, resp);
        
    }
   
}