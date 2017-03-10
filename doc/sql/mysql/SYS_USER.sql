/*
 Navicat Oracle Data Transfer

 Source Server         : gdbaweb
 Source Server Version : 112010
 Source Host           : 27.17.3.62
 Source Schema         : PKUWH_GDBAWEB

 Target Server Version : 112010
 File Encoding         : utf-8

 Date: 03/10/2017 17:14:37 PM
*/

-- ----------------------------
--  Table structure for `SYS_USER`
-- ----------------------------

USE PKUI;

DROP TABLE IF EXISTS  `SYS_USER`;
CREATE TABLE `SYS_USER` (   
    `USER_ID` INT(16) NOT NULL COMMENT '用户标识号', 
    `LOGIN_NAME` VARCHAR(30) NOT NULL COMMENT '登录名', 
    `USER_NAME` VARCHAR(30) NOT NULL COMMENT '真实姓名', 
    `POLICE_CODE` VARCHAR(6) COMMENT '警号', 
    `PASSWORD` VARCHAR(64) NOT NULL COMMENT '密码', 
    `SALT` VARCHAR(64) NOT NULL COMMENT '密码盐值', 
    `DEPT_ID` VARCHAR(12) NOT NULL COMMENT '所属单位标识号', 
    `USER_LEVEL` VARCHAR(1) NOT NULL COMMENT '用户级别', 
    `STATUS` VARCHAR(1) NOT NULL COMMENT '状态', 
    `USER_TYPE` VARCHAR(2) COMMENT '用户类型', 
    `EMAIL` VARCHAR(64) COMMENT '邮箱', 
    `TEL` VARCHAR(20) COMMENT '电话号码', 
    `MOBILE` VARCHAR(20) COMMENT '手机号码', 
    `IDCARD` VARCHAR(18) COMMENT '身份证号', 
    `CERTIFICATE` VARCHAR(128) COMMENT '数字证书编码', 
    `CUNITID` VARCHAR(12) COMMENT '数据归属市局', 
    `SUNITID` VARCHAR(12) COMMENT '数据归属分局', 
    `TUNITID` VARCHAR(12) COMMENT '数据归属派出所', 
    `RESERVE1` VARCHAR(128) COMMENT '保留字段1', 
    `RESERVE2` VARCHAR(128) COMMENT '保留字段2', 
    `RESERVE3` VARCHAR(128) COMMENT '保留字段3', 
    `RESERVE4` VARCHAR(128) COMMENT '保留字段4', 
    `RESERVE5` VARCHAR(128) COMMENT '保留字段5', 
    `MEMO` VARCHAR(128) COMMENT '备注', 
    `ADD_USER_ID` INT(16) NOT NULL COMMENT '录入用户编号', 
    `ADD_USER_NAME` VARCHAR(30) NOT NULL COMMENT '录入用户姓名', 
    `ADD_TIME` DATETIME NOT NULL COMMENT '录入时间', 
    `MODIFY_USER_ID` INT(16) COMMENT '修改用户编号', 
    `MODIFY_USER_NAME` VARCHAR(30) COMMENT '修改用户姓名', 
    `MODIFY_TIME` DATETIME COMMENT '修改时间'

    ,PRIMARY KEY (`USER_ID`)
    
)  DEFAULT CHARSET=UTF8 COMMENT='用户表';	
	


