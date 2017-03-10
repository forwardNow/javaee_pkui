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
--  Table structure for "SYS_DEPT_RELE"
-- ----------------------------
DROP TABLE "SYS_DEPT_RELE";
CREATE TABLE "SYS_DEPT_RELE" (   "DEPT_ID" VARCHAR2(12CHAR) NOT NULL, "RELE_DEPT_ID" VARCHAR2(12CHAR) NOT NULL, "RELE_DEPT_NAME" VARCHAR2(100CHAR));
COMMENT ON COLUMN "SYS_DEPT_RELE"."DEPT_ID" IS '单位编号';
COMMENT ON COLUMN "SYS_DEPT_RELE"."RELE_DEPT_ID" IS '数据归属单位编号';
COMMENT ON COLUMN "SYS_DEPT_RELE"."RELE_DEPT_NAME" IS '数据归属单位名称';

-- ----------------------------
--  Primary key structure for table "SYS_DEPT_RELE"
-- ----------------------------
ALTER TABLE "SYS_DEPT_RELE" ADD CONSTRAINT "PK_SYS_DEPT_RELE" PRIMARY KEY("DEPT_ID","RELE_DEPT_ID");

-- ----------------------------
--  Comment for table "SYS_DEPT_RELE"
-- ----------------------------
COMMENT ON TABLE "SYS_DEPT_RELE" IS '数据归属表';

