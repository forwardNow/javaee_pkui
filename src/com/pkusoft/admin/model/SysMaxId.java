package com.pkusoft.admin.model;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.pkusoft.framework.model.BaseModel;

/**
 * 
 * @author 
 */
public class SysMaxId extends BaseModel  implements Serializable {
	/**序列化版本号*/
	private static final long serialVersionUID = 1L;
	/**编号类型*/
	private java.lang.String idType;
	/**参数1*/
	private java.lang.String idPara1;
	/**参数2*/
	private java.lang.String idPara2;
	/**当前值*/
	private java.lang.Long idCurrValue;

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
	 * 取得参数1
	 *@return java.lang.String 参数1
	 */
	public java.lang.String getIdPara1(){
		return this.idPara1;
	}

	/**
	 * 设置参数1
	 *@param java.lang.String 参数1
	 */
	public void setIdPara1(java.lang.String idPara1){
		this.idPara1 = idPara1;
	}
	/**
	 * 取得参数2
	 *@return java.lang.String 参数2
	 */
	public java.lang.String getIdPara2(){
		return this.idPara2;
	}

	/**
	 * 设置参数2
	 *@param java.lang.String 参数2
	 */
	public void setIdPara2(java.lang.String idPara2){
		this.idPara2 = idPara2;
	}
	/**
	 * 取得当前值
	 *@return java.lang.Long 当前值
	 */
	public java.lang.Long getIdCurrValue(){
		return this.idCurrValue;
	}

	/**
	 * 设置当前值
	 *@param java.lang.Long 当前值
	 */
	public void setIdCurrValue(java.lang.Long idCurrValue){
		this.idCurrValue = idCurrValue;
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

