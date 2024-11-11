package com.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.durgesh_hbr.Student;

public class Delete_example {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		//HQL:syntax
	 	String query = "delete from Student as s where s.city=:c ";

	 	Transaction t = session.beginTransaction();
	 	
	    Query q2 = session.createQuery(query);
	    q2.setParameter("c", "Bhopal");
	    
	    int r = q2.executeUpdate();
		System.out.println("Deleted : " + r);		
		
		t.commit();
		
		session.close();
		sf.close();
	}

}



