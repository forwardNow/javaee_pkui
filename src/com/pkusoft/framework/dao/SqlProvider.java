package com.pkusoft.framework.dao;

import java.util.List;

import org.apache.ibatis.jdbc.SqlBuilder;

import com.pkusoft.framework.model.MyBatisModel;
import com.pkusoft.framework.util.StringUtils;

public class SqlProvider<T extends MyBatisModel> {
	public String insert(T obj) {
		SqlBuilder.BEGIN();

		SqlBuilder.INSERT_INTO(obj.table());
		obj.caculationColumnList();
		SqlBuilder.VALUES(obj.returnInsertColumnsName(), obj.returnInsertColumnsDefine());

		return SqlBuilder.SQL();
	}

	public String update(T obj) {
		String idname = obj.id();

		SqlBuilder.BEGIN();

		SqlBuilder.UPDATE(obj.table());
		obj.caculationColumnList();
		SqlBuilder.SET(obj.returnUpdateSet());
		SqlBuilder.WHERE(StringUtils.toUnderline(idname) + "=#{" + idname + "}");

		return SqlBuilder.SQL();
	}

	public String delete(T obj) {
		String idname = obj.id();

		SqlBuilder.BEGIN();

		SqlBuilder.DELETE_FROM(obj.table());
		SqlBuilder.WHERE(idname + "=#{" + idname + "}");

		return SqlBuilder.SQL();
	}
	
	public String count(T obj){
		SqlBuilder.BEGIN();
		SqlBuilder.SELECT("count(*)");
		SqlBuilder.FROM(obj.table());
		return SqlBuilder.SQL();
	}
	
	public String select(T obj){
		SqlBuilder.BEGIN();
		obj.caculationColumnList();
		SqlBuilder.SELECT(obj.columns());
		SqlBuilder.FROM(obj.table());
		return SqlBuilder.SQL();
	}
}
