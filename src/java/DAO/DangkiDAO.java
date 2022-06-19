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


public class DangkiDAO {
    private Connection conn;
    private ResultSet rs;
    public DangkiDAO() {
        conn = ConnectSql.getConnection();
    }
    public int dangki(TaiKhoan tk) throws SQLException{
        
        String ISSql = "INSERT INTO taiKhoan"
                + " (ten, user_name, password, soDienThoai, diaChi, loai) VALUES "
                + "(?,?,?,?,?,?);";
        PreparedStatement ps = conn.prepareStatement(ISSql);
        ps.setString(1, tk.getTen());
        ps.setString(2, tk.getUser_name());
        ps.setString(3, tk.getPassword());
        ps.setString(4, tk.getSoDienThoai());
        ps.setString(5, tk.getDiaChi());
        ps.setString(6, "khach");
       
        return ps.executeUpdate();
    }
    
    public static void main(String[] args) throws SQLException, SQLServerException, ClassNotFoundException {
        DangkiDAO p= new DangkiDAO();
    }
}
