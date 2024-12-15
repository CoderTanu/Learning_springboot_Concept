package com.CoderTanu.Entity;

import lombok.Data;

public class User {
	
	private Long id;
	private String name;
	public long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public User(Long id, String name) {
		this.id = id;
		this.name = name;
	}
}
