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
import com.pkusoft.admin.model.SysDeptLevel;
import com.pkusoft.admin.service.SysDeptService;
import com.pkusoft.common.constants.AdminFunctionId;
import com.pkusoft.common.constants.AdminUrlRecource;
import com.pkusoft.common.util.LogUtils;
import com.pkusoft.framework.User;
import com.pkusoft.framework.controller.BaseController;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.model.DicXmlResult;
import com.pkusoft.framework.model.GridResult;
import com.pkusoft.framework.model.JsonResult;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.framework.util.MapUtils;
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
	 * 单位列表页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_DEPT_LIST)
	public ModelAndView sysDeptList(ModelAndView model) {
		model.setViewName(AdminUrlRecource.SYS_DEPT_LIST);
		return model;
	}
	
	/**
	 * 单位列表数据
	 * 
	 * @param sysDept
	 * @param pager
	 * @return
	 */
	@RequestMapping(value = AdminUrlRecource.SYS_DEPT_LIST_DATA)
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
	 * 单位管理表单页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_DEPT_FORM)
	public ModelAndView sysDeptForm(String deptId,ModelAndView model) {
		try {
			if(deptId != null){
				SysDept sysDept = sysDeptService.get(deptId);
				model.addObject("sysDept", sysDept);
			}
			
			model.setViewName(AdminUrlRecource.SYS_DEPT_FORM);
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
	@RequestMapping(AdminUrlRecource.SYS_DEPT_SAVE)
	@ResponseBody
	public JsonResult sysDeptSave(SysDept sysDept,String oldDeptId) {
		try {
			if(!StringUtils.hasText(oldDeptId)){
				sysDeptService.insertSysDept(sysDept);
				LogUtils.log(AdminFunctionId.SYS_DEPT_SAVE_ADD, sysDept.getDeptName() + "新增单位成功");
			}else{
				sysDeptService.updateSysDept(oldDeptId, sysDept);
				LogUtils.log(AdminFunctionId.SYS_DEPT_SAVE_UPDATE, sysDept.getDeptName() + "修改单位信息成功");
			}
			
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("保存单位信息出错", e);
			LogUtils.log(AdminFunctionId.SYS_DEPT_SAVE, sysDept.getDeptName() + "保存单位失败");
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
	/**
	 * 删除单位
	 * 
	 * @param deptId
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_DEPT_DELETE)
	@ResponseBody
	public JsonResult sysDeptDelete(String[] deptId) {
		try {
			sysDeptService.deleteSysDept(deptId);
			
			LogUtils.log(AdminFunctionId.SYS_DEPT_DELETE, "单位信息删除成功");
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("删除单位信息出错", e);
			LogUtils.log(AdminFunctionId.SYS_DEPT_DELETE, "单位信息删除失败");
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
	/**
	 * 高级查询页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_DEPT_ADV_QUERY)
	public ModelAndView sysDeptAdvQuery(ModelAndView model) {
		model.setViewName(AdminUrlRecource.SYS_DEPT_ADV_QUERY);
		return model;
	}
	
	/**
	 * 设置主管单位--
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_DEPT_SET_MAIN_FORM)
	public ModelAndView sysDeptSetMainForm(ModelAndView model){
		model.addObject("deptId", User.getDeptId());
		model.setViewName(AdminUrlRecource.SYS_DEPT_SET_MAIN_FORM);
		return model;
	}
	
	/**
	 * 查询单位列表
	 * 
	 * @param deptId
	 * @param isMainDept
	 * @param pager
	 * @return
	 */
	@RequestMapping(value = AdminUrlRecource.SYS_SUB_DEPT_LIST_DATA)
	@ResponseBody
	public GridResult sysSubDeptListData(String deptId, String isMainDept, Pager pager) {
		try {
			List<SysDept> list = sysDeptService.getSubDeptList(deptId, isMainDept, pager);
			return new GridResult(true, list, pager.getTotalRecords());
		} catch (Exception e) {
			logger.error("查询单位列表数据出错", e);
			return new GridResult(false, null);
		}
	}
	
	/**
	 * 生成字典文件
	 * 
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_DEPT_CREATE_DIC)
	@ResponseBody
	public JsonResult sysDeptCreateDic(String dicName) {
		try {
			sysDeptService.createDeptDic(dicName);
			LogUtils.log(AdminFunctionId.SYS_DEPT_CREATE_DIC, "生成单位字典失败");
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("生成单位字典出错", e);
		    LogUtils.log(AdminFunctionId.SYS_DEPT_CREATE_DIC, "生成单位字典失败");
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
	/**
	 * 单位字典
	 * 
	 * @param pager
	 * @return
	 */
	@RequestMapping(value = AdminUrlRecource.SYS_DEPT_DIC)
	@ResponseBody
	public DicXmlResult sysDeptDic(String deptId, String deptLevel,String releType,Pager pager) {
		try {
			List<SysDept> deptList = sysDeptService.getDeptDic(deptId,deptLevel,releType);
			return MapUtils.toDicXmlResult(deptList, "deptId", "deptName");
		} catch (Exception e) {
			logger.error("查询单位列表数据出错", e);
			return null;
		}
	}

	/**
	 * 单位级别字典
	 * 
	 * @param pager
	 * @return
	 */
	@RequestMapping(value = AdminUrlRecource.SYS_DEPT_LEVEL_DIC)
	@ResponseBody
	public DicXmlResult sysDeptLevelDic(Pager pager) {
		try {
			List<SysDeptLevel> deptLevelList = sysDeptService.getDeptLevelDic();
			return MapUtils.toDicXmlResult(deptLevelList, "levelCode", "levelName");
		} catch (Exception e) {
			logger.error("查询单位列表数据出错", e);
			return null;
		}
	}

	/**
	 * 单位唯一性验证
	 * 
	 * @param deptId
	 * @param fieldName
	 * @param fieldValue
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_DEPT_CKECK_INFO)
	@ResponseBody
	public JsonResult sysDeptCheckInfo(String deptId, String fieldName, String fieldValue) {
		try {
			fieldValue = java.net.URLDecoder.decode(fieldValue, "utf-8");
			boolean b = sysDeptService.checkDeptInfo(deptId, fieldName, fieldValue);
			return new JsonResult(b);
		} catch (Exception e) {
			logger.error("单位唯一性验证出错", e);
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
	/**
	 * 通过单位id查询单位名称 ——字典
	 * @param deptId
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_DEPT_GETNAME)
	@ResponseBody
	public DicXmlResult getDeptName(String deptId){
		try {
			List<SysDept> list =  sysDeptService.getDeptName(deptId);
			return MapUtils.toDicXmlResult(list, "deptId", "deptName");
		} catch (Exception e) {
			logger.error("查询单位名称出错", e);
			return null;
		}
	}
	
}
