package com.pkusoft.admin.service;

import java.util.List;

import com.pkusoft.framework.service.BaseService;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.admin.model.SysMenuIcon;
import com.pkusoft.admin.model.SysMenu;

/**
 * 服务接口
 * @author 
 *
 */
public interface SysMenuService extends BaseService<SysMenu>{
	/**
	 * 查询列表
	 * 
	 * @param sysMenu
	 * @param pager
	 * @return
	 */
	List<SysMenu> getSysMenuList(SysMenu sysMenu, Pager pager);

	/**
	 * 按角色查询列表
	 * 
	 * @param roleId
	 * @return
	 */
    List<SysMenu> getMenuListByRole(Long roleId);
	
	/**
	 * 新增信息
	 * 
	 * @param sysMenu
	 * @return
	 */
	int insertSysMenu(SysMenu sysMenu);
	
	/**
	 * 修改信息
	 * 
	 * @param sysMenu
	 * @return
	 */
	int updateSysMenu(SysMenu sysMenu);
	
	/**
	 * 删除信息
	 * 
	 * @param menuId
	 * @return
	 */
	int deleteSysMenu(java.lang.Long menuId);
	int deleteSysTreeParent(java.lang.Long menuId);
	
	/**
	 * 根据等级查询得到集合
	 * @return 
	 */
	 List<SysMenu> getSysMenuListByTreeLevel(Long treeLevel);
	/**
	 * 
	 * 根据编号查询
	 * @param menuId
	 * @return
	 */
	 SysMenu getSysMenuById(Long menuId);
	 
	/**
	 * 
	 * 根据用户编号查询
	 * @param userId
	 * @return
	 */
	 List<SysMenu> getSysMenuByUserId(Long userId);
	 
	/**
	 * 
	 * 查询图标
	 * 
	 * @return
	 */
	List<SysMenuIcon> getMenuIcons();
	
	List<SysMenuIcon> getMenuIcons( String iconDir );

	void updateNode(String sourceMenuId,String targetMenuId,String point);

	void updateSysMenu( List<SysMenu> sysMenuList );
}