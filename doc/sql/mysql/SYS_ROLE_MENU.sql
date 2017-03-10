/*
 Navicat Oracle Data Transfer

 Source Server         : gdbaweb
 Source Server Version : 112010
 Source Host           : 27.17.3.62
 Source Schema         : PKUWH_GDBAWEB

 Target Server Version : 112010
 File Encoding         : utf-8

 Date: 03/10/2017 16:15:19 PM
*/

-- ----------------------------
--  Table structure for `SYS_ROLE_MENU`
-- ----------------------------

USE PKUI;

DROP TABLE IF EXISTS  `SYS_ROLE_MENU`;
CREATE TABLE `SYS_ROLE_MENU` (   
    `ROLE_MENU_ID` INT(16) NOT NULL COMMENT '角色菜单标识号', 
    `ROLE_ID` INT(16) NOT NULL COMMENT '角色编号', 
    `MENU_ID` INT(16) NOT NULL COMMENT '菜单编号', 
    `ADD_USER_ID` INT(16) NOT NULL COMMENT '录入用户编号', 
    `ADD_USER_NAME` VARCHAR(30) NOT NULL COMMENT '录入用户真实姓名', 
    `ADD_TIME` DATETIME NOT NULL COMMENT '录入时间'
    

    ,PRIMARY KEY(`ROLE_MENU_ID`)
) DEFAULT CHARSET=UTF8 COMMENT='角色菜单表';


