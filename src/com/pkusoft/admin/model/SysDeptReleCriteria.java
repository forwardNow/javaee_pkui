package com.pkusoft.admin.model;

import java.util.List;

import com.pkusoft.framework.model.Criteria.BaseCriteria;

/**
 * 数据归属单位��ѯ��׼
 * @author 
 */
public class SysDeptReleCriteria extends BaseCriteria {
	public SysDeptReleCriteria andDeptIdIsNull() {
        addCriterion("DEPT_ID is null");
        return (SysDeptReleCriteria) this;
    }

    public SysDeptReleCriteria andDeptIdIsNotNull() {
        addCriterion("DEPT_ID is not null");
        return (SysDeptReleCriteria) this;
    }

    public SysDeptReleCriteria andDeptIdEqualTo(java.lang.String value) {
        addCriterion("DEPT_ID =", value, "deptId");
        return (SysDeptReleCriteria) this;
    }

    public SysDeptReleCriteria andDeptIdNotEqualTo(java.lang.String value) {
        addCriterion("DEPT_ID <>", value, "deptId");
        return (SysDeptReleCriteria) this;
    }

    public SysDeptReleCriteria andDeptIdGreaterThan(java.lang.String value) {
        addCriterion("DEPT_ID >", value, "deptId");
        return (SysDeptReleCriteria) this;
    }

