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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;


@WebServlet(name = "AddToCartController", urlPatterns = {"/addtocart"})
public class AddToCartController extends HttpServlet {
    public  CRUD crud; 
    public AddToCartController() throws SQLException, SQLServerException, ClassNotFoundException {
        this.crud = new CRUD();
    }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("do get ..........");
            String idP = request.getParameter("id");
            String ten = "";
        try {
            ten = crud.layTenSP(idP);
        } catch (SQLException ex) {
            Logger.getLogger(AddToCartController.class.getName()).log(Level.SEVERE, null, ex);
        }
            Date datee = new Date();
            String ngayOrder = new SimpleDateFormat("yyyy/MM/dd").format(datee.getTime());
            String tendn;
            HttpSession sess = request.getSession();
            TaiKhoan tk = (TaiKhoan)sess.getAttribute("user");
            List<Cart> listSP = (List<Cart>)sess.getAttribute("listSanPham");
            tendn = tk.getUser_name();
            String id="";
        try {
            if(crud.layidProCart(idP).equals(idP)){
                id = Integer.parseInt(crud.layidCart(idP))+1+"";
            }else{
                id = 1+"";
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddToCartController.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            Cart cart = new Cart(id, idP,tendn, ngayOrder, ten);
            boolean check = true;
            for (Cart sp : listSP) {
                if (sp.getIdProduct().equals(cart.getIdProduct())) {
                    sp.setId(id);
                    check = false;
                }
            }
            if (check) listSP.add(cart);
            sess.setAttribute("listSanPham", listSP);
            try {
                if(cart.getId().equals("1")){
                    crud.saveCart(cart);
                }else{
                    crud.updateCart(cart);
                }
                request.setAttribute("list", "Thêm vào giỏ hàng thành công");
                xemchitietDAO db =new xemchitietDAO();
                sanPham b= db.getproduct(idP);
                request.setAttribute("b", b);
                System.out.println("thanh cong...");
            } catch (SQLException ex) {
                Logger.getLogger(AddToCartController.class.getName()).log(Level.SEVERE, null, ex);
            }
            getServletContext().getRequestDispatcher("/xemchitiet.jsp").forward(request, response);

    }

    
}
