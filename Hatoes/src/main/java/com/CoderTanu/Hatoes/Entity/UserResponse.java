package com.CoderTanu.Hatoes.Entity;

public class UserResponse extends HatoesLink{
	
	private String userId;
	private String name;
	private String verifyStatus;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVerifyStatus() {
		return verifyStatus;
	}
	public void setVerifyStatus(String verifyStatus) {
		this.verifyStatus = verifyStatus;
	}
	
	public UserResponse(String userId, String name, String verifyStatus) {
		this.userId = userId;
		this.name = name;
		this.verifyStatus = verifyStatus;
	}
	@Override
	public String toString() {
		return "UserResponse [userId=" + userId + ", name=" + name + ", verifyStatus=" + verifyStatus + "]";
	}

}
