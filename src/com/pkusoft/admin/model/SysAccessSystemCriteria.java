package com.pkusoft.admin.model;

import java.util.List;

import com.pkusoft.framework.model.Criteria.BaseCriteria;

/**
 * 接入的系统查询标准
 * @author 
 */
public class SysAccessSystemCriteria extends BaseCriteria {
	public SysAccessSystemCriteria andSysIdIsNull() {
        addCriterion("SYS_ID is null");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andSysIdIsNotNull() {
        addCriterion("SYS_ID is not null");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andSysIdEqualTo(java.lang.String value) {
        addCriterion("SYS_ID =", value, "sysId");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andSysIdNotEqualTo(java.lang.String value) {
        addCriterion("SYS_ID <>", value, "sysId");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andSysIdGreaterThan(java.lang.String value) {
        addCriterion("SYS_ID >", value, "sysId");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andSysIdGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("SYS_ID >=", value, "sysId");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andSysIdLessThan(java.lang.String value) {
        addCriterion("SYS_ID <", value, "sysId");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andSysIdLessThanOrEqualTo(java.lang.String value) {
        addCriterion("SYS_ID <=", value, "sysId");
        return (SysAccessSystemCriteria) this;
    }
    
    public SysAccessSystemCriteria andSysIdLike(java.lang.String value) {
        addCriterion("SYS_ID like", value, "sysId");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andSysIdNotLike(java.lang.String value) {
        addCriterion("SYS_ID not like", value, "sysId");
        return (SysAccessSystemCriteria) this;
    }
    
    public SysAccessSystemCriteria andSysIdIn(List<java.lang.String> values) {
        addCriterion("SYS_ID in", values, "sysId");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andSysIdNotIn(List<java.lang.String> values) {
        addCriterion("SYS_ID not in", values, "sysId");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andSysIdBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("SYS_ID between", value1, value2, "sysId");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andSysIdNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("SYS_ID not between", value1, value2, "sysId");
        return (SysAccessSystemCriteria) this;
    }
	public SysAccessSystemCriteria andSysNameIsNull() {
        addCriterion("SYS_NAME is null");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andSysNameIsNotNull() {
        addCriterion("SYS_NAME is not null");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andSysNameEqualTo(java.lang.String value) {
        addCriterion("SYS_NAME =", value, "sysName");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andSysNameNotEqualTo(java.lang.String value) {
        addCriterion("SYS_NAME <>", value, "sysName");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andSysNameGreaterThan(java.lang.String value) {
        addCriterion("SYS_NAME >", value, "sysName");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andSysNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("SYS_NAME >=", value, "sysName");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andSysNameLessThan(java.lang.String value) {
        addCriterion("SYS_NAME <", value, "sysName");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andSysNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("SYS_NAME <=", value, "sysName");
        return (SysAccessSystemCriteria) this;
    }
    
    public SysAccessSystemCriteria andSysNameLike(java.lang.String value) {
        addCriterion("SYS_NAME like", value, "sysName");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andSysNameNotLike(java.lang.String value) {
        addCriterion("SYS_NAME not like", value, "sysName");
        return (SysAccessSystemCriteria) this;
    }
    
    public SysAccessSystemCriteria andSysNameIn(List<java.lang.String> values) {
        addCriterion("SYS_NAME in", values, "sysName");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andSysNameNotIn(List<java.lang.String> values) {
        addCriterion("SYS_NAME not in", values, "sysName");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andSysNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("SYS_NAME between", value1, value2, "sysName");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andSysNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("SYS_NAME not between", value1, value2, "sysName");
        return (SysAccessSystemCriteria) this;
    }
	public SysAccessSystemCriteria andSysTypeIsNull() {
        addCriterion("SYS_TYPE is null");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andSysTypeIsNotNull() {
        addCriterion("SYS_TYPE is not null");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andSysTypeEqualTo(java.lang.String value) {
        addCriterion("SYS_TYPE =", value, "sysType");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andSysTypeNotEqualTo(java.lang.String value) {
        addCriterion("SYS_TYPE <>", value, "sysType");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andSysTypeGreaterThan(java.lang.String value) {
        addCriterion("SYS_TYPE >", value, "sysType");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andSysTypeGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("SYS_TYPE >=", value, "sysType");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andSysTypeLessThan(java.lang.String value) {
        addCriterion("SYS_TYPE <", value, "sysType");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andSysTypeLessThanOrEqualTo(java.lang.String value) {
        addCriterion("SYS_TYPE <=", value, "sysType");
        return (SysAccessSystemCriteria) this;
    }
    
    public SysAccessSystemCriteria andSysTypeLike(java.lang.String value) {
        addCriterion("SYS_TYPE like", value, "sysType");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andSysTypeNotLike(java.lang.String value) {
        addCriterion("SYS_TYPE not like", value, "sysType");
        return (SysAccessSystemCriteria) this;
    }
    
    public SysAccessSystemCriteria andSysTypeIn(List<java.lang.String> values) {
        addCriterion("SYS_TYPE in", values, "sysType");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andSysTypeNotIn(List<java.lang.String> values) {
        addCriterion("SYS_TYPE not in", values, "sysType");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andSysTypeBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("SYS_TYPE between", value1, value2, "sysType");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andSysTypeNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("SYS_TYPE not between", value1, value2, "sysType");
        return (SysAccessSystemCriteria) this;
    }
	public SysAccessSystemCriteria andUrlIsNull() {
        addCriterion("URL is null");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andUrlIsNotNull() {
        addCriterion("URL is not null");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andUrlEqualTo(java.lang.String value) {
        addCriterion("URL =", value, "url");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andUrlNotEqualTo(java.lang.String value) {
        addCriterion("URL <>", value, "url");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andUrlGreaterThan(java.lang.String value) {
        addCriterion("URL >", value, "url");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andUrlGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("URL >=", value, "url");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andUrlLessThan(java.lang.String value) {
        addCriterion("URL <", value, "url");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andUrlLessThanOrEqualTo(java.lang.String value) {
        addCriterion("URL <=", value, "url");
        return (SysAccessSystemCriteria) this;
    }
    
    public SysAccessSystemCriteria andUrlLike(java.lang.String value) {
        addCriterion("URL like", value, "url");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andUrlNotLike(java.lang.String value) {
        addCriterion("URL not like", value, "url");
        return (SysAccessSystemCriteria) this;
    }
    
    public SysAccessSystemCriteria andUrlIn(List<java.lang.String> values) {
        addCriterion("URL in", values, "url");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andUrlNotIn(List<java.lang.String> values) {
        addCriterion("URL not in", values, "url");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andUrlBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("URL between", value1, value2, "url");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andUrlNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("URL not between", value1, value2, "url");
        return (SysAccessSystemCriteria) this;
    }
	public SysAccessSystemCriteria andDescriptionIsNull() {
        addCriterion("DESCRIPTION is null");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andDescriptionIsNotNull() {
        addCriterion("DESCRIPTION is not null");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andDescriptionEqualTo(java.lang.String value) {
        addCriterion("DESCRIPTION =", value, "description");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andDescriptionNotEqualTo(java.lang.String value) {
        addCriterion("DESCRIPTION <>", value, "description");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andDescriptionGreaterThan(java.lang.String value) {
        addCriterion("DESCRIPTION >", value, "description");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andDescriptionGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("DESCRIPTION >=", value, "description");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andDescriptionLessThan(java.lang.String value) {
        addCriterion("DESCRIPTION <", value, "description");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andDescriptionLessThanOrEqualTo(java.lang.String value) {
        addCriterion("DESCRIPTION <=", value, "description");
        return (SysAccessSystemCriteria) this;
    }
    
    public SysAccessSystemCriteria andDescriptionLike(java.lang.String value) {
        addCriterion("DESCRIPTION like", value, "description");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andDescriptionNotLike(java.lang.String value) {
        addCriterion("DESCRIPTION not like", value, "description");
        return (SysAccessSystemCriteria) this;
    }
    
    public SysAccessSystemCriteria andDescriptionIn(List<java.lang.String> values) {
        addCriterion("DESCRIPTION in", values, "description");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andDescriptionNotIn(List<java.lang.String> values) {
        addCriterion("DESCRIPTION not in", values, "description");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andDescriptionBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DESCRIPTION between", value1, value2, "description");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andDescriptionNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DESCRIPTION not between", value1, value2, "description");
        return (SysAccessSystemCriteria) this;
    }
	public SysAccessSystemCriteria andModifyUserIdIsNull() {
        addCriterion("MODIFY_USER_ID is null");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andModifyUserIdIsNotNull() {
        addCriterion("MODIFY_USER_ID is not null");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andModifyUserIdEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_ID =", value, "modifyUserId");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andModifyUserIdNotEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_ID <>", value, "modifyUserId");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andModifyUserIdGreaterThan(java.lang.String value) {
        addCriterion("MODIFY_USER_ID >", value, "modifyUserId");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andModifyUserIdGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_ID >=", value, "modifyUserId");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andModifyUserIdLessThan(java.lang.String value) {
        addCriterion("MODIFY_USER_ID <", value, "modifyUserId");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andModifyUserIdLessThanOrEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_ID <=", value, "modifyUserId");
        return (SysAccessSystemCriteria) this;
    }
    
    public SysAccessSystemCriteria andModifyUserIdLike(java.lang.String value) {
        addCriterion("MODIFY_USER_ID like", value, "modifyUserId");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andModifyUserIdNotLike(java.lang.String value) {
        addCriterion("MODIFY_USER_ID not like", value, "modifyUserId");
        return (SysAccessSystemCriteria) this;
    }
    
    public SysAccessSystemCriteria andModifyUserIdIn(List<java.lang.String> values) {
        addCriterion("MODIFY_USER_ID in", values, "modifyUserId");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andModifyUserIdNotIn(List<java.lang.String> values) {
        addCriterion("MODIFY_USER_ID not in", values, "modifyUserId");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andModifyUserIdBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MODIFY_USER_ID between", value1, value2, "modifyUserId");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andModifyUserIdNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MODIFY_USER_ID not between", value1, value2, "modifyUserId");
        return (SysAccessSystemCriteria) this;
    }
	public SysAccessSystemCriteria andModifyUserNameIsNull() {
        addCriterion("MODIFY_USER_NAME is null");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andModifyUserNameIsNotNull() {
        addCriterion("MODIFY_USER_NAME is not null");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andModifyUserNameEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME =", value, "modifyUserName");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andModifyUserNameNotEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME <>", value, "modifyUserName");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andModifyUserNameGreaterThan(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME >", value, "modifyUserName");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andModifyUserNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME >=", value, "modifyUserName");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andModifyUserNameLessThan(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME <", value, "modifyUserName");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andModifyUserNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME <=", value, "modifyUserName");
        return (SysAccessSystemCriteria) this;
    }
    
    public SysAccessSystemCriteria andModifyUserNameLike(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME like", value, "modifyUserName");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andModifyUserNameNotLike(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME not like", value, "modifyUserName");
        return (SysAccessSystemCriteria) this;
    }
    
    public SysAccessSystemCriteria andModifyUserNameIn(List<java.lang.String> values) {
        addCriterion("MODIFY_USER_NAME in", values, "modifyUserName");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andModifyUserNameNotIn(List<java.lang.String> values) {
        addCriterion("MODIFY_USER_NAME not in", values, "modifyUserName");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andModifyUserNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MODIFY_USER_NAME between", value1, value2, "modifyUserName");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andModifyUserNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MODIFY_USER_NAME not between", value1, value2, "modifyUserName");
        return (SysAccessSystemCriteria) this;
    }
	public SysAccessSystemCriteria andModifyTimeIsNull() {
        addCriterion("MODIFY_TIME is null");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andModifyTimeIsNotNull() {
        addCriterion("MODIFY_TIME is not null");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andModifyTimeEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME =", value, "modifyTime");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andModifyTimeNotEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME <>", value, "modifyTime");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andModifyTimeGreaterThan(java.util.Date value) {
        addCriterion("MODIFY_TIME >", value, "modifyTime");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andModifyTimeGreaterThanOrEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME >=", value, "modifyTime");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andModifyTimeLessThan(java.util.Date value) {
        addCriterion("MODIFY_TIME <", value, "modifyTime");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andModifyTimeLessThanOrEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME <=", value, "modifyTime");
        return (SysAccessSystemCriteria) this;
    }
    
    public SysAccessSystemCriteria andModifyTimeIn(List<java.util.Date> values) {
        addCriterion("MODIFY_TIME in", values, "modifyTime");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andModifyTimeNotIn(List<java.util.Date> values) {
        addCriterion("MODIFY_TIME not in", values, "modifyTime");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andModifyTimeBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("MODIFY_TIME between", value1, value2, "modifyTime");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andModifyTimeNotBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("MODIFY_TIME not between", value1, value2, "modifyTime");
        return (SysAccessSystemCriteria) this;
    }
	public SysAccessSystemCriteria andReserve1IsNull() {
        addCriterion("RESERVE1 is null");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve1IsNotNull() {
        addCriterion("RESERVE1 is not null");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve1EqualTo(java.lang.String value) {
        addCriterion("RESERVE1 =", value, "reserve1");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve1NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 <>", value, "reserve1");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve1GreaterThan(java.lang.String value) {
        addCriterion("RESERVE1 >", value, "reserve1");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve1GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 >=", value, "reserve1");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve1LessThan(java.lang.String value) {
        addCriterion("RESERVE1 <", value, "reserve1");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve1LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 <=", value, "reserve1");
        return (SysAccessSystemCriteria) this;
    }
    
    public SysAccessSystemCriteria andReserve1Like(java.lang.String value) {
        addCriterion("RESERVE1 like", value, "reserve1");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve1NotLike(java.lang.String value) {
        addCriterion("RESERVE1 not like", value, "reserve1");
        return (SysAccessSystemCriteria) this;
    }
    
    public SysAccessSystemCriteria andReserve1In(List<java.lang.String> values) {
        addCriterion("RESERVE1 in", values, "reserve1");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve1NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE1 not in", values, "reserve1");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve1Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE1 between", value1, value2, "reserve1");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve1NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE1 not between", value1, value2, "reserve1");
        return (SysAccessSystemCriteria) this;
    }
	public SysAccessSystemCriteria andReserve2IsNull() {
        addCriterion("RESERVE2 is null");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve2IsNotNull() {
        addCriterion("RESERVE2 is not null");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve2EqualTo(java.lang.String value) {
        addCriterion("RESERVE2 =", value, "reserve2");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve2NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 <>", value, "reserve2");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve2GreaterThan(java.lang.String value) {
        addCriterion("RESERVE2 >", value, "reserve2");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve2GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 >=", value, "reserve2");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve2LessThan(java.lang.String value) {
        addCriterion("RESERVE2 <", value, "reserve2");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve2LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 <=", value, "reserve2");
        return (SysAccessSystemCriteria) this;
    }
    
    public SysAccessSystemCriteria andReserve2Like(java.lang.String value) {
        addCriterion("RESERVE2 like", value, "reserve2");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve2NotLike(java.lang.String value) {
        addCriterion("RESERVE2 not like", value, "reserve2");
        return (SysAccessSystemCriteria) this;
    }
    
    public SysAccessSystemCriteria andReserve2In(List<java.lang.String> values) {
        addCriterion("RESERVE2 in", values, "reserve2");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve2NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE2 not in", values, "reserve2");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve2Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE2 between", value1, value2, "reserve2");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve2NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE2 not between", value1, value2, "reserve2");
        return (SysAccessSystemCriteria) this;
    }
	public SysAccessSystemCriteria andReserve4IsNull() {
        addCriterion("RESERVE4 is null");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve4IsNotNull() {
        addCriterion("RESERVE4 is not null");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve4EqualTo(java.lang.String value) {
        addCriterion("RESERVE4 =", value, "reserve4");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve4NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 <>", value, "reserve4");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve4GreaterThan(java.lang.String value) {
        addCriterion("RESERVE4 >", value, "reserve4");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve4GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 >=", value, "reserve4");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve4LessThan(java.lang.String value) {
        addCriterion("RESERVE4 <", value, "reserve4");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve4LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 <=", value, "reserve4");
        return (SysAccessSystemCriteria) this;
    }
    
    public SysAccessSystemCriteria andReserve4Like(java.lang.String value) {
        addCriterion("RESERVE4 like", value, "reserve4");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve4NotLike(java.lang.String value) {
        addCriterion("RESERVE4 not like", value, "reserve4");
        return (SysAccessSystemCriteria) this;
    }
    
    public SysAccessSystemCriteria andReserve4In(List<java.lang.String> values) {
        addCriterion("RESERVE4 in", values, "reserve4");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve4NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE4 not in", values, "reserve4");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve4Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE4 between", value1, value2, "reserve4");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve4NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE4 not between", value1, value2, "reserve4");
        return (SysAccessSystemCriteria) this;
    }
	public SysAccessSystemCriteria andReserve3IsNull() {
        addCriterion("RESERVE3 is null");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve3IsNotNull() {
        addCriterion("RESERVE3 is not null");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve3EqualTo(java.lang.String value) {
        addCriterion("RESERVE3 =", value, "reserve3");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve3NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 <>", value, "reserve3");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve3GreaterThan(java.lang.String value) {
        addCriterion("RESERVE3 >", value, "reserve3");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve3GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 >=", value, "reserve3");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve3LessThan(java.lang.String value) {
        addCriterion("RESERVE3 <", value, "reserve3");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve3LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 <=", value, "reserve3");
        return (SysAccessSystemCriteria) this;
    }
    
    public SysAccessSystemCriteria andReserve3Like(java.lang.String value) {
        addCriterion("RESERVE3 like", value, "reserve3");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve3NotLike(java.lang.String value) {
        addCriterion("RESERVE3 not like", value, "reserve3");
        return (SysAccessSystemCriteria) this;
    }
    
    public SysAccessSystemCriteria andReserve3In(List<java.lang.String> values) {
        addCriterion("RESERVE3 in", values, "reserve3");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve3NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE3 not in", values, "reserve3");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve3Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE3 between", value1, value2, "reserve3");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve3NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE3 not between", value1, value2, "reserve3");
        return (SysAccessSystemCriteria) this;
    }
	public SysAccessSystemCriteria andReserve5IsNull() {
        addCriterion("RESERVE5 is null");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve5IsNotNull() {
        addCriterion("RESERVE5 is not null");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve5EqualTo(java.lang.String value) {
        addCriterion("RESERVE5 =", value, "reserve5");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve5NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 <>", value, "reserve5");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve5GreaterThan(java.lang.String value) {
        addCriterion("RESERVE5 >", value, "reserve5");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve5GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 >=", value, "reserve5");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve5LessThan(java.lang.String value) {
        addCriterion("RESERVE5 <", value, "reserve5");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve5LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 <=", value, "reserve5");
        return (SysAccessSystemCriteria) this;
    }
    
    public SysAccessSystemCriteria andReserve5Like(java.lang.String value) {
        addCriterion("RESERVE5 like", value, "reserve5");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve5NotLike(java.lang.String value) {
        addCriterion("RESERVE5 not like", value, "reserve5");
        return (SysAccessSystemCriteria) this;
    }
    
    public SysAccessSystemCriteria andReserve5In(List<java.lang.String> values) {
        addCriterion("RESERVE5 in", values, "reserve5");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve5NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE5 not in", values, "reserve5");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve5Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE5 between", value1, value2, "reserve5");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andReserve5NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE5 not between", value1, value2, "reserve5");
        return (SysAccessSystemCriteria) this;
    }
	public SysAccessSystemCriteria andIconIsNull() {
        addCriterion("ICON is null");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andIconIsNotNull() {
        addCriterion("ICON is not null");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andIconEqualTo(java.lang.String value) {
        addCriterion("ICON =", value, "icon");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andIconNotEqualTo(java.lang.String value) {
        addCriterion("ICON <>", value, "icon");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andIconGreaterThan(java.lang.String value) {
        addCriterion("ICON >", value, "icon");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andIconGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("ICON >=", value, "icon");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andIconLessThan(java.lang.String value) {
        addCriterion("ICON <", value, "icon");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andIconLessThanOrEqualTo(java.lang.String value) {
        addCriterion("ICON <=", value, "icon");
        return (SysAccessSystemCriteria) this;
    }
    
    public SysAccessSystemCriteria andIconLike(java.lang.String value) {
        addCriterion("ICON like", value, "icon");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andIconNotLike(java.lang.String value) {
        addCriterion("ICON not like", value, "icon");
        return (SysAccessSystemCriteria) this;
    }
    
    public SysAccessSystemCriteria andIconIn(List<java.lang.String> values) {
        addCriterion("ICON in", values, "icon");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andIconNotIn(List<java.lang.String> values) {
        addCriterion("ICON not in", values, "icon");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andIconBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ICON between", value1, value2, "icon");
        return (SysAccessSystemCriteria) this;
    }

    public SysAccessSystemCriteria andIconNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ICON not between", value1, value2, "icon");
        return (SysAccessSystemCriteria) this;
    }
}

