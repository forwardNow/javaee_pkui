package com.pkusoft.admin.service;

import java.util.List;

import com.pkusoft.framework.service.BaseService;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.admin.model.SysNotice;

/**
 * 系统公告服务接口
 * @author 
 *
 */
public interface SysNoticeService extends BaseService<SysNotice>{
	/**
	 * 系统公告查询列表
	 * 
	 * @param criteria 查询标准
	 * @return 列表
	 */
	List<SysNotice> getSysNoticeList(Criteria<?> criteria);

	/**
	 * 系统公告新增信息
	 * 
	 * @param sysNotice 对象
	 * @return 插入记录数
	 */
	int insertSysNotice(SysNotice sysNotice);
	
	/**
	 * 系统公告修改信息
	 * 
	 * @param sysNotice 对象
	 * @return 更新记录数
	 */
	int updateSysNotice(SysNotice sysNotice);

	/**
	 * 系统公告删除信息
	 * 
	 * @param opid 主键
	 * @return 删除记录数
	 */
	int deleteSysNotice(java.lang.Integer[] opid);

	int updateSysNotice(Integer[] opids, int operation,String field);
}