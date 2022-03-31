package com.redhawks.handsforjava.abstractclasses;

public abstract class Employee {
	
	int empno;
	String ename;
	
	abstract void jobs();
	
	abstract void timings();
	
	void noticePeriod() {
		System.out.println("Notice Period is 2 Months");
	}
	
	
	

}
