package com.codertanu.springdata.jpa.planJDBC_Connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	
	public Connection getConnection() {
		try {
		  //H2 Driver loading
			Class.forName("org.h2.Driver");
			return DriverManager.getConnection("jdbc:h2:mem:userDB", "sa", "demo");
		
		}catch(ClassNotFoundException | SQLException e) {
			
		}
		return null;
	}

}
