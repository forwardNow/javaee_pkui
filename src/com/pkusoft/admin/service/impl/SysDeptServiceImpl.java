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

import com.pkusoft.admin.dao.SysDeptMapper;
import com.pkusoft.admin.model.SysDept;
import com.pkusoft.admin.model.SysDeptCriteria;
import com.pkusoft.admin.service.SysDeptService;
import com.pkusoft.framework.dao.BaseMapper;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.framework.service.impl.BaseServiceImpl;
import com.pkusoft.framework.util.MapUtils;
import com.pkusoft.framework.util.StringUtils;

/**
 * 单位管理服务实现类
 * 
 * @author 
 *
 */
@Service("sysDeptService")
@Transactional
public class SysDeptServiceImpl extends BaseServiceImpl<SysDept> implements SysDeptService {
	/** 单位管理数据访问接口  */
	@Autowired
	private SysDeptMapper sysDeptMapper;

	/* (non-Javadoc)
	 * @see com.pkusoft.framework.service.BaseService#getMapper()
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public BaseMapper<SysDept> getMapper() {
		return this.sysDeptMapper;
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysDeptService#getSysDeptList(com.pkusoft.framework.model.Criteria)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysDept> getSysDeptList(Criteria<?> criteria){
		//WebUtils.setUserDataPermit(DataPermitType.SYS_DEPT_LIST, criteria);
		
		List<SysDept> list = this.getListByCriteria(criteria);
		
		Pager pager = criteria.getPager();
		if(pager != null){
			int count = this.getCountByCriteria(criteria);
			pager.setTotalRecords(count);
		}
		return list;
	}
			
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysDeptService#saveSysDept(com.pkusoft.admin.model.SysDept)
	 */
	public int insertSysDept(SysDept sysDept){

		//单位树级别--上级单位级别  + 1
		//long deptTreeLevel = this.get(sysDept.getParentDeptId()).getTreeLevel();
		//sysDept.setTreeLevel(deptTreeLevel + 1);

		// 排序字段用不到，默认设置为0
		sysDept.setOrderFlag(0L); 
		
		// 处理所属市局、分局、派出所
		
		//操作人员信息
		//sysDept.setAddUserId(User.getUserId());
		//sysDept.setAddUserName(User.getUserName());
		sysDept.setAddTime(new Date());
		
		int re = sysDeptMapper.insert(sysDept);
		
		
		return re;
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysDeptService#updateSysDept(com.pkusoft.admin.model.SysDept)
	 */
	public int updateSysDept(String oldDeptId, SysDept sysDept) {
		Assert.notNull(sysDept);
		Assert.notNull(oldDeptId, "单位编号不能为空");
		
		// 处理数据归属
		if(StringUtils.hasText(sysDept.getDataTunitid())){
			SysDept dataTunit = this.get(sysDept.getDataTunitid());
			sysDept.setDataCunitid(dataTunit.getCunitid());
			sysDept.setDataSunitid(dataTunit.getSunitid());
		}
		
		Criteria<SysDeptCriteria> criteria = new Criteria<SysDeptCriteria>();
		SysDeptCriteria sysDeptCriteria = criteria.createCriteria(SysDeptCriteria.class);
		sysDeptCriteria.andDeptIdEqualTo(oldDeptId);
		
		SysDept oldSysDept = this.get(oldDeptId);
		Map<String,Object> sysDeptMap = MapUtils.toMapTrimNull(sysDept);
		MapUtils.apply(sysDeptMap, oldSysDept);
		
		//操作人员信息
		//oldSysDept.setModifyUserId(User.getUserId());
		//oldSysDept.setModifyUserName(User.getUserName());
		oldSysDept.setModifyTime(new Date());
		
		int count = this.updateByCriteria(oldSysDept, criteria);
		
		// 刷新缓存
		
		return count;
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysDeptService#deleteSysDept(java.lang.Long[])
	 */
	@SuppressWarnings("unchecked")
	public int deleteSysDept(String[] deptId) {
		Assert.notNull(deptId);
		
		Criteria<SysDeptCriteria> criteria = new Criteria<SysDeptCriteria>();
		SysDeptCriteria sysDeptCriteria = criteria.createCriteria(SysDeptCriteria.class);
		sysDeptCriteria.andDeptIdIn(CollectionUtils.arrayToList(deptId));
		return this.deleteByCriteria(criteria);
	}
}