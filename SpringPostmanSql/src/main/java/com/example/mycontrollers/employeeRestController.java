package com.example.mycontrollers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.employee;

@RestController
public class employeeRestController {
	
	@RequestMapping(value="/saveemp",method=RequestMethod.POST)
	public String saveEmployee(@RequestBody employee obj) {
		map.put(obj.getEmpnum()+"",obj);
		return "Saved";
	}
	
	
	

}
