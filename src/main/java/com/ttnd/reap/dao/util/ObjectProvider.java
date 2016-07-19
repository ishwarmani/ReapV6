package com.ttnd.reap.dao.util;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ttnd.reap.model.Employee;


@Component
public class ObjectProvider {

	@Autowired
	private static SessionFactory sessionFactory;
	public static Employee getEmployee(String employeeId){
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		@SuppressWarnings("deprecation")
		Criteria criteria = session.createCriteria(Employee.class);
	criteria.add(Restrictions.eq("employeeID", employeeId));
	Employee employee = (Employee) criteria.uniqueResult();
	
		return employee;
		
	}
}
