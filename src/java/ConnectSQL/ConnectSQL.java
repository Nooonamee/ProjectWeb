/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectSQL;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class ConnectSQL {

    /**
     * @param args the command line arguments
     */
    public static Connection getConnection() throws SQLException {
        String dbURL = "jdbc:sqlserver://localhost;databaseName=ManageSuperMarket;user=sa;password=12";
        Connection conn = DriverManager.getConnection(dbURL);
        return conn;
    }
    
    public static void main(String[] args) throws SQLException {
        if (getConnection() != null) {
            System.out.println("Connected!");
        }
    }
    
}
