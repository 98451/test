# DQL

基础查询

条件查询

聚合函数

count(列名)统计指定列不为null的行数

max(列名)获得指定列中最大值,如果是字符串,按照字符顺序

min(列名)获得最小

sum(列名)计算指定列的总和,非数字总结果为0

avg(列名)计算指定列的平均值,计算非数字时总结果为0

语法:select  聚合函数  from 表名  [where ...]

在列名后使用 as给列取别名(as可以省略)

![image-20210108094707557](https://i.loli.net/2021/01/08/CiTbS8cslxrA4Oh.png)

![image-20210108095046699](https://i.loli.net/2021/01/08/qov6bu3I9LJgQVt.png)

![image-20210108095241851](https://i.loli.net/2021/01/08/MHr9Bo8mve4FwPy.png)

![image-20210108095848692](https://i.loli.net/2021/01/08/EjqFPmbNdaiytnB.png)

![image-20210108100859585](https://i.loli.net/2021/01/08/eC2gGVPyhvaNZ1L.png)

![image-20210108101200353](https://i.loli.net/2021/01/08/vTpVCR69WgYJbsZ.png)

![image-20210108101711526](https://i.loli.net/2021/01/08/gwEPBeaZpDiRfs6.png)

![image-20210108101843253](https://i.loli.net/2021/01/08/ZP9TIGMpCbcNsKr.png)

![image-20210108105057741](https://i.loli.net/2021/01/08/QjYyhSmXudrRo7I.png)

当需要分组查询时,需要使用group by语句

语法:

​		select * from stu [where ...] group by 字段 [order by...]

​		字段相同的分到一组

注意:

​		1一般分组后会使用聚合操作

​		2分成几组,结果就是几行

​		3聚合函数,是对每组进行单独聚合操作

分组后再过滤,使用having子句

having和where的区别

where是分组前过滤,having是分组后过滤

where后不能使用聚合函数,having可以使用聚合函数



![image-20210108105843989](https://i.loli.net/2021/01/08/DdmAJaVltvxQ59n.png)

![image-20210108110711489](https://i.loli.net/2021/01/08/T4P2GcVIetC7qfj.png)

![image-20210108111036313](https://i.loli.net/2021/01/08/xCaElIVOem2kdcJ.png)

![image-20210108111822098](https://i.loli.net/2021/01/08/ywskDMcEgQ4LmnB.png)

![image-20210108112220377](https://i.loli.net/2021/01/08/u8ZfEtPzLkSCY9g.png)

select cid, sum(score)  'sum'  from  stu  group  by  cid  having  sum>200 order by sum asc;

# 限制输出

可以将查询好的结果,限制输出

可以限制输出几条,从哪里输出

语法:

​	在sql语句最后写 limit  offset,row_count

​	limit 开始下标 ,行数

​	例如:limit 0,2;  ==>从第一条输出,输出2条

![image-20210108113311500](https://i.loli.net/2021/01/08/1EVanhkfvgOtSRL.png)

![image-20210108113450393](https://i.loli.net/2021/01/08/dF8wlTME9zZ5qir.png)

![image-20210108114341071](https://i.loli.net/2021/01/08/mEnq7ZaQvzPWril.png)

![image-20210108114534446](https://i.loli.net/2021/01/08/SmYnfVLUW84t3oF.png)

![image-20210108114755217](C:%5CUsers%5CAdministrator%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20210108114755217.png)

![image-20210108141636116](https://i.loli.net/2021/01/08/E8Nos2zUMiWARL4.png)

命令执行顺序:

![image-20210108142053176](C:%5CUsers%5CAdministrator%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20210108142053176.png)

# 1多表查询:

1合并结果集

将两表的查询结果纵向拼接在一起 

union/union all

union表示纵向拼接(去重)

拼接要保证字段类型,个数一致

union all在拼接时不会去重

# 2连接查询:

![image-20210108145430424](https://i.loli.net/2021/01/08/3PxEufy9lKFd7cS.png)

<img src="C:%5CUsers%5CAdministrator%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20210108150528001.png" alt="image-20210108150528001"  />

# 连接查询就是将多个表多行数据相乘-->笛卡尔积

内连接:

语法格式:

select  *  from 表1 inner join  表2 on 关联条件;

内连接只会保留完全符合条件的语句

![image-20210108152313521](C:%5CUsers%5CAdministrator%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20210108152313521.png)

给表取别名

简写

![image-20210108155028190](C:%5CUsers%5CAdministrator%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20210108155028190.png)

外连接:

会保留不满足条件的数据

左外连接: left outer join on

会保留左表中不满足条件的数据

右外连接right outer join on

会保留右表中不符合条件的数据

一般outer 关键字可以省略

![image-20210108160456368](C:%5CUsers%5CAdministrator%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20210108160456368.png)

# 子查询

子查询就是嵌套查询

一般子查询出现在:

​		from后,当做一张表使用

​		where后,当做条件使用

​		select后,

![image-20210108161800272](C:%5CUsers%5CAdministrator%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20210108161800272.png)

![image-20210108163026682](C:%5CUsers%5CAdministrator%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20210108163026682.png)

# 自连接

