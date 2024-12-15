package com.codertanu.springdata.jpa.planJDBC_Connectivity;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDao {
	
	public void createUserTable() {
		try {
			Connection connection = new DatabaseConnection().getConnection();
			Statement statement = connection.createStatement();
			String sql = "CREATE TABLE users(user_id INT AUTO_INCREMENT PRIMARY KEY, user_name VARCHAR(100), age INT)";
			statement.execute(sql);
			
		}catch(SQLException e) {
			
		}finally {
			
		}
	}
	
	
	public void createUser(String userName, int age) {
		try {
			Connection connection = new DatabaseConnection().getConnection();
			String sql = "Insert into users(userName, age)values(?,?)";
			PreparedStatement preStatement = connection.prepareStatement(sql);
			preStatement.setString(1, userName);
			preStatement.setInt(2, age);
			preStatement.executeUpdate();
			
		}catch(SQLException e) {
			
		}finally {
			
		}
	}
	
	public void readUsers() {
		try {
			Connection connection = new DatabaseConnection().getConnection();
			String sql = "select * from users";
			PreparedStatement preStatement = connection.prepareStatement(sql);
			ResultSet set = preStatement.executeQuery();
			
			while(set.next()) {
				String userDetails =  set.getInt("user_id") 
						+ ":" + set.getString("user_name") +
						":" + set.getInt("age");
				System.out.println(userDetails);
			}
			
		}catch(SQLException e) {
			
		}finally {
			
		}
	}

}
