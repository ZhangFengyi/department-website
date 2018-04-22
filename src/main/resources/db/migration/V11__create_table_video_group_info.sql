DROP TABLE IF EXISTS `video_group_info`;

CREATE TABLE `video_group_info` (
  `group_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '视频组别编号',
  `group_name` varchar(50) NOT NULL COMMENT '视频组别名称',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;