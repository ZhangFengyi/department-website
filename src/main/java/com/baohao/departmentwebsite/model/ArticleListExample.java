package com.baohao.departmentwebsite.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleListExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table article_list
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table article_list
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table article_list
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_list
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    public ArticleListExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_list
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_list
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_list
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_list
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_list
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_list
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_list
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
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
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
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
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_list
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
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
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
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

        public Criteria andArtiIdIsNull() {
            addCriterion("arti_id is null");
            return (Criteria) this;
        }

        public Criteria andArtiIdIsNotNull() {
            addCriterion("arti_id is not null");
            return (Criteria) this;
        }

        public Criteria andArtiIdEqualTo(Integer value) {
            addCriterion("arti_id =", value, "artiId");
            return (Criteria) this;
        }

        public Criteria andArtiIdNotEqualTo(Integer value) {
            addCriterion("arti_id <>", value, "artiId");
            return (Criteria) this;
        }

        public Criteria andArtiIdGreaterThan(Integer value) {
            addCriterion("arti_id >", value, "artiId");
            return (Criteria) this;
        }

        public Criteria andArtiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("arti_id >=", value, "artiId");
            return (Criteria) this;
        }

        public Criteria andArtiIdLessThan(Integer value) {
            addCriterion("arti_id <", value, "artiId");
            return (Criteria) this;
        }

        public Criteria andArtiIdLessThanOrEqualTo(Integer value) {
            addCriterion("arti_id <=", value, "artiId");
            return (Criteria) this;
        }

        public Criteria andArtiIdIn(List<Integer> values) {
            addCriterion("arti_id in", values, "artiId");
            return (Criteria) this;
        }

        public Criteria andArtiIdNotIn(List<Integer> values) {
            addCriterion("arti_id not in", values, "artiId");
            return (Criteria) this;
        }

        public Criteria andArtiIdBetween(Integer value1, Integer value2) {
            addCriterion("arti_id between", value1, value2, "artiId");
            return (Criteria) this;
        }

        public Criteria andArtiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("arti_id not between", value1, value2, "artiId");
            return (Criteria) this;
        }

        public Criteria andArtiNameIsNull() {
            addCriterion("arti_name is null");
            return (Criteria) this;
        }

        public Criteria andArtiNameIsNotNull() {
            addCriterion("arti_name is not null");
            return (Criteria) this;
        }

        public Criteria andArtiNameEqualTo(String value) {
            addCriterion("arti_name =", value, "artiName");
            return (Criteria) this;
        }

        public Criteria andArtiNameNotEqualTo(String value) {
            addCriterion("arti_name <>", value, "artiName");
            return (Criteria) this;
        }

        public Criteria andArtiNameGreaterThan(String value) {
            addCriterion("arti_name >", value, "artiName");
            return (Criteria) this;
        }

        public Criteria andArtiNameGreaterThanOrEqualTo(String value) {
            addCriterion("arti_name >=", value, "artiName");
            return (Criteria) this;
        }

        public Criteria andArtiNameLessThan(String value) {
            addCriterion("arti_name <", value, "artiName");
            return (Criteria) this;
        }

        public Criteria andArtiNameLessThanOrEqualTo(String value) {
            addCriterion("arti_name <=", value, "artiName");
            return (Criteria) this;
        }

        public Criteria andArtiNameLike(String value) {
            addCriterion("arti_name like", value, "artiName");
            return (Criteria) this;
        }

        public Criteria andArtiNameNotLike(String value) {
            addCriterion("arti_name not like", value, "artiName");
            return (Criteria) this;
        }

        public Criteria andArtiNameIn(List<String> values) {
            addCriterion("arti_name in", values, "artiName");
            return (Criteria) this;
        }

        public Criteria andArtiNameNotIn(List<String> values) {
            addCriterion("arti_name not in", values, "artiName");
            return (Criteria) this;
        }

        public Criteria andArtiNameBetween(String value1, String value2) {
            addCriterion("arti_name between", value1, value2, "artiName");
            return (Criteria) this;
        }

        public Criteria andArtiNameNotBetween(String value1, String value2) {
            addCriterion("arti_name not between", value1, value2, "artiName");
            return (Criteria) this;
        }

        public Criteria andArtiAuthorIsNull() {
            addCriterion("arti_author is null");
            return (Criteria) this;
        }

        public Criteria andArtiAuthorIsNotNull() {
            addCriterion("arti_author is not null");
            return (Criteria) this;
        }

        public Criteria andArtiAuthorEqualTo(String value) {
            addCriterion("arti_author =", value, "artiAuthor");
            return (Criteria) this;
        }

        public Criteria andArtiAuthorNotEqualTo(String value) {
            addCriterion("arti_author <>", value, "artiAuthor");
            return (Criteria) this;
        }

        public Criteria andArtiAuthorGreaterThan(String value) {
            addCriterion("arti_author >", value, "artiAuthor");
            return (Criteria) this;
        }

        public Criteria andArtiAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("arti_author >=", value, "artiAuthor");
            return (Criteria) this;
        }

        public Criteria andArtiAuthorLessThan(String value) {
            addCriterion("arti_author <", value, "artiAuthor");
            return (Criteria) this;
        }

        public Criteria andArtiAuthorLessThanOrEqualTo(String value) {
            addCriterion("arti_author <=", value, "artiAuthor");
            return (Criteria) this;
        }

        public Criteria andArtiAuthorLike(String value) {
            addCriterion("arti_author like", value, "artiAuthor");
            return (Criteria) this;
        }

        public Criteria andArtiAuthorNotLike(String value) {
            addCriterion("arti_author not like", value, "artiAuthor");
            return (Criteria) this;
        }

        public Criteria andArtiAuthorIn(List<String> values) {
            addCriterion("arti_author in", values, "artiAuthor");
            return (Criteria) this;
        }

        public Criteria andArtiAuthorNotIn(List<String> values) {
            addCriterion("arti_author not in", values, "artiAuthor");
            return (Criteria) this;
        }

        public Criteria andArtiAuthorBetween(String value1, String value2) {
            addCriterion("arti_author between", value1, value2, "artiAuthor");
            return (Criteria) this;
        }

        public Criteria andArtiAuthorNotBetween(String value1, String value2) {
            addCriterion("arti_author not between", value1, value2, "artiAuthor");
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
     * @mbg.generated do_not_delete_during_merge Sun Apr 22 22:44:34 CST 2018
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
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
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