package com.pkusoft.admin.model;

import java.util.List;

import com.pkusoft.framework.model.Criteria.BaseCriteria;

/**
 * 
 * @author 
 */
public class SysDicItemCriteria extends BaseCriteria {
	public SysDicItemCriteria andModifyUserNameIsNull() {
        addCriterion("MODIFY_USER_NAME is null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andModifyUserNameIsNotNull() {
        addCriterion("MODIFY_USER_NAME is not null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andModifyUserNameEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME =", value, "modifyUserName");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andModifyUserNameNotEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME <>", value, "modifyUserName");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andModifyUserNameGreaterThan(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME >", value, "modifyUserName");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andModifyUserNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME >=", value, "modifyUserName");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andModifyUserNameLessThan(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME <", value, "modifyUserName");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andModifyUserNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME <=", value, "modifyUserName");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andModifyUserNameLike(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME like", value, "modifyUserName");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andModifyUserNameNotLike(java.lang.String value) {
        addCriterion("MODIFY_USER_NAME not like", value, "modifyUserName");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andModifyUserNameIn(List<java.lang.String> values) {
        addCriterion("MODIFY_USER_NAME in", values, "modifyUserName");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andModifyUserNameNotIn(List<java.lang.String> values) {
        addCriterion("MODIFY_USER_NAME not in", values, "modifyUserName");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andModifyUserNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MODIFY_USER_NAME between", value1, value2, "modifyUserName");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andModifyUserNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MODIFY_USER_NAME not between", value1, value2, "modifyUserName");
        return (SysDicItemCriteria) this;
    }
	public SysDicItemCriteria andModifyTimeIsNull() {
        addCriterion("MODIFY_TIME is null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andModifyTimeIsNotNull() {
        addCriterion("MODIFY_TIME is not null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andModifyTimeEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME =", value, "modifyTime");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andModifyTimeNotEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME <>", value, "modifyTime");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andModifyTimeGreaterThan(java.util.Date value) {
        addCriterion("MODIFY_TIME >", value, "modifyTime");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andModifyTimeGreaterThanOrEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME >=", value, "modifyTime");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andModifyTimeLessThan(java.util.Date value) {
        addCriterion("MODIFY_TIME <", value, "modifyTime");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andModifyTimeLessThanOrEqualTo(java.util.Date value) {
        addCriterion("MODIFY_TIME <=", value, "modifyTime");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andModifyTimeIn(List<java.util.Date> values) {
        addCriterion("MODIFY_TIME in", values, "modifyTime");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andModifyTimeNotIn(List<java.util.Date> values) {
        addCriterion("MODIFY_TIME not in", values, "modifyTime");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andModifyTimeBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("MODIFY_TIME between", value1, value2, "modifyTime");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andModifyTimeNotBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("MODIFY_TIME not between", value1, value2, "modifyTime");
        return (SysDicItemCriteria) this;
    }
	public SysDicItemCriteria andItemIdIsNull() {
        addCriterion("ITEM_ID is null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemIdIsNotNull() {
        addCriterion("ITEM_ID is not null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemIdEqualTo(java.lang.Long value) {
        addCriterion("ITEM_ID =", value, "itemId");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemIdNotEqualTo(java.lang.Long value) {
        addCriterion("ITEM_ID <>", value, "itemId");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemIdGreaterThan(java.lang.Long value) {
        addCriterion("ITEM_ID >", value, "itemId");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ITEM_ID >=", value, "itemId");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemIdLessThan(java.lang.Long value) {
        addCriterion("ITEM_ID <", value, "itemId");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ITEM_ID <=", value, "itemId");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andItemIdIn(List<java.lang.Long> values) {
        addCriterion("ITEM_ID in", values, "itemId");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemIdNotIn(List<java.lang.Long> values) {
        addCriterion("ITEM_ID not in", values, "itemId");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ITEM_ID between", value1, value2, "itemId");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ITEM_ID not between", value1, value2, "itemId");
        return (SysDicItemCriteria) this;
    }
	public SysDicItemCriteria andDicNameIsNull() {
        addCriterion("DIC_NAME is null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andDicNameIsNotNull() {
        addCriterion("DIC_NAME is not null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andDicNameEqualTo(java.lang.String value) {
        addCriterion("DIC_NAME =", value, "dicName");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andDicNameNotEqualTo(java.lang.String value) {
        addCriterion("DIC_NAME <>", value, "dicName");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andDicNameGreaterThan(java.lang.String value) {
        addCriterion("DIC_NAME >", value, "dicName");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andDicNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("DIC_NAME >=", value, "dicName");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andDicNameLessThan(java.lang.String value) {
        addCriterion("DIC_NAME <", value, "dicName");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andDicNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("DIC_NAME <=", value, "dicName");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andDicNameLike(java.lang.String value) {
        addCriterion("DIC_NAME like", value, "dicName");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andDicNameNotLike(java.lang.String value) {
        addCriterion("DIC_NAME not like", value, "dicName");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andDicNameIn(List<java.lang.String> values) {
        addCriterion("DIC_NAME in", values, "dicName");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andDicNameNotIn(List<java.lang.String> values) {
        addCriterion("DIC_NAME not in", values, "dicName");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andDicNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DIC_NAME between", value1, value2, "dicName");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andDicNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("DIC_NAME not between", value1, value2, "dicName");
        return (SysDicItemCriteria) this;
    }
	public SysDicItemCriteria andItemCodeIsNull() {
        addCriterion("ITEM_CODE is null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemCodeIsNotNull() {
        addCriterion("ITEM_CODE is not null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemCodeEqualTo(java.lang.String value) {
        addCriterion("ITEM_CODE =", value, "itemCode");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemCodeNotEqualTo(java.lang.String value) {
        addCriterion("ITEM_CODE <>", value, "itemCode");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemCodeGreaterThan(java.lang.String value) {
        addCriterion("ITEM_CODE >", value, "itemCode");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemCodeGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("ITEM_CODE >=", value, "itemCode");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemCodeLessThan(java.lang.String value) {
        addCriterion("ITEM_CODE <", value, "itemCode");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemCodeLessThanOrEqualTo(java.lang.String value) {
        addCriterion("ITEM_CODE <=", value, "itemCode");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andItemCodeLike(java.lang.String value) {
        addCriterion("ITEM_CODE like", value, "itemCode");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemCodeNotLike(java.lang.String value) {
        addCriterion("ITEM_CODE not like", value, "itemCode");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andItemCodeIn(List<java.lang.String> values) {
        addCriterion("ITEM_CODE in", values, "itemCode");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemCodeNotIn(List<java.lang.String> values) {
        addCriterion("ITEM_CODE not in", values, "itemCode");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemCodeBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ITEM_CODE between", value1, value2, "itemCode");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemCodeNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ITEM_CODE not between", value1, value2, "itemCode");
        return (SysDicItemCriteria) this;
    }
	public SysDicItemCriteria andItemValueIsNull() {
        addCriterion("ITEM_VALUE is null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemValueIsNotNull() {
        addCriterion("ITEM_VALUE is not null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemValueEqualTo(java.lang.String value) {
        addCriterion("ITEM_VALUE =", value, "itemValue");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemValueNotEqualTo(java.lang.String value) {
        addCriterion("ITEM_VALUE <>", value, "itemValue");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemValueGreaterThan(java.lang.String value) {
        addCriterion("ITEM_VALUE >", value, "itemValue");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemValueGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("ITEM_VALUE >=", value, "itemValue");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemValueLessThan(java.lang.String value) {
        addCriterion("ITEM_VALUE <", value, "itemValue");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemValueLessThanOrEqualTo(java.lang.String value) {
        addCriterion("ITEM_VALUE <=", value, "itemValue");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andItemValueLike(java.lang.String value) {
        addCriterion("ITEM_VALUE like", value, "itemValue");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemValueNotLike(java.lang.String value) {
        addCriterion("ITEM_VALUE not like", value, "itemValue");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andItemValueIn(List<java.lang.String> values) {
        addCriterion("ITEM_VALUE in", values, "itemValue");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemValueNotIn(List<java.lang.String> values) {
        addCriterion("ITEM_VALUE not in", values, "itemValue");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemValueBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ITEM_VALUE between", value1, value2, "itemValue");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemValueNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ITEM_VALUE not between", value1, value2, "itemValue");
        return (SysDicItemCriteria) this;
    }
	public SysDicItemCriteria andItemSpellIsNull() {
        addCriterion("ITEM_SPELL is null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemSpellIsNotNull() {
        addCriterion("ITEM_SPELL is not null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemSpellEqualTo(java.lang.String value) {
        addCriterion("ITEM_SPELL =", value, "itemSpell");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemSpellNotEqualTo(java.lang.String value) {
        addCriterion("ITEM_SPELL <>", value, "itemSpell");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemSpellGreaterThan(java.lang.String value) {
        addCriterion("ITEM_SPELL >", value, "itemSpell");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemSpellGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("ITEM_SPELL >=", value, "itemSpell");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemSpellLessThan(java.lang.String value) {
        addCriterion("ITEM_SPELL <", value, "itemSpell");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemSpellLessThanOrEqualTo(java.lang.String value) {
        addCriterion("ITEM_SPELL <=", value, "itemSpell");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andItemSpellLike(java.lang.String value) {
        addCriterion("ITEM_SPELL like", value, "itemSpell");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemSpellNotLike(java.lang.String value) {
        addCriterion("ITEM_SPELL not like", value, "itemSpell");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andItemSpellIn(List<java.lang.String> values) {
        addCriterion("ITEM_SPELL in", values, "itemSpell");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemSpellNotIn(List<java.lang.String> values) {
        addCriterion("ITEM_SPELL not in", values, "itemSpell");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemSpellBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ITEM_SPELL between", value1, value2, "itemSpell");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemSpellNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ITEM_SPELL not between", value1, value2, "itemSpell");
        return (SysDicItemCriteria) this;
    }
	public SysDicItemCriteria andItemAspellIsNull() {
        addCriterion("ITEM_ASPELL is null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemAspellIsNotNull() {
        addCriterion("ITEM_ASPELL is not null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemAspellEqualTo(java.lang.String value) {
        addCriterion("ITEM_ASPELL =", value, "itemAspell");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemAspellNotEqualTo(java.lang.String value) {
        addCriterion("ITEM_ASPELL <>", value, "itemAspell");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemAspellGreaterThan(java.lang.String value) {
        addCriterion("ITEM_ASPELL >", value, "itemAspell");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemAspellGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("ITEM_ASPELL >=", value, "itemAspell");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemAspellLessThan(java.lang.String value) {
        addCriterion("ITEM_ASPELL <", value, "itemAspell");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemAspellLessThanOrEqualTo(java.lang.String value) {
        addCriterion("ITEM_ASPELL <=", value, "itemAspell");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andItemAspellLike(java.lang.String value) {
        addCriterion("ITEM_ASPELL like", value, "itemAspell");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemAspellNotLike(java.lang.String value) {
        addCriterion("ITEM_ASPELL not like", value, "itemAspell");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andItemAspellIn(List<java.lang.String> values) {
        addCriterion("ITEM_ASPELL in", values, "itemAspell");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemAspellNotIn(List<java.lang.String> values) {
        addCriterion("ITEM_ASPELL not in", values, "itemAspell");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemAspellBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ITEM_ASPELL between", value1, value2, "itemAspell");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemAspellNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ITEM_ASPELL not between", value1, value2, "itemAspell");
        return (SysDicItemCriteria) this;
    }
	public SysDicItemCriteria andVisiableIsNull() {
        addCriterion("VISIABLE is null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andVisiableIsNotNull() {
        addCriterion("VISIABLE is not null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andVisiableEqualTo(java.lang.String value) {
        addCriterion("VISIABLE =", value, "visiable");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andVisiableNotEqualTo(java.lang.String value) {
        addCriterion("VISIABLE <>", value, "visiable");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andVisiableGreaterThan(java.lang.String value) {
        addCriterion("VISIABLE >", value, "visiable");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andVisiableGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("VISIABLE >=", value, "visiable");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andVisiableLessThan(java.lang.String value) {
        addCriterion("VISIABLE <", value, "visiable");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andVisiableLessThanOrEqualTo(java.lang.String value) {
        addCriterion("VISIABLE <=", value, "visiable");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andVisiableLike(java.lang.String value) {
        addCriterion("VISIABLE like", value, "visiable");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andVisiableNotLike(java.lang.String value) {
        addCriterion("VISIABLE not like", value, "visiable");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andVisiableIn(List<java.lang.String> values) {
        addCriterion("VISIABLE in", values, "visiable");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andVisiableNotIn(List<java.lang.String> values) {
        addCriterion("VISIABLE not in", values, "visiable");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andVisiableBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("VISIABLE between", value1, value2, "visiable");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andVisiableNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("VISIABLE not between", value1, value2, "visiable");
        return (SysDicItemCriteria) this;
    }
	public SysDicItemCriteria andOrderFlagIsNull() {
        addCriterion("ORDER_FLAG is null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andOrderFlagIsNotNull() {
        addCriterion("ORDER_FLAG is not null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andOrderFlagEqualTo(java.lang.Long value) {
        addCriterion("ORDER_FLAG =", value, "orderFlag");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andOrderFlagNotEqualTo(java.lang.Long value) {
        addCriterion("ORDER_FLAG <>", value, "orderFlag");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andOrderFlagGreaterThan(java.lang.Long value) {
        addCriterion("ORDER_FLAG >", value, "orderFlag");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andOrderFlagGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ORDER_FLAG >=", value, "orderFlag");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andOrderFlagLessThan(java.lang.Long value) {
        addCriterion("ORDER_FLAG <", value, "orderFlag");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andOrderFlagLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ORDER_FLAG <=", value, "orderFlag");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andOrderFlagIn(List<java.lang.Long> values) {
        addCriterion("ORDER_FLAG in", values, "orderFlag");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andOrderFlagNotIn(List<java.lang.Long> values) {
        addCriterion("ORDER_FLAG not in", values, "orderFlag");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andOrderFlagBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ORDER_FLAG between", value1, value2, "orderFlag");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andOrderFlagNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ORDER_FLAG not between", value1, value2, "orderFlag");
        return (SysDicItemCriteria) this;
    }
	public SysDicItemCriteria andMemoIsNull() {
        addCriterion("MEMO is null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andMemoIsNotNull() {
        addCriterion("MEMO is not null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andMemoEqualTo(java.lang.String value) {
        addCriterion("MEMO =", value, "memo");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andMemoNotEqualTo(java.lang.String value) {
        addCriterion("MEMO <>", value, "memo");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andMemoGreaterThan(java.lang.String value) {
        addCriterion("MEMO >", value, "memo");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andMemoGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("MEMO >=", value, "memo");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andMemoLessThan(java.lang.String value) {
        addCriterion("MEMO <", value, "memo");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andMemoLessThanOrEqualTo(java.lang.String value) {
        addCriterion("MEMO <=", value, "memo");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andMemoLike(java.lang.String value) {
        addCriterion("MEMO like", value, "memo");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andMemoNotLike(java.lang.String value) {
        addCriterion("MEMO not like", value, "memo");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andMemoIn(List<java.lang.String> values) {
        addCriterion("MEMO in", values, "memo");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andMemoNotIn(List<java.lang.String> values) {
        addCriterion("MEMO not in", values, "memo");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andMemoBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MEMO between", value1, value2, "memo");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andMemoNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MEMO not between", value1, value2, "memo");
        return (SysDicItemCriteria) this;
    }
	public SysDicItemCriteria andReserve1IsNull() {
        addCriterion("RESERVE1 is null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve1IsNotNull() {
        addCriterion("RESERVE1 is not null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve1EqualTo(java.lang.String value) {
        addCriterion("RESERVE1 =", value, "reserve1");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve1NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 <>", value, "reserve1");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve1GreaterThan(java.lang.String value) {
        addCriterion("RESERVE1 >", value, "reserve1");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve1GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 >=", value, "reserve1");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve1LessThan(java.lang.String value) {
        addCriterion("RESERVE1 <", value, "reserve1");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve1LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE1 <=", value, "reserve1");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andReserve1Like(java.lang.String value) {
        addCriterion("RESERVE1 like", value, "reserve1");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve1NotLike(java.lang.String value) {
        addCriterion("RESERVE1 not like", value, "reserve1");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andReserve1In(List<java.lang.String> values) {
        addCriterion("RESERVE1 in", values, "reserve1");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve1NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE1 not in", values, "reserve1");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve1Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE1 between", value1, value2, "reserve1");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve1NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE1 not between", value1, value2, "reserve1");
        return (SysDicItemCriteria) this;
    }
	public SysDicItemCriteria andReserve2IsNull() {
        addCriterion("RESERVE2 is null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve2IsNotNull() {
        addCriterion("RESERVE2 is not null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve2EqualTo(java.lang.String value) {
        addCriterion("RESERVE2 =", value, "reserve2");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve2NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 <>", value, "reserve2");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve2GreaterThan(java.lang.String value) {
        addCriterion("RESERVE2 >", value, "reserve2");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve2GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 >=", value, "reserve2");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve2LessThan(java.lang.String value) {
        addCriterion("RESERVE2 <", value, "reserve2");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve2LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE2 <=", value, "reserve2");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andReserve2Like(java.lang.String value) {
        addCriterion("RESERVE2 like", value, "reserve2");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve2NotLike(java.lang.String value) {
        addCriterion("RESERVE2 not like", value, "reserve2");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andReserve2In(List<java.lang.String> values) {
        addCriterion("RESERVE2 in", values, "reserve2");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve2NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE2 not in", values, "reserve2");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve2Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE2 between", value1, value2, "reserve2");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve2NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE2 not between", value1, value2, "reserve2");
        return (SysDicItemCriteria) this;
    }
	public SysDicItemCriteria andReserve3IsNull() {
        addCriterion("RESERVE3 is null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve3IsNotNull() {
        addCriterion("RESERVE3 is not null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve3EqualTo(java.lang.String value) {
        addCriterion("RESERVE3 =", value, "reserve3");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve3NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 <>", value, "reserve3");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve3GreaterThan(java.lang.String value) {
        addCriterion("RESERVE3 >", value, "reserve3");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve3GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 >=", value, "reserve3");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve3LessThan(java.lang.String value) {
        addCriterion("RESERVE3 <", value, "reserve3");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve3LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE3 <=", value, "reserve3");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andReserve3Like(java.lang.String value) {
        addCriterion("RESERVE3 like", value, "reserve3");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve3NotLike(java.lang.String value) {
        addCriterion("RESERVE3 not like", value, "reserve3");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andReserve3In(List<java.lang.String> values) {
        addCriterion("RESERVE3 in", values, "reserve3");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve3NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE3 not in", values, "reserve3");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve3Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE3 between", value1, value2, "reserve3");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve3NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE3 not between", value1, value2, "reserve3");
        return (SysDicItemCriteria) this;
    }
	public SysDicItemCriteria andReserve4IsNull() {
        addCriterion("RESERVE4 is null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve4IsNotNull() {
        addCriterion("RESERVE4 is not null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve4EqualTo(java.lang.String value) {
        addCriterion("RESERVE4 =", value, "reserve4");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve4NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 <>", value, "reserve4");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve4GreaterThan(java.lang.String value) {
        addCriterion("RESERVE4 >", value, "reserve4");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve4GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 >=", value, "reserve4");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve4LessThan(java.lang.String value) {
        addCriterion("RESERVE4 <", value, "reserve4");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve4LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE4 <=", value, "reserve4");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andReserve4Like(java.lang.String value) {
        addCriterion("RESERVE4 like", value, "reserve4");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve4NotLike(java.lang.String value) {
        addCriterion("RESERVE4 not like", value, "reserve4");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andReserve4In(List<java.lang.String> values) {
        addCriterion("RESERVE4 in", values, "reserve4");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve4NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE4 not in", values, "reserve4");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve4Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE4 between", value1, value2, "reserve4");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve4NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE4 not between", value1, value2, "reserve4");
        return (SysDicItemCriteria) this;
    }
	public SysDicItemCriteria andReserve5IsNull() {
        addCriterion("RESERVE5 is null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve5IsNotNull() {
        addCriterion("RESERVE5 is not null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve5EqualTo(java.lang.String value) {
        addCriterion("RESERVE5 =", value, "reserve5");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve5NotEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 <>", value, "reserve5");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve5GreaterThan(java.lang.String value) {
        addCriterion("RESERVE5 >", value, "reserve5");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve5GreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 >=", value, "reserve5");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve5LessThan(java.lang.String value) {
        addCriterion("RESERVE5 <", value, "reserve5");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve5LessThanOrEqualTo(java.lang.String value) {
        addCriterion("RESERVE5 <=", value, "reserve5");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andReserve5Like(java.lang.String value) {
        addCriterion("RESERVE5 like", value, "reserve5");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve5NotLike(java.lang.String value) {
        addCriterion("RESERVE5 not like", value, "reserve5");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andReserve5In(List<java.lang.String> values) {
        addCriterion("RESERVE5 in", values, "reserve5");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve5NotIn(List<java.lang.String> values) {
        addCriterion("RESERVE5 not in", values, "reserve5");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve5Between(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE5 between", value1, value2, "reserve5");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andReserve5NotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("RESERVE5 not between", value1, value2, "reserve5");
        return (SysDicItemCriteria) this;
    }
	public SysDicItemCriteria andAddUserIdIsNull() {
        addCriterion("ADD_USER_ID is null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andAddUserIdIsNotNull() {
        addCriterion("ADD_USER_ID is not null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andAddUserIdEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID =", value, "addUserId");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andAddUserIdNotEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID <>", value, "addUserId");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andAddUserIdGreaterThan(java.lang.Long value) {
        addCriterion("ADD_USER_ID >", value, "addUserId");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andAddUserIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID >=", value, "addUserId");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andAddUserIdLessThan(java.lang.Long value) {
        addCriterion("ADD_USER_ID <", value, "addUserId");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andAddUserIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ADD_USER_ID <=", value, "addUserId");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andAddUserIdIn(List<java.lang.Long> values) {
        addCriterion("ADD_USER_ID in", values, "addUserId");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andAddUserIdNotIn(List<java.lang.Long> values) {
        addCriterion("ADD_USER_ID not in", values, "addUserId");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andAddUserIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ADD_USER_ID between", value1, value2, "addUserId");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andAddUserIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ADD_USER_ID not between", value1, value2, "addUserId");
        return (SysDicItemCriteria) this;
    }
	public SysDicItemCriteria andAddUserNameIsNull() {
        addCriterion("ADD_USER_NAME is null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andAddUserNameIsNotNull() {
        addCriterion("ADD_USER_NAME is not null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andAddUserNameEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME =", value, "addUserName");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andAddUserNameNotEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME <>", value, "addUserName");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andAddUserNameGreaterThan(java.lang.String value) {
        addCriterion("ADD_USER_NAME >", value, "addUserName");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andAddUserNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME >=", value, "addUserName");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andAddUserNameLessThan(java.lang.String value) {
        addCriterion("ADD_USER_NAME <", value, "addUserName");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andAddUserNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("ADD_USER_NAME <=", value, "addUserName");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andAddUserNameLike(java.lang.String value) {
        addCriterion("ADD_USER_NAME like", value, "addUserName");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andAddUserNameNotLike(java.lang.String value) {
        addCriterion("ADD_USER_NAME not like", value, "addUserName");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andAddUserNameIn(List<java.lang.String> values) {
        addCriterion("ADD_USER_NAME in", values, "addUserName");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andAddUserNameNotIn(List<java.lang.String> values) {
        addCriterion("ADD_USER_NAME not in", values, "addUserName");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andAddUserNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ADD_USER_NAME between", value1, value2, "addUserName");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andAddUserNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ADD_USER_NAME not between", value1, value2, "addUserName");
        return (SysDicItemCriteria) this;
    }
	public SysDicItemCriteria andAddTimeIsNull() {
        addCriterion("ADD_TIME is null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andAddTimeIsNotNull() {
        addCriterion("ADD_TIME is not null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andAddTimeEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME =", value, "addTime");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andAddTimeNotEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME <>", value, "addTime");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andAddTimeGreaterThan(java.util.Date value) {
        addCriterion("ADD_TIME >", value, "addTime");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andAddTimeGreaterThanOrEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME >=", value, "addTime");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andAddTimeLessThan(java.util.Date value) {
        addCriterion("ADD_TIME <", value, "addTime");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andAddTimeLessThanOrEqualTo(java.util.Date value) {
        addCriterion("ADD_TIME <=", value, "addTime");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andAddTimeIn(List<java.util.Date> values) {
        addCriterion("ADD_TIME in", values, "addTime");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andAddTimeNotIn(List<java.util.Date> values) {
        addCriterion("ADD_TIME not in", values, "addTime");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andAddTimeBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("ADD_TIME between", value1, value2, "addTime");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andAddTimeNotBetween(java.util.Date value1, java.util.Date value2) {
        addCriterion("ADD_TIME not between", value1, value2, "addTime");
        return (SysDicItemCriteria) this;
    }
	public SysDicItemCriteria andModifyUserIdIsNull() {
        addCriterion("MODIFY_USER_ID is null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andModifyUserIdIsNotNull() {
        addCriterion("MODIFY_USER_ID is not null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andModifyUserIdEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID =", value, "modifyUserId");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andModifyUserIdNotEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID <>", value, "modifyUserId");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andModifyUserIdGreaterThan(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID >", value, "modifyUserId");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andModifyUserIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID >=", value, "modifyUserId");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andModifyUserIdLessThan(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID <", value, "modifyUserId");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andModifyUserIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("MODIFY_USER_ID <=", value, "modifyUserId");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andModifyUserIdIn(List<java.lang.Long> values) {
        addCriterion("MODIFY_USER_ID in", values, "modifyUserId");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andModifyUserIdNotIn(List<java.lang.Long> values) {
        addCriterion("MODIFY_USER_ID not in", values, "modifyUserId");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andModifyUserIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("MODIFY_USER_ID between", value1, value2, "modifyUserId");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andModifyUserIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("MODIFY_USER_ID not between", value1, value2, "modifyUserId");
        return (SysDicItemCriteria) this;
    }
}

