package com.CoderTanu.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CoderTanu.Service.UserService;

@RestController
@RequestMapping
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping(path = "/users")
	public String getUser(@PathVariable Long id) {
		
		return "jhg";
		//return userService.getUserById(id);
	}
	

}
