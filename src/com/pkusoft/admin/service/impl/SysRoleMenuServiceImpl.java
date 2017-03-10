package com.pkusoft.admin.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.pkusoft.admin.dao.SysRoleMenuMapper;
import com.pkusoft.admin.model.SysRoleMenu;
import com.pkusoft.admin.model.SysRoleMenuCriteria;
import com.pkusoft.admin.service.SysRoleMenuService;
import com.pkusoft.common.constants.IdType;
import com.pkusoft.framework.User;
import com.pkusoft.framework.dao.BaseMapper;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.service.impl.BaseServiceImpl;
import com.pkusoft.framework.util.MaxIdUtils;

/**
 * 服务实现类
 * 
 * @author
 * 
 */
@Service("sysRoleMenuService")
@Transactional
public class SysRoleMenuServiceImpl extends BaseServiceImpl<SysRoleMenu> implements SysRoleMenuService {
	/** 数据访问接口 */
	@Autowired
	private SysRoleMenuMapper sysRoleMenuMapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pkusoft.framework.service.BaseService#getMapper()
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public BaseMapper<SysRoleMenu> getMapper() {
		return this.sysRoleMenuMapper;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.pkusoft.admin.service.SysRoleMenuService#insertSysRoleMenu(java.lang
	 * .Long, java.lang.Long)
	 */
	public int insertSysRoleMenu(Long roleId, Long[] menuId) {
		Assert.notNull(roleId);
		
		// 先删除该角色所有菜单项
		Criteria<SysRoleMenuCriteria> criteria = new Criteria<SysRoleMenuCriteria>();
		SysRoleMenuCriteria sysRoleMenuCriteria = criteria
		        .createCriteria(SysRoleMenuCriteria.class);
		sysRoleMenuCriteria.andRoleIdEqualTo(roleId);
		this.deleteByCriteria(criteria);
		if ( null == menuId ) {
			return 0;
		}
		// 再新增
		for (int i = 0; i < menuId.length; i++) {
			SysRoleMenu sysRoleMenu = new SysRoleMenu();
			sysRoleMenu.setRoleMenuId(MaxIdUtils.getLongMaxIdA(IdType.SYS_ROLE_MENU));
			sysRoleMenu.setRoleId(roleId);
			sysRoleMenu.setMenuId(menuId[i]);
			sysRoleMenu.setAddUserId(User.getUserId());
			sysRoleMenu.setAddUserName(User.getUserName());
			sysRoleMenu.setAddTime(new Date());
			sysRoleMenuMapper.insert(sysRoleMenu);
		}
		return menuId.length;
	}

}