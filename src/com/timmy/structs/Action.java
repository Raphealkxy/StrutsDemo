package com.timmy.structs;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.timmy.entity.User;

public class Action extends ActionSupport{

	@Override
	public String execute() throws Exception {
		//利用SevletAction获取表单数据
		 HttpServletRequest  request=ServletActionContext.getRequest();
		 String username=request.getParameter("username");
		 String password=request.getParameter("password");
		 String Email=request.getParameter("Email");
		 User user=new User();
		 user.setEmail("1277609958@qq.com");
		 user.setPassword("123456");
		 user.setUsername("12345");
		 System.out.println(user);
		return "ok";
	}
	public String getContentByActionContext()
	{
		//利用actioncontext来获取表单数据
		ActionContext context=ActionContext.getContext();
		Map<String, Object>map=context.getParameters();
		Set<String>keys=map.keySet();
		for(String key:keys)
		{
			Object []objects=(Object[]) map.get(key);
			
			System.out.println(Arrays.toString(objects));
		}
		return "actioncontent";
	}
	public String Originrequest()
	{
		
		return "ok";
	}


	
	
}
