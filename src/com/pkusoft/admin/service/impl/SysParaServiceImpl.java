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

import com.pkusoft.admin.dao.SysParaMapper;
import com.pkusoft.admin.model.SysPara;
import com.pkusoft.admin.model.SysParaCriteria;
import com.pkusoft.admin.service.SysParaService;
import com.pkusoft.common.cache.SysParaCache;
import com.pkusoft.framework.User;
import com.pkusoft.framework.dao.BaseMapper;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.framework.service.impl.BaseServiceImpl;
import com.pkusoft.framework.util.MapUtils;
import com.pkusoft.framework.util.StringUtils;

/**
 * 服务实现类
 * @author 
 *
 */
@Service("sysParaService")
@Transactional
public class SysParaServiceImpl extends BaseServiceImpl<SysPara> implements SysParaService{
	/** 数据访问接口  */
	@Autowired
	private SysParaMapper sysParaMapper;
	
	/* (non-Javadoc)
	 * @see com.pkusoft.framework.service.BaseService#getMapper()
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public BaseMapper<SysPara> getMapper() {
		return this.sysParaMapper;
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysParaService#getSysParaList(com.pkusoft.admin.model.SysPara, com.pkusoft.framework.model.Pager)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysPara> getSysParaList(SysPara sysPara, Pager pager) {
		Criteria<SysParaCriteria> criteria = new Criteria<SysParaCriteria>();
		criteria.setPager(pager);
		SysParaCriteria sysParaCriteria = criteria.createCriteria(SysParaCriteria.class);
		List<SysPara> list = this.getListByCriteria(criteria);

		if(StringUtils.hasText(sysPara.getParaName())){
			sysParaCriteria.andParaNameLike("%"+sysPara.getParaName()+"%");
			return this.getListByCriteria(criteria);
		}
		list = this.getListByCriteria(criteria);	
		int count = this.getCountByCriteria(criteria);
		pager.setTotalRecords(count);
		
		return list;
	}
	
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysParaService#saveSysPara(com.pkusoft.admin.model.SysPara)
	 */
	public int insertSysPara(SysPara sysPara){
		Assert.notNull(sysPara);
		
		//sysPara.setParaCode(MaxIdUtils.getMaxIdA(IdType.SYS_PARA));
		
		//录入用户信息
		sysPara.setAddUserId(User.getUserId());
		sysPara.setAddUserName(User.getUserName());
		sysPara.setAddTime(new Date());
		
		int count = sysParaMapper.insert(sysPara);
		
		// 刷新缓存
		SysParaCache.set(sysPara.getParaCode());
		
		return count;
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysParaService#updateSysPara(com.pkusoft.admin.model.SysPara)
	 */
	public int updateSysPara(SysPara sysPara) {
		Assert.notNull(sysPara);
		Assert.notNull(sysPara.getParaCode());
		
		SysPara oldSysPara = this.get(sysPara.getParaCode());
		
		Map<String,Object> sysParaMap = MapUtils.toMapTrimNull(sysPara);
		MapUtils.apply(sysParaMap, oldSysPara);
		
		// 修改用户信息
		
		oldSysPara.setModifyUserId(User.getUserId());
		oldSysPara.setModifyUserName(User.getUserName());
		oldSysPara.setModifyTime(new Date());
		
		
		int count = this.update(oldSysPara);
		
		// 刷新缓存
		SysParaCache.refresh(sysPara.getParaCode());
		
		return count;
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysParaService#deleteSysPara(java.lang.Long[])
	 */
	@SuppressWarnings("unchecked")
	public int deleteSysPara(java.lang.String[] paraCode) {
		Assert.notNull(paraCode);
		
		Criteria<SysParaCriteria> criteria = new Criteria<SysParaCriteria>();
		SysParaCriteria sysParaCriteria = criteria.createCriteria(SysParaCriteria.class);
		sysParaCriteria.andParaCodeIn(CollectionUtils.arrayToList(paraCode));
		
		int count = this.deleteByCriteria(criteria);
		
		// 刷新缓存
		for (int i = 0; i < paraCode.length; i++) {
			SysParaCache.remove(paraCode[i]);
		}
		
		return count;
	}
	
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysParaService#checkSysParaForm(java.lang.String)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public boolean checkSysParaForm(String paraCode) {
		if(paraCode != null && !"".equals(paraCode)){
			Criteria<SysParaCriteria> criteria = new Criteria<SysParaCriteria>();
			SysParaCriteria sysParaCriteria = criteria.createCriteria(SysParaCriteria.class);
			sysParaCriteria.andParaCodeEqualTo(paraCode);
			
			return this.getCountByCriteria(criteria) > 0;			
		}
		return false;
		
	}

}