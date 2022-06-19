/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.TaiKhoan;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VAN TAI
 */
public class DangnhapDAO {
    private Connection conn;
    private ResultSet rs;
    public DangnhapDAO() {
        conn = ConnectSql.getConnection();
    }
    
    public TaiKhoan layTK(TaiKhoan s) throws SQLException{
        String sql = "SELECT * FROM TaiKhoan WHERE user_name=? AND password=? ";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getUser_name());
            ps.setString(2, s.getPassword());
            rs = ps.executeQuery();
        } catch(Exception e){
            e.printStackTrace();
        }
        if (rs.next()) {
            s.setId(rs.getString("id"));
            s.setTen(rs.getString("ten"));
            s.setUser_name(rs.getString("user_name"));
            s.setPassword(rs.getString("password"));
            s.setSoDienThoai(rs.getString("soDienThoai"));
            s.setDiaChi(rs.getString("diaChi"));
            s.setLoai(rs.getString("loai"));
        }
        
        return s;
    }
}


