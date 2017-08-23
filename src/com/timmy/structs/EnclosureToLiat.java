package com.timmy.structs;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.timmy.entity.User;

public class EnclosureToLiat extends ActionSupport {
	private List<User> list;

	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}

	@Override
	public String execute() throws Exception {
		for(User user:list)
		{
			System.out.println(user);
		}
		return "success";
	}
	

}
