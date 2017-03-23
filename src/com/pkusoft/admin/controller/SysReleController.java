package com.pkusoft.admin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pkusoft.admin.model.SysRele;
import com.pkusoft.admin.model.SysDept;
import com.pkusoft.admin.service.SysReleService;
import com.pkusoft.common.constants.AdminFunctionId;
import com.pkusoft.common.constants.AdminUrlRecource;
import com.pkusoft.common.util.LogUtils;
import com.pkusoft.framework.controller.BaseController;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.model.DicXmlResult;
import com.pkusoft.framework.model.GridResult;
import com.pkusoft.framework.model.JsonResult;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.framework.util.MapUtils;
import com.pkusoft.framework.util.WebUtils;
import com.pkusoft.framework.util.StringUtils;
import com.pkusoft.framework.util.JsonUtils;

/**
 * 数据归属单位信息控制器
 * 
 * @author 
 */
@Controller
public class SysReleController extends BaseController {
	

	/** 数据归属单位信息日志句柄 */
	private static Logger logger = LoggerFactory.getLogger(SysReleController.class);

	/** 数据归属单位信息服务类 */
	@Autowired
	private SysReleService releService;

	/**
	 * 数据归属单位信息列表页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_RELE_LIST)
	public ModelAndView releList(ModelAndView model) {
		model.setViewName(AdminUrlRecource.SYS_RELE_LIST);
		return model;
	}
	
	/**
	 * 数据归属单位信息列表数据
	 * 
	 * @param txtQuery 查询条件
	 * @return 标准列表对象
	 */
	@RequestMapping(AdminUrlRecource.SYS_RELE_LIST_DATA)
	@ResponseBody
	public GridResult releListData(String txtQuery) {
		try {
			Criteria<?> criteria = WebUtils.toCriteria(txtQuery);
			
			List<SysRele> list = releService.getReleList(criteria);
			int count = criteria.getPager() == null ? list.size() : criteria.getPager().getTotalRecords();
			
			return new GridResult(true, list, count);
		} catch (Exception e) {
			logger.error("数据归属单位信息查询列表数据出错", e);
			return new GridResult(false, null);
		}
	}
	
	/**
	 * 数据归属单位信息表单页面
	 * 
	 * @param deptId 对象
	 * @param model 视图模型
	 * @return 视图模型
	 */
	@RequestMapping(AdminUrlRecource.SYS_RELE_FORM)
	public ModelAndView releForm(java.lang.String deptId,ModelAndView model) {
		try {
			if(StringUtils.hasText(deptId)){
				SysRele rele = releService.get(deptId);
				model.addObject("sysDept", rele);
			}
			
			model.setViewName(AdminUrlRecource.SYS_RELE_FORM);
			return model;
		} catch (Exception e) {
			logger.error("访问数据归属单位信息表单页面出错", e);
			throw new RuntimeException(this.getMessage(e));
		}
	}

	/**
	 * 保存数据归属单位信息
	 * 
	 * @param rele 对象
	 * @return json结果
	 */
	@RequestMapping(AdminUrlRecource.SYS_RELE_SAVE)
	@ResponseBody
	public JsonResult releSave(SysRele rele,String oldReleId) {
		try {
			if(!StringUtils.hasText(oldReleId)){
				releService.insertRele(rele);
			}else{	//修改
				releService.updateRele(rele,oldReleId);
				//LogUtils.log(AdminFunctionId.SYS_DEPT_SAVE_UPDATE, sysDept.getDeptName() + "修改单位信息成功");
				//releService.updateRele(rele);
			}
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("保存数据归属单位信息出错", e);
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
	/**
	 * 删除数据归属单位信息
	 * 
	 * @param deptId 主键
	 * @return json结果
	 */
	@RequestMapping(AdminUrlRecource.SYS_RELE_DELETE)
	@ResponseBody
	public JsonResult releDelete(java.lang.String[] deptId) {
		try {
			releService.deleteRele(deptId);
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("删除数据归属单位信息出错", e);
			return new JsonResult(false, this.getMessage(e));
		}
	}
	/**
	 * 单位字典
	 * 
	 * @param pager
	 * @return
	 */
	@RequestMapping(value = AdminUrlRecource.SYS_RELE_DIC)
	@ResponseBody
	public DicXmlResult ReleDic(String deptId, String deptLevel,String releType,Pager pager) {
		try {
			List<SysRele> deptList = releService.getReleDic(deptId,deptLevel,releType);
			return MapUtils.toDicXmlResult(deptList, "deptId", "deptName");
		} catch (Exception e) {
			logger.error("查询单位列表数据出错", e);
			return null;
		}
	}
	/**
	 * 生成字典文件
	 * 
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_RELE_CREATEDIC)
	@ResponseBody
	public JsonResult releCreateDic(String dicName) {
		try {
			releService.createReleDic(dicName);
			//LogUtils.log(AdminFunctionId.SYS_RELE_CREATEDIC, "生成数据归属字典成功");
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("生成单位字典出错", e);
		   // LogUtils.log(AdminFunctionId.SYS_RELE_CREATEDIC, "生成数据归属字典失败");
			return new JsonResult(false, this.getMessage(e));
		}
	}
	/**
	 * 高级查询页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_RELE_ADVQUERY)
	public ModelAndView sysDeptAdvQuery(ModelAndView model) {
		model.setViewName(AdminUrlRecource.SYS_RELE_ADVQUERY);
		return model;
	}
	
}