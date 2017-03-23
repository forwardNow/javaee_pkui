package com.pkusoft.admin.model;

import java.util.List;

import com.pkusoft.framework.model.Criteria.BaseCriteria;

/**
 * 
 * @author 
 */
public class SysRoleMenuCriteria extends BaseCriteria {
	public SysRoleMenuCriteria andRoleMenuIdIsNull() {
        addCriterion("ROLE_MENU_ID is null");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andRoleMenuIdIsNotNull() {
        addCriterion("ROLE_MENU_ID is not null");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andRoleMenuIdEqualTo(java.lang.Long value) {
        addCriterion("ROLE_MENU_ID =", value, "roleMenuId");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andRoleMenuIdNotEqualTo(java.lang.Long value) {
        addCriterion("ROLE_MENU_ID <>", value, "roleMenuId");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andRoleMenuIdGreaterThan(java.lang.Long value) {
        addCriterion("ROLE_MENU_ID >", value, "roleMenuId");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andRoleMenuIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ROLE_MENU_ID >=", value, "roleMenuId");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andRoleMenuIdLessThan(java.lang.Long value) {
        addCriterion("ROLE_MENU_ID <", value, "roleMenuId");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andRoleMenuIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ROLE_MENU_ID <=", value, "roleMenuId");
        return (SysRoleMenuCriteria) this;
    }
    
    public SysRoleMenuCriteria andRoleMenuIdIn(List<java.lang.Long> values) {
        addCriterion("ROLE_MENU_ID in", values, "roleMenuId");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andRoleMenuIdNotIn(List<java.lang.Long> values) {
        addCriterion("ROLE_MENU_ID not in", values, "roleMenuId");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andRoleMenuIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ROLE_MENU_ID between", value1, value2, "roleMenuId");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andRoleMenuIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ROLE_MENU_ID not between", value1, value2, "roleMenuId");
        return (SysRoleMenuCriteria) this;
    }
	public SysRoleMenuCriteria andRoleIdIsNull() {
        addCriterion("ROLE_ID is null");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andRoleIdIsNotNull() {
        addCriterion("ROLE_ID is not null");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andRoleIdEqualTo(java.lang.Long value) {
        addCriterion("ROLE_ID =", value, "roleId");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andRoleIdNotEqualTo(java.lang.Long value) {
        addCriterion("ROLE_ID <>", value, "roleId");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andRoleIdGreaterThan(java.lang.Long value) {
        addCriterion("ROLE_ID >", value, "roleId");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andRoleIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ROLE_ID >=", value, "roleId");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andRoleIdLessThan(java.lang.Long value) {
        addCriterion("ROLE_ID <", value, "roleId");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andRoleIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ROLE_ID <=", value, "roleId");
        return (SysRoleMenuCriteria) this;
    }
    
    public SysRoleMenuCriteria andRoleIdIn(List<java.lang.Long> values) {
        addCriterion("ROLE_ID in", values, "roleId");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andRoleIdNotIn(List<java.lang.Long> values) {
        addCriterion("ROLE_ID not in", values, "roleId");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andRoleIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ROLE_ID between", value1, value2, "roleId");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andRoleIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ROLE_ID not between", value1, value2, "roleId");
        return (SysRoleMenuCriteria) this;
    }
	public SysRoleMenuCriteria andMenuIdIsNull() {
        addCriterion("MENU_ID is null");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andMenuIdIsNotNull() {
        addCriterion("MENU_ID is not null");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andMenuIdEqualTo(java.lang.Long value) {
        addCriterion("MENU_ID =", value, "menuId");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andMenuIdNotEqualTo(java.lang.Long value) {
        addCriterion("MENU_ID <>", value, "menuId");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andMenuIdGreaterThan(java.lang.Long value) {
        addCriterion("MENU_ID >", value, "menuId");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andMenuIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("MENU_ID >=", value, "menuId");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andMenuIdLessThan(java.lang.Long value) {
        addCriterion("MENU_ID <", value, "menuId");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andMenuIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("MENU_ID <=", value, "menuId");
        return (SysRoleMenuCriteria) this;
    }
    
    public SysRoleMenuCriteria andMenuIdIn(List<java.lang.Long> values) {
        addCriterion("MENU_ID in", values, "menuId");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andMenuIdNotIn(List<java.lang.Long> values) {
        addCriterion("MENU_ID not in", values, "menuId");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andMenuIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("MENU_ID between", value1, value2, "menuId");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andMenuIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("MENU_ID not between", value1, value2, "menuId");
        return (SysRoleMenuCriteria) this;
    }
	public SysRoleMenuCriteria andAddUserIdIsNull() {
        addCriterion("ADD_USER_ID is null");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andAddUserIdIsNotNull() {
        addCriterion("ADD_USER_ID is not null");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andAddUserIdEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID =", value, "addUserId");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andAddUserIdNotEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID <>", value, "addUserId");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andAddUserIdGreaterThan(java.lang.Long value) {
        addCriterion("ADD_USER_ID >", value, "addUserId");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andAddUserIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID >=", value, "addUserId");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andAddUserIdLessThan(java.lang.Long value) {
        addCriterion("ADD_USER_ID <", value, "addUserId");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andAddUserIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID <=", value, "addUserId");
        return (SysRoleMenuCriteria) this;
    }
    
    public SysRoleMenuCriteria andAddUserIdIn(List<java.lang.Long> values) {
        addCriterion("ADD_USER_ID in", values, "addUserId");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andAddUserIdNotIn(List<java.lang.Long> values) {
        addCriterion("ADD_USER_ID not in", values, "addUserId");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andAddUserIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ADD_USER_ID between", value1, value2, "addUserId");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andAddUserIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ADD_USER_ID not between", value1, value2, "addUserId");
        return (SysRoleMenuCriteria) this;
    }
	public SysRoleMenuCriteria andAddUserNameIsNull() {
        addCriterion("ADD_USER_NAME is null");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andAddUserNameIsNotNull() {
        addCriterion("ADD_USER_NAME is not null");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andAddUserNameEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME =", value, "addUserName");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andAddUserNameNotEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME <>", value, "addUserName");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andAddUserNameGreaterThan(java.lang.String value) {
        addCriterion("ADD_USER_NAME >", value, "addUserName");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andAddUserNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME >=", value, "addUserName");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andAddUserNameLessThan(java.lang.String value) {
        addCriterion("ADD_USER_NAME <", value, "addUserName");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andAddUserNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME <=", value, "addUserName");
        return (SysRoleMenuCriteria) this;
    }
    
    public SysRoleMenuCriteria andAddUserNameLike(java.lang.String value) {
        addCriterion("ADD_USER_NAME like", value, "addUserName");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andAddUserNameNotLike(java.lang.String value) {
        addCriterion("ADD_USER_NAME not like", value, "addUserName");
        return (SysRoleMenuCriteria) this;
    }
    
    public SysRoleMenuCriteria andAddUserNameIn(List<java.lang.String> values) {
        addCriterion("ADD_USER_NAME in", values, "addUserName");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andAddUserNameNotIn(List<java.lang.String> values) {
        addCriterion("ADD_USER_NAME not in", values, "addUserName");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andAddUserNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ADD_USER_NAME between", value1, value2, "addUserName");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andAddUserNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ADD_USER_NAME not between", value1, value2, "addUserName");
        return (SysRoleMenuCriteria) this;
    }
	public SysRoleMenuCriteria andAddTimeIsNull() {
        addCriterion("ADD_TIME is null");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andAddTimeIsNotNull() {
        addCriterion("ADD_TIME is not null");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andAddTimeEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME =", value, "addTime");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andAddTimeNotEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME <>", value, "addTime");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andAddTimeGreaterThan(java.util.Date value) {
        addCriterion("ADD_TIME >", value, "addTime");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andAddTimeGreaterThanOrEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME >=", value, "addTime");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andAddTimeLessThan(java.util.Date value) {
        addCriterion("ADD_TIME <", value, "addTime");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andAddTimeLessThanOrEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME <=", value, "addTime");
        return (SysRoleMenuCriteria) this;
    }
    
    public SysRoleMenuCriteria andAddTimeIn(List<java.util.Date> values) {
        addCriterion("ADD_TIME in", values, "addTime");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andAddTimeNotIn(List<java.util.Date> values) {
        addCriterion("ADD_TIME not in", values, "addTime");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andAddTimeBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("ADD_TIME between", value1, value2, "addTime");
        return (SysRoleMenuCriteria) this;
    }

    public SysRoleMenuCriteria andAddTimeNotBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("ADD_TIME not between", value1, value2, "addTime");
        return (SysRoleMenuCriteria) this;
    }
}

