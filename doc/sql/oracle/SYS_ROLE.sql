/*
 Navicat Oracle Data Transfer

 Source Server         : gdbaweb
 Source Server Version : 112010
 Source Host           : 27.17.3.62
 Source Schema         : PKUWH_GDBAWEB

 Target Server Version : 112010
 File Encoding         : utf-8

 Date: 03/10/2017 15:26:37 PM
*/

-- ----------------------------
--  Table structure for "SYS_ROLE"
-- ----------------------------
DROP TABLE "SYS_ROLE";
CREATE TABLE "SYS_ROLE" (   "ROLE_ID" NUMBER(16,0) NOT NULL, "ROLE_NAME" VARCHAR2(64CHAR) NOT NULL, "ROLE_LEVEL" VARCHAR2(1CHAR) NOT NULL, "ROLE_DERC" VARCHAR2(128CHAR) NOT NULL, "ORDER_FLAG" NUMBER(16,0), "RESERVE1" VARCHAR2(128CHAR), "RESERVE2" VARCHAR2(128CHAR), "RESERVE3" VARCHAR2(128CHAR), "RESERVE4" VARCHAR2(128CHAR), "RESERVE5" VARCHAR2(128CHAR), "ADD_USER_ID" NUMBER(16,0) NOT NULL, "ADD_USER_NAME" VARCHAR2(30CHAR) NOT NULL, "ADD_TIME" DATE NOT NULL, "MODIFY_USER_ID" NUMBER(16,0), "MODIFY_USER_NAME" VARCHAR2(30CHAR), "MODIFY_TIME" DATE);
COMMENT ON COLUMN "SYS_ROLE"."ROLE_ID" IS '角色标识号';
COMMENT ON COLUMN "SYS_ROLE"."ROLE_NAME" IS '角色名称';
COMMENT ON COLUMN "SYS_ROLE"."ROLE_LEVEL" IS '角色级别';
COMMENT ON COLUMN "SYS_ROLE"."ROLE_DERC" IS '角色描述';
COMMENT ON COLUMN "SYS_ROLE"."ORDER_FLAG" IS '角色排序';
COMMENT ON COLUMN "SYS_ROLE"."RESERVE1" IS '保留字段1';
COMMENT ON COLUMN "SYS_ROLE"."RESERVE2" IS '保留字段2';
COMMENT ON COLUMN "SYS_ROLE"."RESERVE3" IS '保留字段3';
COMMENT ON COLUMN "SYS_ROLE"."RESERVE4" IS '保留字段4';
COMMENT ON COLUMN "SYS_ROLE"."RESERVE5" IS '保留字段5';
COMMENT ON COLUMN "SYS_ROLE"."ADD_USER_ID" IS '录入用户编号';
COMMENT ON COLUMN "SYS_ROLE"."ADD_USER_NAME" IS '录入用户姓名';
COMMENT ON COLUMN "SYS_ROLE"."ADD_TIME" IS '录入时间';
COMMENT ON COLUMN "SYS_ROLE"."MODIFY_USER_ID" IS '修改用户编号';
COMMENT ON COLUMN "SYS_ROLE"."MODIFY_USER_NAME" IS '修改用户姓名';
COMMENT ON COLUMN "SYS_ROLE"."MODIFY_TIME" IS '修改时间';

-- ----------------------------
--  Records of "SYS_ROLE"
-- ----------------------------
INSERT INTO "SYS_ROLE" VALUES ('25', '超级管理员', '0', '超级管理员', '1', null, null, null, null, null, '5', '张三力', TO_DATE('2013-06-25 14:20:20','YYYY-MM-DD HH24:MI:SS'), '5', '超级管理员', TO_DATE('2015-11-13 13:20:52','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO "SYS_ROLE" VALUES ('80', '派出所民警', '0', '派出所民警', '9', null, null, null, null, null, '5', '超级管理员', TO_DATE('2015-12-23 13:27:59','YYYY-MM-DD HH24:MI:SS'), null, null, null);
INSERT INTO "SYS_ROLE" VALUES ('74', '派出所保管员', '0', '派出所保管员', '13', null, null, null, null, null, '5', '超级管理员', TO_DATE('2015-11-13 13:22:32','YYYY-MM-DD HH24:MI:SS'), null, null, null);
COMMIT;

-- ----------------------------
--  Primary key structure for table "SYS_ROLE"
-- ----------------------------
ALTER TABLE "SYS_ROLE" ADD CONSTRAINT "PK_SYS_ROLE" PRIMARY KEY("ROLE_ID");

-- ----------------------------
--  Comment for table "SYS_ROLE"
-- ----------------------------
COMMENT ON TABLE "SYS_ROLE" IS '角色表';

