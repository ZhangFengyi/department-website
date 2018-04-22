DROP TABLE IF EXISTS `visit_info`;

CREATE TABLE `visit_info` (
  `visit_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '访问编号',
  `visit_count` int(11) NOT NULL COMMENT '访问人数',
  `visit_time` timestamp NULL DEFAULT NULL COMMENT '访问时间',
  PRIMARY KEY (`visit_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;