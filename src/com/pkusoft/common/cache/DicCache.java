package com.pkusoft.common.cache;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import com.pkusoft.admin.model.SysDicItem;
import com.pkusoft.admin.model.SysDicList;
import com.pkusoft.admin.model.SysDicListCriteria;
import com.pkusoft.admin.service.SysDicItemService;
import com.pkusoft.admin.service.SysDicListService;
import com.pkusoft.framework.cache.CacheManager;
import com.pkusoft.framework.model.Criteria;
import com.pkusoft.framework.util.WebUtils;

/**
 * 字典缓存
 * @author tanggj
 *
 */
public class DicCache {
	private static Object syncObject = new Object();
	
	private static DicCache instance;
	/**
	 * 字典缓存名称
	 */
	public final static String CACHE_NAME ="dicCache";
	
	private DicCache(){
		init();
	}
	
	public static DicCache getInstance(){
		if(instance == null){
			instance = new DicCache();
		}
		return instance;
	} 
	
	private static void init(){
		synchronized(syncObject){
			CacheManager.clear(CACHE_NAME);
			
			List<SysDicList> dicList = getDicListByService();
			if(!CollectionUtils.isEmpty(dicList)){
				Iterator<SysDicList> it = dicList.iterator();
				SysDicList sysDicList = null;
				while (it.hasNext()) {
					sysDicList = it.next();
					ArrayList<SysDicItem> dicItemList = getDicItemListByService(sysDicList.getDicName());
					CacheManager.set(CACHE_NAME, sysDicList.getDicName(), dicItemList);
				}
			}
		}
	}
	
	/**
	 * 获取字典条目服务类
	 * @return 字典条目服务类
	 */
	private static SysDicItemService getDicItemService(){
		return (SysDicItemService) WebUtils.getBean("sysDicItemService");
	}
	
	/**
	 * 获取字典列表服务类
	 * @return 字典列表服务类
	 */
	private static SysDicListService getDicListService(){
		return (SysDicListService) WebUtils.getBean("sysDicListService");
	}
	
	/**
	 * 从数据库中获取字典条目列表
	 * @param dicName 字典名称
	 * @return 字典条目列表
	 */
	private static List<SysDicList> getDicListByService(){
		Criteria<SysDicListCriteria> criteria = new Criteria<SysDicListCriteria>();
		return getDicListService().getListByCriteria(criteria);
	}
	
	/**
	 * 从数据库中获取字典条目列表
	 * @param dicName 字典名称
	 * @return 字典条目列表
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static ArrayList<SysDicItem> getDicItemListByService(String dicName){
		ArrayList arrayList= new ArrayList();
		arrayList.addAll(getDicItemService().getListByProperty("dicName", dicName));
		return arrayList;
	}
	
	/**
	 * 根据字典名称缓存字典条目列表
	 * @param dicName 字典名称
	 * @param dicItemList 字典条目
	 */
	public static void set(String dicName, ArrayList<SysDicItem> dicItemList){
		getInstance();
		
		CacheManager.set(CACHE_NAME, dicName, dicItemList);
	}
	
	/**
	 * 根据字典名称从缓存中获取字典条目
	 * @param dicName 字典名称
	 * @return 字典条目列表
	 */
	@SuppressWarnings("unchecked")
	public static ArrayList<SysDicItem> get(String dicName){
		getInstance();
		
		Object item = CacheManager.get(CACHE_NAME, dicName);
		return (ArrayList<SysDicItem>) item;
	}
	
	/**
	 * 从字典缓存中移除字典
	 * @param dicName 字典名称
	 */
	public static void remove(String dicName){
		getInstance();
		
		CacheManager.justEvict(CACHE_NAME, dicName);
	}
	
	/**
	 * 刷新指定字典，重新冲数据库中获取字典条目设置到缓存中
	 * @param dicName 字典名称
	 */
	public static void refresh(String dicName){
		getInstance();
		
		synchronized(syncObject){
			ArrayList<SysDicItem> list = getDicItemListByService(dicName);
			CacheManager.update(CACHE_NAME, dicName, list);
		}
	}
	
	/**
	 * 刷新所有字典
	 */
	public static void refreshAll(){
		getInstance();
	
		List<SysDicList> dicList = getDicListByService();
		if(!CollectionUtils.isEmpty(dicList)){
			Iterator<SysDicList> it = dicList.iterator();
			SysDicList sysDicList = null;
			while (it.hasNext()) {
				sysDicList = it.next();
				refresh(sysDicList.getDicName());
			}
		}
	}
	
	/**
	 * 获得指定字典中的字典内容对应的字典编码，若没有匹配返回null
	 * @param dicName 字典名称
	 * @param dicText 字典条目内容
	 * @return
	 */
	public static String getDicCode(String dicName, String dicText){
		Assert.hasText(dicName);
		Assert.hasText(dicText);
		
		ArrayList<SysDicItem> itemList = get(dicName);
		if(itemList != null){
			Iterator<SysDicItem> it = itemList.iterator();
			SysDicItem  sysDicItem = null;
			while (it.hasNext()){
				sysDicItem = it.next();
				if(dicText.equalsIgnoreCase(sysDicItem.getItemValue())){
					return sysDicItem.getItemCode();
				}
			}
		}
		return null;
	}
	
	/**
	 * 获得指定字典中的字典编码对应的字典内容，若没有匹配返回null
	 * @param dicName 字典名称
	 * @param dicCode 字典条目编码
	 * @return
	 */
	public static String getDicText(String dicName, String dicCode){
		Assert.hasText(dicName);
		Assert.hasText(dicCode);
		
		ArrayList<SysDicItem> itemList = get(dicName);
		if(itemList != null){
			Iterator<SysDicItem> it = itemList.iterator();
			SysDicItem  sysDicItem = null;
			while (it.hasNext()){
				sysDicItem = it.next();
				if(dicCode.equalsIgnoreCase(sysDicItem.getItemCode())){
					return sysDicItem.getItemValue();
				}
			}
		}
		return null;
	}
}
