package com.redhawks.handsforjava.exceptions;

import java.util.ArrayList;

public class valpasswspchar {

	static ArrayList<Character> sp;

	valpasswspchar() {
		
		sp = new ArrayList<>();
		sp.add('!');
		sp.add('&');
		sp.add('*');
		sp.add('%');
		sp.add('#');
		sp.add('@');
	}

	public boolean isSpChar(char c) {

		for (int i = 0; i < sp.size(); i++) {
			if (c == sp.get(i))
				;
			return true;
		}

		return false;
		
	}
	




	
	public void chkspchar(String password) throws passwordException {
		int count = 0;
		int siz = password.length();
		for (int j = 0; j < siz; j++) {
			char c = password.charAt(j);
			if (isSpChar(c) == true) {
				count = count + 1;
			}
		}
		if (count > 0) {
			System.out.println("Special Char is there in password");
		} else {
			passwordException pe = new passwordException("Please Enter a sp char in password");
			throw pe;

		}
	}
	}