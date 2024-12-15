package com.codertanu.springdata.jpa.planJDBC_Connectivity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.codertanu.springdata.jpa.planJDBC_Connectivity.UserDao;

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
