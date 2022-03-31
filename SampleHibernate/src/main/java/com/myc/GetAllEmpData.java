package com.myc;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetAllEmpData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Query<Employee> q = s.createQuery("select e from Employee e");
		List<Employee> l = q.list();
		for(Employee e: l) {
			System.out.println(e.getEo()+""+e.getEname()+""+e.getSal());
		}
		s.close();
	}

}
