package com.pkusoft.framework.service;


/**
 * 单位管理服务接口
 * 
 * @author tanggj
 *
 */
public interface MaxIdService {

	/**
	 * 获取A类长整型编号
	 * @param idType 编号类型
	 * @return 当前类型最大编号
	 */
	Long getLongMaxIdA(String idType);
	
	/**
	 * 获取A类字符型编号，返回字符串位数会根据SYS_MAX_ID_TYPE表中的id_size配置的位数补足0
	 * @param idType 编号类型
	 * @return 当前类型最大编号
	 */
	String getMaxIdA(String idType);
	
	/**
	 * 获取B类长整型编号
	 * @param idType 编号类型
	 * @param strPara1 一级编号
	 * @return 最大二级编号
	 */
	Long getLongMaxIdB(String idType, String strPara1);
	
	/**
	 * 获取B类字符型编号，返回字符串位数会根据SYS_MAX_ID_TYPE表中的id_size配置的位数补足0
	 * @param idType 编号类型
	 * @param strPara1 一级编号
	 * @return 最大二级编号
	 */
	String getMaxIdB(String idType, String strPara1);
	
	/**
	 * 获取B类字符型编号，一级编号 + 最大二级编号
	 * @param idType 编号类型
	 * @param strPara1 一级编号
	 * @return 一级编号 + 最大二级编号
	 */
	String getFullMaxIdB(String idType, String strPara1);
	
	/**
	 * 获取C类长整型编号，返回字符串位数会根据SYS_MAX_ID_TYPE表中的id_size配置的位数补足0
	 * @param idType 编号类型
	 * @param strPara1 一级编号
	 * @param strPara2 二级编号
	 * @return 三级最大编号
	 */
	Long getLongMaxIdC(String idType, String strPara1, String strPara2);
	
	/**
	 * 获取C类字符型编号，最大三级编号
	 * @param idType 编号类型
	 * @param strPara1 一级编号
	 * @param strPara2 二级编号
	 * @return 最大三级编号
	 */
	String getMaxIdC(String idType, String strPara1, String strPara2);
	
	/**
	 * 获取C类字符型编号，返回 一级编号 + 二级编号 + 最大三级编号
	 * @param idType 编号类型
	 * @param strPara1 一级编号
	 * @param strPara2 二级编号
	 * @return 返回 一级编号 + 二级编号 + 最大三级编号
	 */
	String getFullMaxIdC(String idType, String strPara1, String strPara2);
	
}