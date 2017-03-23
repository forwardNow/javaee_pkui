/*
 Navicat Oracle Data Transfer

 Source Server         : gdbaweb
 Source Server Version : 112010
 Source Host           : 27.17.3.62
 Source Schema         : PKUWH_GDBAWEB

 Target Server Version : 112010
 File Encoding         : utf-8

 Date: 03/23/2017 15:19:02 PM
*/

-- ----------------------------
--  Table structure for `SYS_ROLE_PERMIT`
-- ----------------------------
USE PKUI;
DROP TABLE IF EXISTS `SYS_ROLE_PERMIT`;
CREATE TABLE `SYS_ROLE_PERMIT` (   
    `ROLE_PERMIT_ID` INT(16) NOT NULL COMMENT '角色数据权限标识号' , 
    `ROLE_ID` INT(16) NOT NULL COMMENT '角色标识号' , 
    `PERMIT_ID` INT(16) NOT NULL COMMENT '数据权限标识号' , 
    `ADD_USER_ID` INT(16) NOT NULL COMMENT '录入用户编号' , 
    `ADD_USER_NAME` VARCHAR(30) NOT NULL COMMENT '录入用户姓名' , 
    `ADD_TIME` DATETIME NOT NULL COMMENT '录入时间' 
    
    ,PRIMARY KEY (`ROLE_PERMIT_ID`)
)  DEFAULT CHARSET=UTF8 COMMENT='角色数据权限表';	


-- ----------------------------
--  Records of `SYS_ROLE_PERMIT`
-- ----------------------------
INSERT INTO `SYS_ROLE_PERMIT` VALUES ('97', '71', '18', '5', '超级管理员', STR_TO_DATE('2014-03-27 16:53:36','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_PERMIT` VALUES ('98', '69', '18', '5', '超级管理员', STR_TO_DATE('2014-03-27 16:54:03','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_PERMIT` VALUES ('481', '73', '33', '5', '超级管理员', STR_TO_DATE('2015-12-21 09:39:29','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_PERMIT` VALUES ('478', '74', '31', '5', '超级管理员', STR_TO_DATE('2015-12-21 09:37:21','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_PERMIT` VALUES ('479', '74', '33', '5', '超级管理员', STR_TO_DATE('2015-12-21 09:37:21','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_PERMIT` VALUES ('480', '73', '30', '5', '超级管理员', STR_TO_DATE('2015-12-21 09:39:29','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_PERMIT` VALUES ('483', '80', '33', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:29:00','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_PERMIT` VALUES ('450', '77', '33', '5', '超级管理员', STR_TO_DATE('2015-12-07 17:29:58','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_PERMIT` VALUES ('455', '25', '29', '5', '超级管理员', STR_TO_DATE('2015-12-07 17:30:09','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_PERMIT` VALUES ('484', '82', '29', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:13','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_PERMIT` VALUES ('485', '82', '33', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:13','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_PERMIT` VALUES ('486', '81', '30', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:43','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_PERMIT` VALUES ('448', '78', '33', '5', '超级管理员', STR_TO_DATE('2015-12-07 17:29:49','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_PERMIT` VALUES ('482', '80', '31', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:29:00','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_PERMIT` VALUES ('451', '66', '29', '5', '超级管理员', STR_TO_DATE('2015-12-07 17:30:02','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_PERMIT` VALUES ('452', '66', '33', '5', '超级管理员', STR_TO_DATE('2015-12-07 17:30:02','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_PERMIT` VALUES ('453', '29', '33', '5', '超级管理员', STR_TO_DATE('2015-12-07 17:30:05','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_PERMIT` VALUES ('454', '25', '28', '5', '超级管理员', STR_TO_DATE('2015-12-07 17:30:09','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_PERMIT` VALUES ('456', '25', '33', '5', '超级管理员', STR_TO_DATE('2015-12-07 17:30:09','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_PERMIT` VALUES ('487', '81', '33', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:43','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_PERMIT` VALUES ('457', '76', '28', '5', '超级管理员', STR_TO_DATE('2015-12-14 10:36:07','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_PERMIT` VALUES ('458', '76', '29', '5', '超级管理员', STR_TO_DATE('2015-12-14 10:36:07','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_PERMIT` VALUES ('459', '76', '30', '5', '超级管理员', STR_TO_DATE('2015-12-14 10:36:07','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_PERMIT` VALUES ('460', '76', '31', '5', '超级管理员', STR_TO_DATE('2015-12-14 10:36:07','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_PERMIT` VALUES ('461', '76', '32', '5', '超级管理员', STR_TO_DATE('2015-12-14 10:36:07','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_PERMIT` VALUES ('462', '76', '33', '5', '超级管理员', STR_TO_DATE('2015-12-14 10:36:07','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_PERMIT` VALUES ('463', '76', '34', '5', '超级管理员', STR_TO_DATE('2015-12-14 10:36:07','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_PERMIT` VALUES ('464', '76', '35', '5', '超级管理员', STR_TO_DATE('2015-12-14 10:36:07','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_PERMIT` VALUES ('465', '76', '36', '5', '超级管理员', STR_TO_DATE('2015-12-14 10:36:07','%Y-%m-%d %H:%i:%s'));
COMMIT;


