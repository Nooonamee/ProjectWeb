/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.sanPham;
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

/**
 *
 * @author VAN TAI
 */
public class CRUD {
    private Connection conn;
    private ResultSet rs;
    public CRUD() {
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
      public void update(int id, String ten, String moTa,String loai,String mau ,int gia, int soLuong, int daBan) throws SQLException{
        String ISSql = "UPDATE Product SET id=?, ten=?, moTa=? ,loai=? ,mau= ?,gia= ?,soLuong= ?,mau= ? WHERE id=?";
                
        PreparedStatement ps = conn.prepareStatement(ISSql);
        ps.setInt(1, id);
        ps.setString(2, ten);
        ps.setString(3, moTa);
        ps.setString(4, loai);
        ps.setString(5, mau);
        ps.setInt(6, gia);
        ps.setInt(7, soLuong);
        ps.setInt(8, daBan);
        ps.executeUpdate();
       
    }
}