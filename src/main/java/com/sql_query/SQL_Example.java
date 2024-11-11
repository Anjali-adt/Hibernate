package com.sql_query;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.durgesh_hbr.Student;

public class SQL_Example {
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration()
				.configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = sf.openSession();
		
		//SQL queries
		 String q = "select * from Student ";
		 NativeQuery nq =session.createNativeQuery(q);
		 
		 List<Object[]> list = nq.list();
		
		 for(Object[] s : list)
		 {
			 System.out.println(Arrays.toString(s));
		 }
		
		session.close();
		sf.close();
	}

}
