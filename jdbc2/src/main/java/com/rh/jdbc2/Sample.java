package com.rh.jdbc2;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.Arrays;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> anish = new ArrayList<Integer>();
		anish.add(100);
		anish.add(105);
		anish.add(101);
		anish.add(102);
		anish.add(102);
		anish.add(100);
		System.out.println(anish);

		ArrayList<Integer> result = new ArrayList<Integer>();
		int siz = 0;
		for (int i = 0; i < anish.size(); i++) {
			boolean flag = false;
			for (int j = 0; j < siz; j++) {
				if (anish.get(i) == result.get(j)) {
					flag = true;
				}

			}

			if (flag == false) {
				result.add(anish.get(i));
				siz++;
			}

		}
		System.out.println(result);
		int sum=0;
		for (int a = 0;a<anish.size();a++){
			sum = sum+anish.get(a);
			

	}
	
	System.out.println(sum);
	}
}
