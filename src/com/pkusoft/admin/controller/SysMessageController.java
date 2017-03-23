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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.CookieGenerator;

import com.pkusoft.admin.model.SysDept;
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
public class SysMessageController extends BaseController {
	/** 日志句柄 */
	private static Logger logger = LoggerFactory.getLogger(SysMessageController.class);

	/** 消息服务类 */
	@Autowired
	private SysMessageService sysMessageService;

	/**
	 * 消息列表页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_MESSAGE_LIST)
	public ModelAndView sysMessageList(ModelAndView model) {
		model.setViewName(AdminUrlRecource.SYS_MESSAGE_LIST);
		return model;
	}
	
	/**
	 * 收件箱列表
	 * 
	 * @param sysMessage
	 * @param pager
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_MESSAGE_LIST_DATA)
	@ResponseBody
	public GridResult sysMessageListData(boolean isSend,SysMessage sysMessage,Pager pager) {
		try {
			List<SysMessage> list = null;
			if(isSend){
				list = sysMessageService.getSysMessageSendList(sysMessage, pager);
			}else{
				list = sysMessageService.getSysMessageList(sysMessage, pager);
			}

			return new GridResult(true, list, pager.getTotalRecords());
		} catch (Exception e) {
			logger.error("查询列表数据出错", e);
			return new GridResult(false, null);
		}
	}
	
	
	/**
	 * 消息表单页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_MESSAGE_FORM)
	public ModelAndView sysMessageForm(java.lang.Long msgId,ModelAndView model) {
		try {
			if(msgId != null){
				SysMessage sysMessage = sysMessageService.get(msgId);
				model.addObject("sysMessage", sysMessage);
			}
			
			model.setViewName(AdminUrlRecource.SYS_MESSAGE_FORM);
			return model;
		} catch (Exception e) {
			logger.error("访问表单页面出错", e);
			throw new RuntimeException(this.getMessage(e));
		}
	}

	/**
	 * 消息保存信息
	 * 
	 * @param sysMessage
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_MESSAGE_SAVE)
	@ResponseBody
	public JsonResult sysMessageSave(SysMessage sysMessage) {
String strToken = TokenHelper.generateGUID();
		
		ServletRequest sRequest = ((WebSubject)SecurityUtils.getSubject()).getServletRequest();
		ServletResponse sResponse = ((WebSubject)SecurityUtils.getSubject()).getServletResponse();
		HttpServletRequest request = (HttpServletRequest)sRequest;
		HttpServletResponse response = (HttpServletResponse)sResponse;
		
		SecurityUtils.getSubject().getSession().setAttribute("_pku_token_", strToken);
		
		Cookie cookieToken = org.springframework.web.util.WebUtils.getCookie(request, "_pku_token_");
		if(cookieToken != null){
			cookieToken.setValue(strToken);
			response.addCookie(cookieToken);
		}else{
			CookieGenerator cg = new CookieGenerator();
			cg.setCookiePath("/");
			cg.setCookieMaxAge(-1);
			cg.setCookieName("_pku_token_");
			cg.addCookie(response, strToken);
		}
		try {
			response.flushBuffer();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			if(sysMessage.getMsgId() == null){
				sysMessageService.insertSysMessage(sysMessage);
			}else{	//修改
				sysMessageService.updateSysMessage(sysMessage);
			}
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("保存信息出错", e);
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
	/**
	 * 消息删除信息
	 * 
	 * @param msgId
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_MESSAGE_DELETE)
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
	 * 用户字典列表
	 * 
	 * @param pager
	 * @return
	 */
	@RequestMapping(value = AdminUrlRecource.SYS_MESSAGE_USER_DATA)
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
	 * 消息查看
	 * 
	 * @param msgId
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_MESSAGE_DETAIL)
	public ModelAndView sysMessageDetail(Long msgId,ModelAndView model) {
		
		SysMessage sysMessage = sysMessageService.get(msgId);
		
		if(General.NO.equals(sysMessage.getReadFlag()) && sysMessage.getReceiveUserId().longValue() == User.getUserId().longValue()){
			SysMessage msg = new SysMessage();
			msg.setMsgId(msgId);
			msg.setReadFlag(General.YES);
			msg.setReceiveTime(new Date());
			msg.setReceiveUserIp(User.getIp());
			sysMessageService.updateSelective(msg);
			model.addObject("sysMessage", sysMessage);
		}
		
		model.addObject("sysMessage", sysMessage);
		model.setViewName(AdminUrlRecource.SYS_MESSAGE_DETAIL);
		return model;
	}
}