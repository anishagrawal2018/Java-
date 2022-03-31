package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class MyControllers {
	
	@RequestMapping("/anish")
	public String getHello() {
		return "hellooooooooo";
	}
	
	@RequestMapping("/ani")
	public String getBalance(ModelMap m) {
		m.put("anis", "Hello");
		return "hello";
	}

	}


