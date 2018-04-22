DROP TABLE IF EXISTS `image_info`;

CREATE TABLE `image_info` (
  `img_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '图片编号',
  `img_name` varchar(50) DEFAULT NULL COMMENT '图片名称',
  `img_group_id` int(11) NOT NULL COMMENT '图片所属组别',
  `img_path` varchar(50) DEFAULT NULL COMMENT '图片路径',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`img_id`),
  KEY `img_group_id` (`img_group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8