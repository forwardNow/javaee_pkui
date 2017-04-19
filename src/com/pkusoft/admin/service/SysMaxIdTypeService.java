package com.pkusoft.admin.service;

import java.util.List;

import com.pkusoft.framework.service.BaseService;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.admin.model.SysMaxIdType;

/**
 * 服务接口
 * @author 
 *
 */
public interface SysMaxIdTypeService extends BaseService<SysMaxIdType>{
	/**
	 * 查询列表
	 * 
	 * @param sysMaxIdType
	 * @param pager
	 * @return
	 */
	List<SysMaxIdType> getSysMaxIdTypeList(SysMaxIdType sysMaxIdType, Pager pager);

	/**
	 * 新增信息
	 * 
	 * @param sysMaxIdType
	 * @return
	 */
	int insertSysMaxIdType(SysMaxIdType sysMaxIdType);
	
	/**
	 * 修改信息
	 * 
	 * @param sysMaxIdType
	 * @return
	 */
	int updateSysMaxIdType(SysMaxIdType sysMaxIdType);
	
	/**
	 * 删除信息
	 * 
	 * @param idType
	 * @return
	 */
	int deleteSysMaxIdType(java.lang.String[] idType);
	
	/**
	 * 检查编号类型唯一性
	 * 
	 * @param idName 编号类型
	 * @return false 没同名参数
	 * 			true 有同名参数
	 */
	boolean checkSysMaxIdType(java.lang.String idName);

	List<SysMaxIdType> getSysMaxIdTypeList( Criteria<?> criteria );
}