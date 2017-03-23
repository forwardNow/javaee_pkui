package com.pkusoft.framework.jstl;


import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;

import org.springframework.util.StringUtils;

import com.pkusoft.admin.model.SysDicItem;
import com.pkusoft.common.cache.DicCache;


/**
 * 字典标签
 * @author tanggj
 *
 */
public class DicTag extends BodyTagSupport {
	private static final long serialVersionUID = 1L;
	private String dicName;
	private String var;

	public String getDicName() {
		return dicName;
	}
	public void setDicName(String dicName) {
		this.dicName = dicName;
	}
	public String getVar() {
		return var;
	}
	public void setVar(String var) {
		this.var = var;
	}
	
	public int doStartTag() throws JspException {
		if(StringUtils.hasText(dicName) && StringUtils.hasText(var)){
			List<SysDicItem> list = DicCache.get(dicName);
			pageContext.setAttribute(var, list);
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
