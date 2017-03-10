package com.pkusoft.framework.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pkusoft.framework.model.Criteria;

/**
 * 基础Mapper
 * @author tanggj
 *
 * @param <T>
 */
public interface BaseMapper<T> {
	
    /**
     * 根据查询标准获取实体记录数
     * @param criteria 查询标准
     * @return 记录数
     */
    int getCountByCriteria(Criteria<?> criteria);

    /**
     * 根据查询标准删除对象
     * @param criteria 查询标准
     * @return 删除记录数
     */
    int deleteByCriteria(Criteria<?> criteria);

    /**
     * 根据主键删除对象
     * @param key 主键
     * @return 删除记录数
     */
    int delete(Object key);

    /**
     * 新增实体对象，按全字段新增
     * @param record 实体对象
     * @return 插入记录数
     */
    int insert(T record);

    /**
     * 新增实体对象，选择不为null的字段新增
     * @param record 新增对象
     * @return 插入记录数
     */
    int insertSelective(T record);

    /**
     * 根据查询标准获取实体列表
     * @param criteria 查询标准
     * @return 查询列表
     */
    List<T> getListByCriteria(Criteria<?> criteria);

    /**
     * 根据主键获取实体对象
     * @param key 主键
     * @return 实体对象
     */
    T get(Object key);

    /**
     * 根据查询标准修改，只修改不为null的字段
     * @param record
     * @param criteria
     * @return 更新记录数
     */
    int updateByCriteriaSelective(@Param("record") T record, @Param("criteria") Criteria<?> criteria);

    /**
     * 根据查询标准修改，全字段修改
     * @param record
     * @param criteria
     * @return 更新记录数
     */
    int updateByCriteria(@Param("record") T record, @Param("criteria") Criteria<?> criteria);

    /**
     * 根据主键修改对象，只修改不为null的字段
     * @param record
     * @return 更新记录数
     */
    int updateSelective(T record);

    /**
     * 根据主键修改对象，全字段修改
     * @param record
     * @return 更新记录数
     */
    int update(T record);
}