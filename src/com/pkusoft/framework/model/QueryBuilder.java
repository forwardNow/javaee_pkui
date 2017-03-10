package com.pkusoft.framework.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class QueryBuilder implements Serializable{
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

	protected boolean distinct;

	protected List<CriterionArray> oredCriteria;

	protected Pager pager;
	
	public QueryBuilder(){
		oredCriteria = new ArrayList<CriterionArray>();
	}
	
	public String getOrderByClause() {
		return orderByClause;
	}
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}
	public boolean isDistinct() {
		return distinct;
	}
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}
	public List<CriterionArray> getOredCriteria() {
		return oredCriteria;
	}
	public void setOredCriteria(List<CriterionArray> oredCriteria) {
		this.oredCriteria = oredCriteria;
	}
	public Pager getPager() {
		return pager;
	}
	public void setPager(Pager pager) {
		this.pager = pager;
	}
	
	public static class CriterionArray{
		protected List<QueryCriterion> criteria;
		
		public CriterionArray(){
			criteria = new ArrayList<QueryCriterion>();
		}
		
		public List<QueryCriterion> getCriteria() {
			return criteria;
		}
		public void setCriteria(List<QueryCriterion> criteria) {
			this.criteria = criteria;
		}
	}

	public static class QueryCriterion{
		protected String property;
		protected String operator;
		protected String value;
		protected String value1;
		protected String datatype;
		
		public String getProperty() {
			return property;
		}
		public void setProperty(String property) {
			this.property = property;
		}
		public String getOperator() {
			return operator;
		}
		public void setOperator(String operator) {
			this.operator = operator;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		public String getValue1() {
			return value1;
		}
		public void setValue1(String value1) {
			this.value1 = value1;
		}
		public String getDatatype() {
			return datatype;
		}
		public void setDatatype(String datatype) {
			this.datatype = datatype;
		}
		
		
	}
}
