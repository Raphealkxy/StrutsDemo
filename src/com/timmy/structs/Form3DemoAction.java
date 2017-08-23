package com.timmy.structs;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.timmy.entity.User;

public class Form3DemoAction extends ActionSupport implements ServletRequestAware{

	private HttpServletRequest request;
	@Override
	public void setServletRequest(HttpServletRequest request) {
             		this.request=request;
	}
	@Override
	public String execute() throws Exception {
		String username=(String) request.getAttribute("username");
		String password=(String)request.getAttribute("password");
		String Email=(String) request.getAttribute("Email");
		User user=new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(Email);
		System.out.println(user);
		return SUCCESS;
	}
	

}
