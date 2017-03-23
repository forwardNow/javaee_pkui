package com.pkusoft.admin.service;


import com.pkusoft.framework.service.BaseService;
import com.pkusoft.admin.model.SysRoleResouce;

/**
 * 服务接口
 * @author 
 *
 */
public interface SysRoleResouceService extends BaseService<SysRoleResouce>{

	
	/**
	 * 新增信息
	 * 
	 * @param roleId
	 * @param resouceId
	 * @return
	 */
	int insertSysRoleResouce(Long roleId, Long[] resouceId);
	

}