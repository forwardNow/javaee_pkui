
USE PKUI;
/*
 Navicat Oracle Data Transfer

 Source Server         : gdbaweb
 Source Server Version : 112010
 Source Host           : 27.17.3.62
 Source Schema         : PKUWH_GDBAWEB

 Target Server Version : 112010
 File Encoding         : utf-8

 Date: 03/10/2017 11:41:21 AM
*/

-- ----------------------------
--  Table structure for `SYS_DIC_LIST` '字典表'
-- ----------------------------
CREATE TABLE `SYS_DIC_LIST` (   
	`DIC_NAME` VARCHAR(64) NOT NULL COMMENT '字典名称' , 
	`DIC_DESC` VARCHAR(128) COMMENT '字典描述' , 
	`DIC_STANDARD` VARCHAR(128) COMMENT '字典标准' , 
	`PARENT_DIC` VARCHAR(64) COMMENT '父字典' , 
	`ORDER_FLAG` INT(16) NOT NULL COMMENT '字典显示顺序' , 
	`EDITABLE` VARCHAR(1) NOT NULL COMMENT '是否可编辑' , 
	`VISIABLE` VARCHAR(1) NOT NULL COMMENT '是否有用' , 
	`MEMO` VARCHAR(128) COMMENT '备注' , 
	`RESERVE1` VARCHAR(100) COMMENT '预留字段1' , 
	`RESERVE2` VARCHAR(100) COMMENT '预留字段2' , 
	`RESERVE3` VARCHAR(100) COMMENT '预留字段3' , 
	`RESERVE4` VARCHAR(100) COMMENT '预留字段4' , 
	`RESERVE5` VARCHAR(100) COMMENT '预留字段5' , 
	`ADD_USER_ID` INT(16) COMMENT '录入用户编号' , 
	`ADD_USER_NAME` VARCHAR(30) COMMENT '录入用户姓名' , 
	`ADD_TIME` DATETIME COMMENT '录入时间' , 
	`MODIFY_USER_ID` INT(16) COMMENT '修改用户编号' , 
	`MODIFY_USER_NAME` VARCHAR(30) COMMENT '修改用户姓名' , 
	`MODIFY_TIME` DATETIME COMMENT '修改时间' ,	 
	    PRIMARY KEY (`DIC_NAME`)
	)  DEFAULT CHARSET=UTF8;	

COMMIT;
-- ----------------------------
--  Records of `SYS_DIC_LIST`
-- ----------------------------
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_WORKSTYPE', '职务类别', '职务类别', null, '1', '1', '1', null, null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2016-09-20 18:05:40','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_GENDER', '性别', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CODE', '行政区划', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CASE_REASON', '案由', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CASE_SORT', '案件类别', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_EDUCATION', '文化程度', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CODE#42', '行政区划#湖北', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CODE#43', '行政区划#湖南', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_OCCUPATION', '职业', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_MARRIAGE', '婚姻状况', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_NATIVE', '民族', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_LOCUSAREA', '所在地区', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CLAN', '政治面貌', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_LOGOUT_STATUS', '注销状态', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_YESORNO', '是否', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_NATIONALITY', '国籍', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_OTHERPAPERNAME', '证件类型', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CASE_SOURCE', '案件来源', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CASESTATE', '案件状态', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CASE_LEVEL', '案件级别', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CODE#31', '行政区划#上海', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CODE#11', '行政区划#北京', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CODE#12', '行政区划#天津', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CODE#13', '行政区划#河北', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CODE#14', '行政区划#山西', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CODE#15', '行政区划#内蒙古', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CODE#21', '行政区划#辽宁', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CODE#22', '行政区划#吉林', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CODE#23', '行政区划#黑龙江', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CODE#32', '行政区划#江苏', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CODE#33', '行政区划#浙江', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CODE#34', '行政区划#安徽', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CODE#35', '行政区划#福建', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CODE#36', '行政区划#江苏', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CODE#37', '行政区划#山东', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CODE#41', '行政区划#河南', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CODE#44', '行政区划#广东', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CODE#45', '行政区划#广西', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CODE#46', '行政区划#海南', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CODE#50', '行政区划#重庆', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CODE#51', '行政区划#四川', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CODE#52', '行政区划#贵州', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CODE#53', '行政区划#云南', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CODE#54', '行政区划#西藏', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CODE#61', '行政区划#陕西', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CODE#62', '行政区划#甘肃', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CODE#63', '行政区划#青海', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CODE#64', '行政区划#宁夏', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CODE#65', '行政区划#新疆', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_IDPARA', '最大编号配置参数', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_DICEDITABLE', '字典修改权限', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_BAPHASE', '办案阶段', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_YEAR', '年份', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_F_OPTYPE', '操作类型', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_F_OBJECT', '物品类型', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_F_OBJ_STATUS', '涉案物品状态', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_F_W_TYPE', '涉案财务文书类型字典', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_F_EXTRACTTYPE', '物品提取类型', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_F_CASESORT', '涉案财物案件类型', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_F_XZ_OPTYPE', '行政案件物品提取类型', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_F_OBJ_DO', '涉案财物处理类型字典', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_F_PAPERTYPE', '文书类型字典', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_F_DUTY', '身份', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_F_INVOLVEDTYPE', '物品涉案类型', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_PLACE_TYPE', '存放地点类型', null, null, '1', '1', '1', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CWYCQK', '财物异常情况', null, null, '1', '1', '1', null, null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-11-23 19:31:26','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_PERMIT_TYPE', '数据权限类型', null, null, '1', '1', '1', null, null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2013-08-21 11:26:48','%Y-%m-%d %H:%i:%s'), '5', '超级管理员', STR_TO_DATE('2013-09-23 16:57:31','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_WPDW', '涉案物品数量单位', null, null, '1', '1', '1', null, null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-12-08 10:43:54','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_LOG_TYPE', '日志类型', null, null, '1', '1', '1', null, null, null, null, null, null, '5', '管理员', STR_TO_DATE('2013-07-05 11:53:00','%Y-%m-%d %H:%i:%s'), '5', '管理员', STR_TO_DATE('2013-07-05 11:53:46','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_DEPT_LEVEL', '单位级别字典', null, null, '1', '1', '1', null, null, null, null, null, null, '5', '管理员', STR_TO_DATE('2013-07-04 13:19:26','%Y-%m-%d %H:%i:%s'), '5', '管理员', STR_TO_DATE('2013-07-04 13:19:39','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_AREA_TYPE', '区域类型', null, null, '1', '1', '1', null, null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-11-24 14:58:43','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_USER_TYPE', '用户类型', null, null, '1', '1', '1', null, null, null, null, null, null, '5', '管理员', STR_TO_DATE('2013-07-05 11:58:12','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_CKSY', '物品调用出库事由', null, null, '1', '1', '1', null, null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2015-11-18 15:24:03','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_COMPANY_TYPES', '公司性质', null, null, '1', '1', '1', null, null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2016-05-05 11:59:55','%Y-%m-%d %H:%i:%s'), null, null, null);
INSERT INTO `SYS_DIC_LIST` VALUES ('DIC_OPT_TYPES', '经营范围', null, null, '1', '1', '1', null, null, null, null, null, null, '5', '超级管理员', STR_TO_DATE('2016-05-10 11:22:50','%Y-%m-%d %H:%i:%s'), null, null, null);

COMMIT;

