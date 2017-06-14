package com.pkusoft.common.util;

import java.io.Serializable;
import java.util.Map;

import com.pkusoft.framework.model.Pager;

public class CriteriaExt implements Serializable {
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

	protected Map<String, Object> oredCriteria;

	protected Pager pager;

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setOrderByClause( String orderByClause ) {
		this.orderByClause = orderByClause;
	}

	public Map<String, Object> getOredCriteria() {
		return oredCriteria;
	}

	public void setOredCriteria( Map<String, Object> oredCriteria ) {
		this.oredCriteria = oredCriteria;
	}

	public Pager getPager() {
		return pager;
	}

	public void setPager( Pager pager ) {
		this.pager = pager;
	}


}
