/*
 Navicat Oracle Data Transfer

 Source Server         : gdbaweb
 Source Server Version : 112010
 Source Host           : 27.17.3.62
 Source Schema         : PKUWH_GDBAWEB

 Target Server Version : 112010
 File Encoding         : utf-8

 Date: 03/10/2017 17:14:37 PM
*/

-- ----------------------------
--  Table structure for "SYS_USER"
-- ----------------------------
DROP TABLE "SYS_USER";
CREATE TABLE "SYS_USER" (   "USER_ID" NUMBER(16,0) NOT NULL, "LOGIN_NAME" VARCHAR2(30CHAR) NOT NULL, "USER_NAME" VARCHAR2(30CHAR) NOT NULL, "POLICE_CODE" VARCHAR2(6CHAR), "PASSWORD" VARCHAR2(64CHAR) NOT NULL, "SALT" VARCHAR2(64CHAR) NOT NULL, "DEPT_ID" VARCHAR2(12CHAR) NOT NULL, "USER_LEVEL" VARCHAR2(1CHAR) NOT NULL, "STATUS" VARCHAR2(1CHAR) NOT NULL, "USER_TYPE" VARCHAR2(2CHAR), "EMAIL" VARCHAR2(64CHAR), "TEL" VARCHAR2(20CHAR), "MOBILE" VARCHAR2(20CHAR), "IDCARD" VARCHAR2(18CHAR), "CERTIFICATE" VARCHAR2(128CHAR), "CUNITID" VARCHAR2(12CHAR), "SUNITID" VARCHAR2(12CHAR), "TUNITID" VARCHAR2(12CHAR), "RESERVE1" VARCHAR2(128CHAR), "RESERVE2" VARCHAR2(128CHAR), "RESERVE3" VARCHAR2(128CHAR), "RESERVE4" VARCHAR2(128CHAR), "RESERVE5" VARCHAR2(128CHAR), "MEMO" VARCHAR2(128CHAR), "ADD_USER_ID" NUMBER(16,0) NOT NULL, "ADD_USER_NAME" VARCHAR2(30CHAR) NOT NULL, "ADD_TIME" DATE NOT NULL, "MODIFY_USER_ID" NUMBER(16,0), "MODIFY_USER_NAME" VARCHAR2(30CHAR), "MODIFY_TIME" DATE);
COMMENT ON COLUMN "SYS_USER"."USER_ID" IS '用户标识号';
COMMENT ON COLUMN "SYS_USER"."LOGIN_NAME" IS '登录名';
COMMENT ON COLUMN "SYS_USER"."USER_NAME" IS '真实姓名';
COMMENT ON COLUMN "SYS_USER"."POLICE_CODE" IS '警号';
COMMENT ON COLUMN "SYS_USER"."PASSWORD" IS '密码';
COMMENT ON COLUMN "SYS_USER"."SALT" IS '密码盐值';
COMMENT ON COLUMN "SYS_USER"."DEPT_ID" IS '所属单位标识号';
COMMENT ON COLUMN "SYS_USER"."USER_LEVEL" IS '用户级别';
COMMENT ON COLUMN "SYS_USER"."STATUS" IS '状态';
COMMENT ON COLUMN "SYS_USER"."USER_TYPE" IS '用户类型';
COMMENT ON COLUMN "SYS_USER"."EMAIL" IS '邮箱';
COMMENT ON COLUMN "SYS_USER"."TEL" IS '电话号码';
COMMENT ON COLUMN "SYS_USER"."MOBILE" IS '手机号码';
COMMENT ON COLUMN "SYS_USER"."IDCARD" IS '身份证号';
COMMENT ON COLUMN "SYS_USER"."CERTIFICATE" IS '数字证书编码';
COMMENT ON COLUMN "SYS_USER"."CUNITID" IS '数据归属市局';
COMMENT ON COLUMN "SYS_USER"."SUNITID" IS '数据归属分局';
COMMENT ON COLUMN "SYS_USER"."TUNITID" IS '数据归属派出所';
COMMENT ON COLUMN "SYS_USER"."RESERVE1" IS '保留字段1';
COMMENT ON COLUMN "SYS_USER"."RESERVE2" IS '保留字段2';
COMMENT ON COLUMN "SYS_USER"."RESERVE3" IS '保留字段3';
COMMENT ON COLUMN "SYS_USER"."RESERVE4" IS '保留字段4';
COMMENT ON COLUMN "SYS_USER"."RESERVE5" IS '保留字段5';
COMMENT ON COLUMN "SYS_USER"."MEMO" IS '备注';
COMMENT ON COLUMN "SYS_USER"."ADD_USER_ID" IS '录入用户编号';
COMMENT ON COLUMN "SYS_USER"."ADD_USER_NAME" IS '录入用户姓名';
COMMENT ON COLUMN "SYS_USER"."ADD_TIME" IS '录入时间';
COMMENT ON COLUMN "SYS_USER"."MODIFY_USER_ID" IS '修改用户编号';
COMMENT ON COLUMN "SYS_USER"."MODIFY_USER_NAME" IS '修改用户姓名';
COMMENT ON COLUMN "SYS_USER"."MODIFY_TIME" IS '修改时间';

