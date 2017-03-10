package com.pkusoft.framework.service;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pkusoft.framework.model.Criteria;

/**
 * 基础服务接口
 * @author tanggj
 *
 * @param <T>
 */
public interface BaseService<T> {
	
    /**
     * 根据查询标准获取实体记录数
     * @param criteria 查询标准
     * @return 记录数
     */
    int getCountByCriteria(Criteria<?> criteria);

    /**
     * 根据查询标准删除对象
     * @param criteria 查询标准
     * @return 已删除记录数
     */
    int deleteByCriteria(Criteria<?> criteria);

    /**
     * 根据主键删除对象
     * @param key 主键
     * @return 已删除记录数
     */
    int delete(Serializable key);

    /**
     * 新增实体对象，按全字段新增
     * @param record 实体对象
     * @return 已插入记录数
     */
    int insert(T record);

    /**
     * 新增实体对象，选择不为null的字段新增
     * @param record
     * @return 已插入记录数
     */
    int insertSelective(T record);

    /**
     * 根据查询标准获取实体列表
     * @param criteria 查询标准
     * @return 实体列表
     */
    List<T> getListByCriteria(Criteria<?> criteria);

    /**
     * 根据主键获取实体对象
     * @param key 主键
     * @return 实体对象
     */
    T get(Serializable key);

    /**
     * 根据查询标准修改，只修改不为null的字段
     * @param record
     * @param criteria
     * @return 已更新记录数
     */
    int updateByCriteriaSelective(@Param("record") T record, @Param("criteria") Criteria<?> criteria);

    /**
     * 根据查询标准修改，全字段修改
     * @param record
     * @param criteria
     * @return 已更新记录数
     */
    int updateByCriteria(@Param("record") T record, @Param("criteria") Criteria<?> criteria);

    /**
     * 根据主键修改对象，只修改不为null的字段
     * @param record
     * @return 已更新记录数
     */
    int updateSelective(T record);

    /**
     * 根据主键修改对象，全字段修改
     * @param record
     * @return 已更新记录数
     */
    int update(T record);
    
    
    /**
     * 根据属性查询对象列表
     * @param property
     * @param value
     * @return 对象列表
     */
    List<T> getListByProperty(String property, Serializable value);
    
    /**
     * 根据属性获取唯一对象
     * @param property
     * @param value
     * @return 实体对象
     */
    T getByProperty(String property, Serializable value);

}
