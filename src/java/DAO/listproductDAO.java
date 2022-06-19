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
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class listproductDAO {
    private Connection conn;
    private ResultSet rs;
    public listproductDAO() {
        conn = ConnectSql.getConnection();
    }
     public List<SanPham> getProduct() throws SQLException, ParseException{
        List<SanPham> list = new ArrayList<>();
        
        String selectName = "select * from Product2"; 
        PreparedStatement ps = conn.prepareStatement(selectName);
        rs = ps.executeQuery();
        while(rs.next()){
            SanPham p = new SanPham();
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
}
