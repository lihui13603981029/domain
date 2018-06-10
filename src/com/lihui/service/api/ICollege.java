package com.lihui.service.api;

import com.lihui.bean.CollegeInfo;

public interface ICollege {

	CollegeInfo getCollegeInfoById(Integer id);
	
	CollegeInfo getCollegeInfoByName(String name);
}
