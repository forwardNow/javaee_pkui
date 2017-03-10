package com.pkusoft.framework.model;

public class Pager {
	public static final Integer MAX_PAGE_SIZE = 500;// 每页最大记录数限制
	private int start = 0; // 当前偏移量
	private int limit = 0; // 当前偏移量
	private int pageSize = 20; // 每页显示的行数
	private int totalRecords = 0; // 总行数
	
	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		if (start < 0) {
			start = 0;
		}
		this.start = start;
	}

	public int getLimit() {
		return limit;
	}
	
	public void setLimit(int limit) {
		if(limit < 0){
			limit = this.pageSize;
		}
		this.limit = limit;
	}

	public void setPageSize(int pageSize) {
		if (pageSize < 1) {
			pageSize = 1;
		} else if (pageSize > MAX_PAGE_SIZE) {
			pageSize = MAX_PAGE_SIZE;
		}
		this.pageSize = pageSize;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}

	public int getTotalRecords() {
		return totalRecords;
	}

}
