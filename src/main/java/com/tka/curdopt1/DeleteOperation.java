package com.tka.curdopt1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteOperation {
		public static void main(String[] args) {
			
			
			Configuration cfg = new Configuration() ;
			cfg.configure("hibernet.cfg.xml");
			cfg.addAnnotatedClass(product.class);
			
			SessionFactory factory = cfg.buildSessionFactory();
			Session session = factory.openSession();
			
			 product prd = new product(101,"Bed","Homedecor",20000);
			    session.delete(prd);
			    Transaction ta = session.beginTransaction() ;
			    ta.commit();
			    System.out.println("Record Delete Succesfully");
				
			
		}	
		
}	
		