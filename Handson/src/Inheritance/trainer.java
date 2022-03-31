package Inheritance;

public class trainer extends person {
	
	int trainerid;
	String type;
	int salary;
	
	trainer(String fname, String lname,int trainerid, String type, int salary){
		super(fname,lname);
		this.trainerid = trainerid;
		this.type = type;
		this.salary = salary;
	}
	
	void displayTrainer() {
		System.out.println(trainerid+""+type+""+salary);
	}
}


