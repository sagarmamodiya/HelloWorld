package com.sagar.service;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sagar.hibernate.HibernateUtil;
import com.sagar.hibernate.UserHibernate;
import com.sagar.jsf.User;

public class UserServiceImpl implements UserService
{

	 public int add(User user)
	 {
		    int result;
		    UserHibernate uh=new UserHibernate();
		    System.out.println("MAmodiya"+user.getName());
	        uh.setName(user.getName());
	        uh.setEmail(user.getEmail());
	        uh.setPassword(user.getPassword());
	        uh.setGender(user.getGender());
	        uh.setAddress(user.getAddress());
	        
	        Session session=HibernateUtil.getSession();
	        Transaction t=session.beginTransaction();
	        result =(Integer)session.save(uh);
	        t.commit();
		    return result;
	 }
	
}
