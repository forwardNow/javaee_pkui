USE PKUI;
/*
 Navicat Oracle Data Transfer

 Source Server         : gdbaweb
 Source Server Version : 112010
 Source Host           : 27.17.3.62
 Source Schema         : PKUWH_GDBAWEB

 Target Server Version : 112010
 File Encoding         : utf-8

 Date: 03/10/2017 14:56:19 PM
*/

-- ----------------------------
--  Table structure for `SYS_DEPT_RELE`
-- ----------------------------
DROP TABLE IF EXISTS `SYS_DEPT_RELE`;
CREATE TABLE `SYS_DEPT_RELE` (   
	`DEPT_ID` VARCHAR(12) NOT NULL COMMENT '单位编号', 
	`RELE_DEPT_ID` VARCHAR(12) NOT NULL COMMENT '数据归属单位编号', 
	`RELE_DEPT_NAME` VARCHAR(100) COMMENT '数据归属单位名称'
	,PRIMARY KEY(`DEPT_ID`,`RELE_DEPT_ID`)
)  DEFAULT CHARSET=UTF8 COMMENT='数据归属表';

