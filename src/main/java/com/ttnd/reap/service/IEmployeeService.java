package com.ttnd.reap.service;

import java.util.List;

import com.ttnd.reap.model.RecievedBadges;
import com.ttnd.reap.model.GivingBadges;
import com.ttnd.reap.dao.util.NewerBoard;
import com.ttnd.reap.dao.util.RecognizeKarmaCopy;
import com.ttnd.reap.model.Employee;

public interface IEmployeeService {
	
	public boolean register(Employee emp);

	public Employee login(String email, String Password);

	public Employee getEmployeeInfo(String employeeId);

	public GivingBadges getGivingKittyInfo(int givBadgeId);

	public RecievedBadges getRecievedKittyInfo(int recBadgeId);

	public List<Employee> getEmployeeSearchResults();

	public void updateRecievedBadges(String employeeId, String star);

	public List<Employee> employeeList();

	public List<RecievedBadges> getNewerBoardEmployees();

	List<RecognizeKarmaCopy> getEmplList();

	public List<NewerBoard> getNewerList();
}
