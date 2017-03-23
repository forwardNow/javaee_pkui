package com.pkusoft.framework.util;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.util.CollectionUtils;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.pkusoft.framework.User;
import com.pkusoft.framework.User.UserInfo;
import com.pkusoft.framework.constants.General;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.model.Criteria.BaseCriteria;
import com.pkusoft.framework.model.Pager;
import com.pkusoft.framework.model.QueryBuilder;
import com.pkusoft.framework.model.QueryBuilder.CriterionArray;
import com.pkusoft.framework.model.QueryBuilder.QueryCriterion;

/**
 * <p>Web操作工具类</p>
 * 该类的WebApplicationContext，由系统启动时设置。
 * @author tanggj
 *
 */
public class WebUtils {
	private static WebApplicationContext context;
	
	public static void setWebApplicationContext(WebApplicationContext ctx){
		context = ctx;
	}
	
	public static WebApplicationContext getWebApplicationContext(){
		return context;
	}
	
	/**
	 * 根据bean的名称获取bean对象
	 * @param beanName bean名称
	 * @return bean对象
	 */
	public static Object getBean(String beanName){
		return context.getBean(beanName);
	}
	
	/**
	 * 根据bean类型获取bean对象
	 * @param clazz bean类型
	 * @return bean对象
	 */
	public static <T> T getBean(Class<T> clazz){
		return context.getBean(clazz);
	}
	
