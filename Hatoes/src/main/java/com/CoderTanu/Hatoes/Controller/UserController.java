/**
 * 
 */
package com.CoderTanu.Hatoes.Controller;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CoderTanu.Hatoes.Entity.UserResponse;

/**
 * 
 */
@RestController
@RequestMapping("/api")
public class UserController {
	
	
	
	@GetMapping(path = "/addUser")
	public ResponseEntity<UserResponse> addUser(){
		UserResponse response = new UserResponse("1","tanu","UNVERIFIED");
		
		Link verifyLink = WebMvcLinkBuilder.linkTo(UserController.class)
				.slash("sms-verify-finish")
				.slash(response.getUserId())
				.withRel("verify")
				.withType("POST");
		response.addLink(verifyLink);
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
