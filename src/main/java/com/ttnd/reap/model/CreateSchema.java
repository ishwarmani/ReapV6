package com.ttnd.reap.model;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.ttnd.reap.enums.Karma;

public class CreateSchema {

	public static void main(String[] args) {
		
		Employee emp= new Employee();
		emp.setEmployeeId("INT-16/22");
		emp.setDateOfJoining(new Date());
		emp.setEmail("Arpit.Sohar@tothenew.com");
		emp.setUserRole("USER");
		emp.setPassword("123");
		
		emp.setServiceLine("TTND-INTERN");
		emp.setId(1);
		
		
		Employee emp2= new Employee();
		emp2.setEmployeeId("ABC-16/23");
		emp2.setEmployeeName("BABA");
		emp2.setDateOfJoining(new Date());
		emp2.setEmail("Sumit.Singh@tothenew.com");
		emp2.setUserRole("USER");
		emp2.setServiceLine("TTND-INTERN");
		emp2.setPassword("123");
		
		Employee emp3= new Employee();
		emp3.setEmployeeId("INT-16/24");
		emp3.setDateOfJoining(new Date());
		emp3.setEmail("Itika.Tyagi@tothenew.com");
		emp3.setUserRole("USER");
		emp3.setServiceLine("TTND-INTERN");
	
		Badges badges = new Badges();
		
		badges.setGold(2);
		badges.setSilver(3);
		badges.setBronze(4);
		
		GivingBadges bpr= new GivingBadges();
		bpr.setBadges(badges);
		//bpr.setEmployeeId("INT-16/22");
		emp.setGivingBadges(bpr);
		emp2.setGivingBadges(bpr);
		
		
		Badges badg = new Badges();
		badg.setBronze(2);
		RecievedBadges bpr2= new RecievedBadges();
		bpr2.setBadges(badg);
		//.setBadgesRecieved(bpr2);
	
		
		/*bpr.setEmployeeId("INT-16/22");
		bpr.setBronzeBadges(1);
		bpr.setSilverBadges(2);
		bpr.setGoldBadges(3);

		BadgesRecords bpr2= new BadgesRecords();
		bpr2.setEmployeeId("INT-16/23");
		bpr2.setBronzeBadges(1);
		bpr2.setSilverBadges(2);
		bpr2.setGoldBadges(3);

		BadgesRecords bpr3= new BadgesRecords();
		bpr3.setEmployeeId("INT-16/25");
		bpr3.setBronzeBadges(1);
		bpr3.setSilverBadges(2);
		bpr3.setGoldBadges(3);*/
		
		emp.setGivingBadges(bpr);
		/*emp2.setRecords(bpr2);
		emp3.setRecords(bpr3);*/
		
		RecognizeKarma rec = new RecognizeKarma();
		rec.setSenderId("INT-16/22");
		rec.setRecieverId("INT-16/23");
	//	rec.setKarma(Karma.Knowledge_Sharing);
		rec.setKarma("mentorship");
		rec.setDate(new Date());
		rec.setMessage("Message");
		rec.setStar("Bronze");
		
		
		
		RecievedBadges br= new RecievedBadges();
		//br.setEmployeeId("INT-16/22");
		br.setBadges(badg);
		
		RecievedBadges br2= new RecievedBadges();
	//	br2.setEmployeeId("INT-16/23");
		br2.setBadges(badg);
		
		RecievedBadges br3= new RecievedBadges();
	//	br3.setEmployeeId("INT-16/24");
		br3.setBadges(badg);
		
		SessionFactory sessionFactory =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	 	Session session =sessionFactory.openSession();
		session.beginTransaction();
		session.save(emp);
		session.save(emp2);
		session.save(emp3);
		//session.save(badges);
		session.save(bpr);
		/*session.save(bpr2);
		session.save(bpr3);*/
		session.save(rec);
		
		session.save(br);
		//session.save(br2);
		session.save(br3);
		
		
		session.getTransaction().commit();	
		session.close();
		Session session2 =sessionFactory.openSession();
		session2.beginTransaction();
		
//		Criteria criteria =  session2.createCriteria(Employee.class);
//		//criteria.add(Restrictions.eq("employeeId", "INT-16/24"));
//		criteria.add(Restrictions.ilike("employeeId", "%INT%"));
//		List<Employee> em =  criteria.list();
//		System.out.println(em);
//		 Employee employee= em.get(0);
		 
			/*for (Iterator iterator = 
	                em.iterator(); 
					iterator.hasNext();){
	  employee = (Employee) iterator.next();
			}*/
//		System.out.println(employee.getEmployeeName()+employee.getEmployeeId()+employee.getEmail()+employee.getUserRole()
//	+employee);
		session2.getTransaction().commit();
	
		session2.close();
		

	}

}
