package com.pkusoft.admin.controller;

import java.util.List;

import org.codehaus.jackson.map.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pkusoft.admin.model.SysMenu;
import com.pkusoft.admin.model.SysMenuCriteria;
import com.pkusoft.admin.service.SysMenuService;
import com.pkusoft.framework.User;
import com.pkusoft.framework.constants.General;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.model.GridResult;

/**
 * 主显示页面控制器
 * @author tanggj
 *
 */
@Controller
public class MainController {
	@Autowired
	private SysMenuService sysMenuService;
	
	@RequestMapping("/main/index")
	public String index(ModelAndView model){
		return "redirect:/static/desktop/index.html";
	}
	
	@RequestMapping("/main/menu")
	@ResponseBody
	public GridResult menu(){
		List<SysMenu> menuList = null;
		if(General.SUPER_USER.equals(User.getLoginName())){
			Criteria<SysMenuCriteria> criteria = new Criteria<SysMenuCriteria>();
			criteria.setOrderByClause("TREE_LEVEL,ORDER_FLAG");
			menuList = sysMenuService.getListByCriteria(criteria);
		}else{
			menuList = sysMenuService.getSysMenuByUserId(User.getUserId());
		}
	//	menuList = sysMenuService.getSysMenuByUserId(User.getUserId());
		
		GridResult gr = new GridResult(true,menuList);
		
		return gr;
	}
	
	
}
