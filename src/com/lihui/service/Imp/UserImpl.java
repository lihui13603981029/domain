package com.lihui.service.Imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lihui.bean.UserInfo;
import com.lihui.beanvo.Login;
import com.lihui.mapper.UserInfoMapper;
import com.lihui.service.api.IUser;

@Service
public class UserImpl implements IUser {

	@Autowired
	UserInfoMapper userDao;
	
	@Override
	public Boolean userLogin(Login login) {
		UserInfo userInfo = this.userDao.selectByPrimaryKey(login.getName());
		
		return false;
	}

	@Override
	public UserInfo findUserInfoBy(String id) {
		
		return this.userDao.selectByPrimaryKey(id);
	}

	@Override
	public boolean addUserInfo(UserInfo userInfo) {
		int result = userDao.insert(userInfo);
		if(result == 0) {
			return false;
		}
		return true;
	}

	

}
