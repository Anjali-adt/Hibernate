package com.hql;

import java.util.Arrays;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.*;

public class Update_example {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure();
        SessionFactory sf = cfg.buildSessionFactory();
        
        Session session = sf.openSession();
        
        
        Transaction t = session.beginTransaction();
        
        Query q3 = session.createQuery("update Student set city =:c where name =:n  ");
        q3.setParameter("c", "Khargone");
        q3.setParameter("n", "Anjali");
        int r = q3.executeUpdate();
       
        System.out.println(r + " object updated ");
        t.commit();
        
        
        //-------join query-------
        
        Query q4 = session.createQuery("select q.que , q.queId , a.ans from Question as q INNER JOIN q.ans as a " );
        List<Object[]>list4 = q4.getResultList();
        
        for(Object[] ob : list4)
        {
        	System.out.println(Arrays.toString(ob));
        }
        session.close();
        sf.close();
        
	}

}
