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
--  Table structure for "SYS_DEPT"
-- ----------------------------
DROP TABLE "SYS_DEPT";
CREATE TABLE "SYS_DEPT" (   "DEPT_ID" VARCHAR2(12CHAR) NOT NULL, "DEPT_NAME" VARCHAR2(64CHAR) NOT NULL, "DEPT_LEVEL" VARCHAR2(1CHAR) NOT NULL, "TREE_LEVEL" NUMBER(16,0) NOT NULL, "PARENT_DEPT_ID" VARCHAR2(12CHAR) NOT NULL, "ORDER_FLAG" NUMBER(16,0) NOT NULL, "TEL" VARCHAR2(20CHAR), "FAX" VARCHAR2(20CHAR), "IS_MAIN_DEPT" VARCHAR2(1CHAR) NOT NULL, "CUNITID" VARCHAR2(12CHAR), "SUNITID" VARCHAR2(12CHAR), "TUNITID" VARCHAR2(12CHAR), "DATA_CUNITID" VARCHAR2(12CHAR), "DATA_SUNITID" VARCHAR2(12CHAR), "DATA_TUNITID" VARCHAR2(12CHAR), "RESERVE1" VARCHAR2(100CHAR), "RESERVE2" VARCHAR2(100CHAR), "RESERVE3" VARCHAR2(100CHAR), "RESERVE4" VARCHAR2(100CHAR), "RESERVE5" VARCHAR2(100CHAR), "MANAGER" VARCHAR2(30CHAR), "DEPT_TYPE" VARCHAR2(2CHAR), "MEMO" VARCHAR2(128CHAR), "ADD_USER_ID" NUMBER(16,0) NOT NULL, "ADD_USER_NAME" VARCHAR2(30CHAR) NOT NULL, "ADD_TIME" DATE NOT NULL, "MODIFY_USER_ID" NUMBER(16,0), "MODIFY_USER_NAME" VARCHAR2(30CHAR), "MODIFY_TIME" DATE);
COMMENT ON COLUMN "SYS_DEPT"."DEPT_ID" IS '部门标识号';
COMMENT ON COLUMN "SYS_DEPT"."DEPT_NAME" IS '部门名称';
COMMENT ON COLUMN "SYS_DEPT"."DEPT_LEVEL" IS '部门级别';
COMMENT ON COLUMN "SYS_DEPT"."TREE_LEVEL" IS '机构树级别';
COMMENT ON COLUMN "SYS_DEPT"."PARENT_DEPT_ID" IS '上级部门标识号';
COMMENT ON COLUMN "SYS_DEPT"."ORDER_FLAG" IS '排序';
COMMENT ON COLUMN "SYS_DEPT"."TEL" IS '电话';
COMMENT ON COLUMN "SYS_DEPT"."FAX" IS '传真';
COMMENT ON COLUMN "SYS_DEPT"."IS_MAIN_DEPT" IS '是否为主管单位';
COMMENT ON COLUMN "SYS_DEPT"."CUNITID" IS '所属市局';
COMMENT ON COLUMN "SYS_DEPT"."SUNITID" IS '所属分局';
COMMENT ON COLUMN "SYS_DEPT"."TUNITID" IS '所属派出所';
COMMENT ON COLUMN "SYS_DEPT"."DATA_CUNITID" IS '数据归属市局';
COMMENT ON COLUMN "SYS_DEPT"."DATA_SUNITID" IS '数据归属分局';
COMMENT ON COLUMN "SYS_DEPT"."DATA_TUNITID" IS '数据归属派出所';
COMMENT ON COLUMN "SYS_DEPT"."RESERVE1" IS '预留字段1';
COMMENT ON COLUMN "SYS_DEPT"."RESERVE2" IS '预留字段2';
COMMENT ON COLUMN "SYS_DEPT"."RESERVE3" IS '预留字段3';
COMMENT ON COLUMN "SYS_DEPT"."RESERVE4" IS '预留字段4';
COMMENT ON COLUMN "SYS_DEPT"."RESERVE5" IS '预留字段5';
COMMENT ON COLUMN "SYS_DEPT"."MANAGER" IS '负责人';
COMMENT ON COLUMN "SYS_DEPT"."DEPT_TYPE" IS '部门类型';
COMMENT ON COLUMN "SYS_DEPT"."MEMO" IS '备注';
COMMENT ON COLUMN "SYS_DEPT"."ADD_USER_ID" IS '录入用户编号';
COMMENT ON COLUMN "SYS_DEPT"."ADD_USER_NAME" IS '录入用户姓名';
COMMENT ON COLUMN "SYS_DEPT"."ADD_TIME" IS '录入时间';
COMMENT ON COLUMN "SYS_DEPT"."MODIFY_USER_ID" IS '修改用户编号';
COMMENT ON COLUMN "SYS_DEPT"."MODIFY_USER_NAME" IS '修改用户姓名';
COMMENT ON COLUMN "SYS_DEPT"."MODIFY_TIME" IS '修改时间';

