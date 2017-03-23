package com.pkusoft.admin.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pkusoft.admin.service.SysRoleUserService;
import com.pkusoft.common.constants.AdminUrlRecource;
import com.pkusoft.framework.controller.BaseController;
import com.pkusoft.framework.model.JsonResult;


/**
 * 控制器
 * 
 * @author 
 */
@Controller
public class SysRoleUserController extends BaseController {
	/** 日志句柄 */
	private static Logger logger = LoggerFactory.getLogger(SysRoleUserController.class);

	/** 服务类 */
	@Autowired
	private SysRoleUserService sysRoleUserService;
	
	/**
	 * 列表页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_ROLE_USER_LIST)
	public ModelAndView sysRoleUserList(Long roleId, ModelAndView model) {
		model.addObject("roleId", roleId);
		model.setViewName(AdminUrlRecource.SYS_ROLE_USER_LIST);
		return model;
	}
	
	
	/**
	 * 保存信息
	 * 
	 * @param sysRoleUser
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_ROLE_USER_SAVE)
	@ResponseBody
	public JsonResult sysRoleUserSave(Long[] userId, Long roleId) {
		try {
			sysRoleUserService.insertSysRoleUser(userId, roleId);
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("保存信息出错", e);
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
	/**
	 * 删除信息
	 * 
	 * @param roleUserId
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_ROLE_USER_DELETE)
	@ResponseBody
	public JsonResult sysRoleUserDelete(Long[] userId, Long roleId) {
		try {
			sysRoleUserService.deleteSysRoleUser(userId, roleId);
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("删除信息出错", e);
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
	
	

}