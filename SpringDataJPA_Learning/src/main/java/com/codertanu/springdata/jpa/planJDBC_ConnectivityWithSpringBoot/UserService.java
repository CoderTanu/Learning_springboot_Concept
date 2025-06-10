package com.codertanu.springdata.jpa.planJDBC_ConnectivityWithSpringBoot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public void createTable() {
		userRepo.createTable();
	}
	
	public void insertUser(String name, int age) {
		userRepo.insertUser(name, age);
	}
	
	public List<User> getUsers(){
		List<User> listOfUser = userRepo.getUsers();
		for(User user: listOfUser) {
			System.out.println(user.getUserId() + ":" + user.getUserName() + ":" + user.getAge());
		}
		
		return listOfUser;
	}
	
	
}
