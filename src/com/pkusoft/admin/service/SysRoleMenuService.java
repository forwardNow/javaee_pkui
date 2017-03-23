package com.pkusoft.admin.service;

import com.pkusoft.framework.service.BaseService;
import com.pkusoft.admin.model.SysRoleMenu;

/**
 * 服务接口
 * @author 
 *
 */
public interface SysRoleMenuService extends BaseService<SysRoleMenu>{
	
	/**
	 * 新增信息
	 * 
	 * @param roleId
	 * @param menuId
	 * @return
	 */
	int insertSysRoleMenu(Long roleId, Long[] menuId);
			
}