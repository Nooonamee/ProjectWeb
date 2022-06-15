    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Taikhoan;
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
    public DangkiDAO() throws SQLServerException, SQLException{
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=DBWeb;"
                    + "username=sa;password=12");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DangkiDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    public int dangki(Taikhoan tk) throws SQLException{
        
        String ISSql = "INSERT INTO TaiKhoan"
                + " (hoten, tendn, email, matkhau, nlmk) VALUES "
                + "(?,?,?,?,?);";
        PreparedStatement ps = conn.prepareStatement(ISSql);
        ps.setString(1, tk.getHoten());
        ps.setString(2, tk.getTendn());
        ps.setString(3, tk.getEmail());
        ps.setString(4, tk.getMk());
        ps.setString(5, tk.getNlmk());
       
        return ps.executeUpdate();
    }
    
    public static void main(String[] args) throws SQLException {
        DangkiDAO p= new DangkiDAO();
    }
}
