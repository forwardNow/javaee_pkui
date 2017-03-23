package com.pkusoft.admin.service;

import java.util.List;

import com.pkusoft.framework.service.BaseService;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.admin.model.SysRoleUser;

/**
 * 服务接口
 * 
 * @author
 * 
 */
public interface SysRoleUserService extends BaseService<SysRoleUser> {
	/**
	 * 查询列表
	 * 
	 * @param sysRoleUser
	 * @param pager
	 * @return
	 */
	List<SysRoleUser> getSysRoleUserList(SysRoleUser sysRoleUser, Pager pager);

	/**
	 * 新增信息
	 * 
	 * @param sysRoleUser
	 * @return
	 */
	int insertSysRoleUser(SysRoleUser sysRoleUser);

	/**
	 * 新增信息
	 * 
	 * @param sysUserId
	 * @param roleId
	 * @return
	 */
	int insertSysRoleUser(Long[] userId, Long roleId);

	/**
	 * 修改信息
	 * 
	 * @param sysRoleUser
	 * @return
	 */
	int updateSysRoleUser(SysRoleUser sysRoleUser);

	/**
	 * 删除信息
	 * 
	 * @param userId
	 * @param roleId
	 * @return
	 */
	int deleteSysRoleUser(Long[] userId, Long roleId);

	/**
	 * 按角色标识号删除
	 * 
	 * @param roleId
	 * @return
	 */
	int deleteSysRoleUserByRoleId(java.lang.Long roleId);

	/**
	 * 按用户标识号查询列表
	 * 
	 * @param userId
	 * @return
	 */
	List<SysRoleUser> getSysRoleUserListByUserId(Long userId);

	/**
	 * 按用户标识号删除
	 * 
	 * @param userId
	 * @return
	 */
	int deleteSysRoleUserByUserId(java.lang.Long userId);

}