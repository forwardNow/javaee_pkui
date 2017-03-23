package com.pkusoft.admin.model;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.pkusoft.framework.model.BaseModel;

/**
 * 
 * @author 
 */
public class SysUser extends BaseModel  implements Serializable {
	/**序列化版本号*/
	private static final long serialVersionUID = 1L;
	/**用户标识号*/
	private java.lang.Long userId;
	/**登录名*/
	private java.lang.String loginName;
	/**真实姓名*/
	private java.lang.String userName;
	/**警号*/
	private java.lang.String policeCode;
	/**密码*/
	private java.lang.String password;
	/**密码盐值*/
	private java.lang.String salt;
	/**所属单位标识号*/
	private java.lang.String deptId;
	/**用户级别*/
	private java.lang.String userLevel;
	/**状态*/
	private java.lang.String status;
	/**用户类型*/
	private java.lang.String userType;
	/**邮箱*/
	private java.lang.String email;
	/**电话号码*/
	private java.lang.String tel;
	/**手机号码*/
	private java.lang.String mobile;
	/**身份证号*/
	private java.lang.String idcard;
	/**数字证书编码*/
	private java.lang.String certificate;
	/**数据归属市局*/
	private java.lang.String cunitid;
	/**数据归属分局*/
	private java.lang.String sunitid;
	/**数据归属派出所*/
	private java.lang.String tunitid;
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
	 * 取得登录名
	 *@return java.lang.String 登录名
	 */
	public java.lang.String getLoginName(){
		return this.loginName;
	}

	/**
	 * 设置登录名
	 *@param java.lang.String 登录名
	 */
	public void setLoginName(java.lang.String loginName){
		this.loginName = loginName;
	}
	/**
	 * 取得真实姓名
	 *@return java.lang.String 真实姓名
	 */
	public java.lang.String getUserName(){
		return this.userName;
	}

	/**
	 * 设置真实姓名
	 *@param java.lang.String 真实姓名
	 */
	public void setUserName(java.lang.String userName){
		this.userName = userName;
	}
	/**
	 * 取得警号
	 *@return java.lang.String 警号
	 */
	public java.lang.String getPoliceCode(){
		return this.policeCode;
	}

	/**
	 * 设置警号
	 *@param java.lang.String 警号
	 */
	public void setPoliceCode(java.lang.String policeCode){
		this.policeCode = policeCode;
	}
	/**
	 * 取得密码
	 *@return java.lang.String 密码
	 */
	public java.lang.String getPassword(){
		return this.password;
	}

	/**
	 * 设置密码
	 *@param java.lang.String 密码
	 */
	public void setPassword(java.lang.String password){
		this.password = password;
	}
	/**
	 * 取得密码盐值
	 *@return java.lang.String 密码盐值
	 */
	public java.lang.String getSalt(){
		return this.salt;
	}

	/**
	 * 设置密码盐值
	 *@param java.lang.String 密码盐值
	 */
	public void setSalt(java.lang.String salt){
		this.salt = salt;
	}
	/**
	 * 取得所属单位标识号
	 *@return java.lang.String 所属单位标识号
	 */
	public java.lang.String getDeptId(){
		return this.deptId;
	}

	/**
	 * 设置所属单位标识号
	 *@param java.lang.String 所属单位标识号
	 */
	public void setDeptId(java.lang.String deptId){
		this.deptId = deptId;
	}
	/**
	 * 取得用户级别
	 *@return java.lang.String 用户级别
	 */
	public java.lang.String getUserLevel(){
		return this.userLevel;
	}

	/**
	 * 设置用户级别
	 *@param java.lang.String 用户级别
	 */
	public void setUserLevel(java.lang.String userLevel){
		this.userLevel = userLevel;
	}
	/**
	 * 取得状态
	 *@return java.lang.String 状态
	 */
	public java.lang.String getStatus(){
		return this.status;
	}

	/**
	 * 设置状态
	 *@param java.lang.String 状态
	 */
	public void setStatus(java.lang.String status){
		this.status = status;
	}
	/**
	 * 取得用户类型
	 *@return java.lang.String 用户类型
	 */
	public java.lang.String getUserType(){
		return this.userType;
	}

	/**
	 * 设置用户类型
	 *@param java.lang.String 用户类型
	 */
	public void setUserType(java.lang.String userType){
		this.userType = userType;
	}
	/**
	 * 取得邮箱
	 *@return java.lang.String 邮箱
	 */
	public java.lang.String getEmail(){
		return this.email;
	}

	/**
	 * 设置邮箱
	 *@param java.lang.String 邮箱
	 */
	public void setEmail(java.lang.String email){
		this.email = email;
	}
	/**
	 * 取得电话号码
	 *@return java.lang.String 电话号码
	 */
	public java.lang.String getTel(){
		return this.tel;
	}

	/**
	 * 设置电话号码
	 *@param java.lang.String 电话号码
	 */
	public void setTel(java.lang.String tel){
		this.tel = tel;
	}
	/**
	 * 取得手机号码
	 *@return java.lang.String 手机号码
	 */
	public java.lang.String getMobile(){
		return this.mobile;
	}

	/**
	 * 设置手机号码
	 *@param java.lang.String 手机号码
	 */
	public void setMobile(java.lang.String mobile){
		this.mobile = mobile;
	}
	/**
	 * 取得身份证号
	 *@return java.lang.String 身份证号
	 */
	public java.lang.String getIdcard(){
		return this.idcard;
	}

	/**
	 * 设置身份证号
	 *@param java.lang.String 身份证号
	 */
	public void setIdcard(java.lang.String idcard){
		this.idcard = idcard;
	}
	/**
	 * 取得数字证书编码
	 *@return java.lang.String 数字证书编码
	 */
	public java.lang.String getCertificate(){
		return this.certificate;
	}

	/**
	 * 设置数字证书编码
	 *@param java.lang.String 数字证书编码
	 */
	public void setCertificate(java.lang.String certificate){
		this.certificate = certificate;
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

