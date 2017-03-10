package com.pkusoft.framework.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pkusoft.framework.model.DicXmlResult;

/**
 * Map工具类
 */
public class MapUtils extends org.apache.commons.collections.MapUtils {

	private final static Logger logger = LoggerFactory.getLogger(MapUtils.class);

	/**
	 * 去除map的空值记录
	 * @param source
	 * @return 去空值的Map
	 */
	public static Map<String, Object> trimNull(Map<String, Object> source) {
		Map<String, Object> map = new HashMap<String, Object>();
		Set<Map.Entry<String, Object>> set = source.entrySet();
		for(Map.Entry<String, Object> entry : set) {
			if (null!=entry.getValue()) {
				map.put(entry.getKey(), entry.getValue());
			}
		}
		return map;
	}
	
	/**
	 * 去除map的空值记录，string类型的""也将被去除
	 * @param source
	 * @return 去空串的MAP
	 */
	public static Map<String, Object> trimString(Map<String, Object> source) {
		Map<String, Object> map = new HashMap<String, Object>();
		Set<Map.Entry<String, Object>> set = source.entrySet();
		for(Map.Entry<String, Object> entry : set) {
			Object value = entry.getValue();
			if (null != value && !"".equals(value.toString())) {
				map.put(entry.getKey(), entry.getValue());
			}
		}
		return map;
	}
	
	/**
	 * 将Map转成对象
	 * @param <T>
	 * @param map
	 * @param clazz
	 * @return javabean对象
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public static <T> T toObject(Map<String, Object> map, Class<T> clazz) throws InstantiationException, IllegalAccessException {
		T object = clazz.newInstance();
		toObject(clazz, object, map);
		return object;
	}

	/**
	 * 将Map转成对象
	 * @param clazz
	 * @param object
	 * @param map
	 */
	private static void toObject(Class<?> clazz, Object object, Map<String, Object> map) {
		java.lang.reflect.Field[] fields = clazz.getDeclaredFields();
		if (fields != null && fields.length > 0) {
			for (int i = 0; i < fields.length; i++) {
				try {
					Class<?> fieldType = fields[i].getType();
					String fieldName = fields[i].getName();
					Object fieldValue = map.get(fieldName);
					if (fieldValue != null) {
						String setFieldName = "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
						Method method = clazz.getMethod(setFieldName, fieldType);
						if (String.class.equals(fieldValue)) {
							method.invoke(object, fieldValue);
						} else if (Integer.class.equals(fieldType)) {
							method.invoke(object, Integer.valueOf((String)fieldValue));
						} else if (Long.class.equals(fieldType)) {
							method.invoke(object, Long.valueOf((String)fieldValue));
						} else if (Boolean.class.equals(fieldType)) {
							if ("true".equalsIgnoreCase((String)fieldValue)) {
								method.invoke(object, Boolean.TRUE);
							} else {
								method.invoke(object, Boolean.FALSE);
							}
						} else if (Map.class.equals(fieldType)) {
							if (!String.class.equals(fieldValue.getClass())) {
								method.invoke(object, fieldValue);
							}
						} else {
							method.invoke(object, fieldValue);
						}
					}
				} catch (IllegalAccessException e) {
					logger.error(e.getMessage(), e);
				} catch (InvocationTargetException e) {
					logger.error(e.getMessage(), e);
				} catch (SecurityException e) {
					logger.error(e.getMessage(), e);
				} catch (NoSuchMethodException e) {
					logger.error(e.getMessage(), e);
				}
			}
		}
		if (clazz.getSuperclass() != null) {
			toObject(clazz.getSuperclass(), object, map);
		}
	}

	/**
	 * 将列表中的对象转成Map
	 * @param collection
	 * @return map集合
	 */
	@SuppressWarnings("rawtypes")
	public static Collection<Map> toMapList(Collection collection) {
		List<Map> retList = new ArrayList<Map>();
		if (collection != null && !collection.isEmpty()) {
			for (Object object : collection) {
				Map<String, Object> map = new HashMap<String, Object>();
				toMap(object.getClass(), object, map);
				retList.add(map);
			}
		}
		return retList;
	}

	/**
	 * 将对象转成Map对象
	 * @param object
	 * @return map对象
	 */
	public static Map<String, Object> toMap(Object object) {
		Map<String, Object> map = new HashMap<String, Object>();
		toMap(object.getClass(), object, map);
		return map;
	}
	
