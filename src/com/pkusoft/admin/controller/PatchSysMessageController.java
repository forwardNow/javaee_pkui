package com.pkusoft.admin.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.web.subject.WebSubject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.CookieGenerator;

import com.pkusoft.admin.model.SysMessage;
import com.pkusoft.admin.model.SysUser;
import com.pkusoft.admin.model.SysUserCriteria;
import com.pkusoft.admin.service.SysMessageService;
import com.pkusoft.admin.service.SysUserService;
import com.pkusoft.common.constants.AdminUrlRecource;
import com.pkusoft.framework.User;
import com.pkusoft.framework.constants.General;
import com.pkusoft.framework.controller.BaseController;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.model.Criteria.BaseCriteria;
import com.pkusoft.framework.model.DicXmlResult;
import com.pkusoft.framework.model.GridResult;
import com.pkusoft.framework.model.JsonResult;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.framework.util.MapUtils;
import com.pkusoft.framework.util.TokenHelper;
import com.pkusoft.framework.util.WebUtils;

/**
 * 消息控制器
 * 
 * @author 
 */
@Controller
public class PatchSysMessageController extends BaseController {
	/** 日志句柄 */
	private static Logger logger = LoggerFactory.getLogger(PatchSysMessageController.class);

	/** 消息服务类 */
	@Autowired
	private SysMessageService sysMessageService;

	/**
	 * 收件箱列表
	 * 
	 * @param sysMessage
	 * @param pager
	 * @return
	 */
	@RequestMapping("/common/sysMessageListData")
	@ResponseBody
	public GridResult sysMessageListData(boolean isSend,SysMessage sysMessage, String txtQuery) {
		try {
			List<SysMessage> list = null;
			Criteria<?> criteria = WebUtils.toCriteria(txtQuery);
			BaseCriteria sysMessageCriteria = criteria.getOredCriteria().get( 0 );
			Pager pager = criteria.getPager();
			criteria.setOrderByClause("SEND_TIME DESC");
			if(isSend){
//				list = sysMessageService.getSysMessageSendList(sysMessage, pager);
				// sysMessageCriteria.andSendDelFlagEqualTo(General.NO);
				sysMessageCriteria.addCriterion( "SEND_DEL_FLAG = " + General.NO);
				// sysMessageCriteria.andSendUserIdEqualTo(User.getUserId());
				sysMessageCriteria.addCriterion( "SEND_USER_ID = " + User.getUserId() );
			}else{
//				list = sysMessageService.getSysMessageList(sysMessage, pager);
				// sysMessageCriteria.andReceiveDelFlagEqualTo(General.NO);
				// sysMessageCriteria.andReceiveUserIdEqualTo(User.getUserId());
				sysMessageCriteria.addCriterion( "RECEIVE_DEL_FLAG = " + General.NO);
				sysMessageCriteria.addCriterion( "RECEIVE_USER_ID = " + User.getUserId() );
			}

			list = sysMessageService.getListByCriteria( criteria );
			
			if ( pager.getTotalRecords() <= 0 ) {
				int count = sysMessageService.getCountByCriteria(criteria);
				pager.setTotalRecords(count);
			}
			
			return new GridResult(true, list, pager.getTotalRecords());
		} catch (Exception e) {
			logger.error("查询列表数据出错", e);
			return new GridResult(false, null);
		}
	}
	
	@RequestMapping("/common/sysMessageModel")
	@ResponseBody
	public JsonResult sysMessageModel(Long msgId) {
		JsonResult jsonResult = new JsonResult();
		try {
			SysMessage sysMessage = sysMessageService.get(msgId);
			jsonResult.setSuccess( true );
			jsonResult.setData( sysMessage );
			return jsonResult;
		} catch (Exception e) {
			jsonResult.setSuccess( false );
			jsonResult.setMessage( "获取消息失败" );
			return jsonResult;
		}
	}
	
	@RequestMapping("/common/getSysMessageModelAndMarkAsRead")
	@ResponseBody
	public JsonResult getSysMessageModelAndMarkAsRead(Long msgId) {
		JsonResult jsonResult = new JsonResult();
		try {
			
			this.sysMessageMarkChecked( new Long[]{ msgId } );
			
			SysMessage sysMessage = sysMessageService.get(msgId);
			jsonResult.setSuccess( true );
			jsonResult.setData( sysMessage );
			return jsonResult;
		} catch (Exception e) {
			jsonResult.setSuccess( false );
			jsonResult.setMessage( "获取消息失败" );
			return jsonResult;
		}
	}
	
	/**
	 * 删除信息
	 * 
	 * @param msgId
	 * @return
	 */
	@RequestMapping("/common/sysMessageDelete")
	@ResponseBody
	public JsonResult sysMessageDelete(boolean isSend,java.lang.Long[] msgId) {
		try {
			sysMessageService.deleteSysMessage(isSend,msgId);
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("删除信息出错", e);
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
	/**
	 * 系统消息-标记选中未读消息
	 * 
	 * @param msgId[]
	 * @return
	 */
	@RequestMapping("/common/sysMessageMarkChecked")
	@ResponseBody
	public JsonResult sysMessageMarkChecked(java.lang.Long[] msgId) {
		try {
			Assert.notNull(msgId);
			//标记选中
			for (int i=0;i<msgId.length;i++) {
				SysMessage msg = new SysMessage();
				msg.setMsgId(msgId[i]);
				msg.setReadFlag(General.YES);
				msg.setReceiveTime(new Date());
				msg.setReceiveUserIp(User.getIp());
				msg.setReceiveUserId(User.getUserId());
				msg.setReceiveUserName(User.getUserName());
				sysMessageService.updateSelective(msg);
			}
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("标记选中未读消息出错", e);
			return new JsonResult(false,"标记选中未读消息出错" );
		}
	}
	
	/**
	 * 用户字典列表
	 * 
	 * @param pager
	 * @return
	 */
	@RequestMapping(value = "/common/sysMessageUserData")
	@ResponseBody
	public DicXmlResult sysMessageUserData(String deptId) {
		try {
			SysUserService sysUserService = (SysUserService) WebUtils.getBean("sysUserService");
			Criteria<SysUserCriteria> criteria = new Criteria<SysUserCriteria>();
			criteria.setOrderByClause("USER_ID");
			if(deptId != null){
				criteria.createCriteria(SysUserCriteria.class).andDeptIdEqualTo(deptId);
			}
			List<SysUser> list = sysUserService.getListByCriteria(criteria);
			return MapUtils.toDicXmlResult(list, "userId", "userName");
		} catch (Exception e) {
			logger.error("查询用户列表数据出错", e);
			return null;
		}
	}
	
	/**
	 * 消息保存信息
	 * 
	 * @param sysMessage
	 * @return
	 */
	@RequestMapping("/common/sysMessageSave")
	@ResponseBody
	public JsonResult sysMessageSave(SysMessage sysMessage) {
		
		try {
			if(sysMessage.getMsgId() == null){
				sysMessageService.insertSysMessage(sysMessage);
			}else{	//修改
				sysMessageService.updateSysMessage(sysMessage);
			}
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("保存信息出错", e);
			return new JsonResult(false, "保存消息出错");
		}
	}
	
}