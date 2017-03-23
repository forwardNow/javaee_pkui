package com.pkusoft.framework.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.pkusoft.framework.dao.BaseMapper;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.model.Criteria.BaseCriteria;
import com.pkusoft.framework.service.BaseService;
import com.pkusoft.framework.util.StringUtils;

/**
 * 基础服务实现
 * @author tanggj
 *
 * @param <T>
 */
public class BaseServiceImpl<T> implements BaseService<T> {
	/**
	 * 获取Mapper 子类需要重写该方法。
	 * @return Mapper
	 */
	protected BaseMapper<T> getMapper() {
		throw new RuntimeException("Subclass need to overide this method.");		
	}
	
	/* (non-Javadoc)
	 * @see com.pkusoft.framework.service.BaseService#getCountByCriteria(com.pkusoft.framework.model.Criteria)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public int getCountByCriteria(Criteria<?> criteria) {
		return getMapper().getCountByCriteria(criteria);
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.framework.service.BaseService#deleteByCriteria(com.pkusoft.framework.model.Criteria)
	 */
	public int deleteByCriteria(Criteria<?> criteria) {
		return getMapper().deleteByCriteria(criteria);
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.framework.service.BaseService#delete(java.lang.Object)
	 */
	public int delete(Serializable key) {
		return getMapper().delete(key);
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.framework.service.BaseService#insert(java.lang.Object)
	 */
	public int insert(T record) {
		return getMapper().insert(record);
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.framework.service.BaseService#insertSelective(java.lang.Object)
	 */
	public int insertSelective(T record) {
		return getMapper().insertSelective(record);
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.framework.service.BaseService#getListByCriteria(com.pkusoft.framework.model.Criteria)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<T> getListByCriteria(Criteria<?> criteria) {
		return getMapper().getListByCriteria(criteria);
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.framework.service.BaseService#get(java.lang.Object)
	 */
	public T get(Serializable key) {
		return getMapper().get(key);
	}
	
	/* (non-Javadoc)
	 * @see com.pkusoft.framework.service.BaseService#getListByProperty(java.lang.String, java.lang.Object)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<T> getListByProperty(String property, Serializable value) {
		Criteria<BaseCriteria> criteria = new Criteria<BaseCriteria>();
		BaseCriteria bc = new BaseCriteria();
		criteria.getOredCriteria().add(bc);
		
		String condition = StringUtils.toUnderline(property).toUpperCase() + " =";
		bc.addCriterion(condition, value, property);
		
		return getListByCriteria((Criteria<?>) criteria);
	}
	
	/* (non-Javadoc)
	 * @see com.pkusoft.framework.service.BaseService#getByProperty(java.lang.String, java.lang.Object)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public T getByProperty(String property, Serializable value){
		List<T> list = getListByProperty(property,value);
		if(!CollectionUtils.isEmpty(list)){
			return list.get(0);
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.framework.service.BaseService#updateByCriteriaSelective(java.lang.Object, com.pkusoft.framework.model.Criteria)
	 */
	public int updateByCriteriaSelective(T record, Criteria<?> criteria) {
		return getMapper().updateByCriteriaSelective(record, criteria);
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.framework.service.BaseService#updateByCriteria(java.lang.Object, com.pkusoft.framework.model.Criteria)
	 */
	public int updateByCriteria(T record, Criteria<?> criteria) {
		return getMapper().updateByCriteria(record, criteria);
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.framework.service.BaseService#updateSelective(java.lang.Object)
	 */
	public int updateSelective(T record) {
		return getMapper().updateSelective(record);
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.framework.service.BaseService#update(java.lang.Object)
	 */
	public int update(T record) {
		return getMapper().update(record);
	}
}
