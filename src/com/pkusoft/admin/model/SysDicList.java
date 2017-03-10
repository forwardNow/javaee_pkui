package com.pkusoft.admin.model;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.pkusoft.framework.model.BaseModel;

/**
 * 
 * @author 
 */
public class SysDicList extends BaseModel  implements Serializable {
	/**序列化版本号*/
	private static final long serialVersionUID = 1L;
	/**字典名称*/
	private java.lang.String dicName;
	/**字典描述*/
	private java.lang.String dicDesc;
	/**字典标准*/
	private java.lang.String dicStandard;
	/**父字典*/
	private java.lang.String parentDic;
	/**字典显示顺序*/
	private java.lang.Long orderFlag;
	/**修改权限*/
	private java.lang.String editable;
	/**是否有用*/
	private java.lang.String visiable;
	/**备注*/
	private java.lang.String memo;
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
	/**
	 * 取得字典标准
	 *@return java.lang.String 字典标准
	 */
	public java.lang.String getDicStandard(){
		return this.dicStandard;
	}

	/**
	 * 设置字典标准
	 *@param java.lang.String 字典标准
	 */
	public void setDicStandard(java.lang.String dicStandard){
		this.dicStandard = dicStandard;
	}
	/**
	 * 取得父字典
	 *@return java.lang.String 父字典
	 */
	public java.lang.String getParentDic(){
		return this.parentDic;
	}

	/**
	 * 设置父字典
	 *@param java.lang.String 父字典
	 */
	public void setParentDic(java.lang.String parentDic){
		this.parentDic = parentDic;
	}

	/**
	 * 取得字典显示顺序
	 *@return java.lang.Long 字典显示顺序
	 */
	public java.lang.Long getOrderFlag(){
		return this.orderFlag;
	}

	/**
	 * 设置字典显示顺序
	 *@param java.lang.Long 字典显示顺序
	 */
	public void setOrderFlag(java.lang.Long orderFlag){
		this.orderFlag = orderFlag;
	}
	/**
	 * 取得修改权限
	 *@return java.lang.String 修改权限
	 */
	public java.lang.String getEditable(){
		return this.editable;
	}

	/**
	 * 设置修改权限
	 *@param java.lang.String 修改权限
	 */
	public void setEditable(java.lang.String editable){
		this.editable = editable;
	}
	/**
	 * 取得是否有用
	 *@return java.lang.String 是否有用
	 */
	public java.lang.String getVisiable(){
		return this.visiable;
	}

	/**
	 * 设置是否有用
	 *@param java.lang.String 是否有用
	 */
	public void setVisiable(java.lang.String visiable){
		this.visiable = visiable;
	}
	/**
	 * 取得备注
	 *@return java.lang.String 备注
	 */
	public java.lang.String getMemo(){
		return this.memo;
	}

	/**
	 * 设置备注
	 *@param java.lang.String 备注
	 */
	public void setMemo(java.lang.String memo){
		this.memo = memo;
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

