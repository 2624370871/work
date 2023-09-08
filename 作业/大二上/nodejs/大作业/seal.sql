/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : seal

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2022-12-15 11:19:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for books
-- ----------------------------
DROP TABLE IF EXISTS `books`;
CREATE TABLE `books` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of books
-- ----------------------------
INSERT INTO `books` VALUES ('4', 'android');
INSERT INTO `books` VALUES ('0', 'html');
INSERT INTO `books` VALUES ('2', 'php');
INSERT INTO `books` VALUES ('3', 'node.js');
