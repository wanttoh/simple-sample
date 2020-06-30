package com.example.demo1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {
	
	@RequestMapping("/hello")
	public String hello(){
		return"Hello world!";
	}
}
