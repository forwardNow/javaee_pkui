package com.pkusoft.admin.model;

import java.util.List;

import com.pkusoft.framework.model.Criteria.BaseCriteria;

/**
 * 
 * @author 
 */
public class SysRoleResouceCriteria extends BaseCriteria {
	public SysRoleResouceCriteria andRoleResourceIdIsNull() {
        addCriterion("ROLE_RESOURCE_ID is null");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andRoleResourceIdIsNotNull() {
        addCriterion("ROLE_RESOURCE_ID is not null");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andRoleResourceIdEqualTo(java.lang.Long value) {
        addCriterion("ROLE_RESOURCE_ID =", value, "roleResourceId");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andRoleResourceIdNotEqualTo(java.lang.Long value) {
        addCriterion("ROLE_RESOURCE_ID <>", value, "roleResourceId");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andRoleResourceIdGreaterThan(java.lang.Long value) {
        addCriterion("ROLE_RESOURCE_ID >", value, "roleResourceId");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andRoleResourceIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ROLE_RESOURCE_ID >=", value, "roleResourceId");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andRoleResourceIdLessThan(java.lang.Long value) {
        addCriterion("ROLE_RESOURCE_ID <", value, "roleResourceId");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andRoleResourceIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ROLE_RESOURCE_ID <=", value, "roleResourceId");
        return (SysRoleResouceCriteria) this;
    }
    
    public SysRoleResouceCriteria andRoleResourceIdIn(List<java.lang.Long> values) {
        addCriterion("ROLE_RESOURCE_ID in", values, "roleResourceId");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andRoleResourceIdNotIn(List<java.lang.Long> values) {
        addCriterion("ROLE_RESOURCE_ID not in", values, "roleResourceId");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andRoleResourceIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ROLE_RESOURCE_ID between", value1, value2, "roleResourceId");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andRoleResourceIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ROLE_RESOURCE_ID not between", value1, value2, "roleResourceId");
        return (SysRoleResouceCriteria) this;
    }
	public SysRoleResouceCriteria andRoleIdIsNull() {
        addCriterion("ROLE_ID is null");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andRoleIdIsNotNull() {
        addCriterion("ROLE_ID is not null");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andRoleIdEqualTo(java.lang.Long value) {
        addCriterion("ROLE_ID =", value, "roleId");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andRoleIdNotEqualTo(java.lang.Long value) {
        addCriterion("ROLE_ID <>", value, "roleId");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andRoleIdGreaterThan(java.lang.Long value) {
        addCriterion("ROLE_ID >", value, "roleId");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andRoleIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ROLE_ID >=", value, "roleId");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andRoleIdLessThan(java.lang.Long value) {
        addCriterion("ROLE_ID <", value, "roleId");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andRoleIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ROLE_ID <=", value, "roleId");
        return (SysRoleResouceCriteria) this;
    }
    
    public SysRoleResouceCriteria andRoleIdIn(List<java.lang.Long> values) {
        addCriterion("ROLE_ID in", values, "roleId");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andRoleIdNotIn(List<java.lang.Long> values) {
        addCriterion("ROLE_ID not in", values, "roleId");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andRoleIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ROLE_ID between", value1, value2, "roleId");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andRoleIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ROLE_ID not between", value1, value2, "roleId");
        return (SysRoleResouceCriteria) this;
    }
	public SysRoleResouceCriteria andResouceIdIsNull() {
        addCriterion("RESOUCE_ID is null");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andResouceIdIsNotNull() {
        addCriterion("RESOUCE_ID is not null");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andResouceIdEqualTo(java.lang.Long value) {
        addCriterion("RESOUCE_ID =", value, "resouceId");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andResouceIdNotEqualTo(java.lang.Long value) {
        addCriterion("RESOUCE_ID <>", value, "resouceId");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andResouceIdGreaterThan(java.lang.Long value) {
        addCriterion("RESOUCE_ID >", value, "resouceId");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andResouceIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("RESOUCE_ID >=", value, "resouceId");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andResouceIdLessThan(java.lang.Long value) {
        addCriterion("RESOUCE_ID <", value, "resouceId");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andResouceIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("RESOUCE_ID <=", value, "resouceId");
        return (SysRoleResouceCriteria) this;
    }
    
    public SysRoleResouceCriteria andResouceIdIn(List<java.lang.Long> values) {
        addCriterion("RESOUCE_ID in", values, "resouceId");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andResouceIdNotIn(List<java.lang.Long> values) {
        addCriterion("RESOUCE_ID not in", values, "resouceId");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andResouceIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("RESOUCE_ID between", value1, value2, "resouceId");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andResouceIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("RESOUCE_ID not between", value1, value2, "resouceId");
        return (SysRoleResouceCriteria) this;
    }
	public SysRoleResouceCriteria andAddUserIdIsNull() {
        addCriterion("ADD_USER_ID is null");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andAddUserIdIsNotNull() {
        addCriterion("ADD_USER_ID is not null");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andAddUserIdEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID =", value, "addUserId");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andAddUserIdNotEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID <>", value, "addUserId");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andAddUserIdGreaterThan(java.lang.Long value) {
        addCriterion("ADD_USER_ID >", value, "addUserId");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andAddUserIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID >=", value, "addUserId");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andAddUserIdLessThan(java.lang.Long value) {
        addCriterion("ADD_USER_ID <", value, "addUserId");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andAddUserIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID <=", value, "addUserId");
        return (SysRoleResouceCriteria) this;
    }
    
    public SysRoleResouceCriteria andAddUserIdIn(List<java.lang.Long> values) {
        addCriterion("ADD_USER_ID in", values, "addUserId");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andAddUserIdNotIn(List<java.lang.Long> values) {
        addCriterion("ADD_USER_ID not in", values, "addUserId");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andAddUserIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ADD_USER_ID between", value1, value2, "addUserId");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andAddUserIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ADD_USER_ID not between", value1, value2, "addUserId");
        return (SysRoleResouceCriteria) this;
    }
	public SysRoleResouceCriteria andAddUserNameIsNull() {
        addCriterion("ADD_USER_NAME is null");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andAddUserNameIsNotNull() {
        addCriterion("ADD_USER_NAME is not null");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andAddUserNameEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME =", value, "addUserName");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andAddUserNameNotEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME <>", value, "addUserName");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andAddUserNameGreaterThan(java.lang.String value) {
        addCriterion("ADD_USER_NAME >", value, "addUserName");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andAddUserNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME >=", value, "addUserName");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andAddUserNameLessThan(java.lang.String value) {
        addCriterion("ADD_USER_NAME <", value, "addUserName");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andAddUserNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME <=", value, "addUserName");
        return (SysRoleResouceCriteria) this;
    }
    
    public SysRoleResouceCriteria andAddUserNameLike(java.lang.String value) {
        addCriterion("ADD_USER_NAME like", value, "addUserName");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andAddUserNameNotLike(java.lang.String value) {
        addCriterion("ADD_USER_NAME not like", value, "addUserName");
        return (SysRoleResouceCriteria) this;
    }
    
    public SysRoleResouceCriteria andAddUserNameIn(List<java.lang.String> values) {
        addCriterion("ADD_USER_NAME in", values, "addUserName");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andAddUserNameNotIn(List<java.lang.String> values) {
        addCriterion("ADD_USER_NAME not in", values, "addUserName");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andAddUserNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ADD_USER_NAME between", value1, value2, "addUserName");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andAddUserNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ADD_USER_NAME not between", value1, value2, "addUserName");
        return (SysRoleResouceCriteria) this;
    }
	public SysRoleResouceCriteria andAddTimeIsNull() {
        addCriterion("ADD_TIME is null");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andAddTimeIsNotNull() {
        addCriterion("ADD_TIME is not null");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andAddTimeEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME =", value, "addTime");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andAddTimeNotEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME <>", value, "addTime");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andAddTimeGreaterThan(java.util.Date value) {
        addCriterion("ADD_TIME >", value, "addTime");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andAddTimeGreaterThanOrEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME >=", value, "addTime");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andAddTimeLessThan(java.util.Date value) {
        addCriterion("ADD_TIME <", value, "addTime");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andAddTimeLessThanOrEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME <=", value, "addTime");
        return (SysRoleResouceCriteria) this;
    }
    
    public SysRoleResouceCriteria andAddTimeIn(List<java.util.Date> values) {
        addCriterion("ADD_TIME in", values, "addTime");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andAddTimeNotIn(List<java.util.Date> values) {
        addCriterion("ADD_TIME not in", values, "addTime");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andAddTimeBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("ADD_TIME between", value1, value2, "addTime");
        return (SysRoleResouceCriteria) this;
    }

    public SysRoleResouceCriteria andAddTimeNotBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("ADD_TIME not between", value1, value2, "addTime");
        return (SysRoleResouceCriteria) this;
    }
}

