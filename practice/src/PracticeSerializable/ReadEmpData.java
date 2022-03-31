package PracticeSerializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadEmpData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Serializable.txt"));
		
		Employee emp = (Employee) ois.readObject();
		System.out.println(emp.getEname());
		ois.close();
		
		
		
	}

}
