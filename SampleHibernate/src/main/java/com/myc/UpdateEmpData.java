package com.myc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateEmpData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Employee emp = new Employee();
		emp.setEo(1);
		emp.setEname("a");
		emp.setSal(1);
		
		s.update(emp);
		s.beginTransaction().commit();
		System.out.println("Updated");

	}

}
