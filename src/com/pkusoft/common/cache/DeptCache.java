package com.pkusoft.common.cache;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import com.pkusoft.admin.model.SysDept;
import com.pkusoft.admin.model.SysDeptCriteria;
import com.pkusoft.admin.service.SysDeptService;
import com.pkusoft.framework.cache.CacheManager;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.util.WebUtils;

/**
 * 部门缓存
 * @author tanggj
 *
 */
public class DeptCache {
	/** 日志句柄 */
	private static Logger logger = LoggerFactory.getLogger(DeptCache.class);
	
	private static Object syncObject = new Object();
	
	private static DeptCache instance;
	
	/**
	 * 部门缓存名称
	 */
	public final static String CACHE_NAME ="deptCache";
	
	private DeptCache(){
		init();
	}
	
	public static DeptCache getInstance(){
		if(instance == null){
			instance = new DeptCache();
		}
		return instance;
	}
	
	private static void init(){
		synchronized(syncObject){
			CacheManager.clear(CACHE_NAME);
			
			ArrayList<SysDept> deptList = getDeptListByService();
			for (Iterator<SysDept> it = deptList.iterator(); it.hasNext();) {
				SysDept sysDept = it.next();
				
				CacheManager.set(CACHE_NAME, sysDept.getDeptId(), sysDept);
			}
		}
	}
	
	/**
	 * 获取部门服务类
	 * @return 部门服务类
	 */
	private static SysDeptService getSysDeptService(){
		return (SysDeptService) WebUtils.getBean("sysDeptService");
	}
	
	/**
	 * 获取部门列表
	 * @return 部门列表
	 */
	private static ArrayList<SysDept> getDeptListByService(){
		ArrayList<SysDept> arrayList= new ArrayList<SysDept>();
		Criteria<SysDeptCriteria> criteria = new Criteria<SysDeptCriteria>();
		arrayList.addAll(getSysDeptService().getListByCriteria(criteria));
		return arrayList;
	}
	
	/**
	 * 获取部门信息
	 * @param deptId
	 * @return
	 */
	private static SysDept getDeptByService(String deptId){
		return getSysDeptService().get(deptId);
	}
	
	
	/**
	 * 设置部门列表到缓存中
	 * @param deptList 部门列表
	 */
	public static void set(SysDept sysDept){
		getInstance();
		
		CacheManager.set(CACHE_NAME, sysDept.getDeptId(), sysDept);
	}
	
	/**
	 * 设置部门缓存，从数据库中读取数据
	 * @param deptId
	 */
	public static void set(String deptId){
		getInstance();
		
		SysDept sysDept = getDeptByService(deptId);
		if(sysDept != null){
			CacheManager.set(CACHE_NAME, sysDept.getDeptId(), sysDept);
		}else{
			logger.warn("Can't set DeptCahe.Not find SysDept by deptId[{}]", deptId);
		}
	}
	
	/**
	 * 从缓存中获取部门信息，如果缓存中不存在部门，则先刷新缓存再获取
	 * @return 部门列表
	 */
	public static SysDept get(String deptId){
		getInstance();
		
		return CacheManager.get(SysDept.class, CACHE_NAME, deptId);
	}
	
	/**
	 * 从部门缓存中移除字典
	 * @param dicName 字典名称
	 */
	public static void remove(String deptId){
		getInstance();
		CacheManager.justEvict(CACHE_NAME, deptId);
	}
	
	/**
	 * 刷新部门
	 */
	public static void refreshAll(){
		init();
	}
	
	/**
	 * 刷新部门
	 * @param sysDept
	 */
	public static void refresh(SysDept sysDept){
		getInstance();
		
		if(sysDept == null || sysDept.getDeptId() == null){
			logger.warn("Can't refresh cause sysDept is null or sysDept.getDeptId is null. Param:{}", sysDept);
		}else{
			CacheManager.update(CACHE_NAME, sysDept.getDeptId(), sysDept);
		}
	}
	
	/**
	 * @param deptId
	 */
	public static void refresh(String deptId){
		getInstance();
		
		SysDept sysDept = getDeptByService(deptId);
		if(sysDept != null){
			CacheManager.update(CACHE_NAME, sysDept.getDeptId(), sysDept);
		}else{
			logger.warn("not find SysDept by deptId[{}]", deptId);
		}
	}
	
	/**
	 * 从缓存中获取部门列表
	 * @return 部门列表
	 */
	@SuppressWarnings("unchecked")
	public static ArrayList<SysDept> getDeptList(){
		getInstance();
		
		ArrayList<SysDept> list = new ArrayList<SysDept>();
		List<String> deptIdlist = CacheManager.keys(CACHE_NAME);
		for (Iterator<String> it = deptIdlist.iterator(); it.hasNext();) {
			String deptId = it.next();
			list.add(get(deptId));
		}
		return list;
	}
	
	/**
	 * 根据部门名称从部门缓存中查找部门信息
	 * @param deptName 部门名称
	 * @return 部门信息
	 */
	public static SysDept getDeptByDeptName(String deptName){
		Assert.hasText(deptName);
		
		getInstance();
		
		@SuppressWarnings("unchecked")
		List<String> deptIdlist = CacheManager.keys(CACHE_NAME);
		for (Iterator<String> it = deptIdlist.iterator(); it.hasNext();) {
			String deptId = it.next();
			SysDept  dept = get(deptId);
			if(deptName.equals(dept.getDeptName())){
				return dept;
			}
		}
		return null;
	}
	
	/**
	 * 根据部门编号从部门缓存中查找部门信息
	 * @param deptId 部门编号
	 * @return 部门信息
	 */
	public static SysDept getDeptByDeptId(String deptId){
		Assert.hasText(deptId);
		
		return get(deptId);
	}
	
	/**
	 * 根据部门名称从部门缓存中查找部门编号
	 * @param deptName 部门名称
	 * @return 部门ID
	 */
	public static String getDeptIdByDeptName(String deptName){
		SysDept dept = getDeptByDeptName(deptName);
		if(dept != null){
			return dept.getDeptId().toString();
		}
		return null;
	}
	
	/**
	 * 根据部门编号从部门缓存中查找部门名称
	 * @param deptId 部门编号
	 * @return 部门名称
	 */
	public static String getDeptNameByDeptId(String deptId){
		SysDept dept = getDeptByDeptId(deptId);
		if(dept != null){
			return dept.getDeptName();
		}
		
		return null;
	}
	
}
