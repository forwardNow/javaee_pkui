package com.pkusoft.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.pkusoft.admin.service.SysDicItemService;
import com.pkusoft.framework.controller.BaseController;

/**
 * 系统字典条目控制器
 * 
 * @author 
 */
@Controller
public class SysDicItemController extends BaseController {

	/** 系统字典条目服务类 */
	@Autowired
	private SysDicItemService sysDicItemService;


}