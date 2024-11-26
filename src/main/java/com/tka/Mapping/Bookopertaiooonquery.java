package com.tka.Mapping;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Bookopertaiooonquery {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Book.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
//		Query query = session.createQuery("from Book");
//		List<Book> b = query.list();
//		for (Book p1 : b) {
//			System.out.println();
//			System.out.println(p1.getBid() + " book name" + p1.getBname() + "\nauthor name " + p1.getAuthor()
//					+ "\nPrice " + p1.getPrice() + "\nQty " + p1.getQty());
//
//		}
//		// Serach book by Author Name
//		Query query1 = session.createQuery("from Book where author = :authorName");
//		query1.setParameter("authorName", "A.P.Abdul kalam");
//		List<Book> p = query1.list();
//
//		for (Book p1 : p) {
//			System.out.println();
//			System.out.println(
//					p1.getBid() + " " + p1.getBname() + " " + p1.getAuthor() + " " + p1.getPrice() + " " + p1.getQty());
//		}
//
//		// count how many book by author= "xyz"
//		System.out.println();
//		Query query2 = session.createQuery("SELECT COUNT(*) FROM Book WHERE author = :authorName");
//		query2.setParameter("authorName", "maddy");
//		List<Book> p1 = query2.list();
//		Long count = (long) query2.getSingleResult();
//		System.out.println("Nmber of book by Maddy :" + count);
//
//		// As per the quantity print total price of all book
//		System.out.println();
//		Query query3 = session.createQuery("select sum(qty*price) from Book");
//		Long Totalprice = (long) query3.getSingleResult();
//		System.out.println("Total price of Book is :" + Totalprice);
//
//		// Delete Book by its name
//		System.out.println();
//		String bookName = "liferules";
//		Query query4 = session.createQuery("delete from Book where bname = :bookName");
//		query4.setParameter("bookName", bookName);
//		query4.executeUpdate();
		

		// Update the book by author using hql.
		Transaction tx = session.beginTransaction();

		System.out.println();
//		String a = "Bhagvatgeeta";
//		int p = 400;

		Query query5 = session.createQuery("update Book set price=:p where author=:a");
		query5.setParameter("a", "Bhagvatgeeta");
		query5.setParameter("p", 200);
		

		int updateRows = query5.executeUpdate();
		tx.commit();
		
		System.out.println("Number of updated Row" + updateRows);

	}

}
