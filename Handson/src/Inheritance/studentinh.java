package Inheritance;

public class studentinh extends person {
	
	int stdnum;
	String stdaddress;
	
	studentinh(String fname,String lname,int stdnum, String stdaddress){
		super(fname,lname);
		this.stdnum = stdnum;
		this.stdaddress = stdaddress;
	}
	

	
	void displaystd() {
		System.out.println(fname+""+lname+""+stdnum+""+stdaddress);
	}
	
}
