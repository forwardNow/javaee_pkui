package com.pkusoft.admin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pkusoft.admin.model.SysResource;
import com.pkusoft.admin.service.SysResourceService;
import com.pkusoft.common.constants.AdminFunctionId;
import com.pkusoft.common.constants.AdminUrlRecource;
import com.pkusoft.common.util.LogUtils;
import com.pkusoft.framework.controller.BaseController;
import com.pkusoft.framework.model.GridResult;
import com.pkusoft.framework.model.JsonResult;
import com.pkusoft.framework.model.Pager;

/**
 * 资源控制器
 * @author caizh
 */
@Controller
public class SysResourceController extends BaseController {
	/** 日志句柄 */
	private static Logger logger = LoggerFactory.getLogger(SysResourceController.class);

	/** 资源服务类 */
	@Autowired
	private SysResourceService sysResourceService;

	/**
	 * 资源列表页面
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_RESOURCE_LIST)
	public ModelAndView sysResourceList(ModelAndView model) {
		model.setViewName(AdminUrlRecource.SYS_RESOURCE_LIST);
		return model;
	}
	
	/**
	 * 资源选择菜单页面
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_RESOURCE_MENU)
	public ModelAndView sysResourceMenu(ModelAndView model) {
		model.setViewName(AdminUrlRecource.SYS_RESOURCE_MENU);
		return model;
	}
	
	/**
	 * 资源列表数据
	 * @param sysResource
	 * @param pager
	 * @return
	 */
	@RequestMapping(value = AdminUrlRecource.SYS_RESOURCE_LIST_DATA)
	@ResponseBody
	public GridResult sysResourceListData(SysResource sysResource,Pager pager) {
		try {
			List<SysResource> list = sysResourceService.getSysResourceList(sysResource, pager);
			//LogUtils.log(AdminFunctionId.SYS_RESOURCE_LIST_DATA, "资源列表数据查询成功");
			return new GridResult(true, list, pager.getTotalRecords());
		} catch (Exception e) {
			logger.error("查询列表数据出错", e);
			//LogUtils.log(AdminFunctionId.SYS_RESOURCE_LIST_DATA, "资源列表数据查询失败");
			return new GridResult(false, null);
		}
	}
	
	/**
	 * 资源表单页面
	 * @param resourceId
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_RESOURCE_FORM)
	public ModelAndView sysResourceForm(java.lang.Long resourceId,ModelAndView model) {
		try {
			if(null != resourceId  ){ 
				SysResource sysResource = sysResourceService.get(resourceId);
				model.addObject("sysResource", sysResource);
			}
			model.setViewName(AdminUrlRecource.SYS_RESOURCE_FORM);
			return model;
		} catch (Exception e) {
			logger.error("访问表单页面出错", e);
			throw new RuntimeException(this.getMessage(e));
		}
	}

	/**
	 * 资源信息保存
	 * 如果编号空则为新增，否则为修改
	 * @param sysResource
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_RESOURCE_SAVE)
	@ResponseBody
	public JsonResult sysResourceSave(SysResource sysResource) {
		try {
			if(null == sysResource.getResourceId()){ //编号为空：添加，  不为空：修改
				sysResourceService.insertSysResource(sysResource);
				LogUtils.log(AdminFunctionId.SYS_RESOURCE_ADD, "资源新增成功");
			}else{	
				sysResourceService.updateSysResource(sysResource);
				LogUtils.log(AdminFunctionId.SYS_RESOURCE_UPDATE, "资源修改成功");
			}
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("保存信息出错", e);
			LogUtils.log(AdminFunctionId.SYS_RESOURCE_SAVE, "资源保存失败");
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
	/**
	 * 资源信息删除
	 * @param resourceId
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_RESOURCE_DELETE)
	@ResponseBody
	public JsonResult sysResourceDelete(java.lang.Long[] resourceId) {
		try {
			sysResourceService.deleteSysResource(resourceId);
			LogUtils.log(AdminFunctionId.SYS_RESOURCE_DELETE, "资源删除失败");
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("删除信息出错", e);
			LogUtils.log(AdminFunctionId.SYS_RESOURCE_DELETE, "资源删除成功");
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
	/**
	 * 检查资源名称
	 * @return XML文件
	 */
	@RequestMapping(AdminUrlRecource.SYS_RESOURCE_CHECK_NAME)
	@ResponseBody
	public JsonResult sysResourceCheckName(java.lang.String resourceName) {
		try {
			return new JsonResult(sysResourceService.sysResourceCheckName(resourceName));
		} catch (Exception e) {
			logger.error("检查资源名称失败", e);
			throw new RuntimeException(this.getMessage(e));
		}
	}

	/**
	 * 角色资源列表数据
	 * 
	 * @param roleId
	 * @return
	 */
	@RequestMapping(value = AdminUrlRecource.SYS_ROLE_RESOUCE_LIST_DATA)
	@ResponseBody
	public GridResult sysRoleResouceListData(Long roleId) {
		try {
			@SuppressWarnings("rawtypes")
            List list = sysResourceService.getResourceListByRole(roleId);
			return new GridResult(true, list);
		} catch (Exception e) {
			logger.error("查询列表数据出错", e);
			return new GridResult(false, null);
		}
	}

}