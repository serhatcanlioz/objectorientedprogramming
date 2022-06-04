package ch13.jdbcIntro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
	private String username="testuser";
	private String password="123456";
	private String dbUrl="jdbc:mysql://localhost:3306/world?useSSL=false&useUnicode=true";
	
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(dbUrl,username,password);
	}
	
	public void showErrorMessage(SQLException exception) {
		System.out.println("Error:"+ exception.getErrorCode());
		System.out.println("Error Message:"+ exception.getMessage());
	}
}
