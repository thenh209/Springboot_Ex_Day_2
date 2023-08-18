package com.Day_2_classwork.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise_1 {
	@Value("${name}")
	private String name;
	
	@GetMapping("ex1")
	public String getName()
	{
		return "Hi "+name+"!";
	}
}

