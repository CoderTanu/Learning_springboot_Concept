//package com.coderTanu.learn_spring_security.Controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.coderTanu.learn_spring_security.Service.UserDetailsService;
//
//@RestController
//public class SQLInjectionController {
//	
//	//http://localhost:8081/find?name=%27OR%20%271%27%20=%20%271
//	
//	@Autowired
//	private UserDetailsService userDetailsService;
//	
//	@GetMapping("/find")
//	public List<UserDetails> findUser(@RequestParam String name){
//		return userDetailsService.findByName(name);
//	}
//
//}
