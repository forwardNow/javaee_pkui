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

import com.pkusoft.common.cache.DeptCache;
import com.pkusoft.common.constants.Common;
import com.pkusoft.common.constants.DataPermitType;
import com.pkusoft.common.constants.ErrorCode;
import com.pkusoft.framework.constants.General;
import com.pkusoft.framework.dao.BaseMapper;
import com.pkusoft.framework.exception.BizException;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.User;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.framework.util.DicUtils;
import com.pkusoft.framework.util.MapUtils;
import com.pkusoft.framework.util.StringUtils;
import com.pkusoft.framework.util.WebUtils;
import com.pkusoft.framework.service.impl.BaseServiceImpl;
import com.pkusoft.admin.dao.SysReleMapper;
import com.pkusoft.admin.model.SysRele;
import com.pkusoft.admin.model.SysReleCriteria;
import com.pkusoft.admin.model.SysDept;
import com.pkusoft.admin.model.SysDeptCriteria;
import com.pkusoft.admin.model.SysDeptReleCriteria;
import com.pkusoft.admin.service.SysReleService;
import com.pkusoft.admin.service.SysDeptReleService;

/**
 * 数据归属单位信息服务实现类
 * @author 
 *
 */
@Service("releService")
@Transactional
public class SysReleServiceImpl extends BaseServiceImpl<SysRele> implements SysReleService{
	/** 数据归属单位信息数据访问接口  */
    @Autowired
	private SysReleMapper releMapper;
    /** 数据归属单位服务类 */
	@Autowired
	private SysDeptReleService sysDeptReleService;
	/* (non-Javadoc)
	 * @see com.pkusoft.framework.service.BaseService#getMapper()
	 */
    @Transactional(propagation=Propagation.NOT_SUPPORTED)
	public BaseMapper<SysRele> getMapper() {
		return this.releMapper;
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.ReleService#getReleList(com.pkusoft.framework.model.Criteria)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysRele> getReleList(Criteria<?> criteria) {
		//WebUtils.setUserDataPermit(DataPermitType., criteria);
		
		List<SysRele> list = this.getListByCriteria(criteria);
		
		Pager pager = criteria.getPager();
		if(pager != null){
			int count = this.getCountByCriteria(criteria);
			pager.setTotalRecords(count);
		}
		
		return list;
	}
	
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.ReleService#saveRele(com.pkusoft.admin.model.Rele)
	 */
	public int insertRele(SysRele rele){

		//单位树级别--上级单位级别  + 1
		long deptTreeLevel = this.get(rele.getParentDeptId()).getTreeLevel();
		rele.setTreeLevel(deptTreeLevel + 1);

		// 排序字段用不到，默认设置为0
		rele.setOrderFlag(0L); 
		
		// 处理所属市局、分局、派出所
		String deptLevel = rele.getDeptLevel();
		
			/*// 若新增非主管单位，将所属市局、分局、派出所设置成与主管单位相同
			Rele mainDept = getMainDeptByLevel(rele.getParentDeptId(),deptLevel);
			checkMainDept(mainDept, deptLevel);*/
		if(General.YES.equals(rele.getIsMainDept())){
			// 新增的单位为某个级别的主管单位
			SysRele mainDept = null;
			if(Common.CUNIT_LEVEL.equals(deptLevel)){
				mainDept = getMainDeptByLevel(rele.getParentDeptId(),Common.PUNIT_LEVEL);
				checkMainDept(mainDept, Common.PUNIT_LEVEL);
				
			}else if(Common.SUNIT_LEVEL.equals(deptLevel)){
				mainDept = getMainDeptByLevel(rele.getParentDeptId(),Common.CUNIT_LEVEL);
				checkMainDept(mainDept, Common.CUNIT_LEVEL);
				
			}else if(Common.TUNIT_LEVEL.equals(deptLevel)){
				mainDept = getMainDeptByLevel(rele.getParentDeptId(),Common.SUNIT_LEVEL);
				checkMainDept(mainDept, Common.SUNIT_LEVEL);
			}
			
		}else{
			// 若新增非主管单位，将所属市局、分局、派出所设置成与主管单位相同
			SysRele mainDept = getMainDeptByLevel(rele.getParentDeptId(),deptLevel);
			checkMainDept(mainDept, deptLevel);
		}
		
		
		//操作人员信息
			rele.setAddUserId(User.getUserId());
			rele.setAddUserName(User.getUserName());
			rele.setAddTime(new Date());
		
		int re = releMapper.insert(rele);
		
		// 刷新缓存
		DeptCache.set(rele.getDeptId());
		
		return re;
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.ReleService#updateRele(com.pkusoft.admin.model.Rele)
	 */
	public int updateRele(SysRele rele,String oldReleId) {
		/*Assert.notNull(rele);
		Assert.notNull(rele.getDeptId());
		
		Rele oldRele = this.get(rele.getDeptId());
		
		Map<String,Object> releMap = MapUtils.toMapTrimNull(rele);
		MapUtils.apply(releMap, oldRele);
		
		// 修改用户信息
		
		oldRele.setModifyUserId(User.getUserId());
		oldRele.setModifyUserName(User.getUserName());
		oldRele.setModifyTime(new Date());
		
		
		return this.update(oldRele);*/
		Assert.notNull(rele);
		Assert.notNull(oldReleId, "单位编号不能为空");
		Criteria<SysReleCriteria> criteria = new Criteria<SysReleCriteria>();
		SysReleCriteria releCriteria = criteria.createCriteria(SysReleCriteria.class);
		releCriteria.andDeptIdEqualTo(oldReleId);
		
		SysRele oldRele = this.get(oldReleId);
		Map<String,Object> releMap = MapUtils.toMapTrimNull(rele);
		MapUtils.apply(releMap, oldRele);
		
		//操作人员信息
		oldRele.setModifyUserId(User.getUserId());
		oldRele.setModifyUserName(User.getUserName());
		oldRele.setModifyTime(new Date());
		
		int count = this.updateByCriteria(oldRele, criteria);
		
		// 刷新缓存
		DeptCache.refresh(oldRele.getDeptId());
		
		return count;
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.ReleService#deleteRele(java.lang.String[])
	 */
	public int deleteRele(String[] deptId) {
		Assert.notNull(deptId);

        int count = 0;
		for (int i = 0; i < deptId.length; i++) {
			
			count = count + this.delete(deptId[i]);
		}
		
		Criteria<SysDeptReleCriteria> criteria = new Criteria<SysDeptReleCriteria>();
		SysDeptReleCriteria sysDeptCriteria = criteria.createCriteria(SysDeptReleCriteria.class);
		sysDeptCriteria.andReleDeptIdIn(CollectionUtils.arrayToList(deptId));
		
		// 刷新缓存
		for (int i = 0; i < deptId.length; i++) {
			DeptCache.remove(deptId[i]);
		}
		
		sysDeptReleService.deleteByCriteria(criteria);
		
		return count;
	}

	@Override
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysRele> getReleDic(String deptId, String deptLevel,
			String releType) {
		// TODO Auto-generated method stub
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("deptId", deptId);
		if("0".equals(releType) || "0".equals(deptLevel)){ // 指定按级别查，或者公安部级别
			params.put("deptLevel", deptLevel);
			return releMapper.getReleDeptListByLevel(params);
		}else if("1".equals(releType)){
			params.put("deptLevel", deptLevel);
			int pl = Integer.parseInt(deptLevel) - 1;
			params.put("deptLevelParent", String.valueOf(pl));
			params.put("isMainDeptParent", "1");
			return releMapper.getReleDeptListByLevel(params);
		}else if("2".equals(releType)){
			return releMapper.getReleDeptListByParent(params);
		}else if("3".equals(releType)){
			return releMapper.getReleDeptListBySub(params);
		}
		
		return null;
	}

	@Override
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public boolean createReleDic(String dicName) {
		// TODO Auto-generated method stub
		Criteria<SysReleCriteria> criteria = new Criteria<SysReleCriteria>();
		criteria.setOrderByClause("DEPT_ID");
		List<SysRele> deptList = this.getListByCriteria(criteria);
		
		return DicUtils.createDicXml(dicName, deptList, "deptId", "deptName");
	}
	/**
	 * 获取单位的主管单位
	 * @param deptId
	 * @param deptLevel
	 * @return
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public SysRele getMainDeptByLevel(String deptId, String deptLevel){
		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("deptId", deptId);
		params.put("deptLevel", deptLevel);
		params.put("isMainDept", "1");
		
		List<SysRele> list = releMapper.getReleDeptListByLevel(params);
		if(!CollectionUtils.isEmpty(list)){
			return list.get(0);
		}
		
		return null;
		
	}
	/**
	 * 检查主管单位是否存在
	 * @param dept
	 * @param deptLevel
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	private void checkMainDept(SysRele dept, String deptLevel){
		if(dept == null){
			String name = "";
			if(Common.PUNIT_LEVEL.equals(deptLevel)){
				name = "省厅";
			}else if(Common.CUNIT_LEVEL.equals(deptLevel)){
				name = "市局";
			}else if(Common.SUNIT_LEVEL.equals(deptLevel)){
				name = "分局";
			}else if(Common.TUNIT_LEVEL.equals(deptLevel)){
				name = "派出所";
			}
			throw new BizException(ErrorCode.ERR_SYS_DEPT_ABSENCE_MAIN,"缺少" + name + "级别主管单位");
		}
	}
}