package com.pkusoft.admin.model;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.pkusoft.framework.model.BaseModel;

/**
 * 
 * @author 
 */
public class SysLog extends BaseModel  implements Serializable {
	/**序列化版本号*/
	private static final long serialVersionUID = 1L;
	/**日志标识号*/
	private java.lang.Long logId;
	/**用户标识号*/
	private java.lang.Long userId;
	/**用户登录名*/
	private java.lang.String loginName;
	/**用户真实姓名*/
	private java.lang.String userName;
	/**用户所属单位标识号*/
	private java.lang.String deptId;
	/**用户所属单位名称*/
	private java.lang.String deptName;
	/**单位级别*/
	private java.lang.String logDeptLevel;
	/**登录IP*/
	private java.lang.String ip;
	/**日志类型*/
	private java.lang.String logType;
	/**功能编号*/
	private java.lang.String functionId;
	/**模块编号*/
	private java.lang.String modelId;
	/**模块子编号*/
	private java.lang.String subModelId;
	/**操作类型*/
	private java.lang.String operType;
	/**记录时间*/
	private java.util.Date logTime;
	/**日志信息*/
	private java.lang.String logInfo;
	/**数据归属市局*/
	private java.lang.String cunitid;
	/**数据归属分局*/
	private java.lang.String sunitid;
	/**数据归属派出所*/
	private java.lang.String tunitid;

	/**
	 * 取得日志标识号
	 *@return java.lang.Long 日志标识号
	 */
	public java.lang.Long getLogId(){
		return this.logId;
	}

	/**
	 * 设置日志标识号
	 *@param java.lang.Long 日志标识号
	 */
	public void setLogId(java.lang.Long logId){
		this.logId = logId;
	}
	/**
	 * 取得用户标识号
	 *@return java.lang.Long 用户标识号
	 */
	public java.lang.Long getUserId(){
		return this.userId;
	}

	/**
	 * 设置用户标识号
	 *@param java.lang.Long 用户标识号
	 */
	public void setUserId(java.lang.Long userId){
		this.userId = userId;
	}
	/**
	 * 取得用户登录名
	 *@return java.lang.String 用户登录名
	 */
	public java.lang.String getLoginName(){
		return this.loginName;
	}

	/**
	 * 设置用户登录名
	 *@param java.lang.String 用户登录名
	 */
	public void setLoginName(java.lang.String loginName){
		this.loginName = loginName;
	}
	/**
	 * 取得用户真实姓名
	 *@return java.lang.String 用户真实姓名
	 */
	public java.lang.String getUserName(){
		return this.userName;
	}

	/**
	 * 设置用户真实姓名
	 *@param java.lang.String 用户真实姓名
	 */
	public void setUserName(java.lang.String userName){
		this.userName = userName;
	}
	/**
	 * 取得用户所属单位标识号
	 *@return java.lang.String 用户所属单位标识号
	 */
	public java.lang.String getDeptId(){
		return this.deptId;
	}

	/**
	 * 设置用户所属单位标识号
	 *@param java.lang.String 用户所属单位标识号
	 */
	public void setDeptId(java.lang.String deptId){
		this.deptId = deptId;
	}
	/**
	 * 取得用户所属单位名称
	 *@return java.lang.String 用户所属单位名称
	 */
	public java.lang.String getDeptName(){
		return this.deptName;
	}

	/**
	 * 设置用户所属单位名称
	 *@param java.lang.String 用户所属单位名称
	 */
	public void setDeptName(java.lang.String deptName){
		this.deptName = deptName;
	}
	/**
	 * 取得单位级别
	 *@return java.lang.String 单位级别
	 */
	public java.lang.String getLogDeptLevel(){
		return this.logDeptLevel;
	}

