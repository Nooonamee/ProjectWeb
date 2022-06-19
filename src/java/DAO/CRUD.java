/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Product;
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
    public CRUD() throws SQLServerException, SQLException, ClassNotFoundException{
        conn = ConnectSql.getConnection();
    }
     public void delete(String code) throws SQLException{
        String ISSql = "delete from Product2 where id=? ";
       
       PreparedStatement ps = conn.prepareStatement(ISSql);
       ps.setString(1, code);
       
       ps.executeUpdate();
       
    }
     public List<Product> getProduct() throws SQLException, ParseException{
        List<Product> list = new ArrayList<>();
        
        String selectName = "SELECT * FROM Product2"; 
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
        String ISSql = "UPDATE Product2 SET id=?, ten=?, loaisp=? ,namsx=? ,slcon= ? WHERE id=?";
                
        PreparedStatement ps = conn.prepareStatement(ISSql);
        ps.setString(1, id);
        ps.setString(2, ten);
        ps.setString(3, loaisp);
        ps.setString(4, namsx);
        ps.setString(5, slcon);
        ps.setString(6, code1);
        ps.executeUpdate();
       
    }
}
