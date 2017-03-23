package com.pkusoft.admin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pkusoft.admin.model.SysPara;
import com.pkusoft.admin.service.SysParaService;
import com.pkusoft.common.constants.AdminFunctionId;
import com.pkusoft.common.constants.AdminUrlRecource;
import com.pkusoft.common.util.LogUtils;
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
public class SysParaController extends BaseController {
	/** 日志句柄 */
	private static Logger logger = LoggerFactory.getLogger(SysParaController.class);

	/** 服务类 */
	@Autowired
	private SysParaService sysParaService;

	/**
	 * 列表页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_PARA_LIST)
	public ModelAndView sysParaList(ModelAndView model) {
		model.setViewName(AdminUrlRecource.SYS_PARA_LIST);
		return model;
	}
	
	/**
	 * 列表数据
	 * 
	 * @param sysPara
	 * @param pager
	 * @return
	 */
	@RequestMapping(value = AdminUrlRecource.SYS_PARA_LIST_DATA)
	@ResponseBody	  
	public GridResult getSysParaListData(SysPara sysPara,Pager pager) {
		try {
			List<SysPara> list = sysParaService.getSysParaList(sysPara, pager);

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
	@RequestMapping(AdminUrlRecource.SYS_PARA_FORM)
	public ModelAndView sysParaForm(java.lang.String paraCode,ModelAndView model) {
		try {
			if(paraCode != null){
				SysPara sysPara = sysParaService.get(paraCode);
				model.addObject("sysPara", sysPara);
			}
			
			model.setViewName(AdminUrlRecource.SYS_PARA_FORM);
			return model;
		} catch (Exception e) {
			logger.error("访问表单页面出错", e);
			throw new RuntimeException(this.getMessage(e));
		}
	}

	/**
	 * 保存信息
	 * 
	 * @param sysPara
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_PARA_SAVE)
	@ResponseBody
	public JsonResult sysParaSave(SysPara sysPara,String oldParaCode) {
		try {
			if(!StringUtils.hasText(oldParaCode)){
				sysParaService.insertSysPara(sysPara);
				LogUtils.log(AdminFunctionId.SYS_PARA_ADD, sysPara.getParaCode() + "新增成功");
			}else{
				sysParaService.updateSysPara(sysPara);
				LogUtils.log(AdminFunctionId.SYS_PARA_UPDATE, sysPara.getParaCode() + "修改成功");
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
	 * @param paraCode
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_PARA_DELETE)
	@ResponseBody
	public JsonResult sysParaDelete(java.lang.String[] paraCode) {
		try {
			sysParaService.deleteSysPara(paraCode);
			for (int i = 0; i < paraCode.length; i++) {
				LogUtils.log(AdminFunctionId.SYS_PARA_DELETE, paraCode[i]+ "删除成功");
			}
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("删除信息出错", e);
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
	/**
	 * 检查是否有同名参数名称
	 * 
	 * @param paraCode
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.CHECK_SYS_PARA_FORM)
	@ResponseBody
	public JsonResult checkSysParaForm(java.lang.String paraCode) {
		try {
			return new JsonResult(sysParaService.checkSysParaForm(paraCode));
		} catch (Exception e) {
			logger.error("参数名称唯一性验证出错", e);
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
	/**
	 * 修改页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_PARA_UPDATE_FORM)
	public ModelAndView sysParaUpdateForm(java.lang.String paraCode,ModelAndView model) {
		try {
			if(paraCode != null){
				SysPara sysPara = sysParaService.get(paraCode);
				model.addObject("sysPara", sysPara);
			}
			
			model.setViewName(AdminUrlRecource.SYS_PARA_UPDATE_FORM);
			return model;
		} catch (Exception e) {
			logger.error("访问表单页面出错", e);
			throw new RuntimeException(this.getMessage(e));
		}
	}
}