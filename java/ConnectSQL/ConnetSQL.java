package ConnectSQL;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnetSQL{
    public static Connection getConnection() throws SQLException {
        String dbURL = "jdbc:sqlserver://localhost;databaseName=DBWeb;user=sa;password=12";
        Connection conn = DriverManager.getConnection(dbURL);
        return conn;
    }
    
    public static void main(String[] args) throws SQLException {
        if (getConnection() != null) {
            System.out.println("Connected!");
        }
    }
}
