package com.pkusoft.common.constants;

/**
 * 错误号
 * 
 * @author tanggj
 * 
 */
public class ErrorCode {
	/**
	 * 登录失败，用户已停用
	 */
	public final static int ERR_LOGIN_USER_BLOCK_UP = 100001;

	/**
	 * 保存单位信息错误
	 */
	public final static int ERR_SYS_DEPT_SAVE = 100101;
	
	/**
	 * 缺少主管单位
	 */
	public final static int ERR_SYS_DEPT_ABSENCE_MAIN = 100102;

	/**
	 * 保存用户信息错误
	 */
	public final static int ERR_SYS_USER_SAVE = 100201;
	
	/**
	 * 用户管理-用户已存在
	 */
	public final static int ERR_SYS_USER_EXISTS = 100202;

	/**
	 * 角色管理--角色已存在
	 */
	public final static int ERR_SYS_ROLE_EXISTS = 100301;
	

}
