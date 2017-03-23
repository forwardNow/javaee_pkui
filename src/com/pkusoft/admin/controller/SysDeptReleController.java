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

import com.pkusoft.admin.model.SysDeptRele;
import com.pkusoft.admin.model.SysDeptReleKey;
import com.pkusoft.admin.service.SysDeptReleService;
import com.pkusoft.common.constants.AdminFunctionId;
import com.pkusoft.common.constants.AdminUrlRecource;
import com.pkusoft.common.util.LogUtils;
import com.pkusoft.framework.controller.BaseController;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.model.GridResult;
import com.pkusoft.framework.model.JsonResult;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.framework.util.WebUtils;
import com.pkusoft.framework.util.StringUtils;
import com.pkusoft.framework.util.JsonUtils;

/**
 * 数据归属单位控制器
 * 
 * @author 
 */
@Controller
public class SysDeptReleController extends BaseController {
	/** 数据归属单位日志句柄 */
	private static Logger logger = LoggerFactory.getLogger(SysDeptReleController.class);

	/** 数据归属单位服务类 */
	@Autowired
	private SysDeptReleService sysDeptReleService;

	/**
	 * 数据归属单位列表页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_DEPT_RELE_LIST)
	public ModelAndView sysDeptReleList(String deptId,ModelAndView model) {
		model.addObject("deptId", deptId);
		model.setViewName(AdminUrlRecource.SYS_DEPT_RELE_LIST);
		return model;
	}
	
	/**
	 * 数据归属单位列表数据
	 * 
	 * @param txtQuery 查询条件
	 * @return 标准列表对象
	 */
	@RequestMapping(AdminUrlRecource.SYS_DEPT_RELE_LIST_DATA)
	@ResponseBody
	public GridResult sysDeptReleListData(String txtQuery) {
		try {
			Criteria<?> criteria = WebUtils.toCriteria(txtQuery);
			
			List<SysDeptRele> list = sysDeptReleService.getSysDeptReleList(criteria);
			int count = criteria.getPager() == null ? list.size() : criteria.getPager().getTotalRecords();
			
			return new GridResult(true, list, count);
		} catch (Exception e) {
			logger.error("数据归属单位查询列表数据出错", e);
			return new GridResult(false, null);
		}
	}
	
	/**
	 * 数据归属单位表单页面
	 * 
	 * @param sysDeptReleKey 对象
	 * @param model 视图模型
	 * @return 视图模型
	 */
	@RequestMapping(AdminUrlRecource.SYS_DEPT_RELE_FORM)
	public ModelAndView sysDeptReleForm(SysDeptReleKey sysDeptReleKey,ModelAndView model) {
		try {
			model.addObject("deptId", sysDeptReleKey.getDeptId());
			model.setViewName(AdminUrlRecource.SYS_DEPT_RELE_FORM);
			return model;
		} catch (Exception e) {
			logger.error("访问数据归属单位表单页面出错", e);
			throw new RuntimeException(this.getMessage(e));
		}
	}

	/**
	 * 保存数据归属单位
	 * 
	 * @param sysDeptRele 对象
	 * @return json结果
	 */
	@RequestMapping(AdminUrlRecource.SYS_DEPT_RELE_SAVE)
	@ResponseBody
	public JsonResult sysDeptReleSave(String txtPost) {
		try {
			List<SysDeptRele> list = JsonUtils.jsonToList(txtPost, SysDeptRele.class);
			sysDeptReleService.insertSysDeptRele(list);
			LogUtils.log(AdminFunctionId.SYS_DEPT_CREATE_DIC, "生成单位字典失败");
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("保存数据归属单位出错", e);
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
	/**
	 * 删除数据归属单位
	 * 
	 * @param sysDeptReleKey 主键
	 * @return json结果
	 */
	@RequestMapping(AdminUrlRecource.SYS_DEPT_RELE_DELETE)
	@ResponseBody
	public JsonResult sysDeptReleDelete(String txtPost) {
		try {
			List<SysDeptReleKey> keyList = JsonUtils.jsonToList(txtPost, SysDeptReleKey.class);
		
			sysDeptReleService.deleteSysDeptRele(keyList);
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("删除数据归属单位出错", e);
			return new JsonResult(false, this.getMessage(e));
		}
	}

}