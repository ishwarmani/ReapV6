package com.ttnd.reap.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ttnd.reap.dao.IEmployeeDao;
import com.ttnd.reap.dao.util.NewerBoard;
import com.ttnd.reap.dao.util.RecognizeKarmaCopy;
import com.ttnd.reap.model.Employee;
import com.ttnd.reap.model.GivingBadges;
import com.ttnd.reap.model.RecievedBadges;
import com.ttnd.reap.model.RecognizeKarma;
import com.ttnd.reap.service.IEmployeeService;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	private IEmployeeDao employeeDao;

	@Override
	public boolean register(Employee employee) {
		return employeeDao.register(employee);
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
	public GivingBadges getGivingKittyInfo(int givBadgeId) {
		return employeeDao.getGivingKittyInfo(givBadgeId);
	}

	@Override
	public RecievedBadges getRecievedKittyInfo(int recBadgeId) {
		return employeeDao.getRecievedKittyInfo(recBadgeId);
	}

	@Override
	public List<Employee> getEmployeeSearchResults() {
		return employeeDao.getEmployeeSearchResults();
	}

	@Override
	public void updateRecievedBadges(String employeeId, String star) {
		employeeDao.updateRecievedBadges(employeeId, star);
	}

	@Override
	public List<Employee> employeeList() {

		return employeeDao.employeeList();
	}

	@Override
	public List<RecievedBadges> getNewerBoardEmployees() {

		return employeeDao.getNewerBoardEmployees();
	}

	@Override
	public List<RecognizeKarmaCopy> getEmplList() {

		List<RecognizeKarma> karma = employeeDao.getRecognizeKarmaValues();
		List<RecognizeKarmaCopy> karmaCopies = new ArrayList<>();

		for (RecognizeKarma recognizeKarma : karma) {
			RecognizeKarmaCopy copy = new RecognizeKarmaCopy();
			String Sname = employeeDao.findEmployeeName(recognizeKarma.getSenderId());
			copy.setSenderName(Sname);
			String Rname = employeeDao.findEmployeeName(recognizeKarma.getRecieverId());
			copy.setRecieverName(Rname);
			copy.setMessage(recognizeKarma.getMessage());
			copy.setDate(recognizeKarma.getDate());
			copy.setKarma(recognizeKarma.getKarma());
			copy.setStar(recognizeKarma.getStar());
			// System.out.println(Sname+recognizeKarma.getSenderId());
			karmaCopies.add(copy);
		}

		return karmaCopies;
	}

	public List<NewerBoard> getNewerList() {

		List<RecievedBadges> recievedBadgesList = employeeDao.getNewerBoardEmployees();
		List<NewerBoard> copies = new ArrayList<>();

		for (RecievedBadges recievedBadges : recievedBadgesList) {

			NewerBoard board = new NewerBoard();
			// System.out.println(recievedBadges);
			// System.out.println(recievedBadges.getRecBadgeId());
			String newerName = employeeDao.findEmployeeName(recievedBadges.getRecBadgeId());
			board.setName(newerName);
			board.setBadges(recievedBadges.getBadges());
			board.setPoints(recievedBadges.getPoints());
			copies.add(board);
		}

		return copies;
	}
}
