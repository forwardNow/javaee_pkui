package com.pkusoft.framework.model;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import com.pkusoft.framework.util.StringUtils;

public class MyBatisModel implements Serializable{
	private static final long serialVersionUID = 1L;

	/**
	 * 获取Model对应的表名
	 * 需要Model中的属性定义@Table(name)
	 * @return 表名
	 */
	public String table() {
		Table table = this.getClass().getAnnotation(Table.class);
		if(table != null)
			return table.name();
		else
			throw new RuntimeException("undefine MODEL @Table, need Tablename(@Table)");  
	}
	
	/**
	 * 获取Model中的主键字段名
	 * 需要定义@Id
	 * @return 主键字段名
	 */
	public String id() {
		for(Field field : this.getClass().getDeclaredFields()) {
			if(field.isAnnotationPresent(Id.class))
				return field.getName();
		}
		
		throw new RuntimeException("undefine MODEL @ID");  
	}

	/**
	 * 用于存放Model的列信息
	 */
	private transient static Map<Class<? extends MyBatisModel>,List<String>> columnMap = new HashMap<Class<? extends MyBatisModel>, List<String>>();
	
	private boolean isNull(String fieldname) {
		try {
			Field field = this.getClass().getDeclaredField(fieldname);
			return isNull(field);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	private boolean isNull(Field field) {
		try {
			field.setAccessible(true);
			return field.get(this) == null;
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	/**
	 * 用于计算类定义
	 * 需要Model中的属性定义@Column(name)
	 */
	public void caculationColumnList() {
		if(columnMap.containsKey(this.getClass()))
			return;
		
		Field[] fields = this.getClass().getDeclaredFields();
		List<String> columnList = new ArrayList<String>(fields.length);
		
		for(Field field : fields) {
			if(field.isAnnotationPresent(Column.class))
				columnList.add(field.getName());
		}
		
		columnMap.put(this.getClass(), columnList);
	}
	
	public String columns(){
		List<String> list = columnMap.get(this.getClass());
		String columns = org.apache.commons.lang.StringUtils.join(list.iterator(),",");
		columns = StringUtils.toUnderline(columns);
		return columns.toUpperCase();
	}
	
	/**
	 * 获取用于WHERE的 有值字段表
	 * @return Where字段名
	 */
	public List<WhereColumn> returnWhereColumnsName() {
		Field[] fields = this.getClass().getDeclaredFields();
		List<WhereColumn> columnList = new ArrayList<WhereColumn>(fields.length);
		
		for(Field field : fields) {
			if(field.isAnnotationPresent(Column.class) && !isNull(field)) 
				columnList.add(new WhereColumn(field.getName(), field.getGenericType().equals(String.class)));
		}
		
		return columnList;
	}
	
	/**
	 * Where条件信息
	 * @author HUYAO
	 *
	 */
	public class WhereColumn {
		public String name;
		public boolean isString;
		
		public WhereColumn(String name,boolean isString) {
			this.name = name;
			this.isString = isString;
		}
	}
	
	/**
	 * 用于获取Insert的字段累加
	 * @return 字段累加
	 */
	public String returnInsertColumnsName() {
		StringBuilder sb = new StringBuilder();
		
		List<String> list = columnMap.get(this.getClass());
		int i = 0;
		for(String column : list) {
			if(isNull(column))
				continue;
			
			if(i++ != 0)
				sb.append(',');
			sb.append(StringUtils.toUnderline(column).toUpperCase());
		}
		return sb.toString();
	}
	
	/**
	 * 用于获取Insert的字段映射累加
	 * @return 字段映射累加
	 */
	public String returnInsertColumnsDefine() {
		StringBuilder sb = new StringBuilder();
		
		List<String> list = columnMap.get(this.getClass());
		int i = 0;
		for(String column : list) {
			if(isNull(column))
				continue;
			
			if(i++ != 0)
				sb.append(',');
			sb.append("#{").append(column).append('}');
		}
		return sb.toString();
	}
	
	/**
	 * 用于获取Update Set的字段累加
	 * @return 字段累加
	 */
	public String returnUpdateSet() {
		StringBuilder sb = new StringBuilder();
		
		List<String> list = columnMap.get(this.getClass());
		int i = 0;
		for(String column : list) {
			if(isNull(column))
				continue;
			
			if(i++ != 0)
				sb.append(',');
			sb.append(column).append("=#{").append(column).append('}');
		}
		return sb.toString();
	}
	

	public Integer getId(){return 0;}

	/**
	 * 转化Model为JSON格式
	 * 需要org.json包支持,可以在json官网下载源码,或自己实现json编码
	 * @return
	 */
	/*public String toJSONString() {
		JSONObject json = new JSONObject(this);
		return json.toString();
	}*/
	
	/**
	 * 打印类字段信息
	 */
	@Override
	public String toString() {
		Field[] fields = this.getClass().getDeclaredFields();
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		for(Field f : fields) {
			if(Modifier.isStatic(f.getModifiers()) || Modifier.isFinal(f.getModifiers()))
				continue;
			Object value = null;
			try {
				f.setAccessible(true);
				value = f.get(this);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			if(value != null)
				sb.append(f.getName()).append('=').append(value).append(',');
		}
		sb.append(']');
		
		return sb.toString();
	}
	
	/**
	 * 以下为一些分页信息,如不需要可以删除
	 */
	private int page;
	private int pageSize;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
}
