package com.codertanu.springdata.jpa.planJDBC_ConnectivityWithSpringBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

	@Autowired
	private UserService UserService;
	
	@GetMapping("/create-user")
	public void createTable() {
		UserService.createTable();
	}
	
	@PostMapping("/insert-user-details")
	public void insertUser(String name, int age) {
		UserService.insertUser(name, age);
	}
	
	@GetMapping("/get-uers-details")
	public List<User> getUsers(){
		List<User> listOfUser = UserService.getUsers();
		for(User user: listOfUser) {
			System.out.println(user.getUserId() + ":" + user.getUserName() + ":" + user.getAge());
		}
		
		return listOfUser;
	}
	
	
}
