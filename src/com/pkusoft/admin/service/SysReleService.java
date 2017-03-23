package com.pkusoft.admin.service;

import java.util.List;

import com.pkusoft.framework.service.BaseService;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.admin.model.SysRele;
import com.pkusoft.admin.model.SysDept;

/**
 * 数据归属单位信息服务接口
 * @author 
 *
 */
public interface SysReleService extends BaseService<SysRele>{
	/**
	 * 数据归属单位信息查询列表
	 * 
	 * @param criteria 查询标准
	 * @return 列表
	 */
	List<SysRele> getReleList(Criteria<?> criteria);

	/**
	 * 数据归属单位信息新增信息
	 * 
	 * @param rele 对象
	 * @return 插入记录数
	 */
	int insertRele(SysRele rele);
	
	/**
	 * 数据归属单位信息修改信息
	 * 
	 * @param rele 对象
	 * @return 更新记录数
	 */
	int updateRele(SysRele rele,String oldRele);

	/**
	 * 数据归属单位信息删除信息
	 * 
	 * @param deptId 主键
	 * @return 删除记录数
	 */
	int deleteRele(java.lang.String[] deptId);
	
	 /**
     * 单位字典
     * @param deptId
     * @param deptLevel
     * @param releType
     * @return
     */
    List<SysRele> getReleDic(String deptId, String deptLevel, String releType);
   
    /**
	 * 生成字典文件
	 * 
	 * @return
	 */
	boolean createReleDic(String dicName);
}