/*
 Navicat Premium Data Transfer

 Source Server         : 192.168.0.135_6001
 Source Server Type    : MySQL
 Source Server Version : 50730
 Source Host           : 192.168.0.135:6001
 Source Schema         : shardingjdbc

 Target Server Type    : MySQL
 Target Server Version : 50730
 File Encoding         : 65001

 Date: 15/10/2020 09:09:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_logs
-- ----------------------------
DROP TABLE IF EXISTS `sys_logs`;
CREATE TABLE `sys_logs`  (
  `ID` bigint(20) NOT NULL COMMENT '主键ID',
  `APPLICATION_NAME` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '应用名称（子系统唯一标识）',
  `LOG_TYPE` int(11) NULL DEFAULT NULL COMMENT '1:操作日志  2：错误日志',
  `IP` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '客户端ip',
  `OPERATE_USER` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '操作员',
  `OPERATE_TIME` datetime(0) NOT NULL COMMENT '操作时间',
  `MODULE_NAME` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '模块名称',
  `DESCRIPTION` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '日志说明',
  `CREATE_TIME` datetime(0) NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '日志表' ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
