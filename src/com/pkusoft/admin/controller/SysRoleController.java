package com.pkusoft.admin.controller;

import java.util.List;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pkusoft.admin.model.SysDept;
import com.pkusoft.admin.model.SysMenu;
import com.pkusoft.admin.model.SysRole;
import com.pkusoft.admin.service.SysRoleService;
import com.pkusoft.common.constants.AdminFunctionId;
import com.pkusoft.common.constants.AdminUrlRecource;
import com.pkusoft.common.util.CriteriaExt;
import com.pkusoft.common.util.CriteriaUtil;
import com.pkusoft.common.util.LogUtils;
import com.pkusoft.framework.controller.BaseController;
import com.pkusoft.framework.model.GridResult;
import com.pkusoft.framework.model.JsonResult;
import com.pkusoft.framework.model.Pager;

/**
 * 控制器
 * 
 * @author 
 */
@Controller
public class SysRoleController extends BaseController {
	/** 日志句柄 */
	private static Logger logger = LoggerFactory.getLogger(SysRoleController.class);

	/** 服务类 */
	@Autowired
	private SysRoleService sysRoleService;
	
	/**
	 * 列表页面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_ROLE_LIST)
	public ModelAndView sysRoleList(ModelAndView model) {
		
		List<SysRole> roleList = sysRoleService.getAllSysRoleList();
		
		model.addObject("roleList", roleList);

		model.setViewName(AdminUrlRecource.SYS_ROLE_LIST);
		return model;
	}
	
	/**
	 * 列表数据
	 * 
	 * @param sysRole
	 * @param pager
	 * @return
	 */
	@RequestMapping(value = AdminUrlRecource.SYS_ROLE_LIST_DATA)
	@ResponseBody
	public GridResult sysRoleListData(SysRole sysRole,Pager pager) {
		try {
			List<SysRole> list = sysRoleService.getSysRoleList(sysRole, pager);
			return new GridResult(true, list, pager.getTotalRecords());
		} catch (Exception e) {
			logger.error("查询列表数据出错", e);
			return new GridResult(false, null);
		}
	}
	/**
	 * 列表数据
	 * 
	 * @param sysRole
	 * @param pager
	 * @return
	 */
	@RequestMapping(value = "/admin/sysRoleListDataExt")
	@ResponseBody
	public GridResult sysRoleListDataExt(String txtQuery) {
		try {
			CriteriaExt CriteriaExt = CriteriaUtil.toCriteriaExt( txtQuery );
			Pager pager = CriteriaExt.getPager();
			List<SysRole> list = sysRoleService.getSysRoleList(null, pager );
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
	@RequestMapping(AdminUrlRecource.SYS_ROLE_FORM)
	public ModelAndView sysRoleForm(java.lang.Long roleId, ModelAndView model) {
		try {
			if(roleId != null){
				SysRole sysRole = sysRoleService.get(roleId);
				model.addObject("sysRole", sysRole);
			}
			model.setViewName(AdminUrlRecource.SYS_ROLE_FORM);
			return model;
		} catch (Exception e) {
			logger.error("访问表单页面出错", e);
			throw new RuntimeException(this.getMessage(e));
		}
	}

	/**
	 * 保存信息
	 * 
	 * @param sysRole
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_ROLE_SAVE)
	@ResponseBody
	public JsonResult sysRoleSave(SysRole sysRole) {
		try {			
			if ( sysRole.getSysId() != null ) {
				
				String json = 
						    "{"
						  + "    \"subsys_01\": \"执法监督综合应用门户\" ,"
						  + "    \"subsys_02\": \"执法问题动态跟踪子系统\" ,"
						  + "    \"subsys_03\": \"如实受立案监督子系统\" ,"
						  + "    \"subsys_04\": \"执法时限预警子系统\" ,"
						  + "    \"subsys_05\": \"电子屏动态监督子系统\" ,"
						  + "    \"subsys_06\": \"问题模型管理子系统\" "
						  + "}";
				
				ObjectMapper mapper = new ObjectMapper();
				Map<String, String> set = mapper.readValue( json, Map.class );
				sysRole.setSysName( set.get( sysRole.getSysId() ) );
				
			}
			if(sysRole.getRoleId() == null){
				sysRoleService.insertSysRole(sysRole);
				LogUtils.log(AdminFunctionId.SYS_ROLE_SAVE_ADD, "新增角色成功");
			}else{	//新增
				sysRoleService.updateSysRole(sysRole);
				LogUtils.log(AdminFunctionId.SYS_ROLE_SAVE_UPDATE, "修改角色信息成功");
			}
			return new JsonResult(true, sysRole);
		} catch (Exception e) {
			logger.error("保存信息出错", e);
			LogUtils.log(AdminFunctionId.SYS_ROLE_SAVE, "保存角色失败");
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
	/**
	 * 删除信息
	 * 
	 * @param roleId
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_ROLE_DELETE)
	@ResponseBody
	public JsonResult sysRoleDelete(java.lang.Long roleId) {
		try {
			sysRoleService.deleteSysRole(roleId);
			LogUtils.log(AdminFunctionId.SYS_ROLE_DELETE, "删除角色成功");
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("删除信息出错", e);
			LogUtils.log(AdminFunctionId.SYS_ROLE_DELETE, "删除角色失败");
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
	/**
	 * 角色唯一性验证
	 * 
	 * @param roleId
	 * @param roleLevel
	 * @param fieldName
	 * @param fieldValue
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_ROLE_CKECK_INFO)
	@ResponseBody
	public JsonResult sysDeptCheckInfo(Long roleId, String roleLevel, String fieldName, String fieldValue) {
		try {
			fieldValue = java.net.URLDecoder.decode(fieldValue, "utf-8");
			LogUtils.log(AdminFunctionId.SYS_ROLE_CKECK_INFO, "角色信息验证成功");
			return new JsonResult(sysRoleService.checkRoleInfo(roleId, roleLevel, fieldName, fieldValue));
		} catch (Exception e) {
			logger.error("角色唯一性验证出错", e);
			LogUtils.log(AdminFunctionId.SYS_ROLE_CKECK_INFO, "角色信息验证失败");
			return new JsonResult(false, this.getMessage(e));
		}
	}

	@RequestMapping("/admin/getAllSysRole")
	@ResponseBody
	public JsonResult getAllSysRole(String deptId) {
		JsonResult jsonResult = new JsonResult();
		try {
			List<SysRole> roleList = sysRoleService.getAllSysRoleList();
			jsonResult.setSuccess( true );
			jsonResult.setData( roleList );
			return jsonResult;
		} catch (Exception e) {
			jsonResult.setSuccess( false );
			return jsonResult;
		}
	}
	@RequestMapping( "/admin/sysRoleModel" )
	@ResponseBody
	public JsonResult sysRoleModel( Long roleId ) {
		JsonResult jsonResult = new JsonResult( true );
		try {
			Assert.notNull( roleId );
			SysRole sysRole = sysRoleService.get( roleId );
			jsonResult.setData( sysRole );
		} catch ( Exception e ) {
			jsonResult.setSuccess( false );
			jsonResult.setMessage( "获取角色模型失败" );
		}
		return jsonResult;
	}
	
	
	@RequestMapping("/admin/sysRoleNewPermitSave")
	@ResponseBody
	public JsonResult sysRoleNewPermitSave(Long roleId, String data) {
		JsonResult jsonResult = new JsonResult();
		try {
			Assert.notNull( roleId );
			Assert.hasText( data );
			SysRole sysRole = sysRoleService.get( roleId );
			sysRole.setReserve3( data );
			
			ObjectMapper mapper = new ObjectMapper();
			List<Map<String, Object>> list = mapper.readValue( data, List.class );
			
			
			sysRoleService.update( sysRole );
			
			jsonResult.setSuccess( true );
			return jsonResult;
		} catch (Exception e) {
			jsonResult.setSuccess( false );
			return jsonResult;
		}
	}
	@RequestMapping("/admin/sysRoleNewPermitListData")
	@ResponseBody
	public GridResult sysRoleNewPermitListData(Long roleId) {
		try {
			Assert.notNull( roleId );
			SysRole sysRole = sysRoleService.get( roleId );
			String data = sysRole.getReserve3();
			
			ObjectMapper mapper = new ObjectMapper();
			List<Map<String, Object>> list = mapper.readValue( data, List.class );
			
			return new GridResult( true, list );
		} catch (Exception e) {
			return new GridResult( false, null );
		}
	}
}