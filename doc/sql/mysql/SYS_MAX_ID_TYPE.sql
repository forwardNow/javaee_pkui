/*
 Navicat Oracle Data Transfer

 Source Server         : gdbaweb
 Source Server Version : 112010
 Source Host           : 27.17.3.62
 Source Schema         : PKUWH_GDBAWEB

 Target Server Version : 112010
 File Encoding         : utf-8

 Date: 03/10/2017 15:45:51 PM
*/

-- ----------------------------
--  Table structure for `SYS_MAX_ID_TYPE`
-- ----------------------------

USE PKUI;

DROP TABLE IF EXISTS `SYS_MAX_ID_TYPE`;
CREATE TABLE `SYS_MAX_ID_TYPE` (   
    `ID_TYPE` VARCHAR(6) NOT NULL COMMENT '编号类型', 
    `ID_NAME` VARCHAR(30) COMMENT '编号名称', 
    `ID_SIZE` INT(16) NOT NULL COMMENT '编号长度', 
    `ID_LOOP` VARCHAR(1) NOT NULL COMMENT '是否可循环使用', 
    `ID_BEGIN` INT(16) NOT NULL COMMENT '开始值', 
    `ID_END` INT(16) NOT NULL COMMENT '最大值', 
    `ID_DES` VARCHAR(128) COMMENT '描述'

    ,PRIMARY KEY (`ID_TYPE`)
) DEFAULT CHARSET=UTF8 COMMENT='最大编号类型表';


-- ----------------------------
--  Records of `SYS_MAX_ID_TYPE`
-- ----------------------------
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('100022', '材料图片ID', '8', '0', '1', '99999999', '图片ID');
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('100023', '保安服务公司编号SSCID', '10', '0', '1', '9999999999', 'SSCID服务公司编号');
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('100025', '保安服务公司负责人ID', '10', '0', '1', '9999999999', '负责人ID');
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('200007', '存放场所编号', '12', '0', '1', '999999999999', '存放场所编号');
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('200004', '存储空间类型', '8', '0', '1', '99999999', null);
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('200006', '财物所有者编号', '14', '0', '1', '99999999999999', '财物所有者编号');
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('200011', '图片组编号', '14', '0', '1', '99999999999999', null);
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('600009', '涉案物品编号', '10', '1', '1', '9999999', null);
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('600019', '任务编号', '10', '1', '1', '999999999', null);
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('100001', '单位编号', '10', '0', '2', '999999999', null);
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('100002', '用户编号', '10', '0', '1', '999999999', null);
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('100003', '日志编号', '10', '0', '1', '999999999', null);
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('100004', '角色编号', '10', '0', '1', '999999999', null);
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('100005', '角色用户编号', '10', '0', '1', '999999999', null);
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('100006', '角色菜单编号', '10', '0', '1', '999999999', null);
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('100007', '角色资源编号', '10', '0', '1', '999999999', null);
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('100008', '资源编号', '10', '0', '1', '999999999', null);
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('100009', '菜单编号', '10', '0', '1', '999999999', null);
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('100011', '错误号管理', '10', '1', '1', '999999999', null);
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('100012', '测试号管理', '10', '1', '1', '999999999', null);
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('100010', '功能号管理', '10', '1', '1', '999999999', null);
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('100013', '字典条目编号', '10', '1', '1', '999999999', null);
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('100014', '系统参数编号', '10', '1', '1', '999999999', '系统参数编号标识');
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('900001', '流程测试', '10', '0', '1', '9999999999', null);
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('100016', '角色数据权限编号', '10', '0', '1', '999999999', null);
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('100015', '消息编号', '10', '0', '1', '999999999', null);
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('100017', '数据权限编号', '10', '0', '1', '999999999', null);
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('500001', '警员编号', '10', '1', '1', '999999999', null);
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('200002', '对象标识', '16', '1', '1000000000000000', '9999999999999998', null);
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('200003', '相片编号', '22', '1', '1', '-1', null);
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('600006', '照片编号', '10', '1', '1', '9999999', null);
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('200001', 'OBJID', '14', '0', '1', '99999999999999', '用于生成OBJID编号');
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('200009', '空间类型编号', '12', '0', '1', '999999999', '空间类型编号');
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('200010', '法律文书图片编号', '14', '0', '1', '99999999999999', null);
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('200005', 'OBJID_H', '14', '0', '1', '99999999999999', '生成历史表id');
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('200008', '存放区域编号', '12', '0', '1', '999999999999', '存放区域编号');
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('200012', 'CAID', '9', '1', '0', '999999999', '清单编号，对应操作表的CAID字段');
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('200013', '物品编号', '6', '1', '0', '999999', '涉案物品编号');
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('100000', '物品单位id', '6', '1', '0', '999999', null);
INSERT INTO `SYS_MAX_ID_TYPE` VALUES ('200014', '临时CASE_ID', '10', '0', '1', '9999999999', '临时物品登记时生成的CASE_ID');
COMMIT;



