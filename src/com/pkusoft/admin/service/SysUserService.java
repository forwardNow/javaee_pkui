package com.pkusoft.admin.service;

import java.util.List;
import java.util.Map;

import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.framework.service.BaseService;
import com.pkusoft.admin.model.SysDept;
import com.pkusoft.admin.model.SysRole;
import com.pkusoft.admin.model.SysRoleUser;
import com.pkusoft.admin.model.SysUser;

/**
 * 
 * @author
 * 
 */
public interface SysUserService extends BaseService<SysUser> {
	
	List<SysUser> getSysUserList(Criteria<?> criteria);

	/**
	 * 查询用户列表
	 * 
	 * @param sysUser
	 * @param pager
	 * @return
	 */
	List<SysUser> getSysUserList(SysUser sysUser, Pager pager);

	/**
	 * 按角色查询用户列表
	 * 
	 * @param sysUser
	 * @param pager
	 * @return
	 */
	List<SysUser> getSysUserListByRole(Long roleId, String roleIdOper, String userName, Pager pager);
	
	/**
	 * 新增用户信息
	 * 
	 * @param sysUser
	 * @return
	 */
	int insertSysUser(SysUser sysUser, Long[] roleId);

	/**
	 * 修改用户信息
	 * 
	 * @param sysUser
	 * @return
	 */
	int updateSysUser(SysUser sysUser, Long[] roleId);

	/**
	 * 删除用户信息
	 * 
	 * @param userId
	 * @return
	 */
	int deleteSysUser(Long[] userId);
	
	/**
	 * 重置密码
	 * 
	 * @param userId
	 * @return
	 */
	int resetPassword(Long[] userId);

	
    /**
     * 检查录入单位唯一性
     * 
     * @param userId
     * @param fieldName
     * @param fieldVale
     * @return
     */
    boolean checkUserInfo(Long userId, String fieldName, String fieldValue);
    
	/**
	 * 按级别查询角色列表
	 * 
	 * @param roleLevel
	 * @return
	 */
	List<SysRole> getSysRoleListByLevel(String roleLevel);
	
	/**
	 *  按用户标识号查询列表
	 * 
	 * @param userId
	 * @return
	 */
	List<SysRoleUser> getSysRoleUserListByUserId(Long userId);
	
	/**
	 * 获取用户的数据权限配置列表
	 * @param userId 用户编号
	 * @return 配置列表
	 * @author tanggj
	 */
	List<Map<String,Object>> getUserPermitList(Long userId);

	boolean checkPassword( String password );

	boolean updatePassword( SysUser sysUser );
}