-- ----------------------------
-- Table structure for t_student
-- ----------------------------
CREATE TABLE t_student(
    stuno int(32) PRIMARY KEY NOT NULL,
    stuname varchar(50) NOT NULL,
    grade int(32) NOT NULL,
    dept varchar(50)  NOT NULL,
    classname varchar(20) NOT NULL
)
-- ----------------------------
-- Records of t_student
-- ----------------------------
INSERT INTO t_student VALUES (2017010101, '张三', 2017, '软件工程', '软件1701');
INSERT INTO t_student VALUES (2018020222, '李四', 2018, '计算机', '计算机1802');
INSERT INTO t_student VALUES (2019030430, '王五', 2019, '英语', '英语1904');