package com.map1;

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
		
		Employee emp1 = new Employee(); 
		Employee emp2 = new Employee(); 
		Employee emp3 = new Employee(); 
		Employee emp4 = new Employee(); 

		emp1.seteId(999);
		emp1.seteName("Anjali");
		
		emp2.seteId(888);
		emp2.seteName("Sonu");
		
        emp3.seteId(777);
		emp3.seteName("Golu");
		
        emp4.seteId(666);
		emp4.seteName("Sid");



		Project pr1 = new Project();
		Project pr2 = new Project();
		
		pr1.setpId(1);
		pr1.setpName("Adobe");
		
		pr2.setpId(2);
		pr2.setpName("HDFC Bank");
		
		List<Employee>elist = new ArrayList<Employee>();
		List<Project>plist = new ArrayList<Project>();
	
	    elist.add(emp1);
	    elist.add(emp2);
	    elist.add(emp3);
	    elist.add(emp4);
	    
	    plist.add(pr1);
	    plist.add(pr2);

	    emp1.setProjects(plist);
	    pr2.setEmps(elist);  

	    Session session = sf.openSession();
	    Transaction t = session.beginTransaction();
	    
	    session.save(emp1);
	    session.save(emp2);
	    session.save(emp3);
	    session.save(emp4);
	    
	    session.save(pr1);
	    session.save(pr2);


	    
	    
	    t.commit();
	    session.close();
		
	}

}
