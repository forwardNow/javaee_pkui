package com.pkusoft.framework.interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.pkusoft.framework.User;
import com.pkusoft.framework.User.UserInfo;
import com.pkusoft.framework.constants.General;


/**
 * 访问拦截器，创建用户对象
 * @author tanggj
 *
 */
public class AccessInterceptor extends HandlerInterceptorAdapter {
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.handler.HandlerInterceptorAdapter#preHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object)
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		response.setContentType("text/html;charset=UTF-8");
		
		Session session = SecurityUtils.getSubject().getSession();
		UserInfo u = (UserInfo) session.getAttribute(General.AUTH_KEY);
		if (u == null) {
			u = new UserInfo();
			u.setSessionId(String.valueOf(session.getId()));
			u.setIp(session.getHost());
			u.setLocale(request.getLocale());
			
			session.setAttribute(General.AUTH_KEY, u);
		}

		User.setCurrent(u);
		
		return super.preHandle(request, response, handler);
	}
	

}
