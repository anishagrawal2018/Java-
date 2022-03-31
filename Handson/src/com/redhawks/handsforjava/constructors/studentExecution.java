package com.redhawks.handsforjava.constructors;

public class studentExecution {

	public static void main(String[] args) {
		
		student s1 = new student(1,"ani",9,9,9);
		student s2 = new student(2,"anish",8,8,8);
		student s3 = new student(3,"anish1",7,7,7);
		
		s1.displayStdDetails();
		s1.disStdPer();
		s2.displayStdDetails();
		s2.disStdPer();
		s3.displayStdDetails();
		s3.disStdPer();
	}

}
