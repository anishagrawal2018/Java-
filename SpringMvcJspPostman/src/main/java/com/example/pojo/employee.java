package com.example.pojo;

public class employee {
	
	private int empnum;
	private String empname;
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
