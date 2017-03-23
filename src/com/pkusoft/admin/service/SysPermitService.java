package com.pkusoft.admin.service;

import java.util.List;

import com.pkusoft.framework.service.BaseService;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.admin.model.SysPermit;

/**
 * 服务接口
 * @author 
 *
 */
public interface SysPermitService extends BaseService<SysPermit>{
	/**
	 * 查询列表
	 * 
	 * @param sysPermit
	 * @param pager
	 * @return
	 */
	List<SysPermit> getSysPermitList(SysPermit sysPermit, Pager pager);

	/**
	 * 新增信息
	 * 
	 * @param sysPermit
	 * @return
	 */
	int insertSysPermit(SysPermit sysPermit);
	
	/**
	 * 修改信息
	 * 
	 * @param sysPermit
	 * @return
	 */
	int updateSysPermit(SysPermit sysPermit);
	
	/**
	 * 删除信息
	 * 
	 * @param permitId
	 * @return
	 */
	int deleteSysPermit(java.lang.Long[] permitId);
}