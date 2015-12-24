package com.rest.api.service;

import com.rest.api.model.User;

public interface UserService {

	void save(User user);
	
	User findById(Long id);
	
}
