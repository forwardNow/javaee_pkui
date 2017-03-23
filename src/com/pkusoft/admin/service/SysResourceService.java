package com.pkusoft.admin.service;

import java.util.List;

import com.pkusoft.admin.model.SysResource;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.framework.service.BaseService;

/**
 * 
 * @author 
 *
 */
public interface SysResourceService extends BaseService<SysResource>{
	/**
	 * 查询列表
	 * 
	 * @param sysResource
	 * @param pager
	 * @return
	 */
	List<SysResource> getSysResourceList(SysResource sysResource, Pager pager);

	/**
	 * 按角色查询列表
	 * 
	 * @param roleId
	 * @return
	 */
	@SuppressWarnings("rawtypes")
    List getResourceListByRole(Long roleId);
	
	/**
	 * 新增信息
	 * 
	 * @param sysResource
	 * @return
	 */
	int insertSysResource(SysResource sysResource);
	
	/**
	 * 修改信息
	 * 
	 * @param sysResource
	 * @return
	 */
	int updateSysResource(SysResource sysResource);
	
	/**
	 * 删除信息
	 * 
	 * @param resourceId
	 * @return
	 */
	int deleteSysResource(java.lang.Long[] resourceId);
	
	/**
	 * 获取用户拥有的资源列表
	 * @param userId 用户编号
	 * @return 资源列表
	 * @author tanggj
	 */
	List<SysResource> getResourceListByUserId(Long userId);
	
	/**
	 * 名称条件查询
	 * @param resourceName
	 * @return
	 */
	boolean sysResourceCheckName(String resourceName);

}