package com.redhawks.handsforjava.constructors;

public class student {

		int stdno;
		String stdname;
		int m1;
		int m2;
		int m3;
	
	student(int stdno,String stdname,int m1,int m2,int m3){
		this.stdno = stdno;
		this.stdname = stdname;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	
	void displayStdDetails(){
		System.out.println(stdno+stdname);
	}
	void disStdPer(){
		System.out.println(m1+""+m2+""+m3);
	}
	static void displayOfficeAdd() {
		System.out.println("Miami");
	}
}
