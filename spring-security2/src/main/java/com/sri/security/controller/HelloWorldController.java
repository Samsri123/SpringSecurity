package com.sri.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	@RequestMapping("/")
	public String helloWorld() {
		return "hello-world";
	}

	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		return "Hello... DOOD";
	}

	@ResponseBody
	@RequestMapping("/bye")
	public String bye() {
		return "byee... DOOD";
	}
}
