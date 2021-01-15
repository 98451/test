# DML-数据操作语言

## 插入(insert):

语法:insert into 表名   (列名1,列名2,......) values  (值1,值2,......);

注意:

​		1,列名顺序与原表无关,但是列要在表中存在

​		2,要插入的列,不需要是全表列,可只列出需要插入的字段名

​		3,值与列的顺序,个数,类型一致

​		4,字符串值和日期值需要使用单引号,例如:'张三','2020-1-1'

​		5,可以插入空值null(前提是列允许空值null)

​		6,插入全表时，可以省略列名，值的赋值是按照原表列顺序赋值

## 更新-update

语法:update  表名  set 字段1=值1,字段2=值2,.... [where 字段=值];

![image-20210107103415077](https://i.loli.net/2021/01/07/9TR4zNLFJEHAgXY.png)

![image-20210107104048931](https://i.loli.net/2021/01/07/SAC7fhHcrjQ8txD.png)

##  删除-delete

语法:delete from 表名  [where 字段=值];

根据需求加上条件,只删除符合条件的数据

如果不加,删除全表数据

ps:工作中,不能真的删除数据.数据很重要,后期可能会做数据收集,处理,分析等

如何实现删除?

多设计一个字段,状态字段status,

一般定义状态码:1正常 2不正常  或者

1普通用户  2普通会员  3黄金会员  7已注销

在点击按钮删除时,其实是更新字段的状态

## 查询(select * from 表名)

## 约束

约束:对插入数据的约束

一般在创建表时指定约束,然后在插入值时按照约束赋值.

create table 表名(

​	字段  数据类型(长度)  约束,

​	字段  数据类型(长度)  约束1  约束2,

​	字段  数据类型(长度)

);

约束类型:

![image-20210107112749737](https://i.loli.net/2021/01/07/c4yo2as6UbNCWud.png)

主键约束+自增约束

primary  key  主键

auto_increment  自动增长

![					](https://i.loli.net/2021/01/07/17Pk8TcYiZzg3Rn.png)

一张表中可以设置两个主键,它们是一个整体,叫联合主键

![image-20210107113932274](https://i.loli.net/2021/01/07/JYkaFCqrKcoUXI4.png)

联合主键的所有列的值重复,才算重复

![image-20210107115353173](https://i.loli.net/2021/01/07/3Uh2V1wkPDOQoMJ.png)

## 唯一约束:unique

是该列的值不能重复

## 数据类型约束:

数据类型约束即,限制

## 非空约束

not null

插入该列值不能为空

## 默认值约束

当该列不赋值时,默认赋值为xx

sex char(1) default '男'

DBMS如果创建时不指定约束,那么没个列的值默认为null

![image-20210107143209165](https://i.loli.net/2021/01/07/ptjJvZMHnxmad75.png)

![image-20210107143719536](https://i.loli.net/2021/01/07/QNmKDX9qgSu1wTt.png)

## 引用完整性约束---外键(foreign key)

创建外键的方式

1在建表时直接指定

​	在引用了别的表字段的表中添加外键约束

![image-20210107145957160](https://i.loli.net/2021/01/07/wZrO3pCHcWXaenI.png)

2建好表后再指定

![image-20210107150325174](https://i.loli.net/2021/01/07/vkyKu1WPM5ArnRG.png)

设计了外键后,课程表中的sid字段就与学生表的sid字段有了联系

父表:stu表(被引用的表)

子表:course表(被引用的表)

![image-20210107152804428](https://i.loli.net/2021/01/07/nZExSiwU5upjcOL.png)

## DQL

DQL是指查询语言,从数据表中通过一系列条件将符合条件查出

DQL查询语句只是查看数据,不会对原表有任何影响

查询的结果只是一张虚拟表

查询关键字:select

语法:select 字段1,字段2.... from 表名  [where.... group by.... having ..... order by.... limit.....]



