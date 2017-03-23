package com.pkusoft.framework.jstl;


import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;

import org.springframework.util.StringUtils;

import com.pkusoft.common.cache.DeptCache;


/**
 * 部门值翻译
 * @author tanggj
 *
 */
public class DeptValueTag extends BodyTagSupport {
	private static final long serialVersionUID = 1L;
	private String deptId;
	private String deptName;
	
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public int doStartTag() throws JspException {
		if(StringUtils.hasText(deptId)){
			try {
				String retDeptName = DeptCache.getDeptNameByDeptId(deptId);
				if(StringUtils.hasText(retDeptName)){
					pageContext.getOut().write(retDeptName);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else if(StringUtils.hasText(deptName)){
			try {
				String retDeptId = DeptCache.getDeptIdByDeptName(deptName);
				if(retDeptId != null){
					pageContext.getOut().write(String.valueOf(retDeptId));
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return SKIP_BODY;
	}
}
