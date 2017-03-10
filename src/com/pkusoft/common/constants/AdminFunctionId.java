package com.pkusoft.common.constants;

/**
 * 系统管理功能号常量定义
 * @author tanggj
 *
 */
public class AdminFunctionId {
	/**
	 * 单位管理：单位信息查询
	 */
	public final static int SYS_DEPT_LIST_DATA = 100101;
	
	/**
	 * 单位管理：保存信息
	 */
	public final static int SYS_DEPT_SAVE = 100102;
	
	/**
	 * 单位管理：新增单位
	 */
	public final static int SYS_DEPT_SAVE_ADD = 100103;
	
	/**
	 * 单位管理：修改单位
	 */
	public final static int SYS_DEPT_SAVE_UPDATE = 100104;
	
	/**
	 * 单位管理：删除单位
	 */
	public final static int SYS_DEPT_DELETE = 100105;
	
	/**
	 * 单位管理：设置主管单位
	 */
	public final static int SYS_DEPT_ADD_MAIN = 100106;
	
	/**
	 * 单位管理：生成单位字典
	 */
	public final static int SYS_DEPT_CREATE_DIC = 100107;
	
	/**
	 * 单位管理：唯一性验证
	 */
	public final static int SYS_DEPT_CKECK_INFO = 100108;
	
	/**
	 * 用户管理:用户信息查询
	 */
	public final static int SYS_USER_LIST_DATA = 100201;
	
	/**
	 * 用户管理:用户信息保存
	 */
	public final static int SYS_USER_SAVE = 100202;
	
	/**
	 * 用户管理:删除用户
	 */
	public final static int SYS_USER_DELETE = 100203;
	
	/**
	 * 用户管理:重置密码
	 */
	public final static int SYS_USER_RESET_PWD = 100204;
	
	/**
	 * 用户管理:唯一性验证
	 */
	public final static int SYS_USER_CKECK_INFO = 100205;
	
	/**
	 * 角色管理:角色数据查询
	 */
	public final static int SYS_ROLE_LIST_DATA = 100301;
	
	/**
	 * 角色管理:保存角色信息
	 */
	public final static int SYS_ROLE_SAVE = 100302;
	
	/**
	 * 角色管理:增加角色
	 */
	public final static int SYS_ROLE_SAVE_ADD = 100303;
	
	/**
	 * 角色管理:修改角色
	 */
	public final static int SYS_ROLE_SAVE_UPDATE = 100304;
	
	/**
	 * 角色管理:删除角色
	 */
	public final static int SYS_ROLE_DELETE = 100305;

	/**
	 * 角色管理:角色唯一性验证
	 */
	public final static int SYS_ROLE_CKECK_INFO = 100305;
	
	/**
	 * 菜单管理 ：菜单数据查询
	 */
	public final static int SYS_MENU_LIST_DATA = 100401;

	/**
	 * 菜单管理 ：菜单树数据查询(编号查询)
	 */
	public final static int SYS_MENU_TREE_DATA = 100402;

	/**
	 * 菜单管理： 新增
	 */
	public final static int SYS_MENU_ADD = 100403;

	/**
	 * 菜单管理 ：修改
	 */
	public final static int SYS_MENU_UPDATE = 100404;

	/**
	 * 菜单管理 ：删除
	 */
	public final static int SYS_MENU_DELETE = 100405;

	/**
	 * 资源管理 ： 资源数据查询
	 */
	public final static int SYS_RESOURCE_LIST_DATA = 100501;
	
	/**
	 * 资源管理 ： 资源数据查询
	 */
	public final static int SYS_RESOURCE_SAVE = 100502;

	/**
	 * 资源管理 ：新增
	 */
	public final static int SYS_RESOURCE_ADD = 100503;

	/**
	 * 资源管理：修改
	 */
	public final static int SYS_RESOURCE_UPDATE = 100504;

	/**
	 * 资源管理 ：删除
	 */
	public final static int SYS_RESOURCE_DELETE = 100505;
	
	/**
	 * 系统参数：信息查询
	 */
	public final static int SYS_PARA_LIST_DATA = 100601;
	
	/**
	 * 系统参数：新增参数
	 */
	public final static int SYS_PARA_ADD = 100602;	
	
	/**
	 * 系统参数：修改参数
	 */
	public final static int SYS_PARA_UPDATE = 100603;	
	
	/**
	 * 系统参数：删除参数
	 */
	public final static int SYS_PARA_DELETE = 100604;
	
	/**
	 * 系统参数：参数名称唯一性验证
	 */
	public final static int CHECK_SYS_PARA = 100605;
	
	/**
	 * 字典管理：字典信息查询
	 */
	public final static int SYS_DIC_LIST_LIST_DATA = 100701;		
	
