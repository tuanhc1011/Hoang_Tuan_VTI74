package exercise01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ques05 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String a = "root";
		String b = "root";
		String c = "jdbc:mysql://localhost:3306/testingsystem";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = null;
		Statement statement = null;
		PreparedStatement prS = null;
		try {
			connection = DriverManager.getConnection(c, a, b);
			statement = connection.createStatement();
			String abc = "delete from possition where (id = ?)";
			prS = connection.prepareStatement(abc);
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhap vao id phong ban muon xoa");
			int i = scanner.nextInt();
			prS.setInt(1, i);
			int a1 = prS.executeUpdate();
			if (a1 >= 1) {
				System.out.println("Xoa thanh cong");
			} else {
				System.out.println("Xoa that bai");
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
