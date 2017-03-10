package com.pkusoft.admin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pkusoft.admin.model.SysDicList;
import com.pkusoft.admin.service.SysDicListService;
import com.pkusoft.common.constants.AdminFunctionId;
import com.pkusoft.common.constants.AdminUrlRecource;
import com.pkusoft.common.util.LogUtils;
import com.pkusoft.framework.controller.BaseController;
import com.pkusoft.framework.model.GridResult;
import com.pkusoft.framework.model.JsonResult;
import com.pkusoft.framework.model.Pager;

/**
 * 字典控制器
 * 
 * @author wangl
 */
@Controller
public class SysDicListController extends BaseController {
	/** 日志句柄 */
	private static Logger logger = LoggerFactory.getLogger(SysDicListController.class);

	/** 服务类 */
	@Autowired
	private SysDicListService sysDicListService;

	/**
	 * 列表页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_DIC_LIST_LIST)
	public ModelAndView sysDicListList(ModelAndView model) {
		model.setViewName(AdminUrlRecource.SYS_DIC_LIST_LIST);
		return model;
	}
	
	/**
	 * 列表数据
	 * 
	 * @param sysDicList
	 * @param pager
	 * @return
	 */
	@RequestMapping(value = AdminUrlRecource.SYS_DIC_LIST_LIST_DATA)
	@ResponseBody
	public GridResult sysDicListListData(SysDicList sysDicList,Pager pager) {
		try {
			List<SysDicList> list = sysDicListService.getSysDicListList(sysDicList, pager);

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
	@RequestMapping(AdminUrlRecource.SYS_DIC_LIST_FORM)
	public ModelAndView sysDicListForm(java.lang.String dicName,ModelAndView model) {
		try {
			if(dicName != null){
				SysDicList sysDicList = sysDicListService.get(dicName);
				model.addObject("sysDicList", sysDicList);
			}
			
			model.setViewName(AdminUrlRecource.SYS_DIC_LIST_FORM);
			return model;
		} catch (Exception e) {
			logger.error("访问表单页面出错", e);
			throw new RuntimeException(this.getMessage(e));
		}
	}
	
	/**
	 * 更新字典页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_DIC_LIST_UPDATE_FORM)
	public ModelAndView sysDicListUpdateForm(java.lang.String dicName,ModelAndView model) {
		try {
			if(dicName != null){
				SysDicList sysDicList = sysDicListService.get(dicName);
				model.addObject("sysDicList", sysDicList);
			}
			
			model.setViewName(AdminUrlRecource.SYS_DIC_LIST_UPDATE_FORM);
			return model;
		} catch (Exception e) {
			logger.error("访问表单页面出错", e);
			throw new RuntimeException(this.getMessage(e));
		}
	}

	/**
	 * 更新信息
	 * 
	 * @param sysDicList
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_DIC_LIST_SAVE)
	@ResponseBody
	public JsonResult sysDicListSave(SysDicList sysDicList) {
		try {
			sysDicListService.updateSysDicList(sysDicList);
			
			//载入缓存
			//DicCache.refresh(sysDicList.getDicName());
			LogUtils.log(AdminFunctionId.SYS_DIC_LIST_UPDATE, sysDicList.getDicName() + "修改成功");
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("保存信息出错", e);
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
	/**
	 * 新增
	 * 
	 * @param sysDicList
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_DIC_LIST_ADD)
	@ResponseBody
	public JsonResult sysDicListAdd(SysDicList sysDicList) {
		try {
			sysDicListService.insertSysDicList(sysDicList);
			
			// 载入缓存
			//DicCache.set(sysDicList.getDicName(), null);
			LogUtils.log(AdminFunctionId.SYS_DIC_LIST_ADD, sysDicList.getDicName() + "新增成功");
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("保存信息出错", e);
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
	/**
	 * 删除信息
	 * 
	 * @param dicName
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_DIC_LIST_DELETE)
	@ResponseBody
	public JsonResult sysDicListDelete(java.lang.String[] dicName) {
		try {
			sysDicListService.deleteSysDicList(dicName);
			if(dicName.length > 0){
				for (int i = 0; i < dicName.length; i++) {
					//DicCache.remove(dicName[i]);
					LogUtils.log(AdminFunctionId.SYS_DIC_LIST_DELETE, dicName[i] + "删除成功");
				}
			}
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("删除信息出错", e);
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
	/**
	 * 生成字典文件
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_DIC_CREATE_XML_FORM)
	@ResponseBody
	public JsonResult sysDicCreateXmlForm(SysDicList sysDicList) {
		try {
			//单个生成字典文件
			if(sysDicList.getDicName() != null && !"".equals(sysDicList.getDicName())){
				sysDicListService.createDicFile(sysDicList.getDicName());
				LogUtils.log(AdminFunctionId.SYS_DIC_LIST_XML_FILE, sysDicList.getDicName() + "生成字典文件成功");
			}else{
				//生成全部字典文件
				sysDicListService.createAllDicFile();
				LogUtils.log(AdminFunctionId.SYS_DIC_LIST_XML_FILE, "生成字典文件成功");
			}
			
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("生成字典失败", e);
			throw new RuntimeException(this.getMessage(e));
		}
	}
	
	/**
	 * 检查字典名称
	 * 
	 * @param SysDicList
	 * @return 
	 */
	@RequestMapping(AdminUrlRecource.CHECK_SYS_DIC_LIST_FORM)
	@ResponseBody
	public JsonResult checkSysDicListForm(java.lang.String dicName) {
		try {
			return new JsonResult(sysDicListService.checkSysDicListForm(dicName));
		} catch (Exception e) {
			logger.error("检查字典名称失败", e);
			throw new RuntimeException(this.getMessage(e));
		}
	}

}