	/**
	 * SpringMvc下获取request
	 * 
	 * @return
	 */
	public static HttpServletRequest getRequest() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		return request;

	}
	/**
	 * SpringMvc下获取session
	 * 
	 * @return
	 */
	public static HttpSession getSession() {
		HttpSession session = getRequest().getSession();
		return session;

	}
	
	/**
	 * 在用户线程变量中设置用户的数据权限，key值为dataPermit.仅当传入参数不为空时设置. 
	 * <p>注意该方法需要在用户登录后才能调用，需要用到用户线程变量值</p>
	 * @param permitCfgList 数据权限配置列表
	 */
	public static void initUserDataPermit(List<Map<String, Object>> permitCfgList){
		if(!CollectionUtils.isEmpty(permitCfgList)){
			Map<String,List<String>> permitMap = toUserDataPermitMap(permitCfgList);
			UserInfo u = (UserInfo) SecurityUtils.getSubject().getSession().getAttribute(General.AUTH_KEY);
			u.getMap().put("dataPermit", permitMap);
		}
	}
	
	/**
	 * 获取用户所有的数据权限
	 * <p>注意该方法需要在用户登录后才能调用，需要用到用户线程变量值</p>
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private static Map<String,List<String>> getUserDataPermit(){
		Map<String,List<String>> permitMap = (Map<String, List<String>>) User.getValue("dataPermit");
		return permitMap;
	}
	
	/**
	 * 根据配置编码获取用户的数据权限
	 * <p>注意该方法需要在用户登录后才能调用，需要用到用户线程变量值</p>
	 * @param permitCode 配置编码
	 * @return 数据权限列表
	 */
	public static List<String> getUserDataPermit(String permitCode){
		Map<String,List<String>> permitMap = getUserDataPermit();
		if(!CollectionUtils.isEmpty(permitMap)){
			return permitMap.get(permitCode);
		}
		return null;
	}
	
	/**
	 * 根据配置编码获取用户的数据权限SQL条件片段
	 * <p>注意该方法需要在用户登录后才能调用，需要用到用户线程变量值</p>
	 * @param permitCode 配置编码
	 * @return 数据权限列表
	 */
	public static String getUserDataPermitSql(String permitCode){
		StringBuffer buffer = new StringBuffer();
		List<String> list = getUserDataPermit(permitCode);
		if(!CollectionUtils.isEmpty(list)){
			for (int i = 0; i < list.size(); i++) {
				if(i != 0){
					buffer.append(" OR ");
				}
				buffer.append(list.get(i));
			}
		}
		return buffer.toString();
	}
	
	/**
	 * 在查询标准中注入框架的数据权限sql片段
	 * <p>注意该方法需要在用户登录后才能调用，需要用到用户线程变量值</p>
	 * @param permitCode 配置编码
	 * @param criteria
	 */
	public static void setUserDataPermit(String permitCode,Criteria<?> criteria){
		
		String sql = getUserDataPermitSql(permitCode);
		
		if(StringUtils.hasText(sql)){
			List<?> oredCriteria = criteria.getOredCriteria();
			
			// 如果业务开发没设置过条件，则默认设置框架的用户数据权限条件；如果设置过条件，逐个条件加上框架的用户数据权限条件
			if(CollectionUtils.isEmpty(oredCriteria)){
				BaseCriteria condition = new BaseCriteria();
				condition.addCriterion("(" + sql + ")");
				criteria.getOredCriteria().add(condition);
			}else{
				for(Object obj : oredCriteria){
					BaseCriteria condition = (BaseCriteria)obj;
					condition.addCriterion("(" + sql + ")");
					
				}
			}
		}
	}
	
	
	/**
	 * 将用户的数据权限配置列表转化成带值的并且按照配置Code值分类好的数据权限配置Map
	 * <p>注意该方法需要在用户登录后才能调用，需要用到用户线程变量值</p>
	 * @param permitCfgList 数据权限配置列表
	 * @return 数据权限Map
	 */
	public static Map<String, List<String>> toUserDataPermitMap(List<Map<String, Object>> permitCfgList){
		Map<String, List<String>> permit = new HashMap<String,List<String>>();
		for (Map<String, Object> cfg : permitCfgList) {
			String permitCode = (String) cfg.get("PERMIT_CODE");
			String permitValue = replaceUserContext((String) cfg.get("PERMIT_VALUE"));
			
			List<String> typePermit = (List<String>) permit.get(permitCode);
			if(typePermit == null){
				typePermit = new ArrayList<String>();
				permit.put(permitCode, typePermit);
			}
			typePermit.add(permitValue);
		}
		
		return permit;
	}
	
	/**
	 * 替换用户上下文信息
	 * <p>注意该方法需要在用户登录后才能调用，需要用到用户线程变量值</p>
	 * @param str
	 * @return 替换用户上下文变量后的字符串
	 */
	private static String replaceUserContext(String str){
		Pattern p = Pattern.compile("\\$\\{(.*?)\\}");
        Matcher m = p.matcher(str);
        while (m.find()) {
            String param = m.group(1);
            String method = "get"  + param.replaceFirst(param.substring(0, 1),param.substring(0, 1).toUpperCase());
            Object o = reflectUserData(method);
        	if(o == null){
        		str = str.replaceFirst("\\$\\{" + param + "\\}", "");
        	}else if(o instanceof java.lang.String){
        		str = str.replaceFirst("\\$\\{" + param + "\\}", "'" + o + "'");
			}else if(o instanceof java.lang.Long){
				str = str.replaceFirst("\\$\\{" + param + "\\}", "" + o);
			}else if(o instanceof java.util.List){
				String oValue = "";
				if(param.equals("dataUnitList")){
					oValue = (String) User.getValue("txtDataUnitId");
				}else{
					// 若为list，取第一个值，如果为字符串，加上单引号，否则将list转成以逗号相隔的字符串
    				List oList = (List) o;
    				if(oList.size() > 0){
    					if(oList.get(0) instanceof java.lang.String){
    						oValue = StringUtils.collectionToDelimitedString(oList, ",","'","'");
    					}else{
    						oValue = StringUtils.collectionToDelimitedString(oList, ",");
    					}
    				}
				}
				str = str.replaceFirst("\\$\\{" + param + "\\}", "" + oValue);
			}
        }
        return str;
	}
	
	/**
	 * 反射用户数据
	 * <p>注意该方法需要在用户登录后才能调用，需要用到用户线程变量值</p>
	 * @param method
	 * @return 调用方法得到的返回值
	 */
	private static Object reflectUserData(String method){
		try {
			Class<?> c = Class.forName("com.pkusoft.framework.User");
			Method m = c.getMethod(method, null);
			Object o = m.invoke(c, null);
			return o;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	/**
	 * 转换成查询条件对象
	 * @param txtQuery 查询条件字符串，格式如：
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
	public static QueryBuilder toQueryBuilder(String txtQuery){
		try {
			ObjectMapper mapper = new ObjectMapper(); 
			Map<String, Object> map = mapper.readValue(txtQuery, Map.class);
			QueryBuilder qb = new QueryBuilder();
			if(!CollectionUtils.isEmpty(map)){
				String orderBy = (String) map.get("orderByClause");
				if(StringUtils.hasText(orderBy)){
					// 防sql注入
					if(checkSqlInjection(orderBy)){
						throw new IllegalArgumentException("查询条件中不能包含特殊字符");
					}
					qb.setOrderByClause(orderBy);
				}
				Boolean distinct = (Boolean) map.get("distinct");
				if(distinct != null){
					qb.setDistinct(distinct);
				}
				Map<String,Object> pagerMap = (Map<String, Object>) map.get("pager");
				if(!CollectionUtils.isEmpty(pagerMap)){
					qb.setPager(MapUtils.toObject(pagerMap, Pager.class));
				}
				List<?> oredCriteriaMap = (List<?>) map.get("oredCriteria");
				if(!CollectionUtils.isEmpty(oredCriteriaMap)){
					List<CriterionArray> qa = qb.getOredCriteria();
					for (Object c : oredCriteriaMap) {
						CriterionArray ca = new CriterionArray();
						List<QueryCriterion> qc = ca.getCriteria();
						List<Map<String,Object>> arr = (List<Map<String, Object>>) c;
						for (Map<String,Object> cd : arr) {
							qc.add(MapUtils.toObject(cd, QueryCriterion.class));
						}
						qa.add(ca);
					}
				}
			}
			return qb;
		} catch (Exception e) {
			throw new IllegalArgumentException("传入参数不是标准查询条件格式",e);
		}
		
	}
	
	/**
	 * 设置查询条件到查询标准中
	 * @param targetCriteria
	 * @param txtQuery
	 * @return 查询标准
	 */
	public static Criteria<?> setCriteria(Criteria<?> targetCriteria,String txtQuery){
		QueryBuilder qb = toQueryBuilder(txtQuery);
		
		return setCriteria(targetCriteria,qb);
	}
	
	/**
	 * 设置查询条件到查询标准中
	 * @param targetCriteria
	 * @param queryBuilder
	 * @return 查询标准
	 */
	public static Criteria<?> setCriteria(Criteria<?> targetCriteria,QueryBuilder queryBuilder){
		targetCriteria.setDistinct(queryBuilder.isDistinct());
		String srcOrderBy = queryBuilder.getOrderByClause();
		if(StringUtils.hasText(srcOrderBy)){
			targetCriteria.setOrderByClause(srcOrderBy);
		}
		Pager srcPager = queryBuilder.getPager();
		if(srcPager != null){
			targetCriteria.setPager(srcPager);
		}
		
		List<CriterionArray> srcOredCriteria = queryBuilder.getOredCriteria();
		if(!CollectionUtils.isEmpty(srcOredCriteria)){
			List<BaseCriteria> targetOredCriteria = targetCriteria.getOredCriteria();
			for (CriterionArray srcCriterionArray : srcOredCriteria) {
				BaseCriteria targetBc = new BaseCriteria();
				for (QueryCriterion srcQc : srcCriterionArray.getCriteria()) {
					setTargetCriterion(targetBc, srcQc);
				}
				targetOredCriteria.add(targetBc);
			}
		}
		return targetCriteria;
	}
	
	/**
	 * 将页面查询条件转换成查询标准
	 * @param queryBuilder 页面查询条件
	 * @return 查询标准对象
	 */
	public static Criteria<?> toCriteria(QueryBuilder queryBuilder){
		Criteria<BaseCriteria> targetCriteria = new Criteria<BaseCriteria>();
		return setCriteria(targetCriteria,queryBuilder);
	}
	
	/**
	 * 将页面查询条件转换成查询标准
	 * @param txtQuery 页面查询条件
	 * @return 查询标准对象
	 * @see #toQueryBuilder(java.lang.String)
	 */
	public static Criteria<?> toCriteria(String txtQuery){
		QueryBuilder qb = toQueryBuilder(txtQuery);
		return toCriteria(qb);
	}

	/**
	 * 将页面条件设置到查询标准中
	 * @param targetBc 查询标准
	 * @param srcQc 页面条件
	 */
	private static void setTargetCriterion(BaseCriteria targetBc, QueryCriterion srcQc) {
		// 字段对应的java属性名
		String regex = "^[a-zA-Z][a-zA-Z0-9_.]{1,30}$";
		Pattern pattern = Pattern.compile(regex);
		String property = srcQc.getProperty();
		if(!pattern.matcher(property).matches()){
			throw new IllegalArgumentException("查询条件中属性字段含有非法字符");
		}
		
		// 字段名
		String fieldName = "";
		if(property.indexOf(".") != -1){
			String refField = property.substring(0,property.indexOf(".") + 1);
			String txtField = StringUtils.toUnderline(property.substring(property.indexOf(".") + 1)).toUpperCase();
			fieldName = refField + txtField;
		}else{
			fieldName = StringUtils.toUnderline(property).toUpperCase();
		}
		
		// 操作符
		String operator = getOperator(srcQc.getOperator());
		
		if("NULL".equals(operator) || "NOT NULL".equals(operator)){
			targetBc.addCriterion(fieldName + " is " + operator);
		}else if("BETWEEN".equals(operator) || "NOT BETWEEN".equals(operator)){
			Object value = getValue(srcQc.getDatatype(), srcQc.getValue());
			Object value1 = getValue(srcQc.getDatatype(), srcQc.getValue1());
			targetBc.addCriterion(fieldName + " " + operator + " ", value, value1, property);
		}else if("IN".equals(operator) || "NOT IN".equals(operator)){
			// 返回list值
			Object value = getValue(srcQc.getDatatype(), srcQc.getValue(), true);
			targetBc.addCriterion(fieldName + " " + operator + " ", value, property);
		}else{
			Object value = getValue(srcQc.getDatatype(), srcQc.getValue());
			targetBc.addCriterion(fieldName + " " + operator + " ", value, property);
		}
	}
	
	/**
	 * 获取操作符
	 * @param operator
	 * @return
	 */
	private static String getOperator(String operator){
		// 默认操作符为：=
		if(operator == null || operator.trim().length() == 0){
			return "=";
		}
		String allOperator = "|=|!=|<>|>|>=|<|<=|LIKE|NOT LIKE|IN|NOT IN|BETWEEN|NOT BETWEEN|NULL|NOT NULL|";
		operator = operator.trim().toUpperCase();
		if(allOperator.indexOf("|" + operator + "|") == -1){
			throw new IllegalArgumentException("查询条件中操作符不合法");
		}
		return operator;
	}
	
	/**
	 * 获取指定类型的值，注意：以逗号","隔开的值不转为list
	 * @param datatype
	 * @param value
	 * @return 转换成对应类型后的值
	 */
	private static Object getValue(String datatype, String value){
		return getValue(datatype,value,false);
	}
	
			

	/**
	 * 获取指定类型的值
	 * @param datatype
	 * @param value
	 * @param isArray 若为true，返回值将为list。处理以逗号","隔开的值
	 * @return 转换成对应类型后的值
	 */
	private static Object getValue(String datatype, String value, boolean isArray){
		if(value == null){
			throw new IllegalArgumentException("查询条件中存在值为空的条件");
		}
		// 防sql注入
		if(checkSqlInjection(value)){
			throw new IllegalArgumentException("查询条件中不能包含特殊字符");
		}
		
		datatype = datatype.trim().toLowerCase();
		value = value.trim();
		if("1".equals(datatype)){
			try {
				if(isArray){
					List<Long> listValue = new ArrayList<Long>();
					String[] valArray = StringUtils.split(value, ",");
					for (int i = 0; i < valArray.length; i++) {
						listValue.add(Long.parseLong(valArray[i]));
					}
					return listValue;
				}else{
					return Long.parseLong(value);
				}
			} catch (Exception e) {
				throw new IllegalArgumentException("查询条件中存在类型与值不匹配的条件。类型要求为长数型，但传入的值不是合法的长整型数字");
			}
		}else if("3".equals(datatype)){
			try {
				if(isArray){
					List<Date> listValue = new ArrayList<Date>();
					String[] valArray = StringUtils.split(value, ",");
					for (int i = 0; i < valArray.length; i++) {
						Date date = DateTimeUtils.parse(getNumber(valArray[i]), "yyyyMMdd");
						if(date == null){
							throw new Exception("不能正确格式化日期: " + valArray[i]);
						}
						listValue.add(date);
					}
					return listValue;
				}else{
					Date date = DateTimeUtils.parse(getNumber(value), "yyyyMMdd");
					if(date == null){
						throw new Exception("不能正确格式化日期: " + value);
					}
					return date;
				}
			} catch (Exception e) {
				throw new IllegalArgumentException("查询条件中存在类型与值不匹配的条件。类型要求为日期型，但传入的值不是合法的日期型");
			}
		}else if("4".equals(datatype)){
			try {
				if(isArray){
					List<Date> listValue = new ArrayList<Date>();
					String[] valArray = StringUtils.split(value, ",");
					for (int i = 0; i < valArray.length; i++) {
						Date date = DateTimeUtils.parse(getNumber(valArray[i]), "yyyyMMddHHmmss");
						if(date == null){
							throw new Exception("不能正确格式化日期时间: " + valArray[i]);
						}
						listValue.add(date);
					}
					return listValue;
				}else{
					Date date = DateTimeUtils.parse(getNumber(value), "yyyyMMddHHmmss");
					if(date == null){
						throw new Exception("不能正确格式化日期时间: " + value);
					}
					return date;
				}
			} catch (Exception e) {
				throw new IllegalArgumentException("查询条件中存在类型与值不匹配的条件。类型要求为日期时间型，但传入的值不是合法的日期时间型");
			}
		}else if("7".equals(datatype)){
			try {
				if(isArray){
					List<Float> listValue = new ArrayList<Float>();
					String[] valArray = StringUtils.split(value, ",");
					for (int i = 0; i < valArray.length; i++) {
						listValue.add(Float.parseFloat(valArray[i]));
					}
					return listValue;
				}else{
					return Float.parseFloat(value);
				}
			} catch (Exception e) {
				throw new IllegalArgumentException("查询条件中存在类型与值不匹配的条件。类型要求为浮点型，但传入的值不是合法的浮点型数字");
			}
		}else{
			if(isArray){
				String[] valArray = value.split(",");
				return CollectionUtils.arrayToList(valArray);
			}else{
				return value;
			}
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
	
	/**
	 * 只提取数字
	 * @param str 字符串
	 * @return 只含有数字的字符串
	 */
	private static String getNumber(String str){
		StringBuffer buffer = new StringBuffer();
		char []ch = str.toCharArray();    
		for (int i = 0; i < ch.length; i++) {
			if (Character.isDigit(ch[i])) {
				buffer.append(ch[i]);
			}
		}
		return buffer.toString();
	}
	
	/**
	 * 获取资源国际化value值
	 * 
	 * @param arg0  资源key值
	 * @param arg1 资源value参数，即配置中的花括号{0}、{1}等
	 * @param arg2 Locale
	 * @return 资源value值
	 */
	public static String getMessage(String arg0, Object[] arg1, Locale arg2){
		return getWebApplicationContext().getMessage(arg0, arg1, arg2);
	}

	/**
	 * 获取资源国际化value值，Locale选择是根据当前用户的浏览器确定，若不是通过web访问，将使用平台的Locale
	 * 
	 * @param arg0  资源key值
	 * @param arg1 资源value参数，即配置中的花括号{0}、{1}等
	 * @return 资源value值
	 */
	public static String getMessage(String arg0, Object[] arg1){
		return getMessage(arg0, arg1, User.getLocale());
	}
	
	/**
	 * 根据资源国际化key值获取资源国际化value值，该方法获取的value不能含有参数。Locale选择是根据当前用户的浏览器确定，若不是通过web访问，将使用平台的Locale
	 * 
	 * @param arg0  资源key值
	 * @return 资源value值
	 */
	public static String getMessage(String arg0){
		return getMessage(arg0, null, User.getLocale());
	}
}
