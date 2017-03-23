package com.pkusoft.admin.service;

import java.util.List;

import com.pkusoft.framework.service.BaseService;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.admin.model.SysDeptRele;
import com.pkusoft.admin.model.SysDeptReleKey;

/**
 * 数据归属单位服务接口
 * @author 
 *
 */
public interface SysDeptReleService extends BaseService<SysDeptRele>{
	/**
	 * 数据归属单位查询列表
	 * 
	 * @param criteria 查询标准
	 * @return 列表
	 */
	List<SysDeptRele> getSysDeptReleList(Criteria<?> criteria);

	/**
	 * 数据归属单位新增信息
	 * 
	 * @param list 对象列表
	 * @return 插入记录数
	 */
	int insertSysDeptRele(List<SysDeptRele> list);
	
	/**
	 * 数据归属单位修改信息
	 * 
	 * @param sysDeptRele 对象
	 * @return 更新记录数
	 */
	int updateSysDeptRele(SysDeptRele sysDeptRele);

	/**
	 * 数据归属单位删除信息
	 * 
	 * @param list 主键
	 * @return 删除记录数
	 */
	int deleteSysDeptRele(List<SysDeptReleKey> list);
}