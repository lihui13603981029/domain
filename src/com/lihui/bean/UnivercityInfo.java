package com.lihui.bean;

import java.util.Date;

public class UnivercityInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column univercity_info.id
     *
     * @mbggenerated Mon Jun 11 16:39:43 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column univercity_info.name
     *
     * @mbggenerated Mon Jun 11 16:39:43 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column univercity_info.create_time
     *
     * @mbggenerated Mon Jun 11 16:39:43 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column univercity_info.image_url
     *
     * @mbggenerated Mon Jun 11 16:39:43 CST 2018
     */
    private String imageUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column univercity_info.introduce
     *
     * @mbggenerated Mon Jun 11 16:39:43 CST 2018
     */
    private String introduce;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column univercity_info.id
     *
     * @return the value of univercity_info.id
     *
     * @mbggenerated Mon Jun 11 16:39:43 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column univercity_info.id
     *
     * @param id the value for univercity_info.id
     *
     * @mbggenerated Mon Jun 11 16:39:43 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column univercity_info.name
     *
     * @return the value of univercity_info.name
     *
     * @mbggenerated Mon Jun 11 16:39:43 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column univercity_info.name
     *
     * @param name the value for univercity_info.name
     *
     * @mbggenerated Mon Jun 11 16:39:43 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column univercity_info.create_time
     *
     * @return the value of univercity_info.create_time
     *
     * @mbggenerated Mon Jun 11 16:39:43 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column univercity_info.create_time
     *
     * @param createTime the value for univercity_info.create_time
     *
     * @mbggenerated Mon Jun 11 16:39:43 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column univercity_info.image_url
     *
     * @return the value of univercity_info.image_url
     *
     * @mbggenerated Mon Jun 11 16:39:43 CST 2018
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column univercity_info.image_url
     *
     * @param imageUrl the value for univercity_info.image_url
     *
     * @mbggenerated Mon Jun 11 16:39:43 CST 2018
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column univercity_info.introduce
     *
     * @return the value of univercity_info.introduce
     *
     * @mbggenerated Mon Jun 11 16:39:43 CST 2018
     */
    public String getIntroduce() {
        return introduce;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column univercity_info.introduce
     *
     * @param introduce the value for univercity_info.introduce
     *
     * @mbggenerated Mon Jun 11 16:39:43 CST 2018
     */
    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }
}