package com.baohao.departmentwebsite.model;

public class SnInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sn_info.sn_id
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    private Integer snId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sn_info.sn_name
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    private String snName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sn_info.sn_number
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    private Integer snNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sn_info.sn_doc
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    private String snDoc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sn_info.fn_id
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    private Integer fnId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sn_info.sn_id
     *
     * @return the value of sn_info.sn_id
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    public Integer getSnId() {
        return snId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sn_info.sn_id
     *
     * @param snId the value for sn_info.sn_id
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    public void setSnId(Integer snId) {
        this.snId = snId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sn_info.sn_name
     *
     * @return the value of sn_info.sn_name
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    public String getSnName() {
        return snName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sn_info.sn_name
     *
     * @param snName the value for sn_info.sn_name
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    public void setSnName(String snName) {
        this.snName = snName == null ? null : snName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sn_info.sn_number
     *
     * @return the value of sn_info.sn_number
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    public Integer getSnNumber() {
        return snNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sn_info.sn_number
     *
     * @param snNumber the value for sn_info.sn_number
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    public void setSnNumber(Integer snNumber) {
        this.snNumber = snNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sn_info.sn_doc
     *
     * @return the value of sn_info.sn_doc
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    public String getSnDoc() {
        return snDoc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sn_info.sn_doc
     *
     * @param snDoc the value for sn_info.sn_doc
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    public void setSnDoc(String snDoc) {
        this.snDoc = snDoc == null ? null : snDoc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sn_info.fn_id
     *
     * @return the value of sn_info.fn_id
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    public Integer getFnId() {
        return fnId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sn_info.fn_id
     *
     * @param fnId the value for sn_info.fn_id
     *
     * @mbg.generated Sun Apr 22 22:44:34 CST 2018
     */
    public void setFnId(Integer fnId) {
        this.fnId = fnId;
    }
}