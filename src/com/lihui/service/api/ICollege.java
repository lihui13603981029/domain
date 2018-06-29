package com.lihui.service.api;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lihui.bean.CollegeInfo;
import com.lihui.bean.CollegeInfoExample;

public interface ICollege {
	
    int countByExample(CollegeInfoExample example);

    int deleteByExample(CollegeInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CollegeInfo record);

    int insertSelective(CollegeInfo record);

    List<CollegeInfo> selectByExampleWithBLOBs(CollegeInfoExample example);

    List<CollegeInfo> selectByExample(CollegeInfoExample example);
   
    CollegeInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CollegeInfo record, @Param("example") CollegeInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") CollegeInfo record, @Param("example") CollegeInfoExample example);

    int updateByExample(@Param("record") CollegeInfo record, @Param("example") CollegeInfoExample example);

    int updateByPrimaryKeySelective(CollegeInfo record);

    int updateByPrimaryKeyWithBLOBs(CollegeInfo record);

    int updateByPrimaryKey(CollegeInfo record);
    
}
