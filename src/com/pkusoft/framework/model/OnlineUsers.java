package com.pkusoft.framework.model;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pkusoft.framework.User;

/**
 * 在线用户对象，包括在线用户数、已登录用户数
 * 
 * @author tanggj
 *
 */
public class OnlineUsers {
	private static Logger logger = LoggerFactory.getLogger(OnlineUsers.class);
	private Map<String, HttpSession> onlineSession = new HashMap<String, HttpSession>();  
	private Map<String, HttpSession> loginSession = new HashMap<String, HttpSession>();  
	  
    private static OnlineUsers instance = new OnlineUsers(); 
    private static Object mutex = new Object();
    
    private static int MAX_ONLINE_COUNT = 0;  
    private static Date MAX_ONLINE_COUNT_DATE = new Date();  
    private static int MAX_LOGIN_COUNT = 0;  
    private static Date MAX_LOGIN_COUNT_DATE = new Date();  
  
    private OnlineUsers(){
    	
    }
    
    public static OnlineUsers getInstance() {  
        return instance;  
    }  
      
    public Collection<HttpSession> getOnlineSessions() {  
        return onlineSession.values();  
    }  
  
    public void addOnlineSession(HttpSession session) {  
        onlineSession.put(session.getId(), session);  
        
        //如果超过最大在线人数更新 更新时间
        if(onlineSession.size() >  MAX_ONLINE_COUNT){
            //更新最大在线人数
        	MAX_ONLINE_COUNT = onlineSession.size();
            //更新日期
        	MAX_ONLINE_COUNT_DATE = new Date();
        }
    }  
    
    public int getMaxOnlineCount(){
    	return MAX_ONLINE_COUNT;
    }
    
    public Date getMaxOnlineCountDate(){
    	return MAX_ONLINE_COUNT_DATE;
    }
  
    public void removeOnlineSession(String sessionId) {  
        onlineSession.remove(sessionId);  
    }  
    
    public Collection<HttpSession> getLoginSessions() {  
        return loginSession.values();  
    }  
  
    public void addLoginSession(HttpSession session) {
    	if(onlineSession.get(session.getId()) == null){
    		onlineSession.put(session.getId(), session);
    	}
    	
    	if(loginSession.get(session.getId()) == null){
    		loginSession.put(session.getId(), session);  
    	}
        
        //如果超过最大在线人数更新 更新时间
        if(loginSession.size() >  MAX_LOGIN_COUNT){
            //更新最大在线人数
        	MAX_LOGIN_COUNT = loginSession.size();
            //更新日期
        	MAX_LOGIN_COUNT_DATE = new Date();
        }
    }  
    
    public void removeLoginSession(String sessionId) {  
    	loginSession.remove(sessionId);  
    }  
    
    public int getMaxLoginCount(){
    	return MAX_LOGIN_COUNT;
    }
    
    public Date getMaxLoginCountDate(){
    	return MAX_LOGIN_COUNT_DATE;
    }
  
    
	/**
	 * 强制退出所有用户，除了当前用户
	 */
	public void forceExit() {
		synchronized (mutex) {
			Set<String> key = onlineSession.keySet();
			Iterator<String> it = key.iterator();
			HttpSession session = null;
			while (it.hasNext()) {
				String sessionId = it.next();
				if (!sessionId.equals(User.getSessionId())) {
					session = onlineSession.get(sessionId);
					session.invalidate();
				}
			}
		}
	}

	/**
	 * 强制退出指定sessionId的用户
	 * 
	 * @param sessionId
	 */
	public void forceExit(String sessionId) {
		synchronized (mutex) {
			if (!sessionId.equals(User.getSessionId())) {
				HttpSession session = onlineSession.get(sessionId);
				session.invalidate();
			}
		}
	}
	

}
