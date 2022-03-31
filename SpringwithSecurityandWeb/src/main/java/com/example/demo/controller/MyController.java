package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController				
public class MyController {
	
	@RequestMapping("/msg")
	public String getMsg(){
		return "this is sample rest";
		}

}
