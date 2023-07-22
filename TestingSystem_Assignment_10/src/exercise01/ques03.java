package exercise01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ques03 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String username = "root";
		String pass = "root";
		String url = "jdbc:mysql://localhost:3306/testingsystem";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		PreparedStatement prS = null;

		try {
			connection = DriverManager.getConnection(url, username, pass);
			statement = connection.createStatement();
			String sql = "insert into possition(id,namee) values (?,?)";
			prS = connection.prepareStatement(sql);
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhap vao ten");
			String name = scanner.nextLine().trim();
			prS.setString(2, name);
			prS.setInt(1, 1011);
			int count = prS.executeUpdate();
			if (count >= 1) {
				System.out.println("Them moi thanh cong possition ten la: " + name);
			} else {
				System.out.println("Them moi that bai");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		connection.close();
		statement.close();
		prS.close();
	}
}
