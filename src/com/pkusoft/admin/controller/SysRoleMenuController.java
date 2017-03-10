package com.pkusoft.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pkusoft.admin.service.SysRoleMenuService;
import com.pkusoft.common.constants.AdminUrlRecource;
import com.pkusoft.framework.controller.BaseController;
import com.pkusoft.framework.model.JsonResult;

/**
 * 控制器
 * 
 * @author 
 */
@Controller
public class SysRoleMenuController extends BaseController {
	/** 日志句柄 */
	private static Logger logger = LoggerFactory.getLogger(SysRoleMenuController.class);

	/** 服务类 */
	@Autowired
	private SysRoleMenuService sysRoleMenuService;

	/**
	 * 保存信息
	 * 
	 * @param roleId
	 * @param itemId
	 * @param opType
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_ROLE_MENU_SAVE)
	@ResponseBody
	public JsonResult sysRoleMenuSave(Long roleId, Long[] menuId) {
		try {
			sysRoleMenuService.insertSysRoleMenu(roleId, menuId);
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("保存信息出错", e);
			return new JsonResult(false, this.getMessage(e));
		}
	}


}