/*
 Navicat Oracle Data Transfer

 Source Server         : gdbaweb
 Source Server Version : 112010
 Source Host           : 27.17.3.62
 Source Schema         : PKUWH_GDBAWEB

 Target Server Version : 112010
 File Encoding         : utf-8

 Date: 03/23/2017 15:14:07 PM
*/

-- ----------------------------
--  Table structure for `SYS_PERMIT`
-- ----------------------------
USE PKUI;
DROP TABLE IF EXISTS `SYS_PERMIT`;
CREATE TABLE `SYS_PERMIT` (   
    `PERMIT_ID` INT(16) NOT NULL COMMENT '数据权限标识号', 
    `PERMIT_NAME` VARCHAR(64) NOT NULL COMMENT '数据权限名称', 
    `PERMIT_CODE` VARCHAR(6) NOT NULL COMMENT '数据权限编码', 
    `PERMIT_VALUE` VARCHAR(128) NOT NULL COMMENT '数据权限值', 
    `PERMIT_DESC` VARCHAR(128) COMMENT '描述', 
    `ORDER_FLAG` INT(16) NOT NULL COMMENT '排序', 
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

    ,PRIMARY KEY (`PERMIT_ID`)
)  DEFAULT CHARSET=UTF8 COMMENT='数据权限表';	


-- ----------------------------
--  Records of `SYS_PERMIT`
-- ----------------------------
INSERT INTO `SYS_PERMIT` VALUES ('34', '查派出所场所、区域、空间', '200002', 'TSTATIONID=${deptId}', null, '7', null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-12-07 17:54:37','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_PERMIT` VALUES ('35', '查本分局（包括辖区派出所）场所、区域、空间', '200002', 'SSTATIONID=${deptId}', null, '8', null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-12-07 17:55:13','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_PERMIT` VALUES ('36', '查本市局（包括辖区分局和派出所）场所、区域、空间', '200002', 'CSTATIONID=${deptId}', null, '9', null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-12-07 17:55:53','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_PERMIT` VALUES ('28', '办理全库数据业务', '200001', '1=1', null, '1', null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-11-16 11:24:13','%Y-%m-%d %H:%i:%s'), '5', '超级管理员', STR_TO_DATE('2015-11-16 11:27:35','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_PERMIT` VALUES ('29', '办理全市局数据业务', '200001', 'CSTATIONID=${deptId}', null, '2', null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-11-16 11:26:11','%Y-%m-%d %H:%i:%s'), '5', '超级管理员', STR_TO_DATE('2015-11-16 11:27:45','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_PERMIT` VALUES ('30', '办理全分局数据业务', '200001', 'SSTATIONID=${deptId}', null, '3', null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-11-16 11:26:41','%Y-%m-%d %H:%i:%s'), '5', '超级管理员', STR_TO_DATE('2015-11-16 11:27:53','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_PERMIT` VALUES ('31', '办理全派出所数据业务', '200001', 'TSTATIONID=${deptId}', null, '4', null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-11-16 11:27:20','%Y-%m-%d %H:%i:%s'), '5', '超级管理员', STR_TO_DATE('2015-11-16 11:28:01','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_PERMIT` VALUES ('32', '支队用户查办理全市局数据业务', '200001', 'CSTATIONID=${cunitid}', null, '5', null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-11-16 12:43:04','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_PERMIT` VALUES ('33', '查本单位场所、区域、空间', '200002', 'OPUNITID=${deptId}', null, '6', null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-11-23 19:46:03','%Y-%m-%d %H:%i:%s'), '5', '超级管理员', STR_TO_DATE('2015-12-07 17:53:30','%Y-%m-%d %H:%i:%s'));
COMMIT;


