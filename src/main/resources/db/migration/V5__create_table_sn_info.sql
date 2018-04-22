DROP TABLE IF EXISTS `sn_info`;

CREATE TABLE `sn_info` (
  `sn_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '二级菜单编号',
  `sn_name` varchar(50) NOT NULL COMMENT '二级菜单名字',
  `sn_number` int(11) DEFAULT NULL COMMENT '二级菜单编号',
  `sn_doc` varchar(50) DEFAULT NULL COMMENT '二级菜单对应文件名',
  `fn_id` int(11) NOT NULL COMMENT '所属一级菜单',
  PRIMARY KEY (`sn_id`),
  KEY `fn_id` (`fn_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;