	/**
	 * 设置单位级别
	 *@param java.lang.String 单位级别
	 */
	public void setLogDeptLevel(java.lang.String logDeptLevel){
		this.logDeptLevel = logDeptLevel;
	}
	/**
	 * 取得登录IP
	 *@return java.lang.String 登录IP
	 */
	public java.lang.String getIp(){
		return this.ip;
	}

	/**
	 * 设置登录IP
	 *@param java.lang.String 登录IP
	 */
	public void setIp(java.lang.String ip){
		this.ip = ip;
	}
	/**
	 * 取得日志类型
	 *@return java.lang.String 日志类型
	 */
	public java.lang.String getLogType(){
		return this.logType;
	}

	/**
	 * 设置日志类型
	 *@param java.lang.String 日志类型
	 */
	public void setLogType(java.lang.String logType){
		this.logType = logType;
	}
	/**
	 * 取得功能编号
	 *@return java.lang.String 功能编号
	 */
	public java.lang.String getFunctionId(){
		return this.functionId;
	}

	/**
	 * 设置功能编号
	 *@param java.lang.String 功能编号
	 */
	public void setFunctionId(java.lang.String functionId){
		this.functionId = functionId;
	}
	/**
	 * 取得模块编号
	 *@return java.lang.String 模块编号
	 */
	public java.lang.String getModelId(){
		return this.modelId;
	}

	/**
	 * 设置模块编号
	 *@param java.lang.String 模块编号
	 */
	public void setModelId(java.lang.String modelId){
		this.modelId = modelId;
	}
	/**
	 * 取得模块子编号
	 *@return java.lang.String 模块子编号
	 */
	public java.lang.String getSubModelId(){
		return this.subModelId;
	}

	/**
	 * 设置模块子编号
	 *@param java.lang.String 模块子编号
	 */
	public void setSubModelId(java.lang.String subModelId){
		this.subModelId = subModelId;
	}
	/**
	 * 取得操作类型
	 *@return java.lang.String 操作类型
	 */
	public java.lang.String getOperType(){
		return this.operType;
	}

	/**
	 * 设置操作类型
	 *@param java.lang.String 操作类型
	 */
	public void setOperType(java.lang.String operType){
		this.operType = operType;
	}
	/**
	 * 取得记录时间
	 *@return java.util.Date 记录时间
	 */
	public java.util.Date getLogTime(){
		return this.logTime;
	}

	/**
	 * 设置记录时间
	 *@param java.util.Date 记录时间
	 */
	public void setLogTime(java.util.Date logTime){
		this.logTime = logTime;
	}
	/**
	 * 取得日志信息
	 *@return java.lang.String 日志信息
	 */
	public java.lang.String getLogInfo(){
		return this.logInfo;
	}

	/**
	 * 设置日志信息
	 *@param java.lang.String 日志信息
	 */
	public void setLogInfo(java.lang.String logInfo){
		this.logInfo = logInfo;
	}
	/**
	 * 取得数据归属市局
	 *@return java.lang.String 数据归属市局
	 */
	public java.lang.String getCunitid(){
		return this.cunitid;
	}

	/**
	 * 设置数据归属市局
	 *@param java.lang.String 数据归属市局
	 */
	public void setCunitid(java.lang.String cunitid){
		this.cunitid = cunitid;
	}
	/**
	 * 取得数据归属分局
	 *@return java.lang.String 数据归属分局
	 */
	public java.lang.String getSunitid(){
		return this.sunitid;
	}

	/**
	 * 设置数据归属分局
	 *@param java.lang.String 数据归属分局
	 */
	public void setSunitid(java.lang.String sunitid){
		this.sunitid = sunitid;
	}
	/**
	 * 取得数据归属派出所
	 *@return java.lang.String 数据归属派出所
	 */
	public java.lang.String getTunitid(){
		return this.tunitid;
	}

	/**
	 * 设置数据归属派出所
	 *@param java.lang.String 数据归属派出所
	 */
	public void setTunitid(java.lang.String tunitid){
		this.tunitid = tunitid;
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

