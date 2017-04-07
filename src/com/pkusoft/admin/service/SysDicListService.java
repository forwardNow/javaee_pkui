package com.pkusoft.admin.service;

import java.util.List;

import com.pkusoft.framework.service.BaseService;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.admin.model.SysDicList;

/**
 * 服务接口
 * @author 
 *
 */
public interface SysDicListService extends BaseService<SysDicList>{
	/**
	 * 查询列表
	 * 
	 * @param sysDicList
	 * @param pager
	 * @return
	 */
	List<SysDicList> getSysDicListList(SysDicList sysDicList, Pager pager);
	/**
	 * 查询列表
	 * 
	 * @return
	 */
	List<SysDicList> getSysDicListList(Criteria<?> criteria);

	/**
	 * 新增信息
	 * 
	 * @param sysDicList
	 * @return
	 */
	int insertSysDicList(SysDicList sysDicList);
	
	/**
	 * 修改信息
	 * 
	 * @param sysDicList
	 * @return
	 */
	int updateSysDicList(SysDicList sysDicList);
	
	/**
	 * 删除信息
	 * 
	 * @param dicName
	 * @return
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
	 * 生成多个字典文件
	 * 
	 * @param dicName
	 * @return XML文件
	 */
	void createDicFile(String[] dicName);
	
	/**
	 * 生成单个字典文件
	 * 
	 * @param 
	 * @return XML文件
	 */
	void createAllDicFile();
	
	/**
	 * 检查同名字典名称
	 * @param dicName
	 * @return false 没同名参数
	 * 			true 有同名参数
	 */
	boolean checkSysDicListForm(java.lang.String dicName);
}