package com.pkusoft.admin.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.pkusoft.admin.model.SysDicItem;
import com.pkusoft.admin.model.SysDicList;
import com.pkusoft.admin.service.SysDicItemService;
import com.pkusoft.admin.service.SysDicListService;
import com.pkusoft.common.cache.DicCache;
import com.pkusoft.common.constants.AdminFunctionId;
import com.pkusoft.common.constants.AdminUrlRecource;
import com.pkusoft.common.util.LogUtils;
import com.pkusoft.framework.controller.BaseController;
import com.pkusoft.framework.model.GridResult;
import com.pkusoft.framework.model.JsonResult;
import com.pkusoft.framework.model.Pager;

/**
 * 字典条目控制器
 * 
 * @author wangl
 */
@Controller
public class SysDicItemController extends BaseController {
	/** 日志句柄 */
	private static Logger logger = LoggerFactory.getLogger(SysDicItemController.class);

	/** 服务类 */
	@Autowired
	private SysDicItemService sysDicItemService;
	
	@Autowired
	private SysDicListService sysDicListService;

	/**
	 * 列表页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_DIC_ITEM_LIST)
	public ModelAndView sysDicItemList(ModelAndView model,SysDicList sysDicList) {
		if(sysDicList.getDicName() != null && !"".equals(sysDicList.getDicName())){
			sysDicList = sysDicListService.get(sysDicList.getDicName());
			model.addObject("sysDicList", sysDicList);
		}

		model.setViewName(AdminUrlRecource.SYS_DIC_ITEM_LIST);

		return model;
	}
	
	/**
	 * 列表数据
	 * 
	 * @param sysDicItem
	 * @param pager
	 * @return
	 */
	@RequestMapping(value = AdminUrlRecource.SYS_DIC_ITEM_LIST_DATA)
	@ResponseBody
	public GridResult sysDicItemListData(SysDicItem sysDicItem,Pager pager) {
		try {
			List<SysDicItem> list = sysDicItemService.getSysDicItemList(sysDicItem, pager);

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
	@RequestMapping(AdminUrlRecource.SYS_DIC_ITEM_FORM)
	public ModelAndView sysDicItemForm(String dicName,ModelAndView model) {
		try {
			if(dicName != null && !"".equals(dicName)){
				SysDicItem sysDicItem = new SysDicItem();
				sysDicItem.setDicName(dicName);
				model.addObject("sysDicItem", sysDicItem);
			}
			model.setViewName(AdminUrlRecource.SYS_DIC_ITEM_FORM);
			return model;
		} catch (Exception e) {
			logger.error("访问表单页面出错", e);
			throw new RuntimeException(this.getMessage(e));
		}
	}
	
	/**
	 * 更新页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_DIC_ITEM_UPDATE_FORM)
	public ModelAndView sysDicItemUpdateForm(SysDicItem sysDicItem,ModelAndView model) {
		try {
			if(sysDicItem.getItemId() != null){
				sysDicItem = sysDicItemService.get(sysDicItem.getItemId());
				model.addObject("sysDicItem", sysDicItem);
			}
			if(sysDicItem.getDicName() != null || "".equals(sysDicItem.getDicName())){
				SysDicList sysDicList = sysDicListService.get(sysDicItem.getDicName());
				model.addObject("sysDicList", sysDicList);
			}
			model.setViewName(AdminUrlRecource.SYS_DIC_ITEM_UPDATE_FORM);
			return model;
		} catch (Exception e) {
			logger.error("访问表单页面出错", e);
			throw new RuntimeException(this.getMessage(e));
		}
	}
	
	/**
	 * 保存信息
	 * 
	 * @param sysDicItem
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_DIC_ITEM_SAVE)
	@ResponseBody
	public JsonResult sysDicItemSave(SysDicItem sysDicItem) {
		try {
			if(sysDicItem.getItemId() == null){
				sysDicItemService.insertSysDicItem(sysDicItem);
				LogUtils.log(AdminFunctionId.SYS_DIC_ITEM_ADD, sysDicItem.getItemId() + "新增成功");
				// 更新缓存
				DicCache.refresh(sysDicItem.getDicName());
			}else{	
				//修改
				sysDicItemService.updateSysDicItem(sysDicItem);
				LogUtils.log(AdminFunctionId.SYS_DIC_ITEM_UPDATE, sysDicItem.getItemId() + "修改成功");
				// 更新缓存
				DicCache.refresh(sysDicItem.getDicName());
			}
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("保存信息出错", e);
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
	/**
	 * 删除信息
	 * 
	 * @param itemId
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_DIC_ITEM_DELETE)
	@ResponseBody
	public JsonResult sysDicItemDelete(java.lang.Long[] itemId) {
		try {
			SysDicItem sysDicItem =sysDicItemService.get(itemId[0]);
			sysDicItemService.deleteSysDicItem(itemId);
			for (int i = 0; i < itemId.length; i++) {
				LogUtils.log(AdminFunctionId.SYS_DIC_ITEM_DELETE, itemId[i] + "删除成功");
			}
			// 更新缓存
			DicCache.refresh(sysDicItem.getDicName());
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("删除信息出错", e);
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
	/**
	 * 检查字典条目
	 * 
	 * @param itemCode
	 * @return 
	 */
	@RequestMapping(AdminUrlRecource.CHECK_SYS_DIC_ITEM_FORM)
	@ResponseBody
	public JsonResult checkSysItemForm(SysDicItem SysDicItem) {
		try {
			return new JsonResult(sysDicItemService.checkSysDicListForm(SysDicItem));
		} catch (Exception e) {
			logger.error("删除信息出错", e);
			return new JsonResult(false, this.getMessage(e));
		}
	}
}