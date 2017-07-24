package com.pkusoft.admin.model;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.pkusoft.framework.model.BaseModel;

/**
 * 接入的系统对象
 * @author 
 */
public class SysAccessSystem extends BaseModel  implements Serializable {
	/**序列化版本号*/
	private static final long serialVersionUID = 1L;
	/**系统标识*/
	private java.lang.String sysId;
	/**系统名称*/
	private java.lang.String sysName;
	/**系统类别。00、内部系统；10、内外系统*/
	private java.lang.String sysType;
	/**访问系统的url*/
	private java.lang.String url;
	/**描述*/
	private java.lang.String description;
	/**修改用户编号*/
	private java.lang.String modifyUserId;
	/**修改用户姓名*/
	private java.lang.String modifyUserName;
	/**修改时间*/
	private java.util.Date modifyTime;
	/**预留字段1*/
	private java.lang.String reserve1;
	/**预留字段2*/
	private java.lang.String reserve2;
	/**预留字段4*/
	private java.lang.String reserve4;
	/**预留字段3*/
	private java.lang.String reserve3;
	/**预留字段5*/
	private java.lang.String reserve5;
	/**图标*/
	private java.lang.String icon;

	/**
	 * 取得系统标识
	 *@return java.lang.String 系统标识
	 */
	public java.lang.String getSysId(){
		return this.sysId;
	}

	/**
	 * 设置系统标识
	 *@param java.lang.String 系统标识
	 */
	public void setSysId(java.lang.String sysId){
		this.sysId = sysId;
	}
	/**
	 * 取得系统名称
	 *@return java.lang.String 系统名称
	 */
	public java.lang.String getSysName(){
		return this.sysName;
	}

	/**
	 * 设置系统名称
	 *@param java.lang.String 系统名称
	 */
	public void setSysName(java.lang.String sysName){
		this.sysName = sysName;
	}
	/**
	 * 取得系统类别。00、内部系统；10、内外系统
	 *@return java.lang.String 系统类别。00、内部系统；10、内外系统
	 */
	public java.lang.String getSysType(){
		return this.sysType;
	}

	/**
	 * 设置系统类别。00、内部系统；10、内外系统
	 *@param java.lang.String 系统类别。00、内部系统；10、内外系统
	 */
	public void setSysType(java.lang.String sysType){
		this.sysType = sysType;
	}
	/**
	 * 取得访问系统的url
	 *@return java.lang.String 访问系统的url
	 */
	public java.lang.String getUrl(){
		return this.url;
	}

	/**
	 * 设置访问系统的url
	 *@param java.lang.String 访问系统的url
	 */
	public void setUrl(java.lang.String url){
		this.url = url;
	}
	/**
	 * 取得描述
	 *@return java.lang.String 描述
	 */
	public java.lang.String getDescription(){
		return this.description;
	}

	/**
	 * 设置描述
	 *@param java.lang.String 描述
	 */
	public void setDescription(java.lang.String description){
		this.description = description;
	}
	/**
	 * 取得修改用户编号
	 *@return java.lang.String 修改用户编号
	 */
	public java.lang.String getModifyUserId(){
		return this.modifyUserId;
	}

	/**
	 * 设置修改用户编号
	 *@param java.lang.String 修改用户编号
	 */
	public void setModifyUserId(java.lang.String modifyUserId){
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
	/**
	 * 取得预留字段1
	 *@return java.lang.String 预留字段1
	 */
	public java.lang.String getReserve1(){
		return this.reserve1;
	}

	/**
	 * 设置预留字段1
	 *@param java.lang.String 预留字段1
	 */
	public void setReserve1(java.lang.String reserve1){
		this.reserve1 = reserve1;
	}
	/**
	 * 取得预留字段2
	 *@return java.lang.String 预留字段2
	 */
	public java.lang.String getReserve2(){
		return this.reserve2;
	}

	/**
	 * 设置预留字段2
	 *@param java.lang.String 预留字段2
	 */
	public void setReserve2(java.lang.String reserve2){
		this.reserve2 = reserve2;
	}
	/**
	 * 取得预留字段4
	 *@return java.lang.String 预留字段4
	 */
	public java.lang.String getReserve4(){
		return this.reserve4;
	}

	/**
	 * 设置预留字段4
	 *@param java.lang.String 预留字段4
	 */
	public void setReserve4(java.lang.String reserve4){
		this.reserve4 = reserve4;
	}
	/**
	 * 取得预留字段3
	 *@return java.lang.String 预留字段3
	 */
	public java.lang.String getReserve3(){
		return this.reserve3;
	}

	/**
	 * 设置预留字段3
	 *@param java.lang.String 预留字段3
	 */
	public void setReserve3(java.lang.String reserve3){
		this.reserve3 = reserve3;
	}
	/**
	 * 取得预留字段5
	 *@return java.lang.String 预留字段5
	 */
	public java.lang.String getReserve5(){
		return this.reserve5;
	}

	/**
	 * 设置预留字段5
	 *@param java.lang.String 预留字段5
	 */
	public void setReserve5(java.lang.String reserve5){
		this.reserve5 = reserve5;
	}
	/**
	 * 取得图标
	 *@return java.lang.String 图标
	 */
	public java.lang.String getIcon(){
		return this.icon;
	}

	/**
	 * 设置图标
	 *@param java.lang.String 图标
	 */
	public void setIcon(java.lang.String icon){
		this.icon = icon;
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

