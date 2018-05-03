package com.baohao.departmentwebsite.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleListExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table article_list
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table article_list
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table article_list
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_list
     *
     * @mbg.generated
     */
    public ArticleListExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_list
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_list
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_list
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_list
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_list
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_list
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_list
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_list
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_list
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_list
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table article_list
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andArlIdIsNull() {
            addCriterion("arl_id is null");
            return (Criteria) this;
        }

        public Criteria andArlIdIsNotNull() {
            addCriterion("arl_id is not null");
            return (Criteria) this;
        }

        public Criteria andArlIdEqualTo(Integer value) {
            addCriterion("arl_id =", value, "arlId");
            return (Criteria) this;
        }

        public Criteria andArlIdNotEqualTo(Integer value) {
            addCriterion("arl_id <>", value, "arlId");
            return (Criteria) this;
        }

        public Criteria andArlIdGreaterThan(Integer value) {
            addCriterion("arl_id >", value, "arlId");
            return (Criteria) this;
        }

        public Criteria andArlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("arl_id >=", value, "arlId");
            return (Criteria) this;
        }

        public Criteria andArlIdLessThan(Integer value) {
            addCriterion("arl_id <", value, "arlId");
            return (Criteria) this;
        }

        public Criteria andArlIdLessThanOrEqualTo(Integer value) {
            addCriterion("arl_id <=", value, "arlId");
            return (Criteria) this;
        }

        public Criteria andArlIdIn(List<Integer> values) {
            addCriterion("arl_id in", values, "arlId");
            return (Criteria) this;
        }

        public Criteria andArlIdNotIn(List<Integer> values) {
            addCriterion("arl_id not in", values, "arlId");
            return (Criteria) this;
        }

        public Criteria andArlIdBetween(Integer value1, Integer value2) {
            addCriterion("arl_id between", value1, value2, "arlId");
            return (Criteria) this;
        }

        public Criteria andArlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("arl_id not between", value1, value2, "arlId");
            return (Criteria) this;
        }

        public Criteria andArlNameIsNull() {
            addCriterion("arl_name is null");
            return (Criteria) this;
        }

        public Criteria andArlNameIsNotNull() {
            addCriterion("arl_name is not null");
            return (Criteria) this;
        }

        public Criteria andArlNameEqualTo(String value) {
            addCriterion("arl_name =", value, "arlName");
            return (Criteria) this;
        }

        public Criteria andArlNameNotEqualTo(String value) {
            addCriterion("arl_name <>", value, "arlName");
            return (Criteria) this;
        }

        public Criteria andArlNameGreaterThan(String value) {
            addCriterion("arl_name >", value, "arlName");
            return (Criteria) this;
        }

        public Criteria andArlNameGreaterThanOrEqualTo(String value) {
            addCriterion("arl_name >=", value, "arlName");
            return (Criteria) this;
        }

        public Criteria andArlNameLessThan(String value) {
            addCriterion("arl_name <", value, "arlName");
            return (Criteria) this;
        }

        public Criteria andArlNameLessThanOrEqualTo(String value) {
            addCriterion("arl_name <=", value, "arlName");
            return (Criteria) this;
        }

        public Criteria andArlNameLike(String value) {
            addCriterion("arl_name like", value, "arlName");
            return (Criteria) this;
        }

        public Criteria andArlNameNotLike(String value) {
            addCriterion("arl_name not like", value, "arlName");
            return (Criteria) this;
        }

        public Criteria andArlNameIn(List<String> values) {
            addCriterion("arl_name in", values, "arlName");
            return (Criteria) this;
        }

        public Criteria andArlNameNotIn(List<String> values) {
            addCriterion("arl_name not in", values, "arlName");
            return (Criteria) this;
        }

        public Criteria andArlNameBetween(String value1, String value2) {
            addCriterion("arl_name between", value1, value2, "arlName");
            return (Criteria) this;
        }

        public Criteria andArlNameNotBetween(String value1, String value2) {
            addCriterion("arl_name not between", value1, value2, "arlName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table article_list
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table article_list
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}