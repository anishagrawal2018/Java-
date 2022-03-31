package com.redhawks.handsforjava.exceptions;

public class validateUser {
	
	public static void checkUser(String username,String password) throws loginException {
		if (username.equals("admin") && password.equals("admin1")){
			System.out.println("Welcome");
		}else {
			loginException le = new loginException("Invalid Details");
			throw le;
			
		}
			
	}
}
