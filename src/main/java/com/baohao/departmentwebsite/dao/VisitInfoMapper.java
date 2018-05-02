package com.baohao.departmentwebsite.dao;

import com.baohao.departmentwebsite.model.VisitInfo;
import com.baohao.departmentwebsite.model.VisitInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VisitInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_info
     *
     * @mbg.generated
     */
    long countByExample(VisitInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_info
     *
     * @mbg.generated
     */
    int deleteByExample(VisitInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer visitId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_info
     *
     * @mbg.generated
     */
    int insert(VisitInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_info
     *
     * @mbg.generated
     */
    int insertSelective(VisitInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_info
     *
     * @mbg.generated
     */
    List<VisitInfo> selectByExample(VisitInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_info
     *
     * @mbg.generated
     */
    VisitInfo selectByPrimaryKey(Integer visitId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_info
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") VisitInfo record, @Param("example") VisitInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_info
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") VisitInfo record, @Param("example") VisitInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(VisitInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(VisitInfo record);
}