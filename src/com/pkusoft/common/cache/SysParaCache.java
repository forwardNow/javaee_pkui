package com.pkusoft.common.cache;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import com.pkusoft.admin.model.SysPara;
import com.pkusoft.admin.model.SysParaCriteria;
import com.pkusoft.admin.model.SysUser;
import com.pkusoft.admin.model.SysUserCriteria;
import com.pkusoft.admin.service.SysParaService;
import com.pkusoft.framework.cache.CacheManager;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.util.WebUtils;

/**
 * 系统参数缓存类
 * @author tanggj
 *
 */
public class SysParaCache {
	private static Object syncObject = new Object();
	private static SysParaCache instance;
	/**
	 * 系统参数缓存名称
	 */
	public final static String CACHE_NAME ="sysParaCache";
	
	private SysParaCache(){
		init();
	}
	
	public static SysParaCache getInstance(){
		if(instance == null){
			instance = new SysParaCache();
		}
		return instance;
	}
	
	private static void init(){
		synchronized(syncObject){
			CacheManager.clear(CACHE_NAME);
			
			ArrayList<SysPara> paraList = getParaListByService();
			for (Iterator<SysPara> it = paraList.iterator(); it.hasNext();) {
				SysPara sysPara = it.next();
				CacheManager.set(CACHE_NAME, sysPara.getParaCode(), sysPara);
			}
		}
	}
	
	/**
	 * 获取系统参数服务类
	 * @return 系统参数服务类
	 */
	private static SysParaService getSysParaService(){
		return (SysParaService) WebUtils.getBean("sysParaService");
	}
	
	/**
	 * 获取系统参数列表
	 * @return 系统参数列表
	 */
	private static ArrayList<SysPara> getParaListByService(){
		ArrayList<SysPara> arrayList= new ArrayList<SysPara>();
		Criteria<SysParaCriteria> criteria = new Criteria<SysParaCriteria>();
		arrayList.addAll(getSysParaService().getListByCriteria(criteria));
		return arrayList;
	}
	
	/**
	 * 获取系统参数
	 * @param id
	 * @return
	 */
	private static SysPara getParaByService(String id){
		return getSysParaService().get(id);
	}
	/**
	 * 根据参数编码缓存参数对象
	 * @param paraCode 参数编码
	 * @param sysPara 参数对象
	 */
	public static void set(SysPara sysPara){
		getInstance();
		
		CacheManager.set(CACHE_NAME, sysPara.getParaCode(), sysPara);
	}
	
	/**
	 * 设置系统参数到缓存
	 * @param paraCode
	 */
	public static void set(String paraCode){
		getInstance();
		
		SysPara sysPara = getParaByService(paraCode);
		CacheManager.set(CACHE_NAME, paraCode, sysPara);
	}
	
	
	
	/**
	 * 根据参数编码从缓存中获取参数对象
	 * @param paraCode 参数编码
	 * @return 参数对象
	 */
	public static SysPara get(String paraCode){
		getInstance();
		
		return CacheManager.get(SysPara.class, CACHE_NAME, paraCode);
	}
	
	/**
	 * 从参数缓存中移除参数
	 * @param paraCode 参数编码
	 */
	public static void remove(String paraCode){
		getInstance();
		
		CacheManager.justEvict(CACHE_NAME, paraCode);
	}
	
	/**
	 * 刷新指定系统参数，重新冲数据库中获取参数对象设置到缓存中
	 * @param paraCode 参数编码
	 */
	public static void refresh(String paraCode){
		getInstance();
		
		SysPara sysPara = getParaByService(paraCode);
		CacheManager.update(CACHE_NAME, paraCode, sysPara);
	}
	
	/**
	 * 刷新所有系统参数
	 */
	public static void refreshAll(){
		init();
	}
	
	/**
	 * 根据系统参数编码获取参数值，若查不到返回null
	 * @param paraCode 参数编码
	 * @return 参数值
	 */
	public static String getSysParaValue(String paraCode){
		Assert.hasText(paraCode);
		
		SysPara sysPara = get(paraCode);
		if(sysPara != null){
			return sysPara.getParaValue();
		}
		return null;
	}
}
