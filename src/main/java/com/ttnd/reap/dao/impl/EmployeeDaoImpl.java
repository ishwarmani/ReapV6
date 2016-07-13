//package com.ttnd.reap.dao.impl;
//
//import java.util.Date;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import com.ttnd.reap.model.Badge;
//import com.ttnd.reap.model.Employee;
//import com.ttnd.reap.model.GivingKitty;
//import com.ttnd.reap.model.Karma;
//import com.ttnd.reap.model.RecievedKitty;
//import com.ttnd.reap.model.UserRole;
//import com.ttnd.reap.model.WallOfFame;
//
//public class EmployeeDaoImpl {
//	public static void main(String[] args) {
//		
//		UserRole userRole = UserRole.USER;
//		
//		Employee employee = new Employee();
//		employee.setName("Raghu");
//		employee.setEmail("raghu@tothenew.com");
//	//	employee.setEmployeeID("IT_16_01");
//		employee.setUserRole("Admin");
//		
//		GivingKitty givingKitty = new GivingKitty();
//		givingKitty.setID(01);
//		givingKitty.setGold(3);
//		givingKitty.setBronze(9);
//		givingKitty.setSilver(6);
//		
//		RecievedKitty recievedKitty = new RecievedKitty();
//		recievedKitty.setEmployeeID(20);
//		recievedKitty.setGold(1);
//		recievedKitty.setBronze(2);
//		recievedKitty.setSilver(3);
//
//		Karma karma = Karma.Extra_Miler;
//		
//		WallOfFame fame = new WallOfFame();
//		fame.setDate(new Date());
//		fame.setKarma(karma);
//		fame.setEmployeeId_Giver("IT_16_01");
//		fame.setEmployeeId_Reciever("IT_16_20");
//		fame.setGiven(Badge.GOLD);
//		fame.setDate(new Date());
//		fame.setReason("Bieng a wonderful colleague");
//		
////		UserRole userRole2 = UserRole.SUPERVISER;
//		
////		Employee employee2 = new Employee();
////		employee2.setName("Rahul");
////		employee2.setEmail("rahul@tothenew.com");
////		employee2.setEmployeeID("02");
////		employee2.setUserRole(userRole2);
////		
////		GivingKitty givingKitty2 = new GivingKitty();
////		givingKitty2.setEmployeeID("IT_16_03");
////		givingKitty2.setGold(3);
////		givingKitty2.setBronze(9);
////		givingKitty2.setSilver(6);
////		
////		RecievedKitty recievedKitty2 = new RecievedKitty();
////		recievedKitty2.setEmployeeID("IT_16_21");
////		recievedKitty2.setGold(1);
////		recievedKitty2.setBronze(2);
////		recievedKitty2.setSilver(3);
//
////		Karma karma2 = Karma.Mentorship;
////		
////		WallOfFame fame2 = new WallOfFame();
////		fame2.setDate(new Date());
////		fame2.setKarma(karma2);
////		fame2.setEmployeeId_Giver("IT_16_03");
////		fame2.setEmployeeId_Reciever("IT_16_21");
////		fame2.setGiven(Badge.BRONZE);
////		fame2.setDate(new Date());
////		fame2.setReason("Bieng a wonderful mentor");
//
//		
//		
//		Configuration configuration = new Configuration();
//		@SuppressWarnings("deprecation")
//		SessionFactory factory = configuration.configure().buildSessionFactory();
//		Session session = factory.openSession();
//		session.beginTransaction();
//
//		session.save(employee);
//		session.save(givingKitty);
//		session.save(recievedKitty);
////		session.save(fame);
//		
////		session.save(employee2);
////		session.save(givingKitty2);
////		session.save(recievedKitty2);
////		session.save(fame2);
//
//		session.getTransaction().commit();
//		session.close();
//	}
//}
