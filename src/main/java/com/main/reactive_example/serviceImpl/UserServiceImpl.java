package com.main.reactive_example.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.reactive_example.dao.UserDao;
import com.main.reactive_example.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	
	@Override
	public String getUserDetail() {
		userDao.userDetail();
		return null;
	}

}
