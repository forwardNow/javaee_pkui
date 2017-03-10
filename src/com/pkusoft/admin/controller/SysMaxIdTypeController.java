package com.pkusoft.admin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pkusoft.admin.model.SysMaxIdType;
import com.pkusoft.admin.service.SysMaxIdTypeService;
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
public class SysMaxIdTypeController extends BaseController {
	/** 日志句柄 */
	private static Logger logger = LoggerFactory.getLogger(SysMaxIdTypeController.class);

	/** 服务类 */
	@Autowired
	private SysMaxIdTypeService sysMaxIdTypeService;

	/**
	 * 列表页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_MAX_ID_TYPE_LIST)
	public ModelAndView sysMaxIdTypeList(ModelAndView model) {
		model.setViewName(AdminUrlRecource.SYS_MAX_ID_TYPE_LIST);
		return model;
	}
	
	/**
	 * 列表数据
	 * 
	 * @param sysMaxIdType
	 * @param pager
	 * @return
	 */
	@RequestMapping(value = AdminUrlRecource.SYS_MAX_ID_TYPE_LIST_DATA)
	@ResponseBody
	public GridResult sysMaxIdTypeListData(SysMaxIdType sysMaxIdType,Pager pager) {
		try {
			List<SysMaxIdType> list = sysMaxIdTypeService.getSysMaxIdTypeList(sysMaxIdType, pager);

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
	@RequestMapping(AdminUrlRecource.SYS_MAX_ID_TYPE_FORM)
	public ModelAndView sysMaxIdTypeForm(java.lang.String idType,ModelAndView model) {
		try {
			if(idType != null){
				SysMaxIdType sysMaxIdType = sysMaxIdTypeService.get(idType);
				model.addObject("sysMaxIdType", sysMaxIdType);
			}
			
			model.setViewName(AdminUrlRecource.SYS_MAX_ID_TYPE_FORM);
			return model;
		} catch (Exception e) {
			logger.error("访问表单页面出错", e);
			throw new RuntimeException(this.getMessage(e));
		}
	}

	/**
	 * 保存信息
	 * 
	 * @param sysMaxIdType
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_MAX_ID_TYPE_SAVE)
	@ResponseBody
	public JsonResult sysMaxIdTypeSave(SysMaxIdType sysMaxIdType) {
		try {
			sysMaxIdTypeService.updateSysMaxIdType(sysMaxIdType);
			LogUtils.log(AdminFunctionId.SYS_MAX_ID_TYPE_UPDATE, sysMaxIdType.getIdName() + "修改成功");
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("保存信息出错", e);
			return new JsonResult(false, this.getMessage(e));
		}
	}
	/**
	 * 新增信息
	 * 
	 * @param sysMaxIdType
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_MAX_ID_TYPE_ADD)
	@ResponseBody
	public JsonResult sysMaxIdTypeAdd(SysMaxIdType sysMaxIdType) {
		try {
			sysMaxIdTypeService.insertSysMaxIdType(sysMaxIdType);
			LogUtils.log(AdminFunctionId.SYS_MAX_ID_TYPE_ADD, sysMaxIdType.getIdName() + "新增成功");
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("保存信息出错", e);
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
	/**
	 * 修改页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_MAX_ID_TYPE_UPDATE_FORM)
	public ModelAndView sysMaxIdTypeUpdateForm(java.lang.String idType,ModelAndView model) {
		try {
			if(idType != null){
				SysMaxIdType sysMaxIdType = sysMaxIdTypeService.get(idType);
				model.addObject("sysMaxIdType", sysMaxIdType);

			}
			model.setViewName(AdminUrlRecource.SYS_MAX_ID_TYPE_UPDATE_FORM);
			return model;
		} catch (Exception e) {
			logger.error("访问表单页面出错", e);
			throw new RuntimeException(this.getMessage(e));
		}
	}
	
	/**
	 * 删除信息
	 * 
	 * @param idType
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_MAX_ID_TYPE_DELETE)
	@ResponseBody
	public JsonResult sysMaxIdTypeDelete(java.lang.String[] idType) {
		try {
			sysMaxIdTypeService.deleteSysMaxIdType(idType);
			for (int i = 0; i < idType.length; i++) {
				LogUtils.log(AdminFunctionId.SYS_MAX_ID_TYPE_DELETE, idType[i] + "删除成功");
			}
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("删除信息出错", e);
			return new JsonResult(false, this.getMessage(e));
		}
	}

	/**
	 * 检查编号类型唯一性
	 * 
	 * @param idName 编号类型
	 * @return false 没同名参数
	 * 			true 有同名参数
	 */
	@RequestMapping(AdminUrlRecource.CHECK_SYS_MAX_ID_TYPE_FORM)
	@ResponseBody
	public JsonResult checkSysMaxIdNameForm(SysMaxIdType sysMaxIdType) {
		try {
			return new JsonResult(sysMaxIdTypeService.checkSysMaxIdType(sysMaxIdType.getIdType()));
		} catch (Exception e) {
			logger.error("检查编号类型唯一性出错", e);
			return new JsonResult(false, this.getMessage(e));
		}
	}
}