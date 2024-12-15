package com.coderTanu.learn_spring_security.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1")
public class HelloController {

	
	@GetMapping("hello")
	public String getHello() {
		return "hello";
	}
	
	
}
