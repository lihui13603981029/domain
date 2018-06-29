package com.lihui.service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lihui.bean.ActivitiesInfo;
import com.lihui.bean.ActivitiesInfoExample;
import com.lihui.mapper.ActivitiesInfoMapper;
import com.lihui.service.api.IActivity;

@Service
public class ActivityImpl implements IActivity {

	@Autowired
	ActivitiesInfoMapper activityDao;
	
	@Override
	public int countByExample(ActivitiesInfoExample example) {
		// TODO Auto-generated method stub
		try {
			return this.activityDao.countByExample(example);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ActivityImpl"+e);
		}
		return 0;
	}

	@Override
	public int deleteByExample(ActivitiesInfoExample example) {
		// TODO Auto-generated method stub
		try {
			return this.activityDao.deleteByExample(example);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ActivityImpl"+e);
		}
		return 0;
	}

	@Override
	public int insert(ActivitiesInfo record) {
		// TODO Auto-generated method stub
		try {
			return this.activityDao.insert(record);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ActivityImpl"+e);
		}
		return 0;
	}

	@Override
	public int insertSelective(ActivitiesInfo record) {
		// TODO Auto-generated method stub
		try {
			return this.activityDao.insertSelective(record);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ActivityImpl"+e);
		}
		return 0;
	}

	@Override
	public List<ActivitiesInfo> selectByExampleWithBLOBs(ActivitiesInfoExample example) {
		// TODO Auto-generated method stub
		try {
			return this.activityDao.selectByExampleWithBLOBs(example);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ActivityImpl"+e);
		}
		return null;
	}

	@Override
	public List<ActivitiesInfo> selectByExample(ActivitiesInfoExample example) {
		// TODO Auto-generated method stub
		try {
			return this.activityDao.selectByExample(example);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ActivityImpl"+e);
		}
		return null;
	}

	@Override
	public int updateByExampleSelective(ActivitiesInfo record, ActivitiesInfoExample example) {
		// TODO Auto-generated method stub
		try {
			return this.activityDao.updateByExampleSelective(record,example);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ActivityImpl"+e);
		}
		return 0;
	}
	@Override
	public int updateByExampleWithBLOBs(ActivitiesInfo record, ActivitiesInfoExample example) {
		// TODO Auto-generated method stub
		try {
			return this.activityDao.updateByExampleWithBLOBs(record,example);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ActivityImpl"+e);
		}
		return 0;
	}

	@Override
	public int updateByExample(ActivitiesInfo record, ActivitiesInfoExample example) {
		// TODO Auto-generated method stub
		try {
			return this.activityDao.updateByExample(record,example);	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ActivityImpl"+e);
		}
		return 0;
	}

	@Override
	public List<ActivitiesInfo> selectAllExample() {
		// TODO Auto-generated method stub
		ActivitiesInfoExample example = new ActivitiesInfoExample();
		example.or();
		return this.activityDao.selectByExample(example);
	}

}
