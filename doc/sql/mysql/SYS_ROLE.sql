/*
 Navicat Oracle Data Transfer

 Source Server         : gdbaweb
 Source Server Version : 112010
 Source Host           : 27.17.3.62
 Source Schema         : PKUWH_GDBAWEB

 Target Server Version : 112010
 File Encoding         : utf-8

 Date: 03/10/2017 15:26:37 PM
*/

-- ----------------------------
--  Table structure for `SYS_ROLE`
-- ----------------------------

USE PKUI;

DROP TABLE IF EXISTS `SYS_ROLE`;
CREATE TABLE `SYS_ROLE` (   
    `ROLE_ID` INT(16) NOT NULL COMMENT '角色标识号', 
    `ROLE_NAME` VARCHAR(64) NOT NULL COMMENT '角色名称', 
    `ROLE_LEVEL` VARCHAR(1) NOT NULL COMMENT '角色级别', 
    `ROLE_DERC` VARCHAR(128) NOT NULL COMMENT '角色描述', 
    `ORDER_FLAG` INT(16) COMMENT '角色排序', 
    `RESERVE1` VARCHAR(128) COMMENT '保留字段1', 
    `RESERVE2` VARCHAR(128) COMMENT '保留字段2', 
    `RESERVE3` VARCHAR(128) COMMENT '保留字段3', 
    `RESERVE4` VARCHAR(128) COMMENT '保留字段4', 
    `RESERVE5` VARCHAR(128) COMMENT '保留字段5', 
    `ADD_USER_ID` INT(16) NOT NULL COMMENT '录入用户编号', 
    `ADD_USER_NAME` VARCHAR(30) NOT NULL COMMENT '录入用户姓名', 
    `ADD_TIME` DATETIME NOT NULL COMMENT '录入时间', 
    `MODIFY_USER_ID` INT(16) COMMENT '修改用户编号', 
    `MODIFY_USER_NAME` VARCHAR(30) COMMENT '修改用户姓名', 
    `MODIFY_TIME` DATETIME COMMENT '修改时间'
    
	,PRIMARY KEY (`ROLE_ID`)    
) DEFAULT CHARSET=UTF8 COMMENT='角色表';


-- ----------------------------
--  Records of `SYS_ROLE`
-- ----------------------------
INSERT INTO `SYS_ROLE` VALUES ('25', '超级管理员', '0', '超级管理员', '1', null, null, null, null, null, '5', '张三力', STR_TO_DATE('2013-06-25 14:20:20','%Y-%m-%d %H:%i:%s'), '5', '超级管理员', STR_TO_DATE('2015-11-13 13:20:52','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE` VALUES ('80', '派出所民警', '0', '派出所民警', '9', null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-12-23 13:27:59','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_ROLE` VALUES ('74', '派出所保管员', '0', '派出所保管员', '13', null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-11-13 13:22:32','%Y-%m-%d %H:%i:%s'), null, null, null);
COMMIT;