    public SysDeptReleCriteria andDeptIdGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("DEPT_ID >=", value, "deptId");
        return (SysDeptReleCriteria) this;
    }

    public SysDeptReleCriteria andDeptIdLessThan(java.lang.String value) {
        addCriterion("DEPT_ID <", value, "deptId");
        return (SysDeptReleCriteria) this;
    }

    public SysDeptReleCriteria andDeptIdLessThanOrEqualTo(java.lang.String value) {
        addCriterion("DEPT_ID <=", value, "deptId");
        return (SysDeptReleCriteria) this;
    }
    
    public SysDeptReleCriteria andDeptIdLike(java.lang.String value) {
        addCriterion("DEPT_ID like", value, "deptId");
        return (SysDeptReleCriteria) this;
    }

    public SysDeptReleCriteria andDeptIdNotLike(java.lang.String value) {
        addCriterion("DEPT_ID not like", value, "deptId");
        return (SysDeptReleCriteria) this;
    }
    
    public SysDeptReleCriteria andDeptIdIn(List<java.lang.String> values) {
        addCriterion("DEPT_ID in", values, "deptId");
        return (SysDeptReleCriteria) this;
    }

    public SysDeptReleCriteria andDeptIdNotIn(List<java.lang.String> values) {
        addCriterion("DEPT_ID not in", values, "deptId");
        return (SysDeptReleCriteria) this;
    }

    public SysDeptReleCriteria andDeptIdBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DEPT_ID between", value1, value2, "deptId");
        return (SysDeptReleCriteria) this;
    }

    public SysDeptReleCriteria andDeptIdNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DEPT_ID not between", value1, value2, "deptId");
        return (SysDeptReleCriteria) this;
    }
	public SysDeptReleCriteria andReleDeptIdIsNull() {
        addCriterion("RELE_DEPT_ID is null");
        return (SysDeptReleCriteria) this;
    }

    public SysDeptReleCriteria andReleDeptIdIsNotNull() {
        addCriterion("RELE_DEPT_ID is not null");
        return (SysDeptReleCriteria) this;
    }

    public SysDeptReleCriteria andReleDeptIdEqualTo(java.lang.String value) {
        addCriterion("RELE_DEPT_ID =", value, "releDeptId");
        return (SysDeptReleCriteria) this;
    }

    public SysDeptReleCriteria andReleDeptIdNotEqualTo(java.lang.String value) {
        addCriterion("RELE_DEPT_ID <>", value, "releDeptId");
        return (SysDeptReleCriteria) this;
    }

    public SysDeptReleCriteria andReleDeptIdGreaterThan(java.lang.String value) {
        addCriterion("RELE_DEPT_ID >", value, "releDeptId");
        return (SysDeptReleCriteria) this;
    }

    public SysDeptReleCriteria andReleDeptIdGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RELE_DEPT_ID >=", value, "releDeptId");
        return (SysDeptReleCriteria) this;
    }

    public SysDeptReleCriteria andReleDeptIdLessThan(java.lang.String value) {
        addCriterion("RELE_DEPT_ID <", value, "releDeptId");
        return (SysDeptReleCriteria) this;
    }

    public SysDeptReleCriteria andReleDeptIdLessThanOrEqualTo(java.lang.String value) {
        addCriterion("RELE_DEPT_ID <=", value, "releDeptId");
        return (SysDeptReleCriteria) this;
    }
    
    public SysDeptReleCriteria andReleDeptIdLike(java.lang.String value) {
        addCriterion("RELE_DEPT_ID like", value, "releDeptId");
        return (SysDeptReleCriteria) this;
    }

    public SysDeptReleCriteria andReleDeptIdNotLike(java.lang.String value) {
        addCriterion("RELE_DEPT_ID not like", value, "releDeptId");
        return (SysDeptReleCriteria) this;
    }
    
    public SysDeptReleCriteria andReleDeptIdIn(List<java.lang.String> values) {
        addCriterion("RELE_DEPT_ID in", values, "releDeptId");
        return (SysDeptReleCriteria) this;
    }

    public SysDeptReleCriteria andReleDeptIdNotIn(List<java.lang.String> values) {
        addCriterion("RELE_DEPT_ID not in", values, "releDeptId");
        return (SysDeptReleCriteria) this;
    }

    public SysDeptReleCriteria andReleDeptIdBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RELE_DEPT_ID between", value1, value2, "releDeptId");
        return (SysDeptReleCriteria) this;
    }

    public SysDeptReleCriteria andReleDeptIdNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RELE_DEPT_ID not between", value1, value2, "releDeptId");
        return (SysDeptReleCriteria) this;
    }
	public SysDeptReleCriteria andReleDeptNameIsNull() {
        addCriterion("RELE_DEPT_NAME is null");
        return (SysDeptReleCriteria) this;
    }

    public SysDeptReleCriteria andReleDeptNameIsNotNull() {
        addCriterion("RELE_DEPT_NAME is not null");
        return (SysDeptReleCriteria) this;
    }

    public SysDeptReleCriteria andReleDeptNameEqualTo(java.lang.String value) {
        addCriterion("RELE_DEPT_NAME =", value, "releDeptName");
        return (SysDeptReleCriteria) this;
    }

    public SysDeptReleCriteria andReleDeptNameNotEqualTo(java.lang.String value) {
        addCriterion("RELE_DEPT_NAME <>", value, "releDeptName");
        return (SysDeptReleCriteria) this;
    }

    public SysDeptReleCriteria andReleDeptNameGreaterThan(java.lang.String value) {
        addCriterion("RELE_DEPT_NAME >", value, "releDeptName");
        return (SysDeptReleCriteria) this;
    }

    public SysDeptReleCriteria andReleDeptNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RELE_DEPT_NAME >=", value, "releDeptName");
        return (SysDeptReleCriteria) this;
    }

    public SysDeptReleCriteria andReleDeptNameLessThan(java.lang.String value) {
        addCriterion("RELE_DEPT_NAME <", value, "releDeptName");
        return (SysDeptReleCriteria) this;
    }

    public SysDeptReleCriteria andReleDeptNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("RELE_DEPT_NAME <=", value, "releDeptName");
        return (SysDeptReleCriteria) this;
    }
    
    public SysDeptReleCriteria andReleDeptNameLike(java.lang.String value) {
        addCriterion("RELE_DEPT_NAME like", value, "releDeptName");
        return (SysDeptReleCriteria) this;
    }

    public SysDeptReleCriteria andReleDeptNameNotLike(java.lang.String value) {
        addCriterion("RELE_DEPT_NAME not like", value, "releDeptName");
        return (SysDeptReleCriteria) this;
    }
    
    public SysDeptReleCriteria andReleDeptNameIn(List<java.lang.String> values) {
        addCriterion("RELE_DEPT_NAME in", values, "releDeptName");
        return (SysDeptReleCriteria) this;
    }

    public SysDeptReleCriteria andReleDeptNameNotIn(List<java.lang.String> values) {
        addCriterion("RELE_DEPT_NAME not in", values, "releDeptName");
        return (SysDeptReleCriteria) this;
    }

    public SysDeptReleCriteria andReleDeptNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RELE_DEPT_NAME between", value1, value2, "releDeptName");
        return (SysDeptReleCriteria) this;
    }

    public SysDeptReleCriteria andReleDeptNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RELE_DEPT_NAME not between", value1, value2, "releDeptName");
        return (SysDeptReleCriteria) this;
    }
}

