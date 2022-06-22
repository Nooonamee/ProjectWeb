/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Cart;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class dondamuaDAO {
    private final Connection conn;
    private ResultSet rs;
    public dondamuaDAO() {
        conn = ConnectSql.getConnection();
    }
    
    public int laygiasp(String id) throws SQLException {
        String selectName = "select gia from sanPham where id=?"; 
        PreparedStatement ps = conn.prepareStatement(selectName);
        System.out.println("lay gia .............................");
        ps.setString(1, id);
        ResultSet s;
        s = ps.executeQuery();
        int gia = 0;
        if (s.next()) {
            gia = s.getInt("gia");
        }
        else System.out.println("khong co gi het ...........");
        return gia;
    }
    
    public List<Cart> laySPDaMuaUser(String tendn) throws SQLException {
        String sql = "select * from damua where tendn=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, tendn);
        List<Cart> list = new ArrayList<>();
        
        rs = ps.executeQuery();
        while(rs.next()){
            
            String id = rs.getString("soluong");
            String idP = rs.getString("idp");
            String idUser = rs.getString("tendn");
            String ngay=rs.getString("ngaymua");
            String ten=rs.getString("ten");
            Cart p = new Cart(id, idP, idUser, ngay, ten, laygiasp(idP));
            
            list.add(p);
        }
        
        return list;
    }
    
    public List<Cart> laySPDaMuaAdmin() throws SQLException {
        String sql = "select * from damua";
        PreparedStatement ps = conn.prepareStatement(sql);
        List<Cart> list = new ArrayList<>();
        
        rs = ps.executeQuery();
        while(rs.next()){
            
            String id = rs.getString("soluong");
            String idP = rs.getString("idp");
            String idUser = rs.getString("tendn");
            String ngay=rs.getString("ngaymua");
            String ten=rs.getString("ten");
            Cart p = new Cart(id, idP, idUser, ngay, ten, laygiasp(idP));
            
            list.add(p);
        }
        
        return list;
    }

}
