package com.map.one_to_many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo1 {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		
		Question1 ques1 = new Question1();
		ques1.setQueId(123);
		ques1.setQue("What is Java ?");
	
		
		Answer1 ans1 = new Answer1();
		ans1.setAnswerId(222);
		ans1.setAnswer("Java is a programming language");
		//ans1.setQues1(ques1);

		Answer1 ans2 = new Answer1();
		ans2.setAnswerId(333);
		ans2.setAnswer("Java is plateform independent");
		//ans2.setQues1(ques1);

		List<Answer1>list = new ArrayList<Answer1>();
		list.add(ans1);
		list.add(ans2);
		
		ques1.setAnswers(list);
		
		//Session
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		session.save(ques1);
		session.save(ans1);
		session.save(ans2);
		
		t.commit();
		session.close();
		sf.close();
		
		//Fetching
	/*
	     Question1 que =(Question1)session.get(Question1.class , 123);
	     Systen.out.println(que.getQuestion1());
	     
	      for(Answer1 a : que.getAnswers())
	      {
	         System.out.println(a.getAnswers());
	      }
	  
	  
	  
	  
	 
	 * */	
		
		
	}

}
