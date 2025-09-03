package com.cims.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cims.dao.LoginDetailsDao;
import com.cims.entity.LoginDetails;

@Service
public class LoginDetailsServiceImpl implements LoginDetailsService{

	@Autowired
	private LoginDetailsDao dao;
	@Override
	public List<LoginDetails> getAllLoginDetails() {
		List<LoginDetails> users=dao.findAll();
		if(users!=null && !users.isEmpty())
		{
			return users;
			
		}
		throw new RuntimeException("No User found");
		
	}

}
