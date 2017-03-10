package com.pkusoft.admin.model;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.pkusoft.framework.model.BaseModel;

/**
 * 
 * @author 
 */
public class SysDicItem extends BaseModel  implements Serializable {
	/**序列化版本号*/
	private static final long serialVersionUID = 1L;
	/**修改用户姓名*/
	private java.lang.String modifyUserName;
	/**修改时间*/
	private java.util.Date modifyTime;
	/**字典条目标识号*/
	private java.lang.Long itemId;
	/**字典名称*/
	private java.lang.String dicName;
	/**字典条目*/
	private java.lang.String itemCode;
	/**字典条目值*/
	private java.lang.String itemValue;
	/**字典条目拼音头*/
	private java.lang.String itemSpell;
	/**字典条目全拼*/
	private java.lang.String itemAspell;
	/**是否可用*/
	private java.lang.String visiable;
	/**显示顺序*/
	private java.lang.Long orderFlag;
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
	 * 取得字典条目标识号
	 *@return java.lang.Long 字典条目标识号
	 */
	public java.lang.Long getItemId(){
		return this.itemId;
	}

	/**
	 * 设置字典条目标识号
	 *@param java.lang.Long 字典条目标识号
	 */
	public void setItemId(java.lang.Long itemId){
		this.itemId = itemId;
	}
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
	 * 取得字典条目
	 *@return java.lang.String 字典条目
	 */
	public java.lang.String getItemCode(){
		return this.itemCode;
	}

	/**
	 * 设置字典条目
	 *@param java.lang.String 字典条目
	 */
	public void setItemCode(java.lang.String itemCode){
		this.itemCode = itemCode;
	}
	/**
	 * 取得字典条目值
	 *@return java.lang.String 字典条目值
	 */
	public java.lang.String getItemValue(){
		return this.itemValue;
	}

	/**
	 * 设置字典条目值
	 *@param java.lang.String 字典条目值
	 */
	public void setItemValue(java.lang.String itemValue){
		this.itemValue = itemValue;
	}
	/**
	 * 取得字典条目拼音头
	 *@return java.lang.String 字典条目拼音头
	 */
	public java.lang.String getItemSpell(){
		return this.itemSpell;
	}

	/**
	 * 设置字典条目拼音头
	 *@param java.lang.String 字典条目拼音头
	 */
	public void setItemSpell(java.lang.String itemSpell){
		this.itemSpell = itemSpell;
	}
	/**
	 * 取得字典条目全拼
	 *@return java.lang.String 字典条目全拼
	 */
	public java.lang.String getItemAspell(){
		return this.itemAspell;
	}

	/**
	 * 设置字典条目全拼
	 *@param java.lang.String 字典条目全拼
	 */
	public void setItemAspell(java.lang.String itemAspell){
		this.itemAspell = itemAspell;
	}
	/**
	 * 取得是否可用
	 *@return java.lang.String 是否可用
	 */
	public java.lang.String getVisiable(){
		return this.visiable;
	}

	/**
	 * 设置是否可用
	 *@param java.lang.String 是否可用
	 */
	public void setVisiable(java.lang.String visiable){
		this.visiable = visiable;
	}
	/**
	 * 取得显示顺序
	 *@return java.lang.Long 显示顺序
	 */
	public java.lang.Long getOrderFlag(){
		return this.orderFlag;
	}

	/**
	 * 设置显示顺序
	 *@param java.lang.Long 显示顺序
	 */
	public void setOrderFlag(java.lang.Long orderFlag){
		this.orderFlag = orderFlag;
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

