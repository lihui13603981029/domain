package com.lihui.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lihui.beanvo.Login;
import com.lihui.beanvo.UserInfoVo;
import com.lihui.service.api.IUser;
import com.lihui.tools.Result;

import net.sf.json.JSONObject;

@Controller
@RequestMapping(value="/common")
public class CommonController {

	@Autowired
	IUser userService;
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
	@ResponseBody
	public Result userRegister(@RequestBody UserInfoVo userInfoVo,HttpServletRequest request,HttpServletResponse response) {
		Cookie cookie = new Cookie("name",userInfoVo.getName());
		if (request.getCookies() == null) {
			response.addCookie(cookie);
		}
		System.out.println(userInfoVo.getName());
		System.out.println(userInfoVo.getPassWord());
		System.out.println(userInfoVo.getUserNum());
		
		return null;
	}
	
	
	/**
	 * 用户登录接口
	 * @param login
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/login",method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> userLogin(@RequestBody Login login)throws Exception {
		Map<String,Object> map = new HashMap<String,Object>();
		
		Result result = new Result();
		result.setStatus(login.getName());
		
		
		try {
			Boolean isSuccess = this.userService.userLogin(login);
			if (isSuccess) {
				result.setStatus("success");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		map.put("result",result);
		return map;
	}
	/**
	 * 用户退出接口
	 * @param name
	 * @return
	 * @throws Exception
	 */
	
	@RequestMapping(value="/out",method = RequestMethod.GET)
	@ResponseBody
	public String loginOut(@RequestParam(value="name", required = false) String name) throws Exception{
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("result","success");
		System.out.println("get shou dao");
		Result result = new Result();
		result.setStatus("success");
		JSONObject json = JSONObject.fromObject(result);
		
		 String data = json.toString();
		return data;
	}
	
	
	
}
