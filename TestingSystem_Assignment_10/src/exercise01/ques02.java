package exercise01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ques02 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String username = "root";
		String pass = "root";
		String url = "jdbc:mysql://localhost:3306/testingsystem";
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = DriverManager.getConnection(url, username, pass);
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from possition");
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("namee");
				System.out.println("id la: " + id + "----Ten la: " + name);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		connection.close();
		statement.close();
		resultSet.close();
	}
}
// chạy ra lỗi vì trong testingsystem k có bảng possition, do đó e đã tự tạo thêm 1 bảng possition trong SQL