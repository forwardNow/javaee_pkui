package com.pkusoft.framework.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public final class Criteria<T extends com.pkusoft.framework.model.Criteria.BaseCriteria> {

	protected String orderByClause;

	protected boolean distinct;

	protected List<BaseCriteria> oredCriteria;

	protected Pager pager;

	public Pager getPager() {
		return pager;
	}

	public void setPager(Pager pager) {
		this.pager = pager;
	}

	public Criteria() {
		oredCriteria = new ArrayList<BaseCriteria>();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return distinct;
	}

	public List<BaseCriteria> getOredCriteria() {
		return oredCriteria;
	}

	public void or(T criteria) {
		oredCriteria.add(criteria);
	}

	public T or(Class<T> criteriaClazz) {
		try {
			T criteria = criteriaClazz.newInstance();
			oredCriteria.add(criteria);
			return criteria;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public T createCriteria(Class<T> criteriaClazz) {
		try {
			T criteria = criteriaClazz.newInstance();
			if (oredCriteria.size() == 0) {
				oredCriteria.add(criteria);
			}
			return criteria;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	public static class BaseCriteria {
		protected List<Criterion> criteria;

		public BaseCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		public void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		public void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		public void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public void addCriterionForJDBCDate(String condition, Date value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()),
					property);
		}

		public void addCriterionForJDBCDate(String condition,
				List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property
						+ " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		public void addCriterionForJDBCDate(String condition, Date value1,
				Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()),
					new java.sql.Date(value2.getTime()), property);
		}

		public static class Criterion {
			private String condition;

			private Object value;

			private Object secondValue;

			private boolean noValue;

			private boolean singleValue;

			private boolean betweenValue;

			private boolean listValue;

			private String typeHandler;

			public String getCondition() {
				return condition;
			}

			public Object getValue() {
				return value;
			}

			public Object getSecondValue() {
				return secondValue;
			}

			public boolean isNoValue() {
				return noValue;
			}

			public boolean isSingleValue() {
				return singleValue;
			}

			public boolean isBetweenValue() {
				return betweenValue;
			}

			public boolean isListValue() {
				return listValue;
			}

			public String getTypeHandler() {
				return typeHandler;
			}

			protected Criterion(String condition) {
				super();
				this.condition = condition;
				this.typeHandler = null;
				this.noValue = true;
			}

			protected Criterion(String condition, Object value,
					String typeHandler) {
				super();
				this.condition = condition;
				this.value = value;
				this.typeHandler = typeHandler;
				if (value instanceof List<?>) {
					this.listValue = true;
				} else {
					this.singleValue = true;
				}
			}

			protected Criterion(String condition, Object value) {
				this(condition, value, null);
			}

			protected Criterion(String condition, Object value,
					Object secondValue, String typeHandler) {
				super();
				this.condition = condition;
				this.value = value;
				this.secondValue = secondValue;
				this.typeHandler = typeHandler;
				this.betweenValue = true;
			}

			protected Criterion(String condition, Object value,
					Object secondValue) {
				this(condition, value, secondValue, null);
			}
		}
	}
}