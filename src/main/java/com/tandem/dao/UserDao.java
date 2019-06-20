package com.tandem.dao;

import java.util.List;

import com.tandem.model.User;

public interface UserDao {
	
	List<User> findAll();

	void insertUser(User emp);

	void updateUser(User emp);

	void executeUpdateUser(User emp);

	public void deleteUser(User emp);
	
}
