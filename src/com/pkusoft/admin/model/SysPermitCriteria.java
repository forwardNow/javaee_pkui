package com.pkusoft.admin.model;

import java.util.List;

import com.pkusoft.framework.model.Criteria.BaseCriteria;

/**
 * 
 * @author 
 */
public class SysPermitCriteria extends BaseCriteria {
	public SysPermitCriteria andPermitIdIsNull() {
        addCriterion("PERMIT_ID is null");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitIdIsNotNull() {
        addCriterion("PERMIT_ID is not null");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitIdEqualTo(java.lang.Long value) {
        addCriterion("PERMIT_ID =", value, "permitId");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitIdNotEqualTo(java.lang.Long value) {
        addCriterion("PERMIT_ID <>", value, "permitId");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitIdGreaterThan(java.lang.Long value) {
        addCriterion("PERMIT_ID >", value, "permitId");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("PERMIT_ID >=", value, "permitId");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitIdLessThan(java.lang.Long value) {
        addCriterion("PERMIT_ID <", value, "permitId");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("PERMIT_ID <=", value, "permitId");
        return (SysPermitCriteria) this;
    }
    
    public SysPermitCriteria andPermitIdIn(List<java.lang.Long> values) {
        addCriterion("PERMIT_ID in", values, "permitId");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitIdNotIn(List<java.lang.Long> values) {
        addCriterion("PERMIT_ID not in", values, "permitId");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("PERMIT_ID between", value1, value2, "permitId");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("PERMIT_ID not between", value1, value2, "permitId");
        return (SysPermitCriteria) this;
    }
	public SysPermitCriteria andPermitNameIsNull() {
        addCriterion("PERMIT_NAME is null");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitNameIsNotNull() {
        addCriterion("PERMIT_NAME is not null");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitNameEqualTo(java.lang.String value) {
        addCriterion("PERMIT_NAME =", value, "permitName");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitNameNotEqualTo(java.lang.String value) {
        addCriterion("PERMIT_NAME <>", value, "permitName");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitNameGreaterThan(java.lang.String value) {
        addCriterion("PERMIT_NAME >", value, "permitName");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("PERMIT_NAME >=", value, "permitName");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitNameLessThan(java.lang.String value) {
        addCriterion("PERMIT_NAME <", value, "permitName");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("PERMIT_NAME <=", value, "permitName");
        return (SysPermitCriteria) this;
    }
    
    public SysPermitCriteria andPermitNameLike(java.lang.String value) {
        addCriterion("PERMIT_NAME like", value, "permitName");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitNameNotLike(java.lang.String value) {
        addCriterion("PERMIT_NAME not like", value, "permitName");
        return (SysPermitCriteria) this;
    }
    
    public SysPermitCriteria andPermitNameIn(List<java.lang.String> values) {
        addCriterion("PERMIT_NAME in", values, "permitName");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitNameNotIn(List<java.lang.String> values) {
        addCriterion("PERMIT_NAME not in", values, "permitName");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("PERMIT_NAME between", value1, value2, "permitName");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("PERMIT_NAME not between", value1, value2, "permitName");
        return (SysPermitCriteria) this;
    }
	public SysPermitCriteria andPermitCodeIsNull() {
        addCriterion("PERMIT_CODE is null");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitCodeIsNotNull() {
        addCriterion("PERMIT_CODE is not null");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitCodeEqualTo(java.lang.String value) {
        addCriterion("PERMIT_CODE =", value, "permitCode");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitCodeNotEqualTo(java.lang.String value) {
        addCriterion("PERMIT_CODE <>", value, "permitCode");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitCodeGreaterThan(java.lang.String value) {
        addCriterion("PERMIT_CODE >", value, "permitCode");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitCodeGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("PERMIT_CODE >=", value, "permitCode");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitCodeLessThan(java.lang.String value) {
        addCriterion("PERMIT_CODE <", value, "permitCode");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitCodeLessThanOrEqualTo(java.lang.String value) {
        addCriterion("PERMIT_CODE <=", value, "permitCode");
        return (SysPermitCriteria) this;
    }
    
    public SysPermitCriteria andPermitCodeLike(java.lang.String value) {
        addCriterion("PERMIT_CODE like", value, "permitCode");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitCodeNotLike(java.lang.String value) {
        addCriterion("PERMIT_CODE not like", value, "permitCode");
        return (SysPermitCriteria) this;
    }
    
    public SysPermitCriteria andPermitCodeIn(List<java.lang.String> values) {
        addCriterion("PERMIT_CODE in", values, "permitCode");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitCodeNotIn(List<java.lang.String> values) {
        addCriterion("PERMIT_CODE not in", values, "permitCode");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitCodeBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("PERMIT_CODE between", value1, value2, "permitCode");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitCodeNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("PERMIT_CODE not between", value1, value2, "permitCode");
        return (SysPermitCriteria) this;
    }
	public SysPermitCriteria andPermitValueIsNull() {
        addCriterion("PERMIT_VALUE is null");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitValueIsNotNull() {
        addCriterion("PERMIT_VALUE is not null");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitValueEqualTo(java.lang.String value) {
        addCriterion("PERMIT_VALUE =", value, "permitValue");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitValueNotEqualTo(java.lang.String value) {
        addCriterion("PERMIT_VALUE <>", value, "permitValue");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitValueGreaterThan(java.lang.String value) {
        addCriterion("PERMIT_VALUE >", value, "permitValue");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitValueGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("PERMIT_VALUE >=", value, "permitValue");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitValueLessThan(java.lang.String value) {
        addCriterion("PERMIT_VALUE <", value, "permitValue");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitValueLessThanOrEqualTo(java.lang.String value) {
        addCriterion("PERMIT_VALUE <=", value, "permitValue");
        return (SysPermitCriteria) this;
    }
    
    public SysPermitCriteria andPermitValueLike(java.lang.String value) {
        addCriterion("PERMIT_VALUE like", value, "permitValue");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitValueNotLike(java.lang.String value) {
        addCriterion("PERMIT_VALUE not like", value, "permitValue");
        return (SysPermitCriteria) this;
    }
    
    public SysPermitCriteria andPermitValueIn(List<java.lang.String> values) {
        addCriterion("PERMIT_VALUE in", values, "permitValue");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitValueNotIn(List<java.lang.String> values) {
        addCriterion("PERMIT_VALUE not in", values, "permitValue");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitValueBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("PERMIT_VALUE between", value1, value2, "permitValue");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitValueNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("PERMIT_VALUE not between", value1, value2, "permitValue");
        return (SysPermitCriteria) this;
    }
	public SysPermitCriteria andPermitDescIsNull() {
        addCriterion("PERMIT_DESC is null");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitDescIsNotNull() {
        addCriterion("PERMIT_DESC is not null");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitDescEqualTo(java.lang.String value) {
        addCriterion("PERMIT_DESC =", value, "permitDesc");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitDescNotEqualTo(java.lang.String value) {
        addCriterion("PERMIT_DESC <>", value, "permitDesc");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitDescGreaterThan(java.lang.String value) {
        addCriterion("PERMIT_DESC >", value, "permitDesc");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitDescGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("PERMIT_DESC >=", value, "permitDesc");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitDescLessThan(java.lang.String value) {
        addCriterion("PERMIT_DESC <", value, "permitDesc");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitDescLessThanOrEqualTo(java.lang.String value) {
        addCriterion("PERMIT_DESC <=", value, "permitDesc");
        return (SysPermitCriteria) this;
    }
    
    public SysPermitCriteria andPermitDescLike(java.lang.String value) {
        addCriterion("PERMIT_DESC like", value, "permitDesc");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitDescNotLike(java.lang.String value) {
        addCriterion("PERMIT_DESC not like", value, "permitDesc");
        return (SysPermitCriteria) this;
    }
    
    public SysPermitCriteria andPermitDescIn(List<java.lang.String> values) {
        addCriterion("PERMIT_DESC in", values, "permitDesc");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitDescNotIn(List<java.lang.String> values) {
        addCriterion("PERMIT_DESC not in", values, "permitDesc");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitDescBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("PERMIT_DESC between", value1, value2, "permitDesc");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andPermitDescNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("PERMIT_DESC not between", value1, value2, "permitDesc");
        return (SysPermitCriteria) this;
    }
	public SysPermitCriteria andOrderFlagIsNull() {
        addCriterion("ORDER_FLAG is null");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andOrderFlagIsNotNull() {
        addCriterion("ORDER_FLAG is not null");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andOrderFlagEqualTo(java.lang.Long value) {
        addCriterion("ORDER_FLAG =", value, "orderFlag");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andOrderFlagNotEqualTo(java.lang.Long value) {
        addCriterion("ORDER_FLAG <>", value, "orderFlag");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andOrderFlagGreaterThan(java.lang.Long value) {
        addCriterion("ORDER_FLAG >", value, "orderFlag");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andOrderFlagGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ORDER_FLAG >=", value, "orderFlag");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andOrderFlagLessThan(java.lang.Long value) {
        addCriterion("ORDER_FLAG <", value, "orderFlag");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andOrderFlagLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ORDER_FLAG <=", value, "orderFlag");
        return (SysPermitCriteria) this;
    }
    
    public SysPermitCriteria andOrderFlagIn(List<java.lang.Long> values) {
        addCriterion("ORDER_FLAG in", values, "orderFlag");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andOrderFlagNotIn(List<java.lang.Long> values) {
        addCriterion("ORDER_FLAG not in", values, "orderFlag");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andOrderFlagBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ORDER_FLAG between", value1, value2, "orderFlag");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andOrderFlagNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ORDER_FLAG not between", value1, value2, "orderFlag");
        return (SysPermitCriteria) this;
    }
	public SysPermitCriteria andReserve1IsNull() {
        addCriterion("RESERVE1 is null");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve1IsNotNull() {
        addCriterion("RESERVE1 is not null");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve1EqualTo(java.lang.String value) {
        addCriterion("RESERVE1 =", value, "reserve1");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve1NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 <>", value, "reserve1");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve1GreaterThan(java.lang.String value) {
        addCriterion("RESERVE1 >", value, "reserve1");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve1GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 >=", value, "reserve1");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve1LessThan(java.lang.String value) {
        addCriterion("RESERVE1 <", value, "reserve1");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve1LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 <=", value, "reserve1");
        return (SysPermitCriteria) this;
    }
    
    public SysPermitCriteria andReserve1Like(java.lang.String value) {
        addCriterion("RESERVE1 like", value, "reserve1");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve1NotLike(java.lang.String value) {
        addCriterion("RESERVE1 not like", value, "reserve1");
        return (SysPermitCriteria) this;
    }
    
    public SysPermitCriteria andReserve1In(List<java.lang.String> values) {
        addCriterion("RESERVE1 in", values, "reserve1");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve1NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE1 not in", values, "reserve1");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve1Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE1 between", value1, value2, "reserve1");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve1NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE1 not between", value1, value2, "reserve1");
        return (SysPermitCriteria) this;
    }
	public SysPermitCriteria andReserve2IsNull() {
        addCriterion("RESERVE2 is null");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve2IsNotNull() {
        addCriterion("RESERVE2 is not null");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve2EqualTo(java.lang.String value) {
        addCriterion("RESERVE2 =", value, "reserve2");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve2NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 <>", value, "reserve2");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve2GreaterThan(java.lang.String value) {
        addCriterion("RESERVE2 >", value, "reserve2");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve2GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 >=", value, "reserve2");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve2LessThan(java.lang.String value) {
        addCriterion("RESERVE2 <", value, "reserve2");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve2LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 <=", value, "reserve2");
        return (SysPermitCriteria) this;
    }
    
    public SysPermitCriteria andReserve2Like(java.lang.String value) {
        addCriterion("RESERVE2 like", value, "reserve2");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve2NotLike(java.lang.String value) {
        addCriterion("RESERVE2 not like", value, "reserve2");
        return (SysPermitCriteria) this;
    }
    
    public SysPermitCriteria andReserve2In(List<java.lang.String> values) {
        addCriterion("RESERVE2 in", values, "reserve2");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve2NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE2 not in", values, "reserve2");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve2Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE2 between", value1, value2, "reserve2");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve2NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE2 not between", value1, value2, "reserve2");
        return (SysPermitCriteria) this;
    }
	public SysPermitCriteria andReserve3IsNull() {
        addCriterion("RESERVE3 is null");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve3IsNotNull() {
        addCriterion("RESERVE3 is not null");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve3EqualTo(java.lang.String value) {
        addCriterion("RESERVE3 =", value, "reserve3");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve3NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 <>", value, "reserve3");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve3GreaterThan(java.lang.String value) {
        addCriterion("RESERVE3 >", value, "reserve3");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve3GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 >=", value, "reserve3");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve3LessThan(java.lang.String value) {
        addCriterion("RESERVE3 <", value, "reserve3");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve3LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 <=", value, "reserve3");
        return (SysPermitCriteria) this;
    }
    
    public SysPermitCriteria andReserve3Like(java.lang.String value) {
        addCriterion("RESERVE3 like", value, "reserve3");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve3NotLike(java.lang.String value) {
        addCriterion("RESERVE3 not like", value, "reserve3");
        return (SysPermitCriteria) this;
    }
    
    public SysPermitCriteria andReserve3In(List<java.lang.String> values) {
        addCriterion("RESERVE3 in", values, "reserve3");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve3NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE3 not in", values, "reserve3");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve3Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE3 between", value1, value2, "reserve3");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve3NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE3 not between", value1, value2, "reserve3");
        return (SysPermitCriteria) this;
    }
	public SysPermitCriteria andReserve4IsNull() {
        addCriterion("RESERVE4 is null");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve4IsNotNull() {
        addCriterion("RESERVE4 is not null");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve4EqualTo(java.lang.String value) {
        addCriterion("RESERVE4 =", value, "reserve4");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve4NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 <>", value, "reserve4");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve4GreaterThan(java.lang.String value) {
        addCriterion("RESERVE4 >", value, "reserve4");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve4GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 >=", value, "reserve4");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve4LessThan(java.lang.String value) {
        addCriterion("RESERVE4 <", value, "reserve4");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve4LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 <=", value, "reserve4");
        return (SysPermitCriteria) this;
    }
    
    public SysPermitCriteria andReserve4Like(java.lang.String value) {
        addCriterion("RESERVE4 like", value, "reserve4");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve4NotLike(java.lang.String value) {
        addCriterion("RESERVE4 not like", value, "reserve4");
        return (SysPermitCriteria) this;
    }
    
    public SysPermitCriteria andReserve4In(List<java.lang.String> values) {
        addCriterion("RESERVE4 in", values, "reserve4");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve4NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE4 not in", values, "reserve4");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve4Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE4 between", value1, value2, "reserve4");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve4NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE4 not between", value1, value2, "reserve4");
        return (SysPermitCriteria) this;
    }
	public SysPermitCriteria andReserve5IsNull() {
        addCriterion("RESERVE5 is null");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve5IsNotNull() {
        addCriterion("RESERVE5 is not null");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve5EqualTo(java.lang.String value) {
        addCriterion("RESERVE5 =", value, "reserve5");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve5NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 <>", value, "reserve5");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve5GreaterThan(java.lang.String value) {
        addCriterion("RESERVE5 >", value, "reserve5");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve5GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 >=", value, "reserve5");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve5LessThan(java.lang.String value) {
        addCriterion("RESERVE5 <", value, "reserve5");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve5LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 <=", value, "reserve5");
        return (SysPermitCriteria) this;
    }
    
    public SysPermitCriteria andReserve5Like(java.lang.String value) {
        addCriterion("RESERVE5 like", value, "reserve5");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve5NotLike(java.lang.String value) {
        addCriterion("RESERVE5 not like", value, "reserve5");
        return (SysPermitCriteria) this;
    }
    
    public SysPermitCriteria andReserve5In(List<java.lang.String> values) {
        addCriterion("RESERVE5 in", values, "reserve5");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve5NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE5 not in", values, "reserve5");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve5Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE5 between", value1, value2, "reserve5");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andReserve5NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE5 not between", value1, value2, "reserve5");
        return (SysPermitCriteria) this;
    }
	public SysPermitCriteria andAddUserIdIsNull() {
        addCriterion("ADD_USER_ID is null");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andAddUserIdIsNotNull() {
        addCriterion("ADD_USER_ID is not null");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andAddUserIdEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID =", value, "addUserId");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andAddUserIdNotEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID <>", value, "addUserId");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andAddUserIdGreaterThan(java.lang.Long value) {
        addCriterion("ADD_USER_ID >", value, "addUserId");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andAddUserIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID >=", value, "addUserId");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andAddUserIdLessThan(java.lang.Long value) {
        addCriterion("ADD_USER_ID <", value, "addUserId");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andAddUserIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID <=", value, "addUserId");
        return (SysPermitCriteria) this;
    }
    
    public SysPermitCriteria andAddUserIdIn(List<java.lang.Long> values) {
        addCriterion("ADD_USER_ID in", values, "addUserId");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andAddUserIdNotIn(List<java.lang.Long> values) {
        addCriterion("ADD_USER_ID not in", values, "addUserId");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andAddUserIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ADD_USER_ID between", value1, value2, "addUserId");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andAddUserIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ADD_USER_ID not between", value1, value2, "addUserId");
        return (SysPermitCriteria) this;
    }
	public SysPermitCriteria andAddUserNameIsNull() {
        addCriterion("ADD_USER_NAME is null");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andAddUserNameIsNotNull() {
        addCriterion("ADD_USER_NAME is not null");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andAddUserNameEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME =", value, "addUserName");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andAddUserNameNotEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME <>", value, "addUserName");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andAddUserNameGreaterThan(java.lang.String value) {
        addCriterion("ADD_USER_NAME >", value, "addUserName");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andAddUserNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME >=", value, "addUserName");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andAddUserNameLessThan(java.lang.String value) {
        addCriterion("ADD_USER_NAME <", value, "addUserName");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andAddUserNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME <=", value, "addUserName");
        return (SysPermitCriteria) this;
    }
    
    public SysPermitCriteria andAddUserNameLike(java.lang.String value) {
        addCriterion("ADD_USER_NAME like", value, "addUserName");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andAddUserNameNotLike(java.lang.String value) {
        addCriterion("ADD_USER_NAME not like", value, "addUserName");
        return (SysPermitCriteria) this;
    }
    
    public SysPermitCriteria andAddUserNameIn(List<java.lang.String> values) {
        addCriterion("ADD_USER_NAME in", values, "addUserName");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andAddUserNameNotIn(List<java.lang.String> values) {
        addCriterion("ADD_USER_NAME not in", values, "addUserName");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andAddUserNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ADD_USER_NAME between", value1, value2, "addUserName");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andAddUserNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ADD_USER_NAME not between", value1, value2, "addUserName");
        return (SysPermitCriteria) this;
    }
	public SysPermitCriteria andAddTimeIsNull() {
        addCriterion("ADD_TIME is null");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andAddTimeIsNotNull() {
        addCriterion("ADD_TIME is not null");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andAddTimeEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME =", value, "addTime");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andAddTimeNotEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME <>", value, "addTime");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andAddTimeGreaterThan(java.util.Date value) {
        addCriterion("ADD_TIME >", value, "addTime");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andAddTimeGreaterThanOrEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME >=", value, "addTime");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andAddTimeLessThan(java.util.Date value) {
        addCriterion("ADD_TIME <", value, "addTime");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andAddTimeLessThanOrEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME <=", value, "addTime");
        return (SysPermitCriteria) this;
    }
    
    public SysPermitCriteria andAddTimeIn(List<java.util.Date> values) {
        addCriterion("ADD_TIME in", values, "addTime");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andAddTimeNotIn(List<java.util.Date> values) {
        addCriterion("ADD_TIME not in", values, "addTime");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andAddTimeBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("ADD_TIME between", value1, value2, "addTime");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andAddTimeNotBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("ADD_TIME not between", value1, value2, "addTime");
        return (SysPermitCriteria) this;
    }
	public SysPermitCriteria andModifyUserIdIsNull() {
        addCriterion("MODIFY_USER_ID is null");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andModifyUserIdIsNotNull() {
        addCriterion("MODIFY_USER_ID is not null");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andModifyUserIdEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID =", value, "modifyUserId");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andModifyUserIdNotEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID <>", value, "modifyUserId");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andModifyUserIdGreaterThan(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID >", value, "modifyUserId");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andModifyUserIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID >=", value, "modifyUserId");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andModifyUserIdLessThan(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID <", value, "modifyUserId");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andModifyUserIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID <=", value, "modifyUserId");
        return (SysPermitCriteria) this;
    }
    
    public SysPermitCriteria andModifyUserIdIn(List<java.lang.Long> values) {
        addCriterion("MODIFY_USER_ID in", values, "modifyUserId");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andModifyUserIdNotIn(List<java.lang.Long> values) {
        addCriterion("MODIFY_USER_ID not in", values, "modifyUserId");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andModifyUserIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("MODIFY_USER_ID between", value1, value2, "modifyUserId");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andModifyUserIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("MODIFY_USER_ID not between", value1, value2, "modifyUserId");
        return (SysPermitCriteria) this;
    }
	public SysPermitCriteria andModifyUserNameIsNull() {
        addCriterion("MODIFY_USER_NAME is null");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andModifyUserNameIsNotNull() {
        addCriterion("MODIFY_USER_NAME is not null");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andModifyUserNameEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME =", value, "modifyUserName");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andModifyUserNameNotEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME <>", value, "modifyUserName");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andModifyUserNameGreaterThan(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME >", value, "modifyUserName");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andModifyUserNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME >=", value, "modifyUserName");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andModifyUserNameLessThan(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME <", value, "modifyUserName");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andModifyUserNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME <=", value, "modifyUserName");
        return (SysPermitCriteria) this;
    }
    
    public SysPermitCriteria andModifyUserNameLike(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME like", value, "modifyUserName");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andModifyUserNameNotLike(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME not like", value, "modifyUserName");
        return (SysPermitCriteria) this;
    }
    
    public SysPermitCriteria andModifyUserNameIn(List<java.lang.String> values) {
        addCriterion("MODIFY_USER_NAME in", values, "modifyUserName");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andModifyUserNameNotIn(List<java.lang.String> values) {
        addCriterion("MODIFY_USER_NAME not in", values, "modifyUserName");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andModifyUserNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MODIFY_USER_NAME between", value1, value2, "modifyUserName");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andModifyUserNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MODIFY_USER_NAME not between", value1, value2, "modifyUserName");
        return (SysPermitCriteria) this;
    }
	public SysPermitCriteria andModifyTimeIsNull() {
        addCriterion("MODIFY_TIME is null");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andModifyTimeIsNotNull() {
        addCriterion("MODIFY_TIME is not null");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andModifyTimeEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME =", value, "modifyTime");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andModifyTimeNotEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME <>", value, "modifyTime");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andModifyTimeGreaterThan(java.util.Date value) {
        addCriterion("MODIFY_TIME >", value, "modifyTime");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andModifyTimeGreaterThanOrEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME >=", value, "modifyTime");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andModifyTimeLessThan(java.util.Date value) {
        addCriterion("MODIFY_TIME <", value, "modifyTime");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andModifyTimeLessThanOrEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME <=", value, "modifyTime");
        return (SysPermitCriteria) this;
    }
    
    public SysPermitCriteria andModifyTimeIn(List<java.util.Date> values) {
        addCriterion("MODIFY_TIME in", values, "modifyTime");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andModifyTimeNotIn(List<java.util.Date> values) {
        addCriterion("MODIFY_TIME not in", values, "modifyTime");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andModifyTimeBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("MODIFY_TIME between", value1, value2, "modifyTime");
        return (SysPermitCriteria) this;
    }

    public SysPermitCriteria andModifyTimeNotBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("MODIFY_TIME not between", value1, value2, "modifyTime");
        return (SysPermitCriteria) this;
    }
}

