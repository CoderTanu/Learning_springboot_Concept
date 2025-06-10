package com.codertanu.springdata.jpa.planJDBC_Connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	
	public Connection getConnection() {
		try {
		  //H2 Driver loading
			Class.forName("org.h2.Driver");
			
			//ESTBLISH Connection with DB
			return DriverManager.getConnection("jdbc:h2:mem:userDB", "sa", "demo");
		
		}catch(ClassNotFoundException | SQLException e) {
			//handle exception
		}
		return null;
	}

}
