package com.pkusoft.admin.service;

import java.util.List;

import com.pkusoft.framework.service.BaseService;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.admin.model.SysMessage;

/**
 * 服务接口
 * @author 
 *
 */
public interface SysMessageService extends BaseService<SysMessage>{
	/**
	 * 查询列表
	 * 
	 * @param sysMessage
	 * @param pager
	 * @return
	 */
	List<SysMessage> getSysMessageList(SysMessage sysMessage, Pager pager);

	/**
	 * 新增信息
	 * 
	 * @param sysMessage
	 * @return
	 */
	int insertSysMessage(SysMessage sysMessage);
	
	/**
	 * 修改信息
	 * 
	 * @param sysMessage
	 * @return
	 */
	int updateSysMessage(SysMessage sysMessage);
	
	/**
	 * 删除信息
	 * 
	 * @param isSend
	 * @param msgId
	 * @return
	 */
	int deleteSysMessage(boolean isSend,java.lang.Long[] msgId);
	
	/**
	 * 发件箱查询列表
	 * 
	 * @param sysMessage
	 * @param pager
	 * @return
	 */
	List<SysMessage> getSysMessageSendList(SysMessage sysMessage, Pager pager);
}