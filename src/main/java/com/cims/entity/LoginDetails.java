package com.cims.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="LOGIN_DEMO")
public class LoginDetails {
	
	@Id
	@Column(name="EMPID")
	private String userId;
	@Column(name="PASSWORD")
	private String password;
	@Column(name="STATUS")
	private String status;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "LoginDetails [userId=" + userId + ", password=" + password + ", status=" + status + "]";
	}
	public LoginDetails(String userId, String password, String status) {
		super();
		this.userId = userId;
		this.password = password;
		this.status = status;
	}
	public LoginDetails() {
		
	}
	
	
	
	
	
	

}
