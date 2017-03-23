package com.pkusoft.admin.model;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.pkusoft.framework.model.BaseModel;

/**
 * 
 * @author 
 */
public class SysError extends BaseModel  implements Serializable {
	/**序列化版本号*/
	private static final long serialVersionUID = 1L;
	/***/
	private java.lang.Long errorId;
	/***/
	private java.lang.String errorCode;
	/***/
	private java.lang.String errorInfo;

	/**
	 * 取得
	 *@return java.lang.Long 
	 */
	public java.lang.Long getErrorId(){
		return this.errorId;
	}

	/**
	 * 设置
	 *@param java.lang.Long 
	 */
	public void setErrorId(java.lang.Long errorId){
		this.errorId = errorId;
	}
	/**
	 * 取得
	 *@return java.lang.String 
	 */
	public java.lang.String getErrorCode(){
		return this.errorCode;
	}

	/**
	 * 设置
	 *@param java.lang.String 
	 */
	public void setErrorCode(java.lang.String errorCode){
		this.errorCode = errorCode;
	}
	/**
	 * 取得
	 *@return java.lang.String 
	 */
	public java.lang.String getErrorInfo(){
		return this.errorInfo;
	}

	/**
	 * 设置
	 *@param java.lang.String 
	 */
	public void setErrorInfo(java.lang.String errorInfo){
		this.errorInfo = errorInfo;
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

