package com.pkusoft.admin.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.pkusoft.admin.dao.SysDicListMapper;
import com.pkusoft.admin.model.SysDicItem;
import com.pkusoft.admin.model.SysDicList;
import com.pkusoft.admin.service.SysDicItemService;
import com.pkusoft.admin.service.SysDicListService;
import com.pkusoft.framework.dao.BaseMapper;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.framework.service.impl.BaseServiceImpl;
import com.pkusoft.framework.util.DicUtils;
import com.pkusoft.framework.util.MapUtils;

/**
 * 系统字典列表服务实现类
 * @author 
 *
 */
@Service("sysDicListService")
@Transactional
public class SysDicListServiceImpl extends BaseServiceImpl<SysDicList> implements SysDicListService{
	/** 系统字典列表数据访问接口  */
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
	 * @see com.pkusoft.admin.service.SysDicListService#getSysDicListList(com.pkusoft.framework.model.Criteria)
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
		/*
		oldSysDicList.setModifyUserId(User.getUserId());
		oldSysDicList.setModifyUserName(User.getUserName());
		oldSysDicList.setModifyTime(new Date());
		*/
		
		return this.update(oldSysDicList);
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysDicListService#deleteSysDicList(java.lang.String[])
	 */
	public int deleteSysDicList(java.lang.String[] dicName) {
		Assert.notNull(dicName);

        int count = 0;
		for (int i = 0; i < dicName.length; i++) {
			count = count + this.delete(dicName[i]);
		}
		return count;
	}
	
	
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysDicListService#deleteSysDicList(java.lang.String)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public void createDicFile(String dicName){
		if(dicName != null && !"".equals(dicName)){
			List<SysDicItem> dicDataList = sysDicItemService.getSysDicItemXmlByDicname(dicName);
			DicUtils.createDicXml(dicName, dicDataList);
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
	
}