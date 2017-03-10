/*
 Navicat Oracle Data Transfer

 Source Server         : gdbaweb
 Source Server Version : 112010
 Source Host           : 27.17.3.62
 Source Schema         : PKUWH_GDBAWEB

 Target Server Version : 112010
 File Encoding         : utf-8

 Date: 03/10/2017 15:10:44 PM
*/

-- ----------------------------
--  Table structure for "SYS_MENU"
-- ----------------------------
DROP TABLE "SYS_MENU";
CREATE TABLE "SYS_MENU" (   "MENU_ID" NUMBER(16,0) NOT NULL, "MENU_NAME" VARCHAR2(64CHAR) NOT NULL, "MENU_URL" VARCHAR2(200CHAR), "ICON" VARCHAR2(30CHAR), "MENU_LEVEL" VARCHAR2(1CHAR), "TREE_LEVEL" NUMBER(16,0) NOT NULL, "TREE_PARENTID" NUMBER(16,0), "VISIABLE" VARCHAR2(1CHAR) NOT NULL, "EXPAND" VARCHAR2(1CHAR) NOT NULL, "ORDER_FLAG" NUMBER(16,0) NOT NULL, "RESERVE1" VARCHAR2(128CHAR), "RESERVE2" VARCHAR2(128CHAR), "RESERVE3" VARCHAR2(128CHAR), "RESERVE4" VARCHAR2(128CHAR), "RESERVE5" VARCHAR2(128CHAR), "MEMO" VARCHAR2(128CHAR), "ADD_TIME" DATE NOT NULL, "ADD_USER_ID" NUMBER(16,0) NOT NULL, "ADD_USER_NAME" VARCHAR2(30CHAR) NOT NULL, "MODIFY_TIME" DATE, "MODIFY_USER_ID" NUMBER(16,0), "MODIFY_USER_NAME" VARCHAR2(30CHAR), "MENU_NAME_US" VARCHAR2(64CHAR), "MENU_NAME_FR" VARCHAR2(64CHAR));
COMMENT ON COLUMN "SYS_MENU"."MENU_ID" IS '菜单标识号';
COMMENT ON COLUMN "SYS_MENU"."MENU_NAME" IS '菜单名称';
COMMENT ON COLUMN "SYS_MENU"."MENU_URL" IS '链接路径';
COMMENT ON COLUMN "SYS_MENU"."ICON" IS '图标';
COMMENT ON COLUMN "SYS_MENU"."MENU_LEVEL" IS '菜单等级';
COMMENT ON COLUMN "SYS_MENU"."TREE_LEVEL" IS '菜单树等级';
COMMENT ON COLUMN "SYS_MENU"."TREE_PARENTID" IS '父菜单编号';
COMMENT ON COLUMN "SYS_MENU"."VISIABLE" IS '是否可用';
COMMENT ON COLUMN "SYS_MENU"."EXPAND" IS '是否展开';
COMMENT ON COLUMN "SYS_MENU"."ORDER_FLAG" IS '菜单顺序';
COMMENT ON COLUMN "SYS_MENU"."RESERVE1" IS '保留字段1';
COMMENT ON COLUMN "SYS_MENU"."RESERVE2" IS '保留字段2';
COMMENT ON COLUMN "SYS_MENU"."RESERVE3" IS '保留字段3';
COMMENT ON COLUMN "SYS_MENU"."RESERVE4" IS '保留字段4';
COMMENT ON COLUMN "SYS_MENU"."RESERVE5" IS '保留字段5';
COMMENT ON COLUMN "SYS_MENU"."MEMO" IS '备注';
COMMENT ON COLUMN "SYS_MENU"."ADD_TIME" IS '录入时间';
COMMENT ON COLUMN "SYS_MENU"."ADD_USER_ID" IS '录入用户编号';
COMMENT ON COLUMN "SYS_MENU"."ADD_USER_NAME" IS '录入用户姓名';
COMMENT ON COLUMN "SYS_MENU"."MODIFY_TIME" IS '修改时间';
COMMENT ON COLUMN "SYS_MENU"."MODIFY_USER_ID" IS '修改用户编号';
COMMENT ON COLUMN "SYS_MENU"."MODIFY_USER_NAME" IS '修改用户姓名';
COMMENT ON COLUMN "SYS_MENU"."MENU_NAME_US" IS '英文菜单名称';
COMMENT ON COLUMN "SYS_MENU"."MENU_NAME_FR" IS '法文菜单名称';

