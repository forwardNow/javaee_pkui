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

import com.pkusoft.admin.dao.SysDicListMapper;
import com.pkusoft.admin.model.SysDicItem;
import com.pkusoft.admin.model.SysDicList;
import com.pkusoft.admin.model.SysDicListCriteria;
import com.pkusoft.admin.service.SysDicItemService;
import com.pkusoft.admin.service.SysDicListService;
import com.pkusoft.framework.User;
import com.pkusoft.framework.dao.BaseMapper;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.framework.service.impl.BaseServiceImpl;
import com.pkusoft.framework.util.DicUtilsPro;
import com.pkusoft.framework.util.MapUtils;
import com.pkusoft.framework.util.StringUtils;

/**
 * 服务实现类
 * @author 
 *
 */
@Service("sysDicListService")
@Transactional
public class SysDicListServiceImpl extends BaseServiceImpl<SysDicList> implements SysDicListService{
	/** 数据访问接口  */
	@Autowired
	private SysDicListMapper sysDicListMapper;
	
	@Autowired
	private SysDicItemService sysDicItemService;

	/* (non-Javadoc)
	 * @see com.pkusoft.framework.service.BaseService#getMapper()
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public BaseMapper<SysDicList> getMapper() {
		return this.sysDicListMapper;
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysDicListService#getSysDicListList(com.pkusoft.admin.model.SysDicList, com.pkusoft.framework.model.Pager)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysDicList> getSysDicListList(SysDicList sysDicList, Pager pager) {
		Criteria<SysDicListCriteria> criteria = new Criteria<SysDicListCriteria>();
		criteria.setPager(pager);
		SysDicListCriteria sysDicListCriteria = criteria.createCriteria(SysDicListCriteria.class);
		List<SysDicList> list ;
				
		if(StringUtils.hasText(sysDicList.getDicName())){
			sysDicListCriteria.andDicNameLike(sysDicList.getDicName());
			return  this.getListByCriteria(criteria);
		}
		// 页面 字典描述查询
		if(StringUtils.hasText(sysDicList.getDicDesc())){
			sysDicListCriteria.andDicDescLike("%"+sysDicList.getDicDesc()+"%");
			return  this.getListByCriteria(criteria);
		}
		list = this.getListByCriteria(criteria);
		int count = this.getCountByCriteria(criteria);
		pager.setTotalRecords(count);
		
		return list;
	}
	
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysDicListService#getSysDicListList(com.pkusoft.admin.model.SysDicList, com.pkusoft.framework.model.Pager)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysDicList> getSysDicListList(Criteria<?> criteria) {
		
		List<SysDicList> list = this.getListByCriteria(criteria);
		
		Pager pager = criteria.getPager();
		if(pager != null){
			int count = this.getCountByCriteria(criteria);
			pager.setTotalRecords(count);
		}
		return list;
	}
	
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysDicListService#saveSysDicList(com.pkusoft.admin.model.SysDicList)
	 */
	public int insertSysDicList(SysDicList sysDicList){
		Assert.notNull(sysDicList);
		
		//字典显示顺序,暂时固定 1
		long orderFlag=1;
		sysDicList.setOrderFlag(orderFlag);
		
		//录入用户信息
		sysDicList.setAddUserId(User.getUserId());
		sysDicList.setAddUserName(User.getUserName());
		sysDicList.setAddTime(new Date());
		
		return sysDicListMapper.insert(sysDicList);
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysDicListService#updateSysDicList(com.pkusoft.admin.model.SysDicList)
	 */
	public int updateSysDicList(SysDicList sysDicList) {
		Assert.notNull(sysDicList);
		Assert.notNull(sysDicList.getDicName());
		
		SysDicList oldSysDicList = this.get(sysDicList.getDicName());
		
		Map<String,Object> sysDicListMap = MapUtils.toMapTrimNull(sysDicList);
		MapUtils.apply(sysDicListMap, oldSysDicList);
		
		// 修改用户信息
		
		oldSysDicList.setModifyUserId(User.getUserId());
		oldSysDicList.setModifyUserName(User.getUserName());
		oldSysDicList.setModifyTime(new Date());
		
		return this.update(oldSysDicList);
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysDicListService#deleteSysDicList(java.lang.Long[])
	 */
	@SuppressWarnings("unchecked")
	public int deleteSysDicList(java.lang.String[] dicName) {
		Assert.notNull(dicName);
		
		Criteria<SysDicListCriteria> criteria = new Criteria<SysDicListCriteria>();
		SysDicListCriteria sysDicListCriteria = criteria.createCriteria(SysDicListCriteria.class);
		sysDicListCriteria.andDicNameIn(CollectionUtils.arrayToList(dicName));
		
		return this.deleteByCriteria(criteria);
	}
	
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysDicListService#deleteSysDicList(java.lang.String)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public void createDicFile(String dicName){
		if(dicName != null && !"".equals(dicName)){
			List<SysDicItem> dicDataList = sysDicItemService.getSysDicItemXmlByDicname(dicName);
			DicUtilsPro.createDicXml(dicName, dicDataList);
		}
	}
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysDicListService#deleteSysDicList(java.lang.String)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public void createDicFile(String[] dicName){
		for ( int i = 0, len = dicName.length; i < len; i++ ) {
			String dicname = dicName[ i ];
			if(dicname != null && !"".equals(dicname)){
				List<SysDicItem> dicDataList = sysDicItemService.getSysDicItemXmlByDicname(dicname);
				DicUtilsPro.createDicXml(dicname, dicDataList);
			}
		}
	}
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysDicListService#deleteSysDicList(java.lang.String)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public void createAllDicFile(){
		List<String> dicNameList = this.sysDicListMapper.sysDicListXml();
		for (int i = 0; i < dicNameList.size(); i++) {
			createDicFile(dicNameList.get(i));
		}
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysDicListService#checkSysDicListForm(java.lang.String)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public boolean checkSysDicListForm(String dicName) {
		if(dicName != null && !"".equals(dicName)){
			Pager pager = new Pager();
			pager.setLimit(20);
			SysDicList sysDicList = new SysDicList();
			Criteria<SysDicListCriteria> criteria = new Criteria<SysDicListCriteria>();
			criteria.setPager(pager);
			SysDicListCriteria sysDicListCriteria = criteria.createCriteria(SysDicListCriteria.class);	
			
			//查询条件
			sysDicListCriteria.andDicNameEqualTo(dicName);
			List<SysDicList> list = this.getListByCriteria(criteria);
			if (list != null && list.size() > 0){
				return true;			
			}
		}
		return false;
		
	}

}