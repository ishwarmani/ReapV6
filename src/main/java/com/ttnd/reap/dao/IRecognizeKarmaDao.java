package com.ttnd.reap.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.Restrictions;

import com.ttnd.reap.model.RecognizeKarma;

public interface IRecognizeKarmaDao {
	
	
	public void setRecognizeKarma(RecognizeKarma record);
	
	public List<RecognizeKarma> getSearchResults(String input);

	public List<RecognizeKarma> getRecognizeKarmaValues();

}
