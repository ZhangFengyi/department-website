DROP TABLE IF EXISTS `article`;

CREATE TABLE `article` (
  `arti_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '文章编号',
  `arti_name` varchar(20) NOT NULL COMMENT '文章名称',
  `arti_author` varchar(20) DEFAULT NULL COMMENT '文章作者',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`arti_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;