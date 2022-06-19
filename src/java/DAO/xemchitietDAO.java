/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Model.SanPham;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class xemchitietDAO {
    private Connection conn;
    private ResultSet rs;
    public xemchitietDAO() {
        conn = ConnectSql.getConnection();
    }
    public SanPham getproduct(String code) throws SQLException{
        SanPham p= new SanPham();
        String sql="select * from Product2 where id=? ";
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.setString(1, code);
        rs=ps.executeQuery();
        while(rs.next()){
            int id = Integer.parseInt(rs.getString("id"));
            String ten = rs.getString("ten");
            String moTa = rs.getString("moTa");
            String loai = rs.getString("loai");
            String mau=rs.getString("mau");
            int gia=rs.getInt("gia");
            int soLuong=rs.getInt("soLuong");
            int daBan=rs.getInt("daBan");
            
            p.setId(id);
            p.setTen(ten);
            p.setMoTa(moTa);
            p.setLoai(loai);
            p.setMau(mau);
            p.setGia(gia);
            p.setSoLuong(soLuong);
            p.setDaBan(daBan);
            
            
        }
        return p;
    }
    
}
