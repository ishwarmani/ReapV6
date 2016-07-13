package com.ttnd.reap.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	
	@Id@GeneratedValue
	private int employeeID;
	private String name;
	private String email;
	//private UserRole userRole;
	private String userRole;
	private String serviceLine;
	private String practice;
	

	private Byte[] image;
	
	public String getPractice() {
		return practice;
	}

	public void setPractice(String practice) {
		this.practice = practice;
	}

	private String password;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
//
//	public GivingKitty getGivingKitty() {
//		return givingKitty;
//	}
//
//	public void setGivingKitty(GivingKitty givingKitty) {
//		this.givingKitty = givingKitty;
//	}
//
//	public RecievedKitty getRecievedKitty() {
//		return recievedKitty;
//	}
//
//	public void setRecievedKitty(RecievedKitty recievedKitty) {
//		this.recievedKitty = recievedKitty;
//	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getServiceLine() {
		return serviceLine;
	}

	public void setServiceLine(String serviceLine) {
		this.serviceLine = serviceLine;
	}

	public Byte[] getImage() {
		return image;
	}

	public void setImage(Byte[] image) {
		this.image = image;
	}

}
