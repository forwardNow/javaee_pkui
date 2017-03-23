package com.pkusoft.admin.model;

import java.util.List;

import com.pkusoft.framework.model.Criteria.BaseCriteria;

/**
 * 
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
	public SysDicListCriteria andDicStandardIsNull() {
        addCriterion("DIC_STANDARD is null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andDicStandardIsNotNull() {
        addCriterion("DIC_STANDARD is not null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andDicStandardEqualTo(java.lang.String value) {
        addCriterion("DIC_STANDARD =", value, "dicStandard");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andDicStandardNotEqualTo(java.lang.String value) {
        addCriterion("DIC_STANDARD <>", value, "dicStandard");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andDicStandardGreaterThan(java.lang.String value) {
        addCriterion("DIC_STANDARD >", value, "dicStandard");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andDicStandardGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("DIC_STANDARD >=", value, "dicStandard");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andDicStandardLessThan(java.lang.String value) {
        addCriterion("DIC_STANDARD <", value, "dicStandard");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andDicStandardLessThanOrEqualTo(java.lang.String value) {
        addCriterion("DIC_STANDARD <=", value, "dicStandard");
        return (SysDicListCriteria) this;
    }
    
    public SysDicListCriteria andDicStandardLike(java.lang.String value) {
        addCriterion("DIC_STANDARD like", value, "dicStandard");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andDicStandardNotLike(java.lang.String value) {
        addCriterion("DIC_STANDARD not like", value, "dicStandard");
        return (SysDicListCriteria) this;
    }
    
    public SysDicListCriteria andDicStandardIn(List<java.lang.String> values) {
        addCriterion("DIC_STANDARD in", values, "dicStandard");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andDicStandardNotIn(List<java.lang.String> values) {
        addCriterion("DIC_STANDARD not in", values, "dicStandard");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andDicStandardBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DIC_STANDARD between", value1, value2, "dicStandard");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andDicStandardNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DIC_STANDARD not between", value1, value2, "dicStandard");
        return (SysDicListCriteria) this;
    }
	public SysDicListCriteria andParentDicIsNull() {
        addCriterion("PARENT_DIC is null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andParentDicIsNotNull() {
        addCriterion("PARENT_DIC is not null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andParentDicEqualTo(java.lang.String value) {
        addCriterion("PARENT_DIC =", value, "parentDic");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andParentDicNotEqualTo(java.lang.String value) {
        addCriterion("PARENT_DIC <>", value, "parentDic");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andParentDicGreaterThan(java.lang.String value) {
        addCriterion("PARENT_DIC >", value, "parentDic");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andParentDicGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("PARENT_DIC >=", value, "parentDic");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andParentDicLessThan(java.lang.String value) {
        addCriterion("PARENT_DIC <", value, "parentDic");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andParentDicLessThanOrEqualTo(java.lang.String value) {
        addCriterion("PARENT_DIC <=", value, "parentDic");
        return (SysDicListCriteria) this;
    }
    
    public SysDicListCriteria andParentDicLike(java.lang.String value) {
        addCriterion("PARENT_DIC like", value, "parentDic");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andParentDicNotLike(java.lang.String value) {
        addCriterion("PARENT_DIC not like", value, "parentDic");
        return (SysDicListCriteria) this;
    }
    
    public SysDicListCriteria andParentDicIn(List<java.lang.String> values) {
        addCriterion("PARENT_DIC in", values, "parentDic");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andParentDicNotIn(List<java.lang.String> values) {
        addCriterion("PARENT_DIC not in", values, "parentDic");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andParentDicBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("PARENT_DIC between", value1, value2, "parentDic");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andParentDicNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("PARENT_DIC not between", value1, value2, "parentDic");
        return (SysDicListCriteria) this;
    }
    
	public SysDicListCriteria andOrderFlagIsNull() {
        addCriterion("ORDER_FLAG is null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andOrderFlagIsNotNull() {
        addCriterion("ORDER_FLAG is not null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andOrderFlagEqualTo(java.lang.Long value) {
        addCriterion("ORDER_FLAG =", value, "orderFlag");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andOrderFlagNotEqualTo(java.lang.Long value) {
        addCriterion("ORDER_FLAG <>", value, "orderFlag");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andOrderFlagGreaterThan(java.lang.Long value) {
        addCriterion("ORDER_FLAG >", value, "orderFlag");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andOrderFlagGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ORDER_FLAG >=", value, "orderFlag");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andOrderFlagLessThan(java.lang.Long value) {
        addCriterion("ORDER_FLAG <", value, "orderFlag");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andOrderFlagLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ORDER_FLAG <=", value, "orderFlag");
        return (SysDicListCriteria) this;
    }
    
    public SysDicListCriteria andOrderFlagIn(List<java.lang.Long> values) {
        addCriterion("ORDER_FLAG in", values, "orderFlag");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andOrderFlagNotIn(List<java.lang.Long> values) {
        addCriterion("ORDER_FLAG not in", values, "orderFlag");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andOrderFlagBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ORDER_FLAG between", value1, value2, "orderFlag");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andOrderFlagNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ORDER_FLAG not between", value1, value2, "orderFlag");
        return (SysDicListCriteria) this;
    }
	public SysDicListCriteria andEditableIsNull() {
        addCriterion("EDITABLE is null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andEditableIsNotNull() {
        addCriterion("EDITABLE is not null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andEditableEqualTo(java.lang.String value) {
        addCriterion("EDITABLE =", value, "editable");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andEditableNotEqualTo(java.lang.String value) {
        addCriterion("EDITABLE <>", value, "editable");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andEditableGreaterThan(java.lang.String value) {
        addCriterion("EDITABLE >", value, "editable");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andEditableGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("EDITABLE >=", value, "editable");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andEditableLessThan(java.lang.String value) {
        addCriterion("EDITABLE <", value, "editable");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andEditableLessThanOrEqualTo(java.lang.String value) {
        addCriterion("EDITABLE <=", value, "editable");
        return (SysDicListCriteria) this;
    }
    
    public SysDicListCriteria andEditableLike(java.lang.String value) {
        addCriterion("EDITABLE like", value, "editable");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andEditableNotLike(java.lang.String value) {
        addCriterion("EDITABLE not like", value, "editable");
        return (SysDicListCriteria) this;
    }
    
    public SysDicListCriteria andEditableIn(List<java.lang.String> values) {
        addCriterion("EDITABLE in", values, "editable");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andEditableNotIn(List<java.lang.String> values) {
        addCriterion("EDITABLE not in", values, "editable");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andEditableBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("EDITABLE between", value1, value2, "editable");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andEditableNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("EDITABLE not between", value1, value2, "editable");
        return (SysDicListCriteria) this;
    }
	public SysDicListCriteria andVisiableIsNull() {
        addCriterion("VISIABLE is null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andVisiableIsNotNull() {
        addCriterion("VISIABLE is not null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andVisiableEqualTo(java.lang.String value) {
        addCriterion("VISIABLE =", value, "visiable");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andVisiableNotEqualTo(java.lang.String value) {
        addCriterion("VISIABLE <>", value, "visiable");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andVisiableGreaterThan(java.lang.String value) {
        addCriterion("VISIABLE >", value, "visiable");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andVisiableGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("VISIABLE >=", value, "visiable");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andVisiableLessThan(java.lang.String value) {
        addCriterion("VISIABLE <", value, "visiable");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andVisiableLessThanOrEqualTo(java.lang.String value) {
        addCriterion("VISIABLE <=", value, "visiable");
        return (SysDicListCriteria) this;
    }
    
    public SysDicListCriteria andVisiableLike(java.lang.String value) {
        addCriterion("VISIABLE like", value, "visiable");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andVisiableNotLike(java.lang.String value) {
        addCriterion("VISIABLE not like", value, "visiable");
        return (SysDicListCriteria) this;
    }
    
    public SysDicListCriteria andVisiableIn(List<java.lang.String> values) {
        addCriterion("VISIABLE in", values, "visiable");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andVisiableNotIn(List<java.lang.String> values) {
        addCriterion("VISIABLE not in", values, "visiable");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andVisiableBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("VISIABLE between", value1, value2, "visiable");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andVisiableNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("VISIABLE not between", value1, value2, "visiable");
        return (SysDicListCriteria) this;
    }
	public SysDicListCriteria andMemoIsNull() {
        addCriterion("MEMO is null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andMemoIsNotNull() {
        addCriterion("MEMO is not null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andMemoEqualTo(java.lang.String value) {
        addCriterion("MEMO =", value, "memo");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andMemoNotEqualTo(java.lang.String value) {
        addCriterion("MEMO <>", value, "memo");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andMemoGreaterThan(java.lang.String value) {
        addCriterion("MEMO >", value, "memo");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andMemoGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("MEMO >=", value, "memo");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andMemoLessThan(java.lang.String value) {
        addCriterion("MEMO <", value, "memo");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andMemoLessThanOrEqualTo(java.lang.String value) {
        addCriterion("MEMO <=", value, "memo");
        return (SysDicListCriteria) this;
    }
    
    public SysDicListCriteria andMemoLike(java.lang.String value) {
        addCriterion("MEMO like", value, "memo");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andMemoNotLike(java.lang.String value) {
        addCriterion("MEMO not like", value, "memo");
        return (SysDicListCriteria) this;
    }
    
    public SysDicListCriteria andMemoIn(List<java.lang.String> values) {
        addCriterion("MEMO in", values, "memo");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andMemoNotIn(List<java.lang.String> values) {
        addCriterion("MEMO not in", values, "memo");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andMemoBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MEMO between", value1, value2, "memo");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andMemoNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MEMO not between", value1, value2, "memo");
        return (SysDicListCriteria) this;
    }
	public SysDicListCriteria andReserve1IsNull() {
        addCriterion("RESERVE1 is null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve1IsNotNull() {
        addCriterion("RESERVE1 is not null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve1EqualTo(java.lang.String value) {
        addCriterion("RESERVE1 =", value, "reserve1");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve1NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 <>", value, "reserve1");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve1GreaterThan(java.lang.String value) {
        addCriterion("RESERVE1 >", value, "reserve1");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve1GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 >=", value, "reserve1");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve1LessThan(java.lang.String value) {
        addCriterion("RESERVE1 <", value, "reserve1");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve1LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 <=", value, "reserve1");
        return (SysDicListCriteria) this;
    }
    
    public SysDicListCriteria andReserve1Like(java.lang.String value) {
        addCriterion("RESERVE1 like", value, "reserve1");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve1NotLike(java.lang.String value) {
        addCriterion("RESERVE1 not like", value, "reserve1");
        return (SysDicListCriteria) this;
    }
    
    public SysDicListCriteria andReserve1In(List<java.lang.String> values) {
        addCriterion("RESERVE1 in", values, "reserve1");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve1NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE1 not in", values, "reserve1");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve1Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE1 between", value1, value2, "reserve1");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve1NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE1 not between", value1, value2, "reserve1");
        return (SysDicListCriteria) this;
    }
	public SysDicListCriteria andReserve2IsNull() {
        addCriterion("RESERVE2 is null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve2IsNotNull() {
        addCriterion("RESERVE2 is not null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve2EqualTo(java.lang.String value) {
        addCriterion("RESERVE2 =", value, "reserve2");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve2NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 <>", value, "reserve2");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve2GreaterThan(java.lang.String value) {
        addCriterion("RESERVE2 >", value, "reserve2");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve2GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 >=", value, "reserve2");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve2LessThan(java.lang.String value) {
        addCriterion("RESERVE2 <", value, "reserve2");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve2LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 <=", value, "reserve2");
        return (SysDicListCriteria) this;
    }
    
    public SysDicListCriteria andReserve2Like(java.lang.String value) {
        addCriterion("RESERVE2 like", value, "reserve2");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve2NotLike(java.lang.String value) {
        addCriterion("RESERVE2 not like", value, "reserve2");
        return (SysDicListCriteria) this;
    }
    
    public SysDicListCriteria andReserve2In(List<java.lang.String> values) {
        addCriterion("RESERVE2 in", values, "reserve2");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve2NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE2 not in", values, "reserve2");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve2Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE2 between", value1, value2, "reserve2");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve2NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE2 not between", value1, value2, "reserve2");
        return (SysDicListCriteria) this;
    }
	public SysDicListCriteria andReserve3IsNull() {
        addCriterion("RESERVE3 is null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve3IsNotNull() {
        addCriterion("RESERVE3 is not null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve3EqualTo(java.lang.String value) {
        addCriterion("RESERVE3 =", value, "reserve3");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve3NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 <>", value, "reserve3");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve3GreaterThan(java.lang.String value) {
        addCriterion("RESERVE3 >", value, "reserve3");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve3GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 >=", value, "reserve3");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve3LessThan(java.lang.String value) {
        addCriterion("RESERVE3 <", value, "reserve3");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve3LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 <=", value, "reserve3");
        return (SysDicListCriteria) this;
    }
    
    public SysDicListCriteria andReserve3Like(java.lang.String value) {
        addCriterion("RESERVE3 like", value, "reserve3");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve3NotLike(java.lang.String value) {
        addCriterion("RESERVE3 not like", value, "reserve3");
        return (SysDicListCriteria) this;
    }
    
    public SysDicListCriteria andReserve3In(List<java.lang.String> values) {
        addCriterion("RESERVE3 in", values, "reserve3");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve3NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE3 not in", values, "reserve3");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve3Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE3 between", value1, value2, "reserve3");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve3NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE3 not between", value1, value2, "reserve3");
        return (SysDicListCriteria) this;
    }
	public SysDicListCriteria andReserve4IsNull() {
        addCriterion("RESERVE4 is null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve4IsNotNull() {
        addCriterion("RESERVE4 is not null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve4EqualTo(java.lang.String value) {
        addCriterion("RESERVE4 =", value, "reserve4");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve4NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 <>", value, "reserve4");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve4GreaterThan(java.lang.String value) {
        addCriterion("RESERVE4 >", value, "reserve4");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve4GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 >=", value, "reserve4");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve4LessThan(java.lang.String value) {
        addCriterion("RESERVE4 <", value, "reserve4");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve4LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 <=", value, "reserve4");
        return (SysDicListCriteria) this;
    }
    
    public SysDicListCriteria andReserve4Like(java.lang.String value) {
        addCriterion("RESERVE4 like", value, "reserve4");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve4NotLike(java.lang.String value) {
        addCriterion("RESERVE4 not like", value, "reserve4");
        return (SysDicListCriteria) this;
    }
    
    public SysDicListCriteria andReserve4In(List<java.lang.String> values) {
        addCriterion("RESERVE4 in", values, "reserve4");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve4NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE4 not in", values, "reserve4");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve4Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE4 between", value1, value2, "reserve4");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve4NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE4 not between", value1, value2, "reserve4");
        return (SysDicListCriteria) this;
    }
	public SysDicListCriteria andReserve5IsNull() {
        addCriterion("RESERVE5 is null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve5IsNotNull() {
        addCriterion("RESERVE5 is not null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve5EqualTo(java.lang.String value) {
        addCriterion("RESERVE5 =", value, "reserve5");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve5NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 <>", value, "reserve5");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve5GreaterThan(java.lang.String value) {
        addCriterion("RESERVE5 >", value, "reserve5");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve5GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 >=", value, "reserve5");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve5LessThan(java.lang.String value) {
        addCriterion("RESERVE5 <", value, "reserve5");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve5LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 <=", value, "reserve5");
        return (SysDicListCriteria) this;
    }
    
    public SysDicListCriteria andReserve5Like(java.lang.String value) {
        addCriterion("RESERVE5 like", value, "reserve5");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve5NotLike(java.lang.String value) {
        addCriterion("RESERVE5 not like", value, "reserve5");
        return (SysDicListCriteria) this;
    }
    
    public SysDicListCriteria andReserve5In(List<java.lang.String> values) {
        addCriterion("RESERVE5 in", values, "reserve5");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve5NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE5 not in", values, "reserve5");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve5Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE5 between", value1, value2, "reserve5");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andReserve5NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE5 not between", value1, value2, "reserve5");
        return (SysDicListCriteria) this;
    }
	public SysDicListCriteria andAddUserIdIsNull() {
        addCriterion("ADD_USER_ID is null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andAddUserIdIsNotNull() {
        addCriterion("ADD_USER_ID is not null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andAddUserIdEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID =", value, "addUserId");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andAddUserIdNotEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID <>", value, "addUserId");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andAddUserIdGreaterThan(java.lang.Long value) {
        addCriterion("ADD_USER_ID >", value, "addUserId");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andAddUserIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID >=", value, "addUserId");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andAddUserIdLessThan(java.lang.Long value) {
        addCriterion("ADD_USER_ID <", value, "addUserId");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andAddUserIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID <=", value, "addUserId");
        return (SysDicListCriteria) this;
    }
    
    public SysDicListCriteria andAddUserIdIn(List<java.lang.Long> values) {
        addCriterion("ADD_USER_ID in", values, "addUserId");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andAddUserIdNotIn(List<java.lang.Long> values) {
        addCriterion("ADD_USER_ID not in", values, "addUserId");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andAddUserIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ADD_USER_ID between", value1, value2, "addUserId");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andAddUserIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ADD_USER_ID not between", value1, value2, "addUserId");
        return (SysDicListCriteria) this;
    }
	public SysDicListCriteria andAddUserNameIsNull() {
        addCriterion("ADD_USER_NAME is null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andAddUserNameIsNotNull() {
        addCriterion("ADD_USER_NAME is not null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andAddUserNameEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME =", value, "addUserName");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andAddUserNameNotEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME <>", value, "addUserName");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andAddUserNameGreaterThan(java.lang.String value) {
        addCriterion("ADD_USER_NAME >", value, "addUserName");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andAddUserNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME >=", value, "addUserName");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andAddUserNameLessThan(java.lang.String value) {
        addCriterion("ADD_USER_NAME <", value, "addUserName");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andAddUserNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME <=", value, "addUserName");
        return (SysDicListCriteria) this;
    }
    
    public SysDicListCriteria andAddUserNameLike(java.lang.String value) {
        addCriterion("ADD_USER_NAME like", value, "addUserName");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andAddUserNameNotLike(java.lang.String value) {
        addCriterion("ADD_USER_NAME not like", value, "addUserName");
        return (SysDicListCriteria) this;
    }
    
    public SysDicListCriteria andAddUserNameIn(List<java.lang.String> values) {
        addCriterion("ADD_USER_NAME in", values, "addUserName");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andAddUserNameNotIn(List<java.lang.String> values) {
        addCriterion("ADD_USER_NAME not in", values, "addUserName");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andAddUserNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ADD_USER_NAME between", value1, value2, "addUserName");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andAddUserNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ADD_USER_NAME not between", value1, value2, "addUserName");
        return (SysDicListCriteria) this;
    }
	public SysDicListCriteria andAddTimeIsNull() {
        addCriterion("ADD_TIME is null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andAddTimeIsNotNull() {
        addCriterion("ADD_TIME is not null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andAddTimeEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME =", value, "addTime");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andAddTimeNotEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME <>", value, "addTime");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andAddTimeGreaterThan(java.util.Date value) {
        addCriterion("ADD_TIME >", value, "addTime");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andAddTimeGreaterThanOrEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME >=", value, "addTime");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andAddTimeLessThan(java.util.Date value) {
        addCriterion("ADD_TIME <", value, "addTime");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andAddTimeLessThanOrEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME <=", value, "addTime");
        return (SysDicListCriteria) this;
    }
    
    public SysDicListCriteria andAddTimeIn(List<java.util.Date> values) {
        addCriterion("ADD_TIME in", values, "addTime");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andAddTimeNotIn(List<java.util.Date> values) {
        addCriterion("ADD_TIME not in", values, "addTime");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andAddTimeBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("ADD_TIME between", value1, value2, "addTime");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andAddTimeNotBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("ADD_TIME not between", value1, value2, "addTime");
        return (SysDicListCriteria) this;
    }
	public SysDicListCriteria andModifyUserIdIsNull() {
        addCriterion("MODIFY_USER_ID is null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andModifyUserIdIsNotNull() {
        addCriterion("MODIFY_USER_ID is not null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andModifyUserIdEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID =", value, "modifyUserId");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andModifyUserIdNotEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID <>", value, "modifyUserId");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andModifyUserIdGreaterThan(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID >", value, "modifyUserId");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andModifyUserIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID >=", value, "modifyUserId");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andModifyUserIdLessThan(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID <", value, "modifyUserId");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andModifyUserIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID <=", value, "modifyUserId");
        return (SysDicListCriteria) this;
    }
    
    public SysDicListCriteria andModifyUserIdIn(List<java.lang.Long> values) {
        addCriterion("MODIFY_USER_ID in", values, "modifyUserId");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andModifyUserIdNotIn(List<java.lang.Long> values) {
        addCriterion("MODIFY_USER_ID not in", values, "modifyUserId");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andModifyUserIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("MODIFY_USER_ID between", value1, value2, "modifyUserId");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andModifyUserIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("MODIFY_USER_ID not between", value1, value2, "modifyUserId");
        return (SysDicListCriteria) this;
    }
	public SysDicListCriteria andModifyUserNameIsNull() {
        addCriterion("MODIFY_USER_NAME is null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andModifyUserNameIsNotNull() {
        addCriterion("MODIFY_USER_NAME is not null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andModifyUserNameEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME =", value, "modifyUserName");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andModifyUserNameNotEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME <>", value, "modifyUserName");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andModifyUserNameGreaterThan(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME >", value, "modifyUserName");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andModifyUserNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME >=", value, "modifyUserName");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andModifyUserNameLessThan(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME <", value, "modifyUserName");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andModifyUserNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME <=", value, "modifyUserName");
        return (SysDicListCriteria) this;
    }
    
    public SysDicListCriteria andModifyUserNameLike(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME like", value, "modifyUserName");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andModifyUserNameNotLike(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME not like", value, "modifyUserName");
        return (SysDicListCriteria) this;
    }
    
    public SysDicListCriteria andModifyUserNameIn(List<java.lang.String> values) {
        addCriterion("MODIFY_USER_NAME in", values, "modifyUserName");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andModifyUserNameNotIn(List<java.lang.String> values) {
        addCriterion("MODIFY_USER_NAME not in", values, "modifyUserName");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andModifyUserNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MODIFY_USER_NAME between", value1, value2, "modifyUserName");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andModifyUserNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MODIFY_USER_NAME not between", value1, value2, "modifyUserName");
        return (SysDicListCriteria) this;
    }
	public SysDicListCriteria andModifyTimeIsNull() {
        addCriterion("MODIFY_TIME is null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andModifyTimeIsNotNull() {
        addCriterion("MODIFY_TIME is not null");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andModifyTimeEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME =", value, "modifyTime");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andModifyTimeNotEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME <>", value, "modifyTime");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andModifyTimeGreaterThan(java.util.Date value) {
        addCriterion("MODIFY_TIME >", value, "modifyTime");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andModifyTimeGreaterThanOrEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME >=", value, "modifyTime");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andModifyTimeLessThan(java.util.Date value) {
        addCriterion("MODIFY_TIME <", value, "modifyTime");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andModifyTimeLessThanOrEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME <=", value, "modifyTime");
        return (SysDicListCriteria) this;
    }
    
    public SysDicListCriteria andModifyTimeIn(List<java.util.Date> values) {
        addCriterion("MODIFY_TIME in", values, "modifyTime");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andModifyTimeNotIn(List<java.util.Date> values) {
        addCriterion("MODIFY_TIME not in", values, "modifyTime");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andModifyTimeBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("MODIFY_TIME between", value1, value2, "modifyTime");
        return (SysDicListCriteria) this;
    }

    public SysDicListCriteria andModifyTimeNotBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("MODIFY_TIME not between", value1, value2, "modifyTime");
        return (SysDicListCriteria) this;
    }
}

