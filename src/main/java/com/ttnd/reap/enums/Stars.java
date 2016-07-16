package com.ttnd.reap.enums;

public enum Stars {
	
	user(3,2,1),superviser(6,3,1),practiceHead(9,6,3);
	
	private int gold;
	private int silver;
	private int bronze;
	private Stars(int gold,int silver,int bronze) {
		this.gold = gold;
		this.silver=silver;
		this.bronze=bronze;
	}
	
	public int getGold() {
		return gold;
	}
	
	public int getSilver() {
		return silver;
	}
	
	public int getBronze() {
		return bronze;
	}
}
