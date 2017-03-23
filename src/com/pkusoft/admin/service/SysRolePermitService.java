package com.pkusoft.admin.service;

import java.util.List;
import java.util.Map;

import com.pkusoft.framework.service.BaseService;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.admin.model.SysRolePermit;

/**
 * 服务接口
 * @author 
 *
 */
public interface SysRolePermitService extends BaseService<SysRolePermit>{
	/**
	 * 查询列表
	 * 
	 * @param roleId
	 * @return
	 */
	List<Map<String,Object>> getPermitListByRoleId(Long roleId);

	/**
	 * 修改信息
	 * 
	 * @param sysRolePermit
	 * @return
	 */
	int updateSysRolePermit(SysRolePermit sysRolePermit);
	
	/**
	 * 删除信息
	 * 
	 * @param rolePermitId
	 * @return
	 */
	int deleteSysRolePermit(java.lang.Long[] rolePermitId);

	/**
	 * 新增数据权限
	 * @param roleId
	 * @param permitId
	 * @return
	 */
	int insertSysRolePermit(Long roleId, Long[] permitId);
}