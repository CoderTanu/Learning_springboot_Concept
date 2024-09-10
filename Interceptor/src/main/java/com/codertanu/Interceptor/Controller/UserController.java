/**
 * 
 */
package com.codertanu.Interceptor.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codertanu.Interceptor.Entity.User;

/**
 * 
 */
@RestController
@RequestMapping(value ="/api")
public class UserController {
	
	@Autowired
	User user;

	@GetMapping(path ="/getUser")
	public String getUser() {
		user.getUser();
		return "Success";
	}
}
