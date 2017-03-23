package com.pkusoft.common.cache;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.util.Assert;

import com.pkusoft.admin.model.SysError;
import com.pkusoft.admin.model.SysErrorCriteria;
import com.pkusoft.admin.service.SysErrorService;
import com.pkusoft.framework.cache.CacheManager;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.util.WebUtils;

/**
 * 错误号缓存类
 * @author tanggj
 *
 */
public class ErrorCodeCache {
	private static Object syncObject = new Object();
	private static ErrorCodeCache instance;
	/**
	 * 错误号缓存名称
	 */
	public final static String CACHE_NAME ="errorCodeCache";
	
	private ErrorCodeCache(){
		init();
	}
	
	public static ErrorCodeCache getInstance(){
		if(instance == null){
			instance = new ErrorCodeCache();
		}
		return instance;
	}
	
	private static void init(){
		synchronized(syncObject){
			CacheManager.clear(CACHE_NAME);
			
			ArrayList<SysError> errorList = getErrorListByService();
			for (Iterator<SysError> it = errorList.iterator(); it.hasNext();) {
				SysError sysError = it.next();
				CacheManager.set(CACHE_NAME, sysError.getErrorCode(), sysError);
			}
		}
	}
	
	/**
	 * 获取错误号服务类
	 * @return 错误号服务类
	 */
	public static SysErrorService getErrorCodeService(){
		return (SysErrorService) WebUtils.getBean("sysErrorService");
	}
	
	/**
	 * 获取错误号列表
	 * @return 错误号列表
	 */
	private static ArrayList<SysError> getErrorListByService(){
		ArrayList<SysError> arrayList= new ArrayList<SysError>();
		Criteria<SysErrorCriteria> criteria = new Criteria<SysErrorCriteria>();
		arrayList.addAll(getErrorCodeService().getListByCriteria(criteria));
		return arrayList;
	}
	
	/**
	 * 获取错误号信息
	 * @param errorCode
	 * @return
	 */
	private static SysError getErrorByService(String errorCode){
		return getErrorCodeService().getByProperty("errorCode", errorCode);
	} 
	
	/**
	 * 根据错误号缓存错误对象
	 * @param errorCode 错误号
	 * @param sysError 错误对象
	 */
	public static void set(SysError sysError){
		getInstance();
		
		CacheManager.set(CACHE_NAME, sysError.getErrorCode(), sysError);
	}
	
	/**
	 * 设置错误号到缓存中
	 * @param errorCode
	 */
	public static void set(String errorCode){
		getInstance();
		
		SysError sysError = getErrorByService(errorCode);
		CacheManager.set(CACHE_NAME, errorCode, sysError);
	}
	
	/**
	 * 根据错误号从缓存中获取错误对象
	 * @param errorCode 错误号
	 * @return 错误对象
	 */
	public static SysError get(String errorCode){
		getInstance();
		
		return CacheManager.get(SysError.class, CACHE_NAME, errorCode);
	}
	
	/**
	 * 从错误缓存中移除错误
	 * @param errorCode 错误号
	 */
	public static void remove(String errorCode){
		getInstance();
		
		CacheManager.justEvict(CACHE_NAME, errorCode);
	}
	
	/**
	 * 刷新指定错误号，重新冲数据库中获取错误对象设置到缓存中
	 * @param errorCode 错误号
	 */
	public static void refresh(String errorCode){
		getInstance();
		
		SysError sysError = getErrorByService(errorCode);
		CacheManager.update(CACHE_NAME, errorCode, sysError);
	}
	
	/**
	 * 刷新所有错误号
	 */
	public static void refreshAll(){
		init();
	}
	
	/**
	 * 根据错误号编码获取错误信息，若查不到返回null
	 * @param errorCode 错误号
	 * @return 错误信息
	 */
	public static String getErrorInfo(String errorCode){
		Assert.hasText(errorCode);
		
		SysError sysError = get(errorCode);
		if(sysError != null){
			return sysError.getErrorInfo();
		}
		return null;
	}
}
