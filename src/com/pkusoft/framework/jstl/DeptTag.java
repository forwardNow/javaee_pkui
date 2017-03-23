package com.pkusoft.framework.jstl;


import java.util.ArrayList;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import org.springframework.util.StringUtils;

import com.pkusoft.admin.model.SysDept;
import com.pkusoft.common.cache.DeptCache;


/**
 * 部门信息标签，可通过部门id获取部门信息，或者通过部门名称获取部门信息。如果deptId和deptName没有指定，将获取所有部门信息列表设置到pageContext中
 * @author tanggj
 *
 */
public class DeptTag extends TagSupport {
	private static final long serialVersionUID = 1L;
	private String deptId;
	private String deptName;
	private String var;
	
	public String getVar() {
		return var;
	}
	public void setVar(String var) {
		this.var = var;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getDicName() {
		return deptName;
	}
	public void setDicName(String deptName) {
		this.deptName = deptName;
	}
	
	public int doStartTag() throws JspException {
		if(StringUtils.hasText(var)){
			if(deptId != null){
				SysDept dept = DeptCache.getDeptByDeptId(deptId);
				if(dept != null){
					pageContext.setAttribute(var, dept);
				}
			}else if(StringUtils.hasText(deptName)){
				SysDept dept = DeptCache.getDeptByDeptName(deptName);
				if(dept != null){
					pageContext.setAttribute(var, dept);
				}
			}else{
				if(deptId == null && deptName == null){
					ArrayList<SysDept> deptList = DeptCache.getDeptList();
					pageContext.setAttribute(var, deptList);
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
