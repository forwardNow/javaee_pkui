package com.pkusoft.admin.model;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.pkusoft.framework.model.BaseModel;

/**
 * 
 * @author 
 */
public class SysPara extends BaseModel  implements Serializable {
	/**序列化版本号*/
	private static final long serialVersionUID = 1L;
	/**参数编码*/
	private java.lang.String paraCode;
	/**参数名称*/
	private java.lang.String paraName;
	/**参数值*/
	private java.lang.String paraValue;
	/**参数说明*/
	private java.lang.String paraDesc;
	/**是否能编辑*/
	private java.lang.String visiable;
	/**预留字段1*/
	private java.lang.String reserve1;
	/**预留字段2*/
	private java.lang.String reserve2;
	/**预留字段3*/
	private java.lang.String reserve3;
	/**预留字段4*/
	private java.lang.String reserve4;
	/**预留字段5*/
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
	 * 取得参数编码
	 *@return java.lang.String 参数编码
	 */
	public java.lang.String getParaCode(){
		return this.paraCode;
	}

	/**
	 * 设置参数编码
	 *@param java.lang.String 参数编码
	 */
	public void setParaCode(java.lang.String paraCode){
		this.paraCode = paraCode;
	}
	/**
	 * 取得参数名称
	 *@return java.lang.String 参数名称
	 */
	public java.lang.String getParaName(){
		return this.paraName;
	}

	/**
	 * 设置参数名称
	 *@param java.lang.String 参数名称
	 */
	public void setParaName(java.lang.String paraName){
		this.paraName = paraName;
	}
	/**
	 * 取得参数值
	 *@return java.lang.String 参数值
	 */
	public java.lang.String getParaValue(){
		return this.paraValue;
	}

	/**
	 * 设置参数值
	 *@param java.lang.String 参数值
	 */
	public void setParaValue(java.lang.String paraValue){
		this.paraValue = paraValue;
	}
	/**
	 * 取得参数说明
	 *@return java.lang.String 参数说明
	 */
	public java.lang.String getParaDesc(){
		return this.paraDesc;
	}

	/**
	 * 设置参数说明
	 *@param java.lang.String 参数说明
	 */
	public void setParaDesc(java.lang.String paraDesc){
		this.paraDesc = paraDesc;
	}
	/**
	 * 取得是否能编辑
	 *@return java.lang.String 是否能编辑
	 */
	public java.lang.String getVisiable(){
		return this.visiable;
	}

	/**
	 * 设置是否能编辑
	 *@param java.lang.String 是否能编辑
	 */
	public void setVisiable(java.lang.String visiable){
		this.visiable = visiable;
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

