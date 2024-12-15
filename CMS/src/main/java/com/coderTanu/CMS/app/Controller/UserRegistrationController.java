package com.coderTanu.CMS.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coderTanu.CMS.app.Entity.UserRegistration;
import com.coderTanu.CMS.app.Service.UserRegistrationServices;

@Controller
@RequestMapping("/user/v1")
public class UserRegistrationController {
	
	@Autowired 
	private UserRegistrationServices userRegistrationServices;
	
	
	@PostMapping("/register")
	public String registerUser(UserRegistration userRegistration) {
		userRegistrationServices.saveRegisterUserDetails(userRegistration);
		return "";
	}
	
	
	
	

}
