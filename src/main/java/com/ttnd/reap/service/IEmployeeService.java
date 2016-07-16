package com.ttnd.reap.service;

import java.util.List;

import com.ttnd.reap.model.RecievedBadges;
import com.ttnd.reap.model.GivingBadges;
import com.ttnd.reap.model.Employee;

public interface IEmployeeService {
	public void register(Employee emp);
	public Employee login(String email,String Password);
	public Employee getEmployeeInfo(String employeeId);
	public GivingBadges getGivingKittyInfo(String employeeId);
	public RecievedBadges getRecievedKittyInfo(String employeeId);
	public List<Employee> getEmployeeSearchResults(String employeeId);
}
