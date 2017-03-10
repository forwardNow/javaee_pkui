package com.pkusoft.admin.model;

import java.util.List;

import com.pkusoft.framework.model.Criteria.BaseCriteria;

/**
 * 
 * @author 
 */
public class SysMaxIdTypeCriteria extends BaseCriteria {
	public SysMaxIdTypeCriteria andIdTypeIsNull() {
        addCriterion("ID_TYPE is null");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdTypeIsNotNull() {
        addCriterion("ID_TYPE is not null");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdTypeEqualTo(java.lang.String value) {
        addCriterion("ID_TYPE =", value, "idType");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdTypeNotEqualTo(java.lang.String value) {
        addCriterion("ID_TYPE <>", value, "idType");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdTypeGreaterThan(java.lang.String value) {
        addCriterion("ID_TYPE >", value, "idType");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdTypeGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("ID_TYPE >=", value, "idType");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdTypeLessThan(java.lang.String value) {
        addCriterion("ID_TYPE <", value, "idType");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdTypeLessThanOrEqualTo(java.lang.String value) {
        addCriterion("ID_TYPE <=", value, "idType");
        return (SysMaxIdTypeCriteria) this;
    }
    
    public SysMaxIdTypeCriteria andIdTypeLike(java.lang.String value) {
        addCriterion("ID_TYPE like", value, "idType");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdTypeNotLike(java.lang.String value) {
        addCriterion("ID_TYPE not like", value, "idType");
        return (SysMaxIdTypeCriteria) this;
    }
    
    public SysMaxIdTypeCriteria andIdTypeIn(List<java.lang.String> values) {
        addCriterion("ID_TYPE in", values, "idType");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdTypeNotIn(List<java.lang.String> values) {
        addCriterion("ID_TYPE not in", values, "idType");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdTypeBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ID_TYPE between", value1, value2, "idType");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdTypeNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ID_TYPE not between", value1, value2, "idType");
        return (SysMaxIdTypeCriteria) this;
    }
	public SysMaxIdTypeCriteria andIdNameIsNull() {
        addCriterion("ID_NAME is null");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdNameIsNotNull() {
        addCriterion("ID_NAME is not null");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdNameEqualTo(java.lang.String value) {
        addCriterion("ID_NAME =", value, "idName");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdNameNotEqualTo(java.lang.String value) {
        addCriterion("ID_NAME <>", value, "idName");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdNameGreaterThan(java.lang.String value) {
        addCriterion("ID_NAME >", value, "idName");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("ID_NAME >=", value, "idName");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdNameLessThan(java.lang.String value) {
        addCriterion("ID_NAME <", value, "idName");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("ID_NAME <=", value, "idName");
        return (SysMaxIdTypeCriteria) this;
    }
    
    public SysMaxIdTypeCriteria andIdNameLike(java.lang.String value) {
        addCriterion("ID_NAME like", value, "idName");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdNameNotLike(java.lang.String value) {
        addCriterion("ID_NAME not like", value, "idName");
        return (SysMaxIdTypeCriteria) this;
    }
    
    public SysMaxIdTypeCriteria andIdNameIn(List<java.lang.String> values) {
        addCriterion("ID_NAME in", values, "idName");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdNameNotIn(List<java.lang.String> values) {
        addCriterion("ID_NAME not in", values, "idName");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ID_NAME between", value1, value2, "idName");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ID_NAME not between", value1, value2, "idName");
        return (SysMaxIdTypeCriteria) this;
    }
	public SysMaxIdTypeCriteria andIdSizeIsNull() {
        addCriterion("ID_SIZE is null");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdSizeIsNotNull() {
        addCriterion("ID_SIZE is not null");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdSizeEqualTo(java.lang.Long value) {
        addCriterion("ID_SIZE =", value, "idSize");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdSizeNotEqualTo(java.lang.Long value) {
        addCriterion("ID_SIZE <>", value, "idSize");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdSizeGreaterThan(java.lang.Long value) {
        addCriterion("ID_SIZE >", value, "idSize");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdSizeGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ID_SIZE >=", value, "idSize");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdSizeLessThan(java.lang.Long value) {
        addCriterion("ID_SIZE <", value, "idSize");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdSizeLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ID_SIZE <=", value, "idSize");
        return (SysMaxIdTypeCriteria) this;
    }
    
    public SysMaxIdTypeCriteria andIdSizeIn(List<java.lang.Long> values) {
        addCriterion("ID_SIZE in", values, "idSize");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdSizeNotIn(List<java.lang.Long> values) {
        addCriterion("ID_SIZE not in", values, "idSize");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdSizeBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ID_SIZE between", value1, value2, "idSize");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdSizeNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ID_SIZE not between", value1, value2, "idSize");
        return (SysMaxIdTypeCriteria) this;
    }
	public SysMaxIdTypeCriteria andIdLoopIsNull() {
        addCriterion("ID_LOOP is null");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdLoopIsNotNull() {
        addCriterion("ID_LOOP is not null");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdLoopEqualTo(java.lang.String value) {
        addCriterion("ID_LOOP =", value, "idLoop");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdLoopNotEqualTo(java.lang.String value) {
        addCriterion("ID_LOOP <>", value, "idLoop");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdLoopGreaterThan(java.lang.String value) {
        addCriterion("ID_LOOP >", value, "idLoop");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdLoopGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("ID_LOOP >=", value, "idLoop");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdLoopLessThan(java.lang.String value) {
        addCriterion("ID_LOOP <", value, "idLoop");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdLoopLessThanOrEqualTo(java.lang.String value) {
        addCriterion("ID_LOOP <=", value, "idLoop");
        return (SysMaxIdTypeCriteria) this;
    }
    
    public SysMaxIdTypeCriteria andIdLoopLike(java.lang.String value) {
        addCriterion("ID_LOOP like", value, "idLoop");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdLoopNotLike(java.lang.String value) {
        addCriterion("ID_LOOP not like", value, "idLoop");
        return (SysMaxIdTypeCriteria) this;
    }
    
    public SysMaxIdTypeCriteria andIdLoopIn(List<java.lang.String> values) {
        addCriterion("ID_LOOP in", values, "idLoop");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdLoopNotIn(List<java.lang.String> values) {
        addCriterion("ID_LOOP not in", values, "idLoop");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdLoopBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ID_LOOP between", value1, value2, "idLoop");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdLoopNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ID_LOOP not between", value1, value2, "idLoop");
        return (SysMaxIdTypeCriteria) this;
    }
	public SysMaxIdTypeCriteria andIdBeginIsNull() {
        addCriterion("ID_BEGIN is null");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdBeginIsNotNull() {
        addCriterion("ID_BEGIN is not null");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdBeginEqualTo(java.lang.Long value) {
        addCriterion("ID_BEGIN =", value, "idBegin");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdBeginNotEqualTo(java.lang.Long value) {
        addCriterion("ID_BEGIN <>", value, "idBegin");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdBeginGreaterThan(java.lang.Long value) {
        addCriterion("ID_BEGIN >", value, "idBegin");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdBeginGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ID_BEGIN >=", value, "idBegin");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdBeginLessThan(java.lang.Long value) {
        addCriterion("ID_BEGIN <", value, "idBegin");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdBeginLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ID_BEGIN <=", value, "idBegin");
        return (SysMaxIdTypeCriteria) this;
    }
    
    public SysMaxIdTypeCriteria andIdBeginIn(List<java.lang.Long> values) {
        addCriterion("ID_BEGIN in", values, "idBegin");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdBeginNotIn(List<java.lang.Long> values) {
        addCriterion("ID_BEGIN not in", values, "idBegin");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdBeginBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ID_BEGIN between", value1, value2, "idBegin");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdBeginNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ID_BEGIN not between", value1, value2, "idBegin");
        return (SysMaxIdTypeCriteria) this;
    }
	public SysMaxIdTypeCriteria andIdEndIsNull() {
        addCriterion("ID_END is null");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdEndIsNotNull() {
        addCriterion("ID_END is not null");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdEndEqualTo(java.lang.Long value) {
        addCriterion("ID_END =", value, "idEnd");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdEndNotEqualTo(java.lang.Long value) {
        addCriterion("ID_END <>", value, "idEnd");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdEndGreaterThan(java.lang.Long value) {
        addCriterion("ID_END >", value, "idEnd");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdEndGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("ID_END >=", value, "idEnd");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdEndLessThan(java.lang.Long value) {
        addCriterion("ID_END <", value, "idEnd");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdEndLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("ID_END <=", value, "idEnd");
        return (SysMaxIdTypeCriteria) this;
    }
    
    public SysMaxIdTypeCriteria andIdEndIn(List<java.lang.Long> values) {
        addCriterion("ID_END in", values, "idEnd");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdEndNotIn(List<java.lang.Long> values) {
        addCriterion("ID_END not in", values, "idEnd");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdEndBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ID_END between", value1, value2, "idEnd");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdEndNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("ID_END not between", value1, value2, "idEnd");
        return (SysMaxIdTypeCriteria) this;
    }
	public SysMaxIdTypeCriteria andIdDesIsNull() {
        addCriterion("ID_DES is null");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdDesIsNotNull() {
        addCriterion("ID_DES is not null");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdDesEqualTo(java.lang.String value) {
        addCriterion("ID_DES =", value, "idDes");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdDesNotEqualTo(java.lang.String value) {
        addCriterion("ID_DES <>", value, "idDes");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdDesGreaterThan(java.lang.String value) {
        addCriterion("ID_DES >", value, "idDes");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdDesGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("ID_DES >=", value, "idDes");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdDesLessThan(java.lang.String value) {
        addCriterion("ID_DES <", value, "idDes");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdDesLessThanOrEqualTo(java.lang.String value) {
        addCriterion("ID_DES <=", value, "idDes");
        return (SysMaxIdTypeCriteria) this;
    }
    
    public SysMaxIdTypeCriteria andIdDesLike(java.lang.String value) {
        addCriterion("ID_DES like", value, "idDes");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdDesNotLike(java.lang.String value) {
        addCriterion("ID_DES not like", value, "idDes");
        return (SysMaxIdTypeCriteria) this;
    }
    
    public SysMaxIdTypeCriteria andIdDesIn(List<java.lang.String> values) {
        addCriterion("ID_DES in", values, "idDes");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdDesNotIn(List<java.lang.String> values) {
        addCriterion("ID_DES not in", values, "idDes");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdDesBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ID_DES between", value1, value2, "idDes");
        return (SysMaxIdTypeCriteria) this;
    }

    public SysMaxIdTypeCriteria andIdDesNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("ID_DES not between", value1, value2, "idDes");
        return (SysMaxIdTypeCriteria) this;
    }
}

