package com.baohao.departmentwebsite.model;

import java.util.Date;

public class ImageGroupInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column image_group_info.group_id
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    private Integer groupId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column image_group_info.group_name
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    private String groupName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column image_group_info.create_time
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column image_group_info.update_time
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column image_group_info.group_id
     *
     * @return the value of image_group_info.group_id
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column image_group_info.group_id
     *
     * @param groupId the value for image_group_info.group_id
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column image_group_info.group_name
     *
     * @return the value of image_group_info.group_name
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column image_group_info.group_name
     *
     * @param groupName the value for image_group_info.group_name
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column image_group_info.create_time
     *
     * @return the value of image_group_info.create_time
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column image_group_info.create_time
     *
     * @param createTime the value for image_group_info.create_time
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column image_group_info.update_time
     *
     * @return the value of image_group_info.update_time
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column image_group_info.update_time
     *
     * @param updateTime the value for image_group_info.update_time
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}