package com.lihui.service.Imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lihui.bean.CollegeInfo;
import com.lihui.mapper.CollegeInfoMapper;
import com.lihui.service.api.ICollege;

@Service
public class CollegeImpl implements ICollege {

	
	@Autowired 
	CollegeInfoMapper collegeDao;
	
	
	@Override
	public CollegeInfo getCollegeInfoById(Integer id) {
		// TODO Auto-generated method stub
		return this.collegeDao.selectByPrimaryKey(id);
	}

	@Override
	public CollegeInfo getCollegeInfoByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
}
