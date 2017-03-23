package com.pkusoft.admin.model;

import java.util.List;

import com.pkusoft.framework.model.Criteria.BaseCriteria;

/**
 * 
 * @author 
 */
public class SysResourceCriteria extends BaseCriteria {
	public SysResourceCriteria andResourceIdIsNull() {
        addCriterion("RESOURCE_ID is null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceIdIsNotNull() {
        addCriterion("RESOURCE_ID is not null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceIdEqualTo(java.lang.Long value) {
        addCriterion("RESOURCE_ID =", value, "resourceId");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceIdNotEqualTo(java.lang.Long value) {
        addCriterion("RESOURCE_ID <>", value, "resourceId");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceIdGreaterThan(java.lang.Long value) {
        addCriterion("RESOURCE_ID >", value, "resourceId");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("RESOURCE_ID >=", value, "resourceId");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceIdLessThan(java.lang.Long value) {
        addCriterion("RESOURCE_ID <", value, "resourceId");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("RESOURCE_ID <=", value, "resourceId");
        return (SysResourceCriteria) this;
    }
    
    public SysResourceCriteria andResourceIdIn(List<java.lang.Long> values) {
        addCriterion("RESOURCE_ID in", values, "resourceId");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceIdNotIn(List<java.lang.Long> values) {
        addCriterion("RESOURCE_ID not in", values, "resourceId");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("RESOURCE_ID between", value1, value2, "resourceId");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("RESOURCE_ID not between", value1, value2, "resourceId");
        return (SysResourceCriteria) this;
    }
	public SysResourceCriteria andResourceNameIsNull() {
        addCriterion("RESOURCE_NAME is null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceNameIsNotNull() {
        addCriterion("RESOURCE_NAME is not null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceNameEqualTo(java.lang.String value) {
        addCriterion("RESOURCE_NAME =", value, "resourceName");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceNameNotEqualTo(java.lang.String value) {
        addCriterion("RESOURCE_NAME <>", value, "resourceName");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceNameGreaterThan(java.lang.String value) {
        addCriterion("RESOURCE_NAME >", value, "resourceName");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESOURCE_NAME >=", value, "resourceName");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceNameLessThan(java.lang.String value) {
        addCriterion("RESOURCE_NAME <", value, "resourceName");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESOURCE_NAME <=", value, "resourceName");
        return (SysResourceCriteria) this;
    }
    
    public SysResourceCriteria andResourceNameLike(java.lang.String value) {
        addCriterion("RESOURCE_NAME like", value, "resourceName");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceNameNotLike(java.lang.String value) {
        addCriterion("RESOURCE_NAME not like", value, "resourceName");
        return (SysResourceCriteria) this;
    }
    
    public SysResourceCriteria andResourceNameIn(List<java.lang.String> values) {
        addCriterion("RESOURCE_NAME in", values, "resourceName");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceNameNotIn(List<java.lang.String> values) {
        addCriterion("RESOURCE_NAME not in", values, "resourceName");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESOURCE_NAME between", value1, value2, "resourceName");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESOURCE_NAME not between", value1, value2, "resourceName");
        return (SysResourceCriteria) this;
    }
	public SysResourceCriteria andResourceUrlIsNull() {
        addCriterion("RESOURCE_URL is null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceUrlIsNotNull() {
        addCriterion("RESOURCE_URL is not null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceUrlEqualTo(java.lang.String value) {
        addCriterion("RESOURCE_URL =", value, "resourceUrl");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceUrlNotEqualTo(java.lang.String value) {
        addCriterion("RESOURCE_URL <>", value, "resourceUrl");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceUrlGreaterThan(java.lang.String value) {
        addCriterion("RESOURCE_URL >", value, "resourceUrl");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceUrlGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESOURCE_URL >=", value, "resourceUrl");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceUrlLessThan(java.lang.String value) {
        addCriterion("RESOURCE_URL <", value, "resourceUrl");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceUrlLessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESOURCE_URL <=", value, "resourceUrl");
        return (SysResourceCriteria) this;
    }
    
    public SysResourceCriteria andResourceUrlLike(java.lang.String value) {
        addCriterion("RESOURCE_URL like", value, "resourceUrl");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceUrlNotLike(java.lang.String value) {
        addCriterion("RESOURCE_URL not like", value, "resourceUrl");
        return (SysResourceCriteria) this;
    }
    
    public SysResourceCriteria andResourceUrlIn(List<java.lang.String> values) {
        addCriterion("RESOURCE_URL in", values, "resourceUrl");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceUrlNotIn(List<java.lang.String> values) {
        addCriterion("RESOURCE_URL not in", values, "resourceUrl");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceUrlBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESOURCE_URL between", value1, value2, "resourceUrl");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceUrlNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESOURCE_URL not between", value1, value2, "resourceUrl");
        return (SysResourceCriteria) this;
    }
	public SysResourceCriteria andResourceDescIsNull() {
        addCriterion("RESOURCE_DESC is null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceDescIsNotNull() {
        addCriterion("RESOURCE_DESC is not null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceDescEqualTo(java.lang.String value) {
        addCriterion("RESOURCE_DESC =", value, "resourceDesc");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceDescNotEqualTo(java.lang.String value) {
        addCriterion("RESOURCE_DESC <>", value, "resourceDesc");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceDescGreaterThan(java.lang.String value) {
        addCriterion("RESOURCE_DESC >", value, "resourceDesc");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceDescGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESOURCE_DESC >=", value, "resourceDesc");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceDescLessThan(java.lang.String value) {
        addCriterion("RESOURCE_DESC <", value, "resourceDesc");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceDescLessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESOURCE_DESC <=", value, "resourceDesc");
        return (SysResourceCriteria) this;
    }
    
    public SysResourceCriteria andResourceDescLike(java.lang.String value) {
        addCriterion("RESOURCE_DESC like", value, "resourceDesc");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceDescNotLike(java.lang.String value) {
        addCriterion("RESOURCE_DESC not like", value, "resourceDesc");
        return (SysResourceCriteria) this;
    }
    
    public SysResourceCriteria andResourceDescIn(List<java.lang.String> values) {
        addCriterion("RESOURCE_DESC in", values, "resourceDesc");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceDescNotIn(List<java.lang.String> values) {
        addCriterion("RESOURCE_DESC not in", values, "resourceDesc");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceDescBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESOURCE_DESC between", value1, value2, "resourceDesc");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceDescNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESOURCE_DESC not between", value1, value2, "resourceDesc");
        return (SysResourceCriteria) this;
    }
	public SysResourceCriteria andResourceLevelIsNull() {
        addCriterion("RESOURCE_LEVEL is null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceLevelIsNotNull() {
        addCriterion("RESOURCE_LEVEL is not null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceLevelEqualTo(java.lang.String value) {
        addCriterion("RESOURCE_LEVEL =", value, "resourceLevel");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceLevelNotEqualTo(java.lang.String value) {
        addCriterion("RESOURCE_LEVEL <>", value, "resourceLevel");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceLevelGreaterThan(java.lang.String value) {
        addCriterion("RESOURCE_LEVEL >", value, "resourceLevel");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceLevelGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESOURCE_LEVEL >=", value, "resourceLevel");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceLevelLessThan(java.lang.String value) {
        addCriterion("RESOURCE_LEVEL <", value, "resourceLevel");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceLevelLessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESOURCE_LEVEL <=", value, "resourceLevel");
        return (SysResourceCriteria) this;
    }
    
    public SysResourceCriteria andResourceLevelLike(java.lang.String value) {
        addCriterion("RESOURCE_LEVEL like", value, "resourceLevel");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceLevelNotLike(java.lang.String value) {
        addCriterion("RESOURCE_LEVEL not like", value, "resourceLevel");
        return (SysResourceCriteria) this;
    }
    
    public SysResourceCriteria andResourceLevelIn(List<java.lang.String> values) {
        addCriterion("RESOURCE_LEVEL in", values, "resourceLevel");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceLevelNotIn(List<java.lang.String> values) {
        addCriterion("RESOURCE_LEVEL not in", values, "resourceLevel");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceLevelBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESOURCE_LEVEL between", value1, value2, "resourceLevel");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andResourceLevelNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESOURCE_LEVEL not between", value1, value2, "resourceLevel");
        return (SysResourceCriteria) this;
    }
	public SysResourceCriteria andTreeLevelIsNull() {
        addCriterion("TREE_LEVEL is null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andTreeLevelIsNotNull() {
        addCriterion("TREE_LEVEL is not null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andTreeLevelEqualTo(java.lang.Long value) {
        addCriterion("TREE_LEVEL =", value, "treeLevel");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andTreeLevelNotEqualTo(java.lang.Long value) {
        addCriterion("TREE_LEVEL <>", value, "treeLevel");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andTreeLevelGreaterThan(java.lang.Long value) {
        addCriterion("TREE_LEVEL >", value, "treeLevel");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andTreeLevelGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("TREE_LEVEL >=", value, "treeLevel");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andTreeLevelLessThan(java.lang.Long value) {
        addCriterion("TREE_LEVEL <", value, "treeLevel");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andTreeLevelLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("TREE_LEVEL <=", value, "treeLevel");
        return (SysResourceCriteria) this;
    }
    
    public SysResourceCriteria andTreeLevelIn(List<java.lang.Long> values) {
        addCriterion("TREE_LEVEL in", values, "treeLevel");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andTreeLevelNotIn(List<java.lang.Long> values) {
        addCriterion("TREE_LEVEL not in", values, "treeLevel");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andTreeLevelBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("TREE_LEVEL between", value1, value2, "treeLevel");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andTreeLevelNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("TREE_LEVEL not between", value1, value2, "treeLevel");
        return (SysResourceCriteria) this;
    }
	public SysResourceCriteria andMenuIdIsNull() {
        addCriterion("MENU_ID is null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andMenuIdIsNotNull() {
        addCriterion("MENU_ID is not null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andMenuIdEqualTo(java.lang.Long value) {
        addCriterion("MENU_ID =", value, "menuId");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andMenuIdNotEqualTo(java.lang.Long value) {
        addCriterion("MENU_ID <>", value, "menuId");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andMenuIdGreaterThan(java.lang.Long value) {
        addCriterion("MENU_ID >", value, "menuId");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andMenuIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("MENU_ID >=", value, "menuId");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andMenuIdLessThan(java.lang.Long value) {
        addCriterion("MENU_ID <", value, "menuId");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andMenuIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("MENU_ID <=", value, "menuId");
        return (SysResourceCriteria) this;
    }
    
    public SysResourceCriteria andMenuIdIn(List<java.lang.Long> values) {
        addCriterion("MENU_ID in", values, "menuId");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andMenuIdNotIn(List<java.lang.Long> values) {
        addCriterion("MENU_ID not in", values, "menuId");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andMenuIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("MENU_ID between", value1, value2, "menuId");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andMenuIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("MENU_ID not between", value1, value2, "menuId");
        return (SysResourceCriteria) this;
    }
	public SysResourceCriteria andOrderFlagIsNull() {
        addCriterion("ORDER_FLAG is null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andOrderFlagIsNotNull() {
        addCriterion("ORDER_FLAG is not null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andOrderFlagEqualTo(java.lang.Long value) {
        addCriterion("ORDER_FLAG =", value, "orderFlag");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andOrderFlagNotEqualTo(java.lang.Long value) {
        addCriterion("ORDER_FLAG <>", value, "orderFlag");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andOrderFlagGreaterThan(java.lang.Long value) {
        addCriterion("ORDER_FLAG >", value, "orderFlag");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andOrderFlagGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ORDER_FLAG >=", value, "orderFlag");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andOrderFlagLessThan(java.lang.Long value) {
        addCriterion("ORDER_FLAG <", value, "orderFlag");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andOrderFlagLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ORDER_FLAG <=", value, "orderFlag");
        return (SysResourceCriteria) this;
    }
    
    public SysResourceCriteria andOrderFlagIn(List<java.lang.Long> values) {
        addCriterion("ORDER_FLAG in", values, "orderFlag");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andOrderFlagNotIn(List<java.lang.Long> values) {
        addCriterion("ORDER_FLAG not in", values, "orderFlag");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andOrderFlagBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ORDER_FLAG between", value1, value2, "orderFlag");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andOrderFlagNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ORDER_FLAG not between", value1, value2, "orderFlag");
        return (SysResourceCriteria) this;
    }
	public SysResourceCriteria andReserve1IsNull() {
        addCriterion("RESERVE1 is null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve1IsNotNull() {
        addCriterion("RESERVE1 is not null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve1EqualTo(java.lang.String value) {
        addCriterion("RESERVE1 =", value, "reserve1");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve1NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 <>", value, "reserve1");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve1GreaterThan(java.lang.String value) {
        addCriterion("RESERVE1 >", value, "reserve1");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve1GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 >=", value, "reserve1");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve1LessThan(java.lang.String value) {
        addCriterion("RESERVE1 <", value, "reserve1");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve1LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 <=", value, "reserve1");
        return (SysResourceCriteria) this;
    }
    
    public SysResourceCriteria andReserve1Like(java.lang.String value) {
        addCriterion("RESERVE1 like", value, "reserve1");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve1NotLike(java.lang.String value) {
        addCriterion("RESERVE1 not like", value, "reserve1");
        return (SysResourceCriteria) this;
    }
    
    public SysResourceCriteria andReserve1In(List<java.lang.String> values) {
        addCriterion("RESERVE1 in", values, "reserve1");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve1NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE1 not in", values, "reserve1");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve1Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE1 between", value1, value2, "reserve1");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve1NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE1 not between", value1, value2, "reserve1");
        return (SysResourceCriteria) this;
    }
	public SysResourceCriteria andReserve2IsNull() {
        addCriterion("RESERVE2 is null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve2IsNotNull() {
        addCriterion("RESERVE2 is not null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve2EqualTo(java.lang.String value) {
        addCriterion("RESERVE2 =", value, "reserve2");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve2NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 <>", value, "reserve2");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve2GreaterThan(java.lang.String value) {
        addCriterion("RESERVE2 >", value, "reserve2");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve2GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 >=", value, "reserve2");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve2LessThan(java.lang.String value) {
        addCriterion("RESERVE2 <", value, "reserve2");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve2LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 <=", value, "reserve2");
        return (SysResourceCriteria) this;
    }
    
    public SysResourceCriteria andReserve2Like(java.lang.String value) {
        addCriterion("RESERVE2 like", value, "reserve2");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve2NotLike(java.lang.String value) {
        addCriterion("RESERVE2 not like", value, "reserve2");
        return (SysResourceCriteria) this;
    }
    
    public SysResourceCriteria andReserve2In(List<java.lang.String> values) {
        addCriterion("RESERVE2 in", values, "reserve2");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve2NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE2 not in", values, "reserve2");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve2Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE2 between", value1, value2, "reserve2");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve2NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE2 not between", value1, value2, "reserve2");
        return (SysResourceCriteria) this;
    }
	public SysResourceCriteria andReserve3IsNull() {
        addCriterion("RESERVE3 is null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve3IsNotNull() {
        addCriterion("RESERVE3 is not null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve3EqualTo(java.lang.String value) {
        addCriterion("RESERVE3 =", value, "reserve3");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve3NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 <>", value, "reserve3");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve3GreaterThan(java.lang.String value) {
        addCriterion("RESERVE3 >", value, "reserve3");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve3GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 >=", value, "reserve3");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve3LessThan(java.lang.String value) {
        addCriterion("RESERVE3 <", value, "reserve3");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve3LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 <=", value, "reserve3");
        return (SysResourceCriteria) this;
    }
    
    public SysResourceCriteria andReserve3Like(java.lang.String value) {
        addCriterion("RESERVE3 like", value, "reserve3");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve3NotLike(java.lang.String value) {
        addCriterion("RESERVE3 not like", value, "reserve3");
        return (SysResourceCriteria) this;
    }
    
    public SysResourceCriteria andReserve3In(List<java.lang.String> values) {
        addCriterion("RESERVE3 in", values, "reserve3");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve3NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE3 not in", values, "reserve3");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve3Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE3 between", value1, value2, "reserve3");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve3NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE3 not between", value1, value2, "reserve3");
        return (SysResourceCriteria) this;
    }
	public SysResourceCriteria andReserve4IsNull() {
        addCriterion("RESERVE4 is null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve4IsNotNull() {
        addCriterion("RESERVE4 is not null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve4EqualTo(java.lang.String value) {
        addCriterion("RESERVE4 =", value, "reserve4");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve4NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 <>", value, "reserve4");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve4GreaterThan(java.lang.String value) {
        addCriterion("RESERVE4 >", value, "reserve4");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve4GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 >=", value, "reserve4");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve4LessThan(java.lang.String value) {
        addCriterion("RESERVE4 <", value, "reserve4");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve4LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 <=", value, "reserve4");
        return (SysResourceCriteria) this;
    }
    
    public SysResourceCriteria andReserve4Like(java.lang.String value) {
        addCriterion("RESERVE4 like", value, "reserve4");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve4NotLike(java.lang.String value) {
        addCriterion("RESERVE4 not like", value, "reserve4");
        return (SysResourceCriteria) this;
    }
    
    public SysResourceCriteria andReserve4In(List<java.lang.String> values) {
        addCriterion("RESERVE4 in", values, "reserve4");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve4NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE4 not in", values, "reserve4");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve4Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE4 between", value1, value2, "reserve4");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve4NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE4 not between", value1, value2, "reserve4");
        return (SysResourceCriteria) this;
    }
	public SysResourceCriteria andReserve5IsNull() {
        addCriterion("RESERVE5 is null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve5IsNotNull() {
        addCriterion("RESERVE5 is not null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve5EqualTo(java.lang.String value) {
        addCriterion("RESERVE5 =", value, "reserve5");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve5NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 <>", value, "reserve5");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve5GreaterThan(java.lang.String value) {
        addCriterion("RESERVE5 >", value, "reserve5");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve5GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 >=", value, "reserve5");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve5LessThan(java.lang.String value) {
        addCriterion("RESERVE5 <", value, "reserve5");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve5LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 <=", value, "reserve5");
        return (SysResourceCriteria) this;
    }
    
    public SysResourceCriteria andReserve5Like(java.lang.String value) {
        addCriterion("RESERVE5 like", value, "reserve5");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve5NotLike(java.lang.String value) {
        addCriterion("RESERVE5 not like", value, "reserve5");
        return (SysResourceCriteria) this;
    }
    
    public SysResourceCriteria andReserve5In(List<java.lang.String> values) {
        addCriterion("RESERVE5 in", values, "reserve5");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve5NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE5 not in", values, "reserve5");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve5Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE5 between", value1, value2, "reserve5");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andReserve5NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE5 not between", value1, value2, "reserve5");
        return (SysResourceCriteria) this;
    }
	public SysResourceCriteria andAddUserIdIsNull() {
        addCriterion("ADD_USER_ID is null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andAddUserIdIsNotNull() {
        addCriterion("ADD_USER_ID is not null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andAddUserIdEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID =", value, "addUserId");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andAddUserIdNotEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID <>", value, "addUserId");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andAddUserIdGreaterThan(java.lang.Long value) {
        addCriterion("ADD_USER_ID >", value, "addUserId");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andAddUserIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID >=", value, "addUserId");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andAddUserIdLessThan(java.lang.Long value) {
        addCriterion("ADD_USER_ID <", value, "addUserId");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andAddUserIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID <=", value, "addUserId");
        return (SysResourceCriteria) this;
    }
    
    public SysResourceCriteria andAddUserIdIn(List<java.lang.Long> values) {
        addCriterion("ADD_USER_ID in", values, "addUserId");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andAddUserIdNotIn(List<java.lang.Long> values) {
        addCriterion("ADD_USER_ID not in", values, "addUserId");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andAddUserIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ADD_USER_ID between", value1, value2, "addUserId");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andAddUserIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ADD_USER_ID not between", value1, value2, "addUserId");
        return (SysResourceCriteria) this;
    }
	public SysResourceCriteria andAddUserNameIsNull() {
        addCriterion("ADD_USER_NAME is null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andAddUserNameIsNotNull() {
        addCriterion("ADD_USER_NAME is not null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andAddUserNameEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME =", value, "addUserName");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andAddUserNameNotEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME <>", value, "addUserName");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andAddUserNameGreaterThan(java.lang.String value) {
        addCriterion("ADD_USER_NAME >", value, "addUserName");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andAddUserNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME >=", value, "addUserName");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andAddUserNameLessThan(java.lang.String value) {
        addCriterion("ADD_USER_NAME <", value, "addUserName");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andAddUserNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME <=", value, "addUserName");
        return (SysResourceCriteria) this;
    }
    
    public SysResourceCriteria andAddUserNameLike(java.lang.String value) {
        addCriterion("ADD_USER_NAME like", value, "addUserName");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andAddUserNameNotLike(java.lang.String value) {
        addCriterion("ADD_USER_NAME not like", value, "addUserName");
        return (SysResourceCriteria) this;
    }
    
    public SysResourceCriteria andAddUserNameIn(List<java.lang.String> values) {
        addCriterion("ADD_USER_NAME in", values, "addUserName");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andAddUserNameNotIn(List<java.lang.String> values) {
        addCriterion("ADD_USER_NAME not in", values, "addUserName");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andAddUserNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ADD_USER_NAME between", value1, value2, "addUserName");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andAddUserNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ADD_USER_NAME not between", value1, value2, "addUserName");
        return (SysResourceCriteria) this;
    }
	public SysResourceCriteria andAddTimeIsNull() {
        addCriterion("ADD_TIME is null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andAddTimeIsNotNull() {
        addCriterion("ADD_TIME is not null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andAddTimeEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME =", value, "addTime");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andAddTimeNotEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME <>", value, "addTime");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andAddTimeGreaterThan(java.util.Date value) {
        addCriterion("ADD_TIME >", value, "addTime");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andAddTimeGreaterThanOrEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME >=", value, "addTime");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andAddTimeLessThan(java.util.Date value) {
        addCriterion("ADD_TIME <", value, "addTime");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andAddTimeLessThanOrEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME <=", value, "addTime");
        return (SysResourceCriteria) this;
    }
    
    public SysResourceCriteria andAddTimeIn(List<java.util.Date> values) {
        addCriterion("ADD_TIME in", values, "addTime");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andAddTimeNotIn(List<java.util.Date> values) {
        addCriterion("ADD_TIME not in", values, "addTime");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andAddTimeBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("ADD_TIME between", value1, value2, "addTime");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andAddTimeNotBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("ADD_TIME not between", value1, value2, "addTime");
        return (SysResourceCriteria) this;
    }
	public SysResourceCriteria andModifyUserIdIsNull() {
        addCriterion("MODIFY_USER_ID is null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andModifyUserIdIsNotNull() {
        addCriterion("MODIFY_USER_ID is not null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andModifyUserIdEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID =", value, "modifyUserId");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andModifyUserIdNotEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID <>", value, "modifyUserId");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andModifyUserIdGreaterThan(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID >", value, "modifyUserId");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andModifyUserIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID >=", value, "modifyUserId");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andModifyUserIdLessThan(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID <", value, "modifyUserId");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andModifyUserIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID <=", value, "modifyUserId");
        return (SysResourceCriteria) this;
    }
    
    public SysResourceCriteria andModifyUserIdIn(List<java.lang.Long> values) {
        addCriterion("MODIFY_USER_ID in", values, "modifyUserId");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andModifyUserIdNotIn(List<java.lang.Long> values) {
        addCriterion("MODIFY_USER_ID not in", values, "modifyUserId");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andModifyUserIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("MODIFY_USER_ID between", value1, value2, "modifyUserId");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andModifyUserIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("MODIFY_USER_ID not between", value1, value2, "modifyUserId");
        return (SysResourceCriteria) this;
    }
	public SysResourceCriteria andModifyUserNameIsNull() {
        addCriterion("MODIFY_USER_NAME is null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andModifyUserNameIsNotNull() {
        addCriterion("MODIFY_USER_NAME is not null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andModifyUserNameEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME =", value, "modifyUserName");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andModifyUserNameNotEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME <>", value, "modifyUserName");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andModifyUserNameGreaterThan(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME >", value, "modifyUserName");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andModifyUserNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME >=", value, "modifyUserName");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andModifyUserNameLessThan(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME <", value, "modifyUserName");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andModifyUserNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME <=", value, "modifyUserName");
        return (SysResourceCriteria) this;
    }
    
    public SysResourceCriteria andModifyUserNameLike(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME like", value, "modifyUserName");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andModifyUserNameNotLike(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME not like", value, "modifyUserName");
        return (SysResourceCriteria) this;
    }
    
    public SysResourceCriteria andModifyUserNameIn(List<java.lang.String> values) {
        addCriterion("MODIFY_USER_NAME in", values, "modifyUserName");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andModifyUserNameNotIn(List<java.lang.String> values) {
        addCriterion("MODIFY_USER_NAME not in", values, "modifyUserName");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andModifyUserNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MODIFY_USER_NAME between", value1, value2, "modifyUserName");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andModifyUserNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MODIFY_USER_NAME not between", value1, value2, "modifyUserName");
        return (SysResourceCriteria) this;
    }
	public SysResourceCriteria andModifyTimeIsNull() {
        addCriterion("MODIFY_TIME is null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andModifyTimeIsNotNull() {
        addCriterion("MODIFY_TIME is not null");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andModifyTimeEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME =", value, "modifyTime");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andModifyTimeNotEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME <>", value, "modifyTime");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andModifyTimeGreaterThan(java.util.Date value) {
        addCriterion("MODIFY_TIME >", value, "modifyTime");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andModifyTimeGreaterThanOrEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME >=", value, "modifyTime");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andModifyTimeLessThan(java.util.Date value) {
        addCriterion("MODIFY_TIME <", value, "modifyTime");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andModifyTimeLessThanOrEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME <=", value, "modifyTime");
        return (SysResourceCriteria) this;
    }
    
    public SysResourceCriteria andModifyTimeIn(List<java.util.Date> values) {
        addCriterion("MODIFY_TIME in", values, "modifyTime");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andModifyTimeNotIn(List<java.util.Date> values) {
        addCriterion("MODIFY_TIME not in", values, "modifyTime");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andModifyTimeBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("MODIFY_TIME between", value1, value2, "modifyTime");
        return (SysResourceCriteria) this;
    }

    public SysResourceCriteria andModifyTimeNotBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("MODIFY_TIME not between", value1, value2, "modifyTime");
        return (SysResourceCriteria) this;
    }
}

