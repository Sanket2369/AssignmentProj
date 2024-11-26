package com.tka.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.tka.entity.Employee;

public class employeetestmain {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernet.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		@SuppressWarnings("deprecation")
		Criteria c = session.createCriteria(Employee.class);

		// Get a record having salary between 30000 to 70000
		// c.add(Restrictions.between("salary",30000,70000));

		// get a record whose employeename stat with s
		// c.add(Restrictions.like("empname", "s%"));

		// Add restriction to fetch employees whose dept is 20, 30, or 40
		// c.add(Restrictions.in("deptno", new Integer[] { 20, 30, 40 }));

		// To get a record whose salary is empty
		c.add(Restrictions.isNull("salary"));

		// To get a record having deptno=30 and salary is greter than 45000
		// c.add(Restrictions.eq("deptno", 30));
		// c.add(Restrictions.gt("salary", 45000));

		// for run both query simultaniouslly i wann a used conjuction
        //c.add(Restrictions.conjunction()
        //		 .add(Restrictions.eq("deptno", 30))
        //	  .add(Restrictions.gt("salary", 45000)));

//		//TO get record having salary is not equal 500000
//		c.add(Restrictions.ne("salary", 50000));
		List<Employee> elist = c.list();
		for (Employee e : elist) {
			System.out.println(e.getEmpid() + " " + e.getEmpname() + " " + e.getSalary());
		}
	}
}