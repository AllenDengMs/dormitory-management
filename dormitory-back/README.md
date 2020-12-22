建表SQL

```sql
create database `dormitory` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增增长id，无含义，用于排序',
  `student_id` int(11) NOT NULL COMMENT '学号',
  `student_name` varchar(255) DEFAULT NULL COMMENT '姓名',
  `sex` varchar(255) DEFAULT NULL COMMENT '性别',
  `building_id` int(11)  DEFAULT 0 COMMENT '外键，楼栋id',
  `room_id` int(11)  DEFAULT 0 COMMENT '外键，寝室id',
  `phone` varchar(255) DEFAULT NULL COMMENT '手机号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生表';

DROP TABLE IF EXISTS `building`;
CREATE TABLE `building` (
  `building_id` int(11) NOT NULL AUTO_INCREMENT,
  `building_name` varchar(255) DEFAULT NULL COMMENT '楼栋名称',
  `memo` varchar(255) DEFAULT NULL COMMENT '简介',
  PRIMARY KEY (`building_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='楼栋';

DROP TABLE IF EXISTS `room`;
CREATE TABLE `room` (
  `room_id` int(11) NOT NULL AUTO_INCREMENT,
  `building_id` int(11)  DEFAULT 0 COMMENT '外键，楼栋id',
  `room_name` varchar(255) DEFAULT NULL COMMENT '宿舍编号',
  `memo` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`room_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='寝室';

DROP TABLE IF EXISTS `student_absence`;
CREATE TABLE `student_absence` (
  `student_absence_id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) NOT NULL COMMENT '外键，学号',
  `building_id` int(11) NOT NULL COMMENT '外键，楼栋Id',
  `room_id` int(11) NOT NULL COMMENT '外键，宿舍编号',
  `time` bigint(20) DEFAULT 0 COMMENT '缺勤时间，时间戳',
  `memo` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`student_absence_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='缺勤记录';
```

