package com.pkusoft.admin.model;

import java.util.List;

import com.pkusoft.framework.model.Criteria.BaseCriteria;

/**
 * 系统字典列表查询标准
 * @author 
 */
public class SysDicListCriteria extends BaseCriteria {
	public SysDicListCriteria andDicNameIsNull() {
        addCriterion("DIC_NAME is null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andDicNameIsNotNull() {
        addCriterion("DIC_NAME is not null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andDicNameEqualTo(java.lang.String value) {
        addCriterion("DIC_NAME =", value, "dicName");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andDicNameNotEqualTo(java.lang.String value) {
        addCriterion("DIC_NAME <>", value, "dicName");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andDicNameGreaterThan(java.lang.String value) {
        addCriterion("DIC_NAME >", value, "dicName");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andDicNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("DIC_NAME >=", value, "dicName");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andDicNameLessThan(java.lang.String value) {
        addCriterion("DIC_NAME <", value, "dicName");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andDicNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("DIC_NAME <=", value, "dicName");
        return (SysDicListCriteria) this;
    }
    
    public SysDicListCriteria andDicNameLike(java.lang.String value) {
        addCriterion("DIC_NAME like", value, "dicName");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andDicNameNotLike(java.lang.String value) {
        addCriterion("DIC_NAME not like", value, "dicName");
        return (SysDicListCriteria) this;
    }
    
    public SysDicListCriteria andDicNameIn(List<java.lang.String> values) {
        addCriterion("DIC_NAME in", values, "dicName");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andDicNameNotIn(List<java.lang.String> values) {
        addCriterion("DIC_NAME not in", values, "dicName");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andDicNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DIC_NAME between", value1, value2, "dicName");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andDicNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DIC_NAME not between", value1, value2, "dicName");
        return (SysDicListCriteria) this;
    }
	public SysDicListCriteria andDicDescIsNull() {
        addCriterion("DIC_DESC is null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andDicDescIsNotNull() {
        addCriterion("DIC_DESC is not null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andDicDescEqualTo(java.lang.String value) {
        addCriterion("DIC_DESC =", value, "dicDesc");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andDicDescNotEqualTo(java.lang.String value) {
        addCriterion("DIC_DESC <>", value, "dicDesc");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andDicDescGreaterThan(java.lang.String value) {
        addCriterion("DIC_DESC >", value, "dicDesc");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andDicDescGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("DIC_DESC >=", value, "dicDesc");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andDicDescLessThan(java.lang.String value) {
        addCriterion("DIC_DESC <", value, "dicDesc");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andDicDescLessThanOrEqualTo(java.lang.String value) {
        addCriterion("DIC_DESC <=", value, "dicDesc");
        return (SysDicListCriteria) this;
    }
    
    public SysDicListCriteria andDicDescLike(java.lang.String value) {
        addCriterion("DIC_DESC like", value, "dicDesc");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andDicDescNotLike(java.lang.String value) {
        addCriterion("DIC_DESC not like", value, "dicDesc");
        return (SysDicListCriteria) this;
    }
    
    public SysDicListCriteria andDicDescIn(List<java.lang.String> values) {
        addCriterion("DIC_DESC in", values, "dicDesc");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andDicDescNotIn(List<java.lang.String> values) {
        addCriterion("DIC_DESC not in", values, "dicDesc");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andDicDescBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DIC_DESC between", value1, value2, "dicDesc");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andDicDescNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DIC_DESC not between", value1, value2, "dicDesc");
        return (SysDicListCriteria) this;
    }
}

