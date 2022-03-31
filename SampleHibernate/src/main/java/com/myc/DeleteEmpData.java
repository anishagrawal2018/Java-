package com.myc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteEmpData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Employee emp = new Employee();
		emp.setEname("a");
		emp.setEo(1);
		emp.setSal(1000);
		
		s.delete(emp);
		s.beginTransaction().commit();
		System.out.println("Deleted");
		
		
	}

}
