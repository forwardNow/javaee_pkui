package com.pkusoft.admin.service;

import java.util.List;

import com.pkusoft.framework.service.BaseService;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.admin.model.SysLog;

/**
 * 服务接口
 * @author 
 *
 */
public interface SysLogService extends BaseService<SysLog>{
	/**
	 * 查询列表
	 * 
	 * @param sysLog
	 * @param pager
	 * @return
	 */
	List<SysLog> getSysLogList(SysLog sysLog, Pager pager);

	/**
	 * 新增信息
	 * 
	 * @param sysLog
	 * @return
	 */
	int insertSysLog(SysLog sysLog);
	
	/**
	 * 修改信息
	 * 
	 * @param sysLog
	 * @return
	 */
	int updateSysLog(SysLog sysLog);
	
	/**
	 * 删除信息
	 * 
	 * @param month
	 * @return
	 */
	int deleteSysLog(java.util.Date beginDate,java.util.Date endDate);
	
	/**
	 * 删除信息(根据日志编号)
	 * 
	 * @param logId
	 * @return
	 */
	int deleteSysLogByIds(Long[] ids);
	
	/**
	 * 删除全部信息
	 * 
	 * @param logId
	 * @return
	 */
	int deleteAllSysLog();
}