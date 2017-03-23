package com.pkusoft.admin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pkusoft.admin.model.SysDeptLevel;
import com.pkusoft.admin.model.SysMenu;
import com.pkusoft.admin.model.SysMenuCriteria;
import com.pkusoft.admin.model.SysMenuIcon;
import com.pkusoft.admin.service.SysMenuService;
import com.pkusoft.common.constants.AdminFunctionId;
import com.pkusoft.common.constants.AdminUrlRecource;
import com.pkusoft.common.util.LogUtils;
import com.pkusoft.framework.User;
import com.pkusoft.framework.constants.General;
import com.pkusoft.framework.controller.BaseController;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.model.DicXmlResult;
import com.pkusoft.framework.model.GridResult;
import com.pkusoft.framework.model.JsonResult;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.framework.util.MapUtils;

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
			sysMenuService.updateSysMenu(sysMenu);
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
}