package com.pkusoft.admin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pkusoft.admin.model.SysMaxId;
import com.pkusoft.admin.model.SysPara;
import com.pkusoft.admin.service.SysMaxIdService;
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
public class SysMaxIdController extends BaseController {
	/** 日志句柄 */
	private static Logger logger = LoggerFactory.getLogger(SysMaxIdController.class);

	/** 服务类 */
	@Autowired
	private SysMaxIdService sysMaxIdService;

	/**
	 * 列表页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_MAX_ID_LIST)
	public ModelAndView sysMaxIdList(ModelAndView model,SysMaxId sysMaxId) { 
		model.addObject("sysMaxId", sysMaxId);
		model.setViewName(AdminUrlRecource.SYS_MAX_ID_LIST);
		return model;
	}
	
	/**
	 * 列表数据
	 * 
	 * @param sysMaxId
	 * @param pager
	 * @return
	 */
	@RequestMapping(value = AdminUrlRecource.SYS_MAX_ID_LIST_DATA)
	@ResponseBody
	public GridResult sysMaxIdListData(SysMaxId sysMaxId,Pager pager) {
		try {
			List<SysMaxId> list = sysMaxIdService.getSysMaxIdList(sysMaxId, pager);

			return new GridResult(true, list, pager.getTotalRecords());
		} catch (Exception e) {
			logger.error("查询列表数据出错", e);
			return new GridResult(false, null);
		}
	}
	
	/**
	 * 新增表单页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_MAX_ID_FORM)
	public ModelAndView sysMaxIdForm(SysMaxId sysMaxId,ModelAndView model) {
		try {
			if(sysMaxId.getIdType() != null && !"".equals(sysMaxId.getIdType())){
				model.addObject("sysMaxId", sysMaxId);
			}
			
			model.setViewName(AdminUrlRecource.SYS_MAX_ID_FORM);
			return model;
		} catch (Exception e) {
			logger.error("访问表单页面出错", e);
			throw new RuntimeException(this.getMessage(e));
		}
	}
	
	/**
	 * 修改表单页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_MAX_ID_UPDATE_FORM)
	public ModelAndView sysMaxIdUpdateForm(SysMaxId sysMaxId,ModelAndView model) {
		try {
			if((sysMaxId.getIdType() != null && !"".equals(sysMaxId.getIdType()))
					&& (sysMaxId.getIdPara1() != null && !"".equals(sysMaxId.getIdPara1()))
					&& (sysMaxId.getIdPara2() != null && !"".equals(sysMaxId.getIdPara2()))){
				sysMaxId = sysMaxIdService.getSysMaxIdDetail(sysMaxId);
				model.addObject("sysMaxId", sysMaxId);
			}
			
			model.setViewName(AdminUrlRecource.SYS_MAX_ID_UPDATE_FORM);
			return model;
		} catch (Exception e) {
			logger.error("访问表单页面出错", e);
			throw new RuntimeException(this.getMessage(e));
		}
	}

	/**
	 * 更新信息
	 * 
	 * @param sysMaxId
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_MAX_ID_SAVE)
	@ResponseBody
	public JsonResult sysMaxIdSave(SysMaxId sysMaxId) {
		try {
			sysMaxIdService.updateSysMaxId(sysMaxId);
			LogUtils.log(AdminFunctionId.SYS_MAX_ID_UPDATE, sysMaxId.getIdType() + "修改成功");
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("保存信息出错", e);
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
	/**
	 * 新增信息
	 * 
	 * @param sysMaxId
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_MAX_ID_ADD)
	@ResponseBody
	public JsonResult sysMaxIdADD(SysMaxId sysMaxId) {
		try {
			sysMaxIdService.insertSysMaxId(sysMaxId);
			LogUtils.log(AdminFunctionId.SYS_MAX_ID_ADD, sysMaxId.getIdType() + "新增成功");
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("保存信息出错", e);
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
	/**
	 * 删除信息
	 * 
	 * @param idPara2
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_MAX_ID_DELETE)
	@ResponseBody
	public JsonResult sysMaxIdDelete(SysMaxId sysMaxId) {
		try {
			sysMaxIdService.deleteSysMaxId(sysMaxId);
			LogUtils.log(AdminFunctionId.SYS_MAX_ID_DELETE, sysMaxId.getIdType() + "删除成功");
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("删除信息出错", e);
			return new JsonResult(false, this.getMessage(e));
		}
	}

}