/*
 Navicat Oracle Data Transfer

 Source Server         : gdbaweb
 Source Server Version : 112010
 Source Host           : 27.17.3.62
 Source Schema         : PKUWH_GDBAWEB

 Target Server Version : 112010
 File Encoding         : utf-8

 Date: 03/10/2017 15:10:44 PM
*/

-- ----------------------------
--  Table structure for `SYS_MENU`
-- ----------------------------

USE PKUI;

DROP TABLE IF EXISTS `SYS_MENU`;
CREATE TABLE `SYS_MENU` (   
    `MENU_ID` INT(16) NOT NULL COMMENT '菜单标识号', 
    `MENU_NAME` VARCHAR(64) NOT NULL COMMENT '菜单名称', 
    `MENU_URL` VARCHAR(200) COMMENT '链接路径', 
    `ICON` VARCHAR(30) COMMENT '图标', 
    `MENU_LEVEL` VARCHAR(1) COMMENT '菜单等级', 
    `TREE_LEVEL` INT(16) NOT NULL COMMENT '菜单树等级', 
    `TREE_PARENTID` INT(16) COMMENT '父菜单编号', 
    `VISIABLE` VARCHAR(1) NOT NULL COMMENT '是否可用', 
    `EXPAND` VARCHAR(1) NOT NULL COMMENT '是否展开', 
    `ORDER_FLAG` INT(16) NOT NULL COMMENT '菜单顺序', 
    `RESERVE1` VARCHAR(128) COMMENT '保留字段1', 
    `RESERVE2` VARCHAR(128) COMMENT '保留字段2', 
    `RESERVE3` VARCHAR(128) COMMENT '保留字段3', 
    `RESERVE4` VARCHAR(128) COMMENT '保留字段4', 
    `RESERVE5` VARCHAR(128) COMMENT '保留字段5', 
    `MEMO` VARCHAR(128) COMMENT '备注', 
    `ADD_TIME` DATETIME NOT NULL COMMENT '录入时间', 
    `ADD_USER_ID` INT(16) NOT NULL COMMENT '录入用户编号', 
    `ADD_USER_NAME` VARCHAR(30) NOT NULL COMMENT '录入用户姓名', 
    `MODIFY_TIME` DATETIME COMMENT '修改时间', 
    `MODIFY_USER_ID` INT(16) COMMENT '修改用户编号', 
    `MODIFY_USER_NAME` VARCHAR(30) COMMENT '修改用户姓名', 
    `MENU_NAME_US` VARCHAR(64) COMMENT '英文菜单名称', 
    `MENU_NAME_FR` VARCHAR(64) COMMENT '法文菜单名称'
    
	,PRIMARY KEY (`MENU_ID`)    
)DEFAULT CHARSET=UTF8 COMMENT='菜单表';	


