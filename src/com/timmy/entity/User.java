package com.timmy.entity;

public class User {
	private String username;
	private String password;
	private String Email;
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
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public String toString() {
		return "username:"+username+"::"+"password:"+password+"::"+"Email:"+Email+";";
	}
	
	

}
