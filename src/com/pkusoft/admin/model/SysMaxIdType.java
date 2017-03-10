package com.pkusoft.admin.model;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.pkusoft.framework.model.BaseModel;

/**
 * 
 * @author 
 */
public class SysMaxIdType extends BaseModel  implements Serializable {
	/**序列化版本号*/
	private static final long serialVersionUID = 1L;
	/**编号类型*/
	private java.lang.String idType;
	/**编号名称*/
	private java.lang.String idName;
	/**编号长度*/
	private java.lang.Long idSize;
	/**是否可循环使用*/
	private java.lang.String idLoop;
	/**开始值*/
	private java.lang.Long idBegin;
	/**最大值*/
	private java.lang.Long idEnd;
	/**描述*/
	private java.lang.String idDes;

	/**
	 * 取得编号类型
	 *@return java.lang.String 编号类型
	 */
	public java.lang.String getIdType(){
		return this.idType;
	}

	/**
	 * 设置编号类型
	 *@param java.lang.String 编号类型
	 */
	public void setIdType(java.lang.String idType){
		this.idType = idType;
	}
	/**
	 * 取得编号名称
	 *@return java.lang.String 编号名称
	 */
	public java.lang.String getIdName(){
		return this.idName;
	}

	/**
	 * 设置编号名称
	 *@param java.lang.String 编号名称
	 */
	public void setIdName(java.lang.String idName){
		this.idName = idName;
	}
	/**
	 * 取得编号长度
	 *@return java.lang.Long 编号长度
	 */
	public java.lang.Long getIdSize(){
		return this.idSize;
	}

	/**
	 * 设置编号长度
	 *@param java.lang.Long 编号长度
	 */
	public void setIdSize(java.lang.Long idSize){
		this.idSize = idSize;
	}
	/**
	 * 取得是否可循环使用
	 *@return java.lang.String 是否可循环使用
	 */
	public java.lang.String getIdLoop(){
		return this.idLoop;
	}

	/**
	 * 设置是否可循环使用
	 *@param java.lang.String 是否可循环使用
	 */
	public void setIdLoop(java.lang.String idLoop){
		this.idLoop = idLoop;
	}
	/**
	 * 取得开始值
	 *@return java.lang.Long 开始值
	 */
	public java.lang.Long getIdBegin(){
		return this.idBegin;
	}

	/**
	 * 设置开始值
	 *@param java.lang.Long 开始值
	 */
	public void setIdBegin(java.lang.Long idBegin){
		this.idBegin = idBegin;
	}
	/**
	 * 取得最大值
	 *@return java.lang.Long 最大值
	 */
	public java.lang.Long getIdEnd(){
		return this.idEnd;
	}

	/**
	 * 设置最大值
	 *@param java.lang.Long 最大值
	 */
	public void setIdEnd(java.lang.Long idEnd){
		this.idEnd = idEnd;
	}
	/**
	 * 取得描述
	 *@return java.lang.String 描述
	 */
	public java.lang.String getIdDes(){
		return this.idDes;
	}

	/**
	 * 设置描述
	 *@param java.lang.String 描述
	 */
	public void setIdDes(java.lang.String idDes){
		this.idDes = idDes;
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

