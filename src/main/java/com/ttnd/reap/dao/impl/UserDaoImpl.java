package com.ttnd.reap.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ttnd.reap.dao.UserDao;
import com.ttnd.reap.model.Employee;
import com.ttnd.reap.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	public UserDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public User findById(Integer id) {

		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();

		Criteria criteria = session.createCriteria(User.class).add(Restrictions.eq("id", id));

		List<User> l = criteria.list();
		User user = l.get(0);
		trans.commit();
		session.close();
		return user;
	}

	@Override
	public void save(User user) {
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
//		System.out.println(sessionFactory.getCurrentSession() + "IShwar");
		session.save(user);

		trans.commit();
		session.close();
	}

	@Override
	public void saveEmpl(Employee employee) {
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
//		System.out.println(sessionFactory.getCurrentSession() + "IShwar");
		session.save(employee);

		trans.commit();
		session.close();
		
	}

	@Override
	public Employee findEmplById(String email,String password) {
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();

		Criteria criteria = session.createCriteria(Employee.class).
				add(Restrictions.eq("email", email)).
				add(Restrictions.eq("password", password));

		Employee employee = (Employee) criteria.uniqueResult();
		
		trans.commit();
		session.close();
		return employee;
		
	}

}
