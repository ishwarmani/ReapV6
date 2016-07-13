package com.ttnd.reap.service;

import com.ttnd.reap.model.Employee;
import com.ttnd.reap.model.User;

public interface IUserService {
	
	User findById(Integer id);
	
	void save(User user);
	
	void saveEmpl(Employee employee);
	
	Employee findEmplById(String email,String password);
	
}
