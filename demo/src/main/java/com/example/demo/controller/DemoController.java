package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/")
	public String welcomePage() {
		return "Hello World";
	}
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "This is my 2nd page";
	}

}
