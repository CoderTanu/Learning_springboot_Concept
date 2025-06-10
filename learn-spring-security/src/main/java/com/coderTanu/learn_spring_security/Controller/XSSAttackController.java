package com.coderTanu.learn_spring_security.Controller;



import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class XSSAttackController {

	private final List<String> comments = new ArrayList<>();
	
	@GetMapping("/xss")
	public String showComments(Model model) {
		model.addAttribute("comments", comments);
		return "xss";
	}
	
	@PostMapping("/comment")
	public String addComments(@RequestParam String comment) {
		comments.add(comment);
		return "redirect:/xss";
	}
}
