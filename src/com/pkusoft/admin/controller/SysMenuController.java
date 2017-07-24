package com.pkusoft.admin.controller;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.pkusoft.admin.model.SysMenu;
import com.pkusoft.admin.model.SysMenuCriteria;
import com.pkusoft.admin.model.SysMenuIcon;
import com.pkusoft.admin.service.SysMenuService;
import com.pkusoft.common.constants.AdminFunctionId;
import com.pkusoft.common.constants.AdminUrlRecource;
import com.pkusoft.common.util.ImageUtils;
import com.pkusoft.common.util.LogUtils;
import com.pkusoft.framework.User;
import com.pkusoft.framework.constants.General;
import com.pkusoft.framework.controller.BaseController;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.model.GridResult;
import com.pkusoft.framework.model.JsonResult;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.framework.util.JsonUtils;

/**
 * 菜单控制器
 * @author caizh
 */
@Controller
public class SysMenuController extends BaseController {
	/** 日志句柄 */
	private static Logger logger = LoggerFactory.getLogger(SysMenuController.class);

	/** 菜单服务类 */
	@Autowired
	private SysMenuService sysMenuService;

	/**
	 * 菜单列表页面
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_MENU_LIST)
	public ModelAndView sysMenuList(ModelAndView model) {
		model.setViewName(AdminUrlRecource.SYS_MENU_LIST);
		return model;
	}
	
	@RequestMapping( "/admin/sysMenuModel" )
	@ResponseBody
	public JsonResult sysMenuModel( Long menuId ) {
		JsonResult jsonResult = new JsonResult( true );
		try {
			Assert.notNull( menuId );
			SysMenu sysMenu = sysMenuService.get( menuId );
			jsonResult.setData( sysMenu );
		} catch ( Exception e ) {
			jsonResult.setSuccess( false );
			jsonResult.setMessage( "获取模型失败" );
		}
		return jsonResult;
	}
	
	/**
	 * 菜单页面数据
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_MENU_LIST_DATA)
	@ResponseBody
	public GridResult menu(){
		GridResult gr;
		try {
			List<SysMenu> menuList = null;
			if(General.SUPER_USER.equals(User.getLoginName())){
				Criteria<SysMenuCriteria> criteria = new Criteria<SysMenuCriteria>();
				criteria.setOrderByClause("TREE_LEVEL,ORDER_FLAG");
				menuList = sysMenuService.getListByCriteria(criteria);
			}else{
				menuList = sysMenuService.getSysMenuByUserId(User.getUserId());
			}
			gr = new GridResult(true,menuList);
			return gr;
		} catch (Exception e) {
			throw new RuntimeException(this.getMessage(e));
		}
		
	}
	
	/**
	 * 菜单树节点数据
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_MENU_TREE_DATA)
	@ResponseBody
	public JsonResult sysMenuTreeData(java.lang.Long menuId) {
		try {
			SysMenu sysMenu = sysMenuService.get(menuId);
			return new JsonResult(true,sysMenu);
		} catch (Exception e) {
			logger.error("", e);
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
	/**
	 * 表单页面
	 * @param model
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_MENU_FORM)
	public ModelAndView sysMenuForm(java.lang.Long menuId,ModelAndView model) {
		try {
			if(menuId != null){
				SysMenu sysMenu = sysMenuService.get(menuId);
				model.addObject("sysMenu", sysMenu);
			}
			model.setViewName(AdminUrlRecource.SYS_MENU_FORM);
			return model;
		} catch (Exception e) {
			logger.error("访问表单页面出错", e);
			throw new RuntimeException(this.getMessage(e));
		}
	}

	/**
	 * 新增菜单
	 * @param sysMenu
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_MENU_ADD)
	@ResponseBody
	public JsonResult sysMenuAdd(SysMenu sysMenu) {
		try {
			/*
			if ( sysMenu.getSysId() != null ) {
				
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
				sysMenu.setSysName( set.get( sysMenu.getSysId() ) );
				
			}
			*/
			
			sysMenuService.insertSysMenu(sysMenu);
			LogUtils.log(AdminFunctionId.SYS_MENU_ADD, "菜单新增成功");
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("保存信息出错", e);
			LogUtils.log(AdminFunctionId.SYS_MENU_ADD, "菜单新增失败");
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
	/**
	 * 修改菜单
	 * @param sysMenu
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_MENU_UPDATE)
	@ResponseBody
	public JsonResult sysMenuUpdate(SysMenu sysMenu) {
		try {
			if ( sysMenu.getSysId() != null ) {
				
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
				sysMenu.setSysName( set.get( sysMenu.getSysId() ) );
				
			}
			sysMenuService.updateSysMenu(sysMenu);
			LogUtils.log(AdminFunctionId.SYS_MENU_UPDATE, "菜单修改成功");
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("保存信息出错", e);
			LogUtils.log(AdminFunctionId.SYS_MENU_UPDATE, "菜单修改失败");
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
	@RequestMapping("/admin/sysMenuSave")
	@ResponseBody
	public JsonResult sysMenuSave(String sysMenuList) {
		try {
			List<SysMenu> sysMenuList_ = JsonUtils.jsonToList( sysMenuList, SysMenu.class );
			sysMenuService.updateSysMenu(sysMenuList_);
			LogUtils.log(AdminFunctionId.SYS_MENU_UPDATE, "菜单修改成功");
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("保存信息出错", e);
			LogUtils.log(AdminFunctionId.SYS_MENU_UPDATE, "菜单修改失败");
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
	/**
	 * 删除信息
	 * @param menuId
	 * @return
	 */
	@RequestMapping(AdminUrlRecource.SYS_MENU_DELETE)
	@ResponseBody
	public JsonResult sysMenuDelete(java.lang.Long menuId) {
		try {
			sysMenuService.deleteSysMenu(menuId);
			sysMenuService.deleteSysTreeParent(menuId);
			LogUtils.log(AdminFunctionId.SYS_MENU_DELETE, "菜单删除成功");
			return new JsonResult(true);
		} catch (Exception e) {
			logger.error("删除信息出错", e);
			LogUtils.log(AdminFunctionId.SYS_MENU_DELETE, "菜单删除失败");
			return new JsonResult(false, this.getMessage(e));
		}
	}
	
	
	