-- ----------------------------
--  Records of "SYS_USER"
-- ----------------------------
INSERT INTO "SYS_USER" VALUES ('257', 'luck', '喂', '002345', '8d259473b3015cb7af19063cab4d4fbe81305e51', 'a', '420105630000', '4', '1', '1', null, null, null, null, null, '420100000000', '420105000000', '420105630000', null, null, null, null, null, null, '5', '超级管理员', TO_DATE('2015-12-21 09:43:31','YYYY-MM-DD HH24:MI:SS'), '5', '超级管理员', TO_DATE('2015-12-25 10:30:45','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO "SYS_USER" VALUES ('93', 'userfortest', 'userfortest', 'uft', '8d259473b3015cb7af19063cab4d4fbe81305e51', 'a', '420100210100', '3', '1', '1', null, null, null, null, null, '420100000000', '420100210100', null, null, null, null, null, null, null, '5', '超级管理员', TO_DATE('2014-03-05 15:33:05','YYYY-MM-DD HH24:MI:SS'), '5', '超级管理员', TO_DATE('2015-11-19 16:06:17','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO "SYS_USER" VALUES ('5', 'admin', '超级管理员', 'admin', '8d259473b3015cb7af19063cab4d4fbe81305e51', 'a', '420100000000', '2', '1', '2', null, null, null, null, null, null, null, null, null, null, null, null, null, null, '5', '超级管理员', TO_DATE('2013-08-16 00:00:00','YYYY-MM-DD HH24:MI:SS'), '5', '超级管理员', TO_DATE('2014-05-18 20:53:28','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO "SYS_USER" VALUES ('247', 'hyfj', '汉阳分局', '001002', '8d259473b3015cb7af19063cab4d4fbe81305e51', 'a', '420105000000', '3', '1', '1', null, null, null, null, null, '420100000000', '420105000000', null, null, null, null, null, null, null, '5', '超级管理员', TO_DATE('2015-11-19 16:08:50','YYYY-MM-DD HH24:MI:SS'), '5', '超级管理员', TO_DATE('2015-11-19 16:22:09','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO "SYS_USER" VALUES ('248', 'admin_fj', '分局系统管理员', '001003', '8d259473b3015cb7af19063cab4d4fbe81305e51', 'a', '420105000000', '3', '1', '1', null, null, null, null, null, '420100000000', '420105000000', null, null, null, null, null, null, null, '5', '超级管理员', TO_DATE('2015-11-19 16:09:29','YYYY-MM-DD HH24:MI:SS'), null, null, null);
INSERT INTO "SYS_USER" VALUES ('249', 'pcs', '派出所保管员', '001004', '8d259473b3015cb7af19063cab4d4fbe81305e51', 'a', '420105630000', '4', '1', '1', null, null, null, null, null, '420100000000', '420105000000', '420105630000', null, null, null, null, null, null, '5', '超级管理员', TO_DATE('2015-11-19 16:22:53','YYYY-MM-DD HH24:MI:SS'), '5', '超级管理员', TO_DATE('2015-12-23 13:47:31','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO "SYS_USER" VALUES ('250', 'admin_pcs', '派出所系统管理员', '001005', '8d259473b3015cb7af19063cab4d4fbe81305e51', 'a', '420105630000', '4', '1', '1', null, null, null, null, null, '420100000000', '420105000000', '420105630000', null, null, null, null, null, null, '5', '超级管理员', TO_DATE('2015-11-19 16:23:58','YYYY-MM-DD HH24:MI:SS'), null, null, null);
INSERT INTO "SYS_USER" VALUES ('251', 'whsj', '武汉市局保管员', '001006', '8d259473b3015cb7af19063cab4d4fbe81305e51', 'a', '420100000000', '2', '1', '1', null, null, null, null, null, '420100000000', null, null, null, null, null, null, null, null, '5', '超级管理员', TO_DATE('2015-11-19 16:24:39','YYYY-MM-DD HH24:MI:SS'), null, null, null);
INSERT INTO "SYS_USER" VALUES ('252', 'wlsmz', '物流实名制', '002002', '8d259473b3015cb7af19063cab4d4fbe81305e51', 'a', '420100000000', '2', '1', '1', null, null, null, null, null, '420100000000', null, null, null, null, null, null, null, null, '5', '超级管理员', TO_DATE('2015-11-19 16:35:02','YYYY-MM-DD HH24:MI:SS'), null, null, null);
INSERT INTO "SYS_USER" VALUES ('262', 'pcsmj', '民警', '021548', '8d259473b3015cb7af19063cab4d4fbe81305e51', 'a', '420105630000', '4', '1', '1', null, null, null, null, null, '420100000000', '420105000000', '420105630000', null, null, null, null, null, null, '5', '超级管理员', TO_DATE('2015-12-23 13:46:40','YYYY-MM-DD HH24:MI:SS'), null, null, null);
INSERT INTO "SYS_USER" VALUES ('263', 'zoro', 'zoro', 'zoro', '8d259473b3015cb7af19063cab4d4fbe81305e51', 'a', '420100000000', '2', '1', '1', null, null, null, null, null, '420100000000', null, null, null, null, null, null, null, null, '5', '超级管理员', TO_DATE('2015-12-30 14:09:15','YYYY-MM-DD HH24:MI:SS'), null, null, null);
INSERT INTO "SYS_USER" VALUES ('255', 'Masaka', 'aa', '023456', '8d259473b3015cb7af19063cab4d4fbe81305e51', 'a', '420105630000', '4', '1', '1', null, null, null, null, null, '420100000000', '420105000000', '420105630000', null, null, null, null, null, null, '5', '超级管理员', TO_DATE('2015-12-14 10:33:33','YYYY-MM-DD HH24:MI:SS'), '5', '超级管理员', TO_DATE('2015-12-14 11:01:56','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO "SYS_USER" VALUES ('253', 'hspcs', '王志华', '019747', '8d259473b3015cb7af19063cab4d4fbe81305e51', 'a', '420111620000', '4', '1', '1', null, null, null, null, null, '420100000000', '420111000000', '420111620000', null, null, null, null, null, null, '5', '超级管理员', TO_DATE('2015-12-03 17:27:08','YYYY-MM-DD HH24:MI:SS'), null, null, null);
INSERT INTO "SYS_USER" VALUES ('254', 'hsfj', '袁德和', '019976', '8d259473b3015cb7af19063cab4d4fbe81305e51', 'a', '420111000000', '3', '1', '1', null, null, null, null, null, '420100000000', '420111000000', null, null, null, null, null, null, null, '5', '超级管理员', TO_DATE('2015-12-03 17:29:12','YYYY-MM-DD HH24:MI:SS'), '5', '超级管理员', TO_DATE('2015-12-03 17:29:25','YYYY-MM-DD HH24:MI:SS'));
COMMIT;

-- ----------------------------
--  Primary key structure for table "SYS_USER"
-- ----------------------------
ALTER TABLE "SYS_USER" ADD CONSTRAINT "PK_SYS_USER" PRIMARY KEY("USER_ID");

-- ----------------------------
--  Indexes structure for table "SYS_USER"
-- ----------------------------
CREATE UNIQUE INDEX I_SYS_USER_USER_NAME ON SYS_USER (LOGIN_NAME ASC) TABLESPACE TS_GDBAWEB_SYS_INDEX LOGGING VISIBLE PCTFREE 10 INITRANS 2 MAXTRANS 255 STORAGE( INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645);

-- ----------------------------
--  Comment for table "SYS_USER"
-- ----------------------------
COMMENT ON TABLE "SYS_USER" IS '用户表';

