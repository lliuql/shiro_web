package com.liu.shiro.factory;

import java.util.LinkedHashMap;

/**
 * @Auther: 刘清海
 * @Date: 19-02-16 10:13
 * @Description:
 */

public class  FilterChainDefinitionMapBuilder{
	public LinkedHashMap buildFilterChainDefinitionMap() {
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("/login.jsp", "anon");
		map.put("/shiro/login ", "anon");
		map.put("/shiro/logout ", "logout");
		map.put("/user.jsp ", "authc,roles[user]");
		map.put("/admin.jsp ", "authc,roles[admin]");
		map.put("/list.jsp", "user");

		map.put("/** ", "authc");
		return map;
	}
}