-- ----------------------------
--  Records of `SYS_MENU`
-- ----------------------------
INSERT INTO `SYS_MENU` VALUES ('3', '用户管理', '/admin/sysUserList', 'user_suit.png', '0', '2', '1', '1', '1', '3', null, null, null, null, null, null, STR_TO_DATE('2013-06-27 18:53:46','%Y-%m-%d %H:%i:%s'), '1', '管理员', null, null, null, 'User Management', 'gestion des utilisateurs');
INSERT INTO `SYS_MENU` VALUES ('4', '角色管理', '/admin/sysRoleList', 'group_link.png', '0', '2', '1', '1', '1', '4', null, null, null, null, null, null, STR_TO_DATE('2013-06-27 18:54:01','%Y-%m-%d %H:%i:%s'), '1', '管理员', null, null, null, 'Role Management', 'gestion des r?les');
INSERT INTO `SYS_MENU` VALUES ('5', '系统参数', '/admin/sysParaList', 'script_gear.png', '0', '2', '1', '0', '1', '5', null, null, null, null, null, null, STR_TO_DATE('2013-06-27 18:54:12','%Y-%m-%d %H:%i:%s'), '1', '管理员', null, null, null, 'System Parameters', 'Paramètres du système');
INSERT INTO `SYS_MENU` VALUES ('6', '字典管理', '/admin/sysDicListList', 'book_open.png', '0', '2', '1', '1', '1', '6', null, null, null, null, null, null, STR_TO_DATE('2013-06-27 18:54:24','%Y-%m-%d %H:%i:%s'), '1', '管理员', null, null, null, 'Dictionary Management', 'gestion Dictionnaire');
INSERT INTO `SYS_MENU` VALUES ('7', '资源管理', '/admin/sysResourceList', 'database_gear.png', '0', '2', '1', '0', '1', '7', null, null, null, null, null, null, STR_TO_DATE('2013-06-27 18:54:35','%Y-%m-%d %H:%i:%s'), '1', '管理员', null, null, null, 'Resource Management', 'gestion des ressources');
INSERT INTO `SYS_MENU` VALUES ('8', '菜单管理', '/admin/sysMenuList', 'link.png', '0', '2', '1', '0', '1', '8', null, null, null, null, null, null, STR_TO_DATE('2013-06-27 18:54:54','%Y-%m-%d %H:%i:%s'), '1', '管理员', null, null, null, 'Menu Management', 'Gestionnaire de Menu');
INSERT INTO `SYS_MENU` VALUES ('10', '编号管理', '/admin/sysMaxIdTypeList', 'text_list_numbers.png', '0', '2', '1', '0', '1', '13', null, null, null, null, null, null, STR_TO_DATE('2013-06-27 18:55:14','%Y-%m-%d %H:%i:%s'), '1', '管理员', null, null, null, 'Code management', 'gestion des numéros');
INSERT INTO `SYS_MENU` VALUES ('280', '行政区划管理', '/admin/sysCodeList', 'table_gear.png', '0', '2', '1', '1', '1', '280', null, null, null, null, null, null, STR_TO_DATE('2014-05-28 15:44:39','%Y-%m-%d %H:%i:%s'), '5', '超级管理员', null, null, null, 'Administrative division management', 'Gestion de la division administrative');
INSERT INTO `SYS_MENU` VALUES ('12', '错误号管理', '/admin/sysErrorList', 'stop.png', '0', '2', '1', '0', '1', '11', null, null, null, null, null, null, STR_TO_DATE('2013-07-02 09:25:22','%Y-%m-%d %H:%i:%s'), '5', '管理员', null, null, null, 'Error Management', 'Gestion des numéros d''erreur');
INSERT INTO `SYS_MENU` VALUES ('11', '功能管理', '/admin/sysFunctionList', 'plugin.png', '0', '2', '1', '0', '1', '10', null, null, null, null, null, null, STR_TO_DATE('2013-07-02 09:24:09','%Y-%m-%d %H:%i:%s'), '5', '管理员', null, null, null, 'Function Management', 'gestion de la Fonction');
INSERT INTO `SYS_MENU` VALUES ('9', '日志管理', '/admin/sysLogList', 'page_white_paint.png', '0', '2', '1', '1', '1', '9', null, null, null, null, null, null, STR_TO_DATE('2013-07-04 11:59:37','%Y-%m-%d %H:%i:%s'), '5', '管理员', null, null, null, 'Log Management', 'Connectez-gestion');
INSERT INTO `SYS_MENU` VALUES ('2', '单位管理', '/admin/sysDeptList', 'house.png', '0', '2', '1', '1', '1', '2', null, null, null, null, null, null, STR_TO_DATE('2013-06-27 18:55:14','%Y-%m-%d %H:%i:%s'), '1', '管理员', null, null, null, 'Unit Management', 'Unit Management');
INSERT INTO `SYS_MENU` VALUES ('114', '数据权限开发', '/admin/sysPermitList', 'application_view_columns.png', '0', '2', '1', '0', '1', '12', null, null, null, null, null, null, STR_TO_DATE('2013-08-21 11:44:22','%Y-%m-%d %H:%i:%s'), '5', '超级管理员', null, null, null, 'Data permissions for development', 'Autorisation des données pour le développement');
INSERT INTO `SYS_MENU` VALUES ('1', '系统管理及运维子系统', null, 'cog.png', '0', '1', null, '1', '1', '900', null, null, null, null, null, null, STR_TO_DATE('2013-06-27 18:53:13','%Y-%m-%d %H:%i:%s'), '1', '管理员', STR_TO_DATE('2015-11-13 13:03:41','%Y-%m-%d %H:%i:%s'), '5', '超级管理员', 'System Management', 'gestion du système');
COMMIT;


