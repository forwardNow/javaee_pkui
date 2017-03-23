package com.pkusoft.framework.jstl;


import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;

import org.springframework.util.StringUtils;

import com.pkusoft.common.cache.DicCache;
import com.pkusoft.common.cache.UserCache;


/**
 * 用户值翻译
 * @author tanggj
 *
 */
public class UserValueTag extends BodyTagSupport {
	private static final long serialVersionUID = 1L;
	private Long userId;
	private String userName;
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public int doStartTag() throws JspException {
		if(userId != null){
			try {
				String retUserName = UserCache.getUserNameByUserId(userId);
				if(StringUtils.hasText(retUserName)){
					pageContext.getOut().write(retUserName);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else if(StringUtils.hasText(userName)){
			try {
				Long retUserId = UserCache.getUserIdByUserName(userName);
				if(retUserId != null){
					pageContext.getOut().write(String.valueOf(retUserId));
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return SKIP_BODY;
	}
}
