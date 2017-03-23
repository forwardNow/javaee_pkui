package com.pkusoft.admin.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.pkusoft.admin.model.SysResource;
import com.pkusoft.framework.dao.BaseMapper;

/**
 * 
 * @author 
 */
@Repository
public interface SysResourceMapper extends BaseMapper<SysResource>{
	/**
	 * 按角色查resource列表
	 * 
	 * @param params
	 * @return
	 */
    List<SysResource> getResourceListByRole(Map<String, Object> params);
	
	/**
	 * 获取用户拥有的资源列表
	 * @param params key值为userId
	 * @return 资源列表
	 * @author tanggj
	 */
	List<SysResource> getResourceListByUserId(Map<String, Object> params);
	
}