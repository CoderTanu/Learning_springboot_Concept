package com.coderTanu.CMS.app.Entity;

public class UserRegistration {

	private String emailId;
	private String username;
	private String password;
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "UserRegistration [emailId=" + emailId + ", username=" + username + ", password=" + password + "]";
	}
}
