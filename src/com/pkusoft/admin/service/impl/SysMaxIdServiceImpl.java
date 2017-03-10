package com.pkusoft.admin.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.pkusoft.admin.dao.SysMaxIdMapper;
import com.pkusoft.admin.model.SysMaxId;
import com.pkusoft.admin.model.SysMaxIdCriteria;
import com.pkusoft.admin.service.SysMaxIdService;
import com.pkusoft.framework.dao.BaseMapper;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.framework.service.impl.BaseServiceImpl;

/**
 * 服务实现类
 * @author 
 *
 */
@Service("sysMaxIdService")
@Transactional
public class SysMaxIdServiceImpl extends BaseServiceImpl<SysMaxId> implements SysMaxIdService{
	/** 数据访问接口  */
	@Autowired
	private SysMaxIdMapper sysMaxIdMapper;
	
	/* (non-Javadoc)
	 * @see com.pkusoft.framework.service.BaseService#getMapper()
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public BaseMapper<SysMaxId> getMapper() {
		return this.sysMaxIdMapper;
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysMaxIdService#getSysMaxIdList(com.pkusoft.admin.model.SysMaxId, com.pkusoft.framework.model.Pager)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysMaxId> getSysMaxIdList(SysMaxId sysMaxId, Pager pager) {
		Criteria<SysMaxIdCriteria> criteria = new Criteria<SysMaxIdCriteria>();
		criteria.setPager(pager);
		SysMaxIdCriteria sysMaxIdCriteria = criteria.createCriteria(SysMaxIdCriteria.class);
		if(sysMaxId.getIdType() != null && !"".equals(sysMaxId.getIdType())){
			sysMaxIdCriteria.andIdTypeEqualTo(sysMaxId.getIdType());
		}		
		if(sysMaxId.getIdPara1() != null && !"".equals(sysMaxId.getIdPara1())){
			Map<String,Object> params = new HashMap<String,Object>();
			params.put("idType", sysMaxId.getIdType());
			params.put("idPara1", sysMaxId.getIdPara1());
			params.put("pager", pager);
			return this.sysMaxIdMapper.getByPara1(params);
		}
		List<SysMaxId> list = this.getListByCriteria(criteria);
		
		int count = this.getCountByCriteria(criteria);
		pager.setTotalRecords(count);
		
		return list;
	}
	
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysMaxIdService#saveSysMaxId(com.pkusoft.admin.model.SysMaxId)
	 */
	public int insertSysMaxId(SysMaxId sysMaxId){
		Assert.notNull(sysMaxId);
		
		return sysMaxIdMapper.insert(sysMaxId);
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysMaxIdService#updateSysMaxId(com.pkusoft.admin.model.SysMaxId)
	 */
	public int updateSysMaxId(SysMaxId sysMaxId) {
		Assert.notNull(sysMaxId.getIdType());
		Assert.notNull(sysMaxId.getIdPara1());
		Assert.notNull(sysMaxId.getIdPara2());
		
		return this.sysMaxIdMapper.updateSelective(sysMaxId);
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysMaxIdService#deleteSysMaxId(java.lang.Long[])
	 */
	@SuppressWarnings("unchecked")
	public int deleteSysMaxId(SysMaxId sysMaxId) {
		Assert.notNull(sysMaxId.getIdType());
		Assert.notNull(sysMaxId.getIdPara1());
		Assert.notNull(sysMaxId.getIdPara2());
		
		return this.delete(sysMaxId);
	}
	
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysMaxIdService#getSysMaxIdDetail(com.pkusoft.admin.model.SysMaxId)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public SysMaxId getSysMaxIdDetail(SysMaxId sysMaxId) {
		sysMaxId = this.sysMaxIdMapper.getSysMaxIdDetail(sysMaxId);
		return sysMaxId;
	}

}