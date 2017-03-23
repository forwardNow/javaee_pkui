package com.pkusoft.admin.model;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.pkusoft.framework.model.BaseModel;

/**
 * 
 * @author 
 */
public class SysRoleUser extends BaseModel  implements Serializable {
	/**序列化版本号*/
	private static final long serialVersionUID = 1L;
	/**角色用户标识号*/
	private java.lang.Long roleUserId;
	/**用户编号*/
	private java.lang.Long userId;
	/**角色编号*/
	private java.lang.Long roleId;
	/**录入用户编号*/
	private java.lang.Long addUserId;
	/**录入用户姓名*/
	private java.lang.String addUserName;
	/**录入时间*/
	private java.util.Date addTime;

	/**
	 * 取得角色用户标识号
	 *@return java.lang.Long 角色用户标识号
	 */
	public java.lang.Long getRoleUserId(){
		return this.roleUserId;
	}

	/**
	 * 设置角色用户标识号
	 *@param java.lang.Long 角色用户标识号
	 */
	public void setRoleUserId(java.lang.Long roleUserId){
		this.roleUserId = roleUserId;
	}
	/**
	 * 取得用户编号
	 *@return java.lang.Long 用户编号
	 */
	public java.lang.Long getUserId(){
		return this.userId;
	}

	/**
	 * 设置用户编号
	 *@param java.lang.Long 用户编号
	 */
	public void setUserId(java.lang.Long userId){
		this.userId = userId;
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

