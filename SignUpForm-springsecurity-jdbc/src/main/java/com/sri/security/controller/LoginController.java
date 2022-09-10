package com.sri.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sri.security.dto.SignupDTO;
import com.sri.security.service.SignupService;

@Controller
public class LoginController {
	
	@Autowired
	private SignupService signupService;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/signup")
	public String signUp(@ModelAttribute("signup") SignupDTO signupDTO) {
		return "signup";
	}

	@PostMapping("/process-signup")
	public String responsePage(SignupDTO signupDTO) {
		String password= passwordEncoder.encode(signupDTO.getPassword());
		signupDTO.setPassword(password);
		System.out.println("encoded password "+password);
		signupService.insertUser(signupDTO);
		return "redirect:/login";
	}
	
	
}
