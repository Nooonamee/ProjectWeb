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

    public List<SanPham> getProduct() throws SQLException, ParseException {
        List<SanPham> list = new ArrayList<>();

        String selectName = "select * from Product2";
        PreparedStatement ps = conn.prepareStatement(selectName);
        rs = ps.executeQuery();
        while (rs.next()) {
            int id = Integer.parseInt(rs.getString("id"));
            String ten = rs.getString("ten");
            String moTa = rs.getString("moTa");
            String loai = rs.getString("loai");
            String mau = rs.getString("mau");
            int gia = rs.getInt("gia");
            int soLuong = rs.getInt("soLuong");
            int daBan = rs.getInt("daBan");

            SanPham p = new SanPham(id, ten, moTa, loai, mau, gia, soLuong, daBan);

            list.add(p);
        }

        return list;
    }
}
