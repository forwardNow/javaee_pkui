package com.pkusoft.admin.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import com.pkusoft.admin.dao.SysFunctionMapper;
import com.pkusoft.admin.model.SysDicItem;
import com.pkusoft.admin.model.SysFunction;
import com.pkusoft.admin.model.SysFunctionCriteria;
import com.pkusoft.admin.service.SysFunctionService;
import com.pkusoft.common.cache.FunctionIdCache;
import com.pkusoft.common.cache.SysParaCache;
import com.pkusoft.common.constants.IdType;
import com.pkusoft.framework.dao.BaseMapper;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.framework.service.impl.BaseServiceImpl;
import com.pkusoft.framework.util.DicUtils;
import com.pkusoft.framework.util.MapUtils;
import com.pkusoft.framework.util.MaxIdUtils;
import com.pkusoft.framework.util.StringUtils;

/**
 * 功能号管理服务实现类
 * @author 
 *
 */
@Service("sysFunctionService")
@Transactional
public class SysFunctionServiceImpl extends BaseServiceImpl<SysFunction> implements SysFunctionService{
	/** 功能号数据访问接口  */
	@Autowired
	private SysFunctionMapper sysFunctionMapper;

	/* (non-Javadoc)
	 * @see com.pkusoft.framework.service.BaseService#getMapper()
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public BaseMapper<SysFunction> getMapper() {
		return this.sysFunctionMapper;
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysFunctionService#getSysFunctionList(com.pkusoft.admin.model.SysFunction, com.pkusoft.framework.model.Pager)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysFunction> getSysFunctionList(SysFunction sysFunction, Pager pager) {
		Criteria<SysFunctionCriteria> criteria = new Criteria<SysFunctionCriteria>();
		criteria.setPager(pager);
		SysFunctionCriteria sysFunctionCriteria = criteria.createCriteria(SysFunctionCriteria.class);
		
		if(StringUtils.hasText(sysFunction.getFunctionCode())){
			sysFunctionCriteria.andFunctionCodeLike("%"+sysFunction.getFunctionCode()+"%");
		}
				
		List<SysFunction> list = this.getListByCriteria(criteria);
		
		int count = this.getCountByCriteria(criteria);
		pager.setTotalRecords(count);
		
		return list;
	}
	
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysFunctionService#saveSysFunction(com.pkusoft.admin.model.SysFunction)
	 */
	public int insertSysFunction(SysFunction sysFunction){
		//System.out.println(sysFunction.getFunctionId()+"--"+sysFunction.getFunctionCode()+"--"+sysFunction.getFunctionName());
		Assert.notNull(sysFunction);
		Long sysFunctionId = MaxIdUtils.getLongMaxIdA(IdType.SYS_FUNCTION);
		sysFunction.setFunctionId(sysFunctionId);
		int count = sysFunctionMapper.insert(sysFunction);
		
		// 刷新缓存
		FunctionIdCache.set(sysFunction.getFunctionCode());
		
		return count;
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysFunctionService#updateSysFunction(com.pkusoft.admin.model.SysFunction)
	 */
	public int updateSysFunction(SysFunction sysFunction) {
		Assert.notNull(sysFunction);
		Assert.notNull(sysFunction.getFunctionId());
		
		SysFunction oldSysFunction = this.get(sysFunction.getFunctionId());
		
		Map<String,Object> sysFunctionMap = MapUtils.toMapTrimNull(sysFunction);
		MapUtils.apply(sysFunctionMap, oldSysFunction);
		
		// 修改用户信息
		/*
		oldSysFunction.setModifyUserId(User.getUserId());
		oldSysFunction.setModifyUserName(User.getUserName());
		oldSysFunction.setModifyTime(new Date());
		*/
		
		int count = this.update(oldSysFunction);
		
		// 刷新缓存
		FunctionIdCache.refresh(sysFunction.getFunctionCode());
		
		return count;
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysFunctionService#deleteSysFunction(java.lang.Long[])
	 */
	@SuppressWarnings("unchecked")
	public int deleteSysFunction(java.lang.Long[] functionId) {
		Assert.notNull(functionId);
		
		Criteria<SysFunctionCriteria> criteria = new Criteria<SysFunctionCriteria>();
		SysFunctionCriteria sysFunctionCriteria = criteria.createCriteria(SysFunctionCriteria.class);
		sysFunctionCriteria.andFunctionIdIn(CollectionUtils.arrayToList(functionId));
		
		List<SysFunction> list = this.getListByCriteria(criteria);
		int count = this.deleteByCriteria(criteria);
		
		// 刷新缓存
		for (int i = 0; i < list.size(); i++) {
			SysParaCache.remove(list.get(i).getFunctionCode());
		}
		
		return count;
	}
	
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysFunctionService#createDicFile()
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public void createDicFile(){
		SysFunction sysFunction = new SysFunction();
		List<SysDicItem> list =  new ArrayList<SysDicItem>();
		List<SysFunction> listFunction = sysFunctionMapper.getSysFunctionList();
		for(int i=0;i<listFunction.size();i++){
			SysDicItem sysDicItem = new SysDicItem();
			sysDicItem.setItemCode(listFunction.get(i).getFunctionCode());
			sysDicItem.setItemValue(listFunction.get(i).getFunctionName());
			list.add(sysDicItem);
		}
		DicUtils.createDicXml("DIC_FUNCTION_CODE", list);
	}
	
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysFunctionService#checkSysFunctionListForm(java.lang.String)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public boolean checkSysFunctionListForm(String functionCode){
		if(functionCode != null && !"".equals(functionCode)){
			Pager pager = new Pager();
			pager.setLimit(20);
			SysFunction sysFunction = new SysFunction();
			Criteria<SysFunctionCriteria> criteria = new Criteria<SysFunctionCriteria>();
			criteria.setPager(pager);
			SysFunctionCriteria sysFunctionCriteria = criteria.createCriteria(SysFunctionCriteria.class);
			sysFunctionCriteria.andFunctionCodeEqualTo(functionCode);
			List<SysFunction> list = this.getListByCriteria(criteria);
			if (list != null && list.size() > 0){
				return true;			
			}
		}
		return false;
	}

}