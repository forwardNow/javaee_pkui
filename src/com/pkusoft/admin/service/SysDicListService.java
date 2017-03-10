package com.pkusoft.admin.service;

import java.util.List;

import com.pkusoft.admin.model.SysDicList;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.service.BaseService;

/**
 * 系统字典列表服务接口
 * @author 
 *
 */
public interface SysDicListService extends BaseService<SysDicList>{
	/**
	 * 系统字典列表查询列表
	 * 
	 * @param criteria 查询标准
	 * @return 列表
	 */
	List<SysDicList> getSysDicListList(Criteria<?> criteria);

	/**
	 * 系统字典列表新增信息
	 * 
	 * @param sysDicList 对象
	 * @return 插入记录数
	 */
	int insertSysDicList(SysDicList sysDicList);
	
	/**
	 * 系统字典列表修改信息
	 * 
	 * @param sysDicList 对象
	 * @return 更新记录数
	 */
	int updateSysDicList(SysDicList sysDicList);

	/**
	 * 系统字典列表删除信息
	 * 
	 * @param dicName 主键
	 * @return 删除记录数
	 */
	int deleteSysDicList(java.lang.String[] dicName);
	
	/**
	 * 生成单个字典文件
	 * 
	 * @param dicName
	 * @return XML文件
	 */
	void createDicFile(java.lang.String dicName);
	
	/**
	 * 生成单个字典文件
	 * 
	 * @param 
	 * @return XML文件
	 */
	void createAllDicFile();
}