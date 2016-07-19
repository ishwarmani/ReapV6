package com.ttnd.reap.service;

import java.util.List;

import com.ttnd.reap.model.RecognizeKarma;

public interface IRecognizeKarmaService {
	
	public void setRecognizeKarma(RecognizeKarma record);
	public List<RecognizeKarma> getRecognizeKarmaValues();
	public List<RecognizeKarma> getSearchResults(String empId);
	
}
