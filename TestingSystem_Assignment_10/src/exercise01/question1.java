package exercise01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class question1 {
	public static void main(String[] args) throws ClassNotFoundException {
		String username = "root";
		String pass = "root";
		String urlconnect = "jdbc:mysql://localhost:3306/testingsystem";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(urlconnect, username, pass);
			System.out.println("Connect success!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
