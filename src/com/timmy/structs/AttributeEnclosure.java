package com.timmy.structs;

import com.opensymphony.xwork2.ActionSupport;
import com.timmy.entity.User;

public class AttributeEnclosure extends ActionSupport{
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
	public String execute() throws Exception {
		User user=new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(Email);
		System.out.println(user);
		return SUCCESS;
	}
	
	

}
