USE PKUI;

/*
 Navicat Oracle Data Transfer

 Source Server         : gdbaweb
 Source Server Version : 112010
 Source Host           : 27.17.3.62
 Source Schema         : PKUWH_GDBAWEB

 Target Server Version : 112010
 File Encoding         : utf-8

 Date: 03/10/2017 14:31:48 PM
*/

-- ----------------------------
--  Table structure for `SYS_DEPT`
-- ----------------------------
DROP TABLE IF EXISTS `SYS_DEPT`;
CREATE TABLE `SYS_DEPT` (   
    `DEPT_ID` VARCHAR(12) NOT NULL COMMENT '部门标识号' , 
    `DEPT_NAME` VARCHAR(64) NOT NULL COMMENT '部门名称' , 
    `DEPT_LEVEL` VARCHAR(1) NOT NULL COMMENT '部门级别' , 
    `TREE_LEVEL` INT(16) NOT NULL COMMENT '机构树级别' , 
    `PARENT_DEPT_ID` VARCHAR(12) NOT NULL COMMENT '上级部门标识号' , 
    `ORDER_FLAG` INT(16) NOT NULL COMMENT '排序' , 
    `TEL` VARCHAR(20) COMMENT '电话' , 
    `FAX` VARCHAR(20) COMMENT '传真' , 
    `IS_MAIN_DEPT` VARCHAR(1) NOT NULL COMMENT '是否为主管单位' , 
    `CUNITID` VARCHAR(12) COMMENT '所属市局' , 
    `SUNITID` VARCHAR(12) COMMENT '所属分局' , 
    `TUNITID` VARCHAR(12) COMMENT '所属派出所' , 
    `DATA_CUNITID` VARCHAR(12) COMMENT '数据归属市局' , 
    `DATA_SUNITID` VARCHAR(12) COMMENT '数据归属分局' , 
    `DATA_TUNITID` VARCHAR(12) COMMENT '数据归属派出所' , 
    `RESERVE1` VARCHAR(100) COMMENT '预留字段1' , 
    `RESERVE2` VARCHAR(100) COMMENT '预留字段2' , 
    `RESERVE3` VARCHAR(100) COMMENT '预留字段3' , 
    `RESERVE4` VARCHAR(100) COMMENT '预留字段4' , 
    `RESERVE5` VARCHAR(100) COMMENT '预留字段5' , 
    `MANAGER` VARCHAR(30) COMMENT '负责人' , 
    `DEPT_TYPE` VARCHAR(2) COMMENT '部门类型' , 
    `MEMO` VARCHAR(128) COMMENT '备注' , 
    `ADD_USER_ID` INT(16) NOT NULL COMMENT '录入用户编号' , 
    `ADD_USER_NAME` VARCHAR(30) NOT NULL COMMENT '录入用户姓名' , 
    `ADD_TIME` DATETIME NOT NULL COMMENT '录入时间' , 
    `MODIFY_USER_ID` INT(16) COMMENT '修改用户编号' , 
    `MODIFY_USER_NAME` VARCHAR(30) COMMENT '修改用户姓名' , 
    `MODIFY_TIME` DATETIME COMMENT '修改时间'       

    ,PRIMARY KEY (`DEPT_ID`)
    
)  DEFAULT CHARSET=UTF8 COMMENT='部门表';  

;


-- ----------------------------
--  Records of `SYS_DEPT`
-- ----------------------------
INSERT INTO `SYS_DEPT` VALUES ('420111010000', 'add_dept_test', '4', '4', '420111000000', '0', '1', '2', '0', '420100000000', '420111000000', '420111620000', null, null, null, null, null, null, null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2016-10-22 11:58:06','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_DEPT` VALUES ('420111010002', 'add_dept_test', '4', '4', '420111000000', '0', '1', '2', '0', '420100000000', '420111000000', '420111620000', null, null, null, null, null, null, null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2016-10-22 12:01:11','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_DEPT` VALUES ('420100000000', '武汉市公安局', '2', '2', '420000000000', '0', null, null, '1', '420100000000', null, null, null, null, null, null, null, null, null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-11-11 15:31:11','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_DEPT` VALUES ('420100210100', '市局法制支队', '3', '3', '420100000000', '0', null, null, '1', '420100000000', '420100210100', null, null, null, null, null, null, null, null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-11-11 15:31:11','%Y-%m-%d %H:%i:%s'), '5', '超级管理员', STR_TO_DATE('2015-11-19 15:47:10','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_DEPT` VALUES ('420105000000', '武汉市公安局汉阳分局', '3', '3', '420100000000', '0', null, null, '1', '420100000000', '420105000000', null, null, null, null, null, null, null, null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-11-11 15:31:11','%Y-%m-%d %H:%i:%s'), '5', '超级管理员', STR_TO_DATE('2015-11-19 16:20:47','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_DEPT` VALUES ('420105630000', '武汉市公安局汉阳分局晴川街派出所', '4', '4', '420105000000', '0', null, null, '1', '420100000000', '420105000000', '420105630000', null, null, null, null, null, null, null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-11-11 15:31:11','%Y-%m-%d %H:%i:%s'), '5', '超级管理员', STR_TO_DATE('2015-11-19 16:20:40','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_DEPT` VALUES ('100000000000', 'PKUSOFT', '0', '0', '0', '0', null, null, '1', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '1', 'admin', STR_TO_DATE('2013-08-16 00:00:00','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_DEPT` VALUES ('420000000000', '湖北省公安厅', '1', '1', '100000000000', '0', null, null, '1', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2013-08-18 21:25:11','%Y-%m-%d %H:%i:%s'), '5', '超级管理员', STR_TO_DATE('2014-05-18 21:00:46','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_DEPT` VALUES ('420111620000', '武汉市公安局洪山分局洪山派出所', '4', '4', '420111000000', '0', null, null, '1', '420100000000', '420111000000', '420111620000', null, null, null, null, null, null, null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-12-03 17:24:30','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_DEPT` VALUES ('420111000000', '武汉市公安局洪山分局', '3', '3', '420100000000', '0', null, null, '1', '420100000000', '420111000000', null, null, null, null, null, null, null, null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-12-03 17:23:22','%Y-%m-%d %H:%i:%s'), null, null, null);
COMMIT;


