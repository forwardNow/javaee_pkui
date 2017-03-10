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
--  Table structure for "SYS_PARA"
-- ----------------------------
DROP TABLE "SYS_PARA";
CREATE TABLE "SYS_PARA" (   "PARA_CODE" VARCHAR2(16CHAR) NOT NULL, "PARA_NAME" VARCHAR2(64CHAR) NOT NULL, "PARA_VALUE" VARCHAR2(128CHAR) NOT NULL, "PARA_DESC" VARCHAR2(128CHAR), "VISIABLE" VARCHAR2(1CHAR) NOT NULL, "RESERVE1" VARCHAR2(100CHAR), "RESERVE2" VARCHAR2(100CHAR), "RESERVE3" VARCHAR2(100CHAR), "RESERVE4" VARCHAR2(100CHAR), "RESERVE5" VARCHAR2(100CHAR), "ADD_USER_ID" NUMBER(16,0) NOT NULL, "ADD_USER_NAME" VARCHAR2(30CHAR) NOT NULL, "ADD_TIME" DATE NOT NULL, "MODIFY_USER_ID" NUMBER(16,0), "MODIFY_USER_NAME" VARCHAR2(30CHAR), "MODIFY_TIME" DATE);
COMMENT ON COLUMN "SYS_PARA"."PARA_CODE" IS '参数编码';
COMMENT ON COLUMN "SYS_PARA"."PARA_NAME" IS '参数名称';
COMMENT ON COLUMN "SYS_PARA"."PARA_VALUE" IS '参数值';
COMMENT ON COLUMN "SYS_PARA"."PARA_DESC" IS '参数说明';
COMMENT ON COLUMN "SYS_PARA"."VISIABLE" IS '是否能编辑';
COMMENT ON COLUMN "SYS_PARA"."RESERVE1" IS '预留字段1';
COMMENT ON COLUMN "SYS_PARA"."RESERVE2" IS '预留字段2';
COMMENT ON COLUMN "SYS_PARA"."RESERVE3" IS '预留字段3';
COMMENT ON COLUMN "SYS_PARA"."RESERVE4" IS '预留字段4';
COMMENT ON COLUMN "SYS_PARA"."RESERVE5" IS '预留字段5';
COMMENT ON COLUMN "SYS_PARA"."ADD_USER_ID" IS '录入用户编号';
COMMENT ON COLUMN "SYS_PARA"."ADD_USER_NAME" IS '录入用户姓名';
COMMENT ON COLUMN "SYS_PARA"."ADD_TIME" IS '录入时间';
COMMENT ON COLUMN "SYS_PARA"."MODIFY_USER_ID" IS '修改用户编号';
COMMENT ON COLUMN "SYS_PARA"."MODIFY_USER_NAME" IS '修改用户姓名';
COMMENT ON COLUMN "SYS_PARA"."MODIFY_TIME" IS '修改时间';

-- ----------------------------
--  Records of "SYS_PARA"
-- ----------------------------
INSERT INTO "SYS_PARA" VALUES ('image_size', '图片尺寸', '674*252', '图片长与宽', '1', null, null, null, null, null, '5', '超级管理员', TO_DATE('2014-07-26 15:30:05','YYYY-MM-DD HH24:MI:SS'), null, null, null);
INSERT INTO "SYS_PARA" VALUES ('index_pictrue', '默认栏目id', '1', '首页图片id', '1', null, null, null, null, null, '5', '超级管理员', TO_DATE('2014-07-26 15:30:05','YYYY-MM-DD HH24:MI:SS'), null, null, null);
INSERT INTO "SYS_PARA" VALUES ('allow_image_ext', '允许上传的图片格式', '.png,.jpg,.gif,.jpeg', '允许上传的图片格式', '1', null, null, null, null, null, '5', '超级管理员', TO_DATE('2014-07-26 15:30:05','YYYY-MM-DD HH24:MI:SS'), null, null, null);
INSERT INTO "SYS_PARA" VALUES ('PPRINT_MAXNUM', '文书最大的打印行数', '12', '登记、出库、入库等等文书每页支持的最大物品数量。', '1', null, null, null, null, null, '5', '超级管理员', TO_DATE('2015-11-27 10:00:20','YYYY-MM-DD HH24:MI:SS'), '5', '超级管理员', TO_DATE('2015-12-25 16:14:32','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO "SYS_PARA" VALUES ('default_password', '初始密码', 'a', null, '1', null, null, null, null, null, '5', '超级管理员', TO_DATE('2015-12-22 17:48:03','YYYY-MM-DD HH24:MI:SS'), null, null, null);
INSERT INTO "SYS_PARA" VALUES ('PPRINT_STANUM', '文书节点起点编号', '5', null, '1', null, null, null, null, null, '5', '超级管理员', TO_DATE('2015-12-10 14:33:53','YYYY-MM-DD HH24:MI:SS'), null, null, null);
INSERT INTO "SYS_PARA" VALUES ('WARNING_RED_M', '超期预警——红色', '0', '距离到期时间小于等于0天时，进行超期红色预警', '1', null, null, null, null, null, '5', '超级管理员', TO_DATE('2015-12-10 17:43:34','YYYY-MM-DD HH24:MI:SS'), '5', '超级管理员', TO_DATE('2015-12-22 16:14:24','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO "SYS_PARA" VALUES ('WARNING_YELLOW_M', '超期预警——黄色', '5', '距离到期时间小于等于5天时，进行超期黄色预警', '1', null, null, null, null, null, '5', '超级管理员', TO_DATE('2015-12-10 17:44:51','YYYY-MM-DD HH24:MI:SS'), '5', '超级管理员', TO_DATE('2015-12-22 16:14:40','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO "SYS_PARA" VALUES ('WARNING_RED_C', '调用超期预警——红色', '0', '距离到期时间小于等于0天时，进行超期红色预警', '1', null, null, null, null, null, '5', '超级管理员', TO_DATE('2015-12-10 17:59:13','YYYY-MM-DD HH24:MI:SS'), '5', '超级管理员', TO_DATE('2015-12-22 16:14:52','YYYY-MM-DD HH24:MI:SS'));
INSERT INTO "SYS_PARA" VALUES ('WARNING_YELLOW_C', '调用超期预警——黄色', '3', '距离到期时间小于等于3天时，进行超期黄色预警', '1', null, null, null, null, null, '5', '超级管理员', TO_DATE('2015-12-10 17:59:48','YYYY-MM-DD HH24:MI:SS'), '5', '超级管理员', TO_DATE('2015-12-18 16:50:27','YYYY-MM-DD HH24:MI:SS'));
COMMIT;

-- ----------------------------
--  Primary key structure for table "SYS_PARA"
-- ----------------------------
ALTER TABLE "SYS_PARA" ADD CONSTRAINT "PK_SYS_PARA" PRIMARY KEY("PARA_CODE");

-- ----------------------------
--  Comment for table "SYS_PARA"
-- ----------------------------
COMMENT ON TABLE "SYS_PARA" IS '系统参数表';

