package com.redhawks.handsforjava.exceptions;

import java.util.ArrayList;

public class validatePassword {

	static ArrayList<Character> checkNumber;
	
	//static ArrayList<Character> specialChars;
	
	ArrayList<String> xy = new ArrayList<>();
	xy.add("!");
	
	
	

	validatePassword() {
		checkNumber = new ArrayList<>();

		checkNumber.add('0');
		checkNumber.add('1');
		checkNumber.add('2');
		checkNumber.add('3');
		checkNumber.add('4');
		checkNumber.add('5');
		checkNumber.add('6');
		checkNumber.add('7');
		checkNumber.add('8');
		checkNumber.add('9');

	}
		
		//int[] a = {1,2,3};
	public boolean isNumber(char c) {
		int si = checkNumber.size();
		for (int i = 0; i < checkNumber.size(); i++) {
			if (c == checkNumber.get(i)) {
				return true;
			}
		}
		return false;

	}

	public void chknmr(String password) throws passwordException {
		int count = 0;
		int siz = password.length();
		for (int j = 0; j < siz; j++) {
			char c = password.charAt(j);
			if (isNumber(c) == true) {
				count = count + 1;
			}
		}
		if (count > 0) {
			System.out.println("Number in password");
		} else {
			passwordException pe = new passwordException("Please Enter a digit in password");
			throw pe;

		}
	}

}

