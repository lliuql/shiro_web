package com.liu.shiro.service;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.session.Session;

import java.util.Date;

/**
 * @Auther: 刘清海
 * @Date: 19-02-16 10:28
 * @Description:
 */
public class ShiroService {

	@RequiresRoles({"admin"})
	public void testMethod(){
		System.out.println("testMethod, time: " + new Date());

		Session session = SecurityUtils.getSubject().getSession();
		Object val = session.getAttribute("key");

		System.out.println("Service SessionVal: " + val);
	}

}
