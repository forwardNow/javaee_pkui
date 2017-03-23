package com.pkusoft.admin.service;

import java.util.List;

import com.pkusoft.framework.service.BaseService;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.admin.model.SysError;

/**
 * 错误号管理服务接口
 * @author 
 *
 */
public interface SysErrorService extends BaseService<SysError>{
	/**
	 * 查询错误号列表
	 * 
	 * @param sysError
	 * @param pager
	 * @return
	 */
	List<SysError> getSysErrorList(SysError sysError, Pager pager);

	/**
	 * 新增错误号信息
	 * 
	 * @param sysError
	 * @return
	 */
	int insertSysError(SysError sysError);
	
	/**
	 * 修改错误号信息
	 * 
	 * @param sysError
	 * @return
	 */
	int updateSysError(SysError sysError);
	
	/**
	 * 删除错误号信息
	 * 
	 * @param errorId
	 * @return
	 */
	int deleteSysError(java.lang.Long[] errorId);
	
	/**
	 * 生成错误号字典
	 * 
	 * @param 
	 * @return
	 */
	void createDicFile();
	
	/**
	 * 查询错误号
	 * 
	 * @param errorCode
	 * @return
	 */
	boolean checkSysErrorListForm(java.lang.String errorCode);
}