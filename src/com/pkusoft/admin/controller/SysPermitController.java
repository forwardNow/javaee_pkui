package com.pkusoft.admin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pkusoft.admin.model.SysPermit;
import com.pkusoft.admin.service.SysPermitService;
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
public class SysPermitController extends BaseController {
	/** 日志句柄 */
	private static Logger logger = LoggerFactory.getLogger(SysPermitController.class);

	/** 服务类 */
	@Autowired
	private SysPermitService sysPermitService;

	/**
	 * 列表页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_PERMIT_LIST)
	public ModelAndView sysPermitList(ModelAndView model) {
		model.setViewName(AdminUrlRecource.SYS_PERMIT_LIST);
		return model;
	}
	
	/**
	 * 列表数据
	 * 
	 * @param sysPermit
	 * @param pager
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_PERMIT_LIST_DATA)
	@ResponseBody
	public GridResult sysPermitListData(SysPermit sysPermit,Pager pager) {
		try {
			List<SysPermit> list = sysPermitService.getSysPermitList(sysPermit, pager);

			return new GridResult(true, list, pager.getTotalRecords());
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
	@RequestMapping(AdminUrlRecource.SYS_PERMIT_FORM)
	public ModelAndView sysPermitForm(java.lang.Long permitId,ModelAndView model) {
		try {
			if(permitId != null){
				SysPermit sysPermit = sysPermitService.get(permitId);
				model.addObject("sysPermit", sysPermit);
			}
			
			model.setViewName(AdminUrlRecource.SYS_PERMIT_FORM);
			return model;
		} catch (Exception e) {
			logger.error("访问表单页面出错", e);
			throw new RuntimeException(this.getMessage(e));
		}
	}

	/**
	 * 保存信息
	 * 
	 * @param sysPermit
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_PERMIT_SAVE)
	@ResponseBody
	public JsonResult sysPermitSave(SysPermit sysPermit) {
		try {
			if(sysPermit.getPermitId() == null){
				sysPermitService.insertSysPermit(sysPermit);
			}else{	//修改
				sysPermitService.updateSysPermit(sysPermit);
			}
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("保存信息出错", e);
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
	/**
	 * 删除信息
	 * 
	 * @param permitId
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_PERMIT_DELETE)
	@ResponseBody
	public JsonResult sysPermitDelete(java.lang.Long[] permitId) {
		try {
			sysPermitService.deleteSysPermit(permitId);
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("删除信息出错", e);
			return new JsonResult(false, this.getMessage(e));
		}
	}

}