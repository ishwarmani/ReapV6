package com.ttnd.reap.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class RecievedBadges {
	@Id
	@GeneratedValue
	private int recBadgeId;
	@Embedded
	private Badges badges;
	private int points;

	public Badges getBadges() {
		return badges;
	}

	public void setBadges(Badges badges) {
		this.badges = badges;
	}

	public int getRecBadgeId() {
		return recBadgeId;
	}

	public void setRecBadgeId(int recBadgeId) {
		this.recBadgeId = recBadgeId;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

}