	/**
	 * 去除属性值为null的字段
	 * @param object beans对象
	 * @return hashmap
	 */
	public static Map<String, Object> toMapTrimNull(Object object) {
		return trimNull(toMap(object));
	}
	
	/**
	 * 转换Map，将属性值为NULL或者""去除
	 * @param object bean对象
	 * @return hashmap
	 */
	public static Map<String, Object> toMapTrimString(Object object) {
		return trimString(toMap(object));
	}
	
	

	/**
	 * 对象转成map
	 * @param clazz
	 * @param object
	 * @param map
	 */
	private static void toMap(Class<?> clazz, Object object, Map<String, Object> map) {
		java.lang.reflect.Field[] fields = clazz.getDeclaredFields();
		if (fields != null && fields.length > 0) {
			for (int i = 0; i < fields.length; i++) {
				try {
					String fieldName = fields[i].getName();
					if (PropertyUtils.isReadable(object, fieldName)){
						Object fieldValue = PropertyUtils.getNestedProperty(object, fieldName);;
						//String fieldValue = BeanUtils.getProperty(object, fieldName);
						/*if (fieldValue != null) {
						}*/
						map.put(fieldName, fieldValue);
					}
				} catch (IllegalAccessException e) {
					logger.error(e.getMessage(), e);
				} catch (InvocationTargetException e) {
					logger.error(e.getMessage(), e);
				} catch (NoSuchMethodException e) {
					logger.error(e.getMessage(), e);
				}
			}
		}
		if (clazz.getSuperclass() != null) {
			toMap(clazz.getSuperclass(), object, map);
		}
	}
	
	/**
	 * 将源对象中的值覆盖到目标对象中
	 * 
	 * @param source 源对象，可为Map、标准的JavaBean
	 * @param target 目标对象，标准的JavaBean
	 */
	@SuppressWarnings("rawtypes")
	public static void apply(Object source, Object target){
		try {
			if (source instanceof Map) {
				Iterator names = ((Map)source).keySet().iterator();
				while (names.hasNext()) {
					String name = (String)names.next();
					if (PropertyUtils.isWriteable(target, name)) {
						Object value = ((Map)source).get(name);
						BeanUtils.setProperty(target, name, value);
					}
				}
			} else /* if (orig is a standard JavaBean) */{
				java.lang.reflect.Field[] fields = source.getClass().getDeclaredFields();
				for (int i = 0; i < fields.length; i++) {
					String name = fields[i].getName();
					if (PropertyUtils.isReadable(source, name) && PropertyUtils.isWriteable(target, name)) {
						Object value = PropertyUtils.getSimpleProperty(source, name);
						PropertyUtils.setSimpleProperty(target, name, value);
					}
				}
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 将列表数据转换成字典XML数据对象
	 * @param list 列表数据
	 * @param codeFieldName 字典code字段名
	 * @param textFieldName 字典text字段名
	 * @return 字典结果XML对象
	 */
	public static DicXmlResult toDicXmlResult(List<?> list,String codeFieldName,String textFieldName){
		try {
			List<DicXmlResult.DicXmlDto> dicList = new ArrayList<DicXmlResult.DicXmlDto>();
			Object source;
			for (int i = 0; i < list.size(); i++) {
				source = list.get(i);
				Object codeValue;
				Object textValue;
				if (source instanceof Map) {
					codeValue = ((Map)source).get(codeFieldName);
					textValue = ((Map)source).get(textFieldName);
				}else{
					codeValue = PropertyUtils.getSimpleProperty(source, codeFieldName);
					textValue = PropertyUtils.getSimpleProperty(source, textFieldName);
				}
				String code = String.valueOf(codeValue);
				String text = String.valueOf(textValue);
				DicXmlResult.DicXmlDto dto = new DicXmlResult.DicXmlDto();
				dto.setCode(code);
				dto.setText(text);
				dto.setSpell(PinyinUtils.getHeadPinyin(text));
				dto.setAspell(PinyinUtils.getPinyin(text));
				
				dicList.add(dto);
			}
			DicXmlResult dxr = new DicXmlResult();
			dxr.setList(dicList);
			
			return dxr;
		} catch (Exception e) {
			throw new RuntimeException("转换字典列表出错", e);
		}
	}

}