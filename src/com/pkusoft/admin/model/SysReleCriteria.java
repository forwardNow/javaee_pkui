package com.pkusoft.admin.model;

import java.util.List;

import com.pkusoft.framework.model.Criteria.BaseCriteria;

/**
 * 数据归属单位信息查询标准
 * @author 
 */
public class SysReleCriteria extends BaseCriteria {
	public SysReleCriteria andDeptIdIsNull() {
        addCriterion("DEPT_ID is null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptIdIsNotNull() {
        addCriterion("DEPT_ID is not null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptIdEqualTo(java.lang.String value) {
        addCriterion("DEPT_ID =", value, "deptId");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptIdNotEqualTo(java.lang.String value) {
        addCriterion("DEPT_ID <>", value, "deptId");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptIdGreaterThan(java.lang.String value) {
        addCriterion("DEPT_ID >", value, "deptId");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptIdGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("DEPT_ID >=", value, "deptId");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptIdLessThan(java.lang.String value) {
        addCriterion("DEPT_ID <", value, "deptId");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptIdLessThanOrEqualTo(java.lang.String value) {
        addCriterion("DEPT_ID <=", value, "deptId");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andDeptIdLike(java.lang.String value) {
        addCriterion("DEPT_ID like", value, "deptId");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptIdNotLike(java.lang.String value) {
        addCriterion("DEPT_ID not like", value, "deptId");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andDeptIdIn(List<java.lang.String> values) {
        addCriterion("DEPT_ID in", values, "deptId");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptIdNotIn(List<java.lang.String> values) {
        addCriterion("DEPT_ID not in", values, "deptId");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptIdBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DEPT_ID between", value1, value2, "deptId");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptIdNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DEPT_ID not between", value1, value2, "deptId");
        return (SysReleCriteria) this;
    }
	public SysReleCriteria andDeptNameIsNull() {
        addCriterion("DEPT_NAME is null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptNameIsNotNull() {
        addCriterion("DEPT_NAME is not null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptNameEqualTo(java.lang.String value) {
        addCriterion("DEPT_NAME =", value, "deptName");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptNameNotEqualTo(java.lang.String value) {
        addCriterion("DEPT_NAME <>", value, "deptName");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptNameGreaterThan(java.lang.String value) {
        addCriterion("DEPT_NAME >", value, "deptName");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("DEPT_NAME >=", value, "deptName");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptNameLessThan(java.lang.String value) {
        addCriterion("DEPT_NAME <", value, "deptName");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("DEPT_NAME <=", value, "deptName");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andDeptNameLike(java.lang.String value) {
        addCriterion("DEPT_NAME like", value, "deptName");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptNameNotLike(java.lang.String value) {
        addCriterion("DEPT_NAME not like", value, "deptName");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andDeptNameIn(List<java.lang.String> values) {
        addCriterion("DEPT_NAME in", values, "deptName");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptNameNotIn(List<java.lang.String> values) {
        addCriterion("DEPT_NAME not in", values, "deptName");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DEPT_NAME between", value1, value2, "deptName");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DEPT_NAME not between", value1, value2, "deptName");
        return (SysReleCriteria) this;
    }
	public SysReleCriteria andDeptLevelIsNull() {
        addCriterion("DEPT_LEVEL is null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptLevelIsNotNull() {
        addCriterion("DEPT_LEVEL is not null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptLevelEqualTo(java.lang.String value) {
        addCriterion("DEPT_LEVEL =", value, "deptLevel");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptLevelNotEqualTo(java.lang.String value) {
        addCriterion("DEPT_LEVEL <>", value, "deptLevel");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptLevelGreaterThan(java.lang.String value) {
        addCriterion("DEPT_LEVEL >", value, "deptLevel");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptLevelGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("DEPT_LEVEL >=", value, "deptLevel");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptLevelLessThan(java.lang.String value) {
        addCriterion("DEPT_LEVEL <", value, "deptLevel");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptLevelLessThanOrEqualTo(java.lang.String value) {
        addCriterion("DEPT_LEVEL <=", value, "deptLevel");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andDeptLevelLike(java.lang.String value) {
        addCriterion("DEPT_LEVEL like", value, "deptLevel");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptLevelNotLike(java.lang.String value) {
        addCriterion("DEPT_LEVEL not like", value, "deptLevel");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andDeptLevelIn(List<java.lang.String> values) {
        addCriterion("DEPT_LEVEL in", values, "deptLevel");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptLevelNotIn(List<java.lang.String> values) {
        addCriterion("DEPT_LEVEL not in", values, "deptLevel");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptLevelBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DEPT_LEVEL between", value1, value2, "deptLevel");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptLevelNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DEPT_LEVEL not between", value1, value2, "deptLevel");
        return (SysReleCriteria) this;
    }
	public SysReleCriteria andTreeLevelIsNull() {
        addCriterion("TREE_LEVEL is null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andTreeLevelIsNotNull() {
        addCriterion("TREE_LEVEL is not null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andTreeLevelEqualTo(java.lang.Long value) {
        addCriterion("TREE_LEVEL =", value, "treeLevel");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andTreeLevelNotEqualTo(java.lang.Long value) {
        addCriterion("TREE_LEVEL <>", value, "treeLevel");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andTreeLevelGreaterThan(java.lang.Long value) {
        addCriterion("TREE_LEVEL >", value, "treeLevel");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andTreeLevelGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("TREE_LEVEL >=", value, "treeLevel");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andTreeLevelLessThan(java.lang.Long value) {
        addCriterion("TREE_LEVEL <", value, "treeLevel");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andTreeLevelLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("TREE_LEVEL <=", value, "treeLevel");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andTreeLevelIn(List<java.lang.Long> values) {
        addCriterion("TREE_LEVEL in", values, "treeLevel");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andTreeLevelNotIn(List<java.lang.Long> values) {
        addCriterion("TREE_LEVEL not in", values, "treeLevel");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andTreeLevelBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("TREE_LEVEL between", value1, value2, "treeLevel");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andTreeLevelNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("TREE_LEVEL not between", value1, value2, "treeLevel");
        return (SysReleCriteria) this;
    }
	public SysReleCriteria andParentDeptIdIsNull() {
        addCriterion("PARENT_DEPT_ID is null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andParentDeptIdIsNotNull() {
        addCriterion("PARENT_DEPT_ID is not null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andParentDeptIdEqualTo(java.lang.String value) {
        addCriterion("PARENT_DEPT_ID =", value, "parentDeptId");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andParentDeptIdNotEqualTo(java.lang.String value) {
        addCriterion("PARENT_DEPT_ID <>", value, "parentDeptId");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andParentDeptIdGreaterThan(java.lang.String value) {
        addCriterion("PARENT_DEPT_ID >", value, "parentDeptId");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andParentDeptIdGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("PARENT_DEPT_ID >=", value, "parentDeptId");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andParentDeptIdLessThan(java.lang.String value) {
        addCriterion("PARENT_DEPT_ID <", value, "parentDeptId");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andParentDeptIdLessThanOrEqualTo(java.lang.String value) {
        addCriterion("PARENT_DEPT_ID <=", value, "parentDeptId");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andParentDeptIdLike(java.lang.String value) {
        addCriterion("PARENT_DEPT_ID like", value, "parentDeptId");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andParentDeptIdNotLike(java.lang.String value) {
        addCriterion("PARENT_DEPT_ID not like", value, "parentDeptId");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andParentDeptIdIn(List<java.lang.String> values) {
        addCriterion("PARENT_DEPT_ID in", values, "parentDeptId");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andParentDeptIdNotIn(List<java.lang.String> values) {
        addCriterion("PARENT_DEPT_ID not in", values, "parentDeptId");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andParentDeptIdBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("PARENT_DEPT_ID between", value1, value2, "parentDeptId");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andParentDeptIdNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("PARENT_DEPT_ID not between", value1, value2, "parentDeptId");
        return (SysReleCriteria) this;
    }
	public SysReleCriteria andOrderFlagIsNull() {
        addCriterion("ORDER_FLAG is null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andOrderFlagIsNotNull() {
        addCriterion("ORDER_FLAG is not null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andOrderFlagEqualTo(java.lang.Long value) {
        addCriterion("ORDER_FLAG =", value, "orderFlag");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andOrderFlagNotEqualTo(java.lang.Long value) {
        addCriterion("ORDER_FLAG <>", value, "orderFlag");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andOrderFlagGreaterThan(java.lang.Long value) {
        addCriterion("ORDER_FLAG >", value, "orderFlag");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andOrderFlagGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ORDER_FLAG >=", value, "orderFlag");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andOrderFlagLessThan(java.lang.Long value) {
        addCriterion("ORDER_FLAG <", value, "orderFlag");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andOrderFlagLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ORDER_FLAG <=", value, "orderFlag");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andOrderFlagIn(List<java.lang.Long> values) {
        addCriterion("ORDER_FLAG in", values, "orderFlag");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andOrderFlagNotIn(List<java.lang.Long> values) {
        addCriterion("ORDER_FLAG not in", values, "orderFlag");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andOrderFlagBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ORDER_FLAG between", value1, value2, "orderFlag");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andOrderFlagNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ORDER_FLAG not between", value1, value2, "orderFlag");
        return (SysReleCriteria) this;
    }
	public SysReleCriteria andTelIsNull() {
        addCriterion("TEL is null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andTelIsNotNull() {
        addCriterion("TEL is not null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andTelEqualTo(java.lang.String value) {
        addCriterion("TEL =", value, "tel");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andTelNotEqualTo(java.lang.String value) {
        addCriterion("TEL <>", value, "tel");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andTelGreaterThan(java.lang.String value) {
        addCriterion("TEL >", value, "tel");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andTelGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("TEL >=", value, "tel");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andTelLessThan(java.lang.String value) {
        addCriterion("TEL <", value, "tel");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andTelLessThanOrEqualTo(java.lang.String value) {
        addCriterion("TEL <=", value, "tel");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andTelLike(java.lang.String value) {
        addCriterion("TEL like", value, "tel");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andTelNotLike(java.lang.String value) {
        addCriterion("TEL not like", value, "tel");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andTelIn(List<java.lang.String> values) {
        addCriterion("TEL in", values, "tel");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andTelNotIn(List<java.lang.String> values) {
        addCriterion("TEL not in", values, "tel");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andTelBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("TEL between", value1, value2, "tel");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andTelNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("TEL not between", value1, value2, "tel");
        return (SysReleCriteria) this;
    }
	public SysReleCriteria andFaxIsNull() {
        addCriterion("FAX is null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andFaxIsNotNull() {
        addCriterion("FAX is not null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andFaxEqualTo(java.lang.String value) {
        addCriterion("FAX =", value, "fax");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andFaxNotEqualTo(java.lang.String value) {
        addCriterion("FAX <>", value, "fax");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andFaxGreaterThan(java.lang.String value) {
        addCriterion("FAX >", value, "fax");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andFaxGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("FAX >=", value, "fax");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andFaxLessThan(java.lang.String value) {
        addCriterion("FAX <", value, "fax");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andFaxLessThanOrEqualTo(java.lang.String value) {
        addCriterion("FAX <=", value, "fax");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andFaxLike(java.lang.String value) {
        addCriterion("FAX like", value, "fax");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andFaxNotLike(java.lang.String value) {
        addCriterion("FAX not like", value, "fax");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andFaxIn(List<java.lang.String> values) {
        addCriterion("FAX in", values, "fax");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andFaxNotIn(List<java.lang.String> values) {
        addCriterion("FAX not in", values, "fax");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andFaxBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("FAX between", value1, value2, "fax");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andFaxNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("FAX not between", value1, value2, "fax");
        return (SysReleCriteria) this;
    }
	public SysReleCriteria andIsMainDeptIsNull() {
        addCriterion("IS_MAIN_DEPT is null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andIsMainDeptIsNotNull() {
        addCriterion("IS_MAIN_DEPT is not null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andIsMainDeptEqualTo(java.lang.String value) {
        addCriterion("IS_MAIN_DEPT =", value, "isMainDept");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andIsMainDeptNotEqualTo(java.lang.String value) {
        addCriterion("IS_MAIN_DEPT <>", value, "isMainDept");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andIsMainDeptGreaterThan(java.lang.String value) {
        addCriterion("IS_MAIN_DEPT >", value, "isMainDept");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andIsMainDeptGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("IS_MAIN_DEPT >=", value, "isMainDept");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andIsMainDeptLessThan(java.lang.String value) {
        addCriterion("IS_MAIN_DEPT <", value, "isMainDept");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andIsMainDeptLessThanOrEqualTo(java.lang.String value) {
        addCriterion("IS_MAIN_DEPT <=", value, "isMainDept");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andIsMainDeptLike(java.lang.String value) {
        addCriterion("IS_MAIN_DEPT like", value, "isMainDept");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andIsMainDeptNotLike(java.lang.String value) {
        addCriterion("IS_MAIN_DEPT not like", value, "isMainDept");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andIsMainDeptIn(List<java.lang.String> values) {
        addCriterion("IS_MAIN_DEPT in", values, "isMainDept");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andIsMainDeptNotIn(List<java.lang.String> values) {
        addCriterion("IS_MAIN_DEPT not in", values, "isMainDept");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andIsMainDeptBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("IS_MAIN_DEPT between", value1, value2, "isMainDept");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andIsMainDeptNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("IS_MAIN_DEPT not between", value1, value2, "isMainDept");
        return (SysReleCriteria) this;
    }
	public SysReleCriteria andManagerIsNull() {
        addCriterion("MANAGER is null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andManagerIsNotNull() {
        addCriterion("MANAGER is not null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andManagerEqualTo(java.lang.String value) {
        addCriterion("MANAGER =", value, "manager");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andManagerNotEqualTo(java.lang.String value) {
        addCriterion("MANAGER <>", value, "manager");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andManagerGreaterThan(java.lang.String value) {
        addCriterion("MANAGER >", value, "manager");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andManagerGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("MANAGER >=", value, "manager");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andManagerLessThan(java.lang.String value) {
        addCriterion("MANAGER <", value, "manager");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andManagerLessThanOrEqualTo(java.lang.String value) {
        addCriterion("MANAGER <=", value, "manager");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andManagerLike(java.lang.String value) {
        addCriterion("MANAGER like", value, "manager");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andManagerNotLike(java.lang.String value) {
        addCriterion("MANAGER not like", value, "manager");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andManagerIn(List<java.lang.String> values) {
        addCriterion("MANAGER in", values, "manager");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andManagerNotIn(List<java.lang.String> values) {
        addCriterion("MANAGER not in", values, "manager");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andManagerBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MANAGER between", value1, value2, "manager");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andManagerNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MANAGER not between", value1, value2, "manager");
        return (SysReleCriteria) this;
    }
	public SysReleCriteria andDeptTypeIsNull() {
        addCriterion("DEPT_TYPE is null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptTypeIsNotNull() {
        addCriterion("DEPT_TYPE is not null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptTypeEqualTo(java.lang.String value) {
        addCriterion("DEPT_TYPE =", value, "deptType");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptTypeNotEqualTo(java.lang.String value) {
        addCriterion("DEPT_TYPE <>", value, "deptType");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptTypeGreaterThan(java.lang.String value) {
        addCriterion("DEPT_TYPE >", value, "deptType");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptTypeGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("DEPT_TYPE >=", value, "deptType");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptTypeLessThan(java.lang.String value) {
        addCriterion("DEPT_TYPE <", value, "deptType");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptTypeLessThanOrEqualTo(java.lang.String value) {
        addCriterion("DEPT_TYPE <=", value, "deptType");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andDeptTypeLike(java.lang.String value) {
        addCriterion("DEPT_TYPE like", value, "deptType");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptTypeNotLike(java.lang.String value) {
        addCriterion("DEPT_TYPE not like", value, "deptType");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andDeptTypeIn(List<java.lang.String> values) {
        addCriterion("DEPT_TYPE in", values, "deptType");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptTypeNotIn(List<java.lang.String> values) {
        addCriterion("DEPT_TYPE not in", values, "deptType");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptTypeBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DEPT_TYPE between", value1, value2, "deptType");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andDeptTypeNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DEPT_TYPE not between", value1, value2, "deptType");
        return (SysReleCriteria) this;
    }
	public SysReleCriteria andReserve1IsNull() {
        addCriterion("RESERVE1 is null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve1IsNotNull() {
        addCriterion("RESERVE1 is not null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve1EqualTo(java.lang.String value) {
        addCriterion("RESERVE1 =", value, "reserve1");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve1NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 <>", value, "reserve1");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve1GreaterThan(java.lang.String value) {
        addCriterion("RESERVE1 >", value, "reserve1");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve1GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 >=", value, "reserve1");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve1LessThan(java.lang.String value) {
        addCriterion("RESERVE1 <", value, "reserve1");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve1LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 <=", value, "reserve1");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andReserve1Like(java.lang.String value) {
        addCriterion("RESERVE1 like", value, "reserve1");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve1NotLike(java.lang.String value) {
        addCriterion("RESERVE1 not like", value, "reserve1");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andReserve1In(List<java.lang.String> values) {
        addCriterion("RESERVE1 in", values, "reserve1");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve1NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE1 not in", values, "reserve1");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve1Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE1 between", value1, value2, "reserve1");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve1NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE1 not between", value1, value2, "reserve1");
        return (SysReleCriteria) this;
    }
	public SysReleCriteria andReserve2IsNull() {
        addCriterion("RESERVE2 is null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve2IsNotNull() {
        addCriterion("RESERVE2 is not null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve2EqualTo(java.lang.String value) {
        addCriterion("RESERVE2 =", value, "reserve2");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve2NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 <>", value, "reserve2");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve2GreaterThan(java.lang.String value) {
        addCriterion("RESERVE2 >", value, "reserve2");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve2GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 >=", value, "reserve2");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve2LessThan(java.lang.String value) {
        addCriterion("RESERVE2 <", value, "reserve2");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve2LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 <=", value, "reserve2");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andReserve2Like(java.lang.String value) {
        addCriterion("RESERVE2 like", value, "reserve2");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve2NotLike(java.lang.String value) {
        addCriterion("RESERVE2 not like", value, "reserve2");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andReserve2In(List<java.lang.String> values) {
        addCriterion("RESERVE2 in", values, "reserve2");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve2NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE2 not in", values, "reserve2");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve2Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE2 between", value1, value2, "reserve2");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve2NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE2 not between", value1, value2, "reserve2");
        return (SysReleCriteria) this;
    }
	public SysReleCriteria andReserve3IsNull() {
        addCriterion("RESERVE3 is null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve3IsNotNull() {
        addCriterion("RESERVE3 is not null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve3EqualTo(java.lang.String value) {
        addCriterion("RESERVE3 =", value, "reserve3");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve3NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 <>", value, "reserve3");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve3GreaterThan(java.lang.String value) {
        addCriterion("RESERVE3 >", value, "reserve3");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve3GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 >=", value, "reserve3");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve3LessThan(java.lang.String value) {
        addCriterion("RESERVE3 <", value, "reserve3");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve3LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 <=", value, "reserve3");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andReserve3Like(java.lang.String value) {
        addCriterion("RESERVE3 like", value, "reserve3");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve3NotLike(java.lang.String value) {
        addCriterion("RESERVE3 not like", value, "reserve3");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andReserve3In(List<java.lang.String> values) {
        addCriterion("RESERVE3 in", values, "reserve3");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve3NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE3 not in", values, "reserve3");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve3Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE3 between", value1, value2, "reserve3");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve3NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE3 not between", value1, value2, "reserve3");
        return (SysReleCriteria) this;
    }
	public SysReleCriteria andReserve4IsNull() {
        addCriterion("RESERVE4 is null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve4IsNotNull() {
        addCriterion("RESERVE4 is not null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve4EqualTo(java.lang.String value) {
        addCriterion("RESERVE4 =", value, "reserve4");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve4NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 <>", value, "reserve4");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve4GreaterThan(java.lang.String value) {
        addCriterion("RESERVE4 >", value, "reserve4");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve4GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 >=", value, "reserve4");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve4LessThan(java.lang.String value) {
        addCriterion("RESERVE4 <", value, "reserve4");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve4LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 <=", value, "reserve4");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andReserve4Like(java.lang.String value) {
        addCriterion("RESERVE4 like", value, "reserve4");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve4NotLike(java.lang.String value) {
        addCriterion("RESERVE4 not like", value, "reserve4");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andReserve4In(List<java.lang.String> values) {
        addCriterion("RESERVE4 in", values, "reserve4");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve4NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE4 not in", values, "reserve4");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve4Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE4 between", value1, value2, "reserve4");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve4NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE4 not between", value1, value2, "reserve4");
        return (SysReleCriteria) this;
    }
	public SysReleCriteria andReserve5IsNull() {
        addCriterion("RESERVE5 is null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve5IsNotNull() {
        addCriterion("RESERVE5 is not null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve5EqualTo(java.lang.String value) {
        addCriterion("RESERVE5 =", value, "reserve5");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve5NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 <>", value, "reserve5");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve5GreaterThan(java.lang.String value) {
        addCriterion("RESERVE5 >", value, "reserve5");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve5GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 >=", value, "reserve5");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve5LessThan(java.lang.String value) {
        addCriterion("RESERVE5 <", value, "reserve5");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve5LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 <=", value, "reserve5");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andReserve5Like(java.lang.String value) {
        addCriterion("RESERVE5 like", value, "reserve5");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve5NotLike(java.lang.String value) {
        addCriterion("RESERVE5 not like", value, "reserve5");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andReserve5In(List<java.lang.String> values) {
        addCriterion("RESERVE5 in", values, "reserve5");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve5NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE5 not in", values, "reserve5");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve5Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE5 between", value1, value2, "reserve5");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andReserve5NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE5 not between", value1, value2, "reserve5");
        return (SysReleCriteria) this;
    }
	public SysReleCriteria andMemoIsNull() {
        addCriterion("MEMO is null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andMemoIsNotNull() {
        addCriterion("MEMO is not null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andMemoEqualTo(java.lang.String value) {
        addCriterion("MEMO =", value, "memo");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andMemoNotEqualTo(java.lang.String value) {
        addCriterion("MEMO <>", value, "memo");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andMemoGreaterThan(java.lang.String value) {
        addCriterion("MEMO >", value, "memo");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andMemoGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("MEMO >=", value, "memo");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andMemoLessThan(java.lang.String value) {
        addCriterion("MEMO <", value, "memo");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andMemoLessThanOrEqualTo(java.lang.String value) {
        addCriterion("MEMO <=", value, "memo");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andMemoLike(java.lang.String value) {
        addCriterion("MEMO like", value, "memo");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andMemoNotLike(java.lang.String value) {
        addCriterion("MEMO not like", value, "memo");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andMemoIn(List<java.lang.String> values) {
        addCriterion("MEMO in", values, "memo");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andMemoNotIn(List<java.lang.String> values) {
        addCriterion("MEMO not in", values, "memo");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andMemoBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MEMO between", value1, value2, "memo");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andMemoNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MEMO not between", value1, value2, "memo");
        return (SysReleCriteria) this;
    }
	public SysReleCriteria andAddUserIdIsNull() {
        addCriterion("ADD_USER_ID is null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andAddUserIdIsNotNull() {
        addCriterion("ADD_USER_ID is not null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andAddUserIdEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID =", value, "addUserId");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andAddUserIdNotEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID <>", value, "addUserId");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andAddUserIdGreaterThan(java.lang.Long value) {
        addCriterion("ADD_USER_ID >", value, "addUserId");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andAddUserIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID >=", value, "addUserId");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andAddUserIdLessThan(java.lang.Long value) {
        addCriterion("ADD_USER_ID <", value, "addUserId");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andAddUserIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID <=", value, "addUserId");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andAddUserIdIn(List<java.lang.Long> values) {
        addCriterion("ADD_USER_ID in", values, "addUserId");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andAddUserIdNotIn(List<java.lang.Long> values) {
        addCriterion("ADD_USER_ID not in", values, "addUserId");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andAddUserIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ADD_USER_ID between", value1, value2, "addUserId");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andAddUserIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ADD_USER_ID not between", value1, value2, "addUserId");
        return (SysReleCriteria) this;
    }
	public SysReleCriteria andAddUserNameIsNull() {
        addCriterion("ADD_USER_NAME is null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andAddUserNameIsNotNull() {
        addCriterion("ADD_USER_NAME is not null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andAddUserNameEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME =", value, "addUserName");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andAddUserNameNotEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME <>", value, "addUserName");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andAddUserNameGreaterThan(java.lang.String value) {
        addCriterion("ADD_USER_NAME >", value, "addUserName");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andAddUserNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME >=", value, "addUserName");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andAddUserNameLessThan(java.lang.String value) {
        addCriterion("ADD_USER_NAME <", value, "addUserName");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andAddUserNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME <=", value, "addUserName");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andAddUserNameLike(java.lang.String value) {
        addCriterion("ADD_USER_NAME like", value, "addUserName");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andAddUserNameNotLike(java.lang.String value) {
        addCriterion("ADD_USER_NAME not like", value, "addUserName");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andAddUserNameIn(List<java.lang.String> values) {
        addCriterion("ADD_USER_NAME in", values, "addUserName");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andAddUserNameNotIn(List<java.lang.String> values) {
        addCriterion("ADD_USER_NAME not in", values, "addUserName");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andAddUserNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ADD_USER_NAME between", value1, value2, "addUserName");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andAddUserNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ADD_USER_NAME not between", value1, value2, "addUserName");
        return (SysReleCriteria) this;
    }
	public SysReleCriteria andAddTimeIsNull() {
        addCriterion("ADD_TIME is null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andAddTimeIsNotNull() {
        addCriterion("ADD_TIME is not null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andAddTimeEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME =", value, "addTime");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andAddTimeNotEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME <>", value, "addTime");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andAddTimeGreaterThan(java.util.Date value) {
        addCriterion("ADD_TIME >", value, "addTime");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andAddTimeGreaterThanOrEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME >=", value, "addTime");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andAddTimeLessThan(java.util.Date value) {
        addCriterion("ADD_TIME <", value, "addTime");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andAddTimeLessThanOrEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME <=", value, "addTime");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andAddTimeIn(List<java.util.Date> values) {
        addCriterion("ADD_TIME in", values, "addTime");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andAddTimeNotIn(List<java.util.Date> values) {
        addCriterion("ADD_TIME not in", values, "addTime");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andAddTimeBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("ADD_TIME between", value1, value2, "addTime");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andAddTimeNotBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("ADD_TIME not between", value1, value2, "addTime");
        return (SysReleCriteria) this;
    }
	public SysReleCriteria andModifyUserIdIsNull() {
        addCriterion("MODIFY_USER_ID is null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andModifyUserIdIsNotNull() {
        addCriterion("MODIFY_USER_ID is not null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andModifyUserIdEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID =", value, "modifyUserId");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andModifyUserIdNotEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID <>", value, "modifyUserId");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andModifyUserIdGreaterThan(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID >", value, "modifyUserId");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andModifyUserIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID >=", value, "modifyUserId");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andModifyUserIdLessThan(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID <", value, "modifyUserId");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andModifyUserIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID <=", value, "modifyUserId");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andModifyUserIdIn(List<java.lang.Long> values) {
        addCriterion("MODIFY_USER_ID in", values, "modifyUserId");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andModifyUserIdNotIn(List<java.lang.Long> values) {
        addCriterion("MODIFY_USER_ID not in", values, "modifyUserId");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andModifyUserIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("MODIFY_USER_ID between", value1, value2, "modifyUserId");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andModifyUserIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("MODIFY_USER_ID not between", value1, value2, "modifyUserId");
        return (SysReleCriteria) this;
    }
	public SysReleCriteria andModifyUserNameIsNull() {
        addCriterion("MODIFY_USER_NAME is null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andModifyUserNameIsNotNull() {
        addCriterion("MODIFY_USER_NAME is not null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andModifyUserNameEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME =", value, "modifyUserName");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andModifyUserNameNotEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME <>", value, "modifyUserName");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andModifyUserNameGreaterThan(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME >", value, "modifyUserName");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andModifyUserNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME >=", value, "modifyUserName");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andModifyUserNameLessThan(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME <", value, "modifyUserName");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andModifyUserNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME <=", value, "modifyUserName");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andModifyUserNameLike(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME like", value, "modifyUserName");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andModifyUserNameNotLike(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME not like", value, "modifyUserName");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andModifyUserNameIn(List<java.lang.String> values) {
        addCriterion("MODIFY_USER_NAME in", values, "modifyUserName");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andModifyUserNameNotIn(List<java.lang.String> values) {
        addCriterion("MODIFY_USER_NAME not in", values, "modifyUserName");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andModifyUserNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MODIFY_USER_NAME between", value1, value2, "modifyUserName");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andModifyUserNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MODIFY_USER_NAME not between", value1, value2, "modifyUserName");
        return (SysReleCriteria) this;
    }
	public SysReleCriteria andModifyTimeIsNull() {
        addCriterion("MODIFY_TIME is null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andModifyTimeIsNotNull() {
        addCriterion("MODIFY_TIME is not null");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andModifyTimeEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME =", value, "modifyTime");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andModifyTimeNotEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME <>", value, "modifyTime");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andModifyTimeGreaterThan(java.util.Date value) {
        addCriterion("MODIFY_TIME >", value, "modifyTime");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andModifyTimeGreaterThanOrEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME >=", value, "modifyTime");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andModifyTimeLessThan(java.util.Date value) {
        addCriterion("MODIFY_TIME <", value, "modifyTime");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andModifyTimeLessThanOrEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME <=", value, "modifyTime");
        return (SysReleCriteria) this;
    }
    
    public SysReleCriteria andModifyTimeIn(List<java.util.Date> values) {
        addCriterion("MODIFY_TIME in", values, "modifyTime");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andModifyTimeNotIn(List<java.util.Date> values) {
        addCriterion("MODIFY_TIME not in", values, "modifyTime");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andModifyTimeBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("MODIFY_TIME between", value1, value2, "modifyTime");
        return (SysReleCriteria) this;
    }

    public SysReleCriteria andModifyTimeNotBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("MODIFY_TIME not between", value1, value2, "modifyTime");
        return (SysReleCriteria) this;
    }
}

