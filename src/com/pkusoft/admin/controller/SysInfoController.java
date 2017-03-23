package com.pkusoft.admin.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pkusoft.common.constants.AdminUrlRecource;
import com.pkusoft.framework.Config;
import com.pkusoft.framework.User.UserInfo;
import com.pkusoft.framework.constants.General;
import com.pkusoft.framework.controller.BaseController;
import com.pkusoft.framework.model.OnlineUsers;

/**
 * 系统信息控制器
 * 
 */
@Controller
public class SysInfoController extends BaseController {

	/** 日志句柄 */
	private static Logger logger = LoggerFactory.getLogger(SysInfoController.class);
	
	/**
	 * 系统信息页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_INFO)
	public ModelAndView sysInfo(ModelAndView model) {
		
		model.addObject("containerStartTime", Config.getValue("System.ContainerStartTime"));
		model.addObject("users", getOnlineUsers());
		model.addObject("online", OnlineUsers.getInstance());
		model.setViewName(AdminUrlRecource.SYS_INFO);
		return model;
	}
	
	/**
	 * 在线用户map
	 * @return map集合
	 */
	private List<Map<String,Object>> getOnlineUsers(){
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		Collection<HttpSession> oList = OnlineUsers.getInstance().getOnlineSessions();
		for (Iterator<HttpSession> iterator = oList.iterator(); iterator.hasNext();) {
			HttpSession httpSession = iterator.next();
			UserInfo user = (UserInfo) httpSession.getAttribute(General.AUTH_KEY);
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("sessionId", httpSession.getId());
			map.put("creationTime", httpSession.getCreationTime());
			map.put("lastAccessedTime", httpSession.getLastAccessedTime());
			map.put("user", user);
			list.add(map);
		}
		return list;
	}
	
	/**
	 * 强制踢出指定的登录用户
	 * 
	 * @param sessionId
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_INFO_FORCE_EXIT)
	public String sysInfoForceExit(@RequestParam("sessionId") String sessionId,ModelAndView model) {
		OnlineUsers.getInstance().forceExit(sessionId);
		
		return "redirect:sysInfo";
	}
	
	/**
	 * 强制踢出所有登录用户
	 * @param sessionId
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_INFO_FORCE_EXIT_ALL)
	public String sysInfoForceExitAll(ModelAndView model) {
		OnlineUsers.getInstance().forceExit();
		
		return "redirect:sysInfo";
	}


}
