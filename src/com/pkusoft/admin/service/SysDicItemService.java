package com.pkusoft.admin.service;

import java.util.List;

import com.pkusoft.admin.model.SysDicItem;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.service.BaseService;

/**
 * 系统字典条目服务接口
 * @author 
 *
 */
public interface SysDicItemService extends BaseService<SysDicItem>{
	/**
	 * 系统字典条目查询列表
	 * 
	 * @param criteria 查询标准
	 * @return 列表
	 */
	List<SysDicItem> getSysDicItemList(Criteria<?> criteria);

	/**
	 * 系统字典条目新增信息
	 * 
	 * @param sysDicItem 对象
	 * @return 插入记录数
	 */
	int insertSysDicItem(SysDicItem sysDicItem);
	
	/**
	 * 系统字典条目修改信息
	 * 
	 * @param sysDicItem 对象
	 * @return 更新记录数
	 */
	int updateSysDicItem(SysDicItem sysDicItem);

	/**
	 * 系统字典条目删除信息
	 * 
	 * @param itemId 主键
	 * @return 删除记录数
	 */
	int deleteSysDicItem(java.lang.Integer[] itemId);
	
	/**
	 * 字典查询列表
	 * 
	 * @param sysDicItem
	 * @return
	 */
	List<SysDicItem> getSysDicItemXmlByDicname(java.lang.String dicName);
}