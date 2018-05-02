package com.baohao.departmentwebsite.dao;

import com.baohao.departmentwebsite.model.SnInfo;
import com.baohao.departmentwebsite.model.SnInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SnInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sn_info
     *
     * @mbg.generated
     */
    long countByExample(SnInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sn_info
     *
     * @mbg.generated
     */
    int deleteByExample(SnInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sn_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer snId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sn_info
     *
     * @mbg.generated
     */
    int insert(SnInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sn_info
     *
     * @mbg.generated
     */
    int insertSelective(SnInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sn_info
     *
     * @mbg.generated
     */
    List<SnInfo> selectByExample(SnInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sn_info
     *
     * @mbg.generated
     */
    SnInfo selectByPrimaryKey(Integer snId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sn_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SnInfo record, @Param("example") SnInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sn_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SnInfo record, @Param("example") SnInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sn_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SnInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sn_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SnInfo record);
}