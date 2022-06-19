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
            
            
        }
        return p;
    }
    
}
