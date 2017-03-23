package com.pkusoft.admin.model;

import java.util.List;

import com.pkusoft.framework.model.Criteria.BaseCriteria;

/**
 * 
 * @author 
 */
public class SysPermitCfgCriteria extends BaseCriteria {
	public SysPermitCfgCriteria andCfgIdIsNull() {
        addCriterion("CFG_ID is null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgIdIsNotNull() {
        addCriterion("CFG_ID is not null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgIdEqualTo(java.lang.Long value) {
        addCriterion("CFG_ID =", value, "cfgId");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgIdNotEqualTo(java.lang.Long value) {
        addCriterion("CFG_ID <>", value, "cfgId");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgIdGreaterThan(java.lang.Long value) {
        addCriterion("CFG_ID >", value, "cfgId");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("CFG_ID >=", value, "cfgId");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgIdLessThan(java.lang.Long value) {
        addCriterion("CFG_ID <", value, "cfgId");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("CFG_ID <=", value, "cfgId");
        return (SysPermitCfgCriteria) this;
    }
    
    public SysPermitCfgCriteria andCfgIdIn(List<java.lang.Long> values) {
        addCriterion("CFG_ID in", values, "cfgId");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgIdNotIn(List<java.lang.Long> values) {
        addCriterion("CFG_ID not in", values, "cfgId");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("CFG_ID between", value1, value2, "cfgId");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("CFG_ID not between", value1, value2, "cfgId");
        return (SysPermitCfgCriteria) this;
    }
	public SysPermitCfgCriteria andCfgCodeIsNull() {
        addCriterion("CFG_CODE is null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgCodeIsNotNull() {
        addCriterion("CFG_CODE is not null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgCodeEqualTo(java.lang.String value) {
        addCriterion("CFG_CODE =", value, "cfgCode");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgCodeNotEqualTo(java.lang.String value) {
        addCriterion("CFG_CODE <>", value, "cfgCode");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgCodeGreaterThan(java.lang.String value) {
        addCriterion("CFG_CODE >", value, "cfgCode");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgCodeGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("CFG_CODE >=", value, "cfgCode");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgCodeLessThan(java.lang.String value) {
        addCriterion("CFG_CODE <", value, "cfgCode");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgCodeLessThanOrEqualTo(java.lang.String value) {
        addCriterion("CFG_CODE <=", value, "cfgCode");
        return (SysPermitCfgCriteria) this;
    }
    
    public SysPermitCfgCriteria andCfgCodeLike(java.lang.String value) {
        addCriterion("CFG_CODE like", value, "cfgCode");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgCodeNotLike(java.lang.String value) {
        addCriterion("CFG_CODE not like", value, "cfgCode");
        return (SysPermitCfgCriteria) this;
    }
    
    public SysPermitCfgCriteria andCfgCodeIn(List<java.lang.String> values) {
        addCriterion("CFG_CODE in", values, "cfgCode");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgCodeNotIn(List<java.lang.String> values) {
        addCriterion("CFG_CODE not in", values, "cfgCode");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgCodeBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("CFG_CODE between", value1, value2, "cfgCode");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgCodeNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("CFG_CODE not between", value1, value2, "cfgCode");
        return (SysPermitCfgCriteria) this;
    }
	public SysPermitCfgCriteria andCfgNameIsNull() {
        addCriterion("CFG_NAME is null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgNameIsNotNull() {
        addCriterion("CFG_NAME is not null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgNameEqualTo(java.lang.String value) {
        addCriterion("CFG_NAME =", value, "cfgName");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgNameNotEqualTo(java.lang.String value) {
        addCriterion("CFG_NAME <>", value, "cfgName");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgNameGreaterThan(java.lang.String value) {
        addCriterion("CFG_NAME >", value, "cfgName");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("CFG_NAME >=", value, "cfgName");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgNameLessThan(java.lang.String value) {
        addCriterion("CFG_NAME <", value, "cfgName");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("CFG_NAME <=", value, "cfgName");
        return (SysPermitCfgCriteria) this;
    }
    
    public SysPermitCfgCriteria andCfgNameLike(java.lang.String value) {
        addCriterion("CFG_NAME like", value, "cfgName");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgNameNotLike(java.lang.String value) {
        addCriterion("CFG_NAME not like", value, "cfgName");
        return (SysPermitCfgCriteria) this;
    }
    
    public SysPermitCfgCriteria andCfgNameIn(List<java.lang.String> values) {
        addCriterion("CFG_NAME in", values, "cfgName");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgNameNotIn(List<java.lang.String> values) {
        addCriterion("CFG_NAME not in", values, "cfgName");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("CFG_NAME between", value1, value2, "cfgName");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("CFG_NAME not between", value1, value2, "cfgName");
        return (SysPermitCfgCriteria) this;
    }
	public SysPermitCfgCriteria andPermitIdIsNull() {
        addCriterion("PERMIT_ID is null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andPermitIdIsNotNull() {
        addCriterion("PERMIT_ID is not null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andPermitIdEqualTo(java.lang.Long value) {
        addCriterion("PERMIT_ID =", value, "permitId");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andPermitIdNotEqualTo(java.lang.Long value) {
        addCriterion("PERMIT_ID <>", value, "permitId");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andPermitIdGreaterThan(java.lang.Long value) {
        addCriterion("PERMIT_ID >", value, "permitId");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andPermitIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("PERMIT_ID >=", value, "permitId");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andPermitIdLessThan(java.lang.Long value) {
        addCriterion("PERMIT_ID <", value, "permitId");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andPermitIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("PERMIT_ID <=", value, "permitId");
        return (SysPermitCfgCriteria) this;
    }
    
    public SysPermitCfgCriteria andPermitIdIn(List<java.lang.Long> values) {
        addCriterion("PERMIT_ID in", values, "permitId");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andPermitIdNotIn(List<java.lang.Long> values) {
        addCriterion("PERMIT_ID not in", values, "permitId");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andPermitIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("PERMIT_ID between", value1, value2, "permitId");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andPermitIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("PERMIT_ID not between", value1, value2, "permitId");
        return (SysPermitCfgCriteria) this;
    }
	public SysPermitCfgCriteria andCfgValueIsNull() {
        addCriterion("CFG_VALUE is null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgValueIsNotNull() {
        addCriterion("CFG_VALUE is not null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgValueEqualTo(java.lang.String value) {
        addCriterion("CFG_VALUE =", value, "cfgValue");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgValueNotEqualTo(java.lang.String value) {
        addCriterion("CFG_VALUE <>", value, "cfgValue");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgValueGreaterThan(java.lang.String value) {
        addCriterion("CFG_VALUE >", value, "cfgValue");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgValueGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("CFG_VALUE >=", value, "cfgValue");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgValueLessThan(java.lang.String value) {
        addCriterion("CFG_VALUE <", value, "cfgValue");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgValueLessThanOrEqualTo(java.lang.String value) {
        addCriterion("CFG_VALUE <=", value, "cfgValue");
        return (SysPermitCfgCriteria) this;
    }
    
    public SysPermitCfgCriteria andCfgValueLike(java.lang.String value) {
        addCriterion("CFG_VALUE like", value, "cfgValue");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgValueNotLike(java.lang.String value) {
        addCriterion("CFG_VALUE not like", value, "cfgValue");
        return (SysPermitCfgCriteria) this;
    }
    
    public SysPermitCfgCriteria andCfgValueIn(List<java.lang.String> values) {
        addCriterion("CFG_VALUE in", values, "cfgValue");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgValueNotIn(List<java.lang.String> values) {
        addCriterion("CFG_VALUE not in", values, "cfgValue");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgValueBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("CFG_VALUE between", value1, value2, "cfgValue");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgValueNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("CFG_VALUE not between", value1, value2, "cfgValue");
        return (SysPermitCfgCriteria) this;
    }
	public SysPermitCfgCriteria andCfgDescIsNull() {
        addCriterion("CFG_DESC is null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgDescIsNotNull() {
        addCriterion("CFG_DESC is not null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgDescEqualTo(java.lang.String value) {
        addCriterion("CFG_DESC =", value, "cfgDesc");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgDescNotEqualTo(java.lang.String value) {
        addCriterion("CFG_DESC <>", value, "cfgDesc");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgDescGreaterThan(java.lang.String value) {
        addCriterion("CFG_DESC >", value, "cfgDesc");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgDescGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("CFG_DESC >=", value, "cfgDesc");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgDescLessThan(java.lang.String value) {
        addCriterion("CFG_DESC <", value, "cfgDesc");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgDescLessThanOrEqualTo(java.lang.String value) {
        addCriterion("CFG_DESC <=", value, "cfgDesc");
        return (SysPermitCfgCriteria) this;
    }
    
    public SysPermitCfgCriteria andCfgDescLike(java.lang.String value) {
        addCriterion("CFG_DESC like", value, "cfgDesc");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgDescNotLike(java.lang.String value) {
        addCriterion("CFG_DESC not like", value, "cfgDesc");
        return (SysPermitCfgCriteria) this;
    }
    
    public SysPermitCfgCriteria andCfgDescIn(List<java.lang.String> values) {
        addCriterion("CFG_DESC in", values, "cfgDesc");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgDescNotIn(List<java.lang.String> values) {
        addCriterion("CFG_DESC not in", values, "cfgDesc");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgDescBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("CFG_DESC between", value1, value2, "cfgDesc");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andCfgDescNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("CFG_DESC not between", value1, value2, "cfgDesc");
        return (SysPermitCfgCriteria) this;
    }
	public SysPermitCfgCriteria andOrderFlagIsNull() {
        addCriterion("ORDER_FLAG is null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andOrderFlagIsNotNull() {
        addCriterion("ORDER_FLAG is not null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andOrderFlagEqualTo(java.lang.Long value) {
        addCriterion("ORDER_FLAG =", value, "orderFlag");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andOrderFlagNotEqualTo(java.lang.Long value) {
        addCriterion("ORDER_FLAG <>", value, "orderFlag");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andOrderFlagGreaterThan(java.lang.Long value) {
        addCriterion("ORDER_FLAG >", value, "orderFlag");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andOrderFlagGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ORDER_FLAG >=", value, "orderFlag");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andOrderFlagLessThan(java.lang.Long value) {
        addCriterion("ORDER_FLAG <", value, "orderFlag");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andOrderFlagLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ORDER_FLAG <=", value, "orderFlag");
        return (SysPermitCfgCriteria) this;
    }
    
    public SysPermitCfgCriteria andOrderFlagIn(List<java.lang.Long> values) {
        addCriterion("ORDER_FLAG in", values, "orderFlag");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andOrderFlagNotIn(List<java.lang.Long> values) {
        addCriterion("ORDER_FLAG not in", values, "orderFlag");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andOrderFlagBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ORDER_FLAG between", value1, value2, "orderFlag");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andOrderFlagNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ORDER_FLAG not between", value1, value2, "orderFlag");
        return (SysPermitCfgCriteria) this;
    }
	public SysPermitCfgCriteria andReserve6IsNull() {
        addCriterion("RESERVE6 is null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve6IsNotNull() {
        addCriterion("RESERVE6 is not null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve6EqualTo(java.lang.String value) {
        addCriterion("RESERVE6 =", value, "reserve6");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve6NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE6 <>", value, "reserve6");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve6GreaterThan(java.lang.String value) {
        addCriterion("RESERVE6 >", value, "reserve6");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve6GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE6 >=", value, "reserve6");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve6LessThan(java.lang.String value) {
        addCriterion("RESERVE6 <", value, "reserve6");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve6LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE6 <=", value, "reserve6");
        return (SysPermitCfgCriteria) this;
    }
    
    public SysPermitCfgCriteria andReserve6Like(java.lang.String value) {
        addCriterion("RESERVE6 like", value, "reserve6");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve6NotLike(java.lang.String value) {
        addCriterion("RESERVE6 not like", value, "reserve6");
        return (SysPermitCfgCriteria) this;
    }
    
    public SysPermitCfgCriteria andReserve6In(List<java.lang.String> values) {
        addCriterion("RESERVE6 in", values, "reserve6");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve6NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE6 not in", values, "reserve6");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve6Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE6 between", value1, value2, "reserve6");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve6NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE6 not between", value1, value2, "reserve6");
        return (SysPermitCfgCriteria) this;
    }
	public SysPermitCfgCriteria andReserve1IsNull() {
        addCriterion("RESERVE1 is null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve1IsNotNull() {
        addCriterion("RESERVE1 is not null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve1EqualTo(java.lang.String value) {
        addCriterion("RESERVE1 =", value, "reserve1");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve1NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 <>", value, "reserve1");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve1GreaterThan(java.lang.String value) {
        addCriterion("RESERVE1 >", value, "reserve1");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve1GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 >=", value, "reserve1");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve1LessThan(java.lang.String value) {
        addCriterion("RESERVE1 <", value, "reserve1");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve1LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 <=", value, "reserve1");
        return (SysPermitCfgCriteria) this;
    }
    
    public SysPermitCfgCriteria andReserve1Like(java.lang.String value) {
        addCriterion("RESERVE1 like", value, "reserve1");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve1NotLike(java.lang.String value) {
        addCriterion("RESERVE1 not like", value, "reserve1");
        return (SysPermitCfgCriteria) this;
    }
    
    public SysPermitCfgCriteria andReserve1In(List<java.lang.String> values) {
        addCriterion("RESERVE1 in", values, "reserve1");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve1NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE1 not in", values, "reserve1");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve1Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE1 between", value1, value2, "reserve1");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve1NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE1 not between", value1, value2, "reserve1");
        return (SysPermitCfgCriteria) this;
    }
	public SysPermitCfgCriteria andReserve2IsNull() {
        addCriterion("RESERVE2 is null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve2IsNotNull() {
        addCriterion("RESERVE2 is not null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve2EqualTo(java.lang.String value) {
        addCriterion("RESERVE2 =", value, "reserve2");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve2NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 <>", value, "reserve2");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve2GreaterThan(java.lang.String value) {
        addCriterion("RESERVE2 >", value, "reserve2");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve2GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 >=", value, "reserve2");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve2LessThan(java.lang.String value) {
        addCriterion("RESERVE2 <", value, "reserve2");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve2LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 <=", value, "reserve2");
        return (SysPermitCfgCriteria) this;
    }
    
    public SysPermitCfgCriteria andReserve2Like(java.lang.String value) {
        addCriterion("RESERVE2 like", value, "reserve2");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve2NotLike(java.lang.String value) {
        addCriterion("RESERVE2 not like", value, "reserve2");
        return (SysPermitCfgCriteria) this;
    }
    
    public SysPermitCfgCriteria andReserve2In(List<java.lang.String> values) {
        addCriterion("RESERVE2 in", values, "reserve2");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve2NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE2 not in", values, "reserve2");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve2Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE2 between", value1, value2, "reserve2");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve2NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE2 not between", value1, value2, "reserve2");
        return (SysPermitCfgCriteria) this;
    }
	public SysPermitCfgCriteria andReserve3IsNull() {
        addCriterion("RESERVE3 is null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve3IsNotNull() {
        addCriterion("RESERVE3 is not null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve3EqualTo(java.lang.String value) {
        addCriterion("RESERVE3 =", value, "reserve3");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve3NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 <>", value, "reserve3");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve3GreaterThan(java.lang.String value) {
        addCriterion("RESERVE3 >", value, "reserve3");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve3GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 >=", value, "reserve3");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve3LessThan(java.lang.String value) {
        addCriterion("RESERVE3 <", value, "reserve3");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve3LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 <=", value, "reserve3");
        return (SysPermitCfgCriteria) this;
    }
    
    public SysPermitCfgCriteria andReserve3Like(java.lang.String value) {
        addCriterion("RESERVE3 like", value, "reserve3");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve3NotLike(java.lang.String value) {
        addCriterion("RESERVE3 not like", value, "reserve3");
        return (SysPermitCfgCriteria) this;
    }
    
    public SysPermitCfgCriteria andReserve3In(List<java.lang.String> values) {
        addCriterion("RESERVE3 in", values, "reserve3");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve3NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE3 not in", values, "reserve3");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve3Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE3 between", value1, value2, "reserve3");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve3NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE3 not between", value1, value2, "reserve3");
        return (SysPermitCfgCriteria) this;
    }
	public SysPermitCfgCriteria andReserve4IsNull() {
        addCriterion("RESERVE4 is null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve4IsNotNull() {
        addCriterion("RESERVE4 is not null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve4EqualTo(java.lang.String value) {
        addCriterion("RESERVE4 =", value, "reserve4");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve4NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 <>", value, "reserve4");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve4GreaterThan(java.lang.String value) {
        addCriterion("RESERVE4 >", value, "reserve4");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve4GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 >=", value, "reserve4");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve4LessThan(java.lang.String value) {
        addCriterion("RESERVE4 <", value, "reserve4");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve4LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 <=", value, "reserve4");
        return (SysPermitCfgCriteria) this;
    }
    
    public SysPermitCfgCriteria andReserve4Like(java.lang.String value) {
        addCriterion("RESERVE4 like", value, "reserve4");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve4NotLike(java.lang.String value) {
        addCriterion("RESERVE4 not like", value, "reserve4");
        return (SysPermitCfgCriteria) this;
    }
    
    public SysPermitCfgCriteria andReserve4In(List<java.lang.String> values) {
        addCriterion("RESERVE4 in", values, "reserve4");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve4NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE4 not in", values, "reserve4");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve4Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE4 between", value1, value2, "reserve4");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve4NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE4 not between", value1, value2, "reserve4");
        return (SysPermitCfgCriteria) this;
    }
	public SysPermitCfgCriteria andReserve5IsNull() {
        addCriterion("RESERVE5 is null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve5IsNotNull() {
        addCriterion("RESERVE5 is not null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve5EqualTo(java.lang.String value) {
        addCriterion("RESERVE5 =", value, "reserve5");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve5NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 <>", value, "reserve5");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve5GreaterThan(java.lang.String value) {
        addCriterion("RESERVE5 >", value, "reserve5");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve5GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 >=", value, "reserve5");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve5LessThan(java.lang.String value) {
        addCriterion("RESERVE5 <", value, "reserve5");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve5LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 <=", value, "reserve5");
        return (SysPermitCfgCriteria) this;
    }
    
    public SysPermitCfgCriteria andReserve5Like(java.lang.String value) {
        addCriterion("RESERVE5 like", value, "reserve5");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve5NotLike(java.lang.String value) {
        addCriterion("RESERVE5 not like", value, "reserve5");
        return (SysPermitCfgCriteria) this;
    }
    
    public SysPermitCfgCriteria andReserve5In(List<java.lang.String> values) {
        addCriterion("RESERVE5 in", values, "reserve5");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve5NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE5 not in", values, "reserve5");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve5Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE5 between", value1, value2, "reserve5");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andReserve5NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE5 not between", value1, value2, "reserve5");
        return (SysPermitCfgCriteria) this;
    }
	public SysPermitCfgCriteria andAddUserIdIsNull() {
        addCriterion("ADD_USER_ID is null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andAddUserIdIsNotNull() {
        addCriterion("ADD_USER_ID is not null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andAddUserIdEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID =", value, "addUserId");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andAddUserIdNotEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID <>", value, "addUserId");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andAddUserIdGreaterThan(java.lang.Long value) {
        addCriterion("ADD_USER_ID >", value, "addUserId");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andAddUserIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID >=", value, "addUserId");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andAddUserIdLessThan(java.lang.Long value) {
        addCriterion("ADD_USER_ID <", value, "addUserId");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andAddUserIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID <=", value, "addUserId");
        return (SysPermitCfgCriteria) this;
    }
    
    public SysPermitCfgCriteria andAddUserIdIn(List<java.lang.Long> values) {
        addCriterion("ADD_USER_ID in", values, "addUserId");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andAddUserIdNotIn(List<java.lang.Long> values) {
        addCriterion("ADD_USER_ID not in", values, "addUserId");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andAddUserIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ADD_USER_ID between", value1, value2, "addUserId");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andAddUserIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ADD_USER_ID not between", value1, value2, "addUserId");
        return (SysPermitCfgCriteria) this;
    }
	public SysPermitCfgCriteria andAddUserNameIsNull() {
        addCriterion("ADD_USER_NAME is null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andAddUserNameIsNotNull() {
        addCriterion("ADD_USER_NAME is not null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andAddUserNameEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME =", value, "addUserName");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andAddUserNameNotEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME <>", value, "addUserName");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andAddUserNameGreaterThan(java.lang.String value) {
        addCriterion("ADD_USER_NAME >", value, "addUserName");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andAddUserNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME >=", value, "addUserName");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andAddUserNameLessThan(java.lang.String value) {
        addCriterion("ADD_USER_NAME <", value, "addUserName");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andAddUserNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME <=", value, "addUserName");
        return (SysPermitCfgCriteria) this;
    }
    
    public SysPermitCfgCriteria andAddUserNameLike(java.lang.String value) {
        addCriterion("ADD_USER_NAME like", value, "addUserName");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andAddUserNameNotLike(java.lang.String value) {
        addCriterion("ADD_USER_NAME not like", value, "addUserName");
        return (SysPermitCfgCriteria) this;
    }
    
    public SysPermitCfgCriteria andAddUserNameIn(List<java.lang.String> values) {
        addCriterion("ADD_USER_NAME in", values, "addUserName");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andAddUserNameNotIn(List<java.lang.String> values) {
        addCriterion("ADD_USER_NAME not in", values, "addUserName");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andAddUserNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ADD_USER_NAME between", value1, value2, "addUserName");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andAddUserNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ADD_USER_NAME not between", value1, value2, "addUserName");
        return (SysPermitCfgCriteria) this;
    }
	public SysPermitCfgCriteria andAddTimeIsNull() {
        addCriterion("ADD_TIME is null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andAddTimeIsNotNull() {
        addCriterion("ADD_TIME is not null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andAddTimeEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME =", value, "addTime");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andAddTimeNotEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME <>", value, "addTime");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andAddTimeGreaterThan(java.util.Date value) {
        addCriterion("ADD_TIME >", value, "addTime");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andAddTimeGreaterThanOrEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME >=", value, "addTime");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andAddTimeLessThan(java.util.Date value) {
        addCriterion("ADD_TIME <", value, "addTime");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andAddTimeLessThanOrEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME <=", value, "addTime");
        return (SysPermitCfgCriteria) this;
    }
    
    public SysPermitCfgCriteria andAddTimeIn(List<java.util.Date> values) {
        addCriterion("ADD_TIME in", values, "addTime");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andAddTimeNotIn(List<java.util.Date> values) {
        addCriterion("ADD_TIME not in", values, "addTime");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andAddTimeBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("ADD_TIME between", value1, value2, "addTime");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andAddTimeNotBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("ADD_TIME not between", value1, value2, "addTime");
        return (SysPermitCfgCriteria) this;
    }
	public SysPermitCfgCriteria andModifyUserIdIsNull() {
        addCriterion("MODIFY_USER_ID is null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andModifyUserIdIsNotNull() {
        addCriterion("MODIFY_USER_ID is not null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andModifyUserIdEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID =", value, "modifyUserId");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andModifyUserIdNotEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID <>", value, "modifyUserId");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andModifyUserIdGreaterThan(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID >", value, "modifyUserId");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andModifyUserIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID >=", value, "modifyUserId");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andModifyUserIdLessThan(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID <", value, "modifyUserId");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andModifyUserIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID <=", value, "modifyUserId");
        return (SysPermitCfgCriteria) this;
    }
    
    public SysPermitCfgCriteria andModifyUserIdIn(List<java.lang.Long> values) {
        addCriterion("MODIFY_USER_ID in", values, "modifyUserId");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andModifyUserIdNotIn(List<java.lang.Long> values) {
        addCriterion("MODIFY_USER_ID not in", values, "modifyUserId");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andModifyUserIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("MODIFY_USER_ID between", value1, value2, "modifyUserId");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andModifyUserIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("MODIFY_USER_ID not between", value1, value2, "modifyUserId");
        return (SysPermitCfgCriteria) this;
    }
	public SysPermitCfgCriteria andModifyUserNameIsNull() {
        addCriterion("MODIFY_USER_NAME is null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andModifyUserNameIsNotNull() {
        addCriterion("MODIFY_USER_NAME is not null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andModifyUserNameEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME =", value, "modifyUserName");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andModifyUserNameNotEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME <>", value, "modifyUserName");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andModifyUserNameGreaterThan(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME >", value, "modifyUserName");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andModifyUserNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME >=", value, "modifyUserName");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andModifyUserNameLessThan(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME <", value, "modifyUserName");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andModifyUserNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME <=", value, "modifyUserName");
        return (SysPermitCfgCriteria) this;
    }
    
    public SysPermitCfgCriteria andModifyUserNameLike(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME like", value, "modifyUserName");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andModifyUserNameNotLike(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME not like", value, "modifyUserName");
        return (SysPermitCfgCriteria) this;
    }
    
    public SysPermitCfgCriteria andModifyUserNameIn(List<java.lang.String> values) {
        addCriterion("MODIFY_USER_NAME in", values, "modifyUserName");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andModifyUserNameNotIn(List<java.lang.String> values) {
        addCriterion("MODIFY_USER_NAME not in", values, "modifyUserName");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andModifyUserNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MODIFY_USER_NAME between", value1, value2, "modifyUserName");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andModifyUserNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MODIFY_USER_NAME not between", value1, value2, "modifyUserName");
        return (SysPermitCfgCriteria) this;
    }
	public SysPermitCfgCriteria andModifyTimeIsNull() {
        addCriterion("MODIFY_TIME is null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andModifyTimeIsNotNull() {
        addCriterion("MODIFY_TIME is not null");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andModifyTimeEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME =", value, "modifyTime");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andModifyTimeNotEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME <>", value, "modifyTime");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andModifyTimeGreaterThan(java.util.Date value) {
        addCriterion("MODIFY_TIME >", value, "modifyTime");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andModifyTimeGreaterThanOrEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME >=", value, "modifyTime");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andModifyTimeLessThan(java.util.Date value) {
        addCriterion("MODIFY_TIME <", value, "modifyTime");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andModifyTimeLessThanOrEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME <=", value, "modifyTime");
        return (SysPermitCfgCriteria) this;
    }
    
    public SysPermitCfgCriteria andModifyTimeIn(List<java.util.Date> values) {
        addCriterion("MODIFY_TIME in", values, "modifyTime");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andModifyTimeNotIn(List<java.util.Date> values) {
        addCriterion("MODIFY_TIME not in", values, "modifyTime");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andModifyTimeBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("MODIFY_TIME between", value1, value2, "modifyTime");
        return (SysPermitCfgCriteria) this;
    }

    public SysPermitCfgCriteria andModifyTimeNotBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("MODIFY_TIME not between", value1, value2, "modifyTime");
        return (SysPermitCfgCriteria) this;
    }
}

