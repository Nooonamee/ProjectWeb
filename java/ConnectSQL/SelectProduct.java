package ConnectSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ConnectSQL.ConnetSQL;

public class SelectProduct {
	public static List<Product> getAllProduct() throws SQLException {
		List<Product> listP = new ArrayList();
		Connection conn = ConnetSQL.getConnection();
		String sql = "select * from Product";
		PreparedStatement prep = conn.prepareStatement(sql);
		ResultSet rs = prep.executeQuery();
		while (rs.next()) {
			String name = rs.getString("name");
			String description = rs.getString("description");
			String type = rs.getString("type");
			String color = rs.getString("color");
			int price = rs.getInt("price");
			int sold = rs.getInt("sold");
			int quantity = rs.getInt("quantity");
			listP.add(new Product(name,description, type, color, price, quantity, sold));
		}
		return listP;
	}
	
	public static void main(String[] args) throws SQLException {
		for (Product p : getAllProduct()) {
			System.out.println(p);
		}
		
	}
}
