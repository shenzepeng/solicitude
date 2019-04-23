/*
Navicat MySQL Data Transfer

Source Server         : http://47.102.113.146
Source Server Version : 50557
Source Host           : 47.102.113.146:3306
Source Database       : solicitude

Target Server Type    : MYSQL
Target Server Version : 50557
File Encoding         : 65001

Date: 2019-04-23 23:35:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `department`
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `blanck_space_one` varchar(255) DEFAULT NULL,
  `blanck_space_three` varchar(255) DEFAULT NULL,
  `blanck_space_two` varchar(255) DEFAULT NULL,
  `department_address` varchar(255) DEFAULT NULL,
  `department_aptitude` varchar(255) DEFAULT NULL,
  `department_cognition` varchar(255) DEFAULT NULL,
  `department_ifo` varchar(255) DEFAULT NULL,
  `department_name` varchar(255) DEFAULT NULL,
  `department_phone_number` varchar(255) DEFAULT NULL,
  `img_url` varchar(255) DEFAULT NULL,
  `user_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', 'asd', 'asd', 'asd', 'asd', 'asd', 'asd', 'asd', 'asd', 'asd', 'asd', '1');

-- ----------------------------
-- Table structure for `elder`
-- ----------------------------
DROP TABLE IF EXISTS `elder`;
CREATE TABLE `elder` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `age` varchar(255) DEFAULT NULL,
  `blanck_space_one` varchar(255) DEFAULT NULL,
  `blanck_space_three` varchar(255) DEFAULT NULL,
  `blanck_space_two` varchar(255) DEFAULT NULL,
  `company` varchar(255) DEFAULT NULL,
  `end_time` varchar(255) DEFAULT NULL,
  `given_name` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `start_time` varchar(255) DEFAULT NULL,
  `user_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of elder
-- ----------------------------
INSERT INTO `elder` VALUES ('1', 'asd', 'asd', 'asd', 'asd', 'asd', 'asd', 'asd', 'asd', 'asd', '1');

-- ----------------------------
-- Table structure for `trend`
-- ----------------------------
DROP TABLE IF EXISTS `trend`;
CREATE TABLE `trend` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `active_id` varchar(255) DEFAULT NULL,
  `blanck_space_one` varchar(255) DEFAULT NULL,
  `blanck_space_three` varchar(255) DEFAULT NULL,
  `blanck_space_two` varchar(255) DEFAULT NULL,
  `change_time` varchar(255) DEFAULT NULL,
  `given_name` varchar(255) DEFAULT NULL,
  `user_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of trend
-- ----------------------------
INSERT INTO `trend` VALUES ('1', 'asd', 'asd', 'asd', 'asd', 'asd', 'asd', '1');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `blanck_space_one` varchar(255) DEFAULT NULL,
  `blanck_space_three` varchar(255) DEFAULT NULL,
  `blanck_space_two` varchar(255) DEFAULT NULL,
  `img_url` varchar(255) DEFAULT NULL,
  `nick_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `tel_phone_number` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', null, null, null, 'asd', 'asd', 'asd', 'asd', 'asd', 'asd');
