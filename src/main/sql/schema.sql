DROP TABLE IF EXISTS t_lecture;
DROP TABLE IF EXISTS t_student;
DROP TABLE IF EXISTS t_student_health_female;
DROP TABLE IF EXISTS t_student_health_male;
DROP TABLE IF EXISTS t_student_lecture;
DROP TABLE IF EXISTS t_student_selfcard;

CREATE TABLE t_lecture(
  `id` INT(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `lecture_name` VARCHAR(60) NOT NULL COMMENT '课程名称',
  `note` VARCHAR(1024) COMMENT '备注',
  PRIMARY KEY (id)
)ENGINE = InnoDb DEFAULT CHARSET = utf8 COMMENT '课程表';

CREATE TABLE t_student(
  `id` INT(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `cnname` VARCHAR(60) NOT NULL COMMENT '学生姓名',
  `sex` TINYINT(4) NOT NULL COMMENT '性别',
  `selfcard_no` INT(20) NOT NULL COMMENT '学生证号',
  `note` VARCHAR(1024) COMMENT '备注',
  PRIMARY KEY (id)
)ENGINE = InnoDb DEFAULT CHARSET = utf8 COMMENT '学生表';

CREATE TABLE t_student_health_female(
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `student_id` VARCHAR(60) NOT NULL COMMENT '学生编号',
  `check_date` VARCHAR(60) NOT NULL COMMENT '检查日期',
  `heart` VARCHAR(60) NOT NULL COMMENT '心',
  `liver` VARCHAR(60) NOT NULL COMMENT '肝',
  `spleen` VARCHAR(60) NOT NULL COMMENT '脾',
  `lung` VARCHAR(60) NOT NULL COMMENT '肺',
  `kidney` VARCHAR(60) NOT NULL COMMENT '肾',
  `uterus` VARCHAR(60) NOT NULL COMMENT '子宫',
  `note` VARCHAR(1024) NOT NULL COMMENT '备注',
  PRIMARY KEY (id)
)ENGINE = InnoDb DEFAULT CHARSET = utf8 COMMENT '女学生体检表';

CREATE TABLE t_student_health_male(
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `student_id` VARCHAR(60) NOT NULL COMMENT '学生编号',
  `check_date` VARCHAR(60) NOT NULL COMMENT '检查日期',
  `heart` VARCHAR(60) NOT NULL COMMENT '心',
  `liver` VARCHAR(60) NOT NULL COMMENT '肝',
  `spleen` VARCHAR(60) NOT NULL COMMENT '脾',
  `lung` VARCHAR(60) NOT NULL COMMENT '肺',
  `kidney` VARCHAR(60) NOT NULL COMMENT '肾',
  `prostate` VARCHAR(60) NOT NULL COMMENT '前列腺',
  `note` VARCHAR(1024) NOT NULL COMMENT '备注',
  PRIMARY KEY (id)
)ENGINE = InnoDb DEFAULT CHARSET = utf8 COMMENT '男学生体检表';

CREATE TABLE t_student_lecture(
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `student_id` INT(20) NOT NULL COMMENT '学生编号',
  `lecture_id` INT(20) NOT NULL COMMENT '课程编号',
  `grade` DECIMAL(16,2) NOT NULL COMMENT '评分',
  `note` VARCHAR(1024) COMMENT '备注',
  PRIMARY KEY (id)
)ENGINE = InnoDb DEFAULT CHARSET = utf8 COMMENT '学生课程评分表';

CREATE TABLE t_student_selfcard(
  `id` INT(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `student_id` INT(20) NOT NULL COMMENT '学生编号',
  `native` VARCHAR(60) NOT NULL COMMENT '籍贯',
  `issue_date` DATE NOT NULL COMMENT '发证日期',
  `end_date` DATE NOT NULL COMMENT '结束日期',
  `note` VARCHAR(1024) COMMENT '备注',
  PRIMARY KEY (id)
)ENGINE = InnoDb DEFAULT CHARSET = utf8 COMMENT '学生证表';