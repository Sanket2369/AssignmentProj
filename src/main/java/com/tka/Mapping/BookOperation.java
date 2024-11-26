package com.tka.Mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BookOperation {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Book.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Book b1 = new Book();
		b1.setBid(11);
		b1.setBname("wings of fire");
		b1.setAuthor("A.P.Abdul kalam");
		b1.setPrice(350);
		b1.setQty(300);
		
		Book b2 = new Book();
		b2.setBid(12);
		b2.setBname("liferules");
		b2.setAuthor("A. shrivastav");
		b2.setPrice(340);
		b2.setQty(40);
		
		Book b3 = new Book();
		b3.setBid(13);
		b3.setBname("Ramayan");
		b3.setAuthor("vyasji");
		b3.setPrice(120);
		b3.setQty(300);
		
		Book b4 = new Book();
		b4.setBid(14);
		b4.setBname("Bhagvatgeeta");
		b4.setAuthor("Valmiki");
		b4.setPrice(250);
		b4.setQty(600);
		
		Book b5 = new Book();
		b5.setBid(15);
		b5.setBname("java Devloper");
		b5.setAuthor("maddy");
		b5.setPrice(160);
		b5.setQty(303);
		
		session.save(b1);
		session.save(b2);
		session.save(b3);
		session.save(b4);
		session.save(b5);
	
		Transaction tx = session.beginTransaction();
		tx.commit();
		
  }
}