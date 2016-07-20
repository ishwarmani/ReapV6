package com.ttnd.reap.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ttnd.reap.dao.IEmployeeDao;
import com.ttnd.reap.enums.Stars;
import com.ttnd.reap.model.Badges;
import com.ttnd.reap.model.Employee;
import com.ttnd.reap.model.GivingBadges;
import com.ttnd.reap.model.RecievedBadges;
import com.ttnd.reap.model.RecognizeKarma;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;

	public EmployeeDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	Integer a = null;

	@Override
	public String generateEmployeeId() {

		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			@SuppressWarnings("deprecation")
			Criteria criteria = session.createCriteria(Employee.class);
			criteria.setProjection(Projections.max("id"));
			a = (Integer) criteria.uniqueResult();
			if (a == null) {
				a = 1;
			} else {
				a++;
			}
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return "TTND" + a;

	}

	public void register(Employee employee) {

		GivingBadges records = initBadgesRecord();
		RecievedBadges recieved = initBadgesRecieved();
		String employeeId = generateEmployeeId();
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			employee.setEmployeeId(employeeId);
			session.save(records);
			session.save(recieved);
			employee.setGivingBadges(records);
			employee.setRecievedBadges(recieved);
			employee.setDateOfJoining(new Date());
			employee.setUserRole("User");
			session.save(employee);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

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

	public Employee login(String email, String Password) {

		Employee employee = null;
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			@SuppressWarnings("deprecation")
			Criteria criteria = session.createCriteria(Employee.class).add(Restrictions.eq("email", email))
					.add(Restrictions.eq("password", Password));
			employee = (Employee) criteria.uniqueResult();
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return employee;
	}

	public Employee getEmployeeInfo(String employeeId) {

		Employee employee = null;
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			@SuppressWarnings("deprecation")
			Criteria criteria = session.createCriteria(Employee.class);
			criteria.add(Restrictions.eq("employeeId", employeeId));
			@SuppressWarnings("unchecked")
			List<Employee> list = criteria.list();
			employee = (Employee) list.get(0);
			session.getTransaction().commit();
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return employee;
	}

	@SuppressWarnings("unchecked")
	public GivingBadges getGivingKittyInfo(String employeeId) {

		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		List<GivingBadges> list = null;
		GivingBadges givKitty = null;
		try {
			transaction = session.beginTransaction();
			@SuppressWarnings("deprecation")
			Criteria criteria = session.createCriteria(GivingBadges.class);
			criteria.add(Restrictions.eq("employeeId", employeeId));
			list = criteria.list();

			givKitty = list.get(0);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return givKitty;
	}

	@SuppressWarnings("unchecked")
	public RecievedBadges getRecievedKittyInfo(int employeeId) {
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		List<RecievedBadges> list = null;
		RecievedBadges recievedBadges = null;

		try {
			transaction = session.getTransaction();
			@SuppressWarnings("deprecation")
			Criteria criteria = session.createCriteria(RecievedBadges.class);
			criteria.add(Restrictions.eq("recBadgeId", employeeId));

			list = criteria.list();
			recievedBadges = (RecievedBadges) list.get(0);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return recievedBadges;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getEmployeeSearchResults() {
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		List<Employee> list = null;
		try {
			transaction = session.beginTransaction();
			@SuppressWarnings("deprecation")
			Criteria criteria = session.createCriteria(Employee.class);
			list = criteria.list();
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return list;
	}

	@Override
	public Employee findEmployee(String name) {

		// Session session = sessionFactory.openSession();
		// session.beginTransaction();
		// @SuppressWarnings("deprecation")
		// Criteria criteria = session.createCriteria(Employee.class);
		// criteria.add(Restrictions.eq("employeeName", name));
		// List<Employee> list = criteria.list();
		// Employee employee = (Employee) list.get(0);
		// session.getTransaction().commit();
		// session.close();
		// return employee;
		return null;
	}
	/*
	 * @Override public void updateRecievedBadges(String employeeId, String
	 * star) { Session session = sessionFactory.openSession();
	 * session.beginTransaction();
	 * 
	 * @SuppressWarnings("deprecation") Criteria criteria =
	 * session.createCriteria(Employee.class).add(Restrictions.eq("employeeId",
	 * employeeId)); Employee employee = (Employee) criteria.uniqueResult();
	 * RecievedBadges recievedBadges = employee.getRecievedBadges(); int temp;
	 * if (star.equals("gold")) { temp = recievedBadges.getBadges().getGold();
	 * recievedBadges.getBadges().setGold(temp + 1); } else if
	 * (star.equals("silver")) { temp = recievedBadges.getBadges().getSilver();
	 * recievedBadges.getBadges().setSilver(temp + 1); } else { temp =
	 * recievedBadges.getBadges().getBronze();
	 * recievedBadges.getBadges().setBronze(temp + 1); }
	 * 
	 * session.update(recievedBadges); session.getTransaction().commit();
	 * session.close();
	 * 
	 * }
	 */

	@Override
	public void updateRecievedBadges(String employeeId, String star) {
		Session session = sessionFactory.openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			@SuppressWarnings("deprecation")
			Criteria criteria = session.createCriteria(Employee.class).add(Restrictions.eq("employeeId", employeeId));
			Employee employee = (Employee) criteria.uniqueResult();
			RecievedBadges recievedBadges = employee.getRecievedBadges();
			int temp, points;
			if (star.equals("gold")) {
				temp = recievedBadges.getBadges().getGold();
				recievedBadges.getBadges().setGold(temp + 1);
				points = recievedBadges.getPoints();
				recievedBadges.setPoints(points + 30);
			} else if (star.equals("silver")) {
				temp = recievedBadges.getBadges().getSilver();
				recievedBadges.getBadges().setSilver(temp + 1);
				points = recievedBadges.getPoints();
				recievedBadges.setPoints(points + 20);
			} else {
				temp = recievedBadges.getBadges().getBronze();
				recievedBadges.getBadges().setBronze(temp + 1);
				points = recievedBadges.getPoints();
				recievedBadges.setPoints(points + 10);
				session.update(recievedBadges);
			}
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	@Override
	public void updateGivingBadges(String employeeId, String star) {
		Session session = sessionFactory.openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			@SuppressWarnings("deprecation")
			Criteria criteria = session.createCriteria(Employee.class).add(Restrictions.eq("employeeId", employeeId));
			Employee employee = (Employee) criteria.uniqueResult();
			GivingBadges givingBadges = employee.getGivingBadges();
			int temp;
			if (star.equals("gold")) {

				temp = givingBadges.getBadges().getGold();
				givingBadges.getBadges().setGold(temp - 1);
			} else if (star.equals("silver")) {
				temp = givingBadges.getBadges().getSilver();
				givingBadges.getBadges().setSilver(temp - 1);
			} else {
				temp = givingBadges.getBadges().getBronze();
				givingBadges.getBadges().setBronze(temp - 1);
			}

			session.update(givingBadges);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

	@SuppressWarnings("unchecked")
	public List<Employee> employeeList() {
		List<Employee> emplList = null;
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
			transaction = session.getTransaction();
			@SuppressWarnings("deprecation")
			Criteria criteria = session.createCriteria(Employee.class).createCriteria("recievedBadges")
					.addOrder(org.hibernate.criterion.Order.asc("points"));

			emplList = criteria.list();
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return emplList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<RecievedBadges> getNewerBoardEmployees() {
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		List<RecievedBadges> emplList = null;
		try {
			transaction = session.beginTransaction();
			@SuppressWarnings("deprecation")
			Criteria criteria = session.createCriteria(RecievedBadges.class);
			criteria.addOrder(org.hibernate.criterion.Order.desc("points")).setMaxResults(5);

			emplList = criteria.list();
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return emplList;
	}

	@Override
	public String findEmployeeName(int Id) {

		Employee employee = null;
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		System.out.println(Id + "------employee name id");
		try {
			transaction = session.beginTransaction();
			// System.out.println("hgygf" + criteria.list());
			@SuppressWarnings("deprecation")
			Criteria criteria = session.createCriteria(Employee.class).add(Restrictions.eq("id", Id));
			employee = (Employee) criteria.uniqueResult();
			// session.getTransaction().commit();
			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return employee.getEmployeeName();
	}

	@Override
	public String findEmployeeName(String employeeId) {

		String employeeName = null;
		Session session = sessionFactory.openSession();
		Transaction transaction = null;

		try {
			// System.out.println("employee skdjfhkjshfk" + employeeId);
			transaction = session.beginTransaction();
			@SuppressWarnings("deprecation")
			Criteria criteria = session.createCriteria(Employee.class);
			criteria.add(Restrictions.eq("employeeId", employeeId));

			Employee employee = (Employee) criteria.uniqueResult();
			employeeName = employee.getEmployeeName();
			transaction.commit();
		} catch (Exception e) {
			// if (transaction != null) {
			// transaction.rollback();
			// throw e;
			// }
			e.printStackTrace();
		} finally {
			session.close();
		}
		return employeeName;

	}

	@SuppressWarnings("unchecked")
	public List<RecognizeKarma> getRecognizeKarmaValues() {

		List<RecognizeKarma> recKarma = null;
		Session session = sessionFactory.openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			@SuppressWarnings("deprecation")
			Criteria criteria = session.createCriteria(RecognizeKarma.class);
			criteria.addOrder(Order.desc("date"));
			criteria.setMaxResults(10);
			recKarma = criteria.list();
			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return recKarma;
	}
}
