package com.pkusoft.admin.service;

import java.util.List;

import com.pkusoft.framework.service.BaseService;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.admin.model.SysMaxId;

/**
 * 服务接口
 * @author 
 *
 */
public interface SysMaxIdService extends BaseService<SysMaxId>{
	/**
	 * 查询列表
	 * 
	 * @param sysMaxId
	 * @param pager
	 * @return
	 */
	List<SysMaxId> getSysMaxIdList(SysMaxId sysMaxId, Pager pager);

	/**
	 * 新增信息
	 * 
	 * @param sysMaxId
	 * @return
	 */
	int insertSysMaxId(SysMaxId sysMaxId);
	
	/**
	 * 修改信息
	 * 
	 * @param sysMaxId
	 * @return
	 */
	int updateSysMaxId(SysMaxId sysMaxId);
	
	/**
	 * 删除信息
	 * 
	 * @param idPara2
	 * @return
	 */
	int deleteSysMaxId(SysMaxId sysMaxId);
	
	/**
	 * 查询详细信息
	 * 
	 * @param sysMaxId
	 * @param 
	 * @return
	 */
	SysMaxId getSysMaxIdDetail(SysMaxId sysMaxId);
}