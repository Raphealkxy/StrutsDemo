package com.timmy.structs;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import com.timmy.entity.User;

public class valueStack  extends ActionSupport{

	private String eidtorName;
	public String getEidtorName() {
		return eidtorName;
	}

	private User user=new User();
	private User user1=new User();
	public User getUser1() {
		return user1;
	}


	public User getUser() {
		return user;
	}
	
	private List<User>list=new ArrayList<User>();
	

	public List<User> getList() {
		return list;
	}

	
	@Override
	public String execute() throws Exception {
		ActionContext context=ActionContext.getContext();
		ValueStack stack=context.getValueStack();
		stack.push("abcd");
		stack.push("aaaa");
		stack.set("username", "itcastitheima");

		return SUCCESS;
	}
	
	public String addObject()
	{
		this.eidtorName="12222";
		user.setEmail("1277609958@qq.com");
		user.setPassword("122345");
		user.setUsername("kxy");
		
		user1.setEmail("1371014802@qq.com");
		user1.setPassword("12344");
		user1.setUsername("1233");
		
		list.add(user);
		list.add(user1);
		return SUCCESS;
	}
   
	
	
	
	
}
