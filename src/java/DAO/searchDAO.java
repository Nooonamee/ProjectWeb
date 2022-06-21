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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VAN TAI
 */
public class searchDAO {
    private Connection conn;
    public searchDAO() {
        conn = ConnectSql.getConnection();  
    }
    public List<sanPham> search(String name) {
        try {
            List<sanPham> list=new ArrayList<>();
            String sql="select * from sanPham where ten like ? or loai like ? or id like ? ";
           
            PreparedStatement ps= conn.prepareStatement(sql);
            ps.setString(1,"%"+name+"%");
            ps.setString(2,"%"+name+"%");
            ps.setString(3,"%"+name+"%");
           
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                int id = Integer.parseInt(rs.getString("id"));
                String ten = rs.getString("ten");
                String moTa = rs.getString("moTa");
                String loai = rs.getString("loai");
                String mau=rs.getString("mau");
                int gia=rs.getInt("gia");
                int soLuong=rs.getInt("soLuong");
                int daBan=rs.getInt("daBan");
                
                sanPham p=new sanPham(id,ten,moTa,loai,mau,gia,soLuong,daBan);
                list.add(p);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
}
