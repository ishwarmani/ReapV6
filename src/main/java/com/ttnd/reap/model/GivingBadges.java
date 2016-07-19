package com.ttnd.reap.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GivingBadges {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int givBadgeId;

	@Embedded
	private Badges badges;

	public Badges getBadges() {
		return badges;
	}

	public void setBadges(Badges badges) {
		this.badges = badges;
	}

	public int getGivBadgeId() {
		return givBadgeId;
	}

	public void setGivBadgeId(int givBadgeId) {
		this.givBadgeId = givBadgeId;
	}

}
