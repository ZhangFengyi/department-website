DROP TABLE IF EXISTS `video_info`;

CREATE TABLE `video_info` (
  `video_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '视频编号',
  `video_name` varchar(50) DEFAULT NULL COMMENT '视频名称',
  `video_group_id` int(11) NOT NULL COMMENT '视频所属组别',
  `video_path` varchar(50) DEFAULT NULL COMMENT '视频路径',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`video_id`),
  KEY `video_group_id` (`video_group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8