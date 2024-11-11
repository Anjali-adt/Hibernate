package com.hql_pagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.durgesh_hbr.Student;

public class HQL_Pagination {
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().
				configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = sf.openSession();
		
		Query q = session.createQuery("from Student");
		
		//-----------Pagination-------------
		q.setFirstResult(1);
		q.setMaxResults(3);
		List<Student>list = q.list();
		
		for(Student s : list)
		{
			System.out.println(s.getId() + " : " + s.getName() + " : " + s.getCerti() + " : " + s.getCity());
		}
		
		session.close();
		sf.close();
	}

}
