package com.lihui.controller;

import java.util.Date;
import java.util.List;

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

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	IUser userService;
	
	@RequestMapping(value="/userInfo" ,method = RequestMethod.POST)
	@ResponseBody
	public String sendUserInfo( @RequestParam(value="dataJson") @RequestBody List<UserInfo> userInfos) {
		try {
			System.out.println("成功");
			for(UserInfo userInfo:userInfos) {
				userInfo.setAlias(userInfo.getName());
				userInfo.setCollegeId(1);
				userInfo.setMajorId(1);
				userInfo.setCreateTime(new Date());
				boolean result = userService.addUserInfo(userInfo);
				if(result) {
					return "success";
				}
			}
			
		} catch (Exception e) {

		}
		return "error";
	}
	
	@RequestMapping(value="userMeg" , method= RequestMethod.GET)
	@ResponseBody
	public UserInfoVo getUserInfo(@RequestParam(value="id" )String id) throws Exception {
		UserInfoVo userInfoVo = new UserInfoVo();
		
		try {
			if (id == "" || id == null) {
				userInfoVo.setStatus("4001");
				userInfoVo.setResultMsg("id 不能为空");
				return userInfoVo;
			}
		 UserInfo userInfo =	userService.findUserInfoBy(id);
		 
		 userInfoVo.setUserInfo(userInfo);
		 userInfoVo.setStatus("200");
		 userInfoVo.setResultMsg("success");
		 return userInfoVo;
		 
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("return userInfo error");
		}
		
		return null;
	}

}
