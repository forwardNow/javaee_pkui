/*
 Navicat Oracle Data Transfer

 Source Server         : gdbaweb
 Source Server Version : 112010
 Source Host           : 27.17.3.62
 Source Schema         : PKUWH_GDBAWEB

 Target Server Version : 112010
 File Encoding         : utf-8

 Date: 03/23/2017 14:44:13 PM
*/

-- ----------------------------
--  Table structure for `SYS_RESOURCE`
-- ----------------------------
USE PKUI;
DROP TABLE IF EXISTS `SYS_RESOURCE`;
CREATE TABLE `SYS_RESOURCE` (   
    `RESOURCE_ID` INT(16) NOT NULL COMMENT '资源标识号', 
    `RESOURCE_NAME` VARCHAR(64) NOT NULL COMMENT '资源名称', 
    `RESOURCE_URL` VARCHAR(128) NOT NULL COMMENT '资源路径', 
    `RESOURCE_DESC` VARCHAR(128) NOT NULL COMMENT '资源描述', 
    `RESOURCE_LEVEL` VARCHAR(1) NOT NULL COMMENT '资源级别', 
    `TREE_LEVEL` INT(16) COMMENT '资源树级别', 
    `TREE_PARENTID` INT(16) COMMENT '父菜单编号', 
    `MENU_ID` INT(16) COMMENT '菜单标识号', 
    `ORDER_FLAG` INT(16) COMMENT '资源排序', 
    `RESERVE1` VARCHAR(128) COMMENT '保留字段1', 
    `RESERVE2` VARCHAR(128) COMMENT '保留字段2', 
    `RESERVE3` VARCHAR(128) COMMENT '保留字段3', 
    `RESERVE4` VARCHAR(128) COMMENT '保留字段4', 
    `RESERVE5` VARCHAR(128) COMMENT '保留字段5', 
    `ADD_USER_ID` INT(16) NOT NULL COMMENT '录入用户编号', 
    `ADD_USER_NAME` VARCHAR(30) NOT NULL COMMENT '录入用户姓名', 
    `ADD_TIME` DATE NOT NULL COMMENT '录入时间', 
    `MODIFY_USER_ID` INT(16) COMMENT '修改用户编号', 
    `MODIFY_USER_NAME` VARCHAR(30) COMMENT '修改用户姓名', 
    `MODIFY_TIME` DATETIME COMMENT '修改时间'
    
    ,PRIMARY KEY (`RESOURCE_ID`)
    
)  DEFAULT CHARSET=UTF8 COMMENT='资源表';	


