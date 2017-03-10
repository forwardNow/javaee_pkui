package com.pkusoft.admin.model;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.pkusoft.framework.model.BaseModel;

/**
 * 系统字典条目对象
 * @author 
 */
public class SysDicItem extends BaseModel  implements Serializable {
	/**序列化版本号*/
	private static final long serialVersionUID = 1L;
	/**字典条目标识号*/
	private java.lang.Integer itemId;
	/**字典名称*/
	private java.lang.String dicName;
	/**字典条目编码*/
	private java.lang.String itemCode;
	/**字典条目值*/
	private java.lang.String itemValue;
	/**字典条目拼音头*/
	private java.lang.String itemSpell;
	/**字典条目全拼*/
	private java.lang.String itemAspell;
	/***/
	private java.lang.String visible;

	/**
	 * 取得字典条目标识号
	 *@return java.lang.Integer 字典条目标识号
	 */
	public java.lang.Integer getItemId(){
		return this.itemId;
	}

	/**
	 * 设置字典条目标识号
	 *@param java.lang.Integer 字典条目标识号
	 */
	public void setItemId(java.lang.Integer itemId){
		this.itemId = itemId;
	}
	/**
	 * 取得字典名称
	 *@return java.lang.String 字典名称
	 */
	public java.lang.String getDicName(){
		return this.dicName;
	}

	/**
	 * 设置字典名称
	 *@param java.lang.String 字典名称
	 */
	public void setDicName(java.lang.String dicName){
		this.dicName = dicName;
	}
	/**
	 * 取得字典条目编码
	 *@return java.lang.String 字典条目编码
	 */
	public java.lang.String getItemCode(){
		return this.itemCode;
	}

	/**
	 * 设置字典条目编码
	 *@param java.lang.String 字典条目编码
	 */
	public void setItemCode(java.lang.String itemCode){
		this.itemCode = itemCode;
	}
	/**
	 * 取得字典条目值
	 *@return java.lang.String 字典条目值
	 */
	public java.lang.String getItemValue(){
		return this.itemValue;
	}

	/**
	 * 设置字典条目值
	 *@param java.lang.String 字典条目值
	 */
	public void setItemValue(java.lang.String itemValue){
		this.itemValue = itemValue;
	}
	/**
	 * 取得字典条目拼音头
	 *@return java.lang.String 字典条目拼音头
	 */
	public java.lang.String getItemSpell(){
		return this.itemSpell;
	}

	/**
	 * 设置字典条目拼音头
	 *@param java.lang.String 字典条目拼音头
	 */
	public void setItemSpell(java.lang.String itemSpell){
		this.itemSpell = itemSpell;
	}
	/**
	 * 取得字典条目全拼
	 *@return java.lang.String 字典条目全拼
	 */
	public java.lang.String getItemAspell(){
		return this.itemAspell;
	}

	/**
	 * 设置字典条目全拼
	 *@param java.lang.String 字典条目全拼
	 */
	public void setItemAspell(java.lang.String itemAspell){
		this.itemAspell = itemAspell;
	}
	/**
	 * 取得
	 *@return java.lang.String 
	 */
	public java.lang.String getVisible(){
		return this.visible;
	}

	/**
	 * 设置
	 *@param java.lang.String 
	 */
	public void setVisible(java.lang.String visible){
		this.visible = visible;
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

