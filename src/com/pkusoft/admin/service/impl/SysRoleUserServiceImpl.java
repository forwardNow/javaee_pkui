package com.pkusoft.admin.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.pkusoft.framework.User;
import com.pkusoft.framework.dao.BaseMapper;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.framework.util.MapUtils;
import com.pkusoft.framework.util.MaxIdUtils;
import com.pkusoft.framework.service.impl.BaseServiceImpl;
import com.pkusoft.admin.dao.SysRoleUserMapper;
import com.pkusoft.admin.model.SysRoleUser;
import com.pkusoft.admin.model.SysRoleUserCriteria;
import com.pkusoft.admin.service.SysRoleUserService;
import com.pkusoft.common.constants.IdType;

/**
 * 服务实现类
 * 
 * @author
 * 
 */
@Service("sysRoleUserService")
@Transactional
public class SysRoleUserServiceImpl extends BaseServiceImpl<SysRoleUser>
        implements SysRoleUserService {
	/** 数据访问接口 */
	@Autowired
	private SysRoleUserMapper sysRoleUserMapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pkusoft.framework.service.BaseService#getMapper()
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public BaseMapper<SysRoleUser> getMapper() {
		return this.sysRoleUserMapper;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.pkusoft.admin.service.SysRoleUserService#getSysRoleUserList(com.pkusoft
	 * .admin.model.SysRoleUser, com.pkusoft.framework.model.Pager)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysRoleUser> getSysRoleUserList(SysRoleUser sysRoleUser, Pager pager) {
		Criteria<SysRoleUserCriteria> criteria = new Criteria<SysRoleUserCriteria>();
		criteria.setPager(pager);

		List<SysRoleUser> list = this.getListByCriteria(criteria);

		int count = this.getCountByCriteria(criteria);
		pager.setTotalRecords(count);

		return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.pkusoft.admin.service.SysRoleUserService#saveSysRoleUser(com.pkusoft
	 * .admin.model.SysRoleUser)
	 */
	public int insertSysRoleUser(SysRoleUser sysRoleUser) {
		Assert.notNull(sysRoleUser);

		return sysRoleUserMapper.insert(sysRoleUser);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.pkusoft.admin.service.SysRoleUserService#updateSysRoleUser(com.pkusoft
	 * .admin.model.SysRoleUser)
	 */
	public int updateSysRoleUser(SysRoleUser sysRoleUser) {
		Assert.notNull(sysRoleUser);
		Assert.notNull(sysRoleUser.getRoleUserId());

		SysRoleUser oldSysRoleUser = this.get(sysRoleUser.getRoleUserId());

		Map<String, Object> sysRoleUserMap = MapUtils.toMapTrimNull(sysRoleUser);
		MapUtils.apply(sysRoleUserMap, oldSysRoleUser);

		return this.update(oldSysRoleUser);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.pkusoft.admin.service.SysRoleUserService#insertSysRoleUser(java.lang.Long[], java.lang.Long)
	 */
	public int insertSysRoleUser(Long[] userId, Long roleId) {

		for (int i = 0; i < userId.length; i++) {
			SysRoleUser sysRoleUser = new SysRoleUser();
			sysRoleUser.setRoleUserId(MaxIdUtils.getLongMaxIdA(IdType.SYS_ROLE_USER));
			sysRoleUser.setUserId(userId[i]);
			sysRoleUser.setRoleId(roleId);
			sysRoleUser.setAddUserId(User.getUserId());
			sysRoleUser.setAddUserName(User.getUserName());
			sysRoleUser.setAddTime(new Date());
			sysRoleUserMapper.insert(sysRoleUser);
		}
		return userId.length;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.pkusoft.admin.service.SysRoleUserService#deleteSysRoleUser(java.lang
	 * .Long[])
	 */
	public int deleteSysRoleUser(Long[] userId, Long roleId) {
		Assert.notNull(roleId);

		Criteria<SysRoleUserCriteria> criteria;
		SysRoleUserCriteria sysRoleUserCriteria;
		for (int i = 0; i < userId.length; i++) {
			criteria = new Criteria<SysRoleUserCriteria>();
			sysRoleUserCriteria = criteria.createCriteria(SysRoleUserCriteria.class);
			sysRoleUserCriteria.andRoleIdEqualTo(roleId);
			sysRoleUserCriteria.andUserIdEqualTo(userId[i]);
			this.deleteByCriteria(criteria);
		}
		return userId.length;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.pkusoft.admin.service.SysRoleUserService#getSysRoleUserListByUserId
	 * (java.lang.Long)
	 */
	public List<SysRoleUser> getSysRoleUserListByUserId(Long userId) {
		Criteria<SysRoleUserCriteria> criteria = new Criteria<SysRoleUserCriteria>();
		SysRoleUserCriteria sysRoleUserCriteria = criteria.createCriteria(SysRoleUserCriteria.class);
		sysRoleUserCriteria.andUserIdEqualTo(userId);
		List<SysRoleUser> roleUserList = this.getListByCriteria(criteria);
		return roleUserList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.pkusoft.admin.service.SysRoleUserService#deleteSysRoleUserByRoleId
	 * (java.lang.Long[])
	 */
	public int deleteSysRoleUserByRoleId(java.lang.Long roleId) {
		Assert.notNull(roleId);

		Criteria<SysRoleUserCriteria> criteria = new Criteria<SysRoleUserCriteria>();
		SysRoleUserCriteria sysRoleUserCriteria = criteria.createCriteria(SysRoleUserCriteria.class);
		sysRoleUserCriteria.andRoleIdEqualTo(roleId);

		return this.deleteByCriteria(criteria);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.pkusoft.admin.service.SysRoleUserService#deleteSysRoleUserByUserId
	 * (java.lang.Long[])
	 */
	public int deleteSysRoleUserByUserId(java.lang.Long userId) {
		Assert.notNull(userId);

		Criteria<SysRoleUserCriteria> criteria = new Criteria<SysRoleUserCriteria>();
		SysRoleUserCriteria sysRoleUserCriteria = criteria.createCriteria(SysRoleUserCriteria.class);
		sysRoleUserCriteria.andUserIdEqualTo(userId);

		return this.deleteByCriteria(criteria);
	}

}