package com.timmy.structs;

import com.opensymphony.xwork2.ActionSupport;
import com.timmy.entity.User;

public class fieldModel extends ActionSupport{

	@Override
	public String execute() throws Exception {
		System.out.println(user);
		return "ok";
	}

	//域模型
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
