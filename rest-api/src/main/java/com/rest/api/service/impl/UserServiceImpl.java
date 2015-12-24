package com.rest.api.service.impl;

import javax.inject.Inject;

import com.rest.api.dao.UserDao;
import com.rest.api.exception.BusinessException;
import com.rest.api.model.User;
import com.rest.api.service.UserService;

public class UserServiceImpl implements UserService {

	@Inject
	private UserDao userDao;
	
	@Override
	public void save(User user) {
		userDao.save(user);
	}
	
	@Override
	public User findById(Long id) {
		User user = userDao.findById(id);
		
		if(user == null) {
			throw new BusinessException("USR001", "User not found");
		}
		
		return user;
	}

}
