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

import com.pkusoft.admin.model.SysDept;
import com.pkusoft.admin.service.SysDeptService;
import com.pkusoft.framework.controller.BaseController;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.model.GridResult;
import com.pkusoft.framework.model.JsonResult;
import com.pkusoft.framework.util.WebUtils;


/**
 * 单位管理控制器
 * 
 * @author 
 */
@Controller
public class SysDeptController extends BaseController {
	/** 日志句柄 */
	private static Logger logger = LoggerFactory.getLogger(SysDeptController.class);

	/** 单位管理服务类 */
	@Autowired
	private SysDeptService sysDeptService;
	/**
	 * 单位列表数据
	 * 
	 * @param sysDept
	 * @param pager
	 * @return
	 */
	@RequestMapping("/admin/sysDept/listData")
	@ResponseBody
	public GridResult sysDeptListData(String txtQuery) {
		try {
			Criteria<?> criteria = WebUtils.toCriteria(txtQuery);
			List<SysDept> list = sysDeptService.getSysDeptList(criteria);
			int count = criteria.getPager() == null ? list.size() : criteria.getPager().getTotalRecords();
			return new GridResult(true, list, count);
		} catch (Exception e) {
			logger.error("查询单位列表数据出错", e);
			return new GridResult(false, null);
		}
	}
	
	
	/**
	 * 删除单位
	 * 
	 * @param deptId
	 * @return
	 */
	@RequestMapping("/admin/sysDept/delete")
	@ResponseBody
	public JsonResult sysDeptDelete(String[] deptId) {
		try {
			sysDeptService.deleteSysDept(deptId);
			
			//LogUtils.log("/admin/sysDeptDelete", "单位信息删除成功");
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("删除单位信息出错", e);
			//LogUtils.log("/admin/sysDeptDelete", "单位信息删除失败");
			return new JsonResult(false, this.getMessage(e));
		}
	}
	/**
	 * 单位管理列表页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/admin/sysDept/template/list")
	public ModelAndView sysDeptList(ModelAndView model) {
		try {
			model.setViewName( "/admin/sysDept/template/list" );
			return model;
		} catch (Exception e) {
			logger.error("访问单位管理列表页面出错", e);
			throw new RuntimeException(this.getMessage(e));
		}
	}
	/**
	 * 单位管理详情页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/admin/sysDept/template/detail")
	public ModelAndView sysDeptDetail(String deptId,ModelAndView model) {
		try {
			if(deptId != null){
				SysDept sysDept = sysDeptService.get(deptId);
				model.addObject("sysDept", sysDept);
			}
			
			model.setViewName( "/admin/sysDept/template/detail" );
			return model;
		} catch (Exception e) {
			logger.error("访问单位管理表单页面出错", e);
			throw new RuntimeException(this.getMessage(e));
		}
	}
	/**
	 * 单位管理编辑页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/admin/sysDept/template/edit")
	public ModelAndView sysDeptEdit(String deptId,ModelAndView model) {
		try {
			if(deptId != null){
				SysDept sysDept = sysDeptService.get(deptId);
				model.addObject("sysDept", sysDept);
			}
			
			model.setViewName( "/admin/sysDept/template/edit" );
			return model;
		} catch (Exception e) {
			logger.error("访问单位管理表单页面出错", e);
			throw new RuntimeException(this.getMessage(e));
		}
	}

	/**
	 * 保存单位信息
	 * 
	 * @param sysDept
	 * @return
	 */
	@RequestMapping("/admin/sysDept/save")
	@ResponseBody
	public JsonResult sysDeptSave(SysDept sysDept,String oldDeptId) {
		try {
			if(!StringUtils.hasText(oldDeptId)){
				sysDeptService.insertSysDept(sysDept);
				//LogUtils.log(AdminFunctionId.SYS_DEPT_SAVE_ADD, sysDept.getDeptName() + "新增单位成功");
			}else{
				sysDeptService.updateSysDept(oldDeptId, sysDept);
				//LogUtils.log(AdminFunctionId.SYS_DEPT_SAVE_UPDATE, sysDept.getDeptName() + "修改单位信息成功");
			}
			
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("保存单位信息出错", e);
			// LogUtils.log(AdminFunctionId.SYS_DEPT_SAVE, sysDept.getDeptName() + "保存单位失败");
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
}
