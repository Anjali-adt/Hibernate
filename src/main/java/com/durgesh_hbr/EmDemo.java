package com.durgesh_hbr;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		
		 Configuration cfg = new Configuration();
	     SessionFactory sf = cfg.configure().buildSessionFactory();
	        
	     Student stu1 = new Student();
	     stu1.setId(102);
	     stu1.setName("Sonu");
	     stu1.setCity("Ujjain");
	   
	     Certificate cer = new Certificate();
	     cer.setCourse("Java");
	     cer.setDuration("6 months");
	   
	     stu1.setCerti(cer);

	     Session session = sf.openSession();
	     Transaction t = session.beginTransaction();
	     
	     //object save
	     session.persist(stu1);
//	     session.persist(cer);

	     
	     t.commit();
	     sf.close();
	}
}
