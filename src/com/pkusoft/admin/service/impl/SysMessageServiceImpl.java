package com.pkusoft.admin.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import com.pkusoft.framework.constants.General;
import com.pkusoft.framework.dao.BaseMapper;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.User;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.framework.util.MapUtils;
import com.pkusoft.framework.util.MaxIdUtils;
import com.pkusoft.framework.util.StringUtils;
import com.pkusoft.framework.service.impl.BaseServiceImpl;
import com.pkusoft.admin.dao.SysMessageMapper;
import com.pkusoft.admin.model.SysMessage;
import com.pkusoft.admin.model.SysMessageCriteria;
import com.pkusoft.admin.service.SysMessageService;
import com.pkusoft.common.constants.IdType;

/**
 * 服务实现类
 * @author 
 *
 */
@Service("sysMessageService")
@Transactional
public class SysMessageServiceImpl extends BaseServiceImpl<SysMessage> implements SysMessageService{
	/** 数据访问接口  */
	@Autowired
	private SysMessageMapper sysMessageMapper;
	
	/* (non-Javadoc)
	 * @see com.pkusoft.framework.service.BaseService#getMapper()
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public BaseMapper<SysMessage> getMapper() {
		return this.sysMessageMapper;
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysMessageService#getSysMessageList(com.pkusoft.admin.model.SysMessage, com.pkusoft.framework.model.Pager)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysMessage> getSysMessageList(SysMessage sysMessage, Pager pager) {
		Criteria<SysMessageCriteria> criteria = new Criteria<SysMessageCriteria>();
		criteria.setPager(pager);
		criteria.setOrderByClause("SEND_TIME DESC");
		SysMessageCriteria sysMessageCriteria = criteria.createCriteria(SysMessageCriteria.class);
		sysMessageCriteria.andReceiveDelFlagEqualTo(General.NO);
		sysMessageCriteria.andReceiveUserIdEqualTo(User.getUserId());
		if(StringUtils.hasText(sysMessage.getMsgTitle())){
			sysMessageCriteria.andMsgTitleLike("%" + sysMessage.getMsgTitle() + "%");
		}
				
		List<SysMessage> list = this.getListByCriteria(criteria);
		
		int count = this.getCountByCriteria(criteria);
		pager.setTotalRecords(count);
		
		return list;
	}
	
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysMessageService#saveSysMessage(com.pkusoft.admin.model.SysMessage)
	 */
	public int insertSysMessage(SysMessage sysMessage){
		Assert.notNull(sysMessage);
		
		Long msgId = MaxIdUtils.getLongMaxIdA(IdType.SYS_MESSAGE);
		sysMessage.setMsgId(msgId);
		sysMessage.setReadFlag(General.NO);
		sysMessage.setReceiveDelFlag(General.NO);
		sysMessage.setSendDelFlag(General.NO);
		sysMessage.setSendTime(new Date());
		sysMessage.setSendUserId(User.getUserId());
		sysMessage.setSendUserIp(User.getIp());
		sysMessage.setSendUserName(User.getUserName());
		
		return sysMessageMapper.insert(sysMessage);
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysMessageService#updateSysMessage(com.pkusoft.admin.model.SysMessage)
	 */
	public int updateSysMessage(SysMessage sysMessage) {
		Assert.notNull(sysMessage);
		Assert.notNull(sysMessage.getMsgId());
		
		SysMessage oldSysMessage = this.get(sysMessage.getMsgId());
		
		Map<String,Object> sysMessageMap = MapUtils.toMapTrimNull(sysMessage);
		MapUtils.apply(sysMessageMap, oldSysMessage);
		
		// 修改用户信息
		/*
		oldSysMessage.setModifyUserId(User.getUserId());
		oldSysMessage.setModifyUserName(User.getUserName());
		oldSysMessage.setModifyTime(new Date());
		*/
		
		return this.update(oldSysMessage);
	}

	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysMessageService#deleteSysMessage(java.lang.Long[])
	 */
	@SuppressWarnings("unchecked")
	public int deleteSysMessage(boolean isSend,java.lang.Long[] msgId) {
		Assert.notNull(msgId);
		
		SysMessage msg = new SysMessage();
		Criteria<SysMessageCriteria> criteria = new Criteria<SysMessageCriteria>();
		SysMessageCriteria sysMessageCriteria = criteria.createCriteria(SysMessageCriteria.class);
		if(isSend){
			msg.setSendDelFlag(General.YES);
		}else{
			msg.setReceiveDelFlag(General.YES);
		}
		sysMessageCriteria.andMsgIdIn(CollectionUtils.arrayToList(msgId));
		
		return this.updateByCriteriaSelective(msg,criteria);
	}
	
	/* (non-Javadoc)
	 * @see com.pkusoft.admin.service.SysMessageService#getSysMessageSendList(com.pkusoft.admin.model.SysMessage, com.pkusoft.framework.model.Pager)
	 */
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public List<SysMessage> getSysMessageSendList(SysMessage sysMessage, Pager pager) {
		Criteria<SysMessageCriteria> criteria = new Criteria<SysMessageCriteria>();
		criteria.setPager(pager);
		criteria.setOrderByClause("SEND_TIME DESC");
		SysMessageCriteria sysMessageCriteria = criteria.createCriteria(SysMessageCriteria.class);
		sysMessageCriteria.andSendDelFlagEqualTo(General.NO);
		sysMessageCriteria.andSendUserIdEqualTo(User.getUserId());
		if(StringUtils.hasText(sysMessage.getMsgTitle())){
			sysMessageCriteria.andMsgTitleLike("%" + sysMessage.getMsgTitle() + "%");
		}
				
		List<SysMessage> list = this.getListByCriteria(criteria);
		
		int count = this.getCountByCriteria(criteria);
		pager.setTotalRecords(count);
		
		return list;
	}
}