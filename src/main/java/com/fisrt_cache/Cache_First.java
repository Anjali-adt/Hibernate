package com.fisrt_cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.durgesh_hbr.Student;

public class Cache_First {
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		
		Student student1= session.get(Student.class, 102); 
		System.out.println(student1);
		
		System.out.println("something happens!");
		
		Student student2= session.get(Student.class, 102); 
		System.out.println(student1);
		
		System.out.println(session.contains(student1));
		
		
		session.close();
		sf.close();
	}

}
