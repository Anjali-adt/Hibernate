package com.durgesh_hbr;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Project started" );
        
        Configuration cfg = new Configuration();
        SessionFactory sf = cfg.configure().buildSessionFactory();
        
//        System.out.println(sf);
//        
//        System.out.println(sf.isClosed());
        
        Student st = new Student();
        st.setId(101);
        st.setName("Anjali");
        st.setCity("Khargone");
//         System.out.println(st);
         
         
         st.setId(102);
         st.setName("Sonu");
         st.setCity("Indore");
         System.out.println(st);
          
         //creating address obj
         Address ad = new Address();
         
         ad.setStreet("Gumashta Nagar");
         ad.setCity("Indore");
         ad.setAddedDate(new Date());
         ad.setX(63.9838);
         
         ad.setStreet("Prakash Nagar");
         ad.setCity("Indore");
         ad.setAddedDate(new Date());
         ad.setX(63.9838);
         
         
        Session session = sf.openSession();
        
        Transaction t =  session.beginTransaction();
        session.persist(st);
        session.persist(ad);
        t.commit();
        session.close();
        
        System.out.println("Done!!");
    }
}
