package com.tka.curdopt1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Insertoperation {
	

	public static void main(String[] args) {
		
		
		Configuration cfg = new Configuration() ;
		cfg.configure("hibernet.cfg.xml");
		cfg.addAnnotatedClass(product.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
	    product prd2 = new product (103,"ring","ornamnets",36000);
	    session.save(prd2);
	    org.hibernate.Transaction ta = session.beginTransaction() ;
	    ta.commit();
	    System.out.println("Record Inserted Succesfully");
		
		
		
	}
		
		
		
	}



