package com.ttnd.reap.dao;

import java.util.List;

import com.ttnd.reap.model.RecievedBadges;
import com.ttnd.reap.model.RecognizeKarma;
import com.ttnd.reap.model.GivingBadges;
import com.ttnd.reap.model.Employee;

public interface IEmployeeDao {

	public boolean register(Employee emp);

	public Employee login(String email, String Password);

	public Employee getEmployeeInfo(String employeeId);

	public GivingBadges getGivingKittyInfo(int givBadgeId);

	public RecievedBadges getRecievedKittyInfo(int recBadgeId);

	public Employee findEmployee(String name);

	public void updateRecievedBadges(String employeeId, String star);

	public void updateGivingBadges(String employeeId, String star);

	public List<Employee> employeeList();

	public List<RecievedBadges> getNewerBoardEmployees();

	String generateEmployeeId();

	public List<Employee> getEmployeeSearchResults();

	String findEmployeeName(int Id);

	String findEmployeeName(String employeeId);

	public List<RecognizeKarma> getRecognizeKarmaValues();

}
