package com.pkusoft.admin.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import com.pkusoft.common.constants.DataPermitType;
import com.pkusoft.framework.dao.BaseMapper;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.User;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.framework.util.MapUtils;
import com.pkusoft.framework.util.StringUtils;
import com.pkusoft.framework.util.WebUtils;
import com.pkusoft.framework.service.impl.BaseServiceImpl;
import com.pkusoft.admin.dao.SysDeptReleMapper;
import com.pkusoft.admin.model.SysDeptRele;
import com.pkusoft.admin.model.SysDeptReleKey;
import com.pkusoft.admin.model.SysDeptReleCriteria;
import com.pkusoft.admin.service.SysDeptReleService;

/**
 * 数据归属单位服务实现类
 * @author 
 *
 */
@Service("sysDeptReleService")
@Transactional
public class SysDeptReleServiceImpl extends BaseServiceImpl<SysDeptRele> implements SysDeptReleService{
	/** 数据归属单位数据访问接口  */
	@Autowired
	private SysDeptReleMapper sysDeptReleMapper;
	
	/* (non-Javadoc)
	 * @see com.pkusoft.framework.service.BaseService#getMapper()
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public BaseMapper<SysDeptRele> getMapper() {
		return this.sysDeptReleMapper;
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysDeptReleService#getSysDeptReleList(com.pkusoft.framework.model.Criteria)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysDeptRele> getSysDeptReleList(Criteria criteria) {
		
		List<SysDeptRele> list = this.getListByCriteria(criteria);
		
		Pager pager = criteria.getPager();
		if(pager != null){
			int count = this.getCountByCriteria(criteria);
			pager.setTotalRecords(count);
		}
		
		return list;
	}
	
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysDeptReleService#saveSysDeptRele(com.pkusoft.admin.model.SysDeptRele)
	 */
	public int insertSysDeptRele(List<SysDeptRele> list){
		if(!CollectionUtils.isEmpty(list)){
			for (int i = 0; i < list.size(); i++) {
				sysDeptReleMapper.insert(list.get(i));
			}
			
			return list.size();
		}
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysDeptReleService#updateSysDeptRele(com.pkusoft.admin.model.SysDeptRele)
	 */
	public int updateSysDeptRele(SysDeptRele sysDeptRele) {
		Assert.notNull(sysDeptRele);
		Assert.notNull(sysDeptRele.getDeptId());
		Assert.notNull(sysDeptRele.getReleDeptId());
		
		SysDeptReleKey sysDeptReleKey = new SysDeptReleKey();
		sysDeptReleKey.setDeptId(sysDeptRele.getDeptId());
		sysDeptReleKey.setReleDeptId(sysDeptRele.getReleDeptId());
		
		SysDeptRele oldSysDeptRele = this.get(sysDeptReleKey);
		
		Map<String,Object> sysDeptReleMap = MapUtils.toMapTrimNull(sysDeptRele);
		MapUtils.apply(sysDeptReleMap, oldSysDeptRele);
		
		return this.update(oldSysDeptRele);
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysDeptReleService#deleteSysDeptRele(java.util.List)
	 */
	public int deleteSysDeptRele(List<SysDeptReleKey> list) {
		if(!CollectionUtils.isEmpty(list)){
			for (int i = 0; i < list.size(); i++) {
				this.delete(list.get(i));
			}
			return list.size();
		}
		return 0;
	}
	

}