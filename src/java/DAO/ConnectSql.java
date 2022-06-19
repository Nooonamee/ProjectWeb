/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectSql {
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        String dbURL = "jdbc:sqlserver://localhost;databaseName=dienthoai;user=sa;password=123456";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection conn = DriverManager.getConnection(dbURL);
        return conn;
    }
}
