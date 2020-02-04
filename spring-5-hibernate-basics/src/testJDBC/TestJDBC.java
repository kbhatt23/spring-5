package testJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class TestJDBC {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user = "kbhatt23";
		String password = "Suarez@23";
		
		try {
			System.out.println("Testing connection "+url);
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connection succesful");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
