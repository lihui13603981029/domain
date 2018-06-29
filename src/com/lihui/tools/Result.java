package com.lihui.tools;

import com.lihui.bean.UserInfo;

import net.sf.json.JSON;

public class Result {

	private String status;
	
	private String statusCode;
	
	private JSON msg;
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public JSON getMsg() {
		return msg;
	}

	public void setMsg(JSON msg) {
		this.msg = msg;
	}

	

	
	
}
