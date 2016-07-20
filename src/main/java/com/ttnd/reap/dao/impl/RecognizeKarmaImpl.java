package com.ttnd.reap.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ttnd.reap.dao.IRecognizeKarmaDao;
import com.ttnd.reap.model.RecognizeKarma;

@Repository
public class RecognizeKarmaImpl implements IRecognizeKarmaDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public RecognizeKarmaImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void setRecognizeKarma(RecognizeKarma record) {
		
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
			transaction= session.beginTransaction();
			record.setDate(new Date());
			session.save(record);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
	}

	
	public List<RecognizeKarma> getSearchResults(String input){
		Session session = sessionFactory.openSession();
	//	Session session = ConnectionProvider.getSession();
		@SuppressWarnings("deprecation")
		Criteria criteria= session.createCriteria(RecognizeKarma.class);
		/*criteria.add(Restrictions.or(Restrictions.ilike("employeeId_Sender", "%"+input+"%"))
				.add(Restrictions.ilike("employeeId_Reciever","%"+input+"%"))
				.add(Restrictions.ilike("Reason", "%"+input+"%")));*/
		Criterion sender = Restrictions.ilike("employeeId_Sender", "%"+input+"%");
		Criterion reciever = Restrictions.ilike("employeeId_Reciever","%"+input+"%");
		Criterion reason = Restrictions.ilike("Reason", "%"+input+"%");
		Disjunction dj = Restrictions.disjunction();
		dj.add(sender);
		dj.add(reciever);
		dj.add(reason);
		criteria.add(dj);
		
		List<RecognizeKarma> rec = criteria.list();
			
		return rec;
		
	}

	@Override
	public List<RecognizeKarma> getRecognizeKarmaValues() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
