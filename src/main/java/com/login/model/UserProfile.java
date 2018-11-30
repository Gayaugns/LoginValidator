package com.login.model;

import org.hibernate.validator.constraints.NotEmpty;

public class UserProfile 
{
	@NotEmpty
	public String userId;
	@NotEmpty
	public String password;
	
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
	
}
