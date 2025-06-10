//package com.coderTanu.learn_spring_security.Controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.coderTanu.learn_spring_security.Model.UserAuthEntity;
//import com.coderTanu.learn_spring_security.Service.UserAuthEntityServices;
//
//@RestController
//@RequestMapping("/auth")
//public class UserAuthController {
//	
//	
//	@Autowired
//	private UserAuthEntityServices userAuthEntityServices;
//	
//	@Autowired
//	private PasswordEncoder passwordEncoder;
//	
//	@PostMapping("/register")
//	public ResponseEntity<String> register(@RequestBody UserAuthEntity userAuthDetails){
//		//hash before saving in db
//		userAuthDetails.setPassword(passwordEncoder.encode(userAuthDetails.getPassword()));
//		
//		//save
//		userAuthEntityServices.save(userAuthDetails);
//		return ResponseEntity.ok("User registered Successfully");
//	}
//
//}
////