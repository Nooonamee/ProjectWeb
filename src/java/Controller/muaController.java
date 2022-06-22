/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CRUD;
import DAO.xemchitietDAO;
import Model.Cart;
import Model.TaiKhoan;
import Model.sanPham;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "muaController", urlPatterns = {"/muaController"})
public class muaController extends HttpServlet {
    private CRUD crud;
    private xemchitietDAO db;

    public muaController() throws SQLException, SQLServerException, ClassNotFoundException {
        this.crud = new CRUD();
        this.db = new xemchitietDAO();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        sanPham p = null;
        try {
            p = db.getproduct(id);
        } catch (SQLException ex) {
            Logger.getLogger(muaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        HttpSession s = request.getSession();
        TaiKhoan tk = (TaiKhoan) s.getAttribute("user");
        ArrayList<Cart> listSP = (ArrayList<Cart>)s.getAttribute("listSanPham");
        ArrayList<Cart> listx = new ArrayList<>();
        int sl = 1; 
        for (Cart cart : listSP) {
            if (cart.getIdProduct().equals(id)) {
                sl = Integer.parseInt(cart.getId());
            }
            else listx.add(cart);
        }
        s.setAttribute("listSanPham", listx);
        System.out.println(tk);
        try {
            crud.mua(sl, p, tk.getUser_name());
            System.out.println("xoa thanh cong ................");
        } catch (SQLException ex) {
            Logger.getLogger(muaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        response.sendRedirect("/BTLWeb");
    }

}
