package com.pkusoft.admin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pkusoft.admin.model.SysFunction;
import com.pkusoft.admin.service.SysFunctionService;
import com.pkusoft.common.constants.AdminFunctionId;
import com.pkusoft.common.constants.AdminUrlRecource;
import com.pkusoft.common.util.LogUtils;
import com.pkusoft.framework.controller.BaseController;
import com.pkusoft.framework.model.GridResult;
import com.pkusoft.framework.model.JsonResult;
import com.pkusoft.framework.model.Pager;

/**
 * 功能号管理控制器
 * 
 * @author 
 */
@Controller
public class SysFunctionController extends BaseController {
	/** 日志句柄 */
	private static Logger logger = LoggerFactory.getLogger(SysFunctionController.class);

	/** 功能号管理服务类 */
	@Autowired
	private SysFunctionService sysFunctionService;

	/**
	 * 功能号列表页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_FUNCTION_LIST)
	public ModelAndView sysFunctionList(ModelAndView model) {
		model.setViewName(AdminUrlRecource.SYS_FUNCTION_LIST);
		return model;
	}
	
	/**
	 * 功能号列表数据
	 * 
	 * @param sysFunction
	 * @param pager
	 * @return
	 */
	@RequestMapping(value = AdminUrlRecource.SYS_FUNCTION_LIST_DATA)
	@ResponseBody
	public GridResult sysFunctionListData(SysFunction sysFunction,Pager pager) {
		try {
			List<SysFunction> list = sysFunctionService.getSysFunctionList(sysFunction, pager);
			return new GridResult(true, list, pager.getTotalRecords());
		} catch (Exception e) {
			logger.error("查询功能号列表数据出错", e);
			return new GridResult(false, null);
		}
	}
	
	/**
	 * 功能号表单页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_FUNCTION_FORM)
	public ModelAndView sysFunctionForm(java.lang.Long functionId,ModelAndView model) {
		try {
			if(functionId != null){
				SysFunction sysFunction = sysFunctionService.get(functionId);
				model.addObject("sysFunction", sysFunction);
			}
			
			model.setViewName(AdminUrlRecource.SYS_FUNCTION_FORM);
			return model;
		} catch (Exception e) {
			logger.error("访问表单页面出错", e);
			throw new RuntimeException(this.getMessage(e));
		}
	}

	/**
	 * 保存功能号信息
	 * 
	 * @param sysFunction
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_FUNCTION_SAVE)
	@ResponseBody
	public JsonResult sysFunctionSave(SysFunction sysFunction) {
		try {
			if(sysFunction.getFunctionId() == null){
				sysFunctionService.insertSysFunction(sysFunction);
				LogUtils.log(AdminFunctionId.SYS_FUNCTION_ADD, sysFunction.getFunctionName()+"新增功能号成功");
				return new JsonResult(true, "1");
			}else{	//新增
				sysFunctionService.updateSysFunction(sysFunction);
				LogUtils.log(AdminFunctionId.SYS_FUNCTION_UPDATE,sysFunction.getFunctionName()+"修改功能号信息成功");
			}
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("保存信息出错", e);
			LogUtils.log(AdminFunctionId.SYS_FUNCTION_ADD, sysFunction.getFunctionName()+"保存功能号信息失败");
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
	/**
	 * 删除功能号信息
	 * 
	 * @param functionId
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_FUNCTION_DELETE)
	@ResponseBody
	public JsonResult sysFunctionDelete(java.lang.Long[] functionId) {
		try {
			sysFunctionService.deleteSysFunction(functionId);
			LogUtils.log(AdminFunctionId.SYS_FUNCTION_DELETE, functionId+"删除功能号成功");
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("删除信息出错", e);
			LogUtils.log(AdminFunctionId.SYS_FUNCTION_DELETE, functionId+"删除功能号失败");
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
	/**
	 * 生成功能号字典
	 * 
	 * @param 
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_FUNCTION_CREATE_XML_FORM)
	@ResponseBody
	public JsonResult sysFunctionCreateXmlForm(){
		try {
			sysFunctionService.createDicFile();
			LogUtils.log(AdminFunctionId.SYS_FUNCTION_CREATE_DIC, "生成功能号字典成功");
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("生成字典失败", e);
			LogUtils.log(AdminFunctionId.SYS_FUNCTION_CREATE_DIC, "生成功能号字典失败");
			throw new RuntimeException(this.getMessage(e));
		}
	}
	
	/**
	 * 功能号唯一性检查
	 * 
	 * @param functionCode
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_FUNCTION_CHECK_CODE)
	@ResponseBody
	public JsonResult checksysFunctionListForm(java.lang.String functionCode){
		try {
			return new JsonResult(sysFunctionService.checkSysFunctionListForm(functionCode));
		} catch (Exception e) {
			logger.error("查询功能号失败", e);
			throw new RuntimeException(this.getMessage(e));
		}
	}

}