package com.pkusoft.common.cache;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import com.pkusoft.admin.model.SysUser;
import com.pkusoft.admin.model.SysUserCriteria;
import com.pkusoft.admin.service.SysUserService;
import com.pkusoft.framework.cache.CacheManager;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.util.WebUtils;

/**
 * 用户缓存
 * @author tanggj
 *
 */
public class UserCache {
	/** 日志句柄 */
	private static Logger logger = LoggerFactory.getLogger(UserCache.class);
	
	private static Object syncObject = new Object();
	
	private static UserCache instance;
	
	/**
	 * 用户缓存名称
	 */
	public final static String CACHE_NAME ="userCache";
	
	private UserCache(){
		init();
	}
	
	public static UserCache getInstance(){
		if(instance == null){
			instance = new UserCache();
		}
		return instance;
	}
	
	private static void init(){
		synchronized(syncObject){
			CacheManager.clear(CACHE_NAME);
			
			ArrayList<SysUser> userList = getUserListByService();
			for (Iterator<SysUser> it = userList.iterator(); it.hasNext();) {
				SysUser sysUser = it.next();
				CacheManager.set(CACHE_NAME, sysUser.getUserId(), sysUser);
			}
		}
	}
	
	/**
	 * 获取用户服务类
	 * @return 用户服务类
	 */
	private static SysUserService getSysUserService(){
		return (SysUserService) WebUtils.getBean("sysUserService");
	}
	
	/**
	 * 获取用户列表
	 * @return 用户列表
	 */
	private static ArrayList<SysUser> getUserListByService(){
		ArrayList<SysUser> arrayList= new ArrayList<SysUser>();
		Criteria<SysUserCriteria> criteria = new Criteria<SysUserCriteria>();
		arrayList.addAll(getSysUserService().getListByCriteria(criteria));
		return arrayList;
	}
	
	/**
	 * 获取用户信息
	 * @param userId
	 * @return
	 */
	private static SysUser getUserByService(Long userId){
		return getSysUserService().get(userId);
	}
	
	
	/**
	 * 设置用户列表到缓存中
	 * @param userList 用户列表
	 */
	public static void set(SysUser sysUser){
		getInstance();
		
		if(sysUser == null || sysUser.getUserId() == null){
			logger.warn("Can't set UserCache. SysUser or SysUser.userId can't be null. param:{}", sysUser);
		}else{
			CacheManager.set(CACHE_NAME, sysUser.getUserId(), sysUser);
		}
	}
	
	/**
	 * 设置用户缓存，将根据用户id从数据库中查找刷新
	 * @param userId
	 */
	public static void set(Long userId){
		getInstance();
		
		SysUser sysUser = getUserByService(userId);
		if(sysUser != null){
			CacheManager.set(CACHE_NAME, sysUser.getUserId(), sysUser);
		}else{
			logger.warn("Can't set UserCache.Not find SysUser by userId[{}]", sysUser);
		}
	}
	
	
	/**
	 * 从缓存中获取用户信息，如果缓存中不存在用户，则先刷新缓存再获取
	 * @return 用户列表
	 */
	public static SysUser get(Long userId){
		getInstance();
		
		return CacheManager.get(SysUser.class, CACHE_NAME, userId);
	}
	
	/**
	 * 从用户缓存中移除字典
	 * @param dicName 字典名称
	 */
	public static void remove(Long userId){
		getInstance();
		
		CacheManager.justEvict(CACHE_NAME, userId);
	}
	
	/**
	 * 刷新所有用户
	 */
	public static void refreshAll(){
		init();
	}
	
	/**
	 * 刷新用户
	 * @param sysUser
	 */
	public static void refresh(SysUser sysUser){
		getInstance();
		
		if(sysUser == null || sysUser.getUserId() == null){
			logger.warn("Can't refresh cause sysUser is null or sysUser.getUserId is null. Param:{}", sysUser);
		}else{
			CacheManager.update(CACHE_NAME, sysUser.getUserId(), sysUser);
		}
	}
	
	/**
	 * @param userId
	 */
	public static void refresh(Long userId){
		getInstance();
		
		SysUser sysUser = getUserByService(userId);
		if(sysUser != null){
			CacheManager.update(CACHE_NAME, sysUser.getUserId(), sysUser);
		}else{
			logger.warn("not find SysUser by userId[{}]", userId);
		}
	}
	
	/**
	 * 从缓存中获取用户列表
	 * @return 用户列表
	 */
	@SuppressWarnings("unchecked")
	public static ArrayList<SysUser> getUserList(){
		getInstance();
		
		ArrayList<SysUser> list = new ArrayList<SysUser>();
		List<Long> userIdlist = CacheManager.keys(CACHE_NAME);
		for (Iterator<Long> it = userIdlist.iterator(); it.hasNext();) {
			Long userId = it.next();
			list.add(get(userId));
		}
		return list;
	}
	
	/**
	 * 根据用户名称从用户缓存中查找用户信息
	 * @param userName 用户名称
	 * @return 用户信息
	 */
	public static SysUser getUserByUserName(String userName){
		Assert.hasText(userName);
		
		getInstance();
		
		@SuppressWarnings("unchecked")
		List<Long> userIdlist = CacheManager.keys(CACHE_NAME);
		for (Iterator<Long> it = userIdlist.iterator(); it.hasNext();) {
			Long userId = it.next();
			SysUser  user = get(userId);
			if(userName.equals(user.getUserName())){
				return user;
			}
		}
		return null;
	}
	
	/**
	 * 根据用户编号从用户缓存中查找用户信息
	 * @param userId 用户编号
	 * @return 用户信息
	 */
	public static SysUser getUserByUserId(Long userId){
		Assert.notNull(userId);
		
		return get(userId);
	}
	
	/**
	 * 根据登录名从用户缓存中查找用户信息
	 * @param loginName 登录名
	 * @return 用户信息
	 */
	public static SysUser getUserByLoginName(String loginName){
		Assert.notNull(loginName);
		
		getInstance();
		
		@SuppressWarnings("unchecked")
		List<Long> userIdlist = CacheManager.keys(CACHE_NAME);
		for (Iterator<Long> it = userIdlist.iterator(); it.hasNext();) {
			Long userId = it.next();
			SysUser  user = get(userId);
			if(loginName.equals(user.getLoginName())){
				return user;
			}
		}
		return null;
	}
	
	/**
	 * 根据用户名称从用户缓存中查找用户编号
	 * @param userName 用户名称
	 * @return 用户ID
	 */
	public static Long getUserIdByUserName(String userName){
		SysUser user = getUserByUserName(userName);
		if(user != null){
			return user.getUserId();
		}
		return null;
	}
	
	/**
	 * 根据用户编号从用户缓存中查找用户名称
	 * @param userId 用户编号
	 * @return 用户名称
	 */
	public static String getUserNameByUserId(Long userId){
		SysUser user = getUserByUserId(userId);
		if(user != null){
			return user.getUserName();
		}
		
		return null;
	}
	
}
