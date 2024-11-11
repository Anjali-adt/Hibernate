//package com.second_cache;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//
//import com.durgesh_hbr.Student;
//
//public class SecondCache {
//	public static void main(String[] args) {
//		
//		SessionFactory sf = new Configuration().configure().buildSessionFactory();
//		
//		//first level cache
//		Session session1 = sf.openSession();
//		Student s1=session1.get(Student.class, 2);
//		System.out.println(s1);
//		session1.close();
//		
//		//second level cache
//		Session session2 = sf.openSession();
//		Student s2=session1.get(Student.class, 2);
//		System.out.println(s2);
//		session2.close();
//		
//	}
//
//}
