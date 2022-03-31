package com.myc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetEmpData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg =new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Employee emp = s.get(Employee.class, 2);
		System.out.println(emp.getEo()+""+emp.getEname()+""+emp.getSal());
	}

}
