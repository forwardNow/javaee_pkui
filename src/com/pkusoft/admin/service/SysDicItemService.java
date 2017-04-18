package com.pkusoft.admin.service;

import java.util.List;

import com.pkusoft.framework.service.BaseService;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.admin.model.SysDicItem;
import com.pkusoft.admin.model.SysDicList;

/**
 * 服务接口
 * @author 
 *
 */
public interface SysDicItemService extends BaseService<SysDicItem>{
	/**
	 * 查询列表
	 * 
	 * @param sysDicItem
	 * @param pager
	 * @return
	 */
	List<SysDicItem> getSysDicItemList(SysDicItem sysDicItem, Pager pager);
	
	/**
	 * 查询列表
	 * 
	 * @return
	 */
	List<SysDicItem> getSysDicItemList(Criteria<?> criteria);
	
	/**
	 * 查询列表
	 * 
	 * @param sysDicItem
	 * @return
	 */
	List<SysDicItem> getSysDicListList(SysDicItem SysDicItem);
	/**
	 * 新增信息
	 * 
	 * @param sysDicItem
	 * @return
	 */
	int insertSysDicItem(SysDicItem sysDicItem);
	
	/**
	 * 新增信息
	 * 
	 * @param sysDicItemList
	 * @return
	 */
	int insertSysDicItem(List<SysDicItem> sysDicItemList);
	
	/**
	 * 修改信息
	 * 
	 * @param sysDicItem
	 * @return
	 */
	int updateSysDicItem(SysDicItem sysDicItem);
	
	/**
	 * 删除信息
	 * 
	 * @param itemId
	 * @return
	 */
	int deleteSysDicItem(java.lang.Long[] itemId);
	
	/**
	 * 字典查询列表
	 * 
	 * @param sysDicItem
	 * @return
	 */
	List<SysDicItem> getSysDicItemXmlByDicname(java.lang.String dicName);
	
	/**
	 * 检查字典条目
	 * 
	 * @param SysDicItem
	 * @return false 没同名参数
	 * 			true 有同名参数
	 */
	boolean checkSysDicListForm(SysDicItem SysDicItem);
}