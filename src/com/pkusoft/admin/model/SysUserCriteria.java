package com.pkusoft.admin.model;

import java.util.List;

import com.pkusoft.framework.model.Criteria.BaseCriteria;

/**
 * 
 * @author 
 */
public class SysUserCriteria extends BaseCriteria {
	public SysUserCriteria andUserIdIsNull() {
        addCriterion("USER_ID is null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserIdIsNotNull() {
        addCriterion("USER_ID is not null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserIdEqualTo(java.lang.Long value) {
        addCriterion("USER_ID =", value, "userId");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserIdNotEqualTo(java.lang.Long value) {
        addCriterion("USER_ID <>", value, "userId");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserIdGreaterThan(java.lang.Long value) {
        addCriterion("USER_ID >", value, "userId");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("USER_ID >=", value, "userId");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserIdLessThan(java.lang.Long value) {
        addCriterion("USER_ID <", value, "userId");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("USER_ID <=", value, "userId");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andUserIdIn(List<java.lang.Long> values) {
        addCriterion("USER_ID in", values, "userId");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserIdNotIn(List<java.lang.Long> values) {
        addCriterion("USER_ID not in", values, "userId");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("USER_ID between", value1, value2, "userId");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("USER_ID not between", value1, value2, "userId");
        return (SysUserCriteria) this;
    }
	public SysUserCriteria andLoginNameIsNull() {
        addCriterion("LOGIN_NAME is null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andLoginNameIsNotNull() {
        addCriterion("LOGIN_NAME is not null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andLoginNameEqualTo(java.lang.String value) {
        addCriterion("LOGIN_NAME =", value, "loginName");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andLoginNameNotEqualTo(java.lang.String value) {
        addCriterion("LOGIN_NAME <>", value, "loginName");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andLoginNameGreaterThan(java.lang.String value) {
        addCriterion("LOGIN_NAME >", value, "loginName");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andLoginNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("LOGIN_NAME >=", value, "loginName");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andLoginNameLessThan(java.lang.String value) {
        addCriterion("LOGIN_NAME <", value, "loginName");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andLoginNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("LOGIN_NAME <=", value, "loginName");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andLoginNameLike(java.lang.String value) {
        addCriterion("LOGIN_NAME like", value, "loginName");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andLoginNameNotLike(java.lang.String value) {
        addCriterion("LOGIN_NAME not like", value, "loginName");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andLoginNameIn(List<java.lang.String> values) {
        addCriterion("LOGIN_NAME in", values, "loginName");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andLoginNameNotIn(List<java.lang.String> values) {
        addCriterion("LOGIN_NAME not in", values, "loginName");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andLoginNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("LOGIN_NAME between", value1, value2, "loginName");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andLoginNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("LOGIN_NAME not between", value1, value2, "loginName");
        return (SysUserCriteria) this;
    }
	public SysUserCriteria andUserNameIsNull() {
        addCriterion("USER_NAME is null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserNameIsNotNull() {
        addCriterion("USER_NAME is not null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserNameEqualTo(java.lang.String value) {
        addCriterion("USER_NAME =", value, "userName");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserNameNotEqualTo(java.lang.String value) {
        addCriterion("USER_NAME <>", value, "userName");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserNameGreaterThan(java.lang.String value) {
        addCriterion("USER_NAME >", value, "userName");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("USER_NAME >=", value, "userName");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserNameLessThan(java.lang.String value) {
        addCriterion("USER_NAME <", value, "userName");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("USER_NAME <=", value, "userName");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andUserNameLike(java.lang.String value) {
        addCriterion("USER_NAME like", value, "userName");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserNameNotLike(java.lang.String value) {
        addCriterion("USER_NAME not like", value, "userName");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andUserNameIn(List<java.lang.String> values) {
        addCriterion("USER_NAME in", values, "userName");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserNameNotIn(List<java.lang.String> values) {
        addCriterion("USER_NAME not in", values, "userName");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("USER_NAME between", value1, value2, "userName");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("USER_NAME not between", value1, value2, "userName");
        return (SysUserCriteria) this;
    }
	public SysUserCriteria andPoliceCodeIsNull() {
        addCriterion("POLICE_CODE is null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andPoliceCodeIsNotNull() {
        addCriterion("POLICE_CODE is not null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andPoliceCodeEqualTo(java.lang.String value) {
        addCriterion("POLICE_CODE =", value, "policeCode");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andPoliceCodeNotEqualTo(java.lang.String value) {
        addCriterion("POLICE_CODE <>", value, "policeCode");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andPoliceCodeGreaterThan(java.lang.String value) {
        addCriterion("POLICE_CODE >", value, "policeCode");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andPoliceCodeGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("POLICE_CODE >=", value, "policeCode");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andPoliceCodeLessThan(java.lang.String value) {
        addCriterion("POLICE_CODE <", value, "policeCode");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andPoliceCodeLessThanOrEqualTo(java.lang.String value) {
        addCriterion("POLICE_CODE <=", value, "policeCode");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andPoliceCodeLike(java.lang.String value) {
        addCriterion("POLICE_CODE like", value, "policeCode");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andPoliceCodeNotLike(java.lang.String value) {
        addCriterion("POLICE_CODE not like", value, "policeCode");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andPoliceCodeIn(List<java.lang.String> values) {
        addCriterion("POLICE_CODE in", values, "policeCode");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andPoliceCodeNotIn(List<java.lang.String> values) {
        addCriterion("POLICE_CODE not in", values, "policeCode");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andPoliceCodeBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("POLICE_CODE between", value1, value2, "policeCode");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andPoliceCodeNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("POLICE_CODE not between", value1, value2, "policeCode");
        return (SysUserCriteria) this;
    }
	public SysUserCriteria andPasswordIsNull() {
        addCriterion("PASSWORD is null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andPasswordIsNotNull() {
        addCriterion("PASSWORD is not null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andPasswordEqualTo(java.lang.String value) {
        addCriterion("PASSWORD =", value, "password");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andPasswordNotEqualTo(java.lang.String value) {
        addCriterion("PASSWORD <>", value, "password");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andPasswordGreaterThan(java.lang.String value) {
        addCriterion("PASSWORD >", value, "password");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andPasswordGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("PASSWORD >=", value, "password");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andPasswordLessThan(java.lang.String value) {
        addCriterion("PASSWORD <", value, "password");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andPasswordLessThanOrEqualTo(java.lang.String value) {
        addCriterion("PASSWORD <=", value, "password");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andPasswordLike(java.lang.String value) {
        addCriterion("PASSWORD like", value, "password");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andPasswordNotLike(java.lang.String value) {
        addCriterion("PASSWORD not like", value, "password");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andPasswordIn(List<java.lang.String> values) {
        addCriterion("PASSWORD in", values, "password");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andPasswordNotIn(List<java.lang.String> values) {
        addCriterion("PASSWORD not in", values, "password");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andPasswordBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("PASSWORD between", value1, value2, "password");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andPasswordNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("PASSWORD not between", value1, value2, "password");
        return (SysUserCriteria) this;
    }
	public SysUserCriteria andSaltIsNull() {
        addCriterion("SALT is null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andSaltIsNotNull() {
        addCriterion("SALT is not null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andSaltEqualTo(java.lang.String value) {
        addCriterion("SALT =", value, "salt");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andSaltNotEqualTo(java.lang.String value) {
        addCriterion("SALT <>", value, "salt");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andSaltGreaterThan(java.lang.String value) {
        addCriterion("SALT >", value, "salt");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andSaltGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("SALT >=", value, "salt");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andSaltLessThan(java.lang.String value) {
        addCriterion("SALT <", value, "salt");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andSaltLessThanOrEqualTo(java.lang.String value) {
        addCriterion("SALT <=", value, "salt");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andSaltLike(java.lang.String value) {
        addCriterion("SALT like", value, "salt");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andSaltNotLike(java.lang.String value) {
        addCriterion("SALT not like", value, "salt");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andSaltIn(List<java.lang.String> values) {
        addCriterion("SALT in", values, "salt");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andSaltNotIn(List<java.lang.String> values) {
        addCriterion("SALT not in", values, "salt");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andSaltBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("SALT between", value1, value2, "salt");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andSaltNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("SALT not between", value1, value2, "salt");
        return (SysUserCriteria) this;
    }
	public SysUserCriteria andDeptIdIsNull() {
        addCriterion("DEPT_ID is null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andDeptIdIsNotNull() {
        addCriterion("DEPT_ID is not null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andDeptIdEqualTo(java.lang.String value) {
        addCriterion("DEPT_ID =", value, "deptId");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andDeptIdNotEqualTo(java.lang.String value) {
        addCriterion("DEPT_ID <>", value, "deptId");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andDeptIdGreaterThan(java.lang.String value) {
        addCriterion("DEPT_ID >", value, "deptId");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andDeptIdGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("DEPT_ID >=", value, "deptId");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andDeptIdLessThan(java.lang.String value) {
        addCriterion("DEPT_ID <", value, "deptId");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andDeptIdLessThanOrEqualTo(java.lang.String value) {
        addCriterion("DEPT_ID <=", value, "deptId");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andDeptIdLike(java.lang.String value) {
        addCriterion("DEPT_ID like", value, "deptId");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andDeptIdNotLike(java.lang.String value) {
        addCriterion("DEPT_ID not like", value, "deptId");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andDeptIdIn(List<java.lang.String> values) {
        addCriterion("DEPT_ID in", values, "deptId");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andDeptIdNotIn(List<java.lang.String> values) {
        addCriterion("DEPT_ID not in", values, "deptId");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andDeptIdBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DEPT_ID between", value1, value2, "deptId");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andDeptIdNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DEPT_ID not between", value1, value2, "deptId");
        return (SysUserCriteria) this;
    }
	public SysUserCriteria andUserLevelIsNull() {
        addCriterion("USER_LEVEL is null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserLevelIsNotNull() {
        addCriterion("USER_LEVEL is not null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserLevelEqualTo(java.lang.String value) {
        addCriterion("USER_LEVEL =", value, "userLevel");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserLevelNotEqualTo(java.lang.String value) {
        addCriterion("USER_LEVEL <>", value, "userLevel");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserLevelGreaterThan(java.lang.String value) {
        addCriterion("USER_LEVEL >", value, "userLevel");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserLevelGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("USER_LEVEL >=", value, "userLevel");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserLevelLessThan(java.lang.String value) {
        addCriterion("USER_LEVEL <", value, "userLevel");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserLevelLessThanOrEqualTo(java.lang.String value) {
        addCriterion("USER_LEVEL <=", value, "userLevel");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andUserLevelLike(java.lang.String value) {
        addCriterion("USER_LEVEL like", value, "userLevel");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserLevelNotLike(java.lang.String value) {
        addCriterion("USER_LEVEL not like", value, "userLevel");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andUserLevelIn(List<java.lang.String> values) {
        addCriterion("USER_LEVEL in", values, "userLevel");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserLevelNotIn(List<java.lang.String> values) {
        addCriterion("USER_LEVEL not in", values, "userLevel");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserLevelBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("USER_LEVEL between", value1, value2, "userLevel");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserLevelNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("USER_LEVEL not between", value1, value2, "userLevel");
        return (SysUserCriteria) this;
    }
	public SysUserCriteria andStatusIsNull() {
        addCriterion("STATUS is null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andStatusIsNotNull() {
        addCriterion("STATUS is not null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andStatusEqualTo(java.lang.String value) {
        addCriterion("STATUS =", value, "status");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andStatusNotEqualTo(java.lang.String value) {
        addCriterion("STATUS <>", value, "status");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andStatusGreaterThan(java.lang.String value) {
        addCriterion("STATUS >", value, "status");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andStatusGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("STATUS >=", value, "status");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andStatusLessThan(java.lang.String value) {
        addCriterion("STATUS <", value, "status");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andStatusLessThanOrEqualTo(java.lang.String value) {
        addCriterion("STATUS <=", value, "status");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andStatusLike(java.lang.String value) {
        addCriterion("STATUS like", value, "status");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andStatusNotLike(java.lang.String value) {
        addCriterion("STATUS not like", value, "status");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andStatusIn(List<java.lang.String> values) {
        addCriterion("STATUS in", values, "status");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andStatusNotIn(List<java.lang.String> values) {
        addCriterion("STATUS not in", values, "status");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andStatusBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("STATUS between", value1, value2, "status");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andStatusNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("STATUS not between", value1, value2, "status");
        return (SysUserCriteria) this;
    }
	public SysUserCriteria andUserTypeIsNull() {
        addCriterion("USER_TYPE is null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserTypeIsNotNull() {
        addCriterion("USER_TYPE is not null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserTypeEqualTo(java.lang.String value) {
        addCriterion("USER_TYPE =", value, "userType");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserTypeNotEqualTo(java.lang.String value) {
        addCriterion("USER_TYPE <>", value, "userType");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserTypeGreaterThan(java.lang.String value) {
        addCriterion("USER_TYPE >", value, "userType");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserTypeGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("USER_TYPE >=", value, "userType");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserTypeLessThan(java.lang.String value) {
        addCriterion("USER_TYPE <", value, "userType");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserTypeLessThanOrEqualTo(java.lang.String value) {
        addCriterion("USER_TYPE <=", value, "userType");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andUserTypeLike(java.lang.String value) {
        addCriterion("USER_TYPE like", value, "userType");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserTypeNotLike(java.lang.String value) {
        addCriterion("USER_TYPE not like", value, "userType");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andUserTypeIn(List<java.lang.String> values) {
        addCriterion("USER_TYPE in", values, "userType");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserTypeNotIn(List<java.lang.String> values) {
        addCriterion("USER_TYPE not in", values, "userType");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserTypeBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("USER_TYPE between", value1, value2, "userType");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andUserTypeNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("USER_TYPE not between", value1, value2, "userType");
        return (SysUserCriteria) this;
    }
	public SysUserCriteria andEmailIsNull() {
        addCriterion("EMAIL is null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andEmailIsNotNull() {
        addCriterion("EMAIL is not null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andEmailEqualTo(java.lang.String value) {
        addCriterion("EMAIL =", value, "email");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andEmailNotEqualTo(java.lang.String value) {
        addCriterion("EMAIL <>", value, "email");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andEmailGreaterThan(java.lang.String value) {
        addCriterion("EMAIL >", value, "email");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andEmailGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("EMAIL >=", value, "email");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andEmailLessThan(java.lang.String value) {
        addCriterion("EMAIL <", value, "email");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andEmailLessThanOrEqualTo(java.lang.String value) {
        addCriterion("EMAIL <=", value, "email");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andEmailLike(java.lang.String value) {
        addCriterion("EMAIL like", value, "email");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andEmailNotLike(java.lang.String value) {
        addCriterion("EMAIL not like", value, "email");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andEmailIn(List<java.lang.String> values) {
        addCriterion("EMAIL in", values, "email");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andEmailNotIn(List<java.lang.String> values) {
        addCriterion("EMAIL not in", values, "email");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andEmailBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("EMAIL between", value1, value2, "email");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andEmailNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("EMAIL not between", value1, value2, "email");
        return (SysUserCriteria) this;
    }
	public SysUserCriteria andTelIsNull() {
        addCriterion("TEL is null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andTelIsNotNull() {
        addCriterion("TEL is not null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andTelEqualTo(java.lang.String value) {
        addCriterion("TEL =", value, "tel");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andTelNotEqualTo(java.lang.String value) {
        addCriterion("TEL <>", value, "tel");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andTelGreaterThan(java.lang.String value) {
        addCriterion("TEL >", value, "tel");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andTelGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("TEL >=", value, "tel");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andTelLessThan(java.lang.String value) {
        addCriterion("TEL <", value, "tel");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andTelLessThanOrEqualTo(java.lang.String value) {
        addCriterion("TEL <=", value, "tel");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andTelLike(java.lang.String value) {
        addCriterion("TEL like", value, "tel");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andTelNotLike(java.lang.String value) {
        addCriterion("TEL not like", value, "tel");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andTelIn(List<java.lang.String> values) {
        addCriterion("TEL in", values, "tel");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andTelNotIn(List<java.lang.String> values) {
        addCriterion("TEL not in", values, "tel");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andTelBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("TEL between", value1, value2, "tel");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andTelNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("TEL not between", value1, value2, "tel");
        return (SysUserCriteria) this;
    }
	public SysUserCriteria andMobileIsNull() {
        addCriterion("MOBILE is null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andMobileIsNotNull() {
        addCriterion("MOBILE is not null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andMobileEqualTo(java.lang.String value) {
        addCriterion("MOBILE =", value, "mobile");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andMobileNotEqualTo(java.lang.String value) {
        addCriterion("MOBILE <>", value, "mobile");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andMobileGreaterThan(java.lang.String value) {
        addCriterion("MOBILE >", value, "mobile");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andMobileGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("MOBILE >=", value, "mobile");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andMobileLessThan(java.lang.String value) {
        addCriterion("MOBILE <", value, "mobile");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andMobileLessThanOrEqualTo(java.lang.String value) {
        addCriterion("MOBILE <=", value, "mobile");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andMobileLike(java.lang.String value) {
        addCriterion("MOBILE like", value, "mobile");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andMobileNotLike(java.lang.String value) {
        addCriterion("MOBILE not like", value, "mobile");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andMobileIn(List<java.lang.String> values) {
        addCriterion("MOBILE in", values, "mobile");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andMobileNotIn(List<java.lang.String> values) {
        addCriterion("MOBILE not in", values, "mobile");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andMobileBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MOBILE between", value1, value2, "mobile");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andMobileNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MOBILE not between", value1, value2, "mobile");
        return (SysUserCriteria) this;
    }
	public SysUserCriteria andIdcardIsNull() {
        addCriterion("IDCARD is null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andIdcardIsNotNull() {
        addCriterion("IDCARD is not null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andIdcardEqualTo(java.lang.String value) {
        addCriterion("IDCARD =", value, "idcard");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andIdcardNotEqualTo(java.lang.String value) {
        addCriterion("IDCARD <>", value, "idcard");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andIdcardGreaterThan(java.lang.String value) {
        addCriterion("IDCARD >", value, "idcard");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andIdcardGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("IDCARD >=", value, "idcard");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andIdcardLessThan(java.lang.String value) {
        addCriterion("IDCARD <", value, "idcard");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andIdcardLessThanOrEqualTo(java.lang.String value) {
        addCriterion("IDCARD <=", value, "idcard");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andIdcardLike(java.lang.String value) {
        addCriterion("IDCARD like", value, "idcard");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andIdcardNotLike(java.lang.String value) {
        addCriterion("IDCARD not like", value, "idcard");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andIdcardIn(List<java.lang.String> values) {
        addCriterion("IDCARD in", values, "idcard");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andIdcardNotIn(List<java.lang.String> values) {
        addCriterion("IDCARD not in", values, "idcard");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andIdcardBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("IDCARD between", value1, value2, "idcard");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andIdcardNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("IDCARD not between", value1, value2, "idcard");
        return (SysUserCriteria) this;
    }
	public SysUserCriteria andCertificateIsNull() {
        addCriterion("CERTIFICATE is null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andCertificateIsNotNull() {
        addCriterion("CERTIFICATE is not null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andCertificateEqualTo(java.lang.String value) {
        addCriterion("CERTIFICATE =", value, "certificate");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andCertificateNotEqualTo(java.lang.String value) {
        addCriterion("CERTIFICATE <>", value, "certificate");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andCertificateGreaterThan(java.lang.String value) {
        addCriterion("CERTIFICATE >", value, "certificate");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andCertificateGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("CERTIFICATE >=", value, "certificate");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andCertificateLessThan(java.lang.String value) {
        addCriterion("CERTIFICATE <", value, "certificate");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andCertificateLessThanOrEqualTo(java.lang.String value) {
        addCriterion("CERTIFICATE <=", value, "certificate");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andCertificateLike(java.lang.String value) {
        addCriterion("CERTIFICATE like", value, "certificate");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andCertificateNotLike(java.lang.String value) {
        addCriterion("CERTIFICATE not like", value, "certificate");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andCertificateIn(List<java.lang.String> values) {
        addCriterion("CERTIFICATE in", values, "certificate");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andCertificateNotIn(List<java.lang.String> values) {
        addCriterion("CERTIFICATE not in", values, "certificate");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andCertificateBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("CERTIFICATE between", value1, value2, "certificate");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andCertificateNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("CERTIFICATE not between", value1, value2, "certificate");
        return (SysUserCriteria) this;
    }
	public SysUserCriteria andCunitidIsNull() {
        addCriterion("CUNITID is null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andCunitidIsNotNull() {
        addCriterion("CUNITID is not null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andCunitidEqualTo(java.lang.String value) {
        addCriterion("CUNITID =", value, "cunitid");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andCunitidNotEqualTo(java.lang.String value) {
        addCriterion("CUNITID <>", value, "cunitid");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andCunitidGreaterThan(java.lang.String value) {
        addCriterion("CUNITID >", value, "cunitid");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andCunitidGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("CUNITID >=", value, "cunitid");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andCunitidLessThan(java.lang.String value) {
        addCriterion("CUNITID <", value, "cunitid");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andCunitidLessThanOrEqualTo(java.lang.String value) {
        addCriterion("CUNITID <=", value, "cunitid");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andCunitidLike(java.lang.String value) {
        addCriterion("CUNITID like", value, "cunitid");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andCunitidNotLike(java.lang.String value) {
        addCriterion("CUNITID not like", value, "cunitid");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andCunitidIn(List<java.lang.String> values) {
        addCriterion("CUNITID in", values, "cunitid");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andCunitidNotIn(List<java.lang.String> values) {
        addCriterion("CUNITID not in", values, "cunitid");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andCunitidBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("CUNITID between", value1, value2, "cunitid");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andCunitidNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("CUNITID not between", value1, value2, "cunitid");
        return (SysUserCriteria) this;
    }
	public SysUserCriteria andSunitidIsNull() {
        addCriterion("SUNITID is null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andSunitidIsNotNull() {
        addCriterion("SUNITID is not null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andSunitidEqualTo(java.lang.String value) {
        addCriterion("SUNITID =", value, "sunitid");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andSunitidNotEqualTo(java.lang.String value) {
        addCriterion("SUNITID <>", value, "sunitid");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andSunitidGreaterThan(java.lang.String value) {
        addCriterion("SUNITID >", value, "sunitid");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andSunitidGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("SUNITID >=", value, "sunitid");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andSunitidLessThan(java.lang.String value) {
        addCriterion("SUNITID <", value, "sunitid");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andSunitidLessThanOrEqualTo(java.lang.String value) {
        addCriterion("SUNITID <=", value, "sunitid");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andSunitidLike(java.lang.String value) {
        addCriterion("SUNITID like", value, "sunitid");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andSunitidNotLike(java.lang.String value) {
        addCriterion("SUNITID not like", value, "sunitid");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andSunitidIn(List<java.lang.String> values) {
        addCriterion("SUNITID in", values, "sunitid");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andSunitidNotIn(List<java.lang.String> values) {
        addCriterion("SUNITID not in", values, "sunitid");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andSunitidBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("SUNITID between", value1, value2, "sunitid");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andSunitidNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("SUNITID not between", value1, value2, "sunitid");
        return (SysUserCriteria) this;
    }
	public SysUserCriteria andTunitidIsNull() {
        addCriterion("TUNITID is null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andTunitidIsNotNull() {
        addCriterion("TUNITID is not null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andTunitidEqualTo(java.lang.String value) {
        addCriterion("TUNITID =", value, "tunitid");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andTunitidNotEqualTo(java.lang.String value) {
        addCriterion("TUNITID <>", value, "tunitid");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andTunitidGreaterThan(java.lang.String value) {
        addCriterion("TUNITID >", value, "tunitid");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andTunitidGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("TUNITID >=", value, "tunitid");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andTunitidLessThan(java.lang.String value) {
        addCriterion("TUNITID <", value, "tunitid");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andTunitidLessThanOrEqualTo(java.lang.String value) {
        addCriterion("TUNITID <=", value, "tunitid");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andTunitidLike(java.lang.String value) {
        addCriterion("TUNITID like", value, "tunitid");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andTunitidNotLike(java.lang.String value) {
        addCriterion("TUNITID not like", value, "tunitid");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andTunitidIn(List<java.lang.String> values) {
        addCriterion("TUNITID in", values, "tunitid");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andTunitidNotIn(List<java.lang.String> values) {
        addCriterion("TUNITID not in", values, "tunitid");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andTunitidBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("TUNITID between", value1, value2, "tunitid");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andTunitidNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("TUNITID not between", value1, value2, "tunitid");
        return (SysUserCriteria) this;
    }
	public SysUserCriteria andReserve1IsNull() {
        addCriterion("RESERVE1 is null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve1IsNotNull() {
        addCriterion("RESERVE1 is not null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve1EqualTo(java.lang.String value) {
        addCriterion("RESERVE1 =", value, "reserve1");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve1NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 <>", value, "reserve1");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve1GreaterThan(java.lang.String value) {
        addCriterion("RESERVE1 >", value, "reserve1");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve1GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 >=", value, "reserve1");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve1LessThan(java.lang.String value) {
        addCriterion("RESERVE1 <", value, "reserve1");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve1LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 <=", value, "reserve1");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andReserve1Like(java.lang.String value) {
        addCriterion("RESERVE1 like", value, "reserve1");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve1NotLike(java.lang.String value) {
        addCriterion("RESERVE1 not like", value, "reserve1");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andReserve1In(List<java.lang.String> values) {
        addCriterion("RESERVE1 in", values, "reserve1");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve1NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE1 not in", values, "reserve1");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve1Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE1 between", value1, value2, "reserve1");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve1NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE1 not between", value1, value2, "reserve1");
        return (SysUserCriteria) this;
    }
	public SysUserCriteria andReserve2IsNull() {
        addCriterion("RESERVE2 is null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve2IsNotNull() {
        addCriterion("RESERVE2 is not null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve2EqualTo(java.lang.String value) {
        addCriterion("RESERVE2 =", value, "reserve2");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve2NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 <>", value, "reserve2");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve2GreaterThan(java.lang.String value) {
        addCriterion("RESERVE2 >", value, "reserve2");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve2GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 >=", value, "reserve2");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve2LessThan(java.lang.String value) {
        addCriterion("RESERVE2 <", value, "reserve2");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve2LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 <=", value, "reserve2");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andReserve2Like(java.lang.String value) {
        addCriterion("RESERVE2 like", value, "reserve2");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve2NotLike(java.lang.String value) {
        addCriterion("RESERVE2 not like", value, "reserve2");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andReserve2In(List<java.lang.String> values) {
        addCriterion("RESERVE2 in", values, "reserve2");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve2NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE2 not in", values, "reserve2");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve2Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE2 between", value1, value2, "reserve2");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve2NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE2 not between", value1, value2, "reserve2");
        return (SysUserCriteria) this;
    }
	public SysUserCriteria andReserve3IsNull() {
        addCriterion("RESERVE3 is null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve3IsNotNull() {
        addCriterion("RESERVE3 is not null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve3EqualTo(java.lang.String value) {
        addCriterion("RESERVE3 =", value, "reserve3");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve3NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 <>", value, "reserve3");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve3GreaterThan(java.lang.String value) {
        addCriterion("RESERVE3 >", value, "reserve3");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve3GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 >=", value, "reserve3");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve3LessThan(java.lang.String value) {
        addCriterion("RESERVE3 <", value, "reserve3");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve3LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 <=", value, "reserve3");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andReserve3Like(java.lang.String value) {
        addCriterion("RESERVE3 like", value, "reserve3");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve3NotLike(java.lang.String value) {
        addCriterion("RESERVE3 not like", value, "reserve3");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andReserve3In(List<java.lang.String> values) {
        addCriterion("RESERVE3 in", values, "reserve3");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve3NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE3 not in", values, "reserve3");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve3Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE3 between", value1, value2, "reserve3");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve3NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE3 not between", value1, value2, "reserve3");
        return (SysUserCriteria) this;
    }
	public SysUserCriteria andReserve4IsNull() {
        addCriterion("RESERVE4 is null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve4IsNotNull() {
        addCriterion("RESERVE4 is not null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve4EqualTo(java.lang.String value) {
        addCriterion("RESERVE4 =", value, "reserve4");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve4NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 <>", value, "reserve4");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve4GreaterThan(java.lang.String value) {
        addCriterion("RESERVE4 >", value, "reserve4");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve4GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 >=", value, "reserve4");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve4LessThan(java.lang.String value) {
        addCriterion("RESERVE4 <", value, "reserve4");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve4LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 <=", value, "reserve4");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andReserve4Like(java.lang.String value) {
        addCriterion("RESERVE4 like", value, "reserve4");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve4NotLike(java.lang.String value) {
        addCriterion("RESERVE4 not like", value, "reserve4");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andReserve4In(List<java.lang.String> values) {
        addCriterion("RESERVE4 in", values, "reserve4");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve4NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE4 not in", values, "reserve4");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve4Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE4 between", value1, value2, "reserve4");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve4NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE4 not between", value1, value2, "reserve4");
        return (SysUserCriteria) this;
    }
	public SysUserCriteria andReserve5IsNull() {
        addCriterion("RESERVE5 is null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve5IsNotNull() {
        addCriterion("RESERVE5 is not null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve5EqualTo(java.lang.String value) {
        addCriterion("RESERVE5 =", value, "reserve5");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve5NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 <>", value, "reserve5");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve5GreaterThan(java.lang.String value) {
        addCriterion("RESERVE5 >", value, "reserve5");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve5GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 >=", value, "reserve5");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve5LessThan(java.lang.String value) {
        addCriterion("RESERVE5 <", value, "reserve5");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve5LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 <=", value, "reserve5");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andReserve5Like(java.lang.String value) {
        addCriterion("RESERVE5 like", value, "reserve5");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve5NotLike(java.lang.String value) {
        addCriterion("RESERVE5 not like", value, "reserve5");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andReserve5In(List<java.lang.String> values) {
        addCriterion("RESERVE5 in", values, "reserve5");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve5NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE5 not in", values, "reserve5");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve5Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE5 between", value1, value2, "reserve5");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andReserve5NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE5 not between", value1, value2, "reserve5");
        return (SysUserCriteria) this;
    }
	public SysUserCriteria andMemoIsNull() {
        addCriterion("MEMO is null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andMemoIsNotNull() {
        addCriterion("MEMO is not null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andMemoEqualTo(java.lang.String value) {
        addCriterion("MEMO =", value, "memo");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andMemoNotEqualTo(java.lang.String value) {
        addCriterion("MEMO <>", value, "memo");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andMemoGreaterThan(java.lang.String value) {
        addCriterion("MEMO >", value, "memo");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andMemoGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("MEMO >=", value, "memo");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andMemoLessThan(java.lang.String value) {
        addCriterion("MEMO <", value, "memo");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andMemoLessThanOrEqualTo(java.lang.String value) {
        addCriterion("MEMO <=", value, "memo");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andMemoLike(java.lang.String value) {
        addCriterion("MEMO like", value, "memo");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andMemoNotLike(java.lang.String value) {
        addCriterion("MEMO not like", value, "memo");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andMemoIn(List<java.lang.String> values) {
        addCriterion("MEMO in", values, "memo");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andMemoNotIn(List<java.lang.String> values) {
        addCriterion("MEMO not in", values, "memo");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andMemoBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MEMO between", value1, value2, "memo");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andMemoNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MEMO not between", value1, value2, "memo");
        return (SysUserCriteria) this;
    }
	public SysUserCriteria andAddUserIdIsNull() {
        addCriterion("ADD_USER_ID is null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andAddUserIdIsNotNull() {
        addCriterion("ADD_USER_ID is not null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andAddUserIdEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID =", value, "addUserId");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andAddUserIdNotEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID <>", value, "addUserId");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andAddUserIdGreaterThan(java.lang.Long value) {
        addCriterion("ADD_USER_ID >", value, "addUserId");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andAddUserIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID >=", value, "addUserId");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andAddUserIdLessThan(java.lang.Long value) {
        addCriterion("ADD_USER_ID <", value, "addUserId");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andAddUserIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID <=", value, "addUserId");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andAddUserIdIn(List<java.lang.Long> values) {
        addCriterion("ADD_USER_ID in", values, "addUserId");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andAddUserIdNotIn(List<java.lang.Long> values) {
        addCriterion("ADD_USER_ID not in", values, "addUserId");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andAddUserIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ADD_USER_ID between", value1, value2, "addUserId");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andAddUserIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ADD_USER_ID not between", value1, value2, "addUserId");
        return (SysUserCriteria) this;
    }
	public SysUserCriteria andAddUserNameIsNull() {
        addCriterion("ADD_USER_NAME is null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andAddUserNameIsNotNull() {
        addCriterion("ADD_USER_NAME is not null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andAddUserNameEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME =", value, "addUserName");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andAddUserNameNotEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME <>", value, "addUserName");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andAddUserNameGreaterThan(java.lang.String value) {
        addCriterion("ADD_USER_NAME >", value, "addUserName");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andAddUserNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME >=", value, "addUserName");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andAddUserNameLessThan(java.lang.String value) {
        addCriterion("ADD_USER_NAME <", value, "addUserName");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andAddUserNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME <=", value, "addUserName");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andAddUserNameLike(java.lang.String value) {
        addCriterion("ADD_USER_NAME like", value, "addUserName");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andAddUserNameNotLike(java.lang.String value) {
        addCriterion("ADD_USER_NAME not like", value, "addUserName");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andAddUserNameIn(List<java.lang.String> values) {
        addCriterion("ADD_USER_NAME in", values, "addUserName");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andAddUserNameNotIn(List<java.lang.String> values) {
        addCriterion("ADD_USER_NAME not in", values, "addUserName");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andAddUserNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ADD_USER_NAME between", value1, value2, "addUserName");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andAddUserNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ADD_USER_NAME not between", value1, value2, "addUserName");
        return (SysUserCriteria) this;
    }
	public SysUserCriteria andAddTimeIsNull() {
        addCriterion("ADD_TIME is null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andAddTimeIsNotNull() {
        addCriterion("ADD_TIME is not null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andAddTimeEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME =", value, "addTime");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andAddTimeNotEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME <>", value, "addTime");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andAddTimeGreaterThan(java.util.Date value) {
        addCriterion("ADD_TIME >", value, "addTime");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andAddTimeGreaterThanOrEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME >=", value, "addTime");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andAddTimeLessThan(java.util.Date value) {
        addCriterion("ADD_TIME <", value, "addTime");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andAddTimeLessThanOrEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME <=", value, "addTime");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andAddTimeIn(List<java.util.Date> values) {
        addCriterion("ADD_TIME in", values, "addTime");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andAddTimeNotIn(List<java.util.Date> values) {
        addCriterion("ADD_TIME not in", values, "addTime");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andAddTimeBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("ADD_TIME between", value1, value2, "addTime");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andAddTimeNotBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("ADD_TIME not between", value1, value2, "addTime");
        return (SysUserCriteria) this;
    }
	public SysUserCriteria andModifyUserIdIsNull() {
        addCriterion("MODIFY_USER_ID is null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andModifyUserIdIsNotNull() {
        addCriterion("MODIFY_USER_ID is not null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andModifyUserIdEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID =", value, "modifyUserId");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andModifyUserIdNotEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID <>", value, "modifyUserId");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andModifyUserIdGreaterThan(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID >", value, "modifyUserId");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andModifyUserIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID >=", value, "modifyUserId");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andModifyUserIdLessThan(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID <", value, "modifyUserId");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andModifyUserIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID <=", value, "modifyUserId");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andModifyUserIdIn(List<java.lang.Long> values) {
        addCriterion("MODIFY_USER_ID in", values, "modifyUserId");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andModifyUserIdNotIn(List<java.lang.Long> values) {
        addCriterion("MODIFY_USER_ID not in", values, "modifyUserId");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andModifyUserIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("MODIFY_USER_ID between", value1, value2, "modifyUserId");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andModifyUserIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("MODIFY_USER_ID not between", value1, value2, "modifyUserId");
        return (SysUserCriteria) this;
    }
	public SysUserCriteria andModifyUserNameIsNull() {
        addCriterion("MODIFY_USER_NAME is null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andModifyUserNameIsNotNull() {
        addCriterion("MODIFY_USER_NAME is not null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andModifyUserNameEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME =", value, "modifyUserName");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andModifyUserNameNotEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME <>", value, "modifyUserName");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andModifyUserNameGreaterThan(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME >", value, "modifyUserName");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andModifyUserNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME >=", value, "modifyUserName");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andModifyUserNameLessThan(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME <", value, "modifyUserName");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andModifyUserNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME <=", value, "modifyUserName");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andModifyUserNameLike(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME like", value, "modifyUserName");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andModifyUserNameNotLike(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME not like", value, "modifyUserName");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andModifyUserNameIn(List<java.lang.String> values) {
        addCriterion("MODIFY_USER_NAME in", values, "modifyUserName");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andModifyUserNameNotIn(List<java.lang.String> values) {
        addCriterion("MODIFY_USER_NAME not in", values, "modifyUserName");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andModifyUserNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MODIFY_USER_NAME between", value1, value2, "modifyUserName");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andModifyUserNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MODIFY_USER_NAME not between", value1, value2, "modifyUserName");
        return (SysUserCriteria) this;
    }
	public SysUserCriteria andModifyTimeIsNull() {
        addCriterion("MODIFY_TIME is null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andModifyTimeIsNotNull() {
        addCriterion("MODIFY_TIME is not null");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andModifyTimeEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME =", value, "modifyTime");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andModifyTimeNotEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME <>", value, "modifyTime");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andModifyTimeGreaterThan(java.util.Date value) {
        addCriterion("MODIFY_TIME >", value, "modifyTime");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andModifyTimeGreaterThanOrEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME >=", value, "modifyTime");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andModifyTimeLessThan(java.util.Date value) {
        addCriterion("MODIFY_TIME <", value, "modifyTime");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andModifyTimeLessThanOrEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME <=", value, "modifyTime");
        return (SysUserCriteria) this;
    }
    
    public SysUserCriteria andModifyTimeIn(List<java.util.Date> values) {
        addCriterion("MODIFY_TIME in", values, "modifyTime");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andModifyTimeNotIn(List<java.util.Date> values) {
        addCriterion("MODIFY_TIME not in", values, "modifyTime");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andModifyTimeBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("MODIFY_TIME between", value1, value2, "modifyTime");
        return (SysUserCriteria) this;
    }

    public SysUserCriteria andModifyTimeNotBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("MODIFY_TIME not between", value1, value2, "modifyTime");
        return (SysUserCriteria) this;
    }
}

