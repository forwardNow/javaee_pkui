package com.pkusoft.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pkusoft.admin.model.SysDicList;
import com.pkusoft.admin.service.SysDicListService;
import com.pkusoft.framework.controller.BaseController;
import com.pkusoft.framework.model.JsonResult;

/**
 * 系统字典列表控制器
 * 
 * @author
 */
@Controller
public class SysDicListController extends BaseController {
	/** 系统字典列表服务类 */
	@Autowired
	private SysDicListService sysDicListService;
	/** 日志句柄 */
	private static Logger logger = LoggerFactory.getLogger( SysDicListController.class );

	
	/**
	 * 生成字典文件
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping( "/admin/sysDicCreateXmlForm" )
	@ResponseBody
	public JsonResult sysDicCreateXmlForm( SysDicList sysDicList ) {
		try {
			// 单个生成字典文件
			if ( sysDicList.getDicName() != null && !"".equals( sysDicList.getDicName() ) ) {
				sysDicListService.createDicFile( sysDicList.getDicName() );
			} else {
				// 生成全部字典文件
				sysDicListService.createAllDicFile();
			}
			logger.info( "生成字典成功" );
			return new JsonResult( true );
		} catch ( Exception e ) {
			logger.error( "生成字典失败", e );
			throw new RuntimeException( this.getMessage( e ) );
		}
	}

}