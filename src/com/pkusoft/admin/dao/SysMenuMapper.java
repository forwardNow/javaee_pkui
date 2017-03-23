package com.pkusoft.admin.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.pkusoft.framework.dao.BaseMapper;
import com.pkusoft.admin.model.SysMenu;

/**
 * 
 * @author 
 */
@Repository
public interface SysMenuMapper extends BaseMapper<SysMenu>{
	/**
	 * 按角色查menu列表
	 * 
	 * @param params
	 * @return
 	 * @author hey
	 */
    List<SysMenu> getMenuListByRole(Map<String, Object> params);
    
    
    /**
     * 按用户编号查菜单
     * 
     * @param params
     * @return
     * @author hey
     */
    List<SysMenu> getSysMenuByUserId(Map<String, Object> params);
}