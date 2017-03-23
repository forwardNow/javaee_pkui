package com.pkusoft.framework.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.pkusoft.framework.dao.MaxIdMapper;
import com.pkusoft.framework.exception.BizException;
import com.pkusoft.framework.service.MaxIdService;

/**
 * 最大编号服务实现
 * @author tanggj
 *
 */
@Service("maxIdService")
@Transactional(propagation=Propagation.NOT_SUPPORTED)
public class MaxIdServiceImpl implements MaxIdService{
	/**
	 * 注入最大编号数据访问
	 */
	@Autowired
	private MaxIdMapper maxIdMapper;

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.MaxIdService#getLongMaxIdA(java.lang.String)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public Long getLongMaxIdA(String idType) {
		Assert.hasText(idType);
		
		Map<String,Object> params = new HashMap<String, Object>();
		params.put("strIdType", idType);
		params.put("intMaxId", null);
		params.put("strMaxId", null);
		params.put("strMaxFullId", null);
		
		maxIdMapper.getMaxIdA(params);
		
		if(params.get("intMaxId") != null){
			return (Long) params.get("intMaxId");
		}else{
			throw new BizException(1005);
		}
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.MaxIdService#getMaxIdA(java.lang.String)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public String getMaxIdA(String idType) {
		Assert.hasText(idType);
		
		Map<String,Object> params = new HashMap<String, Object>();
		params.put("strIdType", idType);
		params.put("intMaxId", null);
		params.put("strMaxId", null);
		params.put("strMaxFullId", null);
		
		maxIdMapper.getMaxIdA(params);
		
		if(params.get("strMaxId") != null){
			return (String) params.get("strMaxId");
		}else{
			throw new BizException(1005);
		}
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.MaxIdService#getLongMaxIdB(java.lang.String, java.lang.String)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public Long getLongMaxIdB(String idType, String strPara1) {
		Assert.hasText(idType);
		Assert.hasText(strPara1);
		
		Map<String,Object> params = new HashMap<String, Object>();
		params.put("strIdType", idType);
		params.put("strIdPara1", strPara1);
		params.put("intMaxId", null);
		params.put("strMaxId", null);
		params.put("strMaxFullId", null);
		
		maxIdMapper.getMaxIdB(params);
		
		if(params.get("intMaxId") != null){
			return (Long) params.get("intMaxId");
		}else{
			throw new BizException(1005);
		}
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.MaxIdService#getMaxIdB(java.lang.String, java.lang.String)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public String getMaxIdB(String idType, String strPara1) {
		Assert.hasText(idType);
		Assert.hasText(strPara1);
		
		Map<String,Object> params = new HashMap<String, Object>();
		params.put("strIdType", idType);
		params.put("strIdPara1", strPara1);
		params.put("intMaxId", null);
		params.put("strMaxId", null);
		params.put("strMaxFullId", null);
		
		maxIdMapper.getMaxIdB(params);
		
		if(params.get("strMaxId") != null){
			return (String) params.get("strMaxId");
		}else{
			throw new BizException(1005);
		}
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.MaxIdService#getFullMaxIdB(java.lang.String, java.lang.String)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public String getFullMaxIdB(String idType, String strPara1) {
		Assert.hasText(idType);
		Assert.hasText(strPara1);
		
		Map<String,Object> params = new HashMap<String, Object>();
		params.put("strIdType", idType);
		params.put("strIdPara1", strPara1);
		params.put("intMaxId", null);
		params.put("strMaxId", null);
		params.put("strMaxFullId", null);
		
		maxIdMapper.getMaxIdB(params);
		
		if(params.get("strMaxFullId") != null){
			return (String) params.get("strMaxFullId");
		}else{
			throw new BizException(1005);
		}
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.MaxIdService#getLongMaxIdC(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public Long getLongMaxIdC(String idType, String strPara1, String strPara2) {
		Assert.hasText(idType);
		Assert.hasText(strPara1);
		Assert.hasText(strPara2);
		
		Map<String,Object> params = new HashMap<String, Object>();
		params.put("strIdType", idType);
		params.put("strIdPara1", strPara1);
		params.put("strIdPara2", strPara2);
		params.put("intMaxId", null);
		params.put("strMaxId", null);
		params.put("strMaxFullId", null);
		
		maxIdMapper.getMaxIdC(params);
		
		if(params.get("intMaxId") != null){
			return (Long) params.get("intMaxId");
		}else{
			throw new BizException(1005);
		}
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.MaxIdService#getMaxIdC(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public String getMaxIdC(String idType, String strPara1, String strPara2) {
		Assert.hasText(idType);
		Assert.hasText(strPara1);
		Assert.hasText(strPara2);
		
		Map<String,Object> params = new HashMap<String, Object>();
		params.put("strIdType", idType);
		params.put("strIdPara1", strPara1);
		params.put("strIdPara2", strPara2);
		params.put("intMaxId", null);
		params.put("strMaxId", null);
		params.put("strMaxFullId", null);
		
		maxIdMapper.getMaxIdC(params);
		
		if(params.get("strMaxId") != null){
			return (String) params.get("strMaxId");
		}else{
			throw new BizException(1005);
		}
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.MaxIdService#getFullMaxIdC(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public String getFullMaxIdC(String idType, String strPara1, String strPara2) {
		Assert.hasText(idType);
		Assert.hasText(strPara1);
		Assert.hasText(strPara2);
		
		Map<String,Object> params = new HashMap<String, Object>();
		params.put("strIdType", idType);
		params.put("strIdPara1", strPara1);
		params.put("strIdPara2", strPara2);
		params.put("intMaxId", null);
		params.put("strMaxId", null);
		params.put("strMaxFullId", null);
		
		maxIdMapper.getMaxIdC(params);
		
		if(params.get("strMaxFullId") != null){
			return (String) params.get("strMaxFullId");
		}else{
			throw new BizException(1005);
		}
	}

}
