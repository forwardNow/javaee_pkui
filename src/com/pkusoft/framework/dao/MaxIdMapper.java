package com.pkusoft.framework.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

/**
 * 最大编号数据访问
 * @author tanggj
 *
 */
@Repository
public interface MaxIdMapper {
	
	/**
	 * 获取A类型Id
	 * @param params 
	 * <pre>
	   <parameter property="strIdType" javaType="java.lang.String" jdbcType="VARCHAR" mode="IN" />
       <parameter property="intMaxId" javaType="java.lang.Long" jdbcType="NUMERIC" mode="OUT"/>
       <parameter property="strMaxId" javaType="java.lang.String" jdbcType="VARCHAR" mode="OUT"/>
       <parameter property="strMaxFullId" javaType="java.lang.String" jdbcType="VARCHAR" mode="OUT"/>
	 * </pre>
	 */
	void getMaxIdA(Map<String,Object> params);
	
	/**
	 * 获取B类型Id
	 * @param params 
	 * <pre>
	   <parameter property="strIdType" javaType="java.lang.String" jdbcType="VARCHAR" mode="IN" />
	   <parameter property="strIdPara1" javaType="java.lang.String" jdbcType="VARCHAR" mode="IN" />
       <parameter property="intMaxId" javaType="java.lang.Long" jdbcType="NUMERIC" mode="OUT"/>
       <parameter property="strMaxId" javaType="java.lang.String" jdbcType="VARCHAR" mode="OUT"/>
       <parameter property="strMaxFullId" javaType="java.lang.String" jdbcType="VARCHAR" mode="OUT"/>
	 * </pre>
	 */
	void getMaxIdB(Map<String,Object> params);
	
	/**
	 * 获取C类型Id
	 * @param params 
	 * <pre>
	   <parameter property="strIdType" javaType="java.lang.String" jdbcType="VARCHAR" mode="IN" />
	   <parameter property="strIdPara1" javaType="java.lang.String" jdbcType="VARCHAR" mode="IN" />
	   <parameter property="strIdPara2" javaType="java.lang.String" jdbcType="VARCHAR" mode="IN" />
       <parameter property="intMaxId" javaType="java.lang.Long" jdbcType="NUMERIC" mode="OUT"/>
       <parameter property="strMaxId" javaType="java.lang.String" jdbcType="VARCHAR" mode="OUT"/>
       <parameter property="strMaxFullId" javaType="java.lang.String" jdbcType="VARCHAR" mode="OUT"/>
	 * </pre>
	 */
	void getMaxIdC(Map<String,Object> params);
	
}
