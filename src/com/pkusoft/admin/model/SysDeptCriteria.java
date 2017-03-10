package com.pkusoft.admin.model;

import java.util.List;

import com.pkusoft.framework.model.Criteria.BaseCriteria;

/**
 * 
 * @author 
 */
public class SysDeptCriteria extends BaseCriteria {
	public SysDeptCriteria andDeptIdIsNull() {
        addCriterion("DEPT_ID is null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptIdIsNotNull() {
        addCriterion("DEPT_ID is not null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptIdEqualTo(java.lang.String value) {
        addCriterion("DEPT_ID =", value, "deptId");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptIdNotEqualTo(java.lang.String value) {
        addCriterion("DEPT_ID <>", value, "deptId");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptIdGreaterThan(java.lang.String value) {
        addCriterion("DEPT_ID >", value, "deptId");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptIdGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("DEPT_ID >=", value, "deptId");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptIdLessThan(java.lang.String value) {
        addCriterion("DEPT_ID <", value, "deptId");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptIdLessThanOrEqualTo(java.lang.String value) {
        addCriterion("DEPT_ID <=", value, "deptId");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andDeptIdLike(java.lang.String value) {
        addCriterion("DEPT_ID like", value, "deptId");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptIdNotLike(java.lang.String value) {
        addCriterion("DEPT_ID not like", value, "deptId");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andDeptIdIn(List<java.lang.String> values) {
        addCriterion("DEPT_ID in", values, "deptId");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptIdNotIn(List<java.lang.String> values) {
        addCriterion("DEPT_ID not in", values, "deptId");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptIdBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DEPT_ID between", value1, value2, "deptId");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptIdNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DEPT_ID not between", value1, value2, "deptId");
        return (SysDeptCriteria) this;
    }
	public SysDeptCriteria andDeptNameIsNull() {
        addCriterion("DEPT_NAME is null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptNameIsNotNull() {
        addCriterion("DEPT_NAME is not null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptNameEqualTo(java.lang.String value) {
        addCriterion("DEPT_NAME =", value, "deptName");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptNameNotEqualTo(java.lang.String value) {
        addCriterion("DEPT_NAME <>", value, "deptName");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptNameGreaterThan(java.lang.String value) {
        addCriterion("DEPT_NAME >", value, "deptName");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("DEPT_NAME >=", value, "deptName");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptNameLessThan(java.lang.String value) {
        addCriterion("DEPT_NAME <", value, "deptName");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("DEPT_NAME <=", value, "deptName");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andDeptNameLike(java.lang.String value) {
        addCriterion("DEPT_NAME like", value, "deptName");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptNameNotLike(java.lang.String value) {
        addCriterion("DEPT_NAME not like", value, "deptName");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andDeptNameIn(List<java.lang.String> values) {
        addCriterion("DEPT_NAME in", values, "deptName");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptNameNotIn(List<java.lang.String> values) {
        addCriterion("DEPT_NAME not in", values, "deptName");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DEPT_NAME between", value1, value2, "deptName");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DEPT_NAME not between", value1, value2, "deptName");
        return (SysDeptCriteria) this;
    }
	public SysDeptCriteria andDeptLevelIsNull() {
        addCriterion("DEPT_LEVEL is null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptLevelIsNotNull() {
        addCriterion("DEPT_LEVEL is not null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptLevelEqualTo(java.lang.String value) {
        addCriterion("DEPT_LEVEL =", value, "deptLevel");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptLevelNotEqualTo(java.lang.String value) {
        addCriterion("DEPT_LEVEL <>", value, "deptLevel");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptLevelGreaterThan(java.lang.String value) {
        addCriterion("DEPT_LEVEL >", value, "deptLevel");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptLevelGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("DEPT_LEVEL >=", value, "deptLevel");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptLevelLessThan(java.lang.String value) {
        addCriterion("DEPT_LEVEL <", value, "deptLevel");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptLevelLessThanOrEqualTo(java.lang.String value) {
        addCriterion("DEPT_LEVEL <=", value, "deptLevel");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andDeptLevelLike(java.lang.String value) {
        addCriterion("DEPT_LEVEL like", value, "deptLevel");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptLevelNotLike(java.lang.String value) {
        addCriterion("DEPT_LEVEL not like", value, "deptLevel");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andDeptLevelIn(List<java.lang.String> values) {
        addCriterion("DEPT_LEVEL in", values, "deptLevel");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptLevelNotIn(List<java.lang.String> values) {
        addCriterion("DEPT_LEVEL not in", values, "deptLevel");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptLevelBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DEPT_LEVEL between", value1, value2, "deptLevel");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptLevelNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DEPT_LEVEL not between", value1, value2, "deptLevel");
        return (SysDeptCriteria) this;
    }
	public SysDeptCriteria andTreeLevelIsNull() {
        addCriterion("TREE_LEVEL is null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andTreeLevelIsNotNull() {
        addCriterion("TREE_LEVEL is not null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andTreeLevelEqualTo(java.lang.Long value) {
        addCriterion("TREE_LEVEL =", value, "treeLevel");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andTreeLevelNotEqualTo(java.lang.Long value) {
        addCriterion("TREE_LEVEL <>", value, "treeLevel");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andTreeLevelGreaterThan(java.lang.Long value) {
        addCriterion("TREE_LEVEL >", value, "treeLevel");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andTreeLevelGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("TREE_LEVEL >=", value, "treeLevel");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andTreeLevelLessThan(java.lang.Long value) {
        addCriterion("TREE_LEVEL <", value, "treeLevel");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andTreeLevelLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("TREE_LEVEL <=", value, "treeLevel");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andTreeLevelIn(List<java.lang.Long> values) {
        addCriterion("TREE_LEVEL in", values, "treeLevel");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andTreeLevelNotIn(List<java.lang.Long> values) {
        addCriterion("TREE_LEVEL not in", values, "treeLevel");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andTreeLevelBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("TREE_LEVEL between", value1, value2, "treeLevel");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andTreeLevelNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("TREE_LEVEL not between", value1, value2, "treeLevel");
        return (SysDeptCriteria) this;
    }
	public SysDeptCriteria andParentDeptIdIsNull() {
        addCriterion("PARENT_DEPT_ID is null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andParentDeptIdIsNotNull() {
        addCriterion("PARENT_DEPT_ID is not null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andParentDeptIdEqualTo(java.lang.String value) {
        addCriterion("PARENT_DEPT_ID =", value, "parentDeptId");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andParentDeptIdNotEqualTo(java.lang.String value) {
        addCriterion("PARENT_DEPT_ID <>", value, "parentDeptId");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andParentDeptIdGreaterThan(java.lang.String value) {
        addCriterion("PARENT_DEPT_ID >", value, "parentDeptId");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andParentDeptIdGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("PARENT_DEPT_ID >=", value, "parentDeptId");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andParentDeptIdLessThan(java.lang.String value) {
        addCriterion("PARENT_DEPT_ID <", value, "parentDeptId");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andParentDeptIdLessThanOrEqualTo(java.lang.String value) {
        addCriterion("PARENT_DEPT_ID <=", value, "parentDeptId");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andParentDeptIdLike(java.lang.String value) {
        addCriterion("PARENT_DEPT_ID like", value, "parentDeptId");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andParentDeptIdNotLike(java.lang.String value) {
        addCriterion("PARENT_DEPT_ID not like", value, "parentDeptId");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andParentDeptIdIn(List<java.lang.String> values) {
        addCriterion("PARENT_DEPT_ID in", values, "parentDeptId");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andParentDeptIdNotIn(List<java.lang.String> values) {
        addCriterion("PARENT_DEPT_ID not in", values, "parentDeptId");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andParentDeptIdBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("PARENT_DEPT_ID between", value1, value2, "parentDeptId");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andParentDeptIdNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("PARENT_DEPT_ID not between", value1, value2, "parentDeptId");
        return (SysDeptCriteria) this;
    }
	public SysDeptCriteria andOrderFlagIsNull() {
        addCriterion("ORDER_FLAG is null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andOrderFlagIsNotNull() {
        addCriterion("ORDER_FLAG is not null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andOrderFlagEqualTo(java.lang.Long value) {
        addCriterion("ORDER_FLAG =", value, "orderFlag");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andOrderFlagNotEqualTo(java.lang.Long value) {
        addCriterion("ORDER_FLAG <>", value, "orderFlag");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andOrderFlagGreaterThan(java.lang.Long value) {
        addCriterion("ORDER_FLAG >", value, "orderFlag");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andOrderFlagGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ORDER_FLAG >=", value, "orderFlag");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andOrderFlagLessThan(java.lang.Long value) {
        addCriterion("ORDER_FLAG <", value, "orderFlag");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andOrderFlagLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ORDER_FLAG <=", value, "orderFlag");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andOrderFlagIn(List<java.lang.Long> values) {
        addCriterion("ORDER_FLAG in", values, "orderFlag");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andOrderFlagNotIn(List<java.lang.Long> values) {
        addCriterion("ORDER_FLAG not in", values, "orderFlag");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andOrderFlagBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ORDER_FLAG between", value1, value2, "orderFlag");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andOrderFlagNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ORDER_FLAG not between", value1, value2, "orderFlag");
        return (SysDeptCriteria) this;
    }
	public SysDeptCriteria andTelIsNull() {
        addCriterion("TEL is null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andTelIsNotNull() {
        addCriterion("TEL is not null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andTelEqualTo(java.lang.String value) {
        addCriterion("TEL =", value, "tel");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andTelNotEqualTo(java.lang.String value) {
        addCriterion("TEL <>", value, "tel");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andTelGreaterThan(java.lang.String value) {
        addCriterion("TEL >", value, "tel");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andTelGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("TEL >=", value, "tel");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andTelLessThan(java.lang.String value) {
        addCriterion("TEL <", value, "tel");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andTelLessThanOrEqualTo(java.lang.String value) {
        addCriterion("TEL <=", value, "tel");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andTelLike(java.lang.String value) {
        addCriterion("TEL like", value, "tel");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andTelNotLike(java.lang.String value) {
        addCriterion("TEL not like", value, "tel");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andTelIn(List<java.lang.String> values) {
        addCriterion("TEL in", values, "tel");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andTelNotIn(List<java.lang.String> values) {
        addCriterion("TEL not in", values, "tel");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andTelBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("TEL between", value1, value2, "tel");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andTelNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("TEL not between", value1, value2, "tel");
        return (SysDeptCriteria) this;
    }
	public SysDeptCriteria andFaxIsNull() {
        addCriterion("FAX is null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andFaxIsNotNull() {
        addCriterion("FAX is not null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andFaxEqualTo(java.lang.String value) {
        addCriterion("FAX =", value, "fax");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andFaxNotEqualTo(java.lang.String value) {
        addCriterion("FAX <>", value, "fax");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andFaxGreaterThan(java.lang.String value) {
        addCriterion("FAX >", value, "fax");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andFaxGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("FAX >=", value, "fax");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andFaxLessThan(java.lang.String value) {
        addCriterion("FAX <", value, "fax");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andFaxLessThanOrEqualTo(java.lang.String value) {
        addCriterion("FAX <=", value, "fax");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andFaxLike(java.lang.String value) {
        addCriterion("FAX like", value, "fax");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andFaxNotLike(java.lang.String value) {
        addCriterion("FAX not like", value, "fax");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andFaxIn(List<java.lang.String> values) {
        addCriterion("FAX in", values, "fax");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andFaxNotIn(List<java.lang.String> values) {
        addCriterion("FAX not in", values, "fax");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andFaxBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("FAX between", value1, value2, "fax");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andFaxNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("FAX not between", value1, value2, "fax");
        return (SysDeptCriteria) this;
    }
	public SysDeptCriteria andIsMainDeptIsNull() {
        addCriterion("IS_MAIN_DEPT is null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andIsMainDeptIsNotNull() {
        addCriterion("IS_MAIN_DEPT is not null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andIsMainDeptEqualTo(java.lang.String value) {
        addCriterion("IS_MAIN_DEPT =", value, "isMainDept");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andIsMainDeptNotEqualTo(java.lang.String value) {
        addCriterion("IS_MAIN_DEPT <>", value, "isMainDept");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andIsMainDeptGreaterThan(java.lang.String value) {
        addCriterion("IS_MAIN_DEPT >", value, "isMainDept");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andIsMainDeptGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("IS_MAIN_DEPT >=", value, "isMainDept");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andIsMainDeptLessThan(java.lang.String value) {
        addCriterion("IS_MAIN_DEPT <", value, "isMainDept");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andIsMainDeptLessThanOrEqualTo(java.lang.String value) {
        addCriterion("IS_MAIN_DEPT <=", value, "isMainDept");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andIsMainDeptLike(java.lang.String value) {
        addCriterion("IS_MAIN_DEPT like", value, "isMainDept");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andIsMainDeptNotLike(java.lang.String value) {
        addCriterion("IS_MAIN_DEPT not like", value, "isMainDept");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andIsMainDeptIn(List<java.lang.String> values) {
        addCriterion("IS_MAIN_DEPT in", values, "isMainDept");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andIsMainDeptNotIn(List<java.lang.String> values) {
        addCriterion("IS_MAIN_DEPT not in", values, "isMainDept");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andIsMainDeptBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("IS_MAIN_DEPT between", value1, value2, "isMainDept");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andIsMainDeptNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("IS_MAIN_DEPT not between", value1, value2, "isMainDept");
        return (SysDeptCriteria) this;
    }
	public SysDeptCriteria andCunitidIsNull() {
        addCriterion("CUNITID is null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andCunitidIsNotNull() {
        addCriterion("CUNITID is not null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andCunitidEqualTo(java.lang.String value) {
        addCriterion("CUNITID =", value, "cunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andCunitidNotEqualTo(java.lang.String value) {
        addCriterion("CUNITID <>", value, "cunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andCunitidGreaterThan(java.lang.String value) {
        addCriterion("CUNITID >", value, "cunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andCunitidGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("CUNITID >=", value, "cunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andCunitidLessThan(java.lang.String value) {
        addCriterion("CUNITID <", value, "cunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andCunitidLessThanOrEqualTo(java.lang.String value) {
        addCriterion("CUNITID <=", value, "cunitid");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andCunitidLike(java.lang.String value) {
        addCriterion("CUNITID like", value, "cunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andCunitidNotLike(java.lang.String value) {
        addCriterion("CUNITID not like", value, "cunitid");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andCunitidIn(List<java.lang.String> values) {
        addCriterion("CUNITID in", values, "cunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andCunitidNotIn(List<java.lang.String> values) {
        addCriterion("CUNITID not in", values, "cunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andCunitidBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("CUNITID between", value1, value2, "cunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andCunitidNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("CUNITID not between", value1, value2, "cunitid");
        return (SysDeptCriteria) this;
    }
	public SysDeptCriteria andSunitidIsNull() {
        addCriterion("SUNITID is null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andSunitidIsNotNull() {
        addCriterion("SUNITID is not null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andSunitidEqualTo(java.lang.String value) {
        addCriterion("SUNITID =", value, "sunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andSunitidNotEqualTo(java.lang.String value) {
        addCriterion("SUNITID <>", value, "sunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andSunitidGreaterThan(java.lang.String value) {
        addCriterion("SUNITID >", value, "sunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andSunitidGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("SUNITID >=", value, "sunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andSunitidLessThan(java.lang.String value) {
        addCriterion("SUNITID <", value, "sunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andSunitidLessThanOrEqualTo(java.lang.String value) {
        addCriterion("SUNITID <=", value, "sunitid");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andSunitidLike(java.lang.String value) {
        addCriterion("SUNITID like", value, "sunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andSunitidNotLike(java.lang.String value) {
        addCriterion("SUNITID not like", value, "sunitid");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andSunitidIn(List<java.lang.String> values) {
        addCriterion("SUNITID in", values, "sunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andSunitidNotIn(List<java.lang.String> values) {
        addCriterion("SUNITID not in", values, "sunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andSunitidBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("SUNITID between", value1, value2, "sunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andSunitidNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("SUNITID not between", value1, value2, "sunitid");
        return (SysDeptCriteria) this;
    }
	public SysDeptCriteria andTunitidIsNull() {
        addCriterion("TUNITID is null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andTunitidIsNotNull() {
        addCriterion("TUNITID is not null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andTunitidEqualTo(java.lang.String value) {
        addCriterion("TUNITID =", value, "tunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andTunitidNotEqualTo(java.lang.String value) {
        addCriterion("TUNITID <>", value, "tunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andTunitidGreaterThan(java.lang.String value) {
        addCriterion("TUNITID >", value, "tunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andTunitidGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("TUNITID >=", value, "tunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andTunitidLessThan(java.lang.String value) {
        addCriterion("TUNITID <", value, "tunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andTunitidLessThanOrEqualTo(java.lang.String value) {
        addCriterion("TUNITID <=", value, "tunitid");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andTunitidLike(java.lang.String value) {
        addCriterion("TUNITID like", value, "tunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andTunitidNotLike(java.lang.String value) {
        addCriterion("TUNITID not like", value, "tunitid");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andTunitidIn(List<java.lang.String> values) {
        addCriterion("TUNITID in", values, "tunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andTunitidNotIn(List<java.lang.String> values) {
        addCriterion("TUNITID not in", values, "tunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andTunitidBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("TUNITID between", value1, value2, "tunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andTunitidNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("TUNITID not between", value1, value2, "tunitid");
        return (SysDeptCriteria) this;
    }
	public SysDeptCriteria andDataCunitidIsNull() {
        addCriterion("DATA_CUNITID is null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDataCunitidIsNotNull() {
        addCriterion("DATA_CUNITID is not null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDataCunitidEqualTo(java.lang.String value) {
        addCriterion("DATA_CUNITID =", value, "dataCunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDataCunitidNotEqualTo(java.lang.String value) {
        addCriterion("DATA_CUNITID <>", value, "dataCunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDataCunitidGreaterThan(java.lang.String value) {
        addCriterion("DATA_CUNITID >", value, "dataCunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDataCunitidGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("DATA_CUNITID >=", value, "dataCunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDataCunitidLessThan(java.lang.String value) {
        addCriterion("DATA_CUNITID <", value, "dataCunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDataCunitidLessThanOrEqualTo(java.lang.String value) {
        addCriterion("DATA_CUNITID <=", value, "dataCunitid");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andDataCunitidLike(java.lang.String value) {
        addCriterion("DATA_CUNITID like", value, "dataCunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDataCunitidNotLike(java.lang.String value) {
        addCriterion("DATA_CUNITID not like", value, "dataCunitid");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andDataCunitidIn(List<java.lang.String> values) {
        addCriterion("DATA_CUNITID in", values, "dataCunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDataCunitidNotIn(List<java.lang.String> values) {
        addCriterion("DATA_CUNITID not in", values, "dataCunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDataCunitidBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DATA_CUNITID between", value1, value2, "dataCunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDataCunitidNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DATA_CUNITID not between", value1, value2, "dataCunitid");
        return (SysDeptCriteria) this;
    }
	public SysDeptCriteria andDataSunitidIsNull() {
        addCriterion("DATA_SUNITID is null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDataSunitidIsNotNull() {
        addCriterion("DATA_SUNITID is not null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDataSunitidEqualTo(java.lang.String value) {
        addCriterion("DATA_SUNITID =", value, "dataSunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDataSunitidNotEqualTo(java.lang.String value) {
        addCriterion("DATA_SUNITID <>", value, "dataSunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDataSunitidGreaterThan(java.lang.String value) {
        addCriterion("DATA_SUNITID >", value, "dataSunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDataSunitidGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("DATA_SUNITID >=", value, "dataSunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDataSunitidLessThan(java.lang.String value) {
        addCriterion("DATA_SUNITID <", value, "dataSunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDataSunitidLessThanOrEqualTo(java.lang.String value) {
        addCriterion("DATA_SUNITID <=", value, "dataSunitid");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andDataSunitidLike(java.lang.String value) {
        addCriterion("DATA_SUNITID like", value, "dataSunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDataSunitidNotLike(java.lang.String value) {
        addCriterion("DATA_SUNITID not like", value, "dataSunitid");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andDataSunitidIn(List<java.lang.String> values) {
        addCriterion("DATA_SUNITID in", values, "dataSunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDataSunitidNotIn(List<java.lang.String> values) {
        addCriterion("DATA_SUNITID not in", values, "dataSunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDataSunitidBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DATA_SUNITID between", value1, value2, "dataSunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDataSunitidNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DATA_SUNITID not between", value1, value2, "dataSunitid");
        return (SysDeptCriteria) this;
    }
	public SysDeptCriteria andDataTunitidIsNull() {
        addCriterion("DATA_TUNITID is null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDataTunitidIsNotNull() {
        addCriterion("DATA_TUNITID is not null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDataTunitidEqualTo(java.lang.String value) {
        addCriterion("DATA_TUNITID =", value, "dataTunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDataTunitidNotEqualTo(java.lang.String value) {
        addCriterion("DATA_TUNITID <>", value, "dataTunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDataTunitidGreaterThan(java.lang.String value) {
        addCriterion("DATA_TUNITID >", value, "dataTunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDataTunitidGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("DATA_TUNITID >=", value, "dataTunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDataTunitidLessThan(java.lang.String value) {
        addCriterion("DATA_TUNITID <", value, "dataTunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDataTunitidLessThanOrEqualTo(java.lang.String value) {
        addCriterion("DATA_TUNITID <=", value, "dataTunitid");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andDataTunitidLike(java.lang.String value) {
        addCriterion("DATA_TUNITID like", value, "dataTunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDataTunitidNotLike(java.lang.String value) {
        addCriterion("DATA_TUNITID not like", value, "dataTunitid");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andDataTunitidIn(List<java.lang.String> values) {
        addCriterion("DATA_TUNITID in", values, "dataTunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDataTunitidNotIn(List<java.lang.String> values) {
        addCriterion("DATA_TUNITID not in", values, "dataTunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDataTunitidBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DATA_TUNITID between", value1, value2, "dataTunitid");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDataTunitidNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DATA_TUNITID not between", value1, value2, "dataTunitid");
        return (SysDeptCriteria) this;
    }
	public SysDeptCriteria andReserve1IsNull() {
        addCriterion("RESERVE1 is null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve1IsNotNull() {
        addCriterion("RESERVE1 is not null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve1EqualTo(java.lang.String value) {
        addCriterion("RESERVE1 =", value, "reserve1");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve1NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 <>", value, "reserve1");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve1GreaterThan(java.lang.String value) {
        addCriterion("RESERVE1 >", value, "reserve1");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve1GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 >=", value, "reserve1");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve1LessThan(java.lang.String value) {
        addCriterion("RESERVE1 <", value, "reserve1");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve1LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 <=", value, "reserve1");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andReserve1Like(java.lang.String value) {
        addCriterion("RESERVE1 like", value, "reserve1");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve1NotLike(java.lang.String value) {
        addCriterion("RESERVE1 not like", value, "reserve1");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andReserve1In(List<java.lang.String> values) {
        addCriterion("RESERVE1 in", values, "reserve1");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve1NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE1 not in", values, "reserve1");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve1Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE1 between", value1, value2, "reserve1");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve1NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE1 not between", value1, value2, "reserve1");
        return (SysDeptCriteria) this;
    }
	public SysDeptCriteria andReserve2IsNull() {
        addCriterion("RESERVE2 is null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve2IsNotNull() {
        addCriterion("RESERVE2 is not null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve2EqualTo(java.lang.String value) {
        addCriterion("RESERVE2 =", value, "reserve2");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve2NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 <>", value, "reserve2");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve2GreaterThan(java.lang.String value) {
        addCriterion("RESERVE2 >", value, "reserve2");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve2GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 >=", value, "reserve2");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve2LessThan(java.lang.String value) {
        addCriterion("RESERVE2 <", value, "reserve2");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve2LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 <=", value, "reserve2");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andReserve2Like(java.lang.String value) {
        addCriterion("RESERVE2 like", value, "reserve2");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve2NotLike(java.lang.String value) {
        addCriterion("RESERVE2 not like", value, "reserve2");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andReserve2In(List<java.lang.String> values) {
        addCriterion("RESERVE2 in", values, "reserve2");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve2NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE2 not in", values, "reserve2");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve2Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE2 between", value1, value2, "reserve2");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve2NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE2 not between", value1, value2, "reserve2");
        return (SysDeptCriteria) this;
    }
	public SysDeptCriteria andReserve3IsNull() {
        addCriterion("RESERVE3 is null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve3IsNotNull() {
        addCriterion("RESERVE3 is not null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve3EqualTo(java.lang.String value) {
        addCriterion("RESERVE3 =", value, "reserve3");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve3NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 <>", value, "reserve3");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve3GreaterThan(java.lang.String value) {
        addCriterion("RESERVE3 >", value, "reserve3");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve3GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 >=", value, "reserve3");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve3LessThan(java.lang.String value) {
        addCriterion("RESERVE3 <", value, "reserve3");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve3LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 <=", value, "reserve3");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andReserve3Like(java.lang.String value) {
        addCriterion("RESERVE3 like", value, "reserve3");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve3NotLike(java.lang.String value) {
        addCriterion("RESERVE3 not like", value, "reserve3");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andReserve3In(List<java.lang.String> values) {
        addCriterion("RESERVE3 in", values, "reserve3");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve3NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE3 not in", values, "reserve3");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve3Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE3 between", value1, value2, "reserve3");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve3NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE3 not between", value1, value2, "reserve3");
        return (SysDeptCriteria) this;
    }
	public SysDeptCriteria andReserve4IsNull() {
        addCriterion("RESERVE4 is null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve4IsNotNull() {
        addCriterion("RESERVE4 is not null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve4EqualTo(java.lang.String value) {
        addCriterion("RESERVE4 =", value, "reserve4");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve4NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 <>", value, "reserve4");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve4GreaterThan(java.lang.String value) {
        addCriterion("RESERVE4 >", value, "reserve4");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve4GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 >=", value, "reserve4");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve4LessThan(java.lang.String value) {
        addCriterion("RESERVE4 <", value, "reserve4");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve4LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 <=", value, "reserve4");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andReserve4Like(java.lang.String value) {
        addCriterion("RESERVE4 like", value, "reserve4");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve4NotLike(java.lang.String value) {
        addCriterion("RESERVE4 not like", value, "reserve4");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andReserve4In(List<java.lang.String> values) {
        addCriterion("RESERVE4 in", values, "reserve4");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve4NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE4 not in", values, "reserve4");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve4Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE4 between", value1, value2, "reserve4");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve4NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE4 not between", value1, value2, "reserve4");
        return (SysDeptCriteria) this;
    }
	public SysDeptCriteria andReserve5IsNull() {
        addCriterion("RESERVE5 is null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve5IsNotNull() {
        addCriterion("RESERVE5 is not null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve5EqualTo(java.lang.String value) {
        addCriterion("RESERVE5 =", value, "reserve5");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve5NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 <>", value, "reserve5");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve5GreaterThan(java.lang.String value) {
        addCriterion("RESERVE5 >", value, "reserve5");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve5GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 >=", value, "reserve5");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve5LessThan(java.lang.String value) {
        addCriterion("RESERVE5 <", value, "reserve5");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve5LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 <=", value, "reserve5");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andReserve5Like(java.lang.String value) {
        addCriterion("RESERVE5 like", value, "reserve5");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve5NotLike(java.lang.String value) {
        addCriterion("RESERVE5 not like", value, "reserve5");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andReserve5In(List<java.lang.String> values) {
        addCriterion("RESERVE5 in", values, "reserve5");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve5NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE5 not in", values, "reserve5");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve5Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE5 between", value1, value2, "reserve5");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andReserve5NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE5 not between", value1, value2, "reserve5");
        return (SysDeptCriteria) this;
    }
	public SysDeptCriteria andManagerIsNull() {
        addCriterion("MANAGER is null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andManagerIsNotNull() {
        addCriterion("MANAGER is not null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andManagerEqualTo(java.lang.String value) {
        addCriterion("MANAGER =", value, "manager");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andManagerNotEqualTo(java.lang.String value) {
        addCriterion("MANAGER <>", value, "manager");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andManagerGreaterThan(java.lang.String value) {
        addCriterion("MANAGER >", value, "manager");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andManagerGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("MANAGER >=", value, "manager");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andManagerLessThan(java.lang.String value) {
        addCriterion("MANAGER <", value, "manager");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andManagerLessThanOrEqualTo(java.lang.String value) {
        addCriterion("MANAGER <=", value, "manager");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andManagerLike(java.lang.String value) {
        addCriterion("MANAGER like", value, "manager");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andManagerNotLike(java.lang.String value) {
        addCriterion("MANAGER not like", value, "manager");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andManagerIn(List<java.lang.String> values) {
        addCriterion("MANAGER in", values, "manager");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andManagerNotIn(List<java.lang.String> values) {
        addCriterion("MANAGER not in", values, "manager");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andManagerBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MANAGER between", value1, value2, "manager");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andManagerNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MANAGER not between", value1, value2, "manager");
        return (SysDeptCriteria) this;
    }
	public SysDeptCriteria andDeptTypeIsNull() {
        addCriterion("DEPT_TYPE is null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptTypeIsNotNull() {
        addCriterion("DEPT_TYPE is not null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptTypeEqualTo(java.lang.String value) {
        addCriterion("DEPT_TYPE =", value, "deptType");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptTypeNotEqualTo(java.lang.String value) {
        addCriterion("DEPT_TYPE <>", value, "deptType");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptTypeGreaterThan(java.lang.String value) {
        addCriterion("DEPT_TYPE >", value, "deptType");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptTypeGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("DEPT_TYPE >=", value, "deptType");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptTypeLessThan(java.lang.String value) {
        addCriterion("DEPT_TYPE <", value, "deptType");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptTypeLessThanOrEqualTo(java.lang.String value) {
        addCriterion("DEPT_TYPE <=", value, "deptType");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andDeptTypeLike(java.lang.String value) {
        addCriterion("DEPT_TYPE like", value, "deptType");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptTypeNotLike(java.lang.String value) {
        addCriterion("DEPT_TYPE not like", value, "deptType");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andDeptTypeIn(List<java.lang.String> values) {
        addCriterion("DEPT_TYPE in", values, "deptType");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptTypeNotIn(List<java.lang.String> values) {
        addCriterion("DEPT_TYPE not in", values, "deptType");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptTypeBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DEPT_TYPE between", value1, value2, "deptType");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andDeptTypeNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DEPT_TYPE not between", value1, value2, "deptType");
        return (SysDeptCriteria) this;
    }
	public SysDeptCriteria andMemoIsNull() {
        addCriterion("MEMO is null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andMemoIsNotNull() {
        addCriterion("MEMO is not null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andMemoEqualTo(java.lang.String value) {
        addCriterion("MEMO =", value, "memo");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andMemoNotEqualTo(java.lang.String value) {
        addCriterion("MEMO <>", value, "memo");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andMemoGreaterThan(java.lang.String value) {
        addCriterion("MEMO >", value, "memo");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andMemoGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("MEMO >=", value, "memo");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andMemoLessThan(java.lang.String value) {
        addCriterion("MEMO <", value, "memo");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andMemoLessThanOrEqualTo(java.lang.String value) {
        addCriterion("MEMO <=", value, "memo");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andMemoLike(java.lang.String value) {
        addCriterion("MEMO like", value, "memo");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andMemoNotLike(java.lang.String value) {
        addCriterion("MEMO not like", value, "memo");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andMemoIn(List<java.lang.String> values) {
        addCriterion("MEMO in", values, "memo");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andMemoNotIn(List<java.lang.String> values) {
        addCriterion("MEMO not in", values, "memo");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andMemoBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MEMO between", value1, value2, "memo");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andMemoNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MEMO not between", value1, value2, "memo");
        return (SysDeptCriteria) this;
    }
	public SysDeptCriteria andAddUserIdIsNull() {
        addCriterion("ADD_USER_ID is null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andAddUserIdIsNotNull() {
        addCriterion("ADD_USER_ID is not null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andAddUserIdEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID =", value, "addUserId");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andAddUserIdNotEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID <>", value, "addUserId");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andAddUserIdGreaterThan(java.lang.Long value) {
        addCriterion("ADD_USER_ID >", value, "addUserId");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andAddUserIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID >=", value, "addUserId");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andAddUserIdLessThan(java.lang.Long value) {
        addCriterion("ADD_USER_ID <", value, "addUserId");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andAddUserIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID <=", value, "addUserId");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andAddUserIdIn(List<java.lang.Long> values) {
        addCriterion("ADD_USER_ID in", values, "addUserId");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andAddUserIdNotIn(List<java.lang.Long> values) {
        addCriterion("ADD_USER_ID not in", values, "addUserId");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andAddUserIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ADD_USER_ID between", value1, value2, "addUserId");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andAddUserIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ADD_USER_ID not between", value1, value2, "addUserId");
        return (SysDeptCriteria) this;
    }
	public SysDeptCriteria andAddUserNameIsNull() {
        addCriterion("ADD_USER_NAME is null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andAddUserNameIsNotNull() {
        addCriterion("ADD_USER_NAME is not null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andAddUserNameEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME =", value, "addUserName");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andAddUserNameNotEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME <>", value, "addUserName");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andAddUserNameGreaterThan(java.lang.String value) {
        addCriterion("ADD_USER_NAME >", value, "addUserName");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andAddUserNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME >=", value, "addUserName");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andAddUserNameLessThan(java.lang.String value) {
        addCriterion("ADD_USER_NAME <", value, "addUserName");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andAddUserNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME <=", value, "addUserName");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andAddUserNameLike(java.lang.String value) {
        addCriterion("ADD_USER_NAME like", value, "addUserName");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andAddUserNameNotLike(java.lang.String value) {
        addCriterion("ADD_USER_NAME not like", value, "addUserName");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andAddUserNameIn(List<java.lang.String> values) {
        addCriterion("ADD_USER_NAME in", values, "addUserName");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andAddUserNameNotIn(List<java.lang.String> values) {
        addCriterion("ADD_USER_NAME not in", values, "addUserName");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andAddUserNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ADD_USER_NAME between", value1, value2, "addUserName");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andAddUserNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ADD_USER_NAME not between", value1, value2, "addUserName");
        return (SysDeptCriteria) this;
    }
	public SysDeptCriteria andAddTimeIsNull() {
        addCriterion("ADD_TIME is null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andAddTimeIsNotNull() {
        addCriterion("ADD_TIME is not null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andAddTimeEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME =", value, "addTime");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andAddTimeNotEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME <>", value, "addTime");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andAddTimeGreaterThan(java.util.Date value) {
        addCriterion("ADD_TIME >", value, "addTime");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andAddTimeGreaterThanOrEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME >=", value, "addTime");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andAddTimeLessThan(java.util.Date value) {
        addCriterion("ADD_TIME <", value, "addTime");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andAddTimeLessThanOrEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME <=", value, "addTime");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andAddTimeIn(List<java.util.Date> values) {
        addCriterion("ADD_TIME in", values, "addTime");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andAddTimeNotIn(List<java.util.Date> values) {
        addCriterion("ADD_TIME not in", values, "addTime");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andAddTimeBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("ADD_TIME between", value1, value2, "addTime");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andAddTimeNotBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("ADD_TIME not between", value1, value2, "addTime");
        return (SysDeptCriteria) this;
    }
	public SysDeptCriteria andModifyUserIdIsNull() {
        addCriterion("MODIFY_USER_ID is null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andModifyUserIdIsNotNull() {
        addCriterion("MODIFY_USER_ID is not null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andModifyUserIdEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID =", value, "modifyUserId");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andModifyUserIdNotEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID <>", value, "modifyUserId");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andModifyUserIdGreaterThan(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID >", value, "modifyUserId");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andModifyUserIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID >=", value, "modifyUserId");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andModifyUserIdLessThan(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID <", value, "modifyUserId");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andModifyUserIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID <=", value, "modifyUserId");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andModifyUserIdIn(List<java.lang.Long> values) {
        addCriterion("MODIFY_USER_ID in", values, "modifyUserId");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andModifyUserIdNotIn(List<java.lang.Long> values) {
        addCriterion("MODIFY_USER_ID not in", values, "modifyUserId");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andModifyUserIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("MODIFY_USER_ID between", value1, value2, "modifyUserId");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andModifyUserIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("MODIFY_USER_ID not between", value1, value2, "modifyUserId");
        return (SysDeptCriteria) this;
    }
	public SysDeptCriteria andModifyUserNameIsNull() {
        addCriterion("MODIFY_USER_NAME is null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andModifyUserNameIsNotNull() {
        addCriterion("MODIFY_USER_NAME is not null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andModifyUserNameEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME =", value, "modifyUserName");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andModifyUserNameNotEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME <>", value, "modifyUserName");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andModifyUserNameGreaterThan(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME >", value, "modifyUserName");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andModifyUserNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME >=", value, "modifyUserName");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andModifyUserNameLessThan(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME <", value, "modifyUserName");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andModifyUserNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME <=", value, "modifyUserName");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andModifyUserNameLike(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME like", value, "modifyUserName");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andModifyUserNameNotLike(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME not like", value, "modifyUserName");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andModifyUserNameIn(List<java.lang.String> values) {
        addCriterion("MODIFY_USER_NAME in", values, "modifyUserName");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andModifyUserNameNotIn(List<java.lang.String> values) {
        addCriterion("MODIFY_USER_NAME not in", values, "modifyUserName");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andModifyUserNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MODIFY_USER_NAME between", value1, value2, "modifyUserName");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andModifyUserNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MODIFY_USER_NAME not between", value1, value2, "modifyUserName");
        return (SysDeptCriteria) this;
    }
	public SysDeptCriteria andModifyTimeIsNull() {
        addCriterion("MODIFY_TIME is null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andModifyTimeIsNotNull() {
        addCriterion("MODIFY_TIME is not null");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andModifyTimeEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME =", value, "modifyTime");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andModifyTimeNotEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME <>", value, "modifyTime");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andModifyTimeGreaterThan(java.util.Date value) {
        addCriterion("MODIFY_TIME >", value, "modifyTime");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andModifyTimeGreaterThanOrEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME >=", value, "modifyTime");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andModifyTimeLessThan(java.util.Date value) {
        addCriterion("MODIFY_TIME <", value, "modifyTime");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andModifyTimeLessThanOrEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME <=", value, "modifyTime");
        return (SysDeptCriteria) this;
    }
    
    public SysDeptCriteria andModifyTimeIn(List<java.util.Date> values) {
        addCriterion("MODIFY_TIME in", values, "modifyTime");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andModifyTimeNotIn(List<java.util.Date> values) {
        addCriterion("MODIFY_TIME not in", values, "modifyTime");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andModifyTimeBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("MODIFY_TIME between", value1, value2, "modifyTime");
        return (SysDeptCriteria) this;
    }

    public SysDeptCriteria andModifyTimeNotBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("MODIFY_TIME not between", value1, value2, "modifyTime");
        return (SysDeptCriteria) this;
    }
}

