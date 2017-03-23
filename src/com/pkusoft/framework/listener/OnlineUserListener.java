package com.pkusoft.framework.listener;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pkusoft.framework.User.UserInfo;
import com.pkusoft.framework.constants.General;
import com.pkusoft.framework.model.OnlineUsers;
import com.pkusoft.framework.util.ServletUtils;


/**
 * 在线用户监听器，需在web.xml加入监听
 * 
 * @author tanggj
 *
 */
public class OnlineUserListener implements HttpSessionListener , ServletRequestListener{
	private static Logger logger = LoggerFactory.getLogger(OnlineUserListener.class);
	private static Object mutex = new Object();

	private ServletRequest request;
	
    public void sessionCreated(HttpSessionEvent event) {  
    	HttpSession session = event.getSession();
    	String sessionId = String.valueOf(session.getId());
		synchronized (mutex) {
			UserInfo user = new UserInfo();
			user.setSessionId(sessionId);
			user.setIp(ServletUtils.getRemoteAddr((HttpServletRequest) request));
			user.setLocale(request.getLocale());
			
			session.setAttribute(General.AUTH_KEY, user);
			
			OnlineUsers.getInstance().addOnlineSession(session);
			logger.debug("游客{}({})访问系统", user.getIp(),sessionId);  
		}
    }  
  
    public void sessionDestroyed(HttpSessionEvent event) {  
    	HttpSession session = event.getSession();
    	String sessionId = session.getId();
    	UserInfo u = (UserInfo) session.getAttribute(General.AUTH_KEY);
    	logger.debug("游客{}({})离开系统", u.getIp(),sessionId);  
        OnlineUsers.getInstance().removeOnlineSession(sessionId);  
        
        // 如果已登录后台，删除后台在线用户
        if(u != null && u.isLogin()){
        	OnlineUsers.getInstance().removeLoginSession(sessionId);
        	logger.debug("后台用户{}({})下线", u.getIp(),u.getLoginName());  
        }
    }


	public void requestInitialized(ServletRequestEvent sre) {
		request = sre.getServletRequest();
	}
	
	public void requestDestroyed(ServletRequestEvent sre) {
		
	}

	
}
