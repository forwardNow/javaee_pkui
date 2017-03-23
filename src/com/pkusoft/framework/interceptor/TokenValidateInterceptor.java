package com.pkusoft.framework.interceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.util.WebUtils;

import com.pkusoft.framework.constants.BaseErrorCode;
import com.pkusoft.framework.exception.BizException;
import com.pkusoft.framework.util.TokenHelper;

public class TokenValidateInterceptor extends HandlerInterceptorAdapter {
	private static String TOKEN_RUNNING_NAME = "_pku_token_running";
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		String strToken = (String)SecurityUtils.getSubject().getSession().getAttribute(TokenHelper.DEFAULT_TOKEN_NAME);
		if(!StringUtils.hasText(strToken)){
			throw new BizException(BaseErrorCode.REPEAT_SUBMIT_ERR,"请勿重复提交！");
		}
		
		Cookie cookieToken = WebUtils.getCookie(request, TokenHelper.DEFAULT_TOKEN_NAME);
		if(cookieToken == null){
			TokenHelper.createToken(true);
			throw new BizException(BaseErrorCode.REPEAT_SUBMIT_ERR,"令牌不存在，请重试");
		}
		
		if(strToken.equals(cookieToken.getValue())){
			request.setAttribute(TOKEN_RUNNING_NAME,strToken);
			SecurityUtils.getSubject().getSession().removeAttribute(TokenHelper.DEFAULT_TOKEN_NAME);
			TokenHelper.createToken(false);
			return true;
		}else{
			TokenHelper.createToken(true);
			throw new BizException(BaseErrorCode.REPEAT_SUBMIT_ERR,"令牌错误，请重试");
		}
	}
	
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// token不存在，有两种可能：1、正常执行，程序运行完成，2、页面重复提交
		String strToken = (String)SecurityUtils.getSubject().getSession().getAttribute(TokenHelper.DEFAULT_TOKEN_NAME);
		if(!StringUtils.hasText(strToken) && request.getAttribute(TOKEN_RUNNING_NAME) != null){
			strToken = (String)SecurityUtils.getSubject().getSession().getAttribute(TokenHelper.DEFAULT_TOKEN_TEMP_NAME);
			SecurityUtils.getSubject().getSession().setAttribute(TokenHelper.DEFAULT_TOKEN_NAME, strToken);
		}
	}
	

}
