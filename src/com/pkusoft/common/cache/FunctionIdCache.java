package com.pkusoft.common.cache;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.util.Assert;

import com.pkusoft.admin.model.SysFunction;
import com.pkusoft.admin.model.SysFunctionCriteria;
import com.pkusoft.admin.service.SysFunctionService;
import com.pkusoft.framework.cache.CacheManager;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.util.WebUtils;

/**
 * 功能号缓存类
 * @author tanggj
 *
 */
public class FunctionIdCache {
	private static Object syncObject = new Object();
	private static FunctionIdCache instance;
	/**
	 * 功能号缓存名称
	 */
	public final static String CACHE_NAME ="functionIdCache";
	
	private FunctionIdCache(){
		init();
	}
	
	public static FunctionIdCache getInstance(){
		if(instance == null){
			instance = new FunctionIdCache();
		}
		return instance;
	}
	
	private static void init(){
		synchronized(syncObject){
			CacheManager.clear(CACHE_NAME);
			
			ArrayList<SysFunction> functionList = getFunctionListByService();
			for (Iterator<SysFunction> it = functionList.iterator(); it.hasNext();) {
				SysFunction sysFunction = it.next();
				CacheManager.set(CACHE_NAME, sysFunction.getFunctionCode(), sysFunction);
			}
		}
	}
	
	/**
	 * 获取功能号服务类
	 * @return 功能号服务类
	 */
	public static SysFunctionService getFunctionService(){
		return (SysFunctionService) WebUtils.getBean("sysFunctionService");
	}
	
	/**
	 * 获取功能号列表
	 * @return 功能号列表
	 */
	private static ArrayList<SysFunction> getFunctionListByService(){
		ArrayList<SysFunction> arrayList= new ArrayList<SysFunction>();
		Criteria<SysFunctionCriteria> criteria = new Criteria<SysFunctionCriteria>();
		arrayList.addAll(getFunctionService().getListByCriteria(criteria));
		return arrayList;
	}
	
	/**
	 * 获取功能号信息
	 * @param functionCode
	 * @return
	 */
	private static SysFunction getFunctionByService(String functionCode){
		return getFunctionService().getByProperty("functionCode", functionCode);
	} 
	
	/**
	 * 根据功能号缓存错误对象
	 * @param functionCode 功能号
	 * @param sysFunction 错误对象
	 */
	public static void set(SysFunction sysFunction){
		getInstance();
		
		CacheManager.set(CACHE_NAME, sysFunction.getFunctionCode(), sysFunction);
	}
	
	/**
	 * 设置功能号到缓存中
	 * @param functionCode
	 */
	public static void set(String functionCode){
		getInstance();
		
		SysFunction sysFunction = getFunctionByService(functionCode);
		CacheManager.set(CACHE_NAME, functionCode, sysFunction);
	}
	
	/**
	 * 根据功能号从缓存中获取错误对象
	 * @param functionCode 功能号
	 * @return 错误对象
	 */
	public static SysFunction get(String functionCode){
		getInstance();
		
		return CacheManager.get(SysFunction.class, CACHE_NAME, functionCode);
	}
	
	/**
	 * 从错误缓存中移除错误
	 * @param functionCode 功能号
	 */
	public static void remove(String functionCode){
		getInstance();
		
		CacheManager.justEvict(CACHE_NAME, functionCode);
	}
	
	/**
	 * 刷新指定功能号，重新冲数据库中获取错误对象设置到缓存中
	 * @param functionCode 功能号
	 */
	public static void refresh(String functionCode){
		getInstance();
		
		SysFunction sysFunction = getFunctionByService(functionCode);
		CacheManager.update(CACHE_NAME, functionCode, sysFunction);
	}
	
	/**
	 * 刷新所有功能号
	 */
	public static void refreshAll(){
		init();
	}
	
	/**
	 * 根据功能号编码获取错误信息，若查不到返回null
	 * @param functionCode 功能号
	 * @return 错误信息
	 */
	public static String getFunctionName(String functionCode){
		Assert.hasText(functionCode);
		
		SysFunction sysFunction = get(functionCode);
		if(sysFunction != null){
			return sysFunction.getFunctionName();
		}
		return null;
	}
}
