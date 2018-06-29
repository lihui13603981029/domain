package com.lihui.service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lihui.bean.CollegeInfo;
import com.lihui.bean.CollegeInfoExample;
import com.lihui.mapper.CollegeInfoMapper;
import com.lihui.service.api.ICollege;

@Service
public class CollegeImpl implements ICollege {

	
	@Autowired 
	CollegeInfoMapper collegeDao;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.collegeDao.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(CollegeInfo record) {
		// TODO Auto-generated method stub
		return this.collegeDao.insert(record);
	}

	@Override
	public int insertSelective(CollegeInfo record) {
		// TODO Auto-generated method stub
		return this.insertSelective(record);
	}

	@Override
	public CollegeInfo selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.collegeDao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(CollegeInfo record) {
		// TODO Auto-generated method stub
		return this.collegeDao.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(CollegeInfo record) {
		// TODO Auto-generated method stub
		return this.collegeDao.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(CollegeInfo record) {
		// TODO Auto-generated method stub
		return this.collegeDao.updateByPrimaryKey(record);
	}

	@Override
	public int countByExample(CollegeInfoExample example) {
		// TODO Auto-generated method stub
		return this.collegeDao.countByExample(example);
	}

	@Override
	public int deleteByExample(CollegeInfoExample example) {
		// TODO Auto-generated method stub
		return this.collegeDao.deleteByExample(example);
	}

	@Override
	public List<CollegeInfo> selectByExampleWithBLOBs(CollegeInfoExample example) {
		// TODO Auto-generated method stub
		return this.collegeDao.selectByExampleWithBLOBs(example);
	}

	@Override
	public List<CollegeInfo> selectByExample(CollegeInfoExample example) {

		List<CollegeInfo> collegeInfos = this.collegeDao.selectByExample(example);
		
		return collegeInfos;
	}

	@Override
	public int updateByExampleSelective(CollegeInfo record, CollegeInfoExample example) {
		// TODO Auto-generated method stub
		return this.collegeDao.updateByExampleSelective(record,example);
	}

	@Override
	public int updateByExampleWithBLOBs(CollegeInfo record, CollegeInfoExample example) {
		// TODO Auto-generated method stub
		return this.collegeDao.updateByExampleWithBLOBs(record,example);
	}

	@Override
	public int updateByExample(CollegeInfo record, CollegeInfoExample example) {
		// TODO Auto-generated method stub
		return this.collegeDao.updateByExample(record,example);
	}
	
	
	
	
	

	
}
