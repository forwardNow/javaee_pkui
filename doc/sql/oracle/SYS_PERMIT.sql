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
--  Table structure for "SYS_PERMIT"
-- ----------------------------
DROP TABLE "SYS_PERMIT";
CREATE TABLE "SYS_PERMIT" (   "PERMIT_ID" NUMBER(16,0) NOT NULL, "PERMIT_NAME" VARCHAR2(64CHAR) NOT NULL, "PERMIT_CODE" VARCHAR2(6CHAR) NOT NULL, "PERMIT_VALUE" VARCHAR2(128CHAR) NOT NULL, "PERMIT_DESC" VARCHAR2(128CHAR), "ORDER_FLAG" NUMBER(16,0) NOT NULL, "RESERVE1" VARCHAR2(128CHAR), "RESERVE2" VARCHAR2(128CHAR), "RESERVE3" VARCHAR2(128CHAR), "RESERVE4" VARCHAR2(128CHAR), "RESERVE5" VARCHAR2(128CHAR), "ADD_USER_ID" NUMBER(16,0) NOT NULL, "ADD_USER_NAME" VARCHAR2(30CHAR) NOT NULL, "ADD_TIME" DATE NOT NULL, "MODIFY_USER_ID" NUMBER(16,0), "MODIFY_USER_NAME" VARCHAR2(30CHAR), "MODIFY_TIME" DATE);
COMMENT ON COLUMN "SYS_PERMIT"."PERMIT_ID" IS '数据权限标识号';
COMMENT ON COLUMN "SYS_PERMIT"."PERMIT_NAME" IS '数据权限名称';
COMMENT ON COLUMN "SYS_PERMIT"."PERMIT_CODE" IS '数据权限编码';
COMMENT ON COLUMN "SYS_PERMIT"."PERMIT_VALUE" IS '数据权限值';
COMMENT ON COLUMN "SYS_PERMIT"."PERMIT_DESC" IS '描述';
COMMENT ON COLUMN "SYS_PERMIT"."ORDER_FLAG" IS '排序';
COMMENT ON COLUMN "SYS_PERMIT"."RESERVE1" IS '保留字段1';
COMMENT ON COLUMN "SYS_PERMIT"."RESERVE2" IS '保留字段2';
COMMENT ON COLUMN "SYS_PERMIT"."RESERVE3" IS '保留字段3';
COMMENT ON COLUMN "SYS_PERMIT"."RESERVE4" IS '保留字段4';
COMMENT ON COLUMN "SYS_PERMIT"."RESERVE5" IS '保留字段5';
COMMENT ON COLUMN "SYS_PERMIT"."ADD_USER_ID" IS '录入用户编号';
COMMENT ON COLUMN "SYS_PERMIT"."ADD_USER_NAME" IS '录入用户姓名';
COMMENT ON COLUMN "SYS_PERMIT"."ADD_TIME" IS '录入时间';
COMMENT ON COLUMN "SYS_PERMIT"."MODIFY_USER_ID" IS '修改用户编号';
COMMENT ON COLUMN "SYS_PERMIT"."MODIFY_USER_NAME" IS '修改用户姓名';
COMMENT ON COLUMN "SYS_PERMIT"."MODIFY_TIME" IS '修改时间';

-- ----------------------------
--  Records of "SYS_PERMIT"
-- ----------------------------
INSERT INTO "SYS_PERMIT" VALUES ('34', '查派出所场所、区域、空间', '200002', 'TSTATIONID=${deptId}', null, '7', null, null, null, null, null, '5', '超级管理员', TO_DATE('2015-12-07 17:54:37','YYYY-MM-DD HH24:MI:SS'), null, null, null);
INSERT INTO "SYS_PERMIT" VALUES ('35', '查本分局（包括辖区派出所）场所、区域、空间', '200002', 'SSTATIONID=${deptId}', null, '8', null, null, null, null, null, '5', '超级管理员', TO_DATE('2015-12-07 17:55:13','YYYY-MM-DD HH24:MI:SS'), null, null, null);
INSERT INTO "SYS_PERMIT" VALUES ('36', '查本市局（包括辖区分局和派出所）场所、区域、空间', '200002', 'CSTATIONID=${deptId}', null, '9', null, null, null, null, null, '5', '超级管理员', TO_DATE('2015-12-07 17:55:53','YYYY-MM-DD HH24:MI:SS'), null, null, null);
INSERT INTO "SYS_PERMIT" VALUES ('28', '办理全库数据业务', '200001', '1=1', null, '1', null, null, null, null, null, '5', '超级管理员', TO_DATE('2015-11-16 11:24:13','YYYY-MM-DD HH24:MI:SS'), '5', '超级管理员', TO_DATE('2015-11-16 11:27:35','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO "SYS_PERMIT" VALUES ('29', '办理全市局数据业务', '200001', 'CSTATIONID=${deptId}', null, '2', null, null, null, null, null, '5', '超级管理员', TO_DATE('2015-11-16 11:26:11','YYYY-MM-DD HH24:MI:SS'), '5', '超级管理员', TO_DATE('2015-11-16 11:27:45','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO "SYS_PERMIT" VALUES ('30', '办理全分局数据业务', '200001', 'SSTATIONID=${deptId}', null, '3', null, null, null, null, null, '5', '超级管理员', TO_DATE('2015-11-16 11:26:41','YYYY-MM-DD HH24:MI:SS'), '5', '超级管理员', TO_DATE('2015-11-16 11:27:53','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO "SYS_PERMIT" VALUES ('31', '办理全派出所数据业务', '200001', 'TSTATIONID=${deptId}', null, '4', null, null, null, null, null, '5', '超级管理员', TO_DATE('2015-11-16 11:27:20','YYYY-MM-DD HH24:MI:SS'), '5', '超级管理员', TO_DATE('2015-11-16 11:28:01','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO "SYS_PERMIT" VALUES ('32', '支队用户查办理全市局数据业务', '200001', 'CSTATIONID=${cunitid}', null, '5', null, null, null, null, null, '5', '超级管理员', TO_DATE('2015-11-16 12:43:04','YYYY-MM-DD HH24:MI:SS'), null, null, null);
INSERT INTO "SYS_PERMIT" VALUES ('33', '查本单位场所、区域、空间', '200002', 'OPUNITID=${deptId}', null, '6', null, null, null, null, null, '5', '超级管理员', TO_DATE('2015-11-23 19:46:03','YYYY-MM-DD HH24:MI:SS'), '5', '超级管理员', TO_DATE('2015-12-07 17:53:30','YYYY-MM-DD HH24:MI:SS'));
COMMIT;

-- ----------------------------
--  Primary key structure for table "SYS_PERMIT"
-- ----------------------------
ALTER TABLE "SYS_PERMIT" ADD CONSTRAINT "PK_SYS_PERMIT" PRIMARY KEY("PERMIT_ID");

-- ----------------------------
--  Comment for table "SYS_PERMIT"
-- ----------------------------
COMMENT ON TABLE "SYS_PERMIT" IS '数据权限表';

