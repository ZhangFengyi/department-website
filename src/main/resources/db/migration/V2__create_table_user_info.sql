DROP TABLE IF EXISTS `user_info`;

CREATE TABLE `user_info` (
  `user_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '用户账号',
  `user_email` varchar(50) NOT NULL COMMENT '用户邮箱',
  `user_psw` varchar(50) NOT NULL COMMENT '用户密码',
  `user_name` varchar(50) NOT NULL COMMENT '用户昵称',
  `user_image` varchar(100) DEFAULT NULL COMMENT '用户头像',
  `user_qq` varchar(20) DEFAULT NULL COMMENT '用户QQ',
  `user_wechat` varchar(20) DEFAULT NULL COMMENT '用户微信',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;