	/**
	 * 列表数据-调用目录服务查询目录
	 * @param sysRoleMenu
	 * @param pager
	 * @return
	 */
	@RequestMapping(value = AdminUrlRecource.SYS_ROLE_MENU_LIST_DATA)
	@ResponseBody
	public GridResult sysRoleMenuListData(Long roleId) {
		try {
            List<SysMenu> list = sysMenuService.getMenuListByRole(roleId);
			return new GridResult(true, list);
		} catch (Exception e) {
			logger.error("查询列表数据出错", e);
			return new GridResult(false, null);
		}
	}

	
	/**
	 * 菜单图标
	 */
	@RequestMapping(value = AdminUrlRecource.SYS_MENU_ICONS_DATA)
	@ResponseBody
	public GridResult sysMenuIconsData(Pager pager) {
		try {
			List<SysMenuIcon> iconsList = sysMenuService.getMenuIcons();
			return new GridResult(true, iconsList);
		} catch (Exception e) {
			logger.error("查询单位列表数据出错", e);
			return null;
		}
	}
	
	/**
	 * 菜单图标
	 */
	@RequestMapping(value = "/admin/sysMenuIconsDataExt")
	@ResponseBody
	public GridResult sysMenuIconsDataExt() {
		try {
			List<SysMenuIcon> iconsList = sysMenuService.getMenuIcons( "/static/desktop/images/icon/24x24" );
			return new GridResult(true, iconsList);
		} catch (Exception e) {
			return new GridResult(false, null);
		}
	}
	
	/**
	 * 菜单order
	 */
	@RequestMapping(value = AdminUrlRecource.SYS_MENU_UPDATE_NODE)
	@ResponseBody
	public JsonResult sysMenuUpdateNode(String sourceMenuId,String targetMenuId,String point) {
		try {
			sysMenuService.updateNode(sourceMenuId,targetMenuId,point);
			return new JsonResult(true);
		} catch (Exception e) {
			return new JsonResult(false,e.getMessage());
		}
	}
	
	/**
	 * 上传图标
	 * @param file
	 * @param session
	 * @return 返回新文件名
	 */
	@ResponseBody
	@RequestMapping( value = "/admin/sysMenuIconUpload", method = RequestMethod.POST )
	public JsonResult sysMenuIconUpload( MultipartFile file, HttpSession session ) {
		JsonResult jsonResult = new JsonResult();
		String message = null;
		try {
			Assert.notNull( file );
			String newFileName;
			String iconDir = session.getServletContext().getRealPath( "/static/desktop/images/icon" );
			String iconDir_24x24 = iconDir + "/24x24/";
			String iconDir_76x76 = iconDir + "/76x76/";
			String fileName = file.getOriginalFilename();// 文件原名称
			String fileType = fileName.indexOf( "." ) != -1 ? fileName.substring( fileName.lastIndexOf( "." ) + 1, fileName.length() ) : null;

			
			
			if ( !"png".equals( fileType ) ) {
				message = "图片类型不符合要求";
				throw new Exception( message );
			}
			
			if ( file.getSize() > 50 * 1024 ) {
				message = "图片大小超过50KB";
				throw new Exception( message );
			}
			
			newFileName = User.getLoginName() + "_" +( new java.util.Date().getTime() ) + "." + fileType;
			
			// 写入
			ImageUtils.compressImage( file.getInputStream(), new FileOutputStream( iconDir_24x24 + newFileName ), fileType, 24, 24 );
			ImageUtils.compressImage( file.getInputStream(), new FileOutputStream( iconDir_76x76 + newFileName ), fileType, 76, 76 );
			
			jsonResult.setData( fileName );
			jsonResult.setSuccess( true );
			
		} catch ( Exception e ) {
			e.printStackTrace();
			if ( message == null ) {
				message = e.getMessage();
			}
			jsonResult.setSuccess( false );
			jsonResult.setMessage( message );
			logger.error( "图标上传失败失败", e );
		}
		return jsonResult;
	}
	
	/*
	@RequestMapping("/admin/subSysListData")
	@ResponseBody
	public GridResult subSysListData(){
		try {
			String json = 
					  "["
					+ "    { \"sysId\": \"subsys_01\", \"sysName\": \"执法监督综合应用门户\" },"
					+ "    { \"sysId\": \"subsys_02\", \"sysName\": \"执法问题动态跟踪子系统\" },"
					+ "    { \"sysId\": \"subsys_03\", \"sysName\": \"如实受立案监督子系统\" },"
					+ "    { \"sysId\": \"subsys_04\", \"sysName\": \"执法时限预警子系统\" },"
					+ "    { \"sysId\": \"subsys_05\", \"sysName\": \"电子屏动态监督子系统\" },"
					+ "    { \"sysId\": \"subsys_06\", \"sysName\": \"问题模型管理子系统\" }"
					+ "]";
			
			ObjectMapper mapper = new ObjectMapper();
			List<Map<String, String>> list = mapper.readValue( json, List.class );
			
			
			return new GridResult(true,list);
		} catch (Exception e) {
			return new GridResult( false, null );
		}
		
	}
	
	 */
	
}