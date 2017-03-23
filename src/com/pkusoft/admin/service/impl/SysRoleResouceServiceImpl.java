package com.pkusoft.admin.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;


import com.pkusoft.framework.dao.BaseMapper;
import com.pkusoft.framework.User;
import com.pkusoft.framework.util.MaxIdUtils;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.service.impl.BaseServiceImpl;
import com.pkusoft.admin.dao.SysRoleResouceMapper;
import com.pkusoft.admin.model.SysRoleResouce;
import com.pkusoft.admin.model.SysRoleResouceCriteria;
import com.pkusoft.admin.service.SysRoleResouceService;
import com.pkusoft.common.constants.IdType;

/**
 * 服务实现类
 * 
 * @author
 * 
 */
@Service("sysRoleResouceService")
@Transactional
public class SysRoleResouceServiceImpl extends BaseServiceImpl<SysRoleResouce>
        implements SysRoleResouceService {
	/** 数据访问接口 */
	@Autowired
	private SysRoleResouceMapper sysRoleResouceMapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pkusoft.framework.service.BaseService#getMapper()
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public BaseMapper<SysRoleResouce> getMapper() {
		return this.sysRoleResouceMapper;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.pkusoft.admin.service.SysRoleResouceService#insertSysRoleResouce(
	 * java.lang.Long, java.lang.Long)
	 */
	public int insertSysRoleResouce(Long roleId, Long[] resouceId) {
		Assert.notNull(roleId);
		
		// 先删除该角色所有菜单项
		Criteria<SysRoleResouceCriteria> criteria = new Criteria<SysRoleResouceCriteria>();
		SysRoleResouceCriteria sysRoleResouceCriteria = criteria.createCriteria(SysRoleResouceCriteria.class);
		sysRoleResouceCriteria.andRoleIdEqualTo(roleId);
		this.deleteByCriteria(criteria);
		if ( null == resouceId ) {
			return 0;
		}
		// 再新增
		for (int i = 0; i < resouceId.length; i++) {
			SysRoleResouce sysRoleResouce = new SysRoleResouce();
			sysRoleResouce.setRoleResourceId(MaxIdUtils.getLongMaxIdA(IdType.SYS_ROLE_RESOURCE));
			sysRoleResouce.setRoleId(roleId);
			sysRoleResouce.setResouceId(resouceId[i]);
			sysRoleResouce.setAddUserId(User.getUserId());
			sysRoleResouce.setAddUserName(User.getUserName());
			sysRoleResouce.setAddTime(new Date());
			sysRoleResouceMapper.insert(sysRoleResouce);
		}
		return resouceId.length;
	}

}