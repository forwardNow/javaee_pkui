package com.pkusoft.admin.service.impl;

import java.util.ArrayList;
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

import com.pkusoft.admin.dao.SysDeptMapper;
import com.pkusoft.admin.model.SysDept;
import com.pkusoft.admin.model.SysDeptCriteria;
import com.pkusoft.admin.model.SysDeptLevel;
import com.pkusoft.admin.model.SysDeptReleCriteria;
import com.pkusoft.admin.service.SysDeptReleService;
import com.pkusoft.admin.service.SysDeptService;
import com.pkusoft.common.constants.Common;
import com.pkusoft.common.constants.DataPermitType;
import com.pkusoft.common.constants.ErrorCode;
import com.pkusoft.framework.User;
import com.pkusoft.framework.constants.General;
import com.pkusoft.framework.dao.BaseMapper;
import com.pkusoft.framework.exception.BizException;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.framework.service.impl.BaseServiceImpl;
import com.pkusoft.framework.util.DicUtils;
import com.pkusoft.framework.util.MapUtils;
import com.pkusoft.framework.util.StringUtils;
import com.pkusoft.framework.util.WebUtils;
//import com.pkusoft.common.cache.DeptCache;

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

	@Autowired
	private SysDeptReleService sysDeptReleService;

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
//		WebUtils.setUserDataPermit(DataPermitType.SYS_DEPT_LIST, criteria);
		
		List<SysDept> list = this.getListByCriteria(criteria);
		
		Pager pager = criteria.getPager();
		if(pager != null){
			int count = this.getCountByCriteria(criteria);
			pager.setTotalRecords(count);
		}
		return list;
	}
			
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysDeptService#getSysDeptList(com.pkusoft.admin.model.SysDept, com.pkusoft.framework.model.Pager)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysDept> getSysDeptList(SysDept sysDept, Pager pager) {
		Criteria<SysDeptCriteria> criteria = new Criteria<SysDeptCriteria>();
		criteria.setPager(pager);
		criteria.setOrderByClause("DEPT_ID");
		SysDeptCriteria sysDeptCriteria = criteria.createCriteria(SysDeptCriteria.class);
		
		/*
		//查询条件限制
		if ( null != sysDept.getParentDeptId() ) {
			sysDeptCriteria.andParentDeptIdEqualTo(sysDept.getParentDeptId());
		}
		if (StringUtils.hasText(sysDept.getDeptName())) {
			sysDeptCriteria.andDeptNameLike("%" + sysDept.getDeptName() + "%");
		}
		if (StringUtils.hasText(sysDept.getDeptCode())) {
			sysDeptCriteria.andDeptCodeLike(sysDept.getDeptCode());
		}
		*/
		
		WebUtils.setUserDataPermit(DataPermitType.SYS_DEPT_LIST, criteria);

		List<SysDept> list = this.getListByCriteria(criteria);
		int count = this.getCountByCriteria(criteria);
		pager.setTotalRecords(count);
		
		return list;
	}

	/*
	 * (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysDeptService#getSubDeptList(java.lang.Long, com.pkusoft.framework.model.Pager)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysDept> getSubDeptList(String deptId, String isMainDept, Pager pager){
		Criteria<SysDeptCriteria> criteria = new Criteria<SysDeptCriteria>();
		criteria.setPager(pager);
		SysDeptCriteria sysDeptCriteria = criteria.createCriteria(SysDeptCriteria.class);

		String qryDeptLevel = String.valueOf(Integer.valueOf(sysDeptMapper.get(deptId).getDeptLevel()) + 1);
		sysDeptCriteria.andDeptLevelEqualTo(qryDeptLevel);
		sysDeptCriteria.andParentDeptIdEqualTo(deptId);
		
		//sysDeptCriteria.andIsMainDeptNotEqualTo(isMainDept);
		
		List<SysDept> list = this.getListByCriteria(criteria);
		int count = this.getCountByCriteria(criteria);
		pager.setTotalRecords(count);
		
		return list;
	}
	
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysDeptService#saveSysDept(com.pkusoft.admin.model.SysDept)
	 */
	public int insertSysDept(SysDept sysDept){

		//单位树级别--上级单位级别  + 1
		long deptTreeLevel = this.get(sysDept.getParentDeptId()).getTreeLevel();
		sysDept.setTreeLevel(deptTreeLevel + 1);

		// 排序字段用不到，默认设置为0
		sysDept.setOrderFlag(0L); 
		
		// 处理所属市局、分局、派出所
		String deptLevel = sysDept.getDeptLevel();
		if(General.YES.equals(sysDept.getIsMainDept())){
			// 新增的单位为某个级别的主管单位
			SysDept mainDept = null;
			if(Common.CUNIT_LEVEL.equals(deptLevel)){
				mainDept = getMainDeptByLevel(sysDept.getParentDeptId(),Common.PUNIT_LEVEL);
				checkMainDept(mainDept, Common.PUNIT_LEVEL);
				sysDept.setCunitid(sysDept.getDeptId());
			}else if(Common.SUNIT_LEVEL.equals(deptLevel)){
				mainDept = getMainDeptByLevel(sysDept.getParentDeptId(),Common.CUNIT_LEVEL);
				checkMainDept(mainDept, Common.CUNIT_LEVEL);
				sysDept.setCunitid(mainDept.getCunitid());
				sysDept.setSunitid(sysDept.getDeptId());
			}else if(Common.TUNIT_LEVEL.equals(deptLevel)){
				mainDept = getMainDeptByLevel(sysDept.getParentDeptId(),Common.SUNIT_LEVEL);
				checkMainDept(mainDept, Common.SUNIT_LEVEL);
				sysDept.setCunitid(mainDept.getCunitid());
				sysDept.setSunitid(mainDept.getSunitid());
				sysDept.setTunitid(sysDept.getDeptId());
			}
			
		}else{
			// 若新增非主管单位，将所属市局、分局、派出所设置成与主管单位相同
			SysDept mainDept = getMainDeptByLevel(sysDept.getParentDeptId(),deptLevel);
			checkMainDept(mainDept, deptLevel);
			sysDept.setCunitid(mainDept.getCunitid());
			sysDept.setSunitid(mainDept.getSunitid());
			sysDept.setTunitid(mainDept.getTunitid());
		}
		
		//操作人员信息
		sysDept.setAddUserId(User.getUserId());
		sysDept.setAddUserName(User.getUserName());
		sysDept.setAddTime(new Date());
		
		int re = sysDeptMapper.insert(sysDept);
		
		// 刷新缓存
		// DeptCache.set(sysDept.getDeptId());
		
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
		oldSysDept.setModifyUserId(User.getUserId());
		oldSysDept.setModifyUserName(User.getUserName());
		oldSysDept.setModifyTime(new Date());
		
		int count = this.updateByCriteria(oldSysDept, criteria);
		
		// 刷新缓存
		//DeptCache.refresh(sysDept.getDeptId());
		
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
		//删除对应ReleDept表的数据
		Criteria<SysDeptReleCriteria> criteriaRele = new Criteria<SysDeptReleCriteria>();
		SysDeptReleCriteria sysDeptReleCriteria = criteriaRele.createCriteria(SysDeptReleCriteria.class);
		sysDeptReleCriteria.andDeptIdIn(CollectionUtils.arrayToList(deptId));
		sysDeptReleService.deleteByCriteria(criteriaRele);
		// 刷新缓存
		for (int i = 0; i < deptId.length; i++) {
			//DeptCache.remove(deptId[i]);
		}
	
		return this.deleteByCriteria(criteria);
	}
		
	/*
	 * (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysDeptService#createDeptDic()
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public boolean createDeptDic(String dicName){

		Criteria<SysDeptCriteria> criteria = new Criteria<SysDeptCriteria>();
		criteria.setOrderByClause("DEPT_ID");
		List<SysDept> deptList = this.getListByCriteria(criteria);
		
		return DicUtils.createDicXml(dicName, deptList, "deptId", "deptName");
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysDeptService#getDeptLevelDic()
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysDeptLevel> getDeptLevelDic(){
		List<SysDeptLevel> deptLevelList = new ArrayList<SysDeptLevel>();
		int userLevel = Integer.valueOf(User.getUserLevel());
		/*if( Common.PUNIT_LEVEL > userLevel ){
			deptLevelList.add(new SysDeptLevel(Common.SUPER_LAVEL, Common.SUPER_NAME));
		}
		if( Common.CUNIT_LEVEL > userLevel ){
			deptLevelList.add(new SysDeptLevel(Common.PUNIT_LEVEL, Common.PUNIT_NAME));
		}
		if( Common.SUNIT_LEVEL > userLevel ){
			deptLevelList.add(new SysDeptLevel(Common.CUNIT_LEVEL, Common.CUNIT_NAME));
		}
		if( Common.TUNIT_LEVEL > userLevel ){
			deptLevelList.add(new SysDeptLevel(Common.SUNIT_LEVEL, Common.SUNIT_NAME));
		}
		deptLevelList.add(new SysDeptLevel(Common.TUNIT_LEVEL, Common.TUNIT_NAME));*/
		return deptLevelList;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysDeptService#getDeptDic()
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysDept> getDeptDic(String deptId, String deptLevel,String releType){
		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("deptId", deptId);
		if("0".equals(releType) || "0".equals(deptLevel)){ // 指定按级别查，或者公安部级别
			params.put("deptLevel", deptLevel);
			return sysDeptMapper.getReleDeptListByLevel(params);
		}else if("1".equals(releType)){
			params.put("deptLevel", deptLevel);
			int pl = Integer.parseInt(deptLevel) - 1;
			params.put("deptLevelParent", String.valueOf(pl));
			params.put("isMainDeptParent", "1");
			return sysDeptMapper.getReleDeptListByLevel(params);
		}else if("2".equals(releType)){
			return sysDeptMapper.getReleDeptListByParent(params);
		}else if("3".equals(releType)){
			return sysDeptMapper.getReleDeptListBySub(params);
		}
		
		return null;
		
	}

	/*
	 * (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysDeptService#checkDeptInfo(java.lang.Long, java.lang.String, java.lang.String)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public boolean checkDeptInfo(String deptId, String fieldName, String fieldValue){

		List<SysDept> deptList = new ArrayList<SysDept>();
		Criteria<SysDeptCriteria> criteria = new Criteria<SysDeptCriteria>();
		SysDeptCriteria sysDeptCriteria = criteria.createCriteria(SysDeptCriteria.class);
		
		if (null == deptId) { // 新增
			if ("deptName".equals(fieldName)) {
				sysDeptCriteria.andDeptNameEqualTo(fieldValue);
			}
			if ("deptCode".equals(fieldName)) {
				//sysDeptCriteria.andDeptCodeEqualTo(fieldValue);
			}
			deptList = this.getListByCriteria(criteria);
		} else { // 修改
			SysDept sysDept = this.get(deptId);
			if ("deptName".equals(fieldName)) {
				sysDeptCriteria.andDeptNameNotEqualTo(sysDept.getDeptName());
				sysDeptCriteria.andDeptNameEqualTo(fieldValue);
			}
			if ("deptCode".equals(fieldName)) {
				//sysDeptCriteria.andDeptCodeNotEqualTo(sysDept.getDeptId());
				//sysDeptCriteria.andDeptCodeEqualTo(fieldValue);
			}
			deptList = this.getListByCriteria(criteria);
		}
		return deptList.size() == 0 ? true : false;
	}
	
	
	/**
	 * 获取单位的主管单位
	 * @param deptId
	 * @param deptLevel
	 * @return
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public SysDept getMainDeptByLevel(String deptId, String deptLevel){
		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("deptId", deptId);
		params.put("deptLevel", deptLevel);
		params.put("isMainDept", "1");
		
		List<SysDept> list = sysDeptMapper.getReleDeptListByLevel(params);
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
	private void checkMainDept(SysDept dept, String deptLevel){
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
	
	/**
	 * 根据depetId获取单位名称
	 * @param deptId
	 * @return
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysDept> getDeptName(String deptId){
		return sysDeptMapper.getSysDeptName(deptId);
	}
}