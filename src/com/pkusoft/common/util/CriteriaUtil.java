package com.pkusoft.common.util;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import com.pkusoft.framework.model.Pager;
import com.pkusoft.framework.util.MapUtils;

public class CriteriaUtil implements Serializable{
	private static final long serialVersionUID = 1L;
	/**
	 * 将 页面传过来的 txtQuery 转换成查询条件对象 CriteriaExt
	 * @param txtQuery
	 * <pre>
	 * {
		    "orderByClause" : "USER_ID DESC",
		    "distinct" : false,
		    "pager" : {
		        "start" : 0,
		        "limit" : 20,
		        "pageSize" : 20,
		        "totalRecords" : 0
		    },
		    "oredCriteria" : [
		        [{
		            "property" : "userName",
		            "operator" : "like",
		            "value" : "%a%",
		            "datatype" : "string"
		        },{
		            "property" : "deptId",
		            "operator" : "=",
		            "value" : "4201010000",
		            "datatype" : "string"
		        }],
		        [{
		            "property" : "realName",
		            "operator" : "like",
		            "value" : "%a%",
		            "datatype" : "string"
		        }]
		    ]
		}
	 * </pre>
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static CriteriaExt toCriteriaExt(String txtQuery){
		try {
			CriteriaExt criteria = new CriteriaExt();
			
			ObjectMapper mapper = new ObjectMapper(); 
			Map<String, Object> map = mapper.readValue(txtQuery, Map.class);
			
			// 如果为空，则直接返回
			if ( CollectionUtils.isEmpty( map) ) {
				return criteria;	
			}
			
			// orderByClause
			String orderByClause = (String) map.get("orderByClause");
			
			if ( StringUtils.hasText( orderByClause ) ) {
				// 防sql注入
				if ( checkSqlInjection( orderByClause ) ) {
					throw new IllegalArgumentException("查询条件中不能包含特殊字符");
				}
				criteria.setOrderByClause( orderByClause );
			}
			
			// pager
			Map<String,Object> pagerMap = (Map<String, Object>) map.get("pager");
			if(!CollectionUtils.isEmpty(pagerMap)){
				criteria.setPager(MapUtils.toObject(pagerMap, Pager.class));
			}			
			
			// oredCriteria
			List<?> oredCriteriaArrayList = ( List<?> ) map.get( "oredCriteria" );
			if ( !CollectionUtils.isEmpty( oredCriteriaArrayList ) ) {
				Map<String, Object> conditions = new HashMap<String, Object>();
				for (Object c : oredCriteriaArrayList) {
					List<Map<String,Object>> oredCriteriaArray = (List<Map<String, Object>>) c;
					for (Map<String,Object> oredCriteria : oredCriteriaArray) {
						String property = ( String ) oredCriteria.get( "property" );
						Object value = oredCriteria.get( "value" );
						conditions.put( property, value );
					}
				}
				criteria.setOredCriteria( conditions );
			}
			
			return criteria;
		} catch (Exception e) {
			throw new IllegalArgumentException("传入参数不是标准查询条件格式",e);
		}
	}
	
	/**
	 * 检查是否存在sql注入 true为存在，false不存在
	 * @param str 检查值
	 * @return true/false
	 */
	private static boolean checkSqlInjection(String str){
		if(str.indexOf("'") != -1){
			return true;
		}
		return false;
	}
	
}
