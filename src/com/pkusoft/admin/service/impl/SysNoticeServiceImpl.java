package com.pkusoft.admin.service.impl;

import java.sql.Clob;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import com.pkusoft.admin.dao.SysNoticeMapper;
import com.pkusoft.admin.model.SysNotice;
import com.pkusoft.admin.model.SysNoticeCriteria;
import com.pkusoft.admin.service.SysNoticeService;
import com.pkusoft.common.constants.IdType;
import com.pkusoft.framework.User;
import com.pkusoft.framework.constants.General;
import com.pkusoft.framework.dao.BaseMapper;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.framework.service.impl.BaseServiceImpl;
import com.pkusoft.framework.util.DateTimeUtils;
import com.pkusoft.framework.util.MapUtils;
import com.pkusoft.framework.util.MaxIdUtils;

/**
 * 系统公告服务实现类
 * @author 
 *
 */
@Service("sysNoticeService")
@Transactional
public class SysNoticeServiceImpl extends BaseServiceImpl<SysNotice> implements SysNoticeService{
	/** 系统公告数据访问接口  */
    @Autowired
	private SysNoticeMapper sysNoticeMapper;

	/* (non-Javadoc)
	 * @see com.pkusoft.framework.service.BaseService#getMapper()
	 */
    @Transactional(propagation=Propagation.NOT_SUPPORTED)
	public BaseMapper<SysNotice> getMapper() {
		return this.sysNoticeMapper;
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysNoticeService#getSysNoticeList(com.pkusoft.framework.model.Criteria)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysNotice> getSysNoticeList(Criteria<?> criteria) {
		
		List<SysNotice> list = this.getListByCriteria(criteria);
		
		Pager pager = criteria.getPager();
		if(pager != null){
			int count = this.getCountByCriteria(criteria);
			pager.setTotalRecords(count);
		}
		
		return list;
	}
	
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysNoticeService#saveSysNotice(com.pkusoft.admin.model.SysNotice)
	 */
	public int insertSysNotice(SysNotice sysNotice){
		Assert.notNull(sysNotice);
		//生成业务编号
		long opid = MaxIdUtils.getLongMaxIdA(IdType.SYS_MENU);
		
		sysNotice.setOpid(opid);
		sysNotice.setAuthorid(String.valueOf(User.getUserId()));
		sysNotice.setIsPublish(General.YES);
		if(sysNotice.getAuthor()!=null){
			if("".equals(sysNotice.getAuthor())){
				sysNotice.setAuthor(User.getUserName());
			}
		}else{
			sysNotice.setAuthor(User.getUserName());
		}
		//设置当前时间
		sysNotice.setOptime(DateTimeUtils.getNow());
		
		return sysNoticeMapper.insert(sysNotice);
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysNoticeService#updateSysNotice(com.pkusoft.admin.model.SysNotice)
	 */
	public int updateSysNotice(SysNotice sysNotice) {
		Assert.notNull(sysNotice);
		Assert.notNull(sysNotice.getOpid());
		
		SysNotice oldSysNotice = this.get(sysNotice.getOpid());
		
		Map<String,Object> sysNoticeMap = MapUtils.toMapTrimNull(sysNotice);
		MapUtils.apply(sysNoticeMap, oldSysNotice);
		
		oldSysNotice.setOptime(DateTimeUtils.getNow());
		// 修改用户信息
		/*
		oldSysNotice.setModifyUserId(User.getUserId());
		oldSysNotice.setModifyUserName(User.getUserName());
		oldSysNotice.setModifyTime(new Date());
		*/
		
		return this.update(oldSysNotice);
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysNoticeService#deleteSysNotice(java.lang.Integer[])
	 */
	@SuppressWarnings("unchecked")
	public int deleteSysNotice(java.lang.Integer[] opid) {
		Assert.notNull(opid);
	
		Criteria<SysNoticeCriteria> criteria = new Criteria<SysNoticeCriteria>();
		SysNoticeCriteria sysNoticeCriteria = criteria.createCriteria(SysNoticeCriteria.class);
		sysNoticeCriteria.andOpidIn(CollectionUtils.arrayToList(opid));

		return this.deleteByCriteria(criteria);
	}
	
	/**
	 * 将String转成Clob ,静态方法
	 * 
	 * @param str
	 *            字段
	 * @return clob对象，如果出现错误，返回 null
	 */
	public static Clob stringToClob(String str) {
		if (null == str)
			return null;
		else {
			try {
				java.sql.Clob c = new javax.sql.rowset.serial.SerialClob(str.toCharArray());
				return c;
			} catch (Exception e) {
				return null;
			}
		}
	}

	@Override
	public int updateSysNotice(Integer[] opids, int operation,String field) {
		int count = 0;
		for(int i=0;i<opids.length;i++){
			SysNotice sysNotice = this.get(opids[i]);
			if(field.equals("isPublish")){
				sysNotice.setIsPublish(String.valueOf(operation));
			}else{
				sysNotice.setIsWorktable(String.valueOf(operation));
			}
			sysNotice.setOptime(new Date());
			count += sysNoticeMapper.update(sysNotice);
		}
		return count;
	}

}