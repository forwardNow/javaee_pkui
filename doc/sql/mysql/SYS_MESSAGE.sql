/*
 Navicat Oracle Data Transfer

 Source Server         : gdbaweb
 Source Server Version : 112010
 Source Host           : 27.17.3.62
 Source Schema         : PKUWH_GDBAWEB

 Target Server Version : 112010
 File Encoding         : utf-8

 Date: 03/23/2017 15:06:41 PM
*/

-- ----------------------------
--  Table structure for `SYS_MESSAGE`
-- ----------------------------
USE PKUI;
DROP TABLE IF EXISTS `SYS_MESSAGE`;
CREATE TABLE `SYS_MESSAGE` (   
    `MSG_ID` INT(16) NOT NULL COMMENT '消息编号', 
    `MSG_TITLE` VARCHAR(100) NOT NULL COMMENT '消息标题', 
    `MSG_CONTENT` VARCHAR(1000) COMMENT '消息内容', 
    `MSG_TYPE` VARCHAR(2) NOT NULL COMMENT '消息类型', 
    `SEND_USER_IP` VARCHAR(30) NOT NULL COMMENT '发送用户IP', 
    `SEND_USER_ID` INT(16) NOT NULL COMMENT '发送用户编号', 
    `SEND_USER_NAME` VARCHAR(30) NOT NULL COMMENT '发送用户姓名', 
    `SEND_TIME` DATETIME NOT NULL COMMENT '发送时间', 
    `SEND_DEL_FLAG` VARCHAR(1) NOT NULL COMMENT '发送方删除标识', 
    `RECEIVE_DEL_FLAG` VARCHAR(1) NOT NULL COMMENT '接受方删除标识', 
    `READ_FLAG` VARCHAR(1) NOT NULL COMMENT '已读标识', 
    `RECEIVE_USER_IP` VARCHAR(30) COMMENT '接收用户IP', 
    `RECEIVE_USER_ID` INT(16) COMMENT '接收用户编号', 
    `RECEIVE_USER_NAME` VARCHAR(30) COMMENT '接收用户姓名', 
    `RECEIVE_TIME` DATETIME COMMENT '接收时间', 
    `RESERVE1` VARCHAR(100) COMMENT '预留字段1', 
    `RESERVE2` VARCHAR(100) COMMENT '预留字段2', 
    `RESERVE3` VARCHAR(100) COMMENT '预留字段3', 
    `RESERVE4` VARCHAR(100) COMMENT '预留字段4', 
    `RESERVE5` VARCHAR(100) COMMENT '预留字段5'
    
     ,PRIMARY KEY (`MSG_ID`)
     
)  DEFAULT CHARSET=UTF8 COMMENT='消息表';	
    


