package com.pkusoft.admin.service;

import java.util.List;

import com.pkusoft.admin.model.SysDept;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.service.BaseService;

/**
 * 单位管理服务接口
 * 
 * @author 
 *
 */
public interface SysDeptService extends BaseService<SysDept>{

	List<SysDept> getSysDeptList(Criteria<?> criteria);
	

	/**
	 * 新增单位信息
	 * 
	 * @param sysDept
	 * @return
	 */
	int insertSysDept(SysDept sysDept);
	
	/**
	 * 修改单位信息
	 * 
	 * @param oldDeptId
	 * @param sysDept
	 * @return
	 */
	int updateSysDept(String oldDeptId, SysDept sysDept);
	
	/**
	 * 删除单位信息
	 * 
	 * @param deptId
	 * @return
	 */
	int deleteSysDept(String[] deptId);
	
}