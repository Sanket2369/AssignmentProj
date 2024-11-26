package com.tka.Mapping;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToMany {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Department.class);
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Department d1 = new Department();
		d1.setDname("Cse");
		d1.setLoc("pune");

		Employee e1 = new Employee();
		e1.setEmpid(134);
		e1.setEname("Sanket");

		Employee e2 = new Employee();
		e2.setEmpid(197);
		e2.setEname("Darshan");

		Employee e3 = new Employee();
		e3.setEmpid(156);
		e3.setEname("Shivam");
		
		session.save(e1);
		session.save(e2);
		session.save(e3);
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		

		d1.setEmpList(empList);
		session.save(d1);

		Transaction tx = session.beginTransaction();
		tx.commit();
		
//		Department d = session.load(Department.class, 1);
//		
//		System.out.println(d.getDeptid()+" "+d.getDname()+" "+d.getEmpList());

        
		System.out.println("Processs Completed");
	}

}
