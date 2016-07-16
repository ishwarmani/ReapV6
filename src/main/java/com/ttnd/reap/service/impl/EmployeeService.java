package com.ttnd.reap.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ttnd.reap.dao.IEmployeeDao;
import com.ttnd.reap.model.RecievedBadges;
import com.ttnd.reap.model.GivingBadges;
import com.ttnd.reap.model.Employee;
import com.ttnd.reap.service.IEmployeeService;

@Service
public class EmployeeService implements IEmployeeService {
	
	@Autowired
	private IEmployeeDao employeeDao;
	
	
	@Override
	public void register(Employee emp) {
			employeeDao.register(emp);
	}

	@Override
	public Employee login(String email, String Password) {
		return employeeDao.login(email, Password);
	}

	@Override
	public Employee getEmployeeInfo(String employeeId) {
		return employeeDao.getEmployeeInfo(employeeId);
	}

	@Override
	public GivingBadges getGivingKittyInfo(String employeeId) {
		return employeeDao.getGivingKittyInfo(employeeId);
	}

	@Override
	public RecievedBadges getRecievedKittyInfo(String employeeId) {
		return employeeDao.getRecievedKittyInfo(employeeId);
	}

	@Override
	public List<Employee> getEmployeeSearchResults(String employeeId) {
		return employeeDao.getEmployeeSearchResults(employeeId);
	}
}
