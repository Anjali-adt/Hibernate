package com.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.durgesh_hbr.Student;

public class HQl_Example {
	public static void main(String[] args) {
	
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		//HQL:syntax
		
	//  String query ="from Student";
	//	String query = "from Student where city = 'Indore' ";
	//	String query = "from Student where city = :x ";
     	String query = "from Student as s where s.city=:x and s.name =:n";

	    Query q = session.createQuery(query);
	    
	    q.setParameter("x", "indore");
	    q.setParameter("n", "Anjali");

		//single :-(unique)
		//multiple :- list
		List<Student>list = q.list();
		
		for(Student stu : list)
		{
			//System.out.println(stu.getName() + " : "  + stu.getId());
			System.out.println(stu.getId());

		}
		session.close();
		sf.close();
	}

}
