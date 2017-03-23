package com.pkusoft.admin.model;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.pkusoft.framework.model.BaseModel;

/**
 * 
 * @author 
 */
public class SysRoleResouce extends BaseModel  implements Serializable {
	/**序列化版本号*/
	private static final long serialVersionUID = 1L;
	/**角色资源标识号*/
	private java.lang.Long roleResourceId;
	/**角色编号*/
	private java.lang.Long roleId;
	/**资源编号*/
	private java.lang.Long resouceId;
	/**录入用户编号*/
	private java.lang.Long addUserId;
	/**录入用户姓名*/
	private java.lang.String addUserName;
	/**录入时间*/
	private java.util.Date addTime;

	/**
	 * 取得角色资源标识号
	 *@return java.lang.Long 角色资源标识号
	 */
	public java.lang.Long getRoleResourceId(){
		return this.roleResourceId;
	}

	/**
	 * 设置角色资源标识号
	 *@param java.lang.Long 角色资源标识号
	 */
	public void setRoleResourceId(java.lang.Long roleResourceId){
		this.roleResourceId = roleResourceId;
	}
	/**
	 * 取得角色编号
	 *@return java.lang.Long 角色编号
	 */
	public java.lang.Long getRoleId(){
		return this.roleId;
	}

	/**
	 * 设置角色编号
	 *@param java.lang.Long 角色编号
	 */
	public void setRoleId(java.lang.Long roleId){
		this.roleId = roleId;
	}
	/**
	 * 取得资源编号
	 *@return java.lang.Long 资源编号
	 */
	public java.lang.Long getResouceId(){
		return this.resouceId;
	}

	/**
	 * 设置资源编号
	 *@param java.lang.Long 资源编号
	 */
	public void setResouceId(java.lang.Long resouceId){
		this.resouceId = resouceId;
	}
	/**
	 * 取得录入用户编号
	 *@return java.lang.Long 录入用户编号
	 */
	public java.lang.Long getAddUserId(){
		return this.addUserId;
	}

	/**
	 * 设置录入用户编号
	 *@param java.lang.Long 录入用户编号
	 */
	public void setAddUserId(java.lang.Long addUserId){
		this.addUserId = addUserId;
	}
	/**
	 * 取得录入用户姓名
	 *@return java.lang.String 录入用户姓名
	 */
	public java.lang.String getAddUserName(){
		return this.addUserName;
	}

	/**
	 * 设置录入用户姓名
	 *@param java.lang.String 录入用户姓名
	 */
	public void setAddUserName(java.lang.String addUserName){
		this.addUserName = addUserName;
	}
	/**
	 * 取得录入时间
	 *@return java.util.Date 录入时间
	 */
	public java.util.Date getAddTime(){
		return this.addTime;
	}

	/**
	 * 设置录入时间
	 *@param java.util.Date 录入时间
	 */
	public void setAddTime(java.util.Date addTime){
		this.addTime = addTime;
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