-- ----------------------------
--  Records of "SYS_DEPT"
-- ----------------------------
INSERT INTO "SYS_DEPT" VALUES ('420111010000', 'add_dept_test', '4', '4', '420111000000', '0', '1', '2', '0', '420100000000', '420111000000', '420111620000', null, null, null, null, null, null, null, null, null, null, null, '5', '超级管理员', TO_DATE('2016-10-22 11:58:06','YYYY-MM-DD HH24:MI:SS'), null, null, null);
INSERT INTO "SYS_DEPT" VALUES ('420111010002', 'add_dept_test', '4', '4', '420111000000', '0', '1', '2', '0', '420100000000', '420111000000', '420111620000', null, null, null, null, null, null, null, null, null, null, null, '5', '超级管理员', TO_DATE('2016-10-22 12:01:11','YYYY-MM-DD HH24:MI:SS'), null, null, null);
INSERT INTO "SYS_DEPT" VALUES ('420100000000', '武汉市公安局', '2', '2', '420000000000', '0', null, null, '1', '420100000000', null, null, null, null, null, null, null, null, null, null, null, null, null, '5', '超级管理员', TO_DATE('2015-11-11 15:31:11','YYYY-MM-DD HH24:MI:SS'), null, null, null);
INSERT INTO "SYS_DEPT" VALUES ('420100210100', '市局法制支队', '3', '3', '420100000000', '0', null, null, '1', '420100000000', '420100210100', null, null, null, null, null, null, null, null, null, null, null, null, '5', '超级管理员', TO_DATE('2015-11-11 15:31:11','YYYY-MM-DD HH24:MI:SS'), '5', '超级管理员', TO_DATE('2015-11-19 15:47:10','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO "SYS_DEPT" VALUES ('420105000000', '武汉市公安局汉阳分局', '3', '3', '420100000000', '0', null, null, '1', '420100000000', '420105000000', null, null, null, null, null, null, null, null, null, null, null, null, '5', '超级管理员', TO_DATE('2015-11-11 15:31:11','YYYY-MM-DD HH24:MI:SS'), '5', '超级管理员', TO_DATE('2015-11-19 16:20:47','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO "SYS_DEPT" VALUES ('420105630000', '武汉市公安局汉阳分局晴川街派出所', '4', '4', '420105000000', '0', null, null, '1', '420100000000', '420105000000', '420105630000', null, null, null, null, null, null, null, null, null, null, null, '5', '超级管理员', TO_DATE('2015-11-11 15:31:11','YYYY-MM-DD HH24:MI:SS'), '5', '超级管理员', TO_DATE('2015-11-19 16:20:40','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO "SYS_DEPT" VALUES ('100000000000', 'PKUSOFT', '0', '0', '0', '0', null, null, '1', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '1', 'admin', TO_DATE('2013-08-16 00:00:00','YYYY-MM-DD HH24:MI:SS'), null, null, null);
INSERT INTO "SYS_DEPT" VALUES ('420000000000', '湖北省公安厅', '1', '1', '100000000000', '0', null, null, '1', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '5', '超级管理员', TO_DATE('2013-08-18 21:25:11','YYYY-MM-DD HH24:MI:SS'), '5', '超级管理员', TO_DATE('2014-05-18 21:00:46','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO "SYS_DEPT" VALUES ('420111620000', '武汉市公安局洪山分局洪山派出所', '4', '4', '420111000000', '0', null, null, '1', '420100000000', '420111000000', '420111620000', null, null, null, null, null, null, null, null, null, null, null, '5', '超级管理员', TO_DATE('2015-12-03 17:24:30','YYYY-MM-DD HH24:MI:SS'), null, null, null);
INSERT INTO "SYS_DEPT" VALUES ('420111000000', '武汉市公安局洪山分局', '3', '3', '420100000000', '0', null, null, '1', '420100000000', '420111000000', null, null, null, null, null, null, null, null, null, null, null, null, '5', '超级管理员', TO_DATE('2015-12-03 17:23:22','YYYY-MM-DD HH24:MI:SS'), null, null, null);
COMMIT;

-- ----------------------------
--  Primary key structure for table "SYS_DEPT"
-- ----------------------------
ALTER TABLE "SYS_DEPT" ADD CONSTRAINT "PK_SYS_DEPT" PRIMARY KEY("DEPT_ID");

-- ----------------------------
--  Comment for table "SYS_DEPT"
-- ----------------------------
COMMENT ON TABLE "SYS_DEPT" IS '部门表';

