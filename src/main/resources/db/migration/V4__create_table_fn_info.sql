DROP TABLE IF EXISTS `fn_info`;

CREATE TABLE `fn_info` (
  `fn_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '一级菜单编号',
  `fn_name` varchar(50) NOT NULL COMMENT '一级菜单名称',
  `fn_number` int(11) DEFAULT NULL COMMENT '一级菜单编号',
  PRIMARY KEY (`fn_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;