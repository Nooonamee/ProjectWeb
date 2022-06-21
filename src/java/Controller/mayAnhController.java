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

@WebServlet(name = "mayanh", urlPatterns = {"/mayanh"})
public class mayAnhController extends HttpServlet{
    private listproductDAO db;

    public mayAnhController() {
        this.db = new listproductDAO();
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<sanPham> listSP = null;
        try {
            listSP = db.laySanPhamLoai("may anh");
        } catch (SQLException ex) {
            Logger.getLogger(laptopController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(laptopController.class.getName()).log(Level.SEVERE, null, ex);
        }
        req.setAttribute("listSPanh", listSP);
        req.getRequestDispatcher("mayanh.jsp").forward(req, resp);
        
    }
   
}