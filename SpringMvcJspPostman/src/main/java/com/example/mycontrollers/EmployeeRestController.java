package com.example.mycontrollers;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.employee;

@RestController
@RequestMapping("/rest")
public class EmployeeRestController {
	
	Map<String, employee> map = new HashMap<String, employee>();
	
	public EmployeeRestController() {
		map.put("1", new employee(1, "one", 100));
		map.put("2", new employee(2, "two", 200));
		map.put("3", new employee(3, "three", 300));
	}
	
	@RequestMapping("/emp")
	public employee getEmployee() {
		return new employee(100, "abc", 400);
	}
	@RequestMapping("/emp/{empnum}")
	public employee getIndEmp(@PathVariable String empnum) {
		return map.get(empnum);
	}
	
	@RequestMapping("/allemp")
	public Collection<employee> getAllEmp(){
		return map.values();
	}
	
	
}
