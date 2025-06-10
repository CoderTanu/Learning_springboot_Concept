package com.coderTanu.learn_spring_security.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CSRFAttackController {
	
	@GetMapping("/transfer")
	public String transfer(@RequestParam String amount,@RequestParam String to) {
		
		return "Transferred $" + amount + "to" + to;
		
	}
	@GetMapping("/")
	public String hello(Model model) {
		return "attack";
	}

}
