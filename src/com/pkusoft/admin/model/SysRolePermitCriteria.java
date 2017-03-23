package com.pkusoft.admin.model;

import java.util.List;

import com.pkusoft.framework.model.Criteria.BaseCriteria;

/**
 * 
 * @author 
 */
public class SysRolePermitCriteria extends BaseCriteria {
	public SysRolePermitCriteria andRolePermitIdIsNull() {
        addCriterion("ROLE_PERMIT_ID is null");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andRolePermitIdIsNotNull() {
        addCriterion("ROLE_PERMIT_ID is not null");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andRolePermitIdEqualTo(java.lang.Long value) {
        addCriterion("ROLE_PERMIT_ID =", value, "rolePermitId");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andRolePermitIdNotEqualTo(java.lang.Long value) {
        addCriterion("ROLE_PERMIT_ID <>", value, "rolePermitId");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andRolePermitIdGreaterThan(java.lang.Long value) {
        addCriterion("ROLE_PERMIT_ID >", value, "rolePermitId");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andRolePermitIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ROLE_PERMIT_ID >=", value, "rolePermitId");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andRolePermitIdLessThan(java.lang.Long value) {
        addCriterion("ROLE_PERMIT_ID <", value, "rolePermitId");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andRolePermitIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ROLE_PERMIT_ID <=", value, "rolePermitId");
        return (SysRolePermitCriteria) this;
    }
    
    public SysRolePermitCriteria andRolePermitIdIn(List<java.lang.Long> values) {
        addCriterion("ROLE_PERMIT_ID in", values, "rolePermitId");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andRolePermitIdNotIn(List<java.lang.Long> values) {
        addCriterion("ROLE_PERMIT_ID not in", values, "rolePermitId");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andRolePermitIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ROLE_PERMIT_ID between", value1, value2, "rolePermitId");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andRolePermitIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ROLE_PERMIT_ID not between", value1, value2, "rolePermitId");
        return (SysRolePermitCriteria) this;
    }
	public SysRolePermitCriteria andRoleIdIsNull() {
        addCriterion("ROLE_ID is null");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andRoleIdIsNotNull() {
        addCriterion("ROLE_ID is not null");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andRoleIdEqualTo(java.lang.Long value) {
        addCriterion("ROLE_ID =", value, "roleId");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andRoleIdNotEqualTo(java.lang.Long value) {
        addCriterion("ROLE_ID <>", value, "roleId");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andRoleIdGreaterThan(java.lang.Long value) {
        addCriterion("ROLE_ID >", value, "roleId");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andRoleIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ROLE_ID >=", value, "roleId");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andRoleIdLessThan(java.lang.Long value) {
        addCriterion("ROLE_ID <", value, "roleId");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andRoleIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ROLE_ID <=", value, "roleId");
        return (SysRolePermitCriteria) this;
    }
    
    public SysRolePermitCriteria andRoleIdIn(List<java.lang.Long> values) {
        addCriterion("ROLE_ID in", values, "roleId");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andRoleIdNotIn(List<java.lang.Long> values) {
        addCriterion("ROLE_ID not in", values, "roleId");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andRoleIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ROLE_ID between", value1, value2, "roleId");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andRoleIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ROLE_ID not between", value1, value2, "roleId");
        return (SysRolePermitCriteria) this;
    }
	public SysRolePermitCriteria andPermitIdIsNull() {
        addCriterion("PERMIT_ID is null");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andPermitIdIsNotNull() {
        addCriterion("PERMIT_ID is not null");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andPermitIdEqualTo(java.lang.Long value) {
        addCriterion("PERMIT_ID =", value, "permitId");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andPermitIdNotEqualTo(java.lang.Long value) {
        addCriterion("PERMIT_ID <>", value, "permitId");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andPermitIdGreaterThan(java.lang.Long value) {
        addCriterion("PERMIT_ID >", value, "permitId");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andPermitIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("PERMIT_ID >=", value, "permitId");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andPermitIdLessThan(java.lang.Long value) {
        addCriterion("PERMIT_ID <", value, "permitId");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andPermitIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("PERMIT_ID <=", value, "permitId");
        return (SysRolePermitCriteria) this;
    }
    
    public SysRolePermitCriteria andPermitIdIn(List<java.lang.Long> values) {
        addCriterion("PERMIT_ID in", values, "permitId");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andPermitIdNotIn(List<java.lang.Long> values) {
        addCriterion("PERMIT_ID not in", values, "permitId");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andPermitIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("PERMIT_ID between", value1, value2, "permitId");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andPermitIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("PERMIT_ID not between", value1, value2, "permitId");
        return (SysRolePermitCriteria) this;
    }
	public SysRolePermitCriteria andAddUserIdIsNull() {
        addCriterion("ADD_USER_ID is null");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andAddUserIdIsNotNull() {
        addCriterion("ADD_USER_ID is not null");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andAddUserIdEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID =", value, "addUserId");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andAddUserIdNotEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID <>", value, "addUserId");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andAddUserIdGreaterThan(java.lang.Long value) {
        addCriterion("ADD_USER_ID >", value, "addUserId");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andAddUserIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID >=", value, "addUserId");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andAddUserIdLessThan(java.lang.Long value) {
        addCriterion("ADD_USER_ID <", value, "addUserId");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andAddUserIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID <=", value, "addUserId");
        return (SysRolePermitCriteria) this;
    }
    
    public SysRolePermitCriteria andAddUserIdIn(List<java.lang.Long> values) {
        addCriterion("ADD_USER_ID in", values, "addUserId");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andAddUserIdNotIn(List<java.lang.Long> values) {
        addCriterion("ADD_USER_ID not in", values, "addUserId");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andAddUserIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ADD_USER_ID between", value1, value2, "addUserId");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andAddUserIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ADD_USER_ID not between", value1, value2, "addUserId");
        return (SysRolePermitCriteria) this;
    }
	public SysRolePermitCriteria andAddUserNameIsNull() {
        addCriterion("ADD_USER_NAME is null");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andAddUserNameIsNotNull() {
        addCriterion("ADD_USER_NAME is not null");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andAddUserNameEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME =", value, "addUserName");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andAddUserNameNotEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME <>", value, "addUserName");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andAddUserNameGreaterThan(java.lang.String value) {
        addCriterion("ADD_USER_NAME >", value, "addUserName");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andAddUserNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME >=", value, "addUserName");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andAddUserNameLessThan(java.lang.String value) {
        addCriterion("ADD_USER_NAME <", value, "addUserName");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andAddUserNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME <=", value, "addUserName");
        return (SysRolePermitCriteria) this;
    }
    
    public SysRolePermitCriteria andAddUserNameLike(java.lang.String value) {
        addCriterion("ADD_USER_NAME like", value, "addUserName");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andAddUserNameNotLike(java.lang.String value) {
        addCriterion("ADD_USER_NAME not like", value, "addUserName");
        return (SysRolePermitCriteria) this;
    }
    
    public SysRolePermitCriteria andAddUserNameIn(List<java.lang.String> values) {
        addCriterion("ADD_USER_NAME in", values, "addUserName");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andAddUserNameNotIn(List<java.lang.String> values) {
        addCriterion("ADD_USER_NAME not in", values, "addUserName");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andAddUserNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ADD_USER_NAME between", value1, value2, "addUserName");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andAddUserNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ADD_USER_NAME not between", value1, value2, "addUserName");
        return (SysRolePermitCriteria) this;
    }
	public SysRolePermitCriteria andAddTimeIsNull() {
        addCriterion("ADD_TIME is null");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andAddTimeIsNotNull() {
        addCriterion("ADD_TIME is not null");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andAddTimeEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME =", value, "addTime");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andAddTimeNotEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME <>", value, "addTime");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andAddTimeGreaterThan(java.util.Date value) {
        addCriterion("ADD_TIME >", value, "addTime");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andAddTimeGreaterThanOrEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME >=", value, "addTime");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andAddTimeLessThan(java.util.Date value) {
        addCriterion("ADD_TIME <", value, "addTime");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andAddTimeLessThanOrEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME <=", value, "addTime");
        return (SysRolePermitCriteria) this;
    }
    
    public SysRolePermitCriteria andAddTimeIn(List<java.util.Date> values) {
        addCriterion("ADD_TIME in", values, "addTime");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andAddTimeNotIn(List<java.util.Date> values) {
        addCriterion("ADD_TIME not in", values, "addTime");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andAddTimeBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("ADD_TIME between", value1, value2, "addTime");
        return (SysRolePermitCriteria) this;
    }

    public SysRolePermitCriteria andAddTimeNotBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("ADD_TIME not between", value1, value2, "addTime");
        return (SysRolePermitCriteria) this;
    }
}

