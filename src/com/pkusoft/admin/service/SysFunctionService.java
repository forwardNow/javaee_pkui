package com.pkusoft.admin.service;

import java.util.List;

import com.pkusoft.framework.service.BaseService;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.admin.model.SysFunction;

/**
 * 功能号管理服务接口
 * @author 
 *
 */
public interface SysFunctionService extends BaseService<SysFunction>{
	/**
	 * 查询功能号列表
	 * 
	 * @param sysFunction
	 * @param pager
	 * @return
	 */
	List<SysFunction> getSysFunctionList(SysFunction sysFunction, Pager pager);

	/**
	 * 新增功能号信息
	 * 
	 * @param sysFunction
	 * @return
	 */
	int insertSysFunction(SysFunction sysFunction);
	
	/**
	 * 修改功能号信息
	 * 
	 * @param sysFunction
	 * @return
	 */
	int updateSysFunction(SysFunction sysFunction);
	
	/**
	 * 删除功能号信息
	 * 
	 * @param functionId
	 * @return
	 */
	int deleteSysFunction(java.lang.Long[] functionId);
	
	/**
	 * 生成功能号字典
	 * 
	 * @param functionId
	 * @return
	 */
	void createDicFile();
	
	/**
	 * 查询功能号
	 * 
	 * @param functionId
	 * @return
	 */
	boolean checkSysFunctionListForm(String functionCode);
}