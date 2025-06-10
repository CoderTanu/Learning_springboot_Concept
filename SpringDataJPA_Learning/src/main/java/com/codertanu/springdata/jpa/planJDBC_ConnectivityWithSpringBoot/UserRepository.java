package com.codertanu.springdata.jpa.planJDBC_ConnectivityWithSpringBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void createTable() {
		jdbcTemplate.execute("create table users(user_id INT AUTO_INCREMENT PRIMARY KEY, user_name varchar(100), age INT)");
	}
	
	
	public void insertUser(String name, int age) {
		String insertQuer = "Insert into users(user_name, age) values(?,?)";
		jdbcTemplate.update(insertQuer, name, age);
	}
	
	public List<User> getUsers(){
		String selectQuery  = "Select * from users";
		return jdbcTemplate.query(selectQuery, (rs, rowNum)->{
			User user = new User();
			user.setUserId(rs.getInt("user_id"));
			user.setUserName(rs.getString("user_name"));
			user.setAge(rs.getInt("age"));
			return user;
				
		});
	}
	
	

}
