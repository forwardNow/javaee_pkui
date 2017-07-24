package com.pkusoft.admin.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import com.pkusoft.common.constants.DataPermitType;
import com.pkusoft.framework.dao.BaseMapper;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.User;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.framework.util.MapUtils;
import com.pkusoft.framework.util.StringUtils;
import com.pkusoft.framework.util.WebUtils;
import com.pkusoft.framework.service.impl.BaseServiceImpl;
import com.pkusoft.admin.dao.SysAccessSystemMapper;
import com.pkusoft.admin.model.SysAccessSystem;
import com.pkusoft.admin.model.SysAccessSystemCriteria;
import com.pkusoft.admin.service.SysAccessSystemService;

/**
 * 接入的系统服务实现类
 * @author 
 *
 */
@Service("sysAccessSystemService")
@Transactional
public class SysAccessSystemServiceImpl extends BaseServiceImpl<SysAccessSystem> implements SysAccessSystemService{
	/** 接入的系统数据访问接口  */
    @Autowired
	private SysAccessSystemMapper sysAccessSystemMapper;

	/* (non-Javadoc)
	 * @see com.pkusoft.framework.service.BaseService#getMapper()
	 */
    @Transactional(propagation=Propagation.NOT_SUPPORTED)
	public BaseMapper<SysAccessSystem> getMapper() {
		return this.sysAccessSystemMapper;
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysAccessSystemService#getSysAccessSystemList(com.pkusoft.framework.model.Criteria)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysAccessSystem> getSysAccessSystemList(Criteria<?> criteria) {
		
		List<SysAccessSystem> list = this.getListByCriteria(criteria);
		
		Pager pager = criteria.getPager();
		if(pager != null){
			int count = this.getCountByCriteria(criteria);
			pager.setTotalRecords(count);
		}
		
		return list;
	}
	
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysAccessSystemService#saveSysAccessSystem(com.pkusoft.admin.model.SysAccessSystem)
	 */
	public int insertSysAccessSystem(SysAccessSystem sysAccessSystem){
		Assert.notNull(sysAccessSystem);
		
		return sysAccessSystemMapper.insert(sysAccessSystem);
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysAccessSystemService#updateSysAccessSystem(com.pkusoft.admin.model.SysAccessSystem)
	 */
	public int updateSysAccessSystem(SysAccessSystem sysAccessSystem) {
		Assert.notNull(sysAccessSystem);
		Assert.notNull(sysAccessSystem.getSysId());
		
		SysAccessSystem oldSysAccessSystem = this.get(sysAccessSystem.getSysId());
		
		Map<String,Object> sysAccessSystemMap = MapUtils.toMapTrimNull(sysAccessSystem);
		MapUtils.apply(sysAccessSystemMap, oldSysAccessSystem);
		
		// 修改用户信息
		/*
		oldSysAccessSystem.setModifyUserId(User.getUserId());
		oldSysAccessSystem.setModifyUserName(User.getUserName());
		oldSysAccessSystem.setModifyTime(new Date());
		*/
		
		return this.update(oldSysAccessSystem);
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysAccessSystemService#deleteSysAccessSystem(java.lang.String[])
	 */
	public int deleteSysAccessSystem(java.lang.String[] sysId) {
		Assert.notNull(sysId);

        int count = 0;
		for (int i = 0; i < sysId.length; i++) {
			count = count + this.delete(sysId[i]);
		}
		return count;
	}
}