package com.baohao.departmentwebsite.dao;

import com.baohao.departmentwebsite.model.ImageInfo;
import com.baohao.departmentwebsite.model.ImageInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImageInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_info
     *
     * @mbg.generated Mon Apr 23 08:28:50 CST 2018
     */
    long countByExample(ImageInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_info
     *
     * @mbg.generated Mon Apr 23 08:28:50 CST 2018
     */
    int deleteByExample(ImageInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_info
     *
     * @mbg.generated Mon Apr 23 08:28:50 CST 2018
     */
    int deleteByPrimaryKey(Integer imgId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_info
     *
     * @mbg.generated Mon Apr 23 08:28:50 CST 2018
     */
    int insert(ImageInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_info
     *
     * @mbg.generated Mon Apr 23 08:28:50 CST 2018
     */
    int insertSelective(ImageInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_info
     *
     * @mbg.generated Mon Apr 23 08:28:50 CST 2018
     */
    List<ImageInfo> selectByExample(ImageInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_info
     *
     * @mbg.generated Mon Apr 23 08:28:50 CST 2018
     */
    ImageInfo selectByPrimaryKey(Integer imgId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_info
     *
     * @mbg.generated Mon Apr 23 08:28:50 CST 2018
     */
    int updateByExampleSelective(@Param("record") ImageInfo record, @Param("example") ImageInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_info
     *
     * @mbg.generated Mon Apr 23 08:28:50 CST 2018
     */
    int updateByExample(@Param("record") ImageInfo record, @Param("example") ImageInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_info
     *
     * @mbg.generated Mon Apr 23 08:28:50 CST 2018
     */
    int updateByPrimaryKeySelective(ImageInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table image_info
     *
     * @mbg.generated Mon Apr 23 08:28:50 CST 2018
     */
    int updateByPrimaryKey(ImageInfo record);
}