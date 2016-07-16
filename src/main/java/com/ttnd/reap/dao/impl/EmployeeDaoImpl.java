package com.ttnd.reap.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.stereotype.Component;

import com.ttnd.reap.dao.IEmployeeDao;
import com.ttnd.reap.dao.util.ConnectionProvider;
import com.ttnd.reap.enums.Stars;
import com.ttnd.reap.model.Badges;
import com.ttnd.reap.model.RecievedBadges;
import com.ttnd.reap.model.GivingBadges;
import com.ttnd.reap.model.Employee;
import com.ttnd.reap.model.RecognizeKarma;

@Component
public class EmployeeDaoImpl implements IEmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;

	public EmployeeDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void register(Employee employee) {

		GivingBadges records = initBadgesRecord();
		RecievedBadges recieved = initBadgesRecieved();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(records);
		session.save(recieved);
		employee.setGivingBadges(records);
		employee.setRecievedBadges(recieved);
		employee.setDateOfJoining(new Date());
		employee.setEmployeeId("TTND-01");

		session.save(employee);

		session.getTransaction().commit();
		session.close();
	}

	public Employee login(String email, String Password) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		System.out.println(email + " " + Password);
		@SuppressWarnings("deprecation")
		Criteria criteria = session.createCriteria(Employee.class).add(Restrictions.eq("email", email))
				.add(Restrictions.eq("password", Password));
		Employee employee = (Employee) criteria.uniqueResult();
		session.getTransaction().commit();
		session.close();
		return employee;
	}

	public Employee getEmployeeInfo(String employeeId) {

		// Session session = ConnectionProvider.getSession();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		@SuppressWarnings("deprecation")
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("employeeId", employeeId));
		List<Employee> list = criteria.list();
		Employee employee = (Employee) list.get(0);
		session.getTransaction().commit();
		session.close();
		return employee;
	}

	public GivingBadges getGivingKittyInfo(String employeeId) {
		Session session = sessionFactory.openSession();
		// Session session = ConnectionProvider.getSession();
		session.beginTransaction();
		@SuppressWarnings("deprecation")
		Criteria criteria = session.createCriteria(GivingBadges.class);
		criteria.add(Restrictions.eq("employeeId", employeeId));
		List<GivingBadges> list = criteria.list();
		GivingBadges givKitty = list.get(0);
		session.getTransaction().commit();
		session.close();
		return givKitty;
	}

	public GivingBadges initBadgesRecord() {

		Badges badges = new Badges();
		GivingBadges badgesRecords = new GivingBadges();
		badges.setGold(Stars.user.getGold());
		badges.setSilver(Stars.user.getSilver());
		badges.setBronze(Stars.user.getBronze());

		badgesRecords.setBadges(badges);
		return badgesRecords;
	}
	
	public RecievedBadges initBadgesRecieved() {

		Badges badges = new Badges();
		badges.setGold(0);
		badges.setSilver(0);
		badges.setBronze(0);

		RecievedBadges badgesRecieved = new RecievedBadges();
		badgesRecieved.setBadges(badges);

		return badgesRecieved;
	}
	
	public RecievedBadges getRecievedKittyInfo(String employeeId) {

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		@SuppressWarnings("deprecation")
		Criteria criteria = session.createCriteria(RecievedBadges.class);
		criteria.add(Restrictions.eq("employeeId", employeeId));
		List list = criteria.list();
		RecievedBadges recKitty = (RecievedBadges) list.get(0);
		session.getTransaction().commit();
		session.close();
		return recKitty;
	}


	@Override
	public List<Employee> getEmployeeSearchResults(String employeeId) {
		// Session session = ConnectionProvider.getSession();
		Session session = sessionFactory.openSession();
		@SuppressWarnings("deprecation")
		Criteria criteria = session.createCriteria(RecognizeKarma.class);
		// criteria.add()
		return null;
	}

}
