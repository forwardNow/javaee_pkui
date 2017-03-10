package com.pkusoft.admin.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.pkusoft.admin.dao.SysRoleMapper;
import com.pkusoft.admin.model.SysRole;
import com.pkusoft.admin.model.SysRoleCriteria;
import com.pkusoft.admin.service.SysRoleService;
import com.pkusoft.admin.service.SysRoleUserService;
import com.pkusoft.common.constants.IdType;
import com.pkusoft.framework.User;
import com.pkusoft.framework.dao.BaseMapper;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.framework.service.impl.BaseServiceImpl;
import com.pkusoft.framework.util.MapUtils;
import com.pkusoft.framework.util.MaxIdUtils;

/**
 * 服务实现类
 * 
 * @author
 * 
 */
@Service("sysRoleService")
@Transactional
public class SysRoleServiceImpl extends BaseServiceImpl<SysRole> implements
        SysRoleService {
	/** 数据访问接口 */
	@Autowired
	private SysRoleMapper sysRoleMapper;
	
	/** 角色用户管理数据访问接口  */
	@Autowired
	private SysRoleUserService sysRoleUserService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pkusoft.framework.service.BaseService#getMapper()
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public BaseMapper<SysRole> getMapper() {
		return this.sysRoleMapper;
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysRoleService#getAllSysRoleList()
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysRole> getAllSysRoleList() {
		Criteria<SysRoleCriteria> criteria = new Criteria<SysRoleCriteria>();
		criteria.setOrderByClause("ORDER_FLAG");
		
		List<SysRole> list = this.getListByCriteria(criteria);
		return list;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.pkusoft.admin.service.SysRoleService#getSysRoleList(com.pkusoft.admin
	 * .model.SysRole, com.pkusoft.framework.model.Pager)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysRole> getSysRoleList(SysRole sysRole, Pager pager) {
		Criteria<SysRoleCriteria> criteria = new Criteria<SysRoleCriteria>();
		criteria.setPager(pager);

		List<SysRole> list = this.getListByCriteria(criteria);

		int count = this.getCountByCriteria(criteria);
		pager.setTotalRecords(count);

		return list;
	}



	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.pkusoft.admin.service.SysRoleService#saveSysRole(com.pkusoft.admin
	 * .model.SysRole)
	 */
	public int insertSysRole(SysRole sysRole) {
		Assert.notNull(sysRole);

		// 角色标识号
		Long sysRoleId = MaxIdUtils.getLongMaxIdA(IdType.SYS_ROLE);
		sysRole.setRoleId(sysRoleId);

		// 排序
		Criteria<SysRoleCriteria> criteria = new Criteria<SysRoleCriteria>();
		int count = this.getCountByCriteria(criteria);
		sysRole.setOrderFlag(new Long(count + 1));

		// 操作人员信息
		sysRole.setAddUserId(User.getUserId());
		sysRole.setAddUserName(User.getUserName());
		sysRole.setAddTime(new Date());

		return sysRoleMapper.insert(sysRole);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.pkusoft.admin.service.SysRoleService#updateSysRole(com.pkusoft.admin
	 * .model.SysRole)
	 */
	public int updateSysRole(SysRole sysRole) {
		Assert.notNull(sysRole);
		Assert.notNull(sysRole.getRoleId());

		SysRole oldSysRole = this.get(sysRole.getRoleId());
		Map<String, Object> sysRoleMap = MapUtils.toMapTrimNull(sysRole);
		MapUtils.apply(sysRoleMap, oldSysRole);

		// 操作人员信息
		oldSysRole.setModifyUserId(User.getUserId());
		oldSysRole.setModifyUserName(User.getUserName());
		oldSysRole.setModifyTime(new Date());
		
		return this.update(oldSysRole);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.pkusoft.admin.service.SysRoleService#deleteSysRole(java.lang.Long[])
	 */
	public int deleteSysRole(java.lang.Long roleId) {
		Assert.notNull(roleId);

		// 先删除角色用户信息
		sysRoleUserService.deleteSysRoleUserByRoleId(roleId);
		//删除角色菜单信息
		
		//删除角色资源信息
		
		// 再删除角色信息
		Criteria<SysRoleCriteria> criteria = new Criteria<SysRoleCriteria>();
		SysRoleCriteria sysRoleCriteria = criteria.createCriteria(SysRoleCriteria.class);
		sysRoleCriteria.andRoleIdEqualTo(roleId);

		return this.deleteByCriteria(criteria);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.pkusoft.admin.service.SysRoleService#getSysRoleListByLevel(java.lang
	 * .Long)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysRole> getSysRoleListByLevel(String roleLevel) {
		Criteria<SysRoleCriteria> criteria = new Criteria<SysRoleCriteria>();
		SysRoleCriteria sysRoleCriteria = criteria.createCriteria(SysRoleCriteria.class);
		sysRoleCriteria.andRoleLevelEqualTo(roleLevel);

		List<SysRole> roleList = this.getListByCriteria(criteria);
		return roleList;
	}

	/**
	 * 角色信息唯一性验证
	 * 
	 * @param role
	 * @return
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public boolean checkRoleInfo(Long roleId, String roleLevel, String fieldName, String fieldValue){
		List<SysRole> roleList = new ArrayList<SysRole>();
		Criteria<SysRoleCriteria> criteria = new Criteria<SysRoleCriteria>();
		SysRoleCriteria sysRoleCriteria = criteria.createCriteria(SysRoleCriteria.class);

		// 同一级别角色名不可重复
		sysRoleCriteria.andRoleLevelEqualTo(roleLevel);
		if (null == roleId) { // 新增
			if ("roleName".equals(fieldName)) {
				sysRoleCriteria.andRoleNameEqualTo(fieldValue);
			}
			roleList = this.getListByCriteria(criteria);
		} else { // 修改
			SysRole sysRole = this.get(roleId);
			if ("roleName".equals(fieldName)) {
				sysRoleCriteria.andRoleNameNotEqualTo(sysRole.getRoleName());
				sysRoleCriteria.andRoleNameEqualTo(fieldValue);
			}
			roleList = this.getListByCriteria(criteria);
		}
		
		return roleList.size() == 0 ? true : false;
	}
	
}