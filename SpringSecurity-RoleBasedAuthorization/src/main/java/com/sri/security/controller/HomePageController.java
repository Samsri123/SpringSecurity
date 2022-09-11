package com.sri.security.controller;

import java.security.Principal;
import java.util.Collection;
import java.util.Spliterator;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {
	@RequestMapping("/")
	public String homePage(Principal principal,Authentication auth,Model model) {
		String username = principal.getName();
		System.out.println("The user Name : "+username);
		Collection<? extends GrantedAuthority> authorities = auth.getAuthorities();
		
		Spliterator<? extends GrantedAuthority> spl = authorities.spliterator();
		spl.forEachRemaining((k)->{
			System.out.println(k);
		});
		Object credentials = auth.getCredentials();
		System.out.println(credentials);
		model.addAttribute("username", username);
		model.addAttribute("roles", authorities);
		
		return "home-page";
	}

	@RequestMapping("/trainer")
	public String trainer() {
		return "trainer-dashboard";
	}
	
	@RequestMapping("/coder")
	public String coder() {
		return "coder-dashboard";
	}
	
	@RequestMapping("/access-denied")
	public String accessDenied() {
		
		return "access-denied";
	}
}
