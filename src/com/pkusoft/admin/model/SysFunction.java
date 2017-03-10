package com.pkusoft.admin.model;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.pkusoft.framework.model.BaseModel;

/**
 * 
 * @author 
 */
public class SysFunction extends BaseModel  implements Serializable {
	/**序列化版本号*/
	private static final long serialVersionUID = 1L;
	/***/
	private java.lang.Long functionId;
	/***/
	private java.lang.String functionCode;
	/***/
	private java.lang.String functionName;
	/***/
	private java.lang.String logType;
	/***/
	private java.lang.String module;
	/***/
	private java.lang.String submodule;
	/***/
	private java.lang.String operationType;

	/**
	 * 取得
	 *@return java.lang.Long 
	 */
	public java.lang.Long getFunctionId(){
		return this.functionId;
	}

	/**
	 * 设置
	 *@param java.lang.Long 
	 */
	public void setFunctionId(java.lang.Long functionId){
		this.functionId = functionId;
	}
	/**
	 * 取得
	 *@return java.lang.String 
	 */
	public java.lang.String getFunctionCode(){
		return this.functionCode;
	}

	/**
	 * 设置
	 *@param java.lang.String 
	 */
	public void setFunctionCode(java.lang.String functionCode){
		this.functionCode = functionCode;
	}
	/**
	 * 取得
	 *@return java.lang.String 
	 */
	public java.lang.String getFunctionName(){
		return this.functionName;
	}

	/**
	 * 设置
	 *@param java.lang.String 
	 */
	public void setFunctionName(java.lang.String functionName){
		this.functionName = functionName;
	}
	/**
	 * 取得
	 *@return java.lang.String 
	 */
	public java.lang.String getLogType(){
		return this.logType;
	}

	/**
	 * 设置
	 *@param java.lang.String 
	 */
	public void setLogType(java.lang.String logType){
		this.logType = logType;
	}
	/**
	 * 取得
	 *@return java.lang.String 
	 */
	public java.lang.String getModule(){
		return this.module;
	}

	/**
	 * 设置
	 *@param java.lang.String 
	 */
	public void setModule(java.lang.String module){
		this.module = module;
	}
	/**
	 * 取得
	 *@return java.lang.String 
	 */
	public java.lang.String getSubmodule(){
		return this.submodule;
	}

	/**
	 * 设置
	 *@param java.lang.String 
	 */
	public void setSubmodule(java.lang.String submodule){
		this.submodule = submodule;
	}
	/**
	 * 取得
	 *@return java.lang.String 
	 */
	public java.lang.String getOperationType(){
		return this.operationType;
	}

	/**
	 * 设置
	 *@param java.lang.String 
	 */
	public void setOperationType(java.lang.String operationType){
		this.operationType = operationType;
	}


	public String toString() {
		Field[] fields = this.getClass().getDeclaredFields();
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		for(Field f : fields) {
			if(Modifier.isStatic(f.getModifiers()) || Modifier.isFinal(f.getModifiers()))
				continue;
			Object value = null;
			try {
				f.setAccessible(true);
				value = f.get(this);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			if(value != null)
				sb.append(f.getName()).append('=').append(value).append(',');
		}
		sb.append(']');
		
		return sb.toString();
	}

}

