/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CRUD;
import DAO.DangkiDAO;
import Model.Cart;
import Model.TaiKhoan;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;


@WebServlet(name = "AddToCartController", urlPatterns = {"/addtocart"})
public class AddToCartController extends HttpServlet {
    public  CRUD crud; 
    public AddToCartController() throws SQLException, SQLServerException, ClassNotFoundException {
        this.crud = new CRUD();
    }
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

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
            Date datee = new Date();
            String ngayOrder = new SimpleDateFormat("yyyy/MM/dd").format(datee.getTime());
            String tendn;
            HttpSession sess = request.getSession();
            TaiKhoan tk = (TaiKhoan)sess.getAttribute("user");
            tendn = tk.getUser_name();
//        try {
//            tendn = crud.layTK();
//        } catch (SQLException ex) {
//            Logger.getLogger(AddToCartController.class.getName()).log(Level.SEVERE, null, ex);
//        }
            String id="";
        try {
            id = Integer.parseInt(crud.layidCart())+1+"";
        } catch (SQLException ex) {
            Logger.getLogger(AddToCartController.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            Cart cart = new Cart(id, idP,tendn, ngayOrder );
            System.out.println(cart);
            try {
                crud.saveCart(cart);
                request.setAttribute("list", "Thêm vào giỏ hàng thành công");
                System.out.println("thanh cong...");
            } catch (SQLException ex) {
                Logger.getLogger(AddToCartController.class.getName()).log(Level.SEVERE, null, ex);
            }
            getServletContext().getRequestDispatcher("/xemchitiet.jsp").forward(request, response);

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    
}
