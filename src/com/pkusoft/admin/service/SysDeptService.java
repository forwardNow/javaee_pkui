package com.pkusoft.admin.service;

import java.util.List;

import com.pkusoft.admin.model.SysDept;
import com.pkusoft.admin.model.SysDeptLevel;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.framework.service.BaseService;

/**
 * 单位管理服务接口
 * 
 * @author 
 *
 */
public interface SysDeptService extends BaseService<SysDept>{

	List<SysDept> getSysDeptList(Criteria<?> criteria);
	
	/**
	 * 查询单位列表
	 * 
	 * @param sysDept
	 * @param pager
	 * @return
	 */
	List<SysDept> getSysDeptList(SysDept sysDept, Pager pager);

	/**
	 * 查询下级单位列表
	 * 
	 * @param deptId
	 * @param pager
	 * @return
	 */
	List<SysDept> getSubDeptList(String deptId, String isMainDept, Pager pager);
	
	/**
	 * 新增单位信息
	 * 
	 * @param sysDept
	 * @return
	 */
	int insertSysDept(SysDept sysDept);
	
	/**
	 * 修改单位信息
	 * 
	 * @param oldDeptId
	 * @param sysDept
	 * @return
	 */
	int updateSysDept(String oldDeptId, SysDept sysDept);
	
	/**
	 * 删除单位信息
	 * 
	 * @param deptId
	 * @return
	 */
	int deleteSysDept(String[] deptId);
	
	/**
	 * 生成字典文件
	 * 
	 * @return
	 */
	boolean createDeptDic(String dicName);
	
    /**
     * 单位字典
     * @param deptId
     * @param deptLevel
     * @param releType
     * @return
     */
    List<SysDept> getDeptDic(String deptId, String deptLevel, String releType);
	
	/**
	 * 单位级别字典
	 * 
	 * @return
	 */
    List<SysDeptLevel> getDeptLevelDic();
    
    /**
     * 检查录入单位唯一性
     * 
     * @param deptId
     * @param fieldName
     * @param fieldVale
     * @return
     */
    boolean checkDeptInfo(String deptId, String fieldName, String fieldValue);
    
    /**
     * 根据deptId获取单位名称
     * @param deptId
     * @return
     */
    List<SysDept> getDeptName(String deptId);
	
}