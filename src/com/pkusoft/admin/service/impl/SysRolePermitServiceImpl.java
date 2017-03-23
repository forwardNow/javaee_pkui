package com.pkusoft.admin.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import com.pkusoft.admin.dao.SysRolePermitMapper;
import com.pkusoft.admin.model.SysRolePermit;
import com.pkusoft.admin.model.SysRolePermitCriteria;
import com.pkusoft.admin.service.SysRolePermitService;
import com.pkusoft.common.constants.IdType;
import com.pkusoft.framework.User;
import com.pkusoft.framework.dao.BaseMapper;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.service.impl.BaseServiceImpl;
import com.pkusoft.framework.util.MapUtils;
import com.pkusoft.framework.util.MaxIdUtils;

/**
 * 服务实现类
 * @author 
 *
 */
@Service("sysRolePermitService")
@Transactional
public class SysRolePermitServiceImpl extends BaseServiceImpl<SysRolePermit> implements SysRolePermitService{
	/** 数据访问接口  */
	@Autowired
	private SysRolePermitMapper sysRolePermitMapper;

	/* (non-Javadoc)
	 * @see com.pkusoft.framework.service.BaseService#getMapper()
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public BaseMapper<SysRolePermit> getMapper() {
		return this.sysRolePermitMapper;
	}

    /* (non-Javadoc)
     * @see com.pkusoft.admin.service.SysRolePermitService#getPermitListByRoleId(java.lang.Long)
     */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
    public List<Map<String,Object>> getPermitListByRoleId(Long roleId){
    	Assert.notNull(roleId);
    	
    	Map<String, Object> params = new HashMap<String, Object>();
    	
    	params.put("roleId", roleId);
    	return sysRolePermitMapper.getPermitListByRoleId(params);
    }
	
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysRolePermitService#insertSysRolePermit(java.lang.Long, java.lang.Long[])
	 */
	public int insertSysRolePermit(Long roleId, Long[] permitId) {
		Assert.notNull(roleId);
		
		// 先删除该角色所有菜单项
		Criteria<SysRolePermitCriteria> criteria = new Criteria<SysRolePermitCriteria>();
		SysRolePermitCriteria SysRolePermitCriteria = criteria.createCriteria(SysRolePermitCriteria.class);
		SysRolePermitCriteria.andRoleIdEqualTo(roleId);
		this.deleteByCriteria(criteria);
		if ( null == permitId ) {
			return 0;
		}
		// 再新增
		for (int i = 0; i < permitId.length; i++) {
			SysRolePermit SysRolePermit = new SysRolePermit();
			SysRolePermit.setRolePermitId(MaxIdUtils.getLongMaxIdA(IdType.SYS_ROLE_PERMIT));
			SysRolePermit.setRoleId(roleId);
			SysRolePermit.setPermitId(permitId[i]);
			SysRolePermit.setAddUserId(User.getUserId());
			SysRolePermit.setAddUserName(User.getUserName());
			SysRolePermit.setAddTime(new Date());
			sysRolePermitMapper.insert(SysRolePermit);
		}
		return permitId.length;
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysRolePermitService#updateSysRolePermit(com.pkusoft.admin.model.SysRolePermit)
	 */
	public int updateSysRolePermit(SysRolePermit sysRolePermit) {
		Assert.notNull(sysRolePermit);
		Assert.notNull(sysRolePermit.getRolePermitId());
		
		SysRolePermit oldSysRolePermit = this.get(sysRolePermit.getRolePermitId());
		
		Map<String,Object> sysRolePermitMap = MapUtils.toMapTrimNull(sysRolePermit);
		MapUtils.apply(sysRolePermitMap, oldSysRolePermit);
		
		// 修改用户信息
		/*
		oldSysRolePermit.setModifyUserId(User.getUserId());
		oldSysRolePermit.setModifyUserName(User.getUserName());
		oldSysRolePermit.setModifyTime(new Date());
		*/
		
		return this.update(oldSysRolePermit);
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysRolePermitService#deleteSysRolePermit(java.lang.Long[])
	 */
	@SuppressWarnings("unchecked")
	public int deleteSysRolePermit(java.lang.Long[] rolePermitId) {
		Assert.notNull(rolePermitId);
		
		Criteria<SysRolePermitCriteria> criteria = new Criteria<SysRolePermitCriteria>();
		SysRolePermitCriteria sysRolePermitCriteria = criteria.createCriteria(SysRolePermitCriteria.class);
		sysRolePermitCriteria.andRolePermitIdIn(CollectionUtils.arrayToList(rolePermitId));
		
		return this.deleteByCriteria(criteria);
	}
	

}