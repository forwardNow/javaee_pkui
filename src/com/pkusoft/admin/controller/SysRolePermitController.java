package com.pkusoft.admin.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pkusoft.admin.model.SysRolePermit;
import com.pkusoft.admin.service.SysRolePermitService;
import com.pkusoft.common.constants.AdminUrlRecource;
import com.pkusoft.framework.controller.BaseController;
import com.pkusoft.framework.model.GridResult;
import com.pkusoft.framework.model.JsonResult;
import com.pkusoft.framework.model.Pager;

/**
 * 控制器
 * 
 * @author 
 */
@Controller
public class SysRolePermitController extends BaseController {
	/** 日志句柄 */
	private static Logger logger = LoggerFactory.getLogger(SysRolePermitController.class);

	/** 服务类 */
	@Autowired
	private SysRolePermitService sysRolePermitService;

	/**
	 * 列表页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_ROLE_PERMIT_LIST)
	public ModelAndView sysRolePermitList(ModelAndView model) {
		model.setViewName(AdminUrlRecource.SYS_ROLE_PERMIT_LIST);
		return model;
	}
	
	/**
	 * 列表数据
	 * 
	 * @param sysRolePermit
	 * @param pager
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_ROLE_PERMIT_LIST_DATA)
	@ResponseBody
	public GridResult sysRolePermitListData(Long roleId) {
		try {
			List<Map<String,Object>> list = sysRolePermitService.getPermitListByRoleId(roleId);
			return new GridResult(true, list);
		} catch (Exception e) {
			logger.error("查询列表数据出错", e);
			return new GridResult(false, null);
		}
	}
	
	/**
	 * 表单页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_ROLE_PERMIT_FORM)
	public ModelAndView sysRolePermitForm(java.lang.Long rolePermitId,ModelAndView model) {
		try {
			if(rolePermitId != null){
				SysRolePermit sysRolePermit = sysRolePermitService.get(rolePermitId);
				model.addObject("sysRolePermit", sysRolePermit);
			}
			
			model.setViewName(AdminUrlRecource.SYS_ROLE_PERMIT_FORM);
			return model;
		} catch (Exception e) {
			logger.error("访问表单页面出错", e);
			throw new RuntimeException(this.getMessage(e));
		}
	}

	/**
	 * 保存信息
	 * 
	 * @param sysRolePermit
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_ROLE_PERMIT_SAVE)
	@ResponseBody
	public JsonResult sysRolePermitSave(Long roleId,Long[] permitId) {
		try {
			sysRolePermitService.insertSysRolePermit(roleId,permitId);
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("保存数据权限出错", e);
			return new JsonResult(false, null);
		}
	}
	
	/**
	 * 删除信息
	 * 
	 * @param rolePermitId
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_ROLE_PERMIT_DELETE)
	@ResponseBody
	public JsonResult sysRolePermitDelete(java.lang.Long[] rolePermitId) {
		try {
			sysRolePermitService.deleteSysRolePermit(rolePermitId);
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("删除信息出错", e);
			return new JsonResult(false, this.getMessage(e));
		}
	}

}