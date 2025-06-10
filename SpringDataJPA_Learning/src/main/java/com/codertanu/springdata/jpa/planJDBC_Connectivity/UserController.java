package com.codertanu.springdata.jpa.planJDBC_Connectivity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping(path = "/get-user-plain-jdbc")
	public String getUser() {
		UserDao userDao = new UserDao();
		userDao.createUserTable();
		userDao.createUser("tanu", 24);
		userDao.createUser("x", 23);
		userDao.readUsers();
		return "SUCCESS";
	}
}
