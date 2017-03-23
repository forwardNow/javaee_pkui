package com.pkusoft.common.util;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.pkusoft.admin.model.SysFunction;
import com.pkusoft.admin.model.SysLog;
import com.pkusoft.admin.service.SysLogService;
import com.pkusoft.common.cache.FunctionIdCache;
import com.pkusoft.common.constants.IdType;
import com.pkusoft.framework.User;
import com.pkusoft.framework.util.MaxIdUtils;
import com.pkusoft.framework.util.WebUtils;

/**
 * 记录日志，根据功能号记录日志。用户信息从登录用户线程变量中获取，还根据功能号从缓存里面取得模块编号、子模块编号、日志类型等信息。
 * @author tanggj
 *
 */
@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
public class LogUtils {
	/** 日志句柄 */
	private static Logger logger = LoggerFactory.getLogger(LogUtils.class);

	/**
	 * 日志服务类
	 */
	private static SysLogService sysLogService;
	
	/**
	 * 获取日志服务类
	 * @return
	 */
	public static SysLogService getSysLogService(){
		if(sysLogService == null){
			sysLogService = WebUtils.getBean(SysLogService.class);
		}
		return sysLogService;
	}

	/**
	 * 记录日志
	 * @param functionId 功能号
	 * @param logInfo 日志信息
	 * @return 日志编号
	 */
	public static Long log(int functionId,String logInfo){
		try {
			Assert.hasText(logInfo);
			
			Long logId = MaxIdUtils.getLongMaxIdA(IdType.SYS_LOG);
			
			SysLog sysLog = new SysLog();
			
			// 从功能号缓存里面获取
			SysFunction sysFunction = FunctionIdCache.get(String.valueOf(functionId));
			sysLog.setLogType(sysFunction.getLogType());
			sysLog.setOperType(sysFunction.getOperationType());
			sysLog.setModelId(sysFunction.getModule());
			sysLog.setSubModelId(sysFunction.getSubmodule());
			sysLog.setFunctionId(String.valueOf(functionId));
			
			sysLog.setLogInfo(logInfo);
			sysLog.setUserId(User.getUserId());
			sysLog.setLoginName(User.getLoginName());
			sysLog.setUserName(User.getUserName());
			sysLog.setDeptId(User.getDeptId());
			sysLog.setDeptName(User.getDeptName());
			sysLog.setLogDeptLevel(User.getUserLevel());
			sysLog.setIp(User.getIp());
			sysLog.setLogTime(new Date());
			sysLog.setCunitid(User.getCunitid());
			sysLog.setSunitid(User.getSunitid());
			sysLog.setTunitid(User.getTunitid());
			sysLog.setLogId(logId);
			
			getSysLogService().insert(sysLog);
			
			return logId;
		} catch (Exception e) {
			logger.error("记录日志出错",e);
			return new Long(-1);
		}
	}
	
}