	/**
	 * 字典管理：新增字典
	 */
	public final static int SYS_DIC_LIST_ADD = 100702;		
	
	/**
	 * 字典管理：修改字典
	 */
	public final static int SYS_DIC_LIST_UPDATE = 100703;	
	
	/**
	 * 字典管理：删除字典
	 */
	public final static int SYS_DIC_LIST_DELETE = 100704;	
	
	/**
	 * 字典管理：生成字典文件
	 */
	public final static int SYS_DIC_LIST_XML_FILE = 100705;		

	/**
	 * 字典管理：查询字典条目
	 */
	public final static int SYS_DIC_ITEM_LIST_DATA = 100706;		
	
	/**
	 * 字典管理：增加字典条目
	 */
	public final static int SYS_DIC_ITEM_ADD = 100707;	
	
	/**
	 * 字典管理：修改字典条目
	 */
	public final static int SYS_DIC_ITEM_UPDATE = 100708;	
	
	/**
	 * 字典管理：删除字典条目
	 */
	public final static int SYS_DIC_ITEM_DELETE = 100709;	
	
	/**
	 * 字典管理：字典名称唯一性验证
	 */
	public final static int CHECK_SYS_DIC_LIST_DATA = 100710;	
	
	/**
	 * 字典管理：字典条目值唯一性验证
	 */
	public final static int CHECK_SYS_DIC_ITEM_DATA = 100711;	

	/**
	 * 日志管理 ：日志列表查询
	 */
	public final static int SYS_LOG_LIST_DATA = 100801;

	/**
	 * 日志管理 ：高级查询
	 */
	public final static int SYS_LOG_ADV_QUERY_DATA = 100802;
	
	/**
	 * 日志管理 ：删除全部日志
	 */
	public final static int SYS_LOG_DELETE_All = 100803;
	
	/**
	 * 日志管理 ：条件删除日志
	 */
	public final static int SYS_LOG_DELETE = 100804;
	
	/**
	 * 功能号管理：功能号查询
	 */
	public final static int SYS_FUNCTION_LIST_DATA = 101001;
	
	/**
	 * 功能号管理：增加功能号
	 */
	public final static int SYS_FUNCTION_ADD = 101002;
	
	/**
	 * 功能号管理：修改功能号
	 */
	public final static int SYS_FUNCTION_UPDATE = 101003;
	
	/**
	 * 功能号管理：删除功能号
	 */
	public final static int SYS_FUNCTION_DELETE = 101004;
	
	/**
	 * 功能号管理：功能号唯一性检查
	 */
	public final static int SYS_FUNCTION_CODE_CHECK = 101005;
	
	/**
	 * 功能号管理：生成功能号字典
	 */
	public final static int SYS_FUNCTION_CREATE_DIC = 101006;
	
	/**
	 *错误号管理：错误号查询
	 */
	public final static int SYS_ERROR_LIST_DATA = 101101;
	
	/**
	 * 错误号管理：新增错误号
	 */
	public final static int SYS_ERROR_ADD = 101102;
	
	/**
	 * 错误号管理：修改错误号
	 */
	public final static int SYS_ERROR_UPDATE = 101103;
	
	/**
	 * 错误号管理：删除错误号
	 */
	public final static int SYS_ERROR_DELETE = 101104;
	
	/**
	 * 错误号管理：错误号唯一性检查
	 */
	public final static int SYS_ERROR_CODE_CHECK = 101105;
	
	/**
	 * 错误号管理：生成错误号字典
	 */
	public final static int SYS_ERROR_CREATE_DIC = 101106;
	
	/**
	 * 编号管理：编号类型信息查询
	 */
	public final static int SYS_MAX_ID_TYPE_DATA = 100901;
	
	/**
	 * 编号管理：新增编号类型
	 */
	public final static int SYS_MAX_ID_TYPE_ADD = 100902;
	
	/**
	 * 编号管理：修改编号类型
	 */
	public final static int SYS_MAX_ID_TYPE_UPDATE = 100903;
	
	/**
	 * 编号管理：删除编号类型
	 */
	public final static int SYS_MAX_ID_TYPE_DELETE = 100904;
	
	/**
	 * 编号管理：最大编号信息查询
	 */
	public final static int SYS_MAX_ID_DATA = 100905;
	
	/**
	 * 编号管理：新增最大编号类
	 */
	public final static int SYS_MAX_ID_ADD = 100906;
	
	/**
	 * 编号管理：修改最大编号
	 */
	public final static int SYS_MAX_ID_UPDATE = 100907;
	
	/**
	 * 编号管理：删除最大编号
	 */
	public final static int SYS_MAX_ID_DELETE = 100908;
	
}
