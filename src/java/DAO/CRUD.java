/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cart;
import Model.Product;
import Model.Taikhoan;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CRUD {
    private Connection conn;
    private ResultSet rs;
    public CRUD() throws SQLServerException, SQLException, ClassNotFoundException{
        conn = ConnectSql.getConnection();
    }
     public void delete(String code) throws SQLException{
        String ISSql = "delete from Product where id=? ";
       
       PreparedStatement ps = conn.prepareStatement(ISSql);
       ps.setString(1, code);
       
       ps.executeUpdate();
       
    }
     public List<Product> getProduct() throws SQLException, ParseException{
        List<Product> list = new ArrayList<>();
        
        String selectName = "SELECT * FROM Product"; 
        PreparedStatement ps = conn.prepareStatement(selectName);
        rs = ps.executeQuery();
        while(rs.next()){
            Product p = new Product();
            String id = rs.getString("id");
            String ten = rs.getString("ten");
            String loai = rs.getString("loaisp");
            String namsx=rs.getString("namsx");
            int slcon=rs.getInt("slcon");
            
            p.setId(id);
            p.setTen(ten);
            p.setLoaisp(loai);
            p.setNamsx(namsx);
            p.setSlcon(slcon);
           
            
            list.add(p);
        }
        
        return list;
    }
      public void update(String id, String ten, String loaisp,String namsx,String slcon ,String code1) throws SQLException{
        String ISSql = "UPDATE Product SET id=?, ten=?, loaisp=? ,namsx=? ,slcon= ? WHERE id=?";
                
        PreparedStatement ps = conn.prepareStatement(ISSql);
        ps.setString(1, id);
        ps.setString(2, ten);
        ps.setString(3, loaisp);
        ps.setString(4, namsx);
        ps.setString(5, slcon);
        ps.setString(6, code1);
        ps.executeUpdate();
       
    }
      //new
     public int saveCart(Cart tk) throws SQLException{
        
        String ISSql = "INSERT INTO cart"
                + " (id, idp, tendn, ngayorder) VALUES "
                + "(?,?,?,?);";
        PreparedStatement ps = conn.prepareStatement(ISSql);
        ps.setString(1, tk.getId());
        ps.setString(2, tk.getIdProduct());
        ps.setString(3, tk.getIdUser());
        ps.setString(4, tk.getCreateDate());
        
       
        return ps.executeUpdate();
    }
     public String layTK() throws SQLException{
        String sql = "SELECT TOP 1 * FROM dangnhap";
        String tendn ="";
               PreparedStatement ps = conn.prepareStatement(sql);
               
               rs = ps.executeQuery();
           while(rs.next()){
               tendn = rs.getString("tendn");
           }
        return tendn;
    }
      public String layidCart() throws SQLException{
        String ISSql = "SELECT TOP 1 id FROM cart ORDER BY iDP DESC";
        PreparedStatement ps = conn.prepareStatement(ISSql);
        
        rs = ps.executeQuery();
        String luotMuon = "";
        while(rs.next()){
             luotMuon = rs.getString("id");
                
            
        }
        return luotMuon;
    }
    public List<Cart> getCart(String idU) throws SQLException, ParseException{
        List<Cart> list = new ArrayList<>();
        
        String selectName = "select * from cart where tendn=?"; 
        PreparedStatement ps = conn.prepareStatement(selectName);
        
        ps.setString(1, idU);
        rs = ps.executeQuery();
        while(rs.next()){
            
            String id = rs.getString("id");
            String idP = rs.getString("idp");
            String idUser = rs.getString("tendn");
            String ngay=rs.getString("ngayorder");
            Cart p = new Cart(id, idP, idUser, ngay);
            
//            p.setId(id);
//            p.setIdProduct(idP);
//            p.setIdUser(idUser);
//            p.setCreateDate(ngay);
           
           
            
            list.add(p);
        }
        
        return list;
    }
    public void deleteCart(String id) throws SQLException{
        String ISSql = "DELETE FROM cart WHERE id=? "
               ;
        PreparedStatement ps = conn.prepareStatement(ISSql);
        ps.setString(1, id);
        ps.executeUpdate();
    }
    public void deleteDN() throws SQLException{
        String ISSql = "DELETE FROM dangnhap"
               ;
        PreparedStatement ps = conn.prepareStatement(ISSql);
        
        ps.executeUpdate();
    }
    public int saveProduct(Product tk) throws SQLException{
        
        String ISSql = "INSERT INTO Product"
                + " (id, ten, loaisp, namsx, slcon) VALUES "
                + "(?,?,?,?,?);";
        PreparedStatement ps = conn.prepareStatement(ISSql);
        ps.setString(1, tk.getId());
        ps.setString(2, tk.getTen());
        ps.setString(3, tk.getLoaisp());
        ps.setString(4, tk.getNamsx());
        ps.setInt(5, tk.getSlcon());
        
       
        return ps.executeUpdate();
    }
}
