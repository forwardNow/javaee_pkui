package com.pkusoft.admin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pkusoft.admin.model.SysAccessSystem;
import com.pkusoft.admin.model.SysAccessSystemCriteria;
import com.pkusoft.admin.service.SysAccessSystemService;
import com.pkusoft.framework.controller.BaseController;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.model.GridResult;
import com.pkusoft.framework.model.JsonResult;
import com.pkusoft.framework.util.StringUtils;
import com.pkusoft.framework.util.WebUtils;

/**
 * 接入的系统控制器
 * 
 * @author 
 */
@Controller
public class SysAccessSystemController extends BaseController {

	/** 接入的系统日志句柄 */
	private static Logger logger = LoggerFactory.getLogger(SysAccessSystemController.class);

	/** 接入的系统服务类 */
	@Autowired
	private SysAccessSystemService sysAccessSystemService;

	/**
	 * 接入的系统列表数据
	 * 
	 * @param txtQuery 查询条件
	 * @return 标准列表对象
	 */
	@RequestMapping( "/admin/sysAccessSystemListData" )
	@ResponseBody
	public GridResult sysAccessSystemListData(String txtQuery) {
		try {
			Criteria<?> criteria = WebUtils.toCriteria(txtQuery);
			
			List<SysAccessSystem> list = sysAccessSystemService.getSysAccessSystemList(criteria);
			int count = criteria.getPager() == null ? list.size() : criteria.getPager().getTotalRecords();
			
			return new GridResult(true, list, count);
		} catch (Exception e) {
			logger.error("接入的系统查询列表数据出错", e);
			return new GridResult(false, null);
		}
	}

	/**
	 * 保存接入的系统
	 * 
	 * @param sysAccessSystem 对象
	 * @return json结果
	 */
	@RequestMapping( "/admin/sysAccessSystemSave" )
	@ResponseBody
	public JsonResult sysAccessSystemSave(SysAccessSystem sysAccessSystem) {
		try {
			if(!StringUtils.hasText(sysAccessSystem.getSysId())){
				sysAccessSystemService.insertSysAccessSystem(sysAccessSystem);
			}else{	//修改
				sysAccessSystemService.updateSysAccessSystem(sysAccessSystem);
			}
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("保存接入的系统出错", e);
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
	/**
	 * 删除接入的系统
	 * 
	 * @param sysId 主键
	 * @return json结果
	 */
	@RequestMapping( "/admin/sysAccessSystemDelete" )
	@ResponseBody
	public JsonResult sysAccessSystemDelete(java.lang.String[] sysId) {
		try {
			sysAccessSystemService.deleteSysAccessSystem(sysId);
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("删除接入的系统出错", e);
			return new JsonResult(false, this.getMessage(e));
		}
	}
	@RequestMapping("/admin/subSysListData")
	@ResponseBody
	public GridResult subSysListData(){
		try {
			Criteria<SysAccessSystemCriteria> criteria = new Criteria<SysAccessSystemCriteria>();
			List<SysAccessSystem> list = sysAccessSystemService.getListByCriteria( criteria );
			
			return new GridResult(true,list);
		} catch (Exception e) {
			return new GridResult( false, null );
		}
		
	}
}