package com.pkusoft.admin.service;

import java.util.List;

import com.pkusoft.framework.model.Pager;
import com.pkusoft.framework.service.BaseService;
import com.pkusoft.admin.model.SysRole;

/**
 * 
 * @author
 * 
 */
public interface SysRoleService extends BaseService<SysRole> {
	/**
	 * 查询角色列表
	 * @return
	 */
	List<SysRole> getAllSysRoleList();
	
	/**
	 * 查询角色列表
	 * 
	 * @param sysRole
	 * @param pager
	 * @return
	 */
	List<SysRole> getSysRoleList(SysRole sysRole, Pager pager);

	/**
	 * 按级别查询角色列表
	 * 
	 * @param roleLevel
	 * @return
	 */
	List<SysRole> getSysRoleListByLevel(String roleLevel);

	/**
	 * 新增角色信息
	 * 
	 * @param sysRole
	 * @return
	 */
	int insertSysRole(SysRole sysRole);

	/**
	 * 修改角色信息
	 * 
	 * @param sysRole
	 * @return
	 */
	int updateSysRole(SysRole sysRole);

	/**
	 * 删除角色信息
	 * 
	 * @param roleId
	 * @return
	 */
	int deleteSysRole(Long roleId);

	/**
	 * 角色信息为一性验证
	 * 
	 * @param sysRole
	 * @return
	 */
	public boolean checkRoleInfo(Long roleId, String roleLevel,
	        String fieldName, String fieldValue);
}