-- ----------------------------
--  Records of `SYS_USER`
-- ----------------------------
INSERT INTO `SYS_USER` VALUES ('257', 'luck', '喂', '002345', '8d259473b3015cb7af19063cab4d4fbe81305e51', 'a', '420105630000', '4', '1', '1', null, null, null, null, null, '420100000000', '420105000000', '420105630000', null, null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-12-21 09:43:31','%Y-%m-%d %H:%i:%s'), '5', '超级管理员', STR_TO_DATE('2015-12-25 10:30:45','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_USER` VALUES ('93', 'userfortest', 'userfortest', 'uft', '8d259473b3015cb7af19063cab4d4fbe81305e51', 'a', '420100210100', '3', '1', '1', null, null, null, null, null, '420100000000', '420100210100', null, null, null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2014-03-05 15:33:05','%Y-%m-%d %H:%i:%s'), '5', '超级管理员', STR_TO_DATE('2015-11-19 16:06:17','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_USER` VALUES ('5', 'admin', '超级管理员', 'admin', '8d259473b3015cb7af19063cab4d4fbe81305e51', 'a', '420100000000', '2', '1', '2', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2013-08-16 00:00:00','%Y-%m-%d %H:%i:%s'), '5', '超级管理员', STR_TO_DATE('2014-05-18 20:53:28','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_USER` VALUES ('247', 'hyfj', '汉阳分局', '001002', '8d259473b3015cb7af19063cab4d4fbe81305e51', 'a', '420105000000', '3', '1', '1', null, null, null, null, null, '420100000000', '420105000000', null, null, null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-11-19 16:08:50','%Y-%m-%d %H:%i:%s'), '5', '超级管理员', STR_TO_DATE('2015-11-19 16:22:09','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_USER` VALUES ('248', 'admin_fj', '分局系统管理员', '001003', '8d259473b3015cb7af19063cab4d4fbe81305e51', 'a', '420105000000', '3', '1', '1', null, null, null, null, null, '420100000000', '420105000000', null, null, null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-11-19 16:09:29','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_USER` VALUES ('249', 'pcs', '派出所保管员', '001004', '8d259473b3015cb7af19063cab4d4fbe81305e51', 'a', '420105630000', '4', '1', '1', null, null, null, null, null, '420100000000', '420105000000', '420105630000', null, null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-11-19 16:22:53','%Y-%m-%d %H:%i:%s'), '5', '超级管理员', STR_TO_DATE('2015-12-23 13:47:31','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_USER` VALUES ('250', 'admin_pcs', '派出所系统管理员', '001005', '8d259473b3015cb7af19063cab4d4fbe81305e51', 'a', '420105630000', '4', '1', '1', null, null, null, null, null, '420100000000', '420105000000', '420105630000', null, null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-11-19 16:23:58','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_USER` VALUES ('251', 'whsj', '武汉市局保管员', '001006', '8d259473b3015cb7af19063cab4d4fbe81305e51', 'a', '420100000000', '2', '1', '1', null, null, null, null, null, '420100000000', null, null, null, null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-11-19 16:24:39','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_USER` VALUES ('252', 'wlsmz', '物流实名制', '002002', '8d259473b3015cb7af19063cab4d4fbe81305e51', 'a', '420100000000', '2', '1', '1', null, null, null, null, null, '420100000000', null, null, null, null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-11-19 16:35:02','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_USER` VALUES ('262', 'pcsmj', '民警', '021548', '8d259473b3015cb7af19063cab4d4fbe81305e51', 'a', '420105630000', '4', '1', '1', null, null, null, null, null, '420100000000', '420105000000', '420105630000', null, null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-12-23 13:46:40','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_USER` VALUES ('263', 'zoro', 'zoro', 'zoro', '8d259473b3015cb7af19063cab4d4fbe81305e51', 'a', '420100000000', '2', '1', '1', null, null, null, null, null, '420100000000', null, null, null, null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-12-30 14:09:15','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_USER` VALUES ('255', 'Masaka', 'aa', '023456', '8d259473b3015cb7af19063cab4d4fbe81305e51', 'a', '420105630000', '4', '1', '1', null, null, null, null, null, '420100000000', '420105000000', '420105630000', null, null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-12-14 10:33:33','%Y-%m-%d %H:%i:%s'), '5', '超级管理员', STR_TO_DATE('2015-12-14 11:01:56','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_USER` VALUES ('253', 'hspcs', '王志华', '019747', '8d259473b3015cb7af19063cab4d4fbe81305e51', 'a', '420111620000', '4', '1', '1', null, null, null, null, null, '420100000000', '420111000000', '420111620000', null, null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-12-03 17:27:08','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_USER` VALUES ('254', 'hsfj', '袁德和', '019976', '8d259473b3015cb7af19063cab4d4fbe81305e51', 'a', '420111000000', '3', '1', '1', null, null, null, null, null, '420100000000', '420111000000', null, null, null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-12-03 17:29:12','%Y-%m-%d %H:%i:%s'), '5', '超级管理员', STR_TO_DATE('2015-12-03 17:29:25','%Y-%m-%d %H:%i:%s'));
COMMIT;


