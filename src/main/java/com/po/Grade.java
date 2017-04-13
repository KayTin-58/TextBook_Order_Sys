package com.po;

import java.io.Serializable;

/**
 * Created by 直到世界尽头 on 4/11 0011.
 * 院系信息
 */
public class Grade implements Serializable{
    /**
     * CREATE TABLE `gradeinfo` (
     `gradeId` int(11) NOT NULL AUTO_INCREMENT COMMENT '年级id标示不同专业不同年级',
     `college` varchar(50) DEFAULT NULL COMMENT '学院',
     `grade` int(11) DEFAULT '2011' COMMENT '年级',
     `profession` varchar(50) DEFAULT NULL COMMENT '专业',
     `numOfClass` int(11) DEFAULT NULL COMMENT '班级数目',
     `numOfStu` int(11) DEFAULT NULL COMMENT '学生总人数',
     `campus` varchar(20) DEFAULT NULL COMMENT '校区',
     PRIMARY KEY (`gradeId`)
     ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
     */

     private Integer id;//学院id


}
