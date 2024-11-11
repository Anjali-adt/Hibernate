package com.state;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.durgesh_hbr.Certificate;
import com.durgesh_hbr.Student;

public class StateDemo {
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		//creating student object
		Student student = new Student();
		student.setId(2323);
		student.setName("Tito");
		student.setCity("Indore");
		student.setCerti(new Certificate("React Course","2 months"));
		//student :- transient state
		
		Session session = sf.openSession();
		
		Transaction t = session.beginTransaction(); 
		
		session.save(student);
        //student :- persistent state(session + db)
		student.setName("Tango");
		
		t.commit();
      
        
		student.setName("Charlie");
        System.out.println(student);
        
        sf.close();
        //detached state
	}

}
