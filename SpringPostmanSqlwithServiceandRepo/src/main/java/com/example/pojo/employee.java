package com.example.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class employee {
	
	@Id
	@Column(name="empno")
	private int empnum;
	
	@Column(name="ename")
	private String empname;
	
	@Column
	private int sal;
	
	
	public employee() {
		
	}
	
	public employee(int empnum, String empname, int sal) {
		super();
		this.empnum = empnum;
		this.empname = empname;
		this.sal = sal;
	}
	public int getEmpnum() {
		return empnum;
	}
	public void setEmpnum(int empnum) {
		this.empnum = empnum;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	
	
	

}
