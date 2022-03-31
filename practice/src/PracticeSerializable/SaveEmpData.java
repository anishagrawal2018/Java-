package PracticeSerializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveEmpData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Employee emp1 = new Employee(1,"ani",100);
		
		 /*emp.setEmpno(1);;
		 emp.setEname("anish");
		 emp.setSal(100);*/
		 
		 try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Serializable.txt"));
			oos.writeObject(emp);
			oos.close();
		 } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 System.out.println("done");
	}

}
