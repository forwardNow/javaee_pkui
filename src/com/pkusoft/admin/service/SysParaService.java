package com.pkusoft.admin.service;

import java.util.List;

import com.pkusoft.framework.service.BaseService;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.admin.model.SysPara;

/**
 * 服务接口
 * @author 
 *
 */
public interface SysParaService extends BaseService<SysPara>{
	/**
	 * 查询列表
	 * 
	 * @return
	 */
	List<SysPara> getSysParaList(Criteria<?> criteria);

	/**
	 * 新增信息
	 * 
	 * @param sysPara
	 * @return
	 */
	int insertSysPara(SysPara sysPara);
	
	/**
	 * 修改信息
	 * 
	 * @param sysPara
	 * @return
	 */
	int updateSysPara(SysPara sysPara);
	
	/**
	 * 删除信息
	 * 
	 * @param paraCode
	 * @return
	 */
	int deleteSysPara(java.lang.String[] paraCode);

	/**
	 * 检查同名系统参数名称
	 * 
	 * @param paraName
	 * @return false 没同名参数
	 * 			true 有同名参数
	 */
	boolean checkSysParaForm(String paraName);
}