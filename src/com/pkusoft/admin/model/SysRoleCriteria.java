package com.pkusoft.admin.model;

import java.util.List;

import com.pkusoft.framework.model.Criteria.BaseCriteria;

/**
 * 
 * @author 
 */
public class SysRoleCriteria extends BaseCriteria {
	public SysRoleCriteria andRoleIdIsNull() {
        addCriterion("ROLE_ID is null");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleIdIsNotNull() {
        addCriterion("ROLE_ID is not null");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleIdEqualTo(java.lang.Long value) {
        addCriterion("ROLE_ID =", value, "roleId");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleIdNotEqualTo(java.lang.Long value) {
        addCriterion("ROLE_ID <>", value, "roleId");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleIdGreaterThan(java.lang.Long value) {
        addCriterion("ROLE_ID >", value, "roleId");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ROLE_ID >=", value, "roleId");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleIdLessThan(java.lang.Long value) {
        addCriterion("ROLE_ID <", value, "roleId");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ROLE_ID <=", value, "roleId");
        return (SysRoleCriteria) this;
    }
    
    public SysRoleCriteria andRoleIdIn(List<java.lang.Long> values) {
        addCriterion("ROLE_ID in", values, "roleId");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleIdNotIn(List<java.lang.Long> values) {
        addCriterion("ROLE_ID not in", values, "roleId");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ROLE_ID between", value1, value2, "roleId");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ROLE_ID not between", value1, value2, "roleId");
        return (SysRoleCriteria) this;
    }
	public SysRoleCriteria andRoleNameIsNull() {
        addCriterion("ROLE_NAME is null");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleNameIsNotNull() {
        addCriterion("ROLE_NAME is not null");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleNameEqualTo(java.lang.String value) {
        addCriterion("ROLE_NAME =", value, "roleName");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleNameNotEqualTo(java.lang.String value) {
        addCriterion("ROLE_NAME <>", value, "roleName");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleNameGreaterThan(java.lang.String value) {
        addCriterion("ROLE_NAME >", value, "roleName");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("ROLE_NAME >=", value, "roleName");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleNameLessThan(java.lang.String value) {
        addCriterion("ROLE_NAME <", value, "roleName");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("ROLE_NAME <=", value, "roleName");
        return (SysRoleCriteria) this;
    }
    
    public SysRoleCriteria andRoleNameLike(java.lang.String value) {
        addCriterion("ROLE_NAME like", value, "roleName");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleNameNotLike(java.lang.String value) {
        addCriterion("ROLE_NAME not like", value, "roleName");
        return (SysRoleCriteria) this;
    }
    
    public SysRoleCriteria andRoleNameIn(List<java.lang.String> values) {
        addCriterion("ROLE_NAME in", values, "roleName");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleNameNotIn(List<java.lang.String> values) {
        addCriterion("ROLE_NAME not in", values, "roleName");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ROLE_NAME between", value1, value2, "roleName");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ROLE_NAME not between", value1, value2, "roleName");
        return (SysRoleCriteria) this;
    }
	public SysRoleCriteria andRoleLevelIsNull() {
        addCriterion("ROLE_LEVEL is null");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleLevelIsNotNull() {
        addCriterion("ROLE_LEVEL is not null");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleLevelEqualTo(java.lang.String value) {
        addCriterion("ROLE_LEVEL =", value, "roleLevel");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleLevelNotEqualTo(java.lang.String value) {
        addCriterion("ROLE_LEVEL <>", value, "roleLevel");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleLevelGreaterThan(java.lang.String value) {
        addCriterion("ROLE_LEVEL >", value, "roleLevel");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleLevelGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("ROLE_LEVEL >=", value, "roleLevel");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleLevelLessThan(java.lang.String value) {
        addCriterion("ROLE_LEVEL <", value, "roleLevel");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleLevelLessThanOrEqualTo(java.lang.String value) {
        addCriterion("ROLE_LEVEL <=", value, "roleLevel");
        return (SysRoleCriteria) this;
    }
    
    public SysRoleCriteria andRoleLevelLike(java.lang.String value) {
        addCriterion("ROLE_LEVEL like", value, "roleLevel");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleLevelNotLike(java.lang.String value) {
        addCriterion("ROLE_LEVEL not like", value, "roleLevel");
        return (SysRoleCriteria) this;
    }
    
    public SysRoleCriteria andRoleLevelIn(List<java.lang.String> values) {
        addCriterion("ROLE_LEVEL in", values, "roleLevel");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleLevelNotIn(List<java.lang.String> values) {
        addCriterion("ROLE_LEVEL not in", values, "roleLevel");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleLevelBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ROLE_LEVEL between", value1, value2, "roleLevel");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleLevelNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ROLE_LEVEL not between", value1, value2, "roleLevel");
        return (SysRoleCriteria) this;
    }
	public SysRoleCriteria andRoleDercIsNull() {
        addCriterion("ROLE_DERC is null");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleDercIsNotNull() {
        addCriterion("ROLE_DERC is not null");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleDercEqualTo(java.lang.String value) {
        addCriterion("ROLE_DERC =", value, "roleDerc");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleDercNotEqualTo(java.lang.String value) {
        addCriterion("ROLE_DERC <>", value, "roleDerc");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleDercGreaterThan(java.lang.String value) {
        addCriterion("ROLE_DERC >", value, "roleDerc");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleDercGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("ROLE_DERC >=", value, "roleDerc");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleDercLessThan(java.lang.String value) {
        addCriterion("ROLE_DERC <", value, "roleDerc");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleDercLessThanOrEqualTo(java.lang.String value) {
        addCriterion("ROLE_DERC <=", value, "roleDerc");
        return (SysRoleCriteria) this;
    }
    
    public SysRoleCriteria andRoleDercLike(java.lang.String value) {
        addCriterion("ROLE_DERC like", value, "roleDerc");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleDercNotLike(java.lang.String value) {
        addCriterion("ROLE_DERC not like", value, "roleDerc");
        return (SysRoleCriteria) this;
    }
    
    public SysRoleCriteria andRoleDercIn(List<java.lang.String> values) {
        addCriterion("ROLE_DERC in", values, "roleDerc");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleDercNotIn(List<java.lang.String> values) {
        addCriterion("ROLE_DERC not in", values, "roleDerc");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleDercBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ROLE_DERC between", value1, value2, "roleDerc");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andRoleDercNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ROLE_DERC not between", value1, value2, "roleDerc");
        return (SysRoleCriteria) this;
    }
	public SysRoleCriteria andOrderFlagIsNull() {
        addCriterion("ORDER_FLAG is null");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andOrderFlagIsNotNull() {
        addCriterion("ORDER_FLAG is not null");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andOrderFlagEqualTo(java.lang.Long value) {
        addCriterion("ORDER_FLAG =", value, "orderFlag");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andOrderFlagNotEqualTo(java.lang.Long value) {
        addCriterion("ORDER_FLAG <>", value, "orderFlag");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andOrderFlagGreaterThan(java.lang.Long value) {
        addCriterion("ORDER_FLAG >", value, "orderFlag");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andOrderFlagGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ORDER_FLAG >=", value, "orderFlag");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andOrderFlagLessThan(java.lang.Long value) {
        addCriterion("ORDER_FLAG <", value, "orderFlag");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andOrderFlagLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ORDER_FLAG <=", value, "orderFlag");
        return (SysRoleCriteria) this;
    }
    
    public SysRoleCriteria andOrderFlagIn(List<java.lang.Long> values) {
        addCriterion("ORDER_FLAG in", values, "orderFlag");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andOrderFlagNotIn(List<java.lang.Long> values) {
        addCriterion("ORDER_FLAG not in", values, "orderFlag");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andOrderFlagBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ORDER_FLAG between", value1, value2, "orderFlag");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andOrderFlagNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ORDER_FLAG not between", value1, value2, "orderFlag");
        return (SysRoleCriteria) this;
    }
	public SysRoleCriteria andReserve1IsNull() {
        addCriterion("RESERVE1 is null");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve1IsNotNull() {
        addCriterion("RESERVE1 is not null");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve1EqualTo(java.lang.String value) {
        addCriterion("RESERVE1 =", value, "reserve1");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve1NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 <>", value, "reserve1");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve1GreaterThan(java.lang.String value) {
        addCriterion("RESERVE1 >", value, "reserve1");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve1GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 >=", value, "reserve1");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve1LessThan(java.lang.String value) {
        addCriterion("RESERVE1 <", value, "reserve1");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve1LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 <=", value, "reserve1");
        return (SysRoleCriteria) this;
    }
    
    public SysRoleCriteria andReserve1Like(java.lang.String value) {
        addCriterion("RESERVE1 like", value, "reserve1");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve1NotLike(java.lang.String value) {
        addCriterion("RESERVE1 not like", value, "reserve1");
        return (SysRoleCriteria) this;
    }
    
    public SysRoleCriteria andReserve1In(List<java.lang.String> values) {
        addCriterion("RESERVE1 in", values, "reserve1");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve1NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE1 not in", values, "reserve1");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve1Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE1 between", value1, value2, "reserve1");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve1NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE1 not between", value1, value2, "reserve1");
        return (SysRoleCriteria) this;
    }
	public SysRoleCriteria andReserve2IsNull() {
        addCriterion("RESERVE2 is null");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve2IsNotNull() {
        addCriterion("RESERVE2 is not null");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve2EqualTo(java.lang.String value) {
        addCriterion("RESERVE2 =", value, "reserve2");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve2NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 <>", value, "reserve2");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve2GreaterThan(java.lang.String value) {
        addCriterion("RESERVE2 >", value, "reserve2");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve2GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 >=", value, "reserve2");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve2LessThan(java.lang.String value) {
        addCriterion("RESERVE2 <", value, "reserve2");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve2LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 <=", value, "reserve2");
        return (SysRoleCriteria) this;
    }
    
    public SysRoleCriteria andReserve2Like(java.lang.String value) {
        addCriterion("RESERVE2 like", value, "reserve2");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve2NotLike(java.lang.String value) {
        addCriterion("RESERVE2 not like", value, "reserve2");
        return (SysRoleCriteria) this;
    }
    
    public SysRoleCriteria andReserve2In(List<java.lang.String> values) {
        addCriterion("RESERVE2 in", values, "reserve2");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve2NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE2 not in", values, "reserve2");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve2Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE2 between", value1, value2, "reserve2");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve2NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE2 not between", value1, value2, "reserve2");
        return (SysRoleCriteria) this;
    }
	public SysRoleCriteria andReserve3IsNull() {
        addCriterion("RESERVE3 is null");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve3IsNotNull() {
        addCriterion("RESERVE3 is not null");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve3EqualTo(java.lang.String value) {
        addCriterion("RESERVE3 =", value, "reserve3");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve3NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 <>", value, "reserve3");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve3GreaterThan(java.lang.String value) {
        addCriterion("RESERVE3 >", value, "reserve3");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve3GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 >=", value, "reserve3");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve3LessThan(java.lang.String value) {
        addCriterion("RESERVE3 <", value, "reserve3");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve3LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 <=", value, "reserve3");
        return (SysRoleCriteria) this;
    }
    
    public SysRoleCriteria andReserve3Like(java.lang.String value) {
        addCriterion("RESERVE3 like", value, "reserve3");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve3NotLike(java.lang.String value) {
        addCriterion("RESERVE3 not like", value, "reserve3");
        return (SysRoleCriteria) this;
    }
    
    public SysRoleCriteria andReserve3In(List<java.lang.String> values) {
        addCriterion("RESERVE3 in", values, "reserve3");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve3NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE3 not in", values, "reserve3");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve3Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE3 between", value1, value2, "reserve3");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve3NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE3 not between", value1, value2, "reserve3");
        return (SysRoleCriteria) this;
    }
	public SysRoleCriteria andReserve4IsNull() {
        addCriterion("RESERVE4 is null");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve4IsNotNull() {
        addCriterion("RESERVE4 is not null");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve4EqualTo(java.lang.String value) {
        addCriterion("RESERVE4 =", value, "reserve4");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve4NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 <>", value, "reserve4");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve4GreaterThan(java.lang.String value) {
        addCriterion("RESERVE4 >", value, "reserve4");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve4GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 >=", value, "reserve4");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve4LessThan(java.lang.String value) {
        addCriterion("RESERVE4 <", value, "reserve4");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve4LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 <=", value, "reserve4");
        return (SysRoleCriteria) this;
    }
    
    public SysRoleCriteria andReserve4Like(java.lang.String value) {
        addCriterion("RESERVE4 like", value, "reserve4");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve4NotLike(java.lang.String value) {
        addCriterion("RESERVE4 not like", value, "reserve4");
        return (SysRoleCriteria) this;
    }
    
    public SysRoleCriteria andReserve4In(List<java.lang.String> values) {
        addCriterion("RESERVE4 in", values, "reserve4");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve4NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE4 not in", values, "reserve4");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve4Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE4 between", value1, value2, "reserve4");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve4NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE4 not between", value1, value2, "reserve4");
        return (SysRoleCriteria) this;
    }
	public SysRoleCriteria andReserve5IsNull() {
        addCriterion("RESERVE5 is null");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve5IsNotNull() {
        addCriterion("RESERVE5 is not null");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve5EqualTo(java.lang.String value) {
        addCriterion("RESERVE5 =", value, "reserve5");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve5NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 <>", value, "reserve5");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve5GreaterThan(java.lang.String value) {
        addCriterion("RESERVE5 >", value, "reserve5");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve5GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 >=", value, "reserve5");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve5LessThan(java.lang.String value) {
        addCriterion("RESERVE5 <", value, "reserve5");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve5LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 <=", value, "reserve5");
        return (SysRoleCriteria) this;
    }
    
    public SysRoleCriteria andReserve5Like(java.lang.String value) {
        addCriterion("RESERVE5 like", value, "reserve5");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve5NotLike(java.lang.String value) {
        addCriterion("RESERVE5 not like", value, "reserve5");
        return (SysRoleCriteria) this;
    }
    
    public SysRoleCriteria andReserve5In(List<java.lang.String> values) {
        addCriterion("RESERVE5 in", values, "reserve5");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve5NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE5 not in", values, "reserve5");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve5Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE5 between", value1, value2, "reserve5");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andReserve5NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE5 not between", value1, value2, "reserve5");
        return (SysRoleCriteria) this;
    }
	public SysRoleCriteria andAddUserIdIsNull() {
        addCriterion("ADD_USER_ID is null");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andAddUserIdIsNotNull() {
        addCriterion("ADD_USER_ID is not null");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andAddUserIdEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID =", value, "addUserId");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andAddUserIdNotEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID <>", value, "addUserId");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andAddUserIdGreaterThan(java.lang.Long value) {
        addCriterion("ADD_USER_ID >", value, "addUserId");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andAddUserIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID >=", value, "addUserId");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andAddUserIdLessThan(java.lang.Long value) {
        addCriterion("ADD_USER_ID <", value, "addUserId");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andAddUserIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID <=", value, "addUserId");
        return (SysRoleCriteria) this;
    }
    
    public SysRoleCriteria andAddUserIdIn(List<java.lang.Long> values) {
        addCriterion("ADD_USER_ID in", values, "addUserId");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andAddUserIdNotIn(List<java.lang.Long> values) {
        addCriterion("ADD_USER_ID not in", values, "addUserId");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andAddUserIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ADD_USER_ID between", value1, value2, "addUserId");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andAddUserIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ADD_USER_ID not between", value1, value2, "addUserId");
        return (SysRoleCriteria) this;
    }
	public SysRoleCriteria andAddUserNameIsNull() {
        addCriterion("ADD_USER_NAME is null");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andAddUserNameIsNotNull() {
        addCriterion("ADD_USER_NAME is not null");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andAddUserNameEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME =", value, "addUserName");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andAddUserNameNotEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME <>", value, "addUserName");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andAddUserNameGreaterThan(java.lang.String value) {
        addCriterion("ADD_USER_NAME >", value, "addUserName");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andAddUserNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME >=", value, "addUserName");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andAddUserNameLessThan(java.lang.String value) {
        addCriterion("ADD_USER_NAME <", value, "addUserName");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andAddUserNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME <=", value, "addUserName");
        return (SysRoleCriteria) this;
    }
    
    public SysRoleCriteria andAddUserNameLike(java.lang.String value) {
        addCriterion("ADD_USER_NAME like", value, "addUserName");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andAddUserNameNotLike(java.lang.String value) {
        addCriterion("ADD_USER_NAME not like", value, "addUserName");
        return (SysRoleCriteria) this;
    }
    
    public SysRoleCriteria andAddUserNameIn(List<java.lang.String> values) {
        addCriterion("ADD_USER_NAME in", values, "addUserName");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andAddUserNameNotIn(List<java.lang.String> values) {
        addCriterion("ADD_USER_NAME not in", values, "addUserName");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andAddUserNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ADD_USER_NAME between", value1, value2, "addUserName");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andAddUserNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ADD_USER_NAME not between", value1, value2, "addUserName");
        return (SysRoleCriteria) this;
    }
	public SysRoleCriteria andAddTimeIsNull() {
        addCriterion("ADD_TIME is null");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andAddTimeIsNotNull() {
        addCriterion("ADD_TIME is not null");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andAddTimeEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME =", value, "addTime");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andAddTimeNotEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME <>", value, "addTime");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andAddTimeGreaterThan(java.util.Date value) {
        addCriterion("ADD_TIME >", value, "addTime");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andAddTimeGreaterThanOrEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME >=", value, "addTime");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andAddTimeLessThan(java.util.Date value) {
        addCriterion("ADD_TIME <", value, "addTime");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andAddTimeLessThanOrEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME <=", value, "addTime");
        return (SysRoleCriteria) this;
    }
    
    public SysRoleCriteria andAddTimeIn(List<java.util.Date> values) {
        addCriterion("ADD_TIME in", values, "addTime");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andAddTimeNotIn(List<java.util.Date> values) {
        addCriterion("ADD_TIME not in", values, "addTime");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andAddTimeBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("ADD_TIME between", value1, value2, "addTime");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andAddTimeNotBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("ADD_TIME not between", value1, value2, "addTime");
        return (SysRoleCriteria) this;
    }
	public SysRoleCriteria andModifyUserIdIsNull() {
        addCriterion("MODIFY_USER_ID is null");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andModifyUserIdIsNotNull() {
        addCriterion("MODIFY_USER_ID is not null");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andModifyUserIdEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID =", value, "modifyUserId");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andModifyUserIdNotEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID <>", value, "modifyUserId");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andModifyUserIdGreaterThan(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID >", value, "modifyUserId");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andModifyUserIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID >=", value, "modifyUserId");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andModifyUserIdLessThan(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID <", value, "modifyUserId");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andModifyUserIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID <=", value, "modifyUserId");
        return (SysRoleCriteria) this;
    }
    
    public SysRoleCriteria andModifyUserIdIn(List<java.lang.Long> values) {
        addCriterion("MODIFY_USER_ID in", values, "modifyUserId");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andModifyUserIdNotIn(List<java.lang.Long> values) {
        addCriterion("MODIFY_USER_ID not in", values, "modifyUserId");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andModifyUserIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("MODIFY_USER_ID between", value1, value2, "modifyUserId");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andModifyUserIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("MODIFY_USER_ID not between", value1, value2, "modifyUserId");
        return (SysRoleCriteria) this;
    }
	public SysRoleCriteria andModifyUserNameIsNull() {
        addCriterion("MODIFY_USER_NAME is null");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andModifyUserNameIsNotNull() {
        addCriterion("MODIFY_USER_NAME is not null");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andModifyUserNameEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME =", value, "modifyUserName");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andModifyUserNameNotEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME <>", value, "modifyUserName");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andModifyUserNameGreaterThan(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME >", value, "modifyUserName");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andModifyUserNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME >=", value, "modifyUserName");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andModifyUserNameLessThan(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME <", value, "modifyUserName");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andModifyUserNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME <=", value, "modifyUserName");
        return (SysRoleCriteria) this;
    }
    
    public SysRoleCriteria andModifyUserNameLike(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME like", value, "modifyUserName");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andModifyUserNameNotLike(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME not like", value, "modifyUserName");
        return (SysRoleCriteria) this;
    }
    
    public SysRoleCriteria andModifyUserNameIn(List<java.lang.String> values) {
        addCriterion("MODIFY_USER_NAME in", values, "modifyUserName");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andModifyUserNameNotIn(List<java.lang.String> values) {
        addCriterion("MODIFY_USER_NAME not in", values, "modifyUserName");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andModifyUserNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MODIFY_USER_NAME between", value1, value2, "modifyUserName");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andModifyUserNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MODIFY_USER_NAME not between", value1, value2, "modifyUserName");
        return (SysRoleCriteria) this;
    }
	public SysRoleCriteria andModifyTimeIsNull() {
        addCriterion("MODIFY_TIME is null");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andModifyTimeIsNotNull() {
        addCriterion("MODIFY_TIME is not null");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andModifyTimeEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME =", value, "modifyTime");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andModifyTimeNotEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME <>", value, "modifyTime");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andModifyTimeGreaterThan(java.util.Date value) {
        addCriterion("MODIFY_TIME >", value, "modifyTime");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andModifyTimeGreaterThanOrEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME >=", value, "modifyTime");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andModifyTimeLessThan(java.util.Date value) {
        addCriterion("MODIFY_TIME <", value, "modifyTime");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andModifyTimeLessThanOrEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME <=", value, "modifyTime");
        return (SysRoleCriteria) this;
    }
    
    public SysRoleCriteria andModifyTimeIn(List<java.util.Date> values) {
        addCriterion("MODIFY_TIME in", values, "modifyTime");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andModifyTimeNotIn(List<java.util.Date> values) {
        addCriterion("MODIFY_TIME not in", values, "modifyTime");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andModifyTimeBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("MODIFY_TIME between", value1, value2, "modifyTime");
        return (SysRoleCriteria) this;
    }

    public SysRoleCriteria andModifyTimeNotBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("MODIFY_TIME not between", value1, value2, "modifyTime");
        return (SysRoleCriteria) this;
    }
}

