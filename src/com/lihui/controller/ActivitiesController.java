package com.lihui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lihui.bean.ActivitiesInfo;
import com.lihui.service.api.IActivity;
import com.lihui.tools.Result;

import net.sf.json.JSON;
import net.sf.json.JSONObject;

import java.util.List;
@Controller
@RequestMapping(value="/activities")
public class ActivitiesController {
	
	@Autowired
	
	IActivity activityService;
	
	@RequestMapping(value="/allMsg",method=RequestMethod.GET)
	@ResponseBody
	public Result findAllActivitiesMsg() {
		List<ActivitiesInfo> activitiesInfos = this.activityService.selectAllExample();
		Result result = new Result();
		if (activitiesInfos != null) {
			JSON json = JSONObject.fromObject(activitiesInfos);
			result.setStatus("sucess");
			result.setStatusCode("200");
		}else{
			result.setStatus("error");
		}
		
		return result;
	}

	
	@RequestMapping(value="/detail",method= RequestMethod.GET)
	@ResponseBody
	public Result getDetailActivity(@RequestParam() Integer id){
		Result result = new Result();
		
		
		return null;
	}
	
}
