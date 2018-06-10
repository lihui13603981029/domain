package com.lihui.service.api;


import com.lihui.bean.UserInfo;
import com.lihui.beanvo.Login;


public interface IUser {

	Boolean userLogin(Login login);
	
	UserInfo findUserInfoBy(String id);
	
	boolean addUserInfo(UserInfo userInfo);
		
	
}
