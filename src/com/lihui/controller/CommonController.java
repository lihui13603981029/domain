package com.lihui.controller;

import java.util.Map;

import org.eclipse.jdt.internal.compiler.ast.FalseLiteral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lihui.bean.UserInfo;
import com.lihui.beanvo.Login;
import com.lihui.service.api.IUser;

@Controller
@RequestMapping(value="/common")
public class CommonController {

	@Autowired
	IUser userService;
	/**
	 * 用户登录接口
	 * @param login
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/login",method = RequestMethod.POST)
	@ResponseBody
	public  UserInfo userLogin(@RequestBody Login login)throws Exception {
		
		Boolean isSuccess = this.userService.userLogin(login);
		if (isSuccess == true) {
			
		}
		UserInfo userInfo =  new UserInfo();
		userInfo.setName("李辉");
		userInfo.setId("541210010114");
		return userInfo;
	}
	/**
	 * 用户退出接口
	 * @param name
	 * @return
	 * @throws Exception
	 */
	
	@RequestMapping(value="/out",method = RequestMethod.GET)
	@ResponseBody
	public String loginOut(@RequestParam(value="name") String name) throws Exception{
		
		
		return "success";
	}
	
	
	
}
