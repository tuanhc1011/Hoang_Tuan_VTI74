package exercise01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class qué04 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String user = "root";
		String pass = "root";
		String url = "jdbc:mysql://localhost:3306/testingsystem";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = null;
		Statement statement = null;
		PreparedStatement prS = null;
		try {
			connection = DriverManager.getConnection(url, user, pass);
			statement = connection.createStatement();
			String changeDEV = "update possition set namee = ? where (id = 5)";
			prS = connection.prepareStatement(changeDEV);
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhập Dev để đổi tên position có id = 5");
			String namee = scanner.nextLine().trim();
			prS.setString(1, "DEV");
			int a = prS.executeUpdate();
			if (a >= 1) {
				System.out.println("Doi ten thanh cong");
			} else {
				System.out.println("Doi ten that bai vi k co pos nao id  = 5");
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
