package com.rest.api.dao.impl;

import javax.inject.Inject;

import org.mongodb.morphia.query.Query;

import com.rest.api.dao.UserDao;
import com.rest.api.dao.connection.DBConnection;
import com.rest.api.model.User;

public class UserDaoImpl implements UserDao {

	@Inject
	private DBConnection db;
	
	@Override
	public void save(User user) {
		db.getDatastore().save(user);
	}

	@Override
	public User findById(Long id) {
		Query<User> query = db.getDatastore().find(User.class);
		return query.filter("_id", id).get();
	}
	
}
