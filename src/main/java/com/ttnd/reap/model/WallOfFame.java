package com.ttnd.reap.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class WallOfFame {
	@Id@GeneratedValue
	private int id;

	private String employeeId_Giver;
	private String employeeId_Reciever;
	@Lob
	private String Reason;
	
	@Enumerated(EnumType.STRING)
	private Karma karma;
	private Date date;
	@Enumerated(EnumType.STRING)
	private Badge given;

	public String getEmployeeId_Giver() {
		return employeeId_Giver;
	}

	public void setEmployeeId_Giver(String employeeId_Giver) {
		this.employeeId_Giver = employeeId_Giver;
	}

	public String getEmployeeId_Reciever() {
		return employeeId_Reciever;
	}

	public void setEmployeeId_Reciever(String employeeId_Reciever) {
		this.employeeId_Reciever = employeeId_Reciever;
	}

	public String getReason() {
		return Reason;
	}

	public void setReason(String reason) {
		Reason = reason;
	}

	public Karma getKarma() {
		return karma;
	}

	public void setKarma(Karma karma) {
		this.karma = karma;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Badge getGiven() {
		return given;
	}

	public void setGiven(Badge given) {
		this.given = given;
	}

}
