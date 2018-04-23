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
     * @mbg.generated Mon Apr 23 08:28:50 CST 2018
     */
    long countByExample(SnInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sn_info
     *
     * @mbg.generated Mon Apr 23 08:28:50 CST 2018
     */
    int deleteByExample(SnInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sn_info
     *
     * @mbg.generated Mon Apr 23 08:28:50 CST 2018
     */
    int deleteByPrimaryKey(Integer snId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sn_info
     *
     * @mbg.generated Mon Apr 23 08:28:50 CST 2018
     */
    int insert(SnInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sn_info
     *
     * @mbg.generated Mon Apr 23 08:28:50 CST 2018
     */
    int insertSelective(SnInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sn_info
     *
     * @mbg.generated Mon Apr 23 08:28:50 CST 2018
     */
    List<SnInfo> selectByExample(SnInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sn_info
     *
     * @mbg.generated Mon Apr 23 08:28:50 CST 2018
     */
    SnInfo selectByPrimaryKey(Integer snId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sn_info
     *
     * @mbg.generated Mon Apr 23 08:28:50 CST 2018
     */
    int updateByExampleSelective(@Param("record") SnInfo record, @Param("example") SnInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sn_info
     *
     * @mbg.generated Mon Apr 23 08:28:50 CST 2018
     */
    int updateByExample(@Param("record") SnInfo record, @Param("example") SnInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sn_info
     *
     * @mbg.generated Mon Apr 23 08:28:50 CST 2018
     */
    int updateByPrimaryKeySelective(SnInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sn_info
     *
     * @mbg.generated Mon Apr 23 08:28:50 CST 2018
     */
    int updateByPrimaryKey(SnInfo record);
}