package com.pkusoft.framework.dao;

import java.util.List;

import com.pkusoft.framework.model.Criteria;

/**
 * 基础查询Mapper
 * @author tanggj
 *
 * @param <T>
 */
public interface BaseQueryMapper<T> {
	
    /**
     * 根据查询标准获取实体记录数
     * @param criteria 查询标准
     * @return 记录数
     */
    int getCountByCriteria(Criteria<?> criteria);

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

}