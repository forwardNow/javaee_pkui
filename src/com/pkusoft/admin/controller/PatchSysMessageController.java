package com.pkusoft.admin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pkusoft.admin.model.SysMessage;
import com.pkusoft.admin.service.SysMessageService;
import com.pkusoft.framework.User;
import com.pkusoft.framework.constants.General;
import com.pkusoft.framework.controller.BaseController;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.model.Criteria.BaseCriteria;
import com.pkusoft.framework.model.GridResult;
import com.pkusoft.framework.model.JsonResult;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.framework.util.WebUtils;

/**
 * 消息控制器
 * 
 * @author 
 */
@Controller
public class PatchSysMessageController extends BaseController {
	/** 日志句柄 */
	private static Logger logger = LoggerFactory.getLogger(PatchSysMessageController.class);

	/** 消息服务类 */
	@Autowired
	private SysMessageService sysMessageService;

	/**
	 * 收件箱列表
	 * 
	 * @param sysMessage
	 * @param pager
	 * @return
	 */
	@RequestMapping("/common/sysMessageListData")
	@ResponseBody
	public GridResult sysMessageListData(boolean isSend,SysMessage sysMessage, String txtQuery) {
		try {
			List<SysMessage> list = null;
			Criteria<?> criteria = WebUtils.toCriteria(txtQuery);
			BaseCriteria sysMessageCriteria = criteria.getOredCriteria().get( 0 );
			Pager pager = criteria.getPager();
			criteria.setOrderByClause("SEND_TIME DESC");
			if(isSend){
//				list = sysMessageService.getSysMessageSendList(sysMessage, pager);
				// sysMessageCriteria.andSendDelFlagEqualTo(General.NO);
				sysMessageCriteria.addCriterion( "SEND_DEL_FLAG = " + General.NO);
				// sysMessageCriteria.andSendUserIdEqualTo(User.getUserId());
				sysMessageCriteria.addCriterion( "SEND_USER_ID = " + User.getUserId() );
			}else{
//				list = sysMessageService.getSysMessageList(sysMessage, pager);
				// sysMessageCriteria.andReceiveDelFlagEqualTo(General.NO);
				// sysMessageCriteria.andReceiveUserIdEqualTo(User.getUserId());
				sysMessageCriteria.addCriterion( "RECEIVE_DEL_FLAG = " + General.NO);
				sysMessageCriteria.addCriterion( "RECEIVE_USER_ID = " + User.getUserId() );
			}

			list = sysMessageService.getListByCriteria( criteria );
			
			if ( pager.getTotalRecords() <= 0 ) {
				int count = sysMessageService.getCountByCriteria(criteria);
				pager.setTotalRecords(count);
			}
			
			return new GridResult(true, list, pager.getTotalRecords());
		} catch (Exception e) {
			logger.error("查询列表数据出错", e);
			return new GridResult(false, null);
		}
	}
	
	@RequestMapping("/admin/sysMessageModel")
	@ResponseBody
	public JsonResult sysMessageModel(String msgId) {
		JsonResult jsonResult = new JsonResult();
		try {
			SysMessage sysMessage = sysMessageService.get(msgId);
			jsonResult.setSuccess( true );
			jsonResult.setData( sysMessage );
			return jsonResult;
		} catch (Exception e) {
			jsonResult.setSuccess( false );
			jsonResult.setMessage( "获取消息失败" );
			return jsonResult;
		}
	}
}