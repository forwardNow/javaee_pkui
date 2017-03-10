package com.pkusoft.admin.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import com.pkusoft.framework.User;
import com.pkusoft.framework.dao.BaseMapper;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.framework.util.MapUtils;
import com.pkusoft.framework.util.StringUtils;
import com.pkusoft.framework.util.WebUtils;
import com.pkusoft.framework.service.impl.BaseServiceImpl;
import com.pkusoft.admin.dao.SysLogMapper;
import com.pkusoft.admin.model.SysLog;
import com.pkusoft.admin.model.SysLogCriteria;
import com.pkusoft.admin.service.SysLogService;
import com.pkusoft.common.constants.DataPermitType;

/**
 * 服务实现类
 * @author 
 *
 */
@Service("sysLogService")
@Transactional(propagation=Propagation.NOT_SUPPORTED)
public class SysLogServiceImpl extends BaseServiceImpl<SysLog> implements SysLogService{
	/** 数据访问接口  */
	@Autowired
	private SysLogMapper sysLogMapper;

	/* (non-Javadoc)
	 * @see com.pkusoft.framework.service.BaseService#getMapper()
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public BaseMapper<SysLog> getMapper() {
		return this.sysLogMapper;
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysLogService#getSysLogList(com.pkusoft.admin.model.SysLog, com.pkusoft.framework.model.Pager)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysLog> getSysLogList(SysLog sysLog, Pager pager) {
		SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");	
		Criteria<SysLogCriteria> criteria = new Criteria<SysLogCriteria>();
		criteria.setPager(pager);
		
		SysLogCriteria sysLogCriteria = criteria.createCriteria(SysLogCriteria.class);
		sysLogCriteria.andLogDeptLevelGreaterThanOrEqualTo(User.getUserLevel());
		if (StringUtils.hasText(sysLog.getLoginName())) {	
			sysLogCriteria.andLoginNameLike("%" + sysLog.getLoginName() + "%");
		}
		if (StringUtils.hasText(sysLog.getDeptName())) {
			sysLogCriteria.andDeptNameEqualTo(sysLog.getDeptName());
		}
		if (StringUtils.hasText(sysLog.getLogType())) {
			sysLogCriteria.andLogTypeEqualTo(sysLog.getLogType());
		}
		if (StringUtils.hasText(sysLog.getFunctionId())) {
			sysLogCriteria.andFunctionIdEqualTo(sysLog.getFunctionId());
		}
		if (StringUtils.hasText(sysLog.getOperType())) {
			sysLogCriteria.andOperTypeEqualTo(sysLog.getOperType());
		}
		
		if(sysLog.getLogTime() != null && sysLog.getLogInfo().isEmpty()){
				Date date = new Date();
				Date endTime = sysLog.getLogTime();
				if(endTime.getTime() < date.getTime()){  
					sysLogCriteria.andLogTimeBetween(endTime, date);
				} else {
				    sysLogCriteria.andLogTimeBetween(date, endTime);
				}
		}
		
		if(sysLog.getLogTime() == null && StringUtils.hasText(sysLog.getLogInfo())){
			try {
				Date date = new Date();
				Date beginTime = sim.parse(sysLog.getLogInfo());
				if( beginTime.getTime()< date.getTime()){  
				    sysLogCriteria.andLogTimeBetween(beginTime, date);
				} else {
				    sysLogCriteria.andLogTimeBetween(date, beginTime);
				}
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		
		if(sysLog.getLogTime() != null && StringUtils.hasText(sysLog.getLogInfo())){
			try {
				Date endTime = sysLog.getLogTime();
				Date beginTime = sim.parse(sysLog.getLogInfo());
				if( beginTime.getTime()< endTime.getTime()){  
				    sysLogCriteria.andLogTimeBetween(beginTime, endTime);
				} else {
				    sysLogCriteria.andLogTimeBetween(endTime, beginTime);
				}
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		
		sysLogCriteria.andUserIdEqualTo(User.getUserId());
		
		String orderByClause = " log_time desc ";
		criteria.setOrderByClause(orderByClause);
		
		//设置用户数据权限条件
		WebUtils.setUserDataPermit(DataPermitType.SYS_LOG_LIST, criteria);
		
		List<SysLog> list = this.getListByCriteria(criteria);
		int count = this.getCountByCriteria(criteria);
		pager.setTotalRecords(count);
		
		return list;
	}
	
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysLogService#saveSysLog(com.pkusoft.admin.model.SysLog)
	 */
	public int insertSysLog(SysLog sysLog){
		Assert.notNull(sysLog);
		
		return sysLogMapper.insert(sysLog);
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysLogService#updateSysLog(com.pkusoft.admin.model.SysLog)
	 */
	public int updateSysLog(SysLog sysLog) {
		Assert.notNull(sysLog);
		Assert.notNull(sysLog.getLogId());
		
		SysLog oldSysLog = this.get(sysLog.getLogId());
		
		Map<String,Object> sysLogMap = MapUtils.toMapTrimNull(sysLog);
		MapUtils.apply(sysLogMap, oldSysLog);
		
		// 修改用户信息
		/*
		oldSysLog.setModifyUserId(User.getUserId());
		oldSysLog.setModifyUserName(User.getUserName());
		oldSysLog.setModifyTime(new Date());
		*/
		
		return this.update(oldSysLog);
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysLogService#deleteSysLog(java.lang.Long[])
	 */
	public int deleteSysLog(java.util.Date beginDate,java.util.Date endDate) {
		Criteria<SysLogCriteria> criteria = new Criteria<SysLogCriteria>();
		SysLogCriteria sysLogCriteria = criteria.createCriteria(SysLogCriteria.class);
		sysLogCriteria.andLogTimeBetween(endDate, beginDate);
		return this.deleteByCriteria(criteria);
	}
	
	public int deleteSysLogByIds(Long[] ids) {
		Criteria<SysLogCriteria> criteria = new Criteria<SysLogCriteria>();
		SysLogCriteria sysLogCriteria = criteria.createCriteria(SysLogCriteria.class);
		sysLogCriteria.andLogIdIn(CollectionUtils.arrayToList(ids));
		return this.deleteByCriteria(criteria);
	}
	
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysLogService#deleteAllSysLog()
	 */
	@Override
	public int deleteAllSysLog() {
		Criteria<SysLogCriteria> criteria = new Criteria<SysLogCriteria>();
		return this.deleteByCriteria(criteria);
	}	
}