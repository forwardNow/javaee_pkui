package com.pkusoft.admin.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.pkusoft.admin.model.SysDept;
import com.pkusoft.framework.dao.BaseMapper;

/**
 * 
 * @author 
 */
@Repository
public interface SysDeptMapper extends BaseMapper<SysDept>{
	/**
	 * 获取有上下级关系的单位，子取父
	 * 
	 * @param params
	 * @return
	 * @author tanggj
	 */
	List<SysDept> getReleDeptListBySub(Map<String, Object> params);
	
	/**
	 * 获取有上下级关系的单位，父取 子 
	 * 
	 * @param params
	 * @return
	 * @author tanggj
	 */
	List<SysDept> getReleDeptListByParent(Map<String, Object> params);
	
	/**
	 * 根据单位级别获取有上下级关系的单位，子取父
	 * 
	 * @param params
	 * @return
	 * @author tanggj
	 */
	List<SysDept> getReleDeptListByLevel(Map<String, Object> params);
	
	/**
	 * 根据id获取单位名称
	 * 
	 * @param deptId
	 * @return
	 */
	List<SysDept> getSysDeptName(String deptId);
}