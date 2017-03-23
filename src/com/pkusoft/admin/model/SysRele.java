package com.pkusoft.admin.model;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.pkusoft.framework.model.BaseModel;

/**
 * 数据归属单位信息对象
 * @author 
 */
public class SysRele extends BaseModel  implements Serializable {
	/**序列化版本号*/
	private static final long serialVersionUID = 1L;
	/**数据归属单位编号*/
	private java.lang.String deptId;
	/**数据归属单位名称*/
	private java.lang.String deptName;
	/**部门级别*/
	private java.lang.String deptLevel;
	/**机构树级别*/
	private java.lang.Long treeLevel;
	/**上级部门标识号*/
	private java.lang.String parentDeptId;
	/**排序*/
	private java.lang.Long orderFlag;
	/**电话*/
	private java.lang.String tel;
	/**传真*/
	private java.lang.String fax;
	/**是否为主管单位*/
	private java.lang.String isMainDept;
	/**负责人*/
	private java.lang.String manager;
	/**部门类型*/
	private java.lang.String deptType;
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
	/**备注*/
	private java.lang.String memo;
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
	 * 取得数据归属单位编号
	 *@return java.lang.String 数据归属单位编号
	 */
	public java.lang.String getDeptId(){
		return this.deptId;
	}

	/**
	 * 设置数据归属单位编号
	 *@param java.lang.String 数据归属单位编号
	 */
	public void setDeptId(java.lang.String deptId){
		this.deptId = deptId;
	}
	/**
	 * 取得数据归属单位名称
	 *@return java.lang.String 数据归属单位名称
	 */
	public java.lang.String getDeptName(){
		return this.deptName;
	}

	/**
	 * 设置数据归属单位名称
	 *@param java.lang.String 数据归属单位名称
	 */
	public void setDeptName(java.lang.String deptName){
		this.deptName = deptName;
	}
	/**
	 * 取得部门级别
	 *@return java.lang.String 部门级别
	 */
	public java.lang.String getDeptLevel(){
		return this.deptLevel;
	}

	/**
	 * 设置部门级别
	 *@param java.lang.String 部门级别
	 */
	public void setDeptLevel(java.lang.String deptLevel){
		this.deptLevel = deptLevel;
	}
	/**
	 * 取得机构树级别
	 *@return java.lang.Long 机构树级别
	 */
	public java.lang.Long getTreeLevel(){
		return this.treeLevel;
	}

	/**
	 * 设置机构树级别
	 *@param java.lang.Long 机构树级别
	 */
	public void setTreeLevel(java.lang.Long treeLevel){
		this.treeLevel = treeLevel;
	}
	/**
	 * 取得上级部门标识号
	 *@return java.lang.String 上级部门标识号
	 */
	public java.lang.String getParentDeptId(){
		return this.parentDeptId;
	}

	/**
	 * 设置上级部门标识号
	 *@param java.lang.String 上级部门标识号
	 */
	public void setParentDeptId(java.lang.String parentDeptId){
		this.parentDeptId = parentDeptId;
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
	 * 取得电话
	 *@return java.lang.String 电话
	 */
	public java.lang.String getTel(){
		return this.tel;
	}

	/**
	 * 设置电话
	 *@param java.lang.String 电话
	 */
	public void setTel(java.lang.String tel){
		this.tel = tel;
	}
	/**
	 * 取得传真
	 *@return java.lang.String 传真
	 */
	public java.lang.String getFax(){
		return this.fax;
	}

	/**
	 * 设置传真
	 *@param java.lang.String 传真
	 */
	public void setFax(java.lang.String fax){
		this.fax = fax;
	}
	/**
	 * 取得是否为主管单位
	 *@return java.lang.String 是否为主管单位
	 */
	public java.lang.String getIsMainDept(){
		return this.isMainDept;
	}

	/**
	 * 设置是否为主管单位
	 *@param java.lang.String 是否为主管单位
	 */
	public void setIsMainDept(java.lang.String isMainDept){
		this.isMainDept = isMainDept;
	}
	/**
	 * 取得负责人
	 *@return java.lang.String 负责人
	 */
	public java.lang.String getManager(){
		return this.manager;
	}

	/**
	 * 设置负责人
	 *@param java.lang.String 负责人
	 */
	public void setManager(java.lang.String manager){
		this.manager = manager;
	}
	/**
	 * 取得部门类型
	 *@return java.lang.String 部门类型
	 */
	public java.lang.String getDeptType(){
		return this.deptType;
	}

	/**
	 * 设置部门类型
	 *@param java.lang.String 部门类型
	 */
	public void setDeptType(java.lang.String deptType){
		this.deptType = deptType;
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

