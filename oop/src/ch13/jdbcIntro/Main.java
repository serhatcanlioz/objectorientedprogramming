package ch13.jdbcIntro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DbHelper helper=new DbHelper();
		Connection connection=null;
		PreparedStatement statement=null;
		ResultSet resultSet=null;
		
		try {
			connection=helper.getConnection();
			
			String sql= "update city set population=100000, district='Turk'  where id = ? ";
			statement=connection.prepareStatement(sql);
			statement.setInt(1, 4082);
			
			int result=statement.executeUpdate();
			
			if(result==1) {
				System.out.println("kayıt güncellendi.");
			}
			
			
		} catch (SQLException e) {
			helper.showErrorMessage(e);
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void insertDemo() {
		DbHelper helper=new DbHelper();
		Connection connection=null;
		PreparedStatement statement=null;
		ResultSet resultSet=null;
		
		try {
			connection=helper.getConnection();
			
			String sql= "insert city (Name,CountryCode,District,Population) values (?,?,?,?)";
			statement=connection.prepareStatement(sql);
			statement.setString(1, "Erzurum");
			statement.setString(2, "TUR");
			statement.setString(3, "Turkey");
			statement.setInt(4, 700000);
			
			int result=statement.executeUpdate();
			
			if(result==1) {
				System.out.println("kayıt eklendi.");
			}
			
			
		} catch (SQLException e) {
			helper.showErrorMessage(e);
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void selectDemo() {
		DbHelper helper=new DbHelper();
		Connection connection=null;
		Statement statement=null;
		ResultSet resultSet=null;
		try {
			
			connection=helper.getConnection();
			statement=connection.createStatement();
			
			resultSet= statement.executeQuery("select code,name,continent,region from country ");
			
			ArrayList<Country> countries=new ArrayList<Country>();
			
			while(resultSet.next()) {
				countries.add(
						new Country(resultSet.getString("code"),
									resultSet.getString("name"),
									resultSet.getString("continent"),
									resultSet.getString("region")
									));
			}
			
			for(Country temp:countries) {
				System.out.println(temp.getCode() + " - "+ temp.getName());
			}
			
			System.out.println(countries.size());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			helper.showErrorMessage(e);
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
