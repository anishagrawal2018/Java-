package com.redhawks.handsforjava.exceptions;

import java.util.Scanner;

public class loginExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username and Password:");
		String username = sc.next();
		String password = sc.next();

		validatePassword obj = new validatePassword();
		valpasswspchar obj1 = new valpasswspchar();
		try {
			obj.chknmr(password);
			
		} catch (passwordException e1) {
			System.out.println(e1.getMessage());
		}
		try {
			obj1.chkspchar(password);
		} catch (passwordException e1) {
			System.out.println(e1.getLocalizedMessage());
			
		}
		
		try {

			validateUser.checkUser(username, password);
		} catch (loginException e) {

			System.out.println(e.getMessage());
		}

	}

}
