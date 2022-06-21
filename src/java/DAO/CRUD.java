/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cart;
import Model.sanPham;
import Model.TaiKhoan;
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
import org.apache.catalina.Session;


public class CRUD {
    private Connection conn;
    private ResultSet rs;
    public CRUD() throws SQLServerException, SQLException, ClassNotFoundException{
        conn = ConnectSql.getConnection();
    }
    public void delete(String code) throws SQLException{
        String ISSql = "delete from sanPham where id=? ";
       
        PreparedStatement ps = conn.prepareStatement(ISSql);
        ps.setString(1, code);
       
        ps.executeUpdate();
       
    }
    public List<sanPham> getProduct() throws SQLException, ParseException{
        List<sanPham> list = new ArrayList<>();
        
        String selectName = "SELECT * FROM sanPham"; 
        PreparedStatement ps = conn.prepareStatement(selectName);
        rs = ps.executeQuery();
        while(rs.next()){
            sanPham p = new sanPham();
            int id=rs.getInt("id");
            String ten = rs.getString("ten");
            String moTa = rs.getString("moTa");
            String loai = rs.getString("loai");
            String mau = rs.getString("mau");
            int gia=rs.getInt("gia");
            int daBan=rs.getInt("daBan");
            
            p.setId(id);
            p.setTen(ten);
            p.setMoTa(moTa);
            p.setLoai(loai);
            p.setMau(mau);
            p.setGia(gia);
            p.setSoLuong(daBan);
            p.setDaBan(daBan);
            list.add(p);
        }
        
        return list;
    }
    public void update(int id, String ten ,String loai ,int gia, int soLuong) throws SQLException{
        String ISSql = "UPDATE sanPham SET ten=?, loai=?, gia= ?,soLuong= ? WHERE id=?";
                
        PreparedStatement ps = conn.prepareStatement(ISSql);
        ps.setString(1, ten);
        ps.setString(2, loai);
        ps.setInt(3, gia);
        ps.setInt(4, soLuong);
        ps.setInt(5, id);
        ps.executeUpdate();
       
    }
      //new
     public int saveCart(Cart tk) throws SQLException{
        
        String ISSql = "INSERT INTO cart"
                + " (id, idp, tendn, ngayorder, ten) VALUES "
                + "(?,?,?,?,?);";
        PreparedStatement ps = conn.prepareStatement(ISSql);
        ps.setString(1, tk.getId());
        ps.setString(2, tk.getIdProduct());
        ps.setString(3, tk.getIdUser());
        ps.setString(4, tk.getCreateDate());
        ps.setString(5, tk.getTen());
        
       
        return ps.executeUpdate();
    }
     public int updateCart(Cart tk) throws SQLException{
        
        String ISSql = "UPDATE cart"
                + " SET id=? "
                + "where idp=?";
        PreparedStatement ps = conn.prepareStatement(ISSql);
        ps.setString(1, tk.getId());
        ps.setString(2, tk.getIdProduct());
        
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
    public String layidCart(String idp) throws SQLException{
        String ISSql = "SELECT TOP 1 id FROM cart where idp=? ORDER BY iDP DESC";
        PreparedStatement ps = conn.prepareStatement(ISSql);
        
        ps.setString(1, idp);
        
        rs = ps.executeQuery();
        String luotMuon = "";
        while(rs.next()){
            luotMuon += rs.getString("id");
        }
        return luotMuon;
    }
    public String layidProCart(String idp) throws SQLException{
        String ISSql = "SELECT TOP 1 idp FROM cart where idp=? ORDER BY iDP DESC";
        PreparedStatement ps = conn.prepareStatement(ISSql);
        ps.setString(1, idp);
        
        rs = ps.executeQuery();
        String idP = "";
        while(rs.next()){
            idP += rs.getString("idp");
        }
        return idP;
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
            String ten=rs.getString("ten");
            Cart p = new Cart(id, idP, idUser, ngay, ten);

            list.add(p);
        }
        
        return list;
    }
    public void deleteCart(String id) throws SQLException{
        String ISSql = "DELETE FROM cart WHERE id=? ";
        PreparedStatement ps = conn.prepareStatement(ISSql);
        ps.setString(1, id);
        ps.executeUpdate();
    }
    public void deleteDN() throws SQLException{
        String ISSql = "DELETE FROM dangnhap";
        PreparedStatement ps = conn.prepareStatement(ISSql);
        
        ps.executeUpdate();
    }
    public int saveProduct(sanPham sp) throws SQLException{
        System.out.println(sp);
        String ISSql = "INSERT INTO sanPham (ten, loai, gia, soLuong) VALUES (?,?,?,?);";
        PreparedStatement ps = conn.prepareStatement(ISSql);
        ps.setString(1, sp.getTen());
        ps.setString(2, sp.getLoai());
        ps.setInt(3, sp.getGia());
        ps.setInt(4, sp.getSoLuong());
        
       
        return ps.executeUpdate();
    }
    
    public String layTenSP(String idSP) throws SQLException {
        String ISSql = "SELECT ten FROM sanPham where id=?";
        PreparedStatement ps = conn.prepareStatement(ISSql);
        ps.setString(1, idSP);
        
        rs = ps.executeQuery();
        String ten = "";
        while(rs.next()){
            ten += rs.getString("ten");
        }
        return ten;
    }
}