package com.cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map.one_to_many.Answer1;
import com.map.one_to_many.Question1;

public class Cascade_Example {
	public static void main(String[] args) {
		
	System.out.println("Helloooooooo");
	
	SessionFactory sf =
			new Configuration().configure().buildSessionFactory();
	Session session = sf.openSession();
	
	Question1 qus = new Question1();
    qus.setQueId(6761);
    qus.setQue("What is cascading");
    
    Answer1 an1 = new Answer1(34546 , "It is an important topic of hbr");
    Answer1 an2 = new Answer1(34547 , "answer 2");
    Answer1 an3 = new Answer1(34548 , "answer 3");
    
    List<Answer1>list = new ArrayList<Answer1>();
    list.add(an1);
    list.add(an2);
    list.add(an3);
    qus.setAnswers(list);
    
    Transaction t = session.beginTransaction();
    
    session.save(qus);
    t.commit();
    
    session.close();
    sf.close();
   

	
	
	}

}
