package com.pkusoft.admin.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.pkusoft.admin.dao.SysDicItemMapper;
import com.pkusoft.admin.model.SysDicItem;
import com.pkusoft.admin.service.SysDicItemService;
import com.pkusoft.framework.dao.BaseMapper;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.framework.service.impl.BaseServiceImpl;
import com.pkusoft.framework.util.MapUtils;

/**
 * 系统字典条目服务实现类
 * @author 
 *
 */
@Service("sysDicItemService")
@Transactional
public class SysDicItemServiceImpl extends BaseServiceImpl<SysDicItem> implements SysDicItemService{
	/** 系统字典条目数据访问接口  */
    @Autowired
	private SysDicItemMapper sysDicItemMapper;

	/* (non-Javadoc)
	 * @see com.pkusoft.framework.service.BaseService#getMapper()
	 */
    @Transactional(propagation=Propagation.NOT_SUPPORTED)
	public BaseMapper<SysDicItem> getMapper() {
		return this.sysDicItemMapper;
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysDicItemService#getSysDicItemList(com.pkusoft.framework.model.Criteria)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysDicItem> getSysDicItemList(Criteria<?> criteria) {
		
		List<SysDicItem> list = this.getListByCriteria(criteria);
		
		Pager pager = criteria.getPager();
		if(pager != null){
			int count = this.getCountByCriteria(criteria);
			pager.setTotalRecords(count);
		}
		
		return list;
	}
	
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysDicItemService#saveSysDicItem(com.pkusoft.admin.model.SysDicItem)
	 */
	public int insertSysDicItem(SysDicItem sysDicItem){
		Assert.notNull(sysDicItem);
		
		return sysDicItemMapper.insert(sysDicItem);
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysDicItemService#updateSysDicItem(com.pkusoft.admin.model.SysDicItem)
	 */
	public int updateSysDicItem(SysDicItem sysDicItem) {
		Assert.notNull(sysDicItem);
		Assert.notNull(sysDicItem.getItemId());
		
		SysDicItem oldSysDicItem = this.get(sysDicItem.getItemId());
		
		Map<String,Object> sysDicItemMap = MapUtils.toMapTrimNull(sysDicItem);
		MapUtils.apply(sysDicItemMap, oldSysDicItem);
		
		// 修改用户信息
		/*
		oldSysDicItem.setModifyUserId(User.getUserId());
		oldSysDicItem.setModifyUserName(User.getUserName());
		oldSysDicItem.setModifyTime(new Date());
		*/
		
		return this.update(oldSysDicItem);
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysDicItemService#deleteSysDicItem(java.lang.Integer[])
	 */
	public int deleteSysDicItem(java.lang.Integer[] itemId) {
		Assert.notNull(itemId);

        int count = 0;
		for (int i = 0; i < itemId.length; i++) {
			count = count + this.delete(itemId[i]);
		}
		return count;
	}
	
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysDicItem> getSysDicItemXmlByDicname(String dicName) {
		return this.sysDicItemMapper.getSysDicItemXmlByDicname(dicName);
	}
}