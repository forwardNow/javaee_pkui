package com.pkusoft.admin.service;

import java.util.List;

import com.pkusoft.framework.service.BaseService;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.admin.model.SysAccessSystem;

/**
 * 接入的系统服务接口
 * @author 
 *
 */
public interface SysAccessSystemService extends BaseService<SysAccessSystem>{
	/**
	 * 接入的系统查询列表
	 * 
	 * @param criteria 查询标准
	 * @return 列表
	 */
	List<SysAccessSystem> getSysAccessSystemList(Criteria<?> criteria);

	/**
	 * 接入的系统新增信息
	 * 
	 * @param sysAccessSystem 对象
	 * @return 插入记录数
	 */
	int insertSysAccessSystem(SysAccessSystem sysAccessSystem);
	
	/**
	 * 接入的系统修改信息
	 * 
	 * @param sysAccessSystem 对象
	 * @return 更新记录数
	 */
	int updateSysAccessSystem(SysAccessSystem sysAccessSystem);

	/**
	 * 接入的系统删除信息
	 * 
	 * @param sysId 主键
	 * @return 删除记录数
	 */
	int deleteSysAccessSystem(java.lang.String[] sysId);
}