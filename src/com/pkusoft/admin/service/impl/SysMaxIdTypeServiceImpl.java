package com.pkusoft.admin.service.impl;

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
import com.pkusoft.admin.dao.SysMaxIdTypeMapper;
import com.pkusoft.admin.model.SysMaxIdType;
import com.pkusoft.admin.model.SysMaxIdTypeCriteria;
//import com.pkusoft.admin.model.SysPara;
//import com.pkusoft.admin.model.SysParaCriteria;
import com.pkusoft.admin.service.SysMaxIdTypeService;
import com.pkusoft.common.constants.IdType;

/**
 * 服务实现类
 * @author 
 *
 */
@Service("sysMaxIdTypeService")
@Transactional
public class SysMaxIdTypeServiceImpl extends BaseServiceImpl<SysMaxIdType> implements SysMaxIdTypeService{
	/** 数据访问接口  */
	@Autowired
	private SysMaxIdTypeMapper sysMaxIdTypeMapper;

	/* (non-Javadoc)
	 * @see com.pkusoft.framework.service.BaseService#getMapper()
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public BaseMapper<SysMaxIdType> getMapper() {
		return this.sysMaxIdTypeMapper;
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysMaxIdTypeService#getSysMaxIdTypeList(com.pkusoft.admin.model.SysMaxIdType, com.pkusoft.framework.model.Pager)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysMaxIdType> getSysMaxIdTypeList(SysMaxIdType sysMaxIdType, Pager pager) {
		Criteria<SysMaxIdTypeCriteria> criteria = new Criteria<SysMaxIdTypeCriteria>();
		criteria.setPager(pager);
		SysMaxIdTypeCriteria sysMaxIdTypeCriteria = criteria.createCriteria(SysMaxIdTypeCriteria.class);
		List<SysMaxIdType> list = null;
		if(StringUtils.hasText(sysMaxIdType.getIdName())){
			sysMaxIdTypeCriteria.andIdNameLike("%"+sysMaxIdType.getIdName()+"%");
			return this.getListByCriteria(criteria);
		}
		list = this.getListByCriteria(criteria);
		int count = this.getCountByCriteria(criteria);
		pager.setTotalRecords(count);
		
		return list;
	}
	
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysMaxIdTypeService#saveSysMaxIdType(com.pkusoft.admin.model.SysMaxIdType)
	 */
	public int insertSysMaxIdType(SysMaxIdType sysMaxIdType){
		Assert.notNull(sysMaxIdType);
		
		return sysMaxIdTypeMapper.insert(sysMaxIdType);
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysMaxIdTypeService#updateSysMaxIdType(com.pkusoft.admin.model.SysMaxIdType)
	 */
	public int updateSysMaxIdType(SysMaxIdType sysMaxIdType) {
		Assert.notNull(sysMaxIdType);
		Assert.notNull(sysMaxIdType.getIdType());
		
		SysMaxIdType oldSysMaxIdType = this.get(sysMaxIdType.getIdType());
		
		Map<String,Object> sysMaxIdTypeMap = MapUtils.toMapTrimNull(sysMaxIdType);
		MapUtils.apply(sysMaxIdTypeMap, oldSysMaxIdType);
		
		// 修改用户信息
		/*
		oldSysMaxIdType.setModifyUserId(User.getUserId());
		oldSysMaxIdType.setModifyUserName(User.getUserName());
		oldSysMaxIdType.setModifyTime(new Date());
		*/
		
		return this.update(oldSysMaxIdType);
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysMaxIdTypeService#deleteSysMaxIdType(java.lang.Long[])
	 */
	@SuppressWarnings("unchecked")
	public int deleteSysMaxIdType(java.lang.String[] idType) {
		Assert.notNull(idType);
		
		Criteria<SysMaxIdTypeCriteria> criteria = new Criteria<SysMaxIdTypeCriteria>();
		SysMaxIdTypeCriteria sysMaxIdTypeCriteria = criteria.createCriteria(SysMaxIdTypeCriteria.class);
		sysMaxIdTypeCriteria.andIdTypeIn(CollectionUtils.arrayToList(idType));
		
		return this.deleteByCriteria(criteria);
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysMaxIdTypeService#checkSysMaxIdName(java.lang.Long)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public boolean checkSysMaxIdType(String idType) {
		if(idType != null && !"".equals(idType)){
			Pager pager = new Pager();
			pager.setLimit(20);
			SysMaxIdType sysMaxIdType = new SysMaxIdType();
			sysMaxIdType.setIdName(idType);
			Criteria<SysMaxIdTypeCriteria> criteria = new Criteria<SysMaxIdTypeCriteria>();
			criteria.setPager(pager);
			SysMaxIdTypeCriteria sysMaxIdTypeCriteria = criteria.createCriteria(SysMaxIdTypeCriteria.class);
			sysMaxIdTypeCriteria.andIdTypeEqualTo(idType);
			List<SysMaxIdType> list = this.getListByCriteria(criteria);
			if (list != null && list.size() > 0){
				return true;			
			}
		}
		return false;
		
	}
	

}