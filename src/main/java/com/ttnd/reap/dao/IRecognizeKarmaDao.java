package com.ttnd.reap.dao;

import java.util.List;

import com.ttnd.reap.model.RecognizeKarma;

public interface IRecognizeKarmaDao {
	
	public void setRecognizeKarmaInfo(RecognizeKarma record);
	public RecognizeKarma getRecognizeKarmaValues();
	public List<RecognizeKarma> getSearchResults(String empId);

}
