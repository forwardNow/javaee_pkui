package com.pkusoft.admin.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.pkusoft.admin.model.SysUser;
import com.pkusoft.framework.dao.BaseMapper;

/**
 * 
 * @author
 */
@Repository
public interface SysUserMapper extends BaseMapper<SysUser> {
	/**
	 * 按角色查用户列表
	 * 
	 * @param params
	 * @return
	 */
	List<SysUser> getListInRole(Map<String, Object> params);

	/**
	 * 按角色查用户列表
	 * 
	 * @param params
	 * @return
	 */
	
	List<SysUser> getListNotInRole(Map<String, Object> params);
	

	/**
	 * 获取用户的数据权限配置列表
	 * @param params 必须参数#{userId,jdbcType=DECIMAL}，可选参数#{permitCode,jdbcType=VARCHAR}
	 * @return 配置值列表   [{CFG_CODE,CFG_VALUE}]
	 * @author tanggj
	 */
	List<Map<String, Object>> getUserPermitList(Map<String, Object> params);

}