package com.rest.api.dao;

import com.rest.api.model.User;

public interface UserDao {

	void save(User user);
	
	User findById(Long id);
	
}
