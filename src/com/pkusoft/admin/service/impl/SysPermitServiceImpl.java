package com.pkusoft.admin.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import com.pkusoft.framework.dao.BaseMapper;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.User;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.framework.util.MapUtils;
import com.pkusoft.framework.util.MaxIdUtils;
import com.pkusoft.framework.util.StringUtils;
import com.pkusoft.framework.service.impl.BaseServiceImpl;
import com.pkusoft.admin.dao.SysPermitMapper;
import com.pkusoft.admin.model.SysPermit;
import com.pkusoft.admin.model.SysPermitCriteria;
import com.pkusoft.admin.service.SysPermitService;
import com.pkusoft.common.constants.IdType;

/**
 * 服务实现类
 * @author 
 *
 */
@Service("sysPermitService")
@Transactional
public class SysPermitServiceImpl extends BaseServiceImpl<SysPermit> implements SysPermitService{
	/** 数据访问接口  */
	@Autowired
	private SysPermitMapper sysPermitMapper;
	
	/* (non-Javadoc)
	 * @see com.pkusoft.framework.service.BaseService#getMapper()
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public BaseMapper<SysPermit> getMapper() {
		return this.sysPermitMapper;
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysPermitService#getSysPermitList(com.pkusoft.admin.model.SysPermit, com.pkusoft.framework.model.Pager)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysPermit> getSysPermitList(SysPermit sysPermit, Pager pager) {
		Criteria<SysPermitCriteria> criteria = new Criteria<SysPermitCriteria>();
		criteria.setPager(pager);
		SysPermitCriteria sysPermitCriteria = criteria.createCriteria(SysPermitCriteria.class);
				
		List<SysPermit> list = this.getListByCriteria(criteria);
		
		int count = this.getCountByCriteria(criteria);
		pager.setTotalRecords(count);
		
		return list;
	}
	
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysPermitService#saveSysPermit(com.pkusoft.admin.model.SysPermit)
	 */
	public int insertSysPermit(SysPermit sysPermit){
		Assert.notNull(sysPermit);
		
		sysPermit.setPermitId(MaxIdUtils.getLongMaxIdA(IdType.SYS_PERMIT));
		sysPermit.setOrderFlag(new Long(getAllCount() + 1));
		sysPermit.setAddUserId(User.getUserId());
		sysPermit.setAddUserName(User.getUserName());
		sysPermit.setAddTime(new Date());
		
		return sysPermitMapper.insert(sysPermit);
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysPermitService#updateSysPermit(com.pkusoft.admin.model.SysPermit)
	 */
	public int updateSysPermit(SysPermit sysPermit) {
		Assert.notNull(sysPermit);
		Assert.notNull(sysPermit.getPermitId());
		
		SysPermit oldSysPermit = this.get(sysPermit.getPermitId());
		
		Map<String,Object> sysPermitMap = MapUtils.toMapTrimNull(sysPermit);
		MapUtils.apply(sysPermitMap, oldSysPermit);
		
		// 修改用户信息
		oldSysPermit.setModifyUserId(User.getUserId());
		oldSysPermit.setModifyUserName(User.getUserName());
		oldSysPermit.setModifyTime(new Date());
		
		return this.update(oldSysPermit);
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysPermitService#deleteSysPermit(java.lang.Long[])
	 */
	@SuppressWarnings("unchecked")
	public int deleteSysPermit(java.lang.Long[] permitId) {
		Assert.notNull(permitId);
		
		Criteria<SysPermitCriteria> criteria = new Criteria<SysPermitCriteria>();
		SysPermitCriteria sysPermitCriteria = criteria.createCriteria(SysPermitCriteria.class);
		sysPermitCriteria.andPermitIdIn(CollectionUtils.arrayToList(permitId));
		
		return this.deleteByCriteria(criteria);
	}
	
	/**
	 * 总记录数
	 * @return 记录数
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	private int getAllCount(){
		Criteria<SysPermitCriteria> criteria = new Criteria<SysPermitCriteria>();
		return this.getCountByCriteria(criteria);
	}
}