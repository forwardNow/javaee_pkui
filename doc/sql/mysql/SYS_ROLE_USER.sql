/*
 Navicat Oracle Data Transfer

 Source Server         : gdbaweb
 Source Server Version : 112010
 Source Host           : 27.17.3.62
 Source Schema         : PKUWH_GDBAWEB

 Target Server Version : 112010
 File Encoding         : utf-8

 Date: 03/10/2017 15:36:35 PM
*/

-- ----------------------------
--  Table structure for `SYS_ROLE_USER`
-- ----------------------------

USE PKUI;

DROP TABLE IF EXISTS `SYS_ROLE_USER`;
CREATE TABLE `SYS_ROLE_USER` (   
    `ROLE_USER_ID` INT(16) NOT NULL COMMENT '角色用户标识号', 
    `USER_ID` INT(16) NOT NULL COMMENT '用户编号', 
    `ROLE_ID` INT(16) COMMENT '角色编号', 
    `ADD_USER_ID` INT(16) NOT NULL COMMENT '录入用户编号', 
    `ADD_USER_NAME` VARCHAR(30) NOT NULL COMMENT '录入用户姓名', 
    `ADD_TIME` DATETIME NOT NULL COMMENT '录入时间'
    
	,PRIMARY KEY (`ROLE_USER_ID`)    
) DEFAULT CHARSET=UTF8 COMMENT='角色用户表';	


-- ----------------------------
--  Records of `SYS_ROLE_USER`
-- ----------------------------
INSERT INTO `SYS_ROLE_USER` VALUES ('3', '5', '25', '5', '超级管理员', STR_TO_DATE('2014-05-18 20:53:28','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_USER` VALUES ('13', '1', '1', '5', '超级管理员', STR_TO_DATE('2014-08-08 18:04:54','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_USER` VALUES ('361', '25', '25', '5', '管理员', STR_TO_DATE('2013-07-03 15:36:44','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_USER` VALUES ('369', '33', '25', '5', '管理员', STR_TO_DATE('2013-07-05 15:53:28','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_USER` VALUES ('371', '34', '25', '5', '管理员', STR_TO_DATE('2013-07-08 16:39:41','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_USER` VALUES ('972', '260', '74', '5', '超级管理员', STR_TO_DATE('2015-12-23 11:27:12','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_USER` VALUES ('975', '262', '80', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:46:40','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_USER` VALUES ('973', '261', '74', '5', '超级管理员', STR_TO_DATE('2015-12-23 11:28:03','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_USER` VALUES ('977', '257', '74', '5', '超级管理员', STR_TO_DATE('2015-12-25 10:30:45','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_USER` VALUES ('978', '263', '74', '5', '超级管理员', STR_TO_DATE('2015-12-30 14:09:15','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_USER` VALUES ('959', '253', '74', '5', '超级管理员', STR_TO_DATE('2015-12-03 17:27:08','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_USER` VALUES ('976', '249', '74', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:47:31','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_USER` VALUES ('970', '258', '74', '5', '超级管理员', STR_TO_DATE('2015-12-22 15:23:23','%Y-%m-%d %H:%i:%s'));
COMMIT;