-- ----------------------------
--  Records of `SYS_ROLE_MENU`
-- ----------------------------
INSERT INTO `SYS_ROLE_MENU` VALUES ('3607', '73', '268', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3608', '73', '270', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3609', '73', '271', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3610', '73', '410', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3611', '73', '379', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3612', '73', '381', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3613', '73', '421', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3614', '73', '273', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3615', '73', '274', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3616', '73', '287', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3617', '73', '291', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3618', '73', '294', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3619', '73', '281', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3620', '73', '282', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3621', '73', '284', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3622', '73', '371', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3623', '73', '285', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3624', '73', '384', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3625', '73', '413', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3626', '73', '414', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3627', '73', '415', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3628', '73', '416', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3629', '73', '336', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3630', '73', '337', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3631', '73', '338', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3632', '73', '385', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3633', '73', '386', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3634', '73', '387', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3635', '73', '339', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3636', '73', '340', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3637', '66', '255', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3598', '73', '308', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3638', '66', '305', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3639', '66', '307', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3640', '66', '308', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3641', '66', '309', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3642', '66', '256', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3643', '66', '258', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3644', '66', '259', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3645', '66', '422', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3646', '66', '423', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3647', '66', '424', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('437', '64', '3', '92', 'System administrator', STR_TO_DATE('2014-07-01 17:34:56','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('438', '64', '4', '92', 'System administrator', STR_TO_DATE('2014-07-01 17:34:56','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('439', '64', '6', '92', 'System administrator', STR_TO_DATE('2014-07-01 17:34:57','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('440', '64', '9', '92', 'System administrator', STR_TO_DATE('2014-07-01 17:34:57','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('441', '64', '280', '92', 'System administrator', STR_TO_DATE('2014-07-01 17:34:57','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3648', '66', '264', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3649', '66', '265', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3650', '66', '268', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3651', '66', '270', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3652', '66', '271', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3653', '66', '410', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3654', '66', '379', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('796', '5', '362', '5', '超级管理员', STR_TO_DATE('2014-08-08 18:07:27','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('797', '5', '363', '5', '超级管理员', STR_TO_DATE('2014-08-08 18:07:27','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('798', '5', '364', '5', '超级管理员', STR_TO_DATE('2014-08-08 18:07:27','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('799', '5', '365', '5', '超级管理员', STR_TO_DATE('2014-08-08 18:07:27','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('800', '5', '367', '5', '超级管理员', STR_TO_DATE('2014-08-08 18:07:27','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('801', '5', '368', '5', '超级管理员', STR_TO_DATE('2014-08-08 18:07:27','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('1', '3', '273', '5', '超级管理员', STR_TO_DATE('2014-08-24 21:08:44','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('2', '3', '274', '5', '超级管理员', STR_TO_DATE('2014-08-24 21:08:44','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3', '3', '275', '5', '超级管理员', STR_TO_DATE('2014-08-24 21:08:44','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('4', '3', '370', '5', '超级管理员', STR_TO_DATE('2014-08-24 21:08:44','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('5', '3', '276', '5', '超级管理员', STR_TO_DATE('2014-08-24 21:08:44','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('6', '3', '301', '5', '超级管理员', STR_TO_DATE('2014-08-24 21:08:44','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('435', '64', '1', '92', 'System administrator', STR_TO_DATE('2014-07-01 17:34:56','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('7', '3', '287', '5', '超级管理员', STR_TO_DATE('2014-08-24 21:08:45','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('8', '3', '288', '5', '超级管理员', STR_TO_DATE('2014-08-24 21:08:45','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('9', '3', '289', '5', '超级管理员', STR_TO_DATE('2014-08-24 21:08:45','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('10', '3', '291', '5', '超级管理员', STR_TO_DATE('2014-08-24 21:08:45','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('11', '3', '292', '5', '超级管理员', STR_TO_DATE('2014-08-24 21:08:45','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('12', '3', '293', '5', '超级管理员', STR_TO_DATE('2014-08-24 21:08:45','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('13', '3', '294', '5', '超级管理员', STR_TO_DATE('2014-08-24 21:08:45','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('14', '3', '295', '5', '超级管理员', STR_TO_DATE('2014-08-24 21:08:45','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('15', '3', '278', '5', '超级管理员', STR_TO_DATE('2014-08-24 21:08:45','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('16', '3', '298', '5', '超级管理员', STR_TO_DATE('2014-08-24 21:08:45','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('17', '3', '299', '5', '超级管理员', STR_TO_DATE('2014-08-24 21:08:45','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('18', '3', '300', '5', '超级管理员', STR_TO_DATE('2014-08-24 21:08:45','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('19', '3', '372', '5', '超级管理员', STR_TO_DATE('2014-08-24 21:08:45','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('20', '3', '373', '5', '超级管理员', STR_TO_DATE('2014-08-24 21:08:45','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('21', '3', '374', '5', '超级管理员', STR_TO_DATE('2014-08-24 21:08:45','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3655', '66', '381', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3656', '66', '273', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3657', '66', '274', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3658', '66', '287', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3659', '66', '291', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3660', '66', '294', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3661', '66', '281', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3662', '66', '282', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3663', '66', '284', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3664', '66', '371', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3665', '66', '285', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3666', '66', '384', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3667', '66', '413', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3668', '66', '414', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3669', '66', '415', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3670', '66', '416', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3671', '66', '336', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3672', '66', '337', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3673', '66', '338', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3674', '66', '385', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3675', '66', '386', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3676', '66', '387', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3677', '66', '339', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3678', '66', '340', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:42','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('1298', '77', '1', '248', '分局系统管理员', STR_TO_DATE('2015-11-19 16:14:28','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('1299', '77', '2', '248', '分局系统管理员', STR_TO_DATE('2015-11-19 16:14:28','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('1300', '77', '3', '248', '分局系统管理员', STR_TO_DATE('2015-11-19 16:14:28','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('1301', '77', '4', '248', '分局系统管理员', STR_TO_DATE('2015-11-19 16:14:28','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('1302', '77', '5', '248', '分局系统管理员', STR_TO_DATE('2015-11-19 16:14:28','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('1303', '77', '6', '248', '分局系统管理员', STR_TO_DATE('2015-11-19 16:14:28','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('1304', '77', '7', '248', '分局系统管理员', STR_TO_DATE('2015-11-19 16:14:28','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('1305', '77', '8', '248', '分局系统管理员', STR_TO_DATE('2015-11-19 16:14:28','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('1306', '77', '9', '248', '分局系统管理员', STR_TO_DATE('2015-11-19 16:14:28','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('1307', '77', '11', '248', '分局系统管理员', STR_TO_DATE('2015-11-19 16:14:28','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('1308', '77', '12', '248', '分局系统管理员', STR_TO_DATE('2015-11-19 16:14:28','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('1309', '77', '114', '248', '分局系统管理员', STR_TO_DATE('2015-11-19 16:14:28','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('1310', '77', '10', '248', '分局系统管理员', STR_TO_DATE('2015-11-19 16:14:28','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('1311', '77', '280', '248', '分局系统管理员', STR_TO_DATE('2015-11-19 16:14:28','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('39', '4', '258', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:32','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('40', '4', '259', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:32','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('41', '4', '260', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:32','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('42', '4', '261', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:32','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('43', '4', '262', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:32','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('44', '4', '264', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:32','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('45', '4', '265', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:32','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('46', '4', '266', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:32','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('47', '4', '267', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:32','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('48', '4', '268', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:32','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('49', '4', '263', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:32','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('50', '4', '269', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:32','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('51', '4', '270', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:32','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('52', '4', '271', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:32','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('53', '4', '272', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:32','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('54', '4', '380', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:32','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('55', '1', '255', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:55','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('56', '1', '304', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:55','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('57', '1', '314', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:55','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('58', '1', '343', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:55','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('59', '1', '344', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:55','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('60', '1', '305', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:55','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('61', '1', '315', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:55','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('62', '1', '316', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:55','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('63', '1', '317', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:55','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('64', '1', '318', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:55','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('65', '1', '319', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:55','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('66', '1', '320', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:55','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('67', '1', '321', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:55','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('68', '1', '306', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:55','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('69', '1', '322', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:56','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('70', '1', '323', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:56','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('71', '1', '324', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:56','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('72', '1', '325', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:56','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('73', '1', '326', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:56','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('74', '1', '327', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:56','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('75', '1', '307', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:56','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('2558', '76', '1', '5', '超级管理员', STR_TO_DATE('2015-12-16 17:49:47','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('2559', '76', '2', '5', '超级管理员', STR_TO_DATE('2015-12-16 17:49:47','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('2560', '76', '3', '5', '超级管理员', STR_TO_DATE('2015-12-16 17:49:47','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('2561', '76', '4', '5', '超级管理员', STR_TO_DATE('2015-12-16 17:49:47','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('2562', '76', '6', '5', '超级管理员', STR_TO_DATE('2015-12-16 17:49:47','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('2563', '76', '8', '5', '超级管理员', STR_TO_DATE('2015-12-16 17:49:47','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('2564', '76', '9', '5', '超级管理员', STR_TO_DATE('2015-12-16 17:49:47','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3192', '82', '281', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:31','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3193', '82', '282', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:31','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3194', '82', '284', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:31','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3195', '82', '371', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:31','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3196', '82', '285', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:31','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3197', '82', '384', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:31','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3198', '82', '411', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:31','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3199', '82', '413', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:31','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3200', '82', '414', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:31','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3201', '82', '415', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:31','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3202', '82', '416', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:31','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3203', '82', '336', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:31','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3204', '82', '337', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:31','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3205', '82', '338', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:31','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3206', '82', '385', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:31','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3207', '82', '386', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:31','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3208', '82', '387', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:31','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3209', '82', '339', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:31','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3210', '82', '340', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:31','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3211', '81', '281', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:53','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3212', '81', '282', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:53','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3213', '81', '284', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:53','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3214', '81', '371', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:53','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3215', '81', '285', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:53','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3216', '81', '384', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:53','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3217', '81', '411', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:53','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3218', '81', '413', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:53','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3219', '81', '414', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:53','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3220', '81', '415', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:53','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3221', '81', '416', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:53','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3222', '81', '336', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:53','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3223', '81', '337', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:53','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3224', '81', '338', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:53','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3225', '81', '385', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:53','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3226', '81', '386', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:53','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3227', '81', '387', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:53','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3228', '81', '339', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:53','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3229', '81', '340', '5', '超级管理员', STR_TO_DATE('2015-12-23 13:30:53','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('1312', '78', '408', '5', '超级管理员', STR_TO_DATE('2015-11-19 16:34:33','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('1313', '78', '409', '5', '超级管理员', STR_TO_DATE('2015-11-19 16:34:33','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('76', '1', '328', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:56','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('77', '1', '329', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:56','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('78', '1', '330', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:56','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('79', '1', '308', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:56','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('80', '1', '331', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:56','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('81', '1', '332', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:56','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('82', '1', '333', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:56','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('83', '1', '309', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:56','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('84', '1', '379', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:56','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('85', '1', '334', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:56','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('86', '1', '335', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:56','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('87', '1', '375', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:56','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('22', '2', '281', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:17','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('23', '2', '282', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:17','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('24', '2', '284', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:17','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('25', '2', '371', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:17','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('26', '2', '303', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:17','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('27', '2', '285', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:17','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('28', '2', '336', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:17','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('29', '2', '337', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:17','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('30', '2', '338', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:17','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('31', '2', '339', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:17','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('32', '2', '340', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:17','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('33', '2', '283', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:17','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('34', '2', '286', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:17','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('35', '2', '376', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:17','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('36', '2', '377', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:17','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('37', '2', '378', '5', '超级管理员', STR_TO_DATE('2014-08-24 22:04:17','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3599', '73', '256', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3600', '73', '258', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3601', '73', '259', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3602', '73', '422', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3603', '73', '423', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3604', '73', '424', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3605', '73', '264', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3606', '73', '265', '5', '超级管理员', STR_TO_DATE('2015-12-31 09:45:23','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3679', '25', '1', '5', '超级管理员', STR_TO_DATE('2015-12-31 11:43:56','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3680', '25', '3', '5', '超级管理员', STR_TO_DATE('2015-12-31 11:43:56','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3681', '25', '4', '5', '超级管理员', STR_TO_DATE('2015-12-31 11:43:56','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3682', '25', '5', '5', '超级管理员', STR_TO_DATE('2015-12-31 11:43:56','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3683', '25', '6', '5', '超级管理员', STR_TO_DATE('2015-12-31 11:43:56','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3684', '25', '7', '5', '超级管理员', STR_TO_DATE('2015-12-31 11:43:56','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3685', '25', '8', '5', '超级管理员', STR_TO_DATE('2015-12-31 11:43:56','%Y-%m-%d %H:%i:%s'));
INSERT INTO `SYS_ROLE_MENU` VALUES ('3686', '25', '10', '5', '超级管理员', STR_TO_DATE('2015-12-31 11:43:56','%Y-%m-%d %H:%i:%s'));
COMMIT;



