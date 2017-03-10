package com.pkusoft.admin.model;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.pkusoft.framework.model.BaseModel;

/**
 * 系统字典列表对象
 * @author 
 */
public class SysDicList extends BaseModel  implements Serializable {
	/**序列化版本号*/
	private static final long serialVersionUID = 1L;
	/**字典名称*/
	private java.lang.String dicName;
	/**字典描述*/
	private java.lang.String dicDesc;

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
	 * 取得字典描述
	 *@return java.lang.String 字典描述
	 */
	public java.lang.String getDicDesc(){
		return this.dicDesc;
	}

	/**
	 * 设置字典描述
	 *@param java.lang.String 字典描述
	 */
	public void setDicDesc(java.lang.String dicDesc){
		this.dicDesc = dicDesc;
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

