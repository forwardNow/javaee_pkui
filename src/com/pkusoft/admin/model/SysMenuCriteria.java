package com.pkusoft.admin.model;

import java.util.List;

import com.pkusoft.framework.model.Criteria.BaseCriteria;

/**
 * 
 * @author 
 */
public class SysMenuCriteria extends BaseCriteria {
	public SysMenuCriteria andMenuIdIsNull() {
        addCriterion("MENU_ID is null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMenuIdIsNotNull() {
        addCriterion("MENU_ID is not null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMenuIdEqualTo(java.lang.Long value) {
        addCriterion("MENU_ID =", value, "menuId");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMenuIdNotEqualTo(java.lang.Long value) {
        addCriterion("MENU_ID <>", value, "menuId");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMenuIdGreaterThan(java.lang.Long value) {
        addCriterion("MENU_ID >", value, "menuId");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMenuIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("MENU_ID >=", value, "menuId");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMenuIdLessThan(java.lang.Long value) {
        addCriterion("MENU_ID <", value, "menuId");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMenuIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("MENU_ID <=", value, "menuId");
        return (SysMenuCriteria) this;
    }
    
    public SysMenuCriteria andMenuIdIn(List<java.lang.Long> values) {
        addCriterion("MENU_ID in", values, "menuId");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMenuIdNotIn(List<java.lang.Long> values) {
        addCriterion("MENU_ID not in", values, "menuId");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMenuIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("MENU_ID between", value1, value2, "menuId");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMenuIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("MENU_ID not between", value1, value2, "menuId");
        return (SysMenuCriteria) this;
    }

	public SysMenuCriteria andMenuNameIsNull() {
        addCriterion("MENU_NAME is null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMenuNameIsNotNull() {
        addCriterion("MENU_NAME is not null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMenuNameEqualTo(java.lang.String value) {
        addCriterion("MENU_NAME =", value, "menuName");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMenuNameNotEqualTo(java.lang.String value) {
        addCriterion("MENU_NAME <>", value, "menuName");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMenuNameGreaterThan(java.lang.String value) {
        addCriterion("MENU_NAME >", value, "menuName");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMenuNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("MENU_NAME >=", value, "menuName");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMenuNameLessThan(java.lang.String value) {
        addCriterion("MENU_NAME <", value, "menuName");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMenuNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("MENU_NAME <=", value, "menuName");
        return (SysMenuCriteria) this;
    }
    
    public SysMenuCriteria andMenuNameLike(java.lang.String value) {
        addCriterion("MENU_NAME like", value, "menuName");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMenuNameNotLike(java.lang.String value) {
        addCriterion("MENU_NAME not like", value, "menuName");
        return (SysMenuCriteria) this;
    }
    
    public SysMenuCriteria andMenuNameIn(List<java.lang.String> values) {
        addCriterion("MENU_NAME in", values, "menuName");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMenuNameNotIn(List<java.lang.String> values) {
        addCriterion("MENU_NAME not in", values, "menuName");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMenuNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MENU_NAME between", value1, value2, "menuName");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMenuNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MENU_NAME not between", value1, value2, "menuName");
        return (SysMenuCriteria) this;
    }
	public SysMenuCriteria andUrlIsNull() {
        addCriterion("MENU_Url is null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andUrlIsNotNull() {
        addCriterion("MENU_Url is not null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andUrlEqualTo(java.lang.String value) {
        addCriterion("MENU_Url =", value, "menuUrl");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andUrlNotEqualTo(java.lang.String value) {
        addCriterion("MENU_Url <>", value, "menuUrl");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andUrlGreaterThan(java.lang.String value) {
        addCriterion("MENU_Url >", value, "menuUrl");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andUrlGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("MENU_Url >=", value, "menuUrl");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andUrlLessThan(java.lang.String value) {
        addCriterion("MENU_Url <", value, "menuUrl");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andUrlLessThanOrEqualTo(java.lang.String value) {
        addCriterion("MENU_Url <=", value, "menuUrl");
        return (SysMenuCriteria) this;
    }
    
    public SysMenuCriteria andUrlLike(java.lang.String value) {
        addCriterion("MENU_Url like", value, "menuUrl");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andUrlNotLike(java.lang.String value) {
        addCriterion("MENU_Url not like", value, "menuUrl");
        return (SysMenuCriteria) this;
    }
    
    public SysMenuCriteria andUrlIn(List<java.lang.String> values) {
        addCriterion("MENU_Url in", values, "menuUrl");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andUrlNotIn(List<java.lang.String> values) {
        addCriterion("MENU_Url not in", values, "menuUrl");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andUrlBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MENU_Url between", value1, value2, "menuUrl");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andUrlNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MENU_Url not between", value1, value2, "menuUrl");
        return (SysMenuCriteria) this;
    }
	public SysMenuCriteria andIconIsNull() {
        addCriterion("ICON is null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andIconIsNotNull() {
        addCriterion("ICON is not null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andIconEqualTo(java.lang.String value) {
        addCriterion("ICON =", value, "icon");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andIconNotEqualTo(java.lang.String value) {
        addCriterion("ICON <>", value, "icon");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andIconGreaterThan(java.lang.String value) {
        addCriterion("ICON >", value, "icon");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andIconGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("ICON >=", value, "icon");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andIconLessThan(java.lang.String value) {
        addCriterion("ICON <", value, "icon");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andIconLessThanOrEqualTo(java.lang.String value) {
        addCriterion("ICON <=", value, "icon");
        return (SysMenuCriteria) this;
    }
    
    public SysMenuCriteria andIconLike(java.lang.String value) {
        addCriterion("ICON like", value, "icon");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andIconNotLike(java.lang.String value) {
        addCriterion("ICON not like", value, "icon");
        return (SysMenuCriteria) this;
    }
    
    public SysMenuCriteria andIconIn(List<java.lang.String> values) {
        addCriterion("ICON in", values, "icon");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andIconNotIn(List<java.lang.String> values) {
        addCriterion("ICON not in", values, "icon");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andIconBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ICON between", value1, value2, "icon");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andIconNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ICON not between", value1, value2, "icon");
        return (SysMenuCriteria) this;
    }
	public SysMenuCriteria andMenuLevelIsNull() {
        addCriterion("MENU_LEVEL is null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMenuLevelIsNotNull() {
        addCriterion("MENU_LEVEL is not null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMenuLevelEqualTo(java.lang.String value) {
        addCriterion("MENU_LEVEL =", value, "menuLevel");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMenuLevelNotEqualTo(java.lang.String value) {
        addCriterion("MENU_LEVEL <>", value, "menuLevel");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMenuLevelGreaterThan(java.lang.String value) {
        addCriterion("MENU_LEVEL >", value, "menuLevel");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMenuLevelGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("MENU_LEVEL >=", value, "menuLevel");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMenuLevelLessThan(java.lang.String value) {
        addCriterion("MENU_LEVEL <", value, "menuLevel");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMenuLevelLessThanOrEqualTo(java.lang.String value) {
        addCriterion("MENU_LEVEL <=", value, "menuLevel");
        return (SysMenuCriteria) this;
    }
    
    public SysMenuCriteria andMenuLevelLike(java.lang.String value) {
        addCriterion("MENU_LEVEL like", value, "menuLevel");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMenuLevelNotLike(java.lang.String value) {
        addCriterion("MENU_LEVEL not like", value, "menuLevel");
        return (SysMenuCriteria) this;
    }
    
    public SysMenuCriteria andMenuLevelIn(List<java.lang.String> values) {
        addCriterion("MENU_LEVEL in", values, "menuLevel");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMenuLevelNotIn(List<java.lang.String> values) {
        addCriterion("MENU_LEVEL not in", values, "menuLevel");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMenuLevelBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MENU_LEVEL between", value1, value2, "menuLevel");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMenuLevelNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MENU_LEVEL not between", value1, value2, "menuLevel");
        return (SysMenuCriteria) this;
    }
	public SysMenuCriteria andTreeLevelIsNull() {
        addCriterion("TREE_LEVEL is null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andTreeLevelIsNotNull() {
        addCriterion("TREE_LEVEL is not null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andTreeLevelEqualTo(java.lang.Long value) {
        addCriterion("TREE_LEVEL =", value, "treeLevel");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andTreeLevelNotEqualTo(java.lang.Long value) {
        addCriterion("TREE_LEVEL <>", value, "treeLevel");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andTreeLevelGreaterThan(java.lang.Long value) {
        addCriterion("TREE_LEVEL >", value, "treeLevel");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andTreeLevelGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("TREE_LEVEL >=", value, "treeLevel");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andTreeLevelLessThan(java.lang.Long value) {
        addCriterion("TREE_LEVEL <", value, "treeLevel");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andTreeLevelLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("TREE_LEVEL <=", value, "treeLevel");
        return (SysMenuCriteria) this;
    }
    
    public SysMenuCriteria andTreeLevelIn(List<java.lang.Long> values) {
        addCriterion("TREE_LEVEL in", values, "treeLevel");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andTreeLevelNotIn(List<java.lang.Long> values) {
        addCriterion("TREE_LEVEL not in", values, "treeLevel");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andTreeLevelBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("TREE_LEVEL between", value1, value2, "treeLevel");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andTreeLevelNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("TREE_LEVEL not between", value1, value2, "treeLevel");
        return (SysMenuCriteria) this;
    }
	public SysMenuCriteria andTreeParentidIsNull() {
        addCriterion("TREE_PARENTID is null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andTreeParentidIsNotNull() {
        addCriterion("TREE_PARENTID is not null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andTreeParentidEqualTo(java.lang.Long value) {
        addCriterion("TREE_PARENTID =", value, "treeParentid");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andTreeParentidNotEqualTo(java.lang.Long value) {
        addCriterion("TREE_PARENTID <>", value, "treeParentid");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andTreeParentidGreaterThan(java.lang.Long value) {
        addCriterion("TREE_PARENTID >", value, "treeParentid");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andTreeParentidGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("TREE_PARENTID >=", value, "treeParentid");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andTreeParentidLessThan(java.lang.Long value) {
        addCriterion("TREE_PARENTID <", value, "treeParentid");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andTreeParentidLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("TREE_PARENTID <=", value, "treeParentid");
        return (SysMenuCriteria) this;
    }
    
    public SysMenuCriteria andTreeParentidIn(List<java.lang.Long> values) {
        addCriterion("TREE_PARENTID in", values, "treeParentid");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andTreeParentidNotIn(List<java.lang.Long> values) {
        addCriterion("TREE_PARENTID not in", values, "treeParentid");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andTreeParentidBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("TREE_PARENTID between", value1, value2, "treeParentid");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andTreeParentidNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("TREE_PARENTID not between", value1, value2, "treeParentid");
        return (SysMenuCriteria) this;
    }
	public SysMenuCriteria andVisiableIsNull() {
        addCriterion("VISIABLE is null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andVisiableIsNotNull() {
        addCriterion("VISIABLE is not null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andVisiableEqualTo(java.lang.String value) {
        addCriterion("VISIABLE =", value, "visiable");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andVisiableNotEqualTo(java.lang.String value) {
        addCriterion("VISIABLE <>", value, "visiable");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andVisiableGreaterThan(java.lang.String value) {
        addCriterion("VISIABLE >", value, "visiable");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andVisiableGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("VISIABLE >=", value, "visiable");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andVisiableLessThan(java.lang.String value) {
        addCriterion("VISIABLE <", value, "visiable");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andVisiableLessThanOrEqualTo(java.lang.String value) {
        addCriterion("VISIABLE <=", value, "visiable");
        return (SysMenuCriteria) this;
    }
    
    public SysMenuCriteria andVisiableLike(java.lang.String value) {
        addCriterion("VISIABLE like", value, "visiable");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andVisiableNotLike(java.lang.String value) {
        addCriterion("VISIABLE not like", value, "visiable");
        return (SysMenuCriteria) this;
    }
    
    public SysMenuCriteria andVisiableIn(List<java.lang.String> values) {
        addCriterion("VISIABLE in", values, "visiable");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andVisiableNotIn(List<java.lang.String> values) {
        addCriterion("VISIABLE not in", values, "visiable");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andVisiableBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("VISIABLE between", value1, value2, "visiable");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andVisiableNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("VISIABLE not between", value1, value2, "visiable");
        return (SysMenuCriteria) this;
    }
	public SysMenuCriteria andExpandIsNull() {
        addCriterion("EXPAND is null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andExpandIsNotNull() {
        addCriterion("EXPAND is not null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andExpandEqualTo(java.lang.String value) {
        addCriterion("EXPAND =", value, "expand");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andExpandNotEqualTo(java.lang.String value) {
        addCriterion("EXPAND <>", value, "expand");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andExpandGreaterThan(java.lang.String value) {
        addCriterion("EXPAND >", value, "expand");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andExpandGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("EXPAND >=", value, "expand");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andExpandLessThan(java.lang.String value) {
        addCriterion("EXPAND <", value, "expand");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andExpandLessThanOrEqualTo(java.lang.String value) {
        addCriterion("EXPAND <=", value, "expand");
        return (SysMenuCriteria) this;
    }
    
    public SysMenuCriteria andExpandLike(java.lang.String value) {
        addCriterion("EXPAND like", value, "expand");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andExpandNotLike(java.lang.String value) {
        addCriterion("EXPAND not like", value, "expand");
        return (SysMenuCriteria) this;
    }
    
    public SysMenuCriteria andExpandIn(List<java.lang.String> values) {
        addCriterion("EXPAND in", values, "expand");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andExpandNotIn(List<java.lang.String> values) {
        addCriterion("EXPAND not in", values, "expand");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andExpandBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("EXPAND between", value1, value2, "expand");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andExpandNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("EXPAND not between", value1, value2, "expand");
        return (SysMenuCriteria) this;
    }
	public SysMenuCriteria andOrderFlagIsNull() {
        addCriterion("ORDER_FLAG is null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andOrderFlagIsNotNull() {
        addCriterion("ORDER_FLAG is not null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andOrderFlagEqualTo(java.lang.Long value) {
        addCriterion("ORDER_FLAG =", value, "orderFlag");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andOrderFlagNotEqualTo(java.lang.Long value) {
        addCriterion("ORDER_FLAG <>", value, "orderFlag");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andOrderFlagGreaterThan(java.lang.Long value) {
        addCriterion("ORDER_FLAG >", value, "orderFlag");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andOrderFlagGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ORDER_FLAG >=", value, "orderFlag");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andOrderFlagLessThan(java.lang.Long value) {
        addCriterion("ORDER_FLAG <", value, "orderFlag");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andOrderFlagLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ORDER_FLAG <=", value, "orderFlag");
        return (SysMenuCriteria) this;
    }
    
    public SysMenuCriteria andOrderFlagIn(List<java.lang.Long> values) {
        addCriterion("ORDER_FLAG in", values, "orderFlag");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andOrderFlagNotIn(List<java.lang.Long> values) {
        addCriterion("ORDER_FLAG not in", values, "orderFlag");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andOrderFlagBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ORDER_FLAG between", value1, value2, "orderFlag");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andOrderFlagNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ORDER_FLAG not between", value1, value2, "orderFlag");
        return (SysMenuCriteria) this;
    }
	public SysMenuCriteria andReserve1IsNull() {
        addCriterion("RESERVE1 is null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve1IsNotNull() {
        addCriterion("RESERVE1 is not null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve1EqualTo(java.lang.String value) {
        addCriterion("RESERVE1 =", value, "reserve1");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve1NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 <>", value, "reserve1");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve1GreaterThan(java.lang.String value) {
        addCriterion("RESERVE1 >", value, "reserve1");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve1GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 >=", value, "reserve1");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve1LessThan(java.lang.String value) {
        addCriterion("RESERVE1 <", value, "reserve1");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve1LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 <=", value, "reserve1");
        return (SysMenuCriteria) this;
    }
    
    public SysMenuCriteria andReserve1Like(java.lang.String value) {
        addCriterion("RESERVE1 like", value, "reserve1");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve1NotLike(java.lang.String value) {
        addCriterion("RESERVE1 not like", value, "reserve1");
        return (SysMenuCriteria) this;
    }
    
    public SysMenuCriteria andReserve1In(List<java.lang.String> values) {
        addCriterion("RESERVE1 in", values, "reserve1");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve1NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE1 not in", values, "reserve1");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve1Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE1 between", value1, value2, "reserve1");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve1NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE1 not between", value1, value2, "reserve1");
        return (SysMenuCriteria) this;
    }
	public SysMenuCriteria andReserve2IsNull() {
        addCriterion("RESERVE2 is null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve2IsNotNull() {
        addCriterion("RESERVE2 is not null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve2EqualTo(java.lang.String value) {
        addCriterion("RESERVE2 =", value, "reserve2");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve2NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 <>", value, "reserve2");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve2GreaterThan(java.lang.String value) {
        addCriterion("RESERVE2 >", value, "reserve2");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve2GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 >=", value, "reserve2");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve2LessThan(java.lang.String value) {
        addCriterion("RESERVE2 <", value, "reserve2");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve2LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 <=", value, "reserve2");
        return (SysMenuCriteria) this;
    }
    
    public SysMenuCriteria andReserve2Like(java.lang.String value) {
        addCriterion("RESERVE2 like", value, "reserve2");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve2NotLike(java.lang.String value) {
        addCriterion("RESERVE2 not like", value, "reserve2");
        return (SysMenuCriteria) this;
    }
    
    public SysMenuCriteria andReserve2In(List<java.lang.String> values) {
        addCriterion("RESERVE2 in", values, "reserve2");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve2NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE2 not in", values, "reserve2");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve2Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE2 between", value1, value2, "reserve2");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve2NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE2 not between", value1, value2, "reserve2");
        return (SysMenuCriteria) this;
    }
	public SysMenuCriteria andReserve3IsNull() {
        addCriterion("RESERVE3 is null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve3IsNotNull() {
        addCriterion("RESERVE3 is not null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve3EqualTo(java.lang.String value) {
        addCriterion("RESERVE3 =", value, "reserve3");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve3NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 <>", value, "reserve3");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve3GreaterThan(java.lang.String value) {
        addCriterion("RESERVE3 >", value, "reserve3");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve3GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 >=", value, "reserve3");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve3LessThan(java.lang.String value) {
        addCriterion("RESERVE3 <", value, "reserve3");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve3LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 <=", value, "reserve3");
        return (SysMenuCriteria) this;
    }
    
    public SysMenuCriteria andReserve3Like(java.lang.String value) {
        addCriterion("RESERVE3 like", value, "reserve3");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve3NotLike(java.lang.String value) {
        addCriterion("RESERVE3 not like", value, "reserve3");
        return (SysMenuCriteria) this;
    }
    
    public SysMenuCriteria andReserve3In(List<java.lang.String> values) {
        addCriterion("RESERVE3 in", values, "reserve3");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve3NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE3 not in", values, "reserve3");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve3Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE3 between", value1, value2, "reserve3");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve3NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE3 not between", value1, value2, "reserve3");
        return (SysMenuCriteria) this;
    }
	public SysMenuCriteria andReserve4IsNull() {
        addCriterion("RESERVE4 is null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve4IsNotNull() {
        addCriterion("RESERVE4 is not null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve4EqualTo(java.lang.String value) {
        addCriterion("RESERVE4 =", value, "reserve4");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve4NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 <>", value, "reserve4");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve4GreaterThan(java.lang.String value) {
        addCriterion("RESERVE4 >", value, "reserve4");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve4GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 >=", value, "reserve4");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve4LessThan(java.lang.String value) {
        addCriterion("RESERVE4 <", value, "reserve4");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve4LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 <=", value, "reserve4");
        return (SysMenuCriteria) this;
    }
    
    public SysMenuCriteria andReserve4Like(java.lang.String value) {
        addCriterion("RESERVE4 like", value, "reserve4");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve4NotLike(java.lang.String value) {
        addCriterion("RESERVE4 not like", value, "reserve4");
        return (SysMenuCriteria) this;
    }
    
    public SysMenuCriteria andReserve4In(List<java.lang.String> values) {
        addCriterion("RESERVE4 in", values, "reserve4");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve4NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE4 not in", values, "reserve4");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve4Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE4 between", value1, value2, "reserve4");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve4NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE4 not between", value1, value2, "reserve4");
        return (SysMenuCriteria) this;
    }
	public SysMenuCriteria andReserve5IsNull() {
        addCriterion("RESERVE5 is null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve5IsNotNull() {
        addCriterion("RESERVE5 is not null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve5EqualTo(java.lang.String value) {
        addCriterion("RESERVE5 =", value, "reserve5");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve5NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 <>", value, "reserve5");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve5GreaterThan(java.lang.String value) {
        addCriterion("RESERVE5 >", value, "reserve5");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve5GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 >=", value, "reserve5");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve5LessThan(java.lang.String value) {
        addCriterion("RESERVE5 <", value, "reserve5");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve5LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 <=", value, "reserve5");
        return (SysMenuCriteria) this;
    }
    
    public SysMenuCriteria andReserve5Like(java.lang.String value) {
        addCriterion("RESERVE5 like", value, "reserve5");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve5NotLike(java.lang.String value) {
        addCriterion("RESERVE5 not like", value, "reserve5");
        return (SysMenuCriteria) this;
    }
    
    public SysMenuCriteria andReserve5In(List<java.lang.String> values) {
        addCriterion("RESERVE5 in", values, "reserve5");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve5NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE5 not in", values, "reserve5");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve5Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE5 between", value1, value2, "reserve5");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andReserve5NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE5 not between", value1, value2, "reserve5");
        return (SysMenuCriteria) this;
    }
	public SysMenuCriteria andMemoIsNull() {
        addCriterion("MEMO is null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMemoIsNotNull() {
        addCriterion("MEMO is not null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMemoEqualTo(java.lang.String value) {
        addCriterion("MEMO =", value, "memo");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMemoNotEqualTo(java.lang.String value) {
        addCriterion("MEMO <>", value, "memo");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMemoGreaterThan(java.lang.String value) {
        addCriterion("MEMO >", value, "memo");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMemoGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("MEMO >=", value, "memo");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMemoLessThan(java.lang.String value) {
        addCriterion("MEMO <", value, "memo");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMemoLessThanOrEqualTo(java.lang.String value) {
        addCriterion("MEMO <=", value, "memo");
        return (SysMenuCriteria) this;
    }
    
    public SysMenuCriteria andMemoLike(java.lang.String value) {
        addCriterion("MEMO like", value, "memo");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMemoNotLike(java.lang.String value) {
        addCriterion("MEMO not like", value, "memo");
        return (SysMenuCriteria) this;
    }
    
    public SysMenuCriteria andMemoIn(List<java.lang.String> values) {
        addCriterion("MEMO in", values, "memo");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMemoNotIn(List<java.lang.String> values) {
        addCriterion("MEMO not in", values, "memo");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMemoBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MEMO between", value1, value2, "memo");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andMemoNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MEMO not between", value1, value2, "memo");
        return (SysMenuCriteria) this;
    }
	public SysMenuCriteria andAddTimeIsNull() {
        addCriterion("ADD_TIME is null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andAddTimeIsNotNull() {
        addCriterion("ADD_TIME is not null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andAddTimeEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME =", value, "addTime");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andAddTimeNotEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME <>", value, "addTime");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andAddTimeGreaterThan(java.util.Date value) {
        addCriterion("ADD_TIME >", value, "addTime");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andAddTimeGreaterThanOrEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME >=", value, "addTime");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andAddTimeLessThan(java.util.Date value) {
        addCriterion("ADD_TIME <", value, "addTime");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andAddTimeLessThanOrEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME <=", value, "addTime");
        return (SysMenuCriteria) this;
    }
    
    public SysMenuCriteria andAddTimeIn(List<java.util.Date> values) {
        addCriterion("ADD_TIME in", values, "addTime");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andAddTimeNotIn(List<java.util.Date> values) {
        addCriterion("ADD_TIME not in", values, "addTime");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andAddTimeBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("ADD_TIME between", value1, value2, "addTime");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andAddTimeNotBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("ADD_TIME not between", value1, value2, "addTime");
        return (SysMenuCriteria) this;
    }
	public SysMenuCriteria andAddUserIdIsNull() {
        addCriterion("ADD_USER_ID is null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andAddUserIdIsNotNull() {
        addCriterion("ADD_USER_ID is not null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andAddUserIdEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID =", value, "addUserId");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andAddUserIdNotEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID <>", value, "addUserId");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andAddUserIdGreaterThan(java.lang.Long value) {
        addCriterion("ADD_USER_ID >", value, "addUserId");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andAddUserIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID >=", value, "addUserId");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andAddUserIdLessThan(java.lang.Long value) {
        addCriterion("ADD_USER_ID <", value, "addUserId");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andAddUserIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID <=", value, "addUserId");
        return (SysMenuCriteria) this;
    }
    
    public SysMenuCriteria andAddUserIdIn(List<java.lang.Long> values) {
        addCriterion("ADD_USER_ID in", values, "addUserId");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andAddUserIdNotIn(List<java.lang.Long> values) {
        addCriterion("ADD_USER_ID not in", values, "addUserId");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andAddUserIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ADD_USER_ID between", value1, value2, "addUserId");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andAddUserIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ADD_USER_ID not between", value1, value2, "addUserId");
        return (SysMenuCriteria) this;
    }
	public SysMenuCriteria andAddUserNameIsNull() {
        addCriterion("ADD_USER_NAME is null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andAddUserNameIsNotNull() {
        addCriterion("ADD_USER_NAME is not null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andAddUserNameEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME =", value, "addUserName");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andAddUserNameNotEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME <>", value, "addUserName");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andAddUserNameGreaterThan(java.lang.String value) {
        addCriterion("ADD_USER_NAME >", value, "addUserName");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andAddUserNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME >=", value, "addUserName");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andAddUserNameLessThan(java.lang.String value) {
        addCriterion("ADD_USER_NAME <", value, "addUserName");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andAddUserNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME <=", value, "addUserName");
        return (SysMenuCriteria) this;
    }
    
    public SysMenuCriteria andAddUserNameLike(java.lang.String value) {
        addCriterion("ADD_USER_NAME like", value, "addUserName");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andAddUserNameNotLike(java.lang.String value) {
        addCriterion("ADD_USER_NAME not like", value, "addUserName");
        return (SysMenuCriteria) this;
    }
    
    public SysMenuCriteria andAddUserNameIn(List<java.lang.String> values) {
        addCriterion("ADD_USER_NAME in", values, "addUserName");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andAddUserNameNotIn(List<java.lang.String> values) {
        addCriterion("ADD_USER_NAME not in", values, "addUserName");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andAddUserNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ADD_USER_NAME between", value1, value2, "addUserName");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andAddUserNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ADD_USER_NAME not between", value1, value2, "addUserName");
        return (SysMenuCriteria) this;
    }
	public SysMenuCriteria andModifyTimeIsNull() {
        addCriterion("MODIFY_TIME is null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andModifyTimeIsNotNull() {
        addCriterion("MODIFY_TIME is not null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andModifyTimeEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME =", value, "modifyTime");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andModifyTimeNotEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME <>", value, "modifyTime");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andModifyTimeGreaterThan(java.util.Date value) {
        addCriterion("MODIFY_TIME >", value, "modifyTime");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andModifyTimeGreaterThanOrEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME >=", value, "modifyTime");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andModifyTimeLessThan(java.util.Date value) {
        addCriterion("MODIFY_TIME <", value, "modifyTime");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andModifyTimeLessThanOrEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME <=", value, "modifyTime");
        return (SysMenuCriteria) this;
    }
    
    public SysMenuCriteria andModifyTimeIn(List<java.util.Date> values) {
        addCriterion("MODIFY_TIME in", values, "modifyTime");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andModifyTimeNotIn(List<java.util.Date> values) {
        addCriterion("MODIFY_TIME not in", values, "modifyTime");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andModifyTimeBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("MODIFY_TIME between", value1, value2, "modifyTime");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andModifyTimeNotBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("MODIFY_TIME not between", value1, value2, "modifyTime");
        return (SysMenuCriteria) this;
    }
	public SysMenuCriteria andModifyUserIdIsNull() {
        addCriterion("MODIFY_USER_ID is null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andModifyUserIdIsNotNull() {
        addCriterion("MODIFY_USER_ID is not null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andModifyUserIdEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID =", value, "modifyUserId");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andModifyUserIdNotEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID <>", value, "modifyUserId");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andModifyUserIdGreaterThan(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID >", value, "modifyUserId");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andModifyUserIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID >=", value, "modifyUserId");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andModifyUserIdLessThan(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID <", value, "modifyUserId");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andModifyUserIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID <=", value, "modifyUserId");
        return (SysMenuCriteria) this;
    }
    
    public SysMenuCriteria andModifyUserIdIn(List<java.lang.Long> values) {
        addCriterion("MODIFY_USER_ID in", values, "modifyUserId");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andModifyUserIdNotIn(List<java.lang.Long> values) {
        addCriterion("MODIFY_USER_ID not in", values, "modifyUserId");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andModifyUserIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("MODIFY_USER_ID between", value1, value2, "modifyUserId");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andModifyUserIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("MODIFY_USER_ID not between", value1, value2, "modifyUserId");
        return (SysMenuCriteria) this;
    }
	public SysMenuCriteria andModifyUserNameIsNull() {
        addCriterion("MODIFY_USER_NAME is null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andModifyUserNameIsNotNull() {
        addCriterion("MODIFY_USER_NAME is not null");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andModifyUserNameEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME =", value, "modifyUserName");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andModifyUserNameNotEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME <>", value, "modifyUserName");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andModifyUserNameGreaterThan(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME >", value, "modifyUserName");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andModifyUserNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME >=", value, "modifyUserName");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andModifyUserNameLessThan(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME <", value, "modifyUserName");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andModifyUserNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME <=", value, "modifyUserName");
        return (SysMenuCriteria) this;
    }
    
    public SysMenuCriteria andModifyUserNameLike(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME like", value, "modifyUserName");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andModifyUserNameNotLike(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME not like", value, "modifyUserName");
        return (SysMenuCriteria) this;
    }
    
    public SysMenuCriteria andModifyUserNameIn(List<java.lang.String> values) {
        addCriterion("MODIFY_USER_NAME in", values, "modifyUserName");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andModifyUserNameNotIn(List<java.lang.String> values) {
        addCriterion("MODIFY_USER_NAME not in", values, "modifyUserName");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andModifyUserNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MODIFY_USER_NAME between", value1, value2, "modifyUserName");
        return (SysMenuCriteria) this;
    }

    public SysMenuCriteria andModifyUserNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MODIFY_USER_NAME not between", value1, value2, "modifyUserName");
        return (SysMenuCriteria) this;
    }
}

