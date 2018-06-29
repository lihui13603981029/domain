package com.lihui.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lihui.bean.UserInfo;
import com.lihui.beanvo.UserInfoVo;
import com.lihui.service.api.IUser;
import com.lihui.tools.Result;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	IUser userService;
	
	@RequestMapping(value="/userInfo" ,method = RequestMethod.POST)
	@ResponseBody
	public String sendUserInfo(@RequestBody List<UserInfo> userInfos) {
		try {
			for(UserInfo userInfo:userInfos) {
				System.out.println(userInfo.getName());
				userInfo.setAlias(userInfo.getName());
				userInfo.setCollegeId(1);
				userInfo.setMajorId(1);
				userInfo.setCreateTime(new Date());
				boolean result = userService.addUserInfo(userInfo);
			}
			
		} catch (Exception e) {
			System.out.println(e);

		}
		return "success";
	}
	
	@RequestMapping(value="userMeg" , method= RequestMethod.GET)
	@ResponseBody
	public Result getUserInfo(@RequestParam(value="id" )String id) throws Exception {
		
		try {
		 
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("return userInfo error");
		}
		
		return null;
	}

	@RequestMapping(value="image", method=RequestMethod.POST)
	public void updataUserImage() throws Exception{
		
	}
}
