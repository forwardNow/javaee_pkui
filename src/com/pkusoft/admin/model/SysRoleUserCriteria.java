package com.pkusoft.admin.model;

import java.util.List;

import com.pkusoft.framework.model.Criteria.BaseCriteria;

/**
 * 
 * @author 
 */
public class SysRoleUserCriteria extends BaseCriteria {
	public SysRoleUserCriteria andRoleUserIdIsNull() {
        addCriterion("ROLE_USER_ID is null");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andRoleUserIdIsNotNull() {
        addCriterion("ROLE_USER_ID is not null");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andRoleUserIdEqualTo(java.lang.Long value) {
        addCriterion("ROLE_USER_ID =", value, "roleUserId");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andRoleUserIdNotEqualTo(java.lang.Long value) {
        addCriterion("ROLE_USER_ID <>", value, "roleUserId");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andRoleUserIdGreaterThan(java.lang.Long value) {
        addCriterion("ROLE_USER_ID >", value, "roleUserId");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andRoleUserIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ROLE_USER_ID >=", value, "roleUserId");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andRoleUserIdLessThan(java.lang.Long value) {
        addCriterion("ROLE_USER_ID <", value, "roleUserId");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andRoleUserIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ROLE_USER_ID <=", value, "roleUserId");
        return (SysRoleUserCriteria) this;
    }
    
    public SysRoleUserCriteria andRoleUserIdIn(List<java.lang.Long> values) {
        addCriterion("ROLE_USER_ID in", values, "roleUserId");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andRoleUserIdNotIn(List<java.lang.Long> values) {
        addCriterion("ROLE_USER_ID not in", values, "roleUserId");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andRoleUserIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ROLE_USER_ID between", value1, value2, "roleUserId");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andRoleUserIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ROLE_USER_ID not between", value1, value2, "roleUserId");
        return (SysRoleUserCriteria) this;
    }
	public SysRoleUserCriteria andUserIdIsNull() {
        addCriterion("USER_ID is null");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andUserIdIsNotNull() {
        addCriterion("USER_ID is not null");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andUserIdEqualTo(java.lang.Long value) {
        addCriterion("USER_ID =", value, "userId");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andUserIdNotEqualTo(java.lang.Long value) {
        addCriterion("USER_ID <>", value, "userId");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andUserIdGreaterThan(java.lang.Long value) {
        addCriterion("USER_ID >", value, "userId");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andUserIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("USER_ID >=", value, "userId");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andUserIdLessThan(java.lang.Long value) {
        addCriterion("USER_ID <", value, "userId");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andUserIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("USER_ID <=", value, "userId");
        return (SysRoleUserCriteria) this;
    }
    
    public SysRoleUserCriteria andUserIdIn(List<java.lang.Long> values) {
        addCriterion("USER_ID in", values, "userId");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andUserIdNotIn(List<java.lang.Long> values) {
        addCriterion("USER_ID not in", values, "userId");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andUserIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("USER_ID between", value1, value2, "userId");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andUserIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("USER_ID not between", value1, value2, "userId");
        return (SysRoleUserCriteria) this;
    }
	public SysRoleUserCriteria andRoleIdIsNull() {
        addCriterion("ROLE_ID is null");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andRoleIdIsNotNull() {
        addCriterion("ROLE_ID is not null");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andRoleIdEqualTo(java.lang.Long value) {
        addCriterion("ROLE_ID =", value, "roleId");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andRoleIdNotEqualTo(java.lang.Long value) {
        addCriterion("ROLE_ID <>", value, "roleId");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andRoleIdGreaterThan(java.lang.Long value) {
        addCriterion("ROLE_ID >", value, "roleId");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andRoleIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ROLE_ID >=", value, "roleId");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andRoleIdLessThan(java.lang.Long value) {
        addCriterion("ROLE_ID <", value, "roleId");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andRoleIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ROLE_ID <=", value, "roleId");
        return (SysRoleUserCriteria) this;
    }
    
    public SysRoleUserCriteria andRoleIdIn(List<java.lang.Long> values) {
        addCriterion("ROLE_ID in", values, "roleId");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andRoleIdNotIn(List<java.lang.Long> values) {
        addCriterion("ROLE_ID not in", values, "roleId");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andRoleIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ROLE_ID between", value1, value2, "roleId");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andRoleIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ROLE_ID not between", value1, value2, "roleId");
        return (SysRoleUserCriteria) this;
    }
	public SysRoleUserCriteria andAddUserIdIsNull() {
        addCriterion("ADD_USER_ID is null");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andAddUserIdIsNotNull() {
        addCriterion("ADD_USER_ID is not null");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andAddUserIdEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID =", value, "addUserId");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andAddUserIdNotEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID <>", value, "addUserId");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andAddUserIdGreaterThan(java.lang.Long value) {
        addCriterion("ADD_USER_ID >", value, "addUserId");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andAddUserIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID >=", value, "addUserId");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andAddUserIdLessThan(java.lang.Long value) {
        addCriterion("ADD_USER_ID <", value, "addUserId");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andAddUserIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID <=", value, "addUserId");
        return (SysRoleUserCriteria) this;
    }
    
    public SysRoleUserCriteria andAddUserIdIn(List<java.lang.Long> values) {
        addCriterion("ADD_USER_ID in", values, "addUserId");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andAddUserIdNotIn(List<java.lang.Long> values) {
        addCriterion("ADD_USER_ID not in", values, "addUserId");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andAddUserIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ADD_USER_ID between", value1, value2, "addUserId");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andAddUserIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ADD_USER_ID not between", value1, value2, "addUserId");
        return (SysRoleUserCriteria) this;
    }
	public SysRoleUserCriteria andAddUserNameIsNull() {
        addCriterion("ADD_USER_NAME is null");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andAddUserNameIsNotNull() {
        addCriterion("ADD_USER_NAME is not null");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andAddUserNameEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME =", value, "addUserName");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andAddUserNameNotEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME <>", value, "addUserName");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andAddUserNameGreaterThan(java.lang.String value) {
        addCriterion("ADD_USER_NAME >", value, "addUserName");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andAddUserNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME >=", value, "addUserName");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andAddUserNameLessThan(java.lang.String value) {
        addCriterion("ADD_USER_NAME <", value, "addUserName");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andAddUserNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME <=", value, "addUserName");
        return (SysRoleUserCriteria) this;
    }
    
    public SysRoleUserCriteria andAddUserNameLike(java.lang.String value) {
        addCriterion("ADD_USER_NAME like", value, "addUserName");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andAddUserNameNotLike(java.lang.String value) {
        addCriterion("ADD_USER_NAME not like", value, "addUserName");
        return (SysRoleUserCriteria) this;
    }
    
    public SysRoleUserCriteria andAddUserNameIn(List<java.lang.String> values) {
        addCriterion("ADD_USER_NAME in", values, "addUserName");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andAddUserNameNotIn(List<java.lang.String> values) {
        addCriterion("ADD_USER_NAME not in", values, "addUserName");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andAddUserNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ADD_USER_NAME between", value1, value2, "addUserName");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andAddUserNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ADD_USER_NAME not between", value1, value2, "addUserName");
        return (SysRoleUserCriteria) this;
    }
	public SysRoleUserCriteria andAddTimeIsNull() {
        addCriterion("ADD_TIME is null");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andAddTimeIsNotNull() {
        addCriterion("ADD_TIME is not null");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andAddTimeEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME =", value, "addTime");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andAddTimeNotEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME <>", value, "addTime");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andAddTimeGreaterThan(java.util.Date value) {
        addCriterion("ADD_TIME >", value, "addTime");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andAddTimeGreaterThanOrEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME >=", value, "addTime");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andAddTimeLessThan(java.util.Date value) {
        addCriterion("ADD_TIME <", value, "addTime");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andAddTimeLessThanOrEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME <=", value, "addTime");
        return (SysRoleUserCriteria) this;
    }
    
    public SysRoleUserCriteria andAddTimeIn(List<java.util.Date> values) {
        addCriterion("ADD_TIME in", values, "addTime");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andAddTimeNotIn(List<java.util.Date> values) {
        addCriterion("ADD_TIME not in", values, "addTime");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andAddTimeBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("ADD_TIME between", value1, value2, "addTime");
        return (SysRoleUserCriteria) this;
    }

    public SysRoleUserCriteria andAddTimeNotBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("ADD_TIME not between", value1, value2, "addTime");
        return (SysRoleUserCriteria) this;
    }
}

