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

import com.pkusoft.admin.dao.SysResourceMapper;
import com.pkusoft.admin.model.SysResource;
import com.pkusoft.admin.model.SysResourceCriteria;
import com.pkusoft.admin.service.SysResourceService;
import com.pkusoft.admin.service.SysRoleService;
import com.pkusoft.common.constants.IdType;
import com.pkusoft.framework.User;
import com.pkusoft.framework.dao.BaseMapper;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.framework.service.impl.BaseServiceImpl;
import com.pkusoft.framework.util.MapUtils;
import com.pkusoft.framework.util.MaxIdUtils;
import com.pkusoft.framework.util.StringUtils;

/**
 * 服务实现类
 * @author 
 *
 */
@Service("sysResourceService")
@Transactional
public class SysResourceServiceImpl extends BaseServiceImpl<SysResource> implements SysResourceService{
	/** 数据访问接口  */
	@Autowired
	private SysResourceMapper sysResourceMapper;
	
	/**角色访问接口*/
	@Autowired
	private SysRoleService sysRoleService;
	
	/* (non-Javadoc)
	 * @see com.pkusoft.framework.service.BaseService#getMapper()
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public BaseMapper<SysResource> getMapper() {
		return this.sysResourceMapper;
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysResourceService#getSysResourceList(com.pkusoft.admin.model.SysResource, com.pkusoft.framework.model.Pager)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysResource> getSysResourceList(SysResource sysResource, Pager pager) {
		Criteria<SysResourceCriteria> criteria = new Criteria<SysResourceCriteria>();
		criteria.setPager(pager);
		SysResourceCriteria sysResourceCriteria = criteria.createCriteria(SysResourceCriteria.class);
		if (StringUtils.hasText(sysResource.getResourceName())) {	
			sysResourceCriteria.andResourceNameLike("%"+sysResource.getResourceName()+"%");
		}
		
		List<SysResource> list = this.getListByCriteria(criteria);
		int count = this.getCountByCriteria(criteria);
		pager.setTotalRecords(count);
		return list;
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysResourceService#saveSysResource(com.pkusoft.admin.model.SysResource)
	 */
	public int insertSysResource(SysResource sysResource){
		//资源标识号
		long resourceId = MaxIdUtils.getLongMaxIdA(IdType.SYS_REOUSRCE);
		sysResource.setResourceId(resourceId);
		
		//排序--随单位标识号从小到大排列
		long orderFlag = resourceId;
		sysResource.setOrderFlag(orderFlag);		
		
		//录入用户信息
		sysResource.setAddUserId(User.getUserId());
		sysResource.setAddUserName(User.getUserName());
		sysResource.setAddTime(new Date());
		return sysResourceMapper.insert(sysResource);
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysResourceService#updateSysResource(com.pkusoft.admin.model.SysResource)
	 */
	public int updateSysResource(SysResource sysResource) {
		Assert.notNull(sysResource);
		Assert.notNull(sysResource.getResourceId(),"资源编号不能为空");
		
		SysResource oldSysResource = this.get(sysResource.getResourceId());
		
		Map<String,Object> sysResourceMap = MapUtils.toMapTrimNull(sysResource);
		MapUtils.apply(sysResourceMap, oldSysResource);
		
		// 修改用户信息
		/*
		oldSysResource.setModifyUserId(User.getUserId());
		oldSysResource.setModifyUserName(User.getUserName());
		oldSysResource.setModifyTime(new Date());
		*/
		
		return this.update(oldSysResource);
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysResourceService#deleteSysResource(java.lang.Long[])
	 */
	@SuppressWarnings("unchecked")
	public int deleteSysResource(java.lang.Long[] resourceId) {
		Assert.notNull(resourceId);
		
		Criteria<SysResourceCriteria> criteria = new Criteria<SysResourceCriteria>();
		SysResourceCriteria sysResourceCriteria = criteria.createCriteria(SysResourceCriteria.class);
		sysResourceCriteria.andResourceIdIn(CollectionUtils.arrayToList(resourceId));
		
		return this.deleteByCriteria(criteria);
	}
	
	
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysDicListService#checkSysDicListForm(java.lang.String)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public boolean sysResourceCheckName(String resourceName) {
		if(resourceName != null && !"".equals(resourceName)){
			Pager pager = new Pager();
			pager.setLimit(20);
			
			SysResource sysResource = new SysResource();
			Criteria<SysResourceCriteria> criteria = new Criteria<SysResourceCriteria>();
			criteria.setPager(pager);
			
			SysResourceCriteria sysResourceCriteria = criteria.createCriteria(SysResourceCriteria.class);		
			
			sysResourceCriteria.andResourceNameEqualTo(resourceName);
			List<SysResource> list = this.getListByCriteria(criteria);
			if (list != null && list.size() > 0){
				return true;			
			}
		}
		return false;
		
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysResourceService#getResourceListByUserId(java.lang.Long)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysResource> getResourceListByUserId(Long userId) {
		Assert.notNull(userId);
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("userId", userId);
		return sysResourceMapper.getResourceListByUserId(params);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysResourceService#getResourceListByRole(java.lang.Long)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
    public List getResourceListByRole(Long roleId){
    	Assert.notNull(roleId);
		Map<String, Object> params = new HashMap<String, Object>();
		
		//params.put("roleLevel", sysRoleService.get(roleId).getRoleLevel());
		params.put("roleId", roleId);
		return sysResourceMapper.getResourceListByRole(params);
	}
    
    
}