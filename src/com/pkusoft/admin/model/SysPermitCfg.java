package com.pkusoft.admin.model;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.pkusoft.framework.model.BaseModel;

/**
 * 
 * @author 
 */
public class SysPermitCfg extends BaseModel  implements Serializable {
	/**序列化版本号*/
	private static final long serialVersionUID = 1L;
	/**配置标识号*/
	private java.lang.Long cfgId;
	/**配置编码*/
	private java.lang.String cfgCode;
	/**配置名称*/
	private java.lang.String cfgName;
	/**数据权限标识号*/
	private java.lang.Long permitId;
	/**配置值*/
	private java.lang.String cfgValue;
	/**配置描述*/
	private java.lang.String cfgDesc;
	/**排序*/
	private java.lang.Long orderFlag;
	/**保留字段1*/
	private java.lang.String reserve6;
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
	 * 取得配置标识号
	 *@return java.lang.Long 配置标识号
	 */
	public java.lang.Long getCfgId(){
		return this.cfgId;
	}

	/**
	 * 设置配置标识号
	 *@param java.lang.Long 配置标识号
	 */
	public void setCfgId(java.lang.Long cfgId){
		this.cfgId = cfgId;
	}
	/**
	 * 取得配置编码
	 *@return java.lang.String 配置编码
	 */
	public java.lang.String getCfgCode(){
		return this.cfgCode;
	}

	/**
	 * 设置配置编码
	 *@param java.lang.String 配置编码
	 */
	public void setCfgCode(java.lang.String cfgCode){
		this.cfgCode = cfgCode;
	}
	/**
	 * 取得配置名称
	 *@return java.lang.String 配置名称
	 */
	public java.lang.String getCfgName(){
		return this.cfgName;
	}

	/**
	 * 设置配置名称
	 *@param java.lang.String 配置名称
	 */
	public void setCfgName(java.lang.String cfgName){
		this.cfgName = cfgName;
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
	 * 取得配置值
	 *@return java.lang.String 配置值
	 */
	public java.lang.String getCfgValue(){
		return this.cfgValue;
	}

	/**
	 * 设置配置值
	 *@param java.lang.String 配置值
	 */
	public void setCfgValue(java.lang.String cfgValue){
		this.cfgValue = cfgValue;
	}
	/**
	 * 取得配置描述
	 *@return java.lang.String 配置描述
	 */
	public java.lang.String getCfgDesc(){
		return this.cfgDesc;
	}

	/**
	 * 设置配置描述
	 *@param java.lang.String 配置描述
	 */
	public void setCfgDesc(java.lang.String cfgDesc){
		this.cfgDesc = cfgDesc;
	}
	/**
	 * 取得排序
	 *@return java.lang.Long 排序
	 */
	public java.lang.Long getOrderFlag(){
		return this.orderFlag;
	}

	/**
	 * 设置排序
	 *@param java.lang.Long 排序
	 */
	public void setOrderFlag(java.lang.Long orderFlag){
		this.orderFlag = orderFlag;
	}
	/**
	 * 取得保留字段1
	 *@return java.lang.String 保留字段1
	 */
	public java.lang.String getReserve6(){
		return this.reserve6;
	}

	/**
	 * 设置保留字段1
	 *@param java.lang.String 保留字段1
	 */
	public void setReserve6(java.lang.String reserve6){
		this.reserve6 = reserve6;
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

