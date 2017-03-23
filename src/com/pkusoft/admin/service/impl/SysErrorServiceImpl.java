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

import com.pkusoft.admin.dao.SysErrorMapper;
import com.pkusoft.admin.model.SysDicItem;
import com.pkusoft.admin.model.SysError;
import com.pkusoft.admin.model.SysErrorCriteria;
import com.pkusoft.admin.service.SysDicItemService;
import com.pkusoft.admin.service.SysErrorService;
import com.pkusoft.common.cache.ErrorCodeCache;
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
 * 错误号管理服务实现类
 * @author 
 *
 */
@Service("sysErrorService")
@Transactional
public class SysErrorServiceImpl extends BaseServiceImpl<SysError> implements SysErrorService{
	/** 错误号管理数据访问接口  */
	@Autowired
	private SysErrorMapper sysErrorMapper;
	
	@Autowired
	private SysDicItemService sysDicItemService;
	
	/* (non-Javadoc)
	 * @see com.pkusoft.framework.service.BaseService#getMapper()
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public BaseMapper<SysError> getMapper() {
		return this.sysErrorMapper;
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysErrorService#getSysErrorList(com.pkusoft.admin.model.SysError, com.pkusoft.framework.model.Pager)
	 */
	public List<SysError> getSysErrorList(SysError sysError, Pager pager) {
		Criteria<SysErrorCriteria> criteria = new Criteria<SysErrorCriteria>();
		criteria.setPager(pager);
		SysErrorCriteria sysErrorCriteria = criteria.createCriteria(SysErrorCriteria.class);
		
		if(StringUtils.hasText(sysError.getErrorCode())){
			sysErrorCriteria.andErrorCodeLike("%"+sysError.getErrorCode()+"%");
		}
				
		List<SysError> list = this.getListByCriteria(criteria);
		
		int count = this.getCountByCriteria(criteria);
		pager.setTotalRecords(count);
		
		return list;
	}
	
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysErrorService#saveSysError(com.pkusoft.admin.model.SysError)
	 */
	public int insertSysError(SysError sysError){
		Assert.notNull(sysError);
		Long sysErrorId = MaxIdUtils.getLongMaxIdA(IdType.SYS_ERROR);
		sysError.setErrorId(sysErrorId);
		int count = sysErrorMapper.insert(sysError);
		
		// 刷新缓存
		ErrorCodeCache.set(sysError.getErrorCode());
		
		return count;
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysErrorService#updateSysError(com.pkusoft.admin.model.SysError)
	 */
	public int updateSysError(SysError sysError) {
		Assert.notNull(sysError);
		Assert.notNull(sysError.getErrorId());
		
		SysError oldSysError = this.get(sysError.getErrorId());
		
		Map<String,Object> sysErrorMap = MapUtils.toMapTrimNull(sysError);
		MapUtils.apply(sysErrorMap, oldSysError);
		
		int count = this.update(oldSysError);
		
		// 刷新缓存
		ErrorCodeCache.refresh(sysError.getErrorCode());
		
		return count;
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysErrorService#deleteSysError(java.lang.Long[])
	 */
	@SuppressWarnings("unchecked")
	public int deleteSysError(java.lang.Long[] errorId) {
		Assert.notNull(errorId);
		
		Criteria<SysErrorCriteria> criteria = new Criteria<SysErrorCriteria>();
		SysErrorCriteria sysErrorCriteria = criteria.createCriteria(SysErrorCriteria.class);
		sysErrorCriteria.andErrorIdIn(CollectionUtils.arrayToList(errorId));
		
		List<SysError> list = this.getListByCriteria(criteria);
		int count = this.deleteByCriteria(criteria);
		
		// 刷新缓存
		for (int i = 0; i < list.size(); i++) {
			SysParaCache.remove(list.get(i).getErrorCode());
		}
		
		return count;
	}
	
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysErrorService#createDicFile(java.lang.Long[])
	 */
	public void createDicFile(){
		SysError sysError = new SysError();
		List<SysDicItem> list =  new ArrayList<SysDicItem>();
		List<SysError> listError = sysErrorMapper.getSysErrorList();
		for(int i=0; i<listError.size(); i++){
			SysDicItem sysDicItem = new SysDicItem();
			sysDicItem.setItemCode(listError.get(i).getErrorCode());            
			sysDicItem.setItemValue(listError.get(i).getErrorInfo());
			list.add(sysDicItem);
		}
		DicUtils.createDicXml("DIC_ERROR_CODE", list);

	}
	
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysErrorService#checkSysErrorListForm(java.lang.String)
	 */
	public boolean checkSysErrorListForm(String errorCode){
		if(errorCode != null && !"".equals(errorCode)){
			Pager pager = new Pager();
			pager.setLimit(20);
			SysError sysError = new SysError();
			Criteria<SysErrorCriteria> criteria = new Criteria<SysErrorCriteria>();
			criteria.setPager(pager);
			SysErrorCriteria sysErrorCriteria = criteria.createCriteria(SysErrorCriteria.class);
			sysErrorCriteria.andErrorCodeEqualTo(errorCode);
			List<SysError> list = this.getListByCriteria(criteria);
			if (list != null && list.size() > 0){
				return true;			
			}
		}
		return false;
	}
	
}