package com.pkusoft.admin.model;

import java.util.List;

import com.pkusoft.framework.model.Criteria.BaseCriteria;

/**
 * 
 * @author 
 */
public class SysFunctionCriteria extends BaseCriteria {
	public SysFunctionCriteria andFunctionIdIsNull() {
        addCriterion("FUNCTION_ID is null");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andFunctionIdIsNotNull() {
        addCriterion("FUNCTION_ID is not null");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andFunctionIdEqualTo(java.lang.Long value) {
        addCriterion("FUNCTION_ID =", value, "functionId");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andFunctionIdNotEqualTo(java.lang.Long value) {
        addCriterion("FUNCTION_ID <>", value, "functionId");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andFunctionIdGreaterThan(java.lang.Long value) {
        addCriterion("FUNCTION_ID >", value, "functionId");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andFunctionIdGreaterThanOrEqualTo(java.lang.Long value) {
        addCriterion("FUNCTION_ID >=", value, "functionId");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andFunctionIdLessThan(java.lang.Long value) {
        addCriterion("FUNCTION_ID <", value, "functionId");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andFunctionIdLessThanOrEqualTo(java.lang.Long value) {
        addCriterion("FUNCTION_ID <=", value, "functionId");
        return (SysFunctionCriteria) this;
    }
    
    public SysFunctionCriteria andFunctionIdIn(List<java.lang.Long> values) {
        addCriterion("FUNCTION_ID in", values, "functionId");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andFunctionIdNotIn(List<java.lang.Long> values) {
        addCriterion("FUNCTION_ID not in", values, "functionId");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andFunctionIdBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("FUNCTION_ID between", value1, value2, "functionId");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andFunctionIdNotBetween(java.lang.Long value1, java.lang.Long value2) {
        addCriterion("FUNCTION_ID not between", value1, value2, "functionId");
        return (SysFunctionCriteria) this;
    }
	public SysFunctionCriteria andFunctionCodeIsNull() {
        addCriterion("FUNCTION_CODE is null");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andFunctionCodeIsNotNull() {
        addCriterion("FUNCTION_CODE is not null");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andFunctionCodeEqualTo(java.lang.String value) {
        addCriterion("FUNCTION_CODE =", value, "functionCode");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andFunctionCodeNotEqualTo(java.lang.String value) {
        addCriterion("FUNCTION_CODE <>", value, "functionCode");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andFunctionCodeGreaterThan(java.lang.String value) {
        addCriterion("FUNCTION_CODE >", value, "functionCode");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andFunctionCodeGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("FUNCTION_CODE >=", value, "functionCode");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andFunctionCodeLessThan(java.lang.String value) {
        addCriterion("FUNCTION_CODE <", value, "functionCode");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andFunctionCodeLessThanOrEqualTo(java.lang.String value) {
        addCriterion("FUNCTION_CODE <=", value, "functionCode");
        return (SysFunctionCriteria) this;
    }
    
    public SysFunctionCriteria andFunctionCodeLike(java.lang.String value) {
        addCriterion("FUNCTION_CODE like", value, "functionCode");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andFunctionCodeNotLike(java.lang.String value) {
        addCriterion("FUNCTION_CODE not like", value, "functionCode");
        return (SysFunctionCriteria) this;
    }
    
    public SysFunctionCriteria andFunctionCodeIn(List<java.lang.String> values) {
        addCriterion("FUNCTION_CODE in", values, "functionCode");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andFunctionCodeNotIn(List<java.lang.String> values) {
        addCriterion("FUNCTION_CODE not in", values, "functionCode");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andFunctionCodeBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("FUNCTION_CODE between", value1, value2, "functionCode");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andFunctionCodeNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("FUNCTION_CODE not between", value1, value2, "functionCode");
        return (SysFunctionCriteria) this;
    }
	public SysFunctionCriteria andFunctionNameIsNull() {
        addCriterion("FUNCTION_NAME is null");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andFunctionNameIsNotNull() {
        addCriterion("FUNCTION_NAME is not null");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andFunctionNameEqualTo(java.lang.String value) {
        addCriterion("FUNCTION_NAME =", value, "functionName");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andFunctionNameNotEqualTo(java.lang.String value) {
        addCriterion("FUNCTION_NAME <>", value, "functionName");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andFunctionNameGreaterThan(java.lang.String value) {
        addCriterion("FUNCTION_NAME >", value, "functionName");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andFunctionNameGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("FUNCTION_NAME >=", value, "functionName");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andFunctionNameLessThan(java.lang.String value) {
        addCriterion("FUNCTION_NAME <", value, "functionName");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andFunctionNameLessThanOrEqualTo(java.lang.String value) {
        addCriterion("FUNCTION_NAME <=", value, "functionName");
        return (SysFunctionCriteria) this;
    }
    
    public SysFunctionCriteria andFunctionNameLike(java.lang.String value) {
        addCriterion("FUNCTION_NAME like", value, "functionName");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andFunctionNameNotLike(java.lang.String value) {
        addCriterion("FUNCTION_NAME not like", value, "functionName");
        return (SysFunctionCriteria) this;
    }
    
    public SysFunctionCriteria andFunctionNameIn(List<java.lang.String> values) {
        addCriterion("FUNCTION_NAME in", values, "functionName");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andFunctionNameNotIn(List<java.lang.String> values) {
        addCriterion("FUNCTION_NAME not in", values, "functionName");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andFunctionNameBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("FUNCTION_NAME between", value1, value2, "functionName");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andFunctionNameNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("FUNCTION_NAME not between", value1, value2, "functionName");
        return (SysFunctionCriteria) this;
    }
	public SysFunctionCriteria andLogTypeIsNull() {
        addCriterion("LOG_TYPE is null");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andLogTypeIsNotNull() {
        addCriterion("LOG_TYPE is not null");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andLogTypeEqualTo(java.lang.String value) {
        addCriterion("LOG_TYPE =", value, "logType");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andLogTypeNotEqualTo(java.lang.String value) {
        addCriterion("LOG_TYPE <>", value, "logType");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andLogTypeGreaterThan(java.lang.String value) {
        addCriterion("LOG_TYPE >", value, "logType");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andLogTypeGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("LOG_TYPE >=", value, "logType");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andLogTypeLessThan(java.lang.String value) {
        addCriterion("LOG_TYPE <", value, "logType");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andLogTypeLessThanOrEqualTo(java.lang.String value) {
        addCriterion("LOG_TYPE <=", value, "logType");
        return (SysFunctionCriteria) this;
    }
    
    public SysFunctionCriteria andLogTypeLike(java.lang.String value) {
        addCriterion("LOG_TYPE like", value, "logType");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andLogTypeNotLike(java.lang.String value) {
        addCriterion("LOG_TYPE not like", value, "logType");
        return (SysFunctionCriteria) this;
    }
    
    public SysFunctionCriteria andLogTypeIn(List<java.lang.String> values) {
        addCriterion("LOG_TYPE in", values, "logType");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andLogTypeNotIn(List<java.lang.String> values) {
        addCriterion("LOG_TYPE not in", values, "logType");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andLogTypeBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("LOG_TYPE between", value1, value2, "logType");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andLogTypeNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("LOG_TYPE not between", value1, value2, "logType");
        return (SysFunctionCriteria) this;
    }
	public SysFunctionCriteria andModuleIsNull() {
        addCriterion("MODULE is null");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andModuleIsNotNull() {
        addCriterion("MODULE is not null");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andModuleEqualTo(java.lang.String value) {
        addCriterion("MODULE =", value, "module");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andModuleNotEqualTo(java.lang.String value) {
        addCriterion("MODULE <>", value, "module");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andModuleGreaterThan(java.lang.String value) {
        addCriterion("MODULE >", value, "module");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andModuleGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("MODULE >=", value, "module");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andModuleLessThan(java.lang.String value) {
        addCriterion("MODULE <", value, "module");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andModuleLessThanOrEqualTo(java.lang.String value) {
        addCriterion("MODULE <=", value, "module");
        return (SysFunctionCriteria) this;
    }
    
    public SysFunctionCriteria andModuleLike(java.lang.String value) {
        addCriterion("MODULE like", value, "module");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andModuleNotLike(java.lang.String value) {
        addCriterion("MODULE not like", value, "module");
        return (SysFunctionCriteria) this;
    }
    
    public SysFunctionCriteria andModuleIn(List<java.lang.String> values) {
        addCriterion("MODULE in", values, "module");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andModuleNotIn(List<java.lang.String> values) {
        addCriterion("MODULE not in", values, "module");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andModuleBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MODULE between", value1, value2, "module");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andModuleNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("MODULE not between", value1, value2, "module");
        return (SysFunctionCriteria) this;
    }
	public SysFunctionCriteria andSubmoduleIsNull() {
        addCriterion("SUBMODULE is null");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andSubmoduleIsNotNull() {
        addCriterion("SUBMODULE is not null");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andSubmoduleEqualTo(java.lang.String value) {
        addCriterion("SUBMODULE =", value, "submodule");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andSubmoduleNotEqualTo(java.lang.String value) {
        addCriterion("SUBMODULE <>", value, "submodule");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andSubmoduleGreaterThan(java.lang.String value) {
        addCriterion("SUBMODULE >", value, "submodule");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andSubmoduleGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("SUBMODULE >=", value, "submodule");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andSubmoduleLessThan(java.lang.String value) {
        addCriterion("SUBMODULE <", value, "submodule");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andSubmoduleLessThanOrEqualTo(java.lang.String value) {
        addCriterion("SUBMODULE <=", value, "submodule");
        return (SysFunctionCriteria) this;
    }
    
    public SysFunctionCriteria andSubmoduleLike(java.lang.String value) {
        addCriterion("SUBMODULE like", value, "submodule");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andSubmoduleNotLike(java.lang.String value) {
        addCriterion("SUBMODULE not like", value, "submodule");
        return (SysFunctionCriteria) this;
    }
    
    public SysFunctionCriteria andSubmoduleIn(List<java.lang.String> values) {
        addCriterion("SUBMODULE in", values, "submodule");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andSubmoduleNotIn(List<java.lang.String> values) {
        addCriterion("SUBMODULE not in", values, "submodule");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andSubmoduleBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("SUBMODULE between", value1, value2, "submodule");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andSubmoduleNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("SUBMODULE not between", value1, value2, "submodule");
        return (SysFunctionCriteria) this;
    }
	public SysFunctionCriteria andOperationTypeIsNull() {
        addCriterion("OPERATION_TYPE is null");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andOperationTypeIsNotNull() {
        addCriterion("OPERATION_TYPE is not null");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andOperationTypeEqualTo(java.lang.String value) {
        addCriterion("OPERATION_TYPE =", value, "operationType");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andOperationTypeNotEqualTo(java.lang.String value) {
        addCriterion("OPERATION_TYPE <>", value, "operationType");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andOperationTypeGreaterThan(java.lang.String value) {
        addCriterion("OPERATION_TYPE >", value, "operationType");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andOperationTypeGreaterThanOrEqualTo(java.lang.String value) {
        addCriterion("OPERATION_TYPE >=", value, "operationType");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andOperationTypeLessThan(java.lang.String value) {
        addCriterion("OPERATION_TYPE <", value, "operationType");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andOperationTypeLessThanOrEqualTo(java.lang.String value) {
        addCriterion("OPERATION_TYPE <=", value, "operationType");
        return (SysFunctionCriteria) this;
    }
    
    public SysFunctionCriteria andOperationTypeLike(java.lang.String value) {
        addCriterion("OPERATION_TYPE like", value, "operationType");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andOperationTypeNotLike(java.lang.String value) {
        addCriterion("OPERATION_TYPE not like", value, "operationType");
        return (SysFunctionCriteria) this;
    }
    
    public SysFunctionCriteria andOperationTypeIn(List<java.lang.String> values) {
        addCriterion("OPERATION_TYPE in", values, "operationType");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andOperationTypeNotIn(List<java.lang.String> values) {
        addCriterion("OPERATION_TYPE not in", values, "operationType");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andOperationTypeBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("OPERATION_TYPE between", value1, value2, "operationType");
        return (SysFunctionCriteria) this;
    }

    public SysFunctionCriteria andOperationTypeNotBetween(java.lang.String value1, java.lang.String value2) {
        addCriterion("OPERATION_TYPE not between", value1, value2, "operationType");
        return (SysFunctionCriteria) this;
    }
}

