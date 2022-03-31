package com.example.mycontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.employee;
import com.example.service.employeeService;

@RestController
@RequestMapping("/rest")
public class employeeRestController {
	
	
	@Autowired 
	private employeeService empservice;
	
	@RequestMapping(value="/saveemp",method=RequestMethod.POST)
	public String saveEmployee(@RequestBody employee obj) {
		
		empservice.validateEmployee(obj);
		;
		return "Saved";
	}
	
	
	

}
