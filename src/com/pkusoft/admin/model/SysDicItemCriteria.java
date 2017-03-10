package com.pkusoft.admin.model;

import java.util.List;

import com.pkusoft.framework.model.Criteria.BaseCriteria;

/**
 * 系统字典条目查询标准
 * @author 
 */
public class SysDicItemCriteria extends BaseCriteria {
	public SysDicItemCriteria andItemIdIsNull() {
        addCriterion("ITEM_ID is null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemIdIsNotNull() {
        addCriterion("ITEM_ID is not null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemIdEqualTo(java.lang.Integer value) {
        addCriterion("ITEM_ID =", value, "itemId");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemIdNotEqualTo(java.lang.Integer value) {
        addCriterion("ITEM_ID <>", value, "itemId");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemIdGreaterThan(java.lang.Integer value) {
        addCriterion("ITEM_ID >", value, "itemId");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemIdGreaterThanOrEqualTo(java.lang.Integer value) {
        addCriterion("ITEM_ID >=", value, "itemId");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemIdLessThan(java.lang.Integer value) {
        addCriterion("ITEM_ID <", value, "itemId");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemIdLessThanOrEqualTo(java.lang.Integer value) {
        addCriterion("ITEM_ID <=", value, "itemId");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andItemIdIn(List<java.lang.Integer> values) {
        addCriterion("ITEM_ID in", values, "itemId");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemIdNotIn(List<java.lang.Integer> values) {
        addCriterion("ITEM_ID not in", values, "itemId");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemIdBetween(java.lang.Integer value1, java.lang.Integer value2) {
        addCriterion("ITEM_ID between", value1, value2, "itemId");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andItemIdNotBetween(java.lang.Integer value1, java.lang.Integer value2) {
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
	public SysDicItemCriteria andVisibleIsNull() {
        addCriterion("VISIBLE is null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andVisibleIsNotNull() {
        addCriterion("VISIBLE is not null");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andVisibleEqualTo(java.lang.String value) {
        addCriterion("VISIBLE =", value, "visible");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andVisibleNotEqualTo(java.lang.String value) {
        addCriterion("VISIBLE <>", value, "visible");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andVisibleGreaterThan(java.lang.String value) {
        addCriterion("VISIBLE >", value, "visible");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andVisibleGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("VISIBLE >=", value, "visible");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andVisibleLessThan(java.lang.String value) {
        addCriterion("VISIBLE <", value, "visible");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andVisibleLessThanOrEqualTo(java.lang.String value) {
        addCriterion("VISIBLE <=", value, "visible");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andVisibleLike(java.lang.String value) {
        addCriterion("VISIBLE like", value, "visible");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andVisibleNotLike(java.lang.String value) {
        addCriterion("VISIBLE not like", value, "visible");
        return (SysDicItemCriteria) this;
    }
    
    public SysDicItemCriteria andVisibleIn(List<java.lang.String> values) {
        addCriterion("VISIBLE in", values, "visible");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andVisibleNotIn(List<java.lang.String> values) {
        addCriterion("VISIBLE not in", values, "visible");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andVisibleBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("VISIBLE between", value1, value2, "visible");
        return (SysDicItemCriteria) this;
    }

    public SysDicItemCriteria andVisibleNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("VISIBLE not between", value1, value2, "visible");
        return (SysDicItemCriteria) this;
    }
}

