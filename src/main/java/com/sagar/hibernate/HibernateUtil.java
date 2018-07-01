package com.sagar.hibernate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 
public class HibernateUtil {
private static SessionFactory	factory;
	
	static
	{
		//Configuration object is created and is asked
		// to parse the configuration and referenced mapping files
		Configuration cfg = new Configuration().configure();
		//Configuration object is asked to create a 
		//SessionFactory object
		factory = cfg.buildSessionFactory();
		
	}
	
	//Method to retrun session object
	public static Session getSession()
	{
		return factory.openSession();
	}
 
}
