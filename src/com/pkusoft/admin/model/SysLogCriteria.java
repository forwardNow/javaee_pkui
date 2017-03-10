package com.pkusoft.admin.model;

import java.util.List;

import com.pkusoft.framework.model.Criteria.BaseCriteria;

/**
 * 
 * @author 
 */
public class SysLogCriteria extends BaseCriteria {
	public SysLogCriteria andLogIdIsNull() {
        addCriterion("LOG_ID is null");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogIdIsNotNull() {
        addCriterion("LOG_ID is not null");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogIdEqualTo(java.lang.Long value) {
        addCriterion("LOG_ID =", value, "logId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogIdNotEqualTo(java.lang.Long value) {
        addCriterion("LOG_ID <>", value, "logId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogIdGreaterThan(java.lang.Long value) {
        addCriterion("LOG_ID >", value, "logId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("LOG_ID >=", value, "logId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogIdLessThan(java.lang.Long value) {
        addCriterion("LOG_ID <", value, "logId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("LOG_ID <=", value, "logId");
        return (SysLogCriteria) this;
    }
    
    public SysLogCriteria andLogIdIn(List<java.lang.Long> values) {
        addCriterion("LOG_ID in", values, "logId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogIdNotIn(List<java.lang.Long> values) {
        addCriterion("LOG_ID not in", values, "logId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("LOG_ID between", value1, value2, "logId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("LOG_ID not between", value1, value2, "logId");
        return (SysLogCriteria) this;
    }
	public SysLogCriteria andUserIdIsNull() {
        addCriterion("USER_ID is null");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andUserIdIsNotNull() {
        addCriterion("USER_ID is not null");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andUserIdEqualTo(java.lang.Long value) {
        addCriterion("USER_ID =", value, "userId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andUserIdNotEqualTo(java.lang.Long value) {
        addCriterion("USER_ID <>", value, "userId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andUserIdGreaterThan(java.lang.Long value) {
        addCriterion("USER_ID >", value, "userId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andUserIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("USER_ID >=", value, "userId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andUserIdLessThan(java.lang.Long value) {
        addCriterion("USER_ID <", value, "userId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andUserIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("USER_ID <=", value, "userId");
        return (SysLogCriteria) this;
    }
    
    public SysLogCriteria andUserIdIn(List<java.lang.Long> values) {
        addCriterion("USER_ID in", values, "userId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andUserIdNotIn(List<java.lang.Long> values) {
        addCriterion("USER_ID not in", values, "userId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andUserIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("USER_ID between", value1, value2, "userId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andUserIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("USER_ID not between", value1, value2, "userId");
        return (SysLogCriteria) this;
    }
	public SysLogCriteria andLoginNameIsNull() {
        addCriterion("LOGIN_NAME is null");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLoginNameIsNotNull() {
        addCriterion("LOGIN_NAME is not null");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLoginNameEqualTo(java.lang.String value) {
        addCriterion("LOGIN_NAME =", value, "loginName");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLoginNameNotEqualTo(java.lang.String value) {
        addCriterion("LOGIN_NAME <>", value, "loginName");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLoginNameGreaterThan(java.lang.String value) {
        addCriterion("LOGIN_NAME >", value, "loginName");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLoginNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("LOGIN_NAME >=", value, "loginName");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLoginNameLessThan(java.lang.String value) {
        addCriterion("LOGIN_NAME <", value, "loginName");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLoginNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("LOGIN_NAME <=", value, "loginName");
        return (SysLogCriteria) this;
    }
    
    public SysLogCriteria andLoginNameLike(java.lang.String value) {
        addCriterion("LOGIN_NAME like", value, "loginName");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLoginNameNotLike(java.lang.String value) {
        addCriterion("LOGIN_NAME not like", value, "loginName");
        return (SysLogCriteria) this;
    }
    
    public SysLogCriteria andLoginNameIn(List<java.lang.String> values) {
        addCriterion("LOGIN_NAME in", values, "loginName");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLoginNameNotIn(List<java.lang.String> values) {
        addCriterion("LOGIN_NAME not in", values, "loginName");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLoginNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("LOGIN_NAME between", value1, value2, "loginName");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLoginNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("LOGIN_NAME not between", value1, value2, "loginName");
        return (SysLogCriteria) this;
    }
	public SysLogCriteria andUserNameIsNull() {
        addCriterion("USER_NAME is null");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andUserNameIsNotNull() {
        addCriterion("USER_NAME is not null");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andUserNameEqualTo(java.lang.String value) {
        addCriterion("USER_NAME =", value, "userName");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andUserNameNotEqualTo(java.lang.String value) {
        addCriterion("USER_NAME <>", value, "userName");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andUserNameGreaterThan(java.lang.String value) {
        addCriterion("USER_NAME >", value, "userName");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andUserNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("USER_NAME >=", value, "userName");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andUserNameLessThan(java.lang.String value) {
        addCriterion("USER_NAME <", value, "userName");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andUserNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("USER_NAME <=", value, "userName");
        return (SysLogCriteria) this;
    }
    
    public SysLogCriteria andUserNameLike(java.lang.String value) {
        addCriterion("USER_NAME like", value, "userName");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andUserNameNotLike(java.lang.String value) {
        addCriterion("USER_NAME not like", value, "userName");
        return (SysLogCriteria) this;
    }
    
    public SysLogCriteria andUserNameIn(List<java.lang.String> values) {
        addCriterion("USER_NAME in", values, "userName");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andUserNameNotIn(List<java.lang.String> values) {
        addCriterion("USER_NAME not in", values, "userName");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andUserNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("USER_NAME between", value1, value2, "userName");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andUserNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("USER_NAME not between", value1, value2, "userName");
        return (SysLogCriteria) this;
    }
	public SysLogCriteria andDeptIdIsNull() {
        addCriterion("DEPT_ID is null");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andDeptIdIsNotNull() {
        addCriterion("DEPT_ID is not null");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andDeptIdEqualTo(java.lang.String value) {
        addCriterion("DEPT_ID =", value, "deptId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andDeptIdNotEqualTo(java.lang.String value) {
        addCriterion("DEPT_ID <>", value, "deptId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andDeptIdGreaterThan(java.lang.String value) {
        addCriterion("DEPT_ID >", value, "deptId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andDeptIdGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("DEPT_ID >=", value, "deptId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andDeptIdLessThan(java.lang.String value) {
        addCriterion("DEPT_ID <", value, "deptId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andDeptIdLessThanOrEqualTo(java.lang.String value) {
        addCriterion("DEPT_ID <=", value, "deptId");
        return (SysLogCriteria) this;
    }
    
    public SysLogCriteria andDeptIdLike(java.lang.String value) {
        addCriterion("DEPT_ID like", value, "deptId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andDeptIdNotLike(java.lang.String value) {
        addCriterion("DEPT_ID not like", value, "deptId");
        return (SysLogCriteria) this;
    }
    
    public SysLogCriteria andDeptIdIn(List<java.lang.String> values) {
        addCriterion("DEPT_ID in", values, "deptId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andDeptIdNotIn(List<java.lang.String> values) {
        addCriterion("DEPT_ID not in", values, "deptId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andDeptIdBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DEPT_ID between", value1, value2, "deptId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andDeptIdNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DEPT_ID not between", value1, value2, "deptId");
        return (SysLogCriteria) this;
    }
	public SysLogCriteria andDeptNameIsNull() {
        addCriterion("DEPT_NAME is null");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andDeptNameIsNotNull() {
        addCriterion("DEPT_NAME is not null");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andDeptNameEqualTo(java.lang.String value) {
        addCriterion("DEPT_NAME =", value, "deptName");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andDeptNameNotEqualTo(java.lang.String value) {
        addCriterion("DEPT_NAME <>", value, "deptName");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andDeptNameGreaterThan(java.lang.String value) {
        addCriterion("DEPT_NAME >", value, "deptName");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andDeptNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("DEPT_NAME >=", value, "deptName");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andDeptNameLessThan(java.lang.String value) {
        addCriterion("DEPT_NAME <", value, "deptName");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andDeptNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("DEPT_NAME <=", value, "deptName");
        return (SysLogCriteria) this;
    }
    
    public SysLogCriteria andDeptNameLike(java.lang.String value) {
        addCriterion("DEPT_NAME like", value, "deptName");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andDeptNameNotLike(java.lang.String value) {
        addCriterion("DEPT_NAME not like", value, "deptName");
        return (SysLogCriteria) this;
    }
    
    public SysLogCriteria andDeptNameIn(List<java.lang.String> values) {
        addCriterion("DEPT_NAME in", values, "deptName");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andDeptNameNotIn(List<java.lang.String> values) {
        addCriterion("DEPT_NAME not in", values, "deptName");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andDeptNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DEPT_NAME between", value1, value2, "deptName");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andDeptNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DEPT_NAME not between", value1, value2, "deptName");
        return (SysLogCriteria) this;
    }
	public SysLogCriteria andLogDeptLevelIsNull() {
        addCriterion("LOG_DEPT_LEVEL is null");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogDeptLevelIsNotNull() {
        addCriterion("LOG_DEPT_LEVEL is not null");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogDeptLevelEqualTo(java.lang.String value) {
        addCriterion("LOG_DEPT_LEVEL =", value, "logDeptLevel");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogDeptLevelNotEqualTo(java.lang.String value) {
        addCriterion("LOG_DEPT_LEVEL <>", value, "logDeptLevel");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogDeptLevelGreaterThan(java.lang.String value) {
        addCriterion("LOG_DEPT_LEVEL >", value, "logDeptLevel");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogDeptLevelGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("LOG_DEPT_LEVEL >=", value, "logDeptLevel");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogDeptLevelLessThan(java.lang.String value) {
        addCriterion("LOG_DEPT_LEVEL <", value, "logDeptLevel");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogDeptLevelLessThanOrEqualTo(java.lang.String value) {
        addCriterion("LOG_DEPT_LEVEL <=", value, "logDeptLevel");
        return (SysLogCriteria) this;
    }
    
    public SysLogCriteria andLogDeptLevelLike(java.lang.String value) {
        addCriterion("LOG_DEPT_LEVEL like", value, "logDeptLevel");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogDeptLevelNotLike(java.lang.String value) {
        addCriterion("LOG_DEPT_LEVEL not like", value, "logDeptLevel");
        return (SysLogCriteria) this;
    }
    
    public SysLogCriteria andLogDeptLevelIn(List<java.lang.String> values) {
        addCriterion("LOG_DEPT_LEVEL in", values, "logDeptLevel");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogDeptLevelNotIn(List<java.lang.String> values) {
        addCriterion("LOG_DEPT_LEVEL not in", values, "logDeptLevel");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogDeptLevelBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("LOG_DEPT_LEVEL between", value1, value2, "logDeptLevel");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogDeptLevelNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("LOG_DEPT_LEVEL not between", value1, value2, "logDeptLevel");
        return (SysLogCriteria) this;
    }
	public SysLogCriteria andIpIsNull() {
        addCriterion("IP is null");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andIpIsNotNull() {
        addCriterion("IP is not null");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andIpEqualTo(java.lang.String value) {
        addCriterion("IP =", value, "ip");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andIpNotEqualTo(java.lang.String value) {
        addCriterion("IP <>", value, "ip");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andIpGreaterThan(java.lang.String value) {
        addCriterion("IP >", value, "ip");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andIpGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("IP >=", value, "ip");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andIpLessThan(java.lang.String value) {
        addCriterion("IP <", value, "ip");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andIpLessThanOrEqualTo(java.lang.String value) {
        addCriterion("IP <=", value, "ip");
        return (SysLogCriteria) this;
    }
    
    public SysLogCriteria andIpLike(java.lang.String value) {
        addCriterion("IP like", value, "ip");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andIpNotLike(java.lang.String value) {
        addCriterion("IP not like", value, "ip");
        return (SysLogCriteria) this;
    }
    
    public SysLogCriteria andIpIn(List<java.lang.String> values) {
        addCriterion("IP in", values, "ip");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andIpNotIn(List<java.lang.String> values) {
        addCriterion("IP not in", values, "ip");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andIpBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("IP between", value1, value2, "ip");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andIpNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("IP not between", value1, value2, "ip");
        return (SysLogCriteria) this;
    }
	public SysLogCriteria andLogTypeIsNull() {
        addCriterion("LOG_TYPE is null");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogTypeIsNotNull() {
        addCriterion("LOG_TYPE is not null");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogTypeEqualTo(java.lang.String value) {
        addCriterion("LOG_TYPE =", value, "logType");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogTypeNotEqualTo(java.lang.String value) {
        addCriterion("LOG_TYPE <>", value, "logType");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogTypeGreaterThan(java.lang.String value) {
        addCriterion("LOG_TYPE >", value, "logType");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogTypeGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("LOG_TYPE >=", value, "logType");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogTypeLessThan(java.lang.String value) {
        addCriterion("LOG_TYPE <", value, "logType");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogTypeLessThanOrEqualTo(java.lang.String value) {
        addCriterion("LOG_TYPE <=", value, "logType");
        return (SysLogCriteria) this;
    }
    
    public SysLogCriteria andLogTypeLike(java.lang.String value) {
        addCriterion("LOG_TYPE like", value, "logType");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogTypeNotLike(java.lang.String value) {
        addCriterion("LOG_TYPE not like", value, "logType");
        return (SysLogCriteria) this;
    }
    
    public SysLogCriteria andLogTypeIn(List<java.lang.String> values) {
        addCriterion("LOG_TYPE in", values, "logType");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogTypeNotIn(List<java.lang.String> values) {
        addCriterion("LOG_TYPE not in", values, "logType");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogTypeBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("LOG_TYPE between", value1, value2, "logType");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogTypeNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("LOG_TYPE not between", value1, value2, "logType");
        return (SysLogCriteria) this;
    }
	public SysLogCriteria andFunctionIdIsNull() {
        addCriterion("FUNCTION_ID is null");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andFunctionIdIsNotNull() {
        addCriterion("FUNCTION_ID is not null");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andFunctionIdEqualTo(java.lang.String value) {
        addCriterion("FUNCTION_ID =", value, "functionId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andFunctionIdNotEqualTo(java.lang.String value) {
        addCriterion("FUNCTION_ID <>", value, "functionId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andFunctionIdGreaterThan(java.lang.String value) {
        addCriterion("FUNCTION_ID >", value, "functionId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andFunctionIdGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("FUNCTION_ID >=", value, "functionId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andFunctionIdLessThan(java.lang.String value) {
        addCriterion("FUNCTION_ID <", value, "functionId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andFunctionIdLessThanOrEqualTo(java.lang.String value) {
        addCriterion("FUNCTION_ID <=", value, "functionId");
        return (SysLogCriteria) this;
    }
    
    public SysLogCriteria andFunctionIdLike(java.lang.String value) {
        addCriterion("FUNCTION_ID like", value, "functionId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andFunctionIdNotLike(java.lang.String value) {
        addCriterion("FUNCTION_ID not like", value, "functionId");
        return (SysLogCriteria) this;
    }
    
    public SysLogCriteria andFunctionIdIn(List<java.lang.String> values) {
        addCriterion("FUNCTION_ID in", values, "functionId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andFunctionIdNotIn(List<java.lang.String> values) {
        addCriterion("FUNCTION_ID not in", values, "functionId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andFunctionIdBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("FUNCTION_ID between", value1, value2, "functionId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andFunctionIdNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("FUNCTION_ID not between", value1, value2, "functionId");
        return (SysLogCriteria) this;
    }
	public SysLogCriteria andModelIdIsNull() {
        addCriterion("MODEL_ID is null");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andModelIdIsNotNull() {
        addCriterion("MODEL_ID is not null");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andModelIdEqualTo(java.lang.String value) {
        addCriterion("MODEL_ID =", value, "modelId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andModelIdNotEqualTo(java.lang.String value) {
        addCriterion("MODEL_ID <>", value, "modelId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andModelIdGreaterThan(java.lang.String value) {
        addCriterion("MODEL_ID >", value, "modelId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andModelIdGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("MODEL_ID >=", value, "modelId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andModelIdLessThan(java.lang.String value) {
        addCriterion("MODEL_ID <", value, "modelId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andModelIdLessThanOrEqualTo(java.lang.String value) {
        addCriterion("MODEL_ID <=", value, "modelId");
        return (SysLogCriteria) this;
    }
    
    public SysLogCriteria andModelIdLike(java.lang.String value) {
        addCriterion("MODEL_ID like", value, "modelId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andModelIdNotLike(java.lang.String value) {
        addCriterion("MODEL_ID not like", value, "modelId");
        return (SysLogCriteria) this;
    }
    
    public SysLogCriteria andModelIdIn(List<java.lang.String> values) {
        addCriterion("MODEL_ID in", values, "modelId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andModelIdNotIn(List<java.lang.String> values) {
        addCriterion("MODEL_ID not in", values, "modelId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andModelIdBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MODEL_ID between", value1, value2, "modelId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andModelIdNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MODEL_ID not between", value1, value2, "modelId");
        return (SysLogCriteria) this;
    }
	public SysLogCriteria andSubModelIdIsNull() {
        addCriterion("SUB_MODEL_ID is null");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andSubModelIdIsNotNull() {
        addCriterion("SUB_MODEL_ID is not null");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andSubModelIdEqualTo(java.lang.String value) {
        addCriterion("SUB_MODEL_ID =", value, "subModelId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andSubModelIdNotEqualTo(java.lang.String value) {
        addCriterion("SUB_MODEL_ID <>", value, "subModelId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andSubModelIdGreaterThan(java.lang.String value) {
        addCriterion("SUB_MODEL_ID >", value, "subModelId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andSubModelIdGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("SUB_MODEL_ID >=", value, "subModelId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andSubModelIdLessThan(java.lang.String value) {
        addCriterion("SUB_MODEL_ID <", value, "subModelId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andSubModelIdLessThanOrEqualTo(java.lang.String value) {
        addCriterion("SUB_MODEL_ID <=", value, "subModelId");
        return (SysLogCriteria) this;
    }
    
    public SysLogCriteria andSubModelIdLike(java.lang.String value) {
        addCriterion("SUB_MODEL_ID like", value, "subModelId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andSubModelIdNotLike(java.lang.String value) {
        addCriterion("SUB_MODEL_ID not like", value, "subModelId");
        return (SysLogCriteria) this;
    }
    
    public SysLogCriteria andSubModelIdIn(List<java.lang.String> values) {
        addCriterion("SUB_MODEL_ID in", values, "subModelId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andSubModelIdNotIn(List<java.lang.String> values) {
        addCriterion("SUB_MODEL_ID not in", values, "subModelId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andSubModelIdBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("SUB_MODEL_ID between", value1, value2, "subModelId");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andSubModelIdNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("SUB_MODEL_ID not between", value1, value2, "subModelId");
        return (SysLogCriteria) this;
    }
	public SysLogCriteria andOperTypeIsNull() {
        addCriterion("OPER_TYPE is null");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andOperTypeIsNotNull() {
        addCriterion("OPER_TYPE is not null");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andOperTypeEqualTo(java.lang.String value) {
        addCriterion("OPER_TYPE =", value, "operType");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andOperTypeNotEqualTo(java.lang.String value) {
        addCriterion("OPER_TYPE <>", value, "operType");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andOperTypeGreaterThan(java.lang.String value) {
        addCriterion("OPER_TYPE >", value, "operType");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andOperTypeGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("OPER_TYPE >=", value, "operType");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andOperTypeLessThan(java.lang.String value) {
        addCriterion("OPER_TYPE <", value, "operType");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andOperTypeLessThanOrEqualTo(java.lang.String value) {
        addCriterion("OPER_TYPE <=", value, "operType");
        return (SysLogCriteria) this;
    }
    
    public SysLogCriteria andOperTypeLike(java.lang.String value) {
        addCriterion("OPER_TYPE like", value, "operType");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andOperTypeNotLike(java.lang.String value) {
        addCriterion("OPER_TYPE not like", value, "operType");
        return (SysLogCriteria) this;
    }
    
    public SysLogCriteria andOperTypeIn(List<java.lang.String> values) {
        addCriterion("OPER_TYPE in", values, "operType");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andOperTypeNotIn(List<java.lang.String> values) {
        addCriterion("OPER_TYPE not in", values, "operType");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andOperTypeBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("OPER_TYPE between", value1, value2, "operType");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andOperTypeNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("OPER_TYPE not between", value1, value2, "operType");
        return (SysLogCriteria) this;
    }
	public SysLogCriteria andLogTimeIsNull() {
        addCriterion("LOG_TIME is null");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogTimeIsNotNull() {
        addCriterion("LOG_TIME is not null");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogTimeEqualTo(java.util.Date value) {
        addCriterion("LOG_TIME =", value, "logTime");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogTimeNotEqualTo(java.util.Date value) {
        addCriterion("LOG_TIME <>", value, "logTime");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogTimeGreaterThan(java.util.Date value) {
        addCriterion("LOG_TIME >", value, "logTime");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogTimeGreaterThanOrEqualTo(java.util.Date value) {
        addCriterion("LOG_TIME >=", value, "logTime");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogTimeLessThan(java.util.Date value) {
        addCriterion("LOG_TIME <", value, "logTime");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogTimeLessThanOrEqualTo(java.util.Date value) {
        addCriterion("LOG_TIME <=", value, "logTime");
        return (SysLogCriteria) this;
    }
    
    public SysLogCriteria andLogTimeIn(List<java.util.Date> values) {
        addCriterion("LOG_TIME in", values, "logTime");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogTimeNotIn(List<java.util.Date> values) {
        addCriterion("LOG_TIME not in", values, "logTime");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogTimeBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("LOG_TIME between", value1, value2, "logTime");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogTimeNotBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("LOG_TIME not between", value1, value2, "logTime");
        return (SysLogCriteria) this;
    }
	public SysLogCriteria andLogInfoIsNull() {
        addCriterion("LOG_INFO is null");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogInfoIsNotNull() {
        addCriterion("LOG_INFO is not null");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogInfoEqualTo(java.lang.String value) {
        addCriterion("LOG_INFO =", value, "logInfo");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogInfoNotEqualTo(java.lang.String value) {
        addCriterion("LOG_INFO <>", value, "logInfo");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogInfoGreaterThan(java.lang.String value) {
        addCriterion("LOG_INFO >", value, "logInfo");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogInfoGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("LOG_INFO >=", value, "logInfo");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogInfoLessThan(java.lang.String value) {
        addCriterion("LOG_INFO <", value, "logInfo");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogInfoLessThanOrEqualTo(java.lang.String value) {
        addCriterion("LOG_INFO <=", value, "logInfo");
        return (SysLogCriteria) this;
    }
    
    public SysLogCriteria andLogInfoLike(java.lang.String value) {
        addCriterion("LOG_INFO like", value, "logInfo");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogInfoNotLike(java.lang.String value) {
        addCriterion("LOG_INFO not like", value, "logInfo");
        return (SysLogCriteria) this;
    }
    
    public SysLogCriteria andLogInfoIn(List<java.lang.String> values) {
        addCriterion("LOG_INFO in", values, "logInfo");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogInfoNotIn(List<java.lang.String> values) {
        addCriterion("LOG_INFO not in", values, "logInfo");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogInfoBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("LOG_INFO between", value1, value2, "logInfo");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andLogInfoNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("LOG_INFO not between", value1, value2, "logInfo");
        return (SysLogCriteria) this;
    }
	public SysLogCriteria andCunitidIsNull() {
        addCriterion("CUNITID is null");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andCunitidIsNotNull() {
        addCriterion("CUNITID is not null");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andCunitidEqualTo(java.lang.String value) {
        addCriterion("CUNITID =", value, "cunitid");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andCunitidNotEqualTo(java.lang.String value) {
        addCriterion("CUNITID <>", value, "cunitid");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andCunitidGreaterThan(java.lang.String value) {
        addCriterion("CUNITID >", value, "cunitid");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andCunitidGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("CUNITID >=", value, "cunitid");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andCunitidLessThan(java.lang.String value) {
        addCriterion("CUNITID <", value, "cunitid");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andCunitidLessThanOrEqualTo(java.lang.String value) {
        addCriterion("CUNITID <=", value, "cunitid");
        return (SysLogCriteria) this;
    }
    
    public SysLogCriteria andCunitidLike(java.lang.String value) {
        addCriterion("CUNITID like", value, "cunitid");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andCunitidNotLike(java.lang.String value) {
        addCriterion("CUNITID not like", value, "cunitid");
        return (SysLogCriteria) this;
    }
    
    public SysLogCriteria andCunitidIn(List<java.lang.String> values) {
        addCriterion("CUNITID in", values, "cunitid");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andCunitidNotIn(List<java.lang.String> values) {
        addCriterion("CUNITID not in", values, "cunitid");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andCunitidBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("CUNITID between", value1, value2, "cunitid");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andCunitidNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("CUNITID not between", value1, value2, "cunitid");
        return (SysLogCriteria) this;
    }
	public SysLogCriteria andSunitidIsNull() {
        addCriterion("SUNITID is null");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andSunitidIsNotNull() {
        addCriterion("SUNITID is not null");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andSunitidEqualTo(java.lang.String value) {
        addCriterion("SUNITID =", value, "sunitid");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andSunitidNotEqualTo(java.lang.String value) {
        addCriterion("SUNITID <>", value, "sunitid");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andSunitidGreaterThan(java.lang.String value) {
        addCriterion("SUNITID >", value, "sunitid");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andSunitidGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("SUNITID >=", value, "sunitid");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andSunitidLessThan(java.lang.String value) {
        addCriterion("SUNITID <", value, "sunitid");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andSunitidLessThanOrEqualTo(java.lang.String value) {
        addCriterion("SUNITID <=", value, "sunitid");
        return (SysLogCriteria) this;
    }
    
    public SysLogCriteria andSunitidLike(java.lang.String value) {
        addCriterion("SUNITID like", value, "sunitid");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andSunitidNotLike(java.lang.String value) {
        addCriterion("SUNITID not like", value, "sunitid");
        return (SysLogCriteria) this;
    }
    
    public SysLogCriteria andSunitidIn(List<java.lang.String> values) {
        addCriterion("SUNITID in", values, "sunitid");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andSunitidNotIn(List<java.lang.String> values) {
        addCriterion("SUNITID not in", values, "sunitid");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andSunitidBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("SUNITID between", value1, value2, "sunitid");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andSunitidNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("SUNITID not between", value1, value2, "sunitid");
        return (SysLogCriteria) this;
    }
	public SysLogCriteria andTunitidIsNull() {
        addCriterion("TUNITID is null");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andTunitidIsNotNull() {
        addCriterion("TUNITID is not null");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andTunitidEqualTo(java.lang.String value) {
        addCriterion("TUNITID =", value, "tunitid");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andTunitidNotEqualTo(java.lang.String value) {
        addCriterion("TUNITID <>", value, "tunitid");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andTunitidGreaterThan(java.lang.String value) {
        addCriterion("TUNITID >", value, "tunitid");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andTunitidGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("TUNITID >=", value, "tunitid");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andTunitidLessThan(java.lang.String value) {
        addCriterion("TUNITID <", value, "tunitid");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andTunitidLessThanOrEqualTo(java.lang.String value) {
        addCriterion("TUNITID <=", value, "tunitid");
        return (SysLogCriteria) this;
    }
    
    public SysLogCriteria andTunitidLike(java.lang.String value) {
        addCriterion("TUNITID like", value, "tunitid");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andTunitidNotLike(java.lang.String value) {
        addCriterion("TUNITID not like", value, "tunitid");
        return (SysLogCriteria) this;
    }
    
    public SysLogCriteria andTunitidIn(List<java.lang.String> values) {
        addCriterion("TUNITID in", values, "tunitid");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andTunitidNotIn(List<java.lang.String> values) {
        addCriterion("TUNITID not in", values, "tunitid");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andTunitidBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("TUNITID between", value1, value2, "tunitid");
        return (SysLogCriteria) this;
    }

    public SysLogCriteria andTunitidNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("TUNITID not between", value1, value2, "tunitid");
        return (SysLogCriteria) this;
    }
}

