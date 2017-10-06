package com.pkusoft.admin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pkusoft.admin.model.SysNotice;
import com.pkusoft.admin.service.SysNoticeService;
import com.pkusoft.common.util.LogUtils;
import com.pkusoft.framework.controller.BaseController;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.model.GridResult;
import com.pkusoft.framework.model.JsonResult;
import com.pkusoft.framework.util.DateTimeUtils;
import com.pkusoft.framework.util.WebUtils;
/**
 * 系统公告控制器
 * 
 * @author 
 */
@Controller
public class SysNoticeController extends BaseController {

	/** 系统公告日志句柄 */
	private static Logger logger = LoggerFactory.getLogger(SysNoticeController.class);

	/** 系统公告服务类 */
	@Autowired
	private SysNoticeService sysNoticeService;

	/**
	 * 系统公告列表页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/admin/sysNoticeList")
	public ModelAndView sysNoticeList(ModelAndView model) {
		model.setViewName("/admin/sysNoticeList");
		return model;
	}
	
	
	/**
	 * 系统公告表单页面
	 * 
	 * @param opid 对象
	 * @param model 视图模型
	 * @return 视图模型
	 */
	@RequestMapping("/admin/sysNoticeForm")
	public ModelAndView sysNoticeForm(java.lang.Integer opid,ModelAndView model) {
		try {
            if(opid != null){
				SysNotice sysNotice = sysNoticeService.get(opid);
				model.addObject("sysNotice", sysNotice);
			}
            //日期限制
    		String maxDate = DateTimeUtils.getDateTime("yyyy-MM-dd");
    		model.addObject("maxDate", maxDate);
			model.setViewName("/admin/sysNoticeForm");
			return model;
		} catch (Exception e) {
			logger.error("访问系统公告表单页面出错", e);
			throw new RuntimeException(this.getMessage(e));
		}
	}

	/**
	 * 保存系统公告
	 * 
	 * @param sysNotice 对象
	 * @return json结果
	 */
	@RequestMapping( "/admin/sysNoticeSave")
	@ResponseBody
	public JsonResult sysNoticeSave(SysNotice sysNotice) {
		try {
            if(sysNotice.getOpid() == null){
				sysNoticeService.insertSysNotice(sysNotice);
				LogUtils.log(101215, "新增系统公告信息成功");
			}else{	//修改
				sysNoticeService.updateSysNotice(sysNotice);
				LogUtils.log(101215, "修改系统公告信息成功");
			}
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("保存系统公告出错", e);
			LogUtils.log(101215, "保存系统公告信息失败");
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
	/**
	 * 操作系统公告
	 * 
	 * @param opid 主键
	 * @return json结果
	 */
	@RequestMapping("/admin/sysNoticeOperate")
	@ResponseBody
	public JsonResult sysNoticeOperate(java.lang.Integer[] opids,int operation,String field) {
		try {
			sysNoticeService.updateSysNotice(opids,operation,field);
			return new JsonResult(true,operation);
		} catch (Exception e) {
			logger.error("操作系统公告出错", e);
			return new JsonResult(false, this.getMessage(e));
		}
	}
	

	
}