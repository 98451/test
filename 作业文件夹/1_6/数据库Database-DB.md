# 数据库Database-DB

数据库管理系统(DatabaseMenagementSystem)DBMS,是指操作和管理数据的软件

常见的数据库分为两类:

关系型数据库:Oracle  SQLServer  MySQL  DB2   MariaDB

非关系型数据库:Redis  HBase  MonggoDB

![image-20210106144032805](C:%5CUsers%5CAdministrator%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20210106144032805.png)

![image-20210106144138408](C:%5CUsers%5CAdministrator%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20210106144138408.png)

# 1SQL语言

SQL(Structure Query Language)结构化查询语言

SQL被美国国家标准局(ANSI),确定为数据库语言标准,后来被国际标准组织ISO采纳认可

使用SQL99标准

每个不同厂商出产的数据库除了标准语句外,还有各自的特点:方言

SQL语言分为四大类:

DDL(Data Defined Language)数据定义语言,主要是创建库,表等语句

DML(Data manipulation Language)数据操作语言,主要是对表中的数据进行增删改查的操作

DQL(Data Query Language)数据查询语言,主要是对表中的数据进行查询

DCL(Data Control Language)数据控制语言,主要是对数据库的权限安全操作

下载

安装

配置环境变量

启动mysql命令:net start  mysql

关闭mysql命令: net  stop mysql

登录mysql:

第一种:

mysql -u root -p或mysql -uroot -p

第二种:

mysql -uroot -p+密码

退出:exit

![image-20210106151251754](C:%5CUsers%5CAdministrator%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20210106151251754.png)



# 操作库

创建库

create database 库名;

create database 库名 character set utf8;--默认就是utf-8,所以无需设置

查询库

​	show  databases;

删除库:

​	drop database 库名;

修改库:

​	alter database 库名  character  set utf-8;

​	select database();查看正在使用的数据库

​	use 数据库名;切换数据库

查看当前库下所有表

​	show tables;

创建表:

​	create table 表名(

​	列名 数据类型(长度)  [约束],

​	列名2  数据类型(长度)  [约束],

​	列名2  数据类型(长度)   [约束]

);

数据类型:

整型

int 长度固定11

浮点型

 double(总长,其中小数个数),

float

字符型(包含字符串)

char  定长字符,长度0-255,

varchar  可变长字符

text 主要存储大文本数据

字节型blob   字节类型,适合存图像等

日期型

date,日期,不需要指定长度

time,时间,不需要指定长度

datetime,日期时间,不需要指定长度

timestamp 时间戳,会自动改变

![image-20210106162015938](C:%5CUsers%5CAdministrator%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20210106162015938.png)

![image-20210106162134078](C:%5CUsers%5CAdministrator%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20210106162134078.png)

查询表的字段信息

desc  表名 ;

更新表字段-添加列

​		alter table 表名  add   列名 数据类型(长度);

删除字段-删除列

​		alter table 表名  drop  列名;

![image-20210106164931639](C:%5CUsers%5CAdministrator%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20210106164931639.png)

更新列名

​		alter  table 表名  change 旧列名  新列名  数据类型(长度);

![image-20210106165119204](C:%5CUsers%5CAdministrator%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20210106165119204.png)

更新表名

​		rename table 旧表名 to 新表名;

![image-20210106165321394](C:%5CUsers%5CAdministrator%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20210106165321394.png)

查询创建表的语句

​		show   create  table  表名;

![image-20210106171347436](C:%5CUsers%5CAdministrator%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20210106171347436.png)

修改表的编码格式

​		alter table 表名  character set gbk;--建议使用utf-8

![image-20210106171332044](https://i.loli.net/2021/01/07/jHTgRohUPlmJdpS.png)

删除表

​		drop  table 表名;

![image-20210106171304765](C:%5CUsers%5CAdministrator%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20210106171304765.png)