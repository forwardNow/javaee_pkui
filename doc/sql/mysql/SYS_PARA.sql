/*
 Navicat Oracle Data Transfer

 Source Server         : gdbaweb
 Source Server Version : 112010
 Source Host           : 27.17.3.62
 Source Schema         : PKUWH_GDBAWEB

 Target Server Version : 112010
 File Encoding         : utf-8

 Date: 03/10/2017 17:29:50 PM
*/

-- ----------------------------
--  Table structure for `SYS_PARA`
-- ----------------------------
USE PKUI;
DROP TABLE IF EXISTS `SYS_PARA`;
CREATE TABLE `SYS_PARA` (   
    `PARA_CODE` VARCHAR(16) NOT NULL COMMENT '参数编码', 
    `PARA_NAME` VARCHAR(64) NOT NULL COMMENT '参数名称', 
    `PARA_VALUE` VARCHAR(128) NOT NULL COMMENT '参数值', 
    `PARA_DESC` VARCHAR(128) COMMENT '参数说明', 
    `VISIABLE` VARCHAR(1) NOT NULL COMMENT '是否能编辑', 
    `RESERVE1` VARCHAR(100) COMMENT '预留字段1', 
    `RESERVE2` VARCHAR(100) COMMENT '预留字段2', 
    `RESERVE3` VARCHAR(100) COMMENT '预留字段3', 
    `RESERVE4` VARCHAR(100) COMMENT '预留字段4', 
    `RESERVE5` VARCHAR(100) COMMENT '预留字段5', 
    `ADD_USER_ID` INT(16) NOT NULL COMMENT '录入用户编号', 
    `ADD_USER_NAME` VARCHAR(30) NOT NULL COMMENT '录入用户姓名', 
    `ADD_TIME` DATETIME NOT NULL COMMENT '录入时间', 
    `MODIFY_USER_ID` INT(16) COMMENT '修改用户编号', 
    `MODIFY_USER_NAME` VARCHAR(30) COMMENT '修改用户姓名', 
    `MODIFY_TIME` DATETIME COMMENT '修改时间'
    ,PRIMARY KEY (`PARA_CODE`)
)  DEFAULT CHARSET=UTF8 COMMENT='系统参数表';	


-- ----------------------------
--  Records of `SYS_PARA`
-- ----------------------------
INSERT INTO `SYS_PARA` VALUES ('image_size', '图片尺寸', '674*252', '图片长与宽', '1', null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2014-07-26 15:30:05','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_PARA` VALUES ('index_pictrue', '默认栏目id', '1', '首页图片id', '1', null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2014-07-26 15:30:05','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_PARA` VALUES ('allow_image_ext', '允许上传的图片格式', '.png,.jpg,.gif,.jpeg', '允许上传的图片格式', '1', null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2014-07-26 15:30:05','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_PARA` VALUES ('PPRINT_MAXNUM', '文书最大的打印行数', '12', '登记、出库、入库等等文书每页支持的最大物品数量。', '1', null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-11-27 10:00:20','%Y-%m-%d %H:%i:%s'), '5', '超级管理员', STR_TO_DATE('2015-12-25 16:14:32','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_PARA` VALUES ('default_password', '初始密码', 'a', null, '1', null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-12-22 17:48:03','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_PARA` VALUES ('PPRINT_STANUM', '文书节点起点编号', '5', null, '1', null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-12-10 14:33:53','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_PARA` VALUES ('WARNING_RED_M', '超期预警——红色', '0', '距离到期时间小于等于0天时，进行超期红色预警', '1', null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-12-10 17:43:34','%Y-%m-%d %H:%i:%s'), '5', '超级管理员', STR_TO_DATE('2015-12-22 16:14:24','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_PARA` VALUES ('WARNING_YELLOW_M', '超期预警——黄色', '5', '距离到期时间小于等于5天时，进行超期黄色预警', '1', null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-12-10 17:44:51','%Y-%m-%d %H:%i:%s'), '5', '超级管理员', STR_TO_DATE('2015-12-22 16:14:40','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_PARA` VALUES ('WARNING_RED_C', '调用超期预警——红色', '0', '距离到期时间小于等于0天时，进行超期红色预警', '1', null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-12-10 17:59:13','%Y-%m-%d %H:%i:%s'), '5', '超级管理员', STR_TO_DATE('2015-12-22 16:14:52','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_PARA` VALUES ('WARNING_YELLOW_C', '调用超期预警——黄色', '3', '距离到期时间小于等于3天时，进行超期黄色预警', '1', null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-12-10 17:59:48','%Y-%m-%d %H:%i:%s'), '5', '超级管理员', STR_TO_DATE('2015-12-18 16:50:27','%Y-%m-%d %H:%i:%s'));
COMMIT;


