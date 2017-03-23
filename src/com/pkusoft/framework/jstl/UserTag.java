package com.pkusoft.framework.jstl;


import java.util.ArrayList;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import org.springframework.util.StringUtils;

import com.pkusoft.admin.model.SysUser;
import com.pkusoft.common.cache.UserCache;


/**
 * 用户信息标签，可通过用户id获取用户信息，或者通过用户名称获取用户信息。如果userId和userName没有指定，将获取所有用户信息列表设置到pageContext中
 * @author tanggj
 *
 */
public class UserTag extends TagSupport {
	private static final long serialVersionUID = 1L;
	private Long userId;
	private String userName;
	private String var;
	
	public String getVar() {
		return var;
	}
	public void setVar(String var) {
		this.var = var;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getDicName() {
		return userName;
	}
	public void setDicName(String userName) {
		this.userName = userName;
	}
	
	public int doStartTag() throws JspException {
		if(StringUtils.hasText(var)){
			if(userId != null){
				SysUser user = UserCache.getUserByUserId(userId);
				if(user != null){
					pageContext.setAttribute(var, user);
				}
			}else if(StringUtils.hasText(userName)){
				SysUser user = UserCache.getUserByUserName(userName);
				if(user != null){
					pageContext.setAttribute(var, user);
				}
			}else{
				if(userId == null && userName == null){
					ArrayList<SysUser> userList = UserCache.getUserList();
					pageContext.setAttribute(var, userList);
				}
			}
		}
		
		return EVAL_BODY_INCLUDE;
	}
	

	public int doEndTag() throws JspException {
		if(StringUtils.hasText(var)){
			pageContext.removeAttribute(var);
		}
		return EVAL_PAGE;
	}
}
