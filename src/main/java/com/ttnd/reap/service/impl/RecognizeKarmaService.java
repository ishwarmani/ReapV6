package com.ttnd.reap.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ttnd.reap.dao.IEmployeeDao;
import com.ttnd.reap.dao.IRecognizeKarmaDao;
import com.ttnd.reap.model.Employee;
import com.ttnd.reap.model.RecognizeKarma;
import com.ttnd.reap.service.IRecognizeKarmaService;

@Service
public class RecognizeKarmaService implements IRecognizeKarmaService{
	
	@Autowired
	private IRecognizeKarmaDao recognizeKarmaDao;
	@Autowired
	private IEmployeeDao employeeDao;
	
	@Override
	public void setRecognizeKarma(RecognizeKarma record) {
		
		
		String Sname = record.getSenderId();
		String Rname = record.getRecieverId();
		String star = record.getStar();
		
		employeeDao.updateRecievedBadges(Rname, star);
		employeeDao.updateGivingBadges(Sname, star);
		recognizeKarmaDao.setRecognizeKarma(record);
	}

	@Override
	public List<RecognizeKarma> getRecognizeKarmaValues() {
		return recognizeKarmaDao.getRecognizeKarmaValues();
		
	}

	@Override
	public List<RecognizeKarma> getSearchResults(String empId) {
		
		return null;
	}

}
