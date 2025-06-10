package com.coderTanu.learn_spring_security.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderTanu.learn_spring_security.Entity.UserRegisterEntity;
import com.coderTanu.learn_spring_security.Service.UserRegisterEntityService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserRegisterEntityService userRegisterEntityService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	
	@PostMapping("/user-register")
	public ResponseEntity<String> register(@RequestBody UserRegisterEntity userRegisterDeatils){
		System.out.println("Incoming registration request: " + userRegisterDeatils.getUsername());
		userRegisterDeatils.setPassword(passwordEncoder.encode(userRegisterDeatils.getPassword()));
		userRegisterEntityService.save(userRegisterDeatils);
		return ResponseEntity.ok("User registered successfully!");
	}
	
	@GetMapping("/users")
	public String getUserDetails() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return "Fetched user details successfully";
	}

}
