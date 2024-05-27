package com.jbk.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.User;

@Repository
public class LoginDAO
{
    @Autowired
	SessionFactory factory;
	public String getPasswordFromDatabase(String username)
	{
		Session session = factory.openSession();
		User userFromDB = session.get(User.class,username);
		
		// userFromDB==>[username=x password=y mobno=1234 emailidd=rd@dr] User class object
		
		return  userFromDB.getPassword();
		
	}
	
}
