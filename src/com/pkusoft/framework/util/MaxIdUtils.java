package com.pkusoft.framework.util;

import com.pkusoft.framework.service.MaxIdService;

/**
 * 获取最大编号的工具类，可根据编号类型获取一级编号、二级编号、三级编号
 * @author tanggj
 *
 */
public class MaxIdUtils {
	/**
	 * 最大编号服务类
	 */
	private static MaxIdService maxIdService;
	
	/**
	 * 最大编号服务类
	 * @return maxIdService
	 */
	public static MaxIdService getMaxIdService(){
		if(maxIdService == null){
			maxIdService = WebUtils.getBean(MaxIdService.class);
		}
		return maxIdService;
	}
	/**
	 * 获取A类长整型编号
	 * @param idType 编号类型
	 * @return 当前类型最大编号
	 */
	public static Long getLongMaxIdA(String idType){
		return getMaxIdService().getLongMaxIdA(idType);
	}
	
	/**
	 * 获取A类字符型编号，返回字符串位数会根据SYS_MAX_ID_TYPE表中的id_size配置的位数补足0
	 * @param idType 编号类型
	 * @return 当前类型最大编号
	 */
	public static String getMaxIdA(String idType){
		return getMaxIdService().getMaxIdA(idType);
	}
	
	/**
	 * 获取B类长整型编号
	 * @param idType 编号类型
	 * @param strPara1 一级编号
	 * @return 最大二级编号
	 */
	public static Long getLongMaxIdB(String idType, String strPara1){
		return getMaxIdService().getLongMaxIdB(idType, strPara1);
	}
	
	/**
	 * 获取B类字符型编号，返回字符串位数会根据SYS_MAX_ID_TYPE表中的id_size配置的位数补足0
	 * @param idType 编号类型
	 * @param strPara1 一级编号
	 * @return 最大二级编号
	 */
	public static String getMaxIdB(String idType, String strPara1){
		return getMaxIdService().getMaxIdB(idType, strPara1);
	}
	
	/**
	 * 获取B类字符型编号，一级编号 + 最大二级编号
	 * @param idType 编号类型
	 * @param strPara1 一级编号
	 * @return 一级编号 + 最大二级编号
	 */
	public static String getFullMaxIdB(String idType, String strPara1){
		return getMaxIdService().getFullMaxIdB(idType, strPara1);
	}
	
	/**
	 * 获取C类长整型编号，返回字符串位数会根据SYS_MAX_ID_TYPE表中的id_size配置的位数补足0
	 * @param idType 编号类型
	 * @param strPara1 一级编号
	 * @param strPara2 二级编号
	 * @return 三级最大编号
	 */
	public static Long getLongMaxIdC(String idType, String strPara1, String strPara2){
		return getMaxIdService().getLongMaxIdC(idType, strPara1, strPara2);
	}
	
	/**
	 * 获取C类字符型编号，最大三级编号
	 * @param idType 编号类型
	 * @param strPara1 一级编号
	 * @param strPara2 二级编号
	 * @return 最大三级编号
	 */
	public static String getMaxIdC(String idType, String strPara1, String strPara2){
		return getMaxIdService().getMaxIdC(idType, strPara1, strPara2);
	}
	
	/**
	 * 获取C类字符型编号，返回 一级编号 + 二级编号 + 最大三级编号
	 * @param idType 编号类型
	 * @param strPara1 一级编号
	 * @param strPara2 二级编号
	 * @return 返回 一级编号 + 二级编号 + 最大三级编号
	 */
	public static String getFullMaxIdC(String idType, String strPara1, String strPara2){
		return getMaxIdService().getFullMaxIdC(idType, strPara1, strPara2);
	}
	
}
