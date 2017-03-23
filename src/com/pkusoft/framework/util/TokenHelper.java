package com.pkusoft.framework.util;

import java.math.BigInteger;
import java.util.Random;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.web.subject.WebSubject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.util.CookieGenerator;
import org.springframework.web.util.WebUtils;

public class TokenHelper {
	private static final Logger logger = LoggerFactory.getLogger(TokenHelper.class);  
	
	public static final String DEFAULT_TOKEN_NAME = "_pku_token";  
	public static final String DEFAULT_TOKEN_TEMP_NAME = "_pku_token_temp";  
	private static final Random RANDOM = new Random();  

	/*
	public static String setToken() {
		return setToken(DEFAULT_TOKEN_NAME); 
	}
	
	public static String setToken(String tokenName) {
		String token = generateGUID();
		try {
			HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
					.getRequestAttributes()).getRequest();
			request.getSession().setAttribute(tokenName, token);
		} catch (IllegalStateException e) {
			String msg = "Error creating HttpSession due response is commited to client. You can use the CreateSessionInterceptor or create the HttpSession from your action before the result is rendered to the client: "
					+ e.getMessage();
			logger.error(msg, e, new String[0]);
			throw new IllegalArgumentException(msg);
		}
		return token;
	}
	
	
	public static String getToken(){
		return getToken(DEFAULT_TOKEN_NAME);
	}
	
	public static String getToken(String tokenName){
		if(tokenName == null){
			return null;
		}
		
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes()).getRequest();
		String token = request.getParameter(tokenName);
		if(token == null){
			logger.warn("Could not find token mapped to token name " + tokenName, new String[0]);  
		}
		return token;
	}
	
	public static boolean validToken(){
		String token = getToken(DEFAULT_TOKEN_NAME);  
		 if (token == null) {  
			 if (logger.isDebugEnabled())  {
				 logger.debug("no token found for token name " + DEFAULT_TOKEN_NAME + " -> Invalid token ", new String[0]);  
			 }
			 return false;  
		 } 

		HttpSession session = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
		String sessionToken = (String) session.getAttribute(DEFAULT_TOKEN_NAME);
		
		//判断session中的token值和页面上的token值是否相等  
		if(!token.equals(sessionToken)){
			logger.warn("Form token {} does not match the session token {}", token, sessionToken);  
			return false;	
		}
		
		session.removeAttribute(DEFAULT_TOKEN_NAME);
		return true;
	}*/
	
	public static String generateGUID(){
		return (new BigInteger(165, RANDOM).toString(36).toUpperCase());
	}
	
	public static void createToken(boolean isNew){
		String strToken = TokenHelper.generateGUID();
		
		ServletRequest sRequest = ((WebSubject)SecurityUtils.getSubject()).getServletRequest();
		ServletResponse sResponse = ((WebSubject)SecurityUtils.getSubject()).getServletResponse();
		HttpServletRequest request = (HttpServletRequest)sRequest;
		HttpServletResponse response = (HttpServletResponse)sResponse;
		
		if(isNew){
			SecurityUtils.getSubject().getSession().setAttribute(DEFAULT_TOKEN_NAME, strToken);
		}else{
			SecurityUtils.getSubject().getSession().setAttribute(DEFAULT_TOKEN_TEMP_NAME, strToken);
		}
		
		Cookie cookieToken = WebUtils.getCookie(request, DEFAULT_TOKEN_NAME);
		if(cookieToken != null){
			cookieToken.setValue(strToken);
			response.addCookie(cookieToken);
		}else{
			CookieGenerator cg = new CookieGenerator();
			cg.setCookiePath("/");
			cg.setCookieMaxAge(-1);
			cg.setCookieName(DEFAULT_TOKEN_NAME);
			cg.addCookie(response, strToken);
		}
	}
	
}
