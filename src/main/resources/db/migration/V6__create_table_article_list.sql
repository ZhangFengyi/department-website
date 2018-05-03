DROP TABLE IF EXISTS `article_list`;

CREATE TABLE `article_list` (
  `arl_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '文章列表编号',
  `arl_name` varchar(50) NOT NULL COMMENT '文章列表名字',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`arl_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;