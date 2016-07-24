package com.ttnd.reap.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ttnd.reap.dao.IAdminDao;
import com.ttnd.reap.enums.Stars;
import com.ttnd.reap.model.Badges;
import com.ttnd.reap.model.Employee;
import com.ttnd.reap.model.GivingBadges;
import com.ttnd.reap.model.RecievedBadges;

@Repository
public class AdminDaoImpl implements IAdminDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public boolean updateRole(String newerId, String role) {
		Session session = sessionFactory.openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			@SuppressWarnings("deprecation")
			Criteria criteria = session.createCriteria(Employee.class).add(Restrictions.eq("employeeId", newerId));
			Employee employee = (Employee) criteria.uniqueResult();
			GivingBadges badges = employee.getGivingBadges();
			
			if(role.equals("Superviser")){
				badges.getBadges().setGold(Stars.superviser.getGold());
				badges.getBadges().setSilver(Stars.superviser.getSilver());
				badges.getBadges().setBronze(Stars.superviser.getBronze());
			}
			else if(role.equals("Practice Head")){
				badges.getBadges().setGold(Stars.practiceHead.getGold());
				badges.getBadges().setSilver(Stars.practiceHead.getSilver());
				badges.getBadges().setBronze(Stars.practiceHead.getBronze());
			}
			session.update(badges);
			employee.setUserRole(role);
			session.update(employee);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			session.close();
		}
		return true;
	}
//	@Override
//	public boolean updateRole(String newerId, String role) {
//		System.out.println("newer is" + newerId );
//		System.out.println("role is " + role);
//		Employee employee = null;
//		GivingBadges records = updateBadgesRecord(role);
//		Session session = sessionFactory.openSession();
//		Transaction transaction = null;
//		try {
//			transaction = session.beginTransaction();
//			
//			@SuppressWarnings("deprecation")
//			Criteria criteria = session.createCriteria(Employee.class).add(Restrictions.eq("employeeId", newerId));
//			employee = (Employee) criteria.uniqueResult();
//			employee.setUserRole(role);
//			session.update(records);
//			System.out.println(records);
//			session.update(employee);
//			transaction.commit();
//		} catch (Exception e) {
//			e.printStackTrace();
//			return false;
//		} finally {
//			session.close();
//		}
//		
//		return true;
//	}
//	
//	public GivingBadges updateBadgesRecord(String role) {
//
//		Badges badges = new Badges();
//		GivingBadges badgesRecords = new GivingBadges();
//		if(role.equals("Superviser")){
//			badges.setGold(Stars.superviser.getGold());
//			badges.setSilver(Stars.superviser.getSilver());
//			badges.setBronze(Stars.superviser.getBronze());
//		}
//		else if(role.equals("Practice Head")){
//			badges.setGold(Stars.practiceHead.getGold());
//			badges.setSilver(Stars.practiceHead.getSilver());
//			badges.setBronze(Stars.practiceHead.getBronze());
//		}
//		
//		badgesRecords.setBadges(badges);
//		return badgesRecords;
//	}
//	
//	


	
}
