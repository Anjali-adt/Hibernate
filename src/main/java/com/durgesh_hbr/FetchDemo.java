package com.durgesh_hbr;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		
		// get , load
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		//get
//		Student stu =(Student)session.get(Student.class, 101);
//		System.out.println(stu);
		
		//load
	    Student stu =(Student)session.load(Student.class, 101);
	     System.out.println(stu);
		
	     Address ad = (Address)session.get(Address.class, 1 );
         System.out.println(ad.getStreet() + " : " + ad.getCity());
	     
	     session.close();
		sf.close();
		
		
	}
}
