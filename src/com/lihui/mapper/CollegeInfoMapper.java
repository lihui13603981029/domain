package com.lihui.mapper;


import com.lihui.bean.CollegeInfo;


public interface CollegeInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table college_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table college_info
     *
     * @mbggenerated
     */
    int insert(CollegeInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table college_info
     *
     * @mbggenerated
     */
    int insertSelective(CollegeInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table college_info
     *
     * @mbggenerated
     */
    CollegeInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table college_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CollegeInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table college_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(CollegeInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table college_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CollegeInfo record);
    
    
}