-- ----------------------------
--  Records of "SYS_MENU"
-- ----------------------------
INSERT INTO "SYS_MENU" VALUES ('3', '用户管理', '/admin/sysUserList', 'user_suit.png', '0', '2', '1', '1', '1', '3', null, null, null, null, null, null, TO_DATE('2013-06-27 18:53:46','YYYY-MM-DD HH24:MI:SS'), '1', '管理员', null, null, null, 'User Management', 'gestion des utilisateurs');
INSERT INTO "SYS_MENU" VALUES ('4', '角色管理', '/admin/sysRoleList', 'group_link.png', '0', '2', '1', '1', '1', '4', null, null, null, null, null, null, TO_DATE('2013-06-27 18:54:01','YYYY-MM-DD HH24:MI:SS'), '1', '管理员', null, null, null, 'Role Management', 'gestion des r?les');
INSERT INTO "SYS_MENU" VALUES ('5', '系统参数', '/admin/sysParaList', 'script_gear.png', '0', '2', '1', '0', '1', '5', null, null, null, null, null, null, TO_DATE('2013-06-27 18:54:12','YYYY-MM-DD HH24:MI:SS'), '1', '管理员', null, null, null, 'System Parameters', 'Paramètres du système');
INSERT INTO "SYS_MENU" VALUES ('6', '字典管理', '/admin/sysDicListList', 'book_open.png', '0', '2', '1', '1', '1', '6', null, null, null, null, null, null, TO_DATE('2013-06-27 18:54:24','YYYY-MM-DD HH24:MI:SS'), '1', '管理员', null, null, null, 'Dictionary Management', 'gestion Dictionnaire');
INSERT INTO "SYS_MENU" VALUES ('7', '资源管理', '/admin/sysResourceList', 'database_gear.png', '0', '2', '1', '0', '1', '7', null, null, null, null, null, null, TO_DATE('2013-06-27 18:54:35','YYYY-MM-DD HH24:MI:SS'), '1', '管理员', null, null, null, 'Resource Management', 'gestion des ressources');
INSERT INTO "SYS_MENU" VALUES ('8', '菜单管理', '/admin/sysMenuList', 'link.png', '0', '2', '1', '0', '1', '8', null, null, null, null, null, null, TO_DATE('2013-06-27 18:54:54','YYYY-MM-DD HH24:MI:SS'), '1', '管理员', null, null, null, 'Menu Management', 'Gestionnaire de Menu');
INSERT INTO "SYS_MENU" VALUES ('10', '编号管理', '/admin/sysMaxIdTypeList', 'text_list_numbers.png', '0', '2', '1', '0', '1', '13', null, null, null, null, null, null, TO_DATE('2013-06-27 18:55:14','YYYY-MM-DD HH24:MI:SS'), '1', '管理员', null, null, null, 'Code management', 'gestion des numéros');
INSERT INTO "SYS_MENU" VALUES ('280', '行政区划管理', '/admin/sysCodeList', 'table_gear.png', '0', '2', '1', '1', '1', '280', null, null, null, null, null, null, TO_DATE('2014-05-28 15:44:39','YYYY-MM-DD HH24:MI:SS'), '5', '超级管理员', null, null, null, 'Administrative division management', 'Gestion de la division administrative');
INSERT INTO "SYS_MENU" VALUES ('12', '错误号管理', '/admin/sysErrorList', 'stop.png', '0', '2', '1', '0', '1', '11', null, null, null, null, null, null, TO_DATE('2013-07-02 09:25:22','YYYY-MM-DD HH24:MI:SS'), '5', '管理员', null, null, null, 'Error Management', 'Gestion des numéros d''erreur');
INSERT INTO "SYS_MENU" VALUES ('11', '功能管理', '/admin/sysFunctionList', 'plugin.png', '0', '2', '1', '0', '1', '10', null, null, null, null, null, null, TO_DATE('2013-07-02 09:24:09','YYYY-MM-DD HH24:MI:SS'), '5', '管理员', null, null, null, 'Function Management', 'gestion de la Fonction');
INSERT INTO "SYS_MENU" VALUES ('9', '日志管理', '/admin/sysLogList', 'page_white_paint.png', '0', '2', '1', '1', '1', '9', null, null, null, null, null, null, TO_DATE('2013-07-04 11:59:37','YYYY-MM-DD HH24:MI:SS'), '5', '管理员', null, null, null, 'Log Management', 'Connectez-gestion');
INSERT INTO "SYS_MENU" VALUES ('2', '单位管理', '/admin/sysDeptList', 'house.png', '0', '2', '1', '1', '1', '2', null, null, null, null, null, null, TO_DATE('2013-06-27 18:55:14','YYYY-MM-DD HH24:MI:SS'), '1', '管理员', null, null, null, 'Unit Management', 'Unit Management');
INSERT INTO "SYS_MENU" VALUES ('114', '数据权限开发', '/admin/sysPermitList', 'application_view_columns.png', '0', '2', '1', '0', '1', '12', null, null, null, null, null, null, TO_DATE('2013-08-21 11:44:22','YYYY-MM-DD HH24:MI:SS'), '5', '超级管理员', null, null, null, 'Data permissions for development', 'Autorisation des données pour le développement');
INSERT INTO "SYS_MENU" VALUES ('1', '系统管理及运维子系统', null, 'cog.png', '0', '1', null, '1', '1', '900', null, null, null, null, null, null, TO_DATE('2013-06-27 18:53:13','YYYY-MM-DD HH24:MI:SS'), '1', '管理员', TO_DATE('2015-11-13 13:03:41','YYYY-MM-DD HH24:MI:SS'), '5', '超级管理员', 'System Management', 'gestion du système');
COMMIT;

-- ----------------------------
--  Primary key structure for table "SYS_MENU"
-- ----------------------------
ALTER TABLE "SYS_MENU" ADD CONSTRAINT "PK_SYS_MENU" PRIMARY KEY("MENU_ID");

-- ----------------------------
--  Comment for table "SYS_MENU"
-- ----------------------------
COMMENT ON TABLE "SYS_MENU" IS '菜单表';

