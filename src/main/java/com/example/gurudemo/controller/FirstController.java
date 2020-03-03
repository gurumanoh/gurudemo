package com.example.gurudemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@GetMapping("welcome")
	public String welcomeGreeting(@RequestParam("name") String name){

		return "Welcome to world2"+name+"!!";


	}
}
