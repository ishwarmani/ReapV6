package com.ttnd.reap.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ttnd.reap.dao.UserDao;
import com.ttnd.reap.model.Employee;
import com.ttnd.reap.model.User;
import com.ttnd.reap.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{
	
	UserDao userDao;
	
	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public User findById(Integer id) {
		return userDao.findById(id);
		
	}

	@Override
	public void save(User user) {
		userDao.save(user);
	}

	@Override
	public void saveEmpl(Employee employee) {
		userDao.saveEmpl(employee);
		
	}

	@Override
	public Employee findEmplById(String email, String password) {
		return userDao.findEmplById(email, password);
	}

}
