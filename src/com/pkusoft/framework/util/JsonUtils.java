package com.pkusoft.framework.util;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.JavaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 处理json的工具类，负责json数据转换成java对象和java对象转换成json
 * 
 * @author tanggj
 * 
 */
public class JsonUtils {
	private static Logger logger = LoggerFactory.getLogger(JsonUtils.class);
	private static final ObjectMapper mapper = new ObjectMapper();
	private static final JsonFactory jsonFactory = new JsonFactory();

	/*
	 * static { MAPPER.configure(Feature.ALLOW_UNQUOTED_FIELD_NAMES, false); }
	 */

	/**
	 * 从一个JSON 对象字符格式中得到一个java对象
	 * 
	 * @param <T>
	 * @param json
	 * @param pojoCalss
	 * @return
	 */
	public static <T> T jsonToBean(String json, Class<T> pojoCalss) {
		try {
			return mapper.readValue(json, pojoCalss);
		} catch (Exception e) {
			logger.error("json字符串转成java对象出现错误", e);
			return null;
		}
	}

	/**
	 * 转换Java Bean 为 json
	 */
	public static String beanToJson(Object o) {
		StringWriter sw = new StringWriter(300);
		JsonGenerator jsonGenerator = null;

		try {
			jsonGenerator = jsonFactory.createJsonGenerator(sw);
			mapper.writeValue(jsonGenerator, o);
			return sw.toString();

		} catch (Exception e) {
			logger.error("java对象转成json字符串出现错误", e);
			return null;
		} finally {
			if (jsonGenerator != null) {
				try {
					jsonGenerator.close();
				} catch (Exception e) {

				}
			}
		}
	}

	/**
	 * 转换Java Bean 为 HashMap
	 */
	public static Map<String, Object> beanToMap(Object o) {
		try {
			return mapper.readValue(beanToJson(o), HashMap.class);
		} catch (Exception e) {
			logger.error("java对象转成map出现错误", e);
			return null;
		}
	}

	/**
	 * 转换Json String 为 HashMap
	 */
	public static Map<String, Object> jsonToMap(String json, boolean collToString) {
		try {
			Map<String, Object> map = mapper.readValue(json, HashMap.class);
			if (collToString) {
				for (Map.Entry<String, Object> entry : map.entrySet()) {
					if (entry.getValue() instanceof Collection
							|| entry.getValue() instanceof Map) {
						entry.setValue(beanToJson(entry.getValue()));
					}
				}
			}
			return map;
		} catch (Exception e) {
			logger.error("json字符串转成map出现错误", e);
			return null;
		}
	}

	/**
	 * List 转换成json
	 * 
	 * @param list
	 * @return
	 */
	public static String listToJson(List<?> list) {
		JsonGenerator jsonGenerator = null;
		StringWriter sw = new StringWriter();
		try {
			jsonGenerator = jsonFactory.createJsonGenerator(sw);
			mapper.writeValue(jsonGenerator, list);
			jsonGenerator.flush();
			return sw.toString();
		} catch (Exception e) {
			logger.error("java对象集合转成json字符串出现错误", e);
			return null;
		} finally {
			if (jsonGenerator != null) {
				try {
					jsonGenerator.flush();
					jsonGenerator.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * json 转List
	 * 
	 * @param json
	 * @return
	 */
	public static List<Map<String, Object>> jsonToList(String json) {
		try {
			if (json != null && !"".equals(json.trim())) {
				JsonParser jsonParse = jsonFactory.createJsonParser(new StringReader(json));

				ArrayList<Map<String, Object>> arrayList = mapper.readValue(jsonParse, ArrayList.class);
				return arrayList;
			} else {
				return null;
			}
		} catch (Exception e) {
			logger.error("json字符串转成map集合出现错误", e);
			return null;
		}
	}
	
	/**
	 * json 转List
	 * @param <T>
	 * 
	 * @param json
	 * @return
	 */
	public static <T> List<T> jsonToList(String json, Class<T> pojoCalss) {
		try {
			if (json != null && !"".equals(json.trim())) {
				JsonParser jsonParse = jsonFactory.createJsonParser(new StringReader(json));
				
				JavaType javaType = getCollectionType(ArrayList.class, pojoCalss); 
				ArrayList<T> arrayList = mapper.readValue(jsonParse, javaType);
				return arrayList;
			} else {
				return null;
			}
		} catch (Exception e) {
			logger.error("json字符串转成java对象集合出现错误", e);
			return null;
		}
	}

	/**
	 * 获取泛型的Collection Type
	 * 
	 * @param collectionClass
	 *            泛型的Collection
	 * @param elementClasses
	 *            元素类
	 * @return JavaType Java类型
	 * @since 1.0
	 */
	public static JavaType getCollectionType(Class<?> collectionClass, Class<?>... elementClasses) {
		return mapper.getTypeFactory().constructParametricType(collectionClass, elementClasses);
	}
	

}
