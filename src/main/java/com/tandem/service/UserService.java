package com.tandem.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.tandem.dao.UserDao;
import com.tandem.model.User;

@Component
public class UserService{
	
	@Resource 
	UserDao mUserDao;
	
	public List<User> findAll() {
		return mUserDao.findAll();
	}
	
	
	public void insertUser(User emp) {
		mUserDao.insertUser(emp);
		
	}
	
	public void updateUser(User emp) {
		mUserDao.updateUser(emp);
		
	}
	
	public void executeUpdateUser(User emp) {
		mUserDao.executeUpdateUser(emp);
		
	}
	
	public void deleteUser(User emp) {
		mUserDao.deleteUser(emp);
		
	}

}
