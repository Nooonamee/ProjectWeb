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
    private ResultSet rs;
    public searchDAO() throws SQLServerException, SQLException, ClassNotFoundException{
        conn = ConnectSql.getConnection();  
    }
    public List<Product> search(String name) {
        try {
            List<Product> list=new ArrayList<>();
            String sql="select * from Product2 where ten like ? or loaisp like ? or namsx like ? or id like ? ";
           
            PreparedStatement ps= conn.prepareStatement(sql);
            ps.setString(1,"%"+name+"%");
            ps.setString(2,"%"+name+"%");
            ps.setString(3,"%"+name+"%");
            ps.setString(4,"%"+name+"%");
           
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                Product p=new Product(rs.getString(1), rs.getString(2),rs.getString(3), rs.getString(4),rs.getInt(5));
                list.add(p);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
}
