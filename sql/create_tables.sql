/*
    Creator               : yyd
    Create Time           : 2023/02/20 20:30:00
    Source Database       : helper
    Target Server Type    : MYSQL
*/

-- 创建数据库
CREATE DATABASE helper;
use helper;

--用户表
DROP TABLE IF EXISTS `helper_user`;
CREATE TABLE `helper_user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(11) NOT NULL COMMENT '用户名',
  `password` varchar(20) NOT NULL COMMENT `密码(加密后的)`,
  `role_id` tinyint(1) NOT NULL, COMMENT '用户权限',
  `user_detail_id` int NOT NULL, COMMENT '用户具体信息',
  `is_deleted` tinyint(1) NOT NULL, COMMENT '逻辑删除标志',
  `create_time` date NOT NULL, COMMENT '注册时间',
  UNIQUE INDEX `username_index`(`username`) 
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

--用户权限表
CREATE TABLE `helper_user_role` (
  `id` tinyint NOT NULL AUTO_INCREMENT,
  `role_name` varchar(20) NOT NULL COMMENT '角色/权限名',
  `role_level` tinyint(1) NOT NULL COMMENT `权限等级(1游客, 2普通用户, 3管理员, 4超级管理员)`,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户权限表';

--用户权限表
CREATE TABLE `helper_user_status` (
  `id` tinyint NOT NULL AUTO_INCREMENT,
  `status_name` varchar(20) NOT NULL COMMENT '状态名',
  `status_deccribe` varchar(100) NOT NULL COMMENT '状态描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户状态表';

--用户明细表
CREATE TABLE `helper_user_detail` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_id` int NOT NULL, COMMENT '用户id',
  `nickname` varchar(20) NOT NULL COMMENT '用户昵称',
  `avatar` varchar(200) NOT NULL COMMENT '用户头像',
  `get_task_num` int NOT NULL COMMENT '领取任务数目',
  `finish_task_num` int NOT NULL COMMENT '完成任务数目',
  `balance` int NOT NULL COMMENT '用户账号余额',
  `is_deleted` tinyint(1) NOT NULL COMMENT '逻辑删除标志',
  `create_time` date NOT NULL COMMENT '注册时间',
  `status_id` tinyint NOT NULL COMMENT '用户当前状态'
  INDEX `nickname_index`(`nickname`) COMMENT '为用户昵称创建索引'
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户明细表';


--任务表
DROP TABLE IF EXISTS `helper_task`;
CREATE TABLE `helper_task`(
    `id` bigint(20) NOT NULL,
    `publisher_id` int NOT NULL,
    `name` varchar(50) NOT NULL COMMENT '任务名称',
    `describe` varchar(5000) NOT NULL COMMENT '任务描述',
    `tags_id` varchar(10) NOT NULL COMMENT '任务标签id(可能会有多个,以逗号分隔)',
    `reward` int NOT NULL COMMENT '任务赏金',
    `publish_time` date NOT NULL COMMENT '任务发布时间',
    `is_finish` tinyint(1) NOT NULL COMMENT ,
    INDEX `publisher_id_index`(`publisher_id`) COMMENT '任务发布者id创建索引'
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='任务表';

--任务记录表
DROP TABLE IF EXISTS `helper_task_record`;
CREATE TABLE `helper_task`(
    `id` bigint(20) NOT NULL,
    `task_id` int NOT NULL,
    `user_id` int NOT NULL COMMENT '任务领取者id',
    `get_task_time` date NOT NULL COMMENT '任务领取时间',
    `progress` tinyint NOT NULL COMMENT '完成进度' 
    `is_finish` tinyint(1) NOT NULL COMMENT '是否已完成',
    `finish_task_time` date DEFAULT NULL COMMENT '任务完成时间',
    INDEX `user_id_index`(`user_id`) COMMENT ''
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='任务领取记录表';

--待完成