package com.lihui.beanvo;

import java.util.Date;

import com.lihui.bean.UserInfo;

public class UserInfoVo {
	
	private UserInfo userInfo;
    
    
	private String status;
	
	private String resultMsg;


	public UserInfo getUserInfo() {
		return userInfo;
	}


	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}


	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}


	public String getResultMsg() {
		return resultMsg;
	}


	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	
	
    
}
