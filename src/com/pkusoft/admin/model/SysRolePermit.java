package com.pkusoft.admin.model;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.pkusoft.framework.model.BaseModel;

/**
 * 
 * @author 
 */
public class SysRolePermit extends BaseModel  implements Serializable {
	/**序列化版本号*/
	private static final long serialVersionUID = 1L;
	/**角色数据权限标识号*/
	private java.lang.Long rolePermitId;
	/**角色标识号*/
	private java.lang.Long roleId;
	/**数据权限标识号*/
	private java.lang.Long permitId;
	/**录入用户编号*/
	private java.lang.Long addUserId;
	/**录入用户姓名*/
	private java.lang.String addUserName;
	/**录入时间*/
	private java.util.Date addTime;

	/**
	 * 取得角色数据权限标识号
	 *@return java.lang.Long 角色数据权限标识号
	 */
	public java.lang.Long getRolePermitId(){
		return this.rolePermitId;
	}

	/**
	 * 设置角色数据权限标识号
	 *@param java.lang.Long 角色数据权限标识号
	 */
	public void setRolePermitId(java.lang.Long rolePermitId){
		this.rolePermitId = rolePermitId;
	}
	/**
	 * 取得角色标识号
	 *@return java.lang.Long 角色标识号
	 */
	public java.lang.Long getRoleId(){
		return this.roleId;
	}

	/**
	 * 设置角色标识号
	 *@param java.lang.Long 角色标识号
	 */
	public void setRoleId(java.lang.Long roleId){
		this.roleId = roleId;
	}
	/**
	 * 取得数据权限标识号
	 *@return java.lang.Long 数据权限标识号
	 */
	public java.lang.Long getPermitId(){
		return this.permitId;
	}

	/**
	 * 设置数据权限标识号
	 *@param java.lang.Long 数据权限标识号
	 */
	public void setPermitId(java.lang.Long permitId){
		this.permitId = permitId;
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

