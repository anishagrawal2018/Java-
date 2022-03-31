package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pojo.employee;

@Repository
public interface employeeRepo extends JpaRepository<employee, Integer>{

	


}