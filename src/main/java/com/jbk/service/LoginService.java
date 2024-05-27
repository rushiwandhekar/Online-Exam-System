package com.jbk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.LoginDAO;
import com.jbk.entity.User;

@Service
public class LoginService {
    @Autowired
	public LoginDAO dao;
    
    public boolean validate(User userFromBrowser)
    {
    String passwordFromDatabase = dao.getPasswordFromDatabase(userFromBrowser.getUsername());
    
    if(passwordFromDatabase.equals(userFromBrowser.getPassword()))
    {
    	return true;
    }
    else
    {
    	return false;
    }
    }
	
}
