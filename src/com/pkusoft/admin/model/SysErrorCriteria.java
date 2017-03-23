package com.pkusoft.admin.model;

import java.util.List;

import com.pkusoft.framework.model.Criteria.BaseCriteria;

/**
 * 
 * @author 
 */
public class SysErrorCriteria extends BaseCriteria {
	public SysErrorCriteria andErrorIdIsNull() {
        addCriterion("ERROR_ID is null");
        return (SysErrorCriteria) this;
    }

    public SysErrorCriteria andErrorIdIsNotNull() {
        addCriterion("ERROR_ID is not null");
        return (SysErrorCriteria) this;
    }

    public SysErrorCriteria andErrorIdEqualTo(java.lang.Long value) {
        addCriterion("ERROR_ID =", value, "errorId");
        return (SysErrorCriteria) this;
    }

    public SysErrorCriteria andErrorIdNotEqualTo(java.lang.Long value) {
        addCriterion("ERROR_ID <>", value, "errorId");
        return (SysErrorCriteria) this;
    }

    public SysErrorCriteria andErrorIdGreaterThan(java.lang.Long value) {
        addCriterion("ERROR_ID >", value, "errorId");
        return (SysErrorCriteria) this;
    }

    public SysErrorCriteria andErrorIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ERROR_ID >=", value, "errorId");
        return (SysErrorCriteria) this;
    }

    public SysErrorCriteria andErrorIdLessThan(java.lang.Long value) {
        addCriterion("ERROR_ID <", value, "errorId");
        return (SysErrorCriteria) this;
    }

    public SysErrorCriteria andErrorIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ERROR_ID <=", value, "errorId");
        return (SysErrorCriteria) this;
    }
    
    public SysErrorCriteria andErrorIdIn(List<java.lang.Long> values) {
        addCriterion("ERROR_ID in", values, "errorId");
        return (SysErrorCriteria) this;
    }

    public SysErrorCriteria andErrorIdNotIn(List<java.lang.Long> values) {
        addCriterion("ERROR_ID not in", values, "errorId");
        return (SysErrorCriteria) this;
    }

    public SysErrorCriteria andErrorIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ERROR_ID between", value1, value2, "errorId");
        return (SysErrorCriteria) this;
    }

    public SysErrorCriteria andErrorIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ERROR_ID not between", value1, value2, "errorId");
        return (SysErrorCriteria) this;
    }
	public SysErrorCriteria andErrorCodeIsNull() {
        addCriterion("ERROR_CODE is null");
        return (SysErrorCriteria) this;
    }

    public SysErrorCriteria andErrorCodeIsNotNull() {
        addCriterion("ERROR_CODE is not null");
        return (SysErrorCriteria) this;
    }

    public SysErrorCriteria andErrorCodeEqualTo(java.lang.String value) {
        addCriterion("ERROR_CODE =", value, "errorCode");
        return (SysErrorCriteria) this;
    }

    public SysErrorCriteria andErrorCodeNotEqualTo(java.lang.String value) {
        addCriterion("ERROR_CODE <>", value, "errorCode");
        return (SysErrorCriteria) this;
    }

    public SysErrorCriteria andErrorCodeGreaterThan(java.lang.String value) {
        addCriterion("ERROR_CODE >", value, "errorCode");
        return (SysErrorCriteria) this;
    }

    public SysErrorCriteria andErrorCodeGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("ERROR_CODE >=", value, "errorCode");
        return (SysErrorCriteria) this;
    }

    public SysErrorCriteria andErrorCodeLessThan(java.lang.String value) {
        addCriterion("ERROR_CODE <", value, "errorCode");
        return (SysErrorCriteria) this;
    }

    public SysErrorCriteria andErrorCodeLessThanOrEqualTo(java.lang.String value) {
        addCriterion("ERROR_CODE <=", value, "errorCode");
        return (SysErrorCriteria) this;
    }
    
    public SysErrorCriteria andErrorCodeLike(java.lang.String value) {
        addCriterion("ERROR_CODE like", value, "errorCode");
        return (SysErrorCriteria) this;
    }

    public SysErrorCriteria andErrorCodeNotLike(java.lang.String value) {
        addCriterion("ERROR_CODE not like", value, "errorCode");
        return (SysErrorCriteria) this;
    }
    
    public SysErrorCriteria andErrorCodeIn(List<java.lang.String> values) {
        addCriterion("ERROR_CODE in", values, "errorCode");
        return (SysErrorCriteria) this;
    }

    public SysErrorCriteria andErrorCodeNotIn(List<java.lang.String> values) {
        addCriterion("ERROR_CODE not in", values, "errorCode");
        return (SysErrorCriteria) this;
    }

    public SysErrorCriteria andErrorCodeBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ERROR_CODE between", value1, value2, "errorCode");
        return (SysErrorCriteria) this;
    }

    public SysErrorCriteria andErrorCodeNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ERROR_CODE not between", value1, value2, "errorCode");
        return (SysErrorCriteria) this;
    }
	public SysErrorCriteria andErrorInfoIsNull() {
        addCriterion("ERROR_INFO is null");
        return (SysErrorCriteria) this;
    }

    public SysErrorCriteria andErrorInfoIsNotNull() {
        addCriterion("ERROR_INFO is not null");
        return (SysErrorCriteria) this;
    }

    public SysErrorCriteria andErrorInfoEqualTo(java.lang.String value) {
        addCriterion("ERROR_INFO =", value, "errorInfo");
        return (SysErrorCriteria) this;
    }

    public SysErrorCriteria andErrorInfoNotEqualTo(java.lang.String value) {
        addCriterion("ERROR_INFO <>", value, "errorInfo");
        return (SysErrorCriteria) this;
    }

    public SysErrorCriteria andErrorInfoGreaterThan(java.lang.String value) {
        addCriterion("ERROR_INFO >", value, "errorInfo");
        return (SysErrorCriteria) this;
    }

    public SysErrorCriteria andErrorInfoGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("ERROR_INFO >=", value, "errorInfo");
        return (SysErrorCriteria) this;
    }

    public SysErrorCriteria andErrorInfoLessThan(java.lang.String value) {
        addCriterion("ERROR_INFO <", value, "errorInfo");
        return (SysErrorCriteria) this;
    }

    public SysErrorCriteria andErrorInfoLessThanOrEqualTo(java.lang.String value) {
        addCriterion("ERROR_INFO <=", value, "errorInfo");
        return (SysErrorCriteria) this;
    }
    
    public SysErrorCriteria andErrorInfoLike(java.lang.String value) {
        addCriterion("ERROR_INFO like", value, "errorInfo");
        return (SysErrorCriteria) this;
    }

    public SysErrorCriteria andErrorInfoNotLike(java.lang.String value) {
        addCriterion("ERROR_INFO not like", value, "errorInfo");
        return (SysErrorCriteria) this;
    }
    
    public SysErrorCriteria andErrorInfoIn(List<java.lang.String> values) {
        addCriterion("ERROR_INFO in", values, "errorInfo");
        return (SysErrorCriteria) this;
    }

    public SysErrorCriteria andErrorInfoNotIn(List<java.lang.String> values) {
        addCriterion("ERROR_INFO not in", values, "errorInfo");
        return (SysErrorCriteria) this;
    }

    public SysErrorCriteria andErrorInfoBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ERROR_INFO between", value1, value2, "errorInfo");
        return (SysErrorCriteria) this;
    }

    public SysErrorCriteria andErrorInfoNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ERROR_INFO not between", value1, value2, "errorInfo");
        return (SysErrorCriteria) this;
    }
}

