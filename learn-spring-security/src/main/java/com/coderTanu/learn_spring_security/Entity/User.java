//package com.coderTanu.learn_spring_security.Entity;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.lang.NonNull;
//import org.springframework.stereotype.Indexed;
//
//@Document(collection="users")
//public class User {
//	
//	@Id
//	private Object id;
//	
//	@NonNull
//	@Indexed(unique=true)
//	private String username;
//	
//	@NonNull
//	private String password;
//	
//	@DBRef
//	private List<JournalEntries> journalEntries = new ArrayList<>();
//	
//	private List<String> roles;
//
//	public Object getId() {
//		return id;
//	}
//
//	public void setId(Object id) {
//		this.id = id;
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public List<JournalEntries> getJournalEntries() {
//		return journalEntries;
//	}
//
//	public void setJournalEntries(List<JournalEntries> journalEntries) {
//		this.journalEntries = journalEntries;
//	}
//	public List<String> getRoles() {
//		return roles;
//	}
//
//	public void setRoles(List<String> roles) {
//		this.roles = roles;
//	}
//
//	@Override
//	public String toString() {
//		return "User [id=" + id + ", username=" + username + ", password=" + password + ", journalEntries="
//				+ journalEntries + ", roles=" + roles + "]";
//	}
//
//
//}
