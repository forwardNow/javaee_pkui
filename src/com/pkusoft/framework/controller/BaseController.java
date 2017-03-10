package com.pkusoft.framework.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.pkusoft.framework.exception.BizException;
import com.pkusoft.framework.model.DateEditor;


/**
 * 
 * @author tanggj
 * 
 */
public class BaseController {
	private static Logger logger = LoggerFactory.getLogger(BaseController.class);

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new DateEditor());
	}

	
	/**
	 * 获取异常信息
	 * 
	 * @param e
	 * @return 整理后的异常信息
	 */
	public String getMessage(Exception e){
		String msg = "";
		String clazzName = e.getClass().getName();
		if("com.pkusoft.framework.exception.BizMessageException".equals(clazzName)){
			msg = e.getMessage();
		}else if("com.pkusoft.framework.exception.BizException".equals(clazzName)){
			msg = "业务异常，错误原因：" + e.getMessage() + "，错误代码为" + ((BizException) e).getErrorCode();
		}else{
			Throwable ourCause = e;
			while ((ourCause = e.getCause()) != null) {
				e = (Exception) ourCause;
			}
			clazzName = e.getClass().getName();
			if(clazzName.indexOf("SQLException") != -1){
				msg = "SQL执行异常." + e.getMessage();
			}else if(clazzName.indexOf("IOException") != -1){
				msg = "IO异常";
			}else if(clazzName.indexOf("IllegalArgumentException") != -1){
				msg = "非法的参数";
			}else if("java.lang.NumberFormatException".equals(clazzName)){
				msg	= "请输入正确的数字";
			}else if(clazzName.indexOf("NullPointerException") != -1){
				msg = "空指针异常";
			}else if(clazzName.indexOf("RuntimeException") != -1){
				msg = "运行时异常";
			}else{
				msg = "未处理的异常类型：" + clazzName;
			}
		}
		
		//替换特殊字符
		msg = msg.replaceAll("\"", "'");
		
		return msg;
	}
}
