package practicepackage;

import java.util.ArrayList;
import java.util.Scanner;

public class practiceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int b= 1;
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		//sc.useDelimiter();
		int ba = sc.nextInt();
		System.out.println("Multiplication table of" + ba + "is :");
		for(i=0;i<10;i++) {
			
			
			System.out.println(ba+"x"+b+"="+(ba*b));
			b++;
	}
	}
	
	ArrayList<Object> spd = new ArrayList<Object>();
	//spd.add("anish");
}
