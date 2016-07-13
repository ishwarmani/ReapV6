package com.ttnd.reap.model;

public enum Karma {
	
	Extra_Miler,
	Knowledge_Sharing,
	Mentorship,
	Pat_on_the_back,
	Customer_Delight;
	
	private String karma;
	
	private Karma() {
		
	}
	
	private Karma(String karma) {
		this.karma = karma;
	}
	
	public String getKarma() {
		return karma;
	}
	
	public void setKarma(String karma) {
		this.karma = karma;
	}
	
	
}
