package com.timmy.structs;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.timmy.entity.User;

public class UserAction extends ActionSupport implements ModelDriven<User> {

	//驱动模型
	private User user=new User();
	
	@Override
	public String execute() throws Exception {
		System.out.println(user);
		return SUCCESS;
	}

	@Override
	public User getModel() {
		return user;
	}
	

}
