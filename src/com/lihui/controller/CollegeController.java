package com.lihui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lihui.bean.CollegeInfo;
import com.lihui.bean.CollegeInfoExample;
import com.lihui.service.api.ICollege;
import com.lihui.tools.Result;

import net.sf.json.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.List;

@Controller
@RequestMapping(value="/college")
public class CollegeController {

	@Autowired
	ICollege collegeService;
	
	
	@RequestMapping(value="/input",method = RequestMethod.POST)
	@ResponseBody
	public Result addCollegeMessage(@RequestParam(value="name") String name,
			@RequestParam(value="creatTime") String creatTime,
			@RequestParam(value="introduce") String introduce) throws Exception{
		
		Result result = new Result();
		try {
			CollegeInfo collegeInfo = new CollegeInfo();
			collegeInfo.setName(name);
			collegeInfo.setIntroduce(introduce);
			this.collegeService.insertSelective(collegeInfo);
			result.setStatus("success");
		} catch (Exception e) {
			// TODO: handle exception
			result.setStatus("error");
			System.out.println(e);
		}
		return result;
	}
	@RequestMapping(value="/collegeList")
	@ResponseBody
	public Result getCollegeMessage()throws Exception {
		System.out.println("shoudao");
		Result result = new Result();
		
		try {
			CollegeInfoExample example = new CollegeInfoExample();
			example.or();
			List<CollegeInfo> collegeInfos = this.collegeService.selectByExample(example);
			System.out.println();
			result.setMsg(JSONArray.fromObject(collegeInfos));
			result.setStatus("success");
			result.setStatusCode("200");
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		
		return result;
	}
	
}
