package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pojo.employee;
import com.example.repo.employeeRepo;

@Service
public class employeeService {
	
	
	@Autowired
	private employeeRepo repo;
	
	
	

	




	public void validateEmployee(employee obj) {
		// TODO Auto-generated method stub
	repo.save(obj);	
	}








	
}
