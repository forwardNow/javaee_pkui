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
public class PatchSysNoticeController extends BaseController {

	/** 系统公告日志句柄 */
	private static Logger logger = LoggerFactory.getLogger(PatchSysNoticeController.class);

	/** 系统公告服务类 */
	@Autowired
	private SysNoticeService sysNoticeService;
	/**
	 * 系统公告列表数据
	 * 
	 * @param txtQuery 查询条件
	 * @return 标准列表对象
	 */
	@RequestMapping("/service/sysNoticeListData")
	@ResponseBody
	public GridResult sysNoticeListData(String txtQuery) {
		try {
			Criteria<?> criteria = WebUtils.toCriteria(txtQuery);
			
			List<SysNotice> list = sysNoticeService.getSysNoticeList(criteria);
			int count = criteria.getPager() == null ? list.size() : criteria.getPager().getTotalRecords();
			
			return new GridResult(true, list, count);
		} catch (Exception e) {
			logger.error("系统公告查询列表数据出错", e);
			return new GridResult(false, null);
		}
	}
	/**
	 * 删除系统公告
	 * 
	 * @param opid 主键
	 * @return json结果
	 */
	@RequestMapping("/service/sysNoticeDelete")
	@ResponseBody
	public JsonResult sysNoticeDelete(java.lang.Integer[] opid) {
		try {
			sysNoticeService.deleteSysNotice(opid);
			LogUtils.log(101216, "删除系统公告信息成功");
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("删除系统公告出错", e);
			LogUtils.log(101216, "删除系统公告信息失败");
			return new JsonResult(false, this.getMessage(e));
		}
	}

	@RequestMapping("/service/sysNoticeModel")
	@ResponseBody
	public JsonResult sysNoticeModel(String opid) {
		JsonResult jsonResult = new JsonResult();
		try {
			SysNotice sysNotice = sysNoticeService.get(opid);
			jsonResult.setSuccess( true );
			jsonResult.setData( sysNotice );
			return jsonResult;
		} catch (Exception e) {
			jsonResult.setSuccess( false );
			jsonResult.setMessage( "获取公告信息失败" );
			return jsonResult;
		}
	}
	/**
	 * 保存系统公告
	 * 
	 * @param sysNotice 对象
	 * @return json结果
	 */
	@RequestMapping( "/service/sysNoticeSave")
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
	
}