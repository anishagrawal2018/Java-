package com.myc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SaveEmpData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		
		Employee emp =new Employee();
		emp.setEo(3);
		emp.setEname("anish3");
		emp.setSal(10003);
		
		ses.save(emp);
		ses.beginTransaction().commit();
		System.out.println("Saved");
	}

}
