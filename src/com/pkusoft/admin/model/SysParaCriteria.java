package com.pkusoft.admin.model;

import java.util.List;

import com.pkusoft.framework.model.Criteria.BaseCriteria;

/**
 * 
 * @author 
 */
public class SysParaCriteria extends BaseCriteria {
	public SysParaCriteria andParaCodeIsNull() {
        addCriterion("PARA_CODE is null");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaCodeIsNotNull() {
        addCriterion("PARA_CODE is not null");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaCodeEqualTo(java.lang.String value) {
        addCriterion("PARA_CODE =", value, "paraCode");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaCodeNotEqualTo(java.lang.String value) {
        addCriterion("PARA_CODE <>", value, "paraCode");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaCodeGreaterThan(java.lang.String value) {
        addCriterion("PARA_CODE >", value, "paraCode");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaCodeGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("PARA_CODE >=", value, "paraCode");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaCodeLessThan(java.lang.String value) {
        addCriterion("PARA_CODE <", value, "paraCode");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaCodeLessThanOrEqualTo(java.lang.String value) {
        addCriterion("PARA_CODE <=", value, "paraCode");
        return (SysParaCriteria) this;
    }
    
    public SysParaCriteria andParaCodeLike(java.lang.String value) {
        addCriterion("PARA_CODE like", value, "paraCode");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaCodeNotLike(java.lang.String value) {
        addCriterion("PARA_CODE not like", value, "paraCode");
        return (SysParaCriteria) this;
    }
    
    public SysParaCriteria andParaCodeIn(List<java.lang.String> values) {
        addCriterion("PARA_CODE in", values, "paraCode");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaCodeNotIn(List<java.lang.String> values) {
        addCriterion("PARA_CODE not in", values, "paraCode");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaCodeBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("PARA_CODE between", value1, value2, "paraCode");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaCodeNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("PARA_CODE not between", value1, value2, "paraCode");
        return (SysParaCriteria) this;
    }
	public SysParaCriteria andParaNameIsNull() {
        addCriterion("PARA_NAME is null");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaNameIsNotNull() {
        addCriterion("PARA_NAME is not null");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaNameEqualTo(java.lang.String value) {
        addCriterion("PARA_NAME =", value, "paraName");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaNameNotEqualTo(java.lang.String value) {
        addCriterion("PARA_NAME <>", value, "paraName");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaNameGreaterThan(java.lang.String value) {
        addCriterion("PARA_NAME >", value, "paraName");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("PARA_NAME >=", value, "paraName");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaNameLessThan(java.lang.String value) {
        addCriterion("PARA_NAME <", value, "paraName");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("PARA_NAME <=", value, "paraName");
        return (SysParaCriteria) this;
    }
    
    public SysParaCriteria andParaNameLike(java.lang.String value) {
        addCriterion("PARA_NAME like", value, "paraName");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaNameNotLike(java.lang.String value) {
        addCriterion("PARA_NAME not like", value, "paraName");
        return (SysParaCriteria) this;
    }
    
    public SysParaCriteria andParaNameIn(List<java.lang.String> values) {
        addCriterion("PARA_NAME in", values, "paraName");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaNameNotIn(List<java.lang.String> values) {
        addCriterion("PARA_NAME not in", values, "paraName");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("PARA_NAME between", value1, value2, "paraName");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("PARA_NAME not between", value1, value2, "paraName");
        return (SysParaCriteria) this;
    }
	public SysParaCriteria andParaValueIsNull() {
        addCriterion("PARA_VALUE is null");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaValueIsNotNull() {
        addCriterion("PARA_VALUE is not null");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaValueEqualTo(java.lang.String value) {
        addCriterion("PARA_VALUE =", value, "paraValue");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaValueNotEqualTo(java.lang.String value) {
        addCriterion("PARA_VALUE <>", value, "paraValue");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaValueGreaterThan(java.lang.String value) {
        addCriterion("PARA_VALUE >", value, "paraValue");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaValueGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("PARA_VALUE >=", value, "paraValue");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaValueLessThan(java.lang.String value) {
        addCriterion("PARA_VALUE <", value, "paraValue");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaValueLessThanOrEqualTo(java.lang.String value) {
        addCriterion("PARA_VALUE <=", value, "paraValue");
        return (SysParaCriteria) this;
    }
    
    public SysParaCriteria andParaValueLike(java.lang.String value) {
        addCriterion("PARA_VALUE like", value, "paraValue");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaValueNotLike(java.lang.String value) {
        addCriterion("PARA_VALUE not like", value, "paraValue");
        return (SysParaCriteria) this;
    }
    
    public SysParaCriteria andParaValueIn(List<java.lang.String> values) {
        addCriterion("PARA_VALUE in", values, "paraValue");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaValueNotIn(List<java.lang.String> values) {
        addCriterion("PARA_VALUE not in", values, "paraValue");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaValueBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("PARA_VALUE between", value1, value2, "paraValue");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaValueNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("PARA_VALUE not between", value1, value2, "paraValue");
        return (SysParaCriteria) this;
    }
	public SysParaCriteria andParaDescIsNull() {
        addCriterion("PARA_DESC is null");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaDescIsNotNull() {
        addCriterion("PARA_DESC is not null");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaDescEqualTo(java.lang.String value) {
        addCriterion("PARA_DESC =", value, "paraDesc");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaDescNotEqualTo(java.lang.String value) {
        addCriterion("PARA_DESC <>", value, "paraDesc");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaDescGreaterThan(java.lang.String value) {
        addCriterion("PARA_DESC >", value, "paraDesc");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaDescGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("PARA_DESC >=", value, "paraDesc");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaDescLessThan(java.lang.String value) {
        addCriterion("PARA_DESC <", value, "paraDesc");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaDescLessThanOrEqualTo(java.lang.String value) {
        addCriterion("PARA_DESC <=", value, "paraDesc");
        return (SysParaCriteria) this;
    }
    
    public SysParaCriteria andParaDescLike(java.lang.String value) {
        addCriterion("PARA_DESC like", value, "paraDesc");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaDescNotLike(java.lang.String value) {
        addCriterion("PARA_DESC not like", value, "paraDesc");
        return (SysParaCriteria) this;
    }
    
    public SysParaCriteria andParaDescIn(List<java.lang.String> values) {
        addCriterion("PARA_DESC in", values, "paraDesc");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaDescNotIn(List<java.lang.String> values) {
        addCriterion("PARA_DESC not in", values, "paraDesc");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaDescBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("PARA_DESC between", value1, value2, "paraDesc");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andParaDescNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("PARA_DESC not between", value1, value2, "paraDesc");
        return (SysParaCriteria) this;
    }
	public SysParaCriteria andVisiableIsNull() {
        addCriterion("VISIABLE is null");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andVisiableIsNotNull() {
        addCriterion("VISIABLE is not null");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andVisiableEqualTo(java.lang.String value) {
        addCriterion("VISIABLE =", value, "visiable");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andVisiableNotEqualTo(java.lang.String value) {
        addCriterion("VISIABLE <>", value, "visiable");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andVisiableGreaterThan(java.lang.String value) {
        addCriterion("VISIABLE >", value, "visiable");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andVisiableGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("VISIABLE >=", value, "visiable");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andVisiableLessThan(java.lang.String value) {
        addCriterion("VISIABLE <", value, "visiable");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andVisiableLessThanOrEqualTo(java.lang.String value) {
        addCriterion("VISIABLE <=", value, "visiable");
        return (SysParaCriteria) this;
    }
    
    public SysParaCriteria andVisiableLike(java.lang.String value) {
        addCriterion("VISIABLE like", value, "visiable");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andVisiableNotLike(java.lang.String value) {
        addCriterion("VISIABLE not like", value, "visiable");
        return (SysParaCriteria) this;
    }
    
    public SysParaCriteria andVisiableIn(List<java.lang.String> values) {
        addCriterion("VISIABLE in", values, "visiable");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andVisiableNotIn(List<java.lang.String> values) {
        addCriterion("VISIABLE not in", values, "visiable");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andVisiableBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("VISIABLE between", value1, value2, "visiable");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andVisiableNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("VISIABLE not between", value1, value2, "visiable");
        return (SysParaCriteria) this;
    }
	public SysParaCriteria andReserve1IsNull() {
        addCriterion("RESERVE1 is null");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve1IsNotNull() {
        addCriterion("RESERVE1 is not null");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve1EqualTo(java.lang.String value) {
        addCriterion("RESERVE1 =", value, "reserve1");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve1NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 <>", value, "reserve1");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve1GreaterThan(java.lang.String value) {
        addCriterion("RESERVE1 >", value, "reserve1");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve1GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 >=", value, "reserve1");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve1LessThan(java.lang.String value) {
        addCriterion("RESERVE1 <", value, "reserve1");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve1LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 <=", value, "reserve1");
        return (SysParaCriteria) this;
    }
    
    public SysParaCriteria andReserve1Like(java.lang.String value) {
        addCriterion("RESERVE1 like", value, "reserve1");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve1NotLike(java.lang.String value) {
        addCriterion("RESERVE1 not like", value, "reserve1");
        return (SysParaCriteria) this;
    }
    
    public SysParaCriteria andReserve1In(List<java.lang.String> values) {
        addCriterion("RESERVE1 in", values, "reserve1");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve1NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE1 not in", values, "reserve1");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve1Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE1 between", value1, value2, "reserve1");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve1NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE1 not between", value1, value2, "reserve1");
        return (SysParaCriteria) this;
    }
	public SysParaCriteria andReserve2IsNull() {
        addCriterion("RESERVE2 is null");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve2IsNotNull() {
        addCriterion("RESERVE2 is not null");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve2EqualTo(java.lang.String value) {
        addCriterion("RESERVE2 =", value, "reserve2");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve2NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 <>", value, "reserve2");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve2GreaterThan(java.lang.String value) {
        addCriterion("RESERVE2 >", value, "reserve2");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve2GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 >=", value, "reserve2");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve2LessThan(java.lang.String value) {
        addCriterion("RESERVE2 <", value, "reserve2");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve2LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 <=", value, "reserve2");
        return (SysParaCriteria) this;
    }
    
    public SysParaCriteria andReserve2Like(java.lang.String value) {
        addCriterion("RESERVE2 like", value, "reserve2");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve2NotLike(java.lang.String value) {
        addCriterion("RESERVE2 not like", value, "reserve2");
        return (SysParaCriteria) this;
    }
    
    public SysParaCriteria andReserve2In(List<java.lang.String> values) {
        addCriterion("RESERVE2 in", values, "reserve2");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve2NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE2 not in", values, "reserve2");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve2Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE2 between", value1, value2, "reserve2");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve2NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE2 not between", value1, value2, "reserve2");
        return (SysParaCriteria) this;
    }
	public SysParaCriteria andReserve3IsNull() {
        addCriterion("RESERVE3 is null");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve3IsNotNull() {
        addCriterion("RESERVE3 is not null");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve3EqualTo(java.lang.String value) {
        addCriterion("RESERVE3 =", value, "reserve3");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve3NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 <>", value, "reserve3");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve3GreaterThan(java.lang.String value) {
        addCriterion("RESERVE3 >", value, "reserve3");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve3GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 >=", value, "reserve3");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve3LessThan(java.lang.String value) {
        addCriterion("RESERVE3 <", value, "reserve3");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve3LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 <=", value, "reserve3");
        return (SysParaCriteria) this;
    }
    
    public SysParaCriteria andReserve3Like(java.lang.String value) {
        addCriterion("RESERVE3 like", value, "reserve3");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve3NotLike(java.lang.String value) {
        addCriterion("RESERVE3 not like", value, "reserve3");
        return (SysParaCriteria) this;
    }
    
    public SysParaCriteria andReserve3In(List<java.lang.String> values) {
        addCriterion("RESERVE3 in", values, "reserve3");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve3NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE3 not in", values, "reserve3");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve3Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE3 between", value1, value2, "reserve3");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve3NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE3 not between", value1, value2, "reserve3");
        return (SysParaCriteria) this;
    }
	public SysParaCriteria andReserve4IsNull() {
        addCriterion("RESERVE4 is null");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve4IsNotNull() {
        addCriterion("RESERVE4 is not null");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve4EqualTo(java.lang.String value) {
        addCriterion("RESERVE4 =", value, "reserve4");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve4NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 <>", value, "reserve4");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve4GreaterThan(java.lang.String value) {
        addCriterion("RESERVE4 >", value, "reserve4");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve4GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 >=", value, "reserve4");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve4LessThan(java.lang.String value) {
        addCriterion("RESERVE4 <", value, "reserve4");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve4LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 <=", value, "reserve4");
        return (SysParaCriteria) this;
    }
    
    public SysParaCriteria andReserve4Like(java.lang.String value) {
        addCriterion("RESERVE4 like", value, "reserve4");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve4NotLike(java.lang.String value) {
        addCriterion("RESERVE4 not like", value, "reserve4");
        return (SysParaCriteria) this;
    }
    
    public SysParaCriteria andReserve4In(List<java.lang.String> values) {
        addCriterion("RESERVE4 in", values, "reserve4");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve4NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE4 not in", values, "reserve4");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve4Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE4 between", value1, value2, "reserve4");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve4NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE4 not between", value1, value2, "reserve4");
        return (SysParaCriteria) this;
    }
	public SysParaCriteria andReserve5IsNull() {
        addCriterion("RESERVE5 is null");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve5IsNotNull() {
        addCriterion("RESERVE5 is not null");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve5EqualTo(java.lang.String value) {
        addCriterion("RESERVE5 =", value, "reserve5");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve5NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 <>", value, "reserve5");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve5GreaterThan(java.lang.String value) {
        addCriterion("RESERVE5 >", value, "reserve5");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve5GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 >=", value, "reserve5");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve5LessThan(java.lang.String value) {
        addCriterion("RESERVE5 <", value, "reserve5");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve5LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 <=", value, "reserve5");
        return (SysParaCriteria) this;
    }
    
    public SysParaCriteria andReserve5Like(java.lang.String value) {
        addCriterion("RESERVE5 like", value, "reserve5");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve5NotLike(java.lang.String value) {
        addCriterion("RESERVE5 not like", value, "reserve5");
        return (SysParaCriteria) this;
    }
    
    public SysParaCriteria andReserve5In(List<java.lang.String> values) {
        addCriterion("RESERVE5 in", values, "reserve5");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve5NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE5 not in", values, "reserve5");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve5Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE5 between", value1, value2, "reserve5");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andReserve5NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE5 not between", value1, value2, "reserve5");
        return (SysParaCriteria) this;
    }
	public SysParaCriteria andAddUserIdIsNull() {
        addCriterion("ADD_USER_ID is null");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andAddUserIdIsNotNull() {
        addCriterion("ADD_USER_ID is not null");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andAddUserIdEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID =", value, "addUserId");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andAddUserIdNotEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID <>", value, "addUserId");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andAddUserIdGreaterThan(java.lang.Long value) {
        addCriterion("ADD_USER_ID >", value, "addUserId");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andAddUserIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID >=", value, "addUserId");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andAddUserIdLessThan(java.lang.Long value) {
        addCriterion("ADD_USER_ID <", value, "addUserId");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andAddUserIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID <=", value, "addUserId");
        return (SysParaCriteria) this;
    }
    
    public SysParaCriteria andAddUserIdIn(List<java.lang.Long> values) {
        addCriterion("ADD_USER_ID in", values, "addUserId");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andAddUserIdNotIn(List<java.lang.Long> values) {
        addCriterion("ADD_USER_ID not in", values, "addUserId");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andAddUserIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ADD_USER_ID between", value1, value2, "addUserId");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andAddUserIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ADD_USER_ID not between", value1, value2, "addUserId");
        return (SysParaCriteria) this;
    }
	public SysParaCriteria andAddUserNameIsNull() {
        addCriterion("ADD_USER_NAME is null");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andAddUserNameIsNotNull() {
        addCriterion("ADD_USER_NAME is not null");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andAddUserNameEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME =", value, "addUserName");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andAddUserNameNotEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME <>", value, "addUserName");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andAddUserNameGreaterThan(java.lang.String value) {
        addCriterion("ADD_USER_NAME >", value, "addUserName");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andAddUserNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME >=", value, "addUserName");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andAddUserNameLessThan(java.lang.String value) {
        addCriterion("ADD_USER_NAME <", value, "addUserName");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andAddUserNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME <=", value, "addUserName");
        return (SysParaCriteria) this;
    }
    
    public SysParaCriteria andAddUserNameLike(java.lang.String value) {
        addCriterion("ADD_USER_NAME like", value, "addUserName");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andAddUserNameNotLike(java.lang.String value) {
        addCriterion("ADD_USER_NAME not like", value, "addUserName");
        return (SysParaCriteria) this;
    }
    
    public SysParaCriteria andAddUserNameIn(List<java.lang.String> values) {
        addCriterion("ADD_USER_NAME in", values, "addUserName");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andAddUserNameNotIn(List<java.lang.String> values) {
        addCriterion("ADD_USER_NAME not in", values, "addUserName");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andAddUserNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ADD_USER_NAME between", value1, value2, "addUserName");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andAddUserNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ADD_USER_NAME not between", value1, value2, "addUserName");
        return (SysParaCriteria) this;
    }
	public SysParaCriteria andAddTimeIsNull() {
        addCriterion("ADD_TIME is null");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andAddTimeIsNotNull() {
        addCriterion("ADD_TIME is not null");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andAddTimeEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME =", value, "addTime");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andAddTimeNotEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME <>", value, "addTime");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andAddTimeGreaterThan(java.util.Date value) {
        addCriterion("ADD_TIME >", value, "addTime");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andAddTimeGreaterThanOrEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME >=", value, "addTime");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andAddTimeLessThan(java.util.Date value) {
        addCriterion("ADD_TIME <", value, "addTime");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andAddTimeLessThanOrEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME <=", value, "addTime");
        return (SysParaCriteria) this;
    }
    
    public SysParaCriteria andAddTimeIn(List<java.util.Date> values) {
        addCriterion("ADD_TIME in", values, "addTime");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andAddTimeNotIn(List<java.util.Date> values) {
        addCriterion("ADD_TIME not in", values, "addTime");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andAddTimeBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("ADD_TIME between", value1, value2, "addTime");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andAddTimeNotBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("ADD_TIME not between", value1, value2, "addTime");
        return (SysParaCriteria) this;
    }
	public SysParaCriteria andModifyUserIdIsNull() {
        addCriterion("MODIFY_USER_ID is null");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andModifyUserIdIsNotNull() {
        addCriterion("MODIFY_USER_ID is not null");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andModifyUserIdEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID =", value, "modifyUserId");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andModifyUserIdNotEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID <>", value, "modifyUserId");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andModifyUserIdGreaterThan(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID >", value, "modifyUserId");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andModifyUserIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID >=", value, "modifyUserId");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andModifyUserIdLessThan(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID <", value, "modifyUserId");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andModifyUserIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID <=", value, "modifyUserId");
        return (SysParaCriteria) this;
    }
    
    public SysParaCriteria andModifyUserIdIn(List<java.lang.Long> values) {
        addCriterion("MODIFY_USER_ID in", values, "modifyUserId");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andModifyUserIdNotIn(List<java.lang.Long> values) {
        addCriterion("MODIFY_USER_ID not in", values, "modifyUserId");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andModifyUserIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("MODIFY_USER_ID between", value1, value2, "modifyUserId");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andModifyUserIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("MODIFY_USER_ID not between", value1, value2, "modifyUserId");
        return (SysParaCriteria) this;
    }
	public SysParaCriteria andModifyUserNameIsNull() {
        addCriterion("MODIFY_USER_NAME is null");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andModifyUserNameIsNotNull() {
        addCriterion("MODIFY_USER_NAME is not null");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andModifyUserNameEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME =", value, "modifyUserName");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andModifyUserNameNotEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME <>", value, "modifyUserName");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andModifyUserNameGreaterThan(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME >", value, "modifyUserName");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andModifyUserNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME >=", value, "modifyUserName");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andModifyUserNameLessThan(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME <", value, "modifyUserName");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andModifyUserNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME <=", value, "modifyUserName");
        return (SysParaCriteria) this;
    }
    
    public SysParaCriteria andModifyUserNameLike(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME like", value, "modifyUserName");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andModifyUserNameNotLike(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME not like", value, "modifyUserName");
        return (SysParaCriteria) this;
    }
    
    public SysParaCriteria andModifyUserNameIn(List<java.lang.String> values) {
        addCriterion("MODIFY_USER_NAME in", values, "modifyUserName");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andModifyUserNameNotIn(List<java.lang.String> values) {
        addCriterion("MODIFY_USER_NAME not in", values, "modifyUserName");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andModifyUserNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MODIFY_USER_NAME between", value1, value2, "modifyUserName");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andModifyUserNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MODIFY_USER_NAME not between", value1, value2, "modifyUserName");
        return (SysParaCriteria) this;
    }
	public SysParaCriteria andModifyTimeIsNull() {
        addCriterion("MODIFY_TIME is null");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andModifyTimeIsNotNull() {
        addCriterion("MODIFY_TIME is not null");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andModifyTimeEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME =", value, "modifyTime");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andModifyTimeNotEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME <>", value, "modifyTime");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andModifyTimeGreaterThan(java.util.Date value) {
        addCriterion("MODIFY_TIME >", value, "modifyTime");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andModifyTimeGreaterThanOrEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME >=", value, "modifyTime");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andModifyTimeLessThan(java.util.Date value) {
        addCriterion("MODIFY_TIME <", value, "modifyTime");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andModifyTimeLessThanOrEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME <=", value, "modifyTime");
        return (SysParaCriteria) this;
    }
    
    public SysParaCriteria andModifyTimeIn(List<java.util.Date> values) {
        addCriterion("MODIFY_TIME in", values, "modifyTime");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andModifyTimeNotIn(List<java.util.Date> values) {
        addCriterion("MODIFY_TIME not in", values, "modifyTime");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andModifyTimeBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("MODIFY_TIME between", value1, value2, "modifyTime");
        return (SysParaCriteria) this;
    }

    public SysParaCriteria andModifyTimeNotBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("MODIFY_TIME not between", value1, value2, "modifyTime");
        return (SysParaCriteria) this;
    }
}

