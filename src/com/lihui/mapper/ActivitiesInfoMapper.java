package com.lihui.mapper;

import com.lihui.bean.ActivitiesInfo;
import com.lihui.bean.ActivitiesInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivitiesInfoMapper {
    int countByExample(ActivitiesInfoExample example);

    int deleteByExample(ActivitiesInfoExample example);

    int insert(ActivitiesInfo record);

    int insertSelective(ActivitiesInfo record);

    List<ActivitiesInfo> selectByExampleWithBLOBs(ActivitiesInfoExample example);

    List<ActivitiesInfo> selectByExample(ActivitiesInfoExample example);

    int updateByExampleSelective(@Param("record") ActivitiesInfo record, @Param("example") ActivitiesInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") ActivitiesInfo record, @Param("example") ActivitiesInfoExample example);

    int updateByExample(@Param("record") ActivitiesInfo record, @Param("example") ActivitiesInfoExample example);
}