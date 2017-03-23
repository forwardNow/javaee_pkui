package com.pkusoft.admin.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.pkusoft.framework.dao.BaseMapper;
import com.pkusoft.admin.model.SysRolePermit;

/**
 * 
 * @author 
 */
@Repository
public interface SysRolePermitMapper extends BaseMapper<SysRolePermit>{

	/**
	 * 根据角色编号获取数据权限
	 * @param params
	 * @return
	 */
	List<Map<String,Object>> getPermitListByRoleId(Map<String, Object> params);
	
}