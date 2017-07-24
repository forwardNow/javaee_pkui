/*
 Navicat Oracle Data Transfer

 Source Server         : user_center2
 Source Server Version : 112010
 Source Host           : 27.17.3.62
 Source Schema         : USER_CENTER2

 Target Server Version : 112010
 File Encoding         : utf-8

 Date: 07/24/2017 10:28:59 AM
*/

USE PKUI;
-- ----------------------------
--  Table structure for `SYS_ACCESS_SYSTEM`
-- ----------------------------
DROP TABLE IF EXISTS `SYS_ACCESS_SYSTEM`;
CREATE TABLE `SYS_ACCESS_SYSTEM` (   
    `SYS_ID` VARCHAR(36)  NOT NULL COMMENT '系统标识', 
    `SYS_NAME` VARCHAR(100) COMMENT '系统名称', 
    `SYS_TYPE` VARCHAR(2) COMMENT '系统类别。00、内部系统；10、内外系统', 
    `URL` VARCHAR(200) COMMENT '访问系统的url', 
    `DESCRIPTION` VARCHAR(200) COMMENT '描述', 
    `MODIFY_USER_ID` VARCHAR(36) COMMENT '修改用户编号', 
    `MODIFY_USER_NAME` VARCHAR(30) COMMENT '修改用户姓名', 
    `MODIFY_TIME` DATETIME COMMENT '修改时间', 
    `RESERVE1` VARCHAR(100) COMMENT '预留字段1', 
    `RESERVE2` VARCHAR(100) COMMENT '预留字段2', 
    `RESERVE4` VARCHAR(100) COMMENT '预留字段4', 
    `RESERVE3` VARCHAR(100) COMMENT '预留字段3', 
    `RESERVE5` VARCHAR(100) COMMENT '预留字段5', 
    `ICON` VARCHAR(60) COMMENT '图标'

    ,PRIMARY KEY (`SYS_ID`)

) DEFAULT CHARSET=UTF8 COMMENT='接入的系统'
;


-- ----------------------------
--  Records of `SYS_ACCESS_SYSTEM`
-- ----------------------------
INSERT INTO `SYS_ACCESS_SYSTEM` VALUES ('e732ba48-71f5-4c94-b5d7-14caf01a2d3c', '百度', '10', 'www.baidu.com', '百度', '52ECA44E6D6B63FCE050007F010049BD', '武汉市公安局', STR_TO_DATE('2017-07-17 18:45:04','%Y-%m-%d %H:%i:%s'), null, null, null, null, null, null);
INSERT INTO `SYS_ACCESS_SYSTEM` VALUES ('c98e5d2f-de0a-4c64-b001-5c10bef5ab14', '花瓣', '10', 'pivx', '根深蒂固', '52ECA44E6D6B63FCE050007F010049BD', '武汉市公安局', STR_TO_DATE('2017-07-18 11:24:29','%Y-%m-%d %H:%i:%s'), null, null, null, null, null, null);
INSERT INTO `SYS_ACCESS_SYSTEM` VALUES ('2fca92f5-a531-496e-ad56-dafea99e2bfc', '执法监督子系统', '00', 'http://10.73.93.158:8080/zfjd', '执法监督管理平台', '52ECA44E6D6B63FCE050007F010049BD', '武汉市公安局', STR_TO_DATE('2017-07-18 15:13:11','%Y-%m-%d %H:%i:%s'), null, null, null, null, null, null);
INSERT INTO `SYS_ACCESS_SYSTEM` VALUES ('548029B3ED757E93E050007F01004376', '用户中心', '00', null, '用户中心', '52ECA44E6D6B63FCE050007F010049BD', '武汉市公安局', STR_TO_DATE('2017-07-17 18:45:04','%Y-%m-%d %H:%i:%s'), null, null, null, null, null, null);
COMMIT;


