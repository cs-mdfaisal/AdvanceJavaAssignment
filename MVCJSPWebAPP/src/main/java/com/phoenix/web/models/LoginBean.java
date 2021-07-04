package com.phoenix.web.models;
/*
 * @author md.faisal
 * version 1.0
 * creation date - 25-06-2021
 */
// Model-JavaBean Focuses on Business logic in MVC Design pattern

public class LoginBean {
	private String username;
	private String password;
	
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
	
	//Business logic method
	public boolean isValid() {
		if(username!=null && password!=null
				&& username.equals("faisal")
				&& password.equals("123"))
			return true;
		else
			return false;
	}
	
	
}
