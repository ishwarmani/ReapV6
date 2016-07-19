package com.ttnd.reap.dao.util;

import com.ttnd.reap.model.Badges;

public class NewerBoard {
	private String name;
	private int points;
	private Badges badges;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public Badges getBadges() {
		return badges;
	}

	public void setBadges(Badges badges) {
		this.badges = badges;
	}

}
