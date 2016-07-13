package com.ttnd.reap.dao;

import com.ttnd.reap.model.Employee;
import com.ttnd.reap.model.User;

public interface UserDao {
	
	User findById(Integer id);
	
	void save(User user);
	
	void saveEmpl(Employee employee);
	
	Employee findEmplById(String email,String password);
	
	
}
