package com.timmy.structs;

import java.util.Map;
import java.util.Set;

import com.opensymphony.xwork2.ActionSupport;
import com.timmy.entity.User;

public class EnclosureToMap extends ActionSupport{
	private Map<String, User> map;

	public Map<String, User> getMap() {
		return map;
	}

	public void setMap(Map<String, User> map) {
		this.map = map;
	}

	@Override
	public String execute() throws Exception {
		Set<String> set=map.keySet();
		for(String key:set)
		{
			User user=map.get(key);
			System.out.println(user);
		}
		return SUCCESS;
	}
	
	

}
