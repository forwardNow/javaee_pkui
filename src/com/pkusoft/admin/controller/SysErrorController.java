package com.pkusoft.admin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pkusoft.admin.model.SysError;
import com.pkusoft.admin.service.SysErrorService;
import com.pkusoft.common.constants.AdminFunctionId;
import com.pkusoft.common.constants.AdminUrlRecource;
import com.pkusoft.common.util.LogUtils;
import com.pkusoft.framework.controller.BaseController;
import com.pkusoft.framework.model.GridResult;
import com.pkusoft.framework.model.JsonResult;
import com.pkusoft.framework.model.Pager;

/**
 * 错误号管理控制器
 * 
 * @author 
 */
@Controller
public class SysErrorController extends BaseController {
	/** 日志句柄 */
	private static Logger logger = LoggerFactory.getLogger(SysErrorController.class);

	/** 错误号管理服务类 */
	@Autowired
	private SysErrorService sysErrorService;

	/**
	 * 错误号管理列表页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_ERROR_LIST)
	public ModelAndView sysErrorList(ModelAndView model) {
		model.setViewName(AdminUrlRecource.SYS_ERROR_LIST);
		return model;
	}
	
	/**
	 * 错误号管理列表数据
	 * 
	 * @param sysError
	 * @param pager
	 * @return
	 */
	@RequestMapping(value = AdminUrlRecource.SYS_ERROR_LIST_DATA)
	@ResponseBody
	public GridResult sysErrorListData(SysError sysError,Pager pager) {
		try {
			List<SysError> list = sysErrorService.getSysErrorList(sysError, pager);
			return new GridResult(true, list, pager.getTotalRecords());
		} catch (Exception e) {
			logger.error("查询列表数据出错", e);
			return new GridResult(false, null);
		}
	}
	
	/**
	 * 错误号管理表单页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_ERROR_FORM)
	public ModelAndView sysErrorForm(java.lang.Long errorId,ModelAndView model) {
		try {
			if(errorId != null){
				SysError sysError = sysErrorService.get(errorId);
				model.addObject("sysError", sysError);
			}
			
			model.setViewName(AdminUrlRecource.SYS_ERROR_FORM);
			return model;
		} catch (Exception e) {
			logger.error("访问表单页面出错", e);
			throw new RuntimeException(this.getMessage(e));
		}
	}

	/**
	 * 保存错误号信息
	 * 
	 * @param sysError
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_ERROR_SAVE)
	@ResponseBody
	public JsonResult sysErrorSave(SysError sysError) {
		try {
			if(sysError.getErrorId() == null){
				sysErrorService.insertSysError(sysError);
				LogUtils.log(AdminFunctionId.SYS_ERROR_ADD, "新增错误号信息成功");
			}else{	//新增
				sysErrorService.updateSysError(sysError);
				LogUtils.log(AdminFunctionId.SYS_ERROR_UPDATE, "更新错误号信息成功");
			}
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("保存信息出错", e);
			LogUtils.log(AdminFunctionId.SYS_ERROR_ADD, "保存错误号信息失败");
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
	/**
	 * 删除错误号信息
	 * 
	 * @param errorId
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_ERROR_DELETE)
	@ResponseBody
	public JsonResult sysErrorDelete(java.lang.Long[] errorId) {
		try {
			sysErrorService.deleteSysError(errorId);
			LogUtils.log(AdminFunctionId.SYS_ERROR_DELETE, "错误号信息删除成功");
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("删除信息出错", e);
			LogUtils.log(AdminFunctionId.SYS_ERROR_DELETE, "错误号信息删除失败");
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
	/**
	 * 生成错误号字典
	 * 
	 * @param 
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_ERROR_CREATE_XML_FORM)
	@ResponseBody
	public JsonResult sysErrorCreateXmlForm(){
		try {
			sysErrorService.createDicFile();
			LogUtils.log(AdminFunctionId.SYS_ERROR_CREATE_DIC, "生成错误号字典成功");
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("生成字典失败", e);
			LogUtils.log(AdminFunctionId.SYS_ERROR_CREATE_DIC, "生成错误号字典失败");
			throw new RuntimeException(this.getMessage(e));
		}
	}
	
	/**
	 * 错误号唯一性检查
	 * 
	 * @param errorCode
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_ERROR_CHECK_CODE)
	@ResponseBody
	public JsonResult checkSysErrorListForm(java.lang.String errorCode){
		try {
			return new JsonResult(sysErrorService.checkSysErrorListForm(errorCode));
		} catch (Exception e) {
			logger.error("查询错误号失败", e);
			throw new RuntimeException(this.getMessage(e));
		}
	}

}