-- ----------------------------
--  Records of `SYS_RESOURCE`
-- ----------------------------
INSERT INTO `SYS_RESOURCE` VALUES ('1', 'SYS_DEPT_LIST', '/admin/sysDeptList', '列表页面。', '0', null, null, '2', '1', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('2', 'SYS_DEPT_LIST_DATA', '/admin/sysDeptListData', '列表数据', '4', null, null, '2', '2', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('3', 'SYS_DEPT_FORM', '/admin/sysDeptForm', '新增、修改单位页面', '4', null, null, '2', '3', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('4', 'SYS_DEPT_SAVE', '/admin/sysDeptSave', '表单数据保存', '4', null, null, '2', '4', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('5', 'SYS_DEPT_DELETE', '/admin/sysDeptDelete', '数据删除', '4', null, null, '2', '5', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('6', 'SYS_DEPT_ADV_QUERY', '/admin/sysDeptAdvQuery', '高级查询页面', '4', null, null, '2', '6', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('7', 'SYS_DEPT_CREATE_DIC', '/admin/sysDeptCreateDic', '生成单位字典', '4', null, null, '2', '7', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('8', 'SYS_DEPT_SET_MAIN_FORM', '/admin/sysDeptSetMainForm', '设置主管单位页面', '4', null, null, '2', '8', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('9', 'SYS_DEPT_ADD_MAIN_SAVE', '/admin/sysDeptAddMainSave', '设置为主管单位', '4', null, null, '2', '9', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('10', 'SYS_SUB_DEPT_LIST_DATA', '/admin/sysSubDeptListData', '查看下级单位', '0', null, null, '2', '10', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('11', 'SYS_DEPT_DIC', '/admin/sysDeptDic', '单位字典', '4', null, null, '2', '11', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('12', 'SYS_DEPT_LEVEL_DIC', '/admin/sysDeptLevelDic', '单位级别字典', '4', null, null, '2', '12', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('13', 'SYS_DEPT_CKECK_INFO', '/admin/sysDeptCheckInfo', '录入单位唯一性验证', '0', null, null, '2', '13', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('14', 'SYS_USER_LIST', '/admin/sysUserList', '用户列表页面', '4', null, null, '3', '14', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('15', 'SYS_USER_LIST_DATA', '/admin/sysUserListData', '用户列表数据', '4', null, null, '3', '15', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('16', 'SYS_USER_FORM', '/admin/sysUserForm', '新增、修改用户页面', '4', null, null, '3', '16', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('17', 'SYS_USER_SAVE', '/admin/sysUserSave', '用户表单数据保存', '4', null, null, '3', '17', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('18', 'SYS_USER_DELETE', '/admin/sysUserAdvQuery', '删除用户', '4', null, null, '3', '18', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('19', 'SYS_USER_RESET_PWD', '/admin/sysUserResetPWD', '重置密码', '4', null, null, '3', '19', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('20', 'SYS_USER_CKECK_INFO', '/admin/sysUserCheckInfo', '用户信息验证', '4', null, null, '3', '20', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('21', 'SYS_ROLE_LIST', '/admin/sysRoleList', '角色页面', '4', null, null, '4', '21', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('22', 'SYS_ROLE_LIST_DATA', '/admin/sysRoleListData', '角色数据', '4', null, null, '4', '22', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('23', 'SYS_ROLE_FORM', '/admin/sysRoleForm', '新增、修改角色页面', '4', null, null, '4', '23', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('24', 'SYS_ROLE_SAVE', '/admin/sysRoleSave', '角色数据保存', '4', null, null, '4', '24', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('25', 'SYS_ROLE_DELETE', '/admin/sysRoleDelete', '删除角色', '4', null, null, '4', '25', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('26', 'SYS_ROLE_CKECK_INFO', '/admin/sysRoleCheckInfo', '角色信息验证', '4', null, null, '4', '26', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('27', 'SYS_ROLE_USER_LIST', '/admin/sysRoleUserList', '用户列表页面', '4', null, null, '4', '27', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('28', 'SYS_ROLE_USER_LIST_DATA', '/admin/sysRoleUserListData', '用户列表数据', '4', null, null, '4', '28', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('29', 'SYS_ROLE_USER_SAVE', '/admin/sysRoleUserSave', '保存', '4', null, null, '4', '29', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('30', 'SYS_ROLE_USER_DELETE', '/admin/sysRoleUserDelete', '删除', '4', null, null, '4', '30', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('31', 'SYS_ROLE_MENU_LIST', '/admin/sysRoleMenuList', '菜单页面', '4', null, null, '4', '31', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('32', 'SYS_ROLE_MENU_LIST_DATA', '/admin/sysRoleMenuListData', '菜单数据', '4', null, null, '4', '32', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('33', 'SYS_ROLE_MENU_SAVE', '/admin/sysRoleMenuSave', '保存', '4', null, null, '4', '33', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('34', 'SYS_ROLE_MENU_DELETE', '/admin/sysRoleMenuDelete', '删除', '4', null, null, '4', '34', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('35', 'SYS_ROLE_RESOUCE_LIST_DATA', '/admin/sysRoleResouceListData', '资源数据', '4', null, null, '4', '35', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('36', 'SYS_ROLE_RESOUCE_FORM', '/admin/sysRoleResouceForm', '新增、修改页面', '4', null, null, '4', '36', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('37', 'SYS_ROLE_RESOUCE_SAVE', '/admin/sysRoleResouceSave', '保存', '4', null, null, '4', '37', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('38', 'SYS_ROLE_RESOUCE_DELETE', '/admin/sysRoleResouceDelete', '删除', '4', null, null, '4', '38', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('39', 'SYS_PARA_LIST', '/admin/sysParaList', '系统参数列表页面', '4', null, null, '5', '39', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('40', 'SYS_PARA_LIST_DATA', '/admin/sysParaListData', '系统参数列表数据', '4', null, null, '5', '40', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('41', 'SYS_PARA_FORM', '/admin/sysParaForm', '新增、修改页面', '4', null, null, '5', '41', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('42', 'SYS_PARA_SAVE', '/admin/sysParaSave', '保存', '4', null, null, '5', '42', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('43', 'SYS_PARA_DELETE', '/admin/sysParaDelete', '删除', '4', null, null, '5', '43', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('44', 'CHECK_SYS_PARA_FORM', '/admin/checksysParaForm', '检查参数名称', '4', null, null, '5', '44', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('45', 'SYS_PARA_UPDATE_FORM', '/admin/sysParaUpdateForm', '修改参数页面', '4', null, null, '5', '45', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('46', 'SYS_RESOURCE_LIST', '/admin/sysResourceList', '资源列表页面', '4', null, null, '7', '46', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('47', 'SYS_RESOURCE_LIST_DATA', '/admin/sysResourceListData', '资源列表数据', '4', null, null, '7', '47', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('48', 'SYS_RESOURCE_MENU', '/admin/sysResourceMenu', '选择菜单页面', '4', null, null, '7', '48', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('49', 'SYS_RESOURCE_FORM', '/admin/sysResourceForm', '新增、修改资源页面', '4', null, null, '7', '49', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('50', 'SYS_RESOURCE_SAVE', '/admin/sysResourceSave', '保存', '4', null, null, '7', '50', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('51', 'SYS_RESOURCE_DELETE', '/admin/sysResourceDelete', '删除', '4', null, null, '7', '51', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('52', 'SYS_RESOURCE_CHECK_NAME', '/admin/sysResourceCheckName', '验证资源名称', '4', null, null, '7', '52', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('53', 'SYS_RESOURCE_CHECK_NAME', '/admin/sysResourceCheckName', '验证资源名称', '4', null, null, '7', '53', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('54', 'SYS_MENU_LIST', '/admin/sysMenuList', '菜单列表页面', '4', null, null, '8', '54', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('55', 'SYS_MENU_LIST_DATA', '/admin/sysMenuListData', '菜单列表数据', '4', null, null, '8', '55', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('56', 'SYS_MENU_TREE_DATA', '/admin/sysMenuTreeData', '菜单树数据', '4', null, null, '8', '56', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('57', 'SYS_MENU_FORM', '/admin/sysMenuForm', '新增、修改菜单页面', '4', null, null, '8', '57', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('58', 'SYS_MENU_ADD', '/admin/sysMenuAdd', '新增', '4', null, null, '8', '58', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('59', 'SYS_MENU_UPDATE', '/admin/sysMenuUpdate', '修改', '4', null, null, '8', '59', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('60', 'SYS_MENU_DELETE', '/admin/sysMenuDelete', '删除', '4', null, null, '8', '60', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('61', 'SYS_LOG_LIST', '/admin/sysLogList', '日志列表页面', '4', null, null, '9', '61', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('62', 'SYS_LOG_LIST_DATA', '/admin/sysLogListData', '日志列表数据', '4', null, null, '9', '62', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('63', 'SYS_LOG_ADV_QUERY', '/admin/sysLogAdvQuery', '高级查询页面', '4', null, null, '9', '63', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('64', 'SYS_LOG_FORM', '/admin/sysLogForm', '新增、修改页面', '4', null, null, '9', '64', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('65', 'SYS_LOG_SAVE', '/admin/sysLogSave', '保存', '4', null, null, '9', '65', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('66', 'SYS_LOG_DELETE', '/admin/sysLogDelete', '删除日志', '4', null, null, '9', '66', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('67', 'SYS_LOG_DELETE_BY_IDS', '/admin/sysLogDeleteByIds', '根据编号删除', '4', null, null, '9', '67', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('68', 'SYS_LOG_DELETE_All', '/admin/sysLogDeleteAll', '删除全部日志', '4', null, null, '9', '68', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('69', 'SYS_DIC_ITEM_LIST', '/admin/sysDicItemList', '条目列表页面', '4', null, null, '6', '69', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('70', 'SYS_DIC_ITEM_LIST_DATA', '/admin/sysDicItemListData', '条目列表数据', '4', null, null, '6', '70', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('71', 'SYS_DIC_ITEM_FORM', '/admin/sysDicItemForm', '新增、修改页面', '4', null, null, '6', '71', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('72', 'SYS_DIC_ITEM_SAVE', '/admin/sysDicItemSave', '保存', '4', null, null, '6', '72', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('73', 'SYS_DIC_ITEM_DELETE', '/admin/sysDicItemDelete', '删除', '4', null, null, '6', '73', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('74', 'SYS_DIC_LIST_LIST', '/admin/sysDicListList', '字典列表页面', '4', null, null, '6', '74', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('75', 'SYS_DIC_LIST_LIST_DATA', '/admin/sysDicListListData', '字典列表数据', '4', null, null, '6', '75', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('76', 'SYS_DIC_LIST_FORM', '/admin/sysDicListForm', '字典新增、修改', '4', null, null, '6', '76', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('78', 'SYS_DIC_LIST_DELETE', '/admin/sysDicListDelete', '字典删除', '4', null, null, '6', '78', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('79', 'SYS_DIC_LIST_ADD', '/admin/sysDicListAdd', '表单数据新增', '4', null, null, '6', '79', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('80', 'CHECK_SYS_DIC_LIST_FORM', '/admin/checksysDicListForm', '修改单位页面', '4', null, null, '6', '80', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('81', 'CHECK_SYS_DIC_ITEM_FORM', '/admin/checksysDicItemForm', '检查字典条目', '4', null, null, '6', '81', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('82', 'SYS_DIC_CREATE_XML_FORM', '/admin/sysDicCreateXmlForm', '生成字典文件', '4', null, null, '6', '82', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('83', 'SYS_DIC_ITEM_UPDATE_FORM', '/admin/sysDicItemUpdateForm', '条目修改页面', '4', null, null, '6', '83', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('84', 'SYS_MAX_ID_TYPE_LIST', '/admin/sysMaxIdTypeList', '编号类型列表页面', '4', null, null, '10', '84', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('85', 'SYS_MAX_ID_TYPE_LIST_DATA', '/admin/sysMaxIdTypeListData', '编号类型列表数据', '4', null, null, '10', '85', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('86', 'SYS_MAX_ID_TYPE_FORM', '/admin/sysMaxIdTypeForm', '新增、修改单位页面', '4', null, null, '10', '86', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('87', 'SYS_MAX_ID_TYPE_SAVE', '/admin/sysMaxIdTypeSave', '表单数据保存', '4', null, null, '10', '87', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('88', 'SYS_MAX_ID_TYPE_DELETE', '/admin/sysMaxIdTypeDelete', '编号类型删除', '4', null, null, '10', '88', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('89', 'SYS_MAX_ID_TYPE_ADD', '/admin/sysMaxIdTypeAdd', '表单数据新增', '4', null, null, '10', '89', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('90', 'SYS_MAX_ID_TYPE_UPDATE_FORM', '/admin/sysMaxIdTypeUpdateForm', '修改页面', '4', null, null, '10', '90', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('91', 'SYS_MAX_ID_LIST', '/admin/sysMaxIdList', '列表页面', '4', null, null, '10', '91', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('92', 'SYS_MAX_ID_LIST_DATA', '/admin/sysMaxIdListData', '列表数据', '4', null, null, '10', '92', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('93', 'SYS_MAX_ID_FORM', '/admin/sysMaxIdForm', '新增、修改单位页面', '4', null, null, '10', '93', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('94', 'SYS_MAX_ID_SAVE', '/admin/sysMaxIdSave', '表单数据保存', '4', null, null, '10', '94', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('95', 'SYS_MAX_ID_ADD', '/admin/sysMaxIdAdd', '表单数据保存', '4', null, null, '10', '95', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('96', 'SYS_MAX_ID_UPDATE_FORM', '/admin/sysMaxIdUpdateForm', '修改表单', '4', null, null, '10', '96', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('97', 'CHECK_SYS_MAX_ID_TYPE_FORM', '/admin/checkSysMaxIdTypeForm', '检查唯一性', '4', null, null, '10', '97', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('98', 'SYS_FUNCTION_LIST', '/admin/sysFunctionList', '功能号列表页面', '4', null, null, '11', '98', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('99', 'SYS_FUNCTION_LIST_DATA', '/admin/sysFunctionListData', '功能号列表数据', '4', null, null, '11', '99', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('100', 'SYS_FUNCTION_FORM', '/admin/sysFunctionForm', '新增、修改页面。', '0', null, null, '11', '100', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('102', 'SYS_FUNCTION_DELETE', '/admin/sysFunctionDelete', '删除', '4', null, null, '11', '102', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('103', 'SYS_FUNCTION_CHECK_CODE', '/admin/checksysFunctionListForm', '查询', '4', null, null, '11', '103', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('104', 'SYS_ERROR_LIST', '/admin/sysErrorListData', '错误号列表页面', '4', null, null, '12', '104', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('105', 'SYS_ERROR_LIST_DATA', '/admin/sysErrorListData', '错误号列表数据', '4', null, null, '12', '105', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('106', 'SYS_ERROR_FORM', '/admin/sysErrorForm', '新增、修改页面', '4', null, null, '12', '106', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('107', 'SYS_ERROR_SAVE', '/admin/sysErrorSave', '表单数据保存', '4', null, null, '12', '107', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('108', 'SYS_ERROR_DELETE', '/admin/sysErrorDelete', '错误号删除', '4', null, null, '12', '108', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('109', 'SYS_ERROR_CREATE_XML_FORM', '/admin/sysErrorCreateXmlForm', '生成错误号字典文件', '4', null, null, '12', '109', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-07-05 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('110', 'XT_QHXXB_LIST', '/xt/xtQhxxbList', '行政区划管理页面', '4', null, null, '119', '110', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-09-01 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('111', 'ZJYW_ZJSL_SLXXB_LIST', '/zjyw/zjywZjslSlxxbList', '列表页面', '4', null, null, '127', '1', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-09-23 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('112', 'ZJYW_ZJSL_SLXXB_QUERY', '/zjyw/zjywZjslSlxxbQuery', '简单查询页面', '4', null, null, '127', '1', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-09-23 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('113', 'ZJYW_ZJSL_SLXXB_FORM', '/zjyw/zjywZjslSlxxbForm', '证件办理页面', '4', null, null, '127', '1', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-09-23 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('114', 'ZJYW_SLXXB_LIST_DATA', '/zjyw/zjywSlxxbListData', '列表页面数据', '4', null, null, '127', '1', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-09-23 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_RESOURCE` VALUES ('115', 'ZJYW_ZJSL_SLXX_SAVE', '/zjyw/zjywZjslSlxxbSave', '受理信息保存', '4', null, null, '127', '1', null, null, null, null, null, '1', '管理员', STR_TO_DATE('2013-09-23 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
COMMIT;



