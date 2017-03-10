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

import com.pkusoft.framework.dao.BaseMapper;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.User;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.framework.util.MapUtils;
import com.pkusoft.framework.util.MaxIdUtils;
import com.pkusoft.framework.util.PinyinUtils;
import com.pkusoft.framework.util.StringUtils;
import com.pkusoft.framework.service.impl.BaseServiceImpl;
import com.pkusoft.admin.dao.SysDicItemMapper;
import com.pkusoft.admin.model.SysDicItem;
import com.pkusoft.admin.model.SysDicItemCriteria;
import com.pkusoft.admin.service.SysDicItemService;
import com.pkusoft.common.constants.IdType;

/**
 * 服务实现类
 * @author 
 *
 */
@Service("sysDicItemService")
@Transactional
public class SysDicItemServiceImpl extends BaseServiceImpl<SysDicItem> implements SysDicItemService{
	/** 数据访问接口  */
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
	 * @see com.pkusoft.admin.service.SysDicItemService#getSysDicItemList(com.pkusoft.admin.model.SysDicItem, com.pkusoft.framework.model.Pager)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysDicItem> getSysDicItemList(SysDicItem sysDicItem, Pager pager) {
		Criteria<SysDicItemCriteria> criteria = new Criteria<SysDicItemCriteria>();
		criteria.setPager(pager);
		SysDicItemCriteria sysDicItemCriteria = criteria.createCriteria(SysDicItemCriteria.class);
				
		List<SysDicItem> list = null;
		if(StringUtils.hasText(sysDicItem.getDicName())){
			sysDicItemCriteria.andDicNameEqualTo(sysDicItem.getDicName());
		}
		if(StringUtils.hasText(sysDicItem.getItemValue())){
			sysDicItemCriteria.andItemValueLike("%"+sysDicItem.getItemValue()+"%");
		}
		
		list = this.getListByCriteria(criteria);
		int count = this.getCountByCriteria(criteria);
		pager.setTotalRecords(count);
		
		return list;
	}
	
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysDicItemService#saveSysDicItem(com.pkusoft.admin.model.SysDicItem)
	 */
	public int insertSysDicItem(SysDicItem sysDicItem){
		Assert.notNull(sysDicItem);
		
		//字典条目标识号
		long ItemId = MaxIdUtils.getLongMaxIdA(IdType.SYS_DIC_ITEM);
		sysDicItem.setItemId(ItemId);
		
		//字典显示顺序,暂时固定 1
		long orderFlag=1;
		sysDicItem.setOrderFlag(orderFlag);
		
		//拼音头
		String itemHeadpell = PinyinUtils.getHeadPinyin(sysDicItem.getItemValue());
		String itemAspell = PinyinUtils.getPinyin(sysDicItem.getItemValue());
		sysDicItem.setItemSpell(itemHeadpell);
		sysDicItem.setItemAspell(itemAspell);

		//录入用户信息
		sysDicItem.setAddUserId(User.getUserId());
		sysDicItem.setAddUserName(User.getUserName());
		sysDicItem.setAddTime(new Date());
		
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
		oldSysDicItem.setModifyUserId(User.getUserId());
		oldSysDicItem.setModifyUserName(User.getUserName());
		oldSysDicItem.setModifyTime(new Date());
		
		//拼音头
		String itemHeadpell = PinyinUtils.getHeadPinyin(sysDicItem.getItemValue());
		String itemAspell = PinyinUtils.getPinyin(sysDicItem.getItemValue());
		sysDicItem.setItemSpell(itemHeadpell);
		sysDicItem.setItemAspell(itemAspell);
		
		return this.update(oldSysDicItem);
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysDicItemService#deleteSysDicItem(com.pkusoft.admin.model.SysDicItem)
	 */
	@SuppressWarnings("unchecked")
	public int deleteSysDicItem(java.lang.Long[] itemId) {
		Assert.notNull(itemId);
		
		Criteria<SysDicItemCriteria> criteria = new Criteria<SysDicItemCriteria>();
		SysDicItemCriteria sysDicItemCriteria = criteria.createCriteria(SysDicItemCriteria.class);
		sysDicItemCriteria.andItemIdIn(CollectionUtils.arrayToList(itemId));

		return this.deleteByCriteria(criteria);
	}
	
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysDicListService#getSysDicListList(com.pkusoft.admin.model.SysDicList, com.pkusoft.framework.model.Pager)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysDicItem> getSysDicListList(SysDicItem SysDicItem) {
		Criteria<SysDicItemCriteria> criteria = new Criteria<SysDicItemCriteria>();
		SysDicItemCriteria sysDicListCriteria = criteria.createCriteria(SysDicItemCriteria.class);
				
		if(StringUtils.hasText(SysDicItem.getDicName())){
			sysDicListCriteria.andDicNameEqualTo(SysDicItem.getDicName());
		}
		List<SysDicItem> list = this.getListByCriteria(criteria);
		
		return list;
	}
	
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysDicListService#getSysDicItemXmlByDicname(com.pkusoft.admin.model.SysDicItem)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysDicItem> getSysDicItemXmlByDicname(String dicName) {
		return this.sysDicItemMapper.getSysDicItemXmlByDicname(dicName);
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysDicItemService#checkSysDicListForm(itemCode)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public boolean checkSysDicListForm(SysDicItem sysDicItem) {
		if(sysDicItem.getDicName() != null && !"".equals(sysDicItem.getDicName()) 
				&& sysDicItem.getItemCode() != null && !"".equals(sysDicItem.getItemCode())){
			Pager pager = new Pager();
			pager.setLimit(20);
			Criteria<SysDicItemCriteria> criteria = new Criteria<SysDicItemCriteria>();
			criteria.setPager(pager);
			SysDicItemCriteria sysDicItemCriteria = criteria.createCriteria(SysDicItemCriteria.class);		
			sysDicItemCriteria.andDicNameEqualTo(sysDicItem.getDicName());
			sysDicItemCriteria.andItemCodeEqualTo(sysDicItem.getItemCode());
			List<SysDicItem> list = this.getListByCriteria(criteria);
			if (list != null && list.size() > 0){
				return true;			
			}
		}
		
		return false;
	}
}