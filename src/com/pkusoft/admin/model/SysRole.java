package com.pkusoft.admin.model;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.pkusoft.framework.model.BaseModel;

/**
 * 
 * @author 
 */
public class SysRole extends BaseModel  implements Serializable {
	/**序列化版本号*/
	private static final long serialVersionUID = 1L;
	/**角色标识号*/
	private java.lang.Long roleId;
	/**角色名称*/
	private java.lang.String roleName;
	/**角色级别*/
	private java.lang.String roleLevel;
	/**角色描述*/
	private java.lang.String roleDerc;
	/**角色排序*/
	private java.lang.Long orderFlag;
	/**保留字段1*/
	private java.lang.String reserve1;
	/**保留字段2*/
	private java.lang.String reserve2;
	/**保留字段3*/
	private java.lang.String reserve3;
	/**保留字段4*/
	private java.lang.String reserve4;
	/**保留字段5*/
	private java.lang.String reserve5;
	/**录入用户编号*/
	private java.lang.Long addUserId;
	/**录入用户姓名*/
	private java.lang.String addUserName;
	/**录入时间*/
	private java.util.Date addTime;
	/**修改用户编号*/
	private java.lang.Long modifyUserId;
	/**修改用户姓名*/
	private java.lang.String modifyUserName;
	/**修改时间*/
	private java.util.Date modifyTime;

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
	 * 取得角色名称
	 *@return java.lang.String 角色名称
	 */
	public java.lang.String getRoleName(){
		return this.roleName;
	}

	/**
	 * 设置角色名称
	 *@param java.lang.String 角色名称
	 */
	public void setRoleName(java.lang.String roleName){
		this.roleName = roleName;
	}
	/**
	 * 取得角色级别
	 *@return java.lang.String 角色级别
	 */
	public java.lang.String getRoleLevel(){
		return this.roleLevel;
	}

	/**
	 * 设置角色级别
	 *@param java.lang.String 角色级别
	 */
	public void setRoleLevel(java.lang.String roleLevel){
		this.roleLevel = roleLevel;
	}
	/**
	 * 取得角色描述
	 *@return java.lang.String 角色描述
	 */
	public java.lang.String getRoleDerc(){
		return this.roleDerc;
	}

	/**
	 * 设置角色描述
	 *@param java.lang.String 角色描述
	 */
	public void setRoleDerc(java.lang.String roleDerc){
		this.roleDerc = roleDerc;
	}
	/**
	 * 取得角色排序
	 *@return java.lang.Long 角色排序
	 */
	public java.lang.Long getOrderFlag(){
		return this.orderFlag;
	}

	/**
	 * 设置角色排序
	 *@param java.lang.Long 角色排序
	 */
	public void setOrderFlag(java.lang.Long orderFlag){
		this.orderFlag = orderFlag;
	}
	/**
	 * 取得保留字段1
	 *@return java.lang.String 保留字段1
	 */
	public java.lang.String getReserve1(){
		return this.reserve1;
	}

	/**
	 * 设置保留字段1
	 *@param java.lang.String 保留字段1
	 */
	public void setReserve1(java.lang.String reserve1){
		this.reserve1 = reserve1;
	}
	/**
	 * 取得保留字段2
	 *@return java.lang.String 保留字段2
	 */
	public java.lang.String getReserve2(){
		return this.reserve2;
	}

	/**
	 * 设置保留字段2
	 *@param java.lang.String 保留字段2
	 */
	public void setReserve2(java.lang.String reserve2){
		this.reserve2 = reserve2;
	}
	/**
	 * 取得保留字段3
	 *@return java.lang.String 保留字段3
	 */
	public java.lang.String getReserve3(){
		return this.reserve3;
	}

	/**
	 * 设置保留字段3
	 *@param java.lang.String 保留字段3
	 */
	public void setReserve3(java.lang.String reserve3){
		this.reserve3 = reserve3;
	}
	/**
	 * 取得保留字段4
	 *@return java.lang.String 保留字段4
	 */
	public java.lang.String getReserve4(){
		return this.reserve4;
	}

	/**
	 * 设置保留字段4
	 *@param java.lang.String 保留字段4
	 */
	public void setReserve4(java.lang.String reserve4){
		this.reserve4 = reserve4;
	}
	/**
	 * 取得保留字段5
	 *@return java.lang.String 保留字段5
	 */
	public java.lang.String getReserve5(){
		return this.reserve5;
	}

	/**
	 * 设置保留字段5
	 *@param java.lang.String 保留字段5
	 */
	public void setReserve5(java.lang.String reserve5){
		this.reserve5 = reserve5;
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
	/**
	 * 取得修改用户编号
	 *@return java.lang.Long 修改用户编号
	 */
	public java.lang.Long getModifyUserId(){
		return this.modifyUserId;
	}

	/**
	 * 设置修改用户编号
	 *@param java.lang.Long 修改用户编号
	 */
	public void setModifyUserId(java.lang.Long modifyUserId){
		this.modifyUserId = modifyUserId;
	}
	/**
	 * 取得修改用户姓名
	 *@return java.lang.String 修改用户姓名
	 */
	public java.lang.String getModifyUserName(){
		return this.modifyUserName;
	}

	/**
	 * 设置修改用户姓名
	 *@param java.lang.String 修改用户姓名
	 */
	public void setModifyUserName(java.lang.String modifyUserName){
		this.modifyUserName = modifyUserName;
	}
	/**
	 * 取得修改时间
	 *@return java.util.Date 修改时间
	 */
	public java.util.Date getModifyTime(){
		return this.modifyTime;
	}

	/**
	 * 设置修改时间
	 *@param java.util.Date 修改时间
	 */
	public void setModifyTime(java.util.Date modifyTime){
		this.modifyTime = modifyTime;
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

