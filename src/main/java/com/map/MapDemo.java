package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		
		//create que
		Question q1 = new Question();
		q1.setQueId(111);
		q1.setQue("What is Java");
		
		Question q2 = new Question();
		q2.setQueId(222);
		q2.setQue("What is Hiernate");
	
		
		//create answer
		Answer a1 = new Answer();
		a1.setAnsId(234);
		a1.setAns("Java is programming language");
		
		q1.setAns(a1);
		
		
		Answer a2 = new Answer();
		a2.setAnsId(567);
		a2.setAns("Hibernate is a ORM Tool");
		q2.setAns(a2);
		
		
         //Session
		Session session = sf.openSession();
		
		Transaction t = session.beginTransaction(); 
		
		//save
		session.persist(q1);
		session.persist(q2);
		session.persist(a1);
		session.persist(a2);

		
		t.commit();
		
		//fetching
		Question newQ = (Question) session.get(Question.class, 111);
		System.out.println(newQ.getQue());
		System.out.println(newQ.getAns().getAns());
		
		
		session.close();
		sf.close();
		
	}

}
