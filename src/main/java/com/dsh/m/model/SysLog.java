package com.dsh.m.model;

import java.util.Date;

public class SysLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.logid
     *
     * @mbggenerated Mon Jun 29 13:12:59 CST 2015
     */
    private Integer logid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.loginname
     *
     * @mbggenerated Mon Jun 29 13:12:59 CST 2015
     */
    private String loginname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.logtime
     *
     * @mbggenerated Mon Jun 29 13:12:59 CST 2015
     */
    private Date logtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.action
     *
     * @mbggenerated Mon Jun 29 13:12:59 CST 2015
     */
    private String action;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.logip
     *
     * @mbggenerated Mon Jun 29 13:12:59 CST 2015
     */
    private String logip;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.logid
     *
     * @return the value of sys_log.logid
     *
     * @mbggenerated Mon Jun 29 13:12:59 CST 2015
     */
    public Integer getLogid() {
        return logid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.logid
     *
     * @param logid the value for sys_log.logid
     *
     * @mbggenerated Mon Jun 29 13:12:59 CST 2015
     */
    public void setLogid(Integer logid) {
        this.logid = logid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.loginname
     *
     * @return the value of sys_log.loginname
     *
     * @mbggenerated Mon Jun 29 13:12:59 CST 2015
     */
    public String getLoginname() {
        return loginname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.loginname
     *
     * @param loginname the value for sys_log.loginname
     *
     * @mbggenerated Mon Jun 29 13:12:59 CST 2015
     */
    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.logtime
     *
     * @return the value of sys_log.logtime
     *
     * @mbggenerated Mon Jun 29 13:12:59 CST 2015
     */
    public Date getLogtime() {
        return logtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.logtime
     *
     * @param logtime the value for sys_log.logtime
     *
     * @mbggenerated Mon Jun 29 13:12:59 CST 2015
     */
    public void setLogtime(Date logtime) {
        this.logtime = logtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.action
     *
     * @return the value of sys_log.action
     *
     * @mbggenerated Mon Jun 29 13:12:59 CST 2015
     */
    public String getAction() {
        return action;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.action
     *
     * @param action the value for sys_log.action
     *
     * @mbggenerated Mon Jun 29 13:12:59 CST 2015
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.logip
     *
     * @return the value of sys_log.logip
     *
     * @mbggenerated Mon Jun 29 13:12:59 CST 2015
     */
    public String getLogip() {
        return logip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.logip
     *
     * @param logip the value for sys_log.logip
     *
     * @mbggenerated Mon Jun 29 13:12:59 CST 2015
     */
    public void setLogip(String logip) {
        this.logip = logip;
    }
}