DROP TABLE IF EXISTS `manager_info`;

CREATE TABLE `manager_info` (
  `mag_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '管理员账号',
  `mag_email` varchar(50) NOT NULL COMMENT '管理员邮箱',
  `mag_pwd` varchar(50) NOT NULL COMMENT '管理员登陆密码',
  `mag_name` varchar(50) NOT NULL COMMENT '管理员昵称',
  `mag_image` varchar(100) DEFAULT NULL COMMENT '用户头像',
  `mag_login_time` timestamp NULL DEFAULT NULL COMMENT '管理员登录时间',
  `mag_login_ip` varchar(20) DEFAULT NULL COMMENT '管理员登录IP',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`mag_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;