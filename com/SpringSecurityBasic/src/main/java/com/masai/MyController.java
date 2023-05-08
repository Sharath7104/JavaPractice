package com.masai;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	
	@GetMapping("/hello")
	public String hello() {
		return "Welcome to spring security";
	}
	
	
	@GetMapping("/hello1")
	public String hello1() {
		return "Welcome to spring security with security";
	}
	
	@GetMapping("/hello2")
	public String hello2() {
		return "Deny method";
	}
}
