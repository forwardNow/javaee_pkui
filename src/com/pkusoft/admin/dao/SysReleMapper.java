package com.pkusoft.admin.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.pkusoft.framework.dao.BaseMapper;
import com.pkusoft.admin.model.SysRele;
import com.pkusoft.admin.model.SysDept;

/**
 * 数据归属单位信息数据访问
 * @author 
 */
@Repository
public interface SysReleMapper extends BaseMapper<SysRele>{
	/**
	 * 获取有上下级关系的单位，子取父
	 * 
	 * @param params
	 * @return
	 * @author tanggj
	 */
	List<SysRele> getReleDeptListBySub(Map<String, Object> params);
	
	/**
	 * 获取有上下级关系的单位，父取 子 
	 * 
	 * @param params
	 * @return
	 * @author tanggj
	 */
	List<SysRele> getReleDeptListByParent(Map<String, Object> params);
	
	/**
	 * 根据单位级别获取有上下级关系的单位，子取父
	 * 
	 * @param params
	 * @return
	 * @author tanggj
	 */
	List<SysRele> getReleDeptListByLevel(Map<String, Object> params);
	
	/**
	 * 根据id获取单位名称
	 * 
	 * @param deptId
	 * @return
	 */
	List<SysRele> getSysDeptName(String deptId);
}