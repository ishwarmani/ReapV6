package com.ttnd.reap.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Type;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String employeeId;
	private String employeeName;
	private String email;
	private String userRole;
	private String serviceLine;
	private Date dateOfJoining;
	private String practice;
	private String password;
	private Byte[] image;
	@Type(type = "yes_no")
	private Boolean flag;

	@OneToOne // (cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name = "RemainingBadges")
	private GivingBadges givingBadges;// badgesAvailabe

	@OneToOne // (cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name = "RecievedBadges")
	private RecievedBadges recievedBadges;

	public Boolean getFlag() {
		return flag;
	}

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPractice() {
		return practice;
	}

	public void setPractice(String practice) {
		this.practice = practice;
	}

	public Byte[] getImage() {
		return image;
	}

	public void setImage(Byte[] image) {
		this.image = image;
	}

	public GivingBadges getGivingBadges() {
		return givingBadges;
	}

	public void setGivingBadges(GivingBadges givingBadges) {
		this.givingBadges = givingBadges;
	}

	public RecievedBadges getRecievedBadges() {
		return recievedBadges;
	}

	public void setRecievedBadges(RecievedBadges recievedBadges) {
		this.recievedBadges = recievedBadges;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
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
}
