###  Apache的`DBUtils`使用

+ `DBUtils`简介

  + `DBUtils`是`java`编程中数据库操作实用的小工具，小巧，简单，实用
    + 对于数据表的查询操作，可以把结果转换为`List`,`Array`,`Set`等集合，偏于操作
    + 对于数据表`DML`操作，也变得简单(`只需要写SQL语句`)

+ `DBUtils`主要包含

  + `ResultSetHandler`接口: 转换类型接口
    + `BeanHandler`类: 实现类，把一条记录转换成对象
    + `BeanListHandler`类，把多条记录转换成`List`集合
    + `ScalarHandler`类：实现类，适合获取一行一列的数据
  + `QueryRunner`:执行`sql`语句的类
    + 增、删、改:`update()`
    + 查询: `query()`

+ 练习使用

  + 获取`Apache Commons DbUtils`,`QueryRunner`所需依赖

    |                      自行下载                      |                 阿里网盘                  |
    | :------------------------------------------------: | :---------------------------------------: |
    | https://mvnrepository.com/artifact/commons-dbutils | https://www.aliyundrive.com/s/z21pTCo7QzP |

    

  + 表结构

    ```sql
    mysql> desc userinfo;
    +----------+-------------+------+-----+---------+----------------+
    | Field    | Type        | Null | Key | Default | Extra          |
    +----------+-------------+------+-----+---------+----------------+
    | id       | int(11)     | NO   | PRI | NULL    | auto_increment |
    | username | varchar(10) | NO   |     | NULL    |                |
    | password | varchar(18) | NO   |     | NULL    |                |
    +----------+-------------+------+-----+---------+----------------+
    3 rows in set (0.07 sec)
    
    mysql> 
    ```

  + 查询时实体类必须提供无参构造

    |                        未提供无参构造                        |                            解决后                            |
    | :----------------------------------------------------------: | :----------------------------------------------------------: |
    | ![errorCos.png](https://i.loli.net/2021/08/12/kvrEotN7hpCPymG.png) | ![rightCos.png](https://i.loli.net/2021/08/12/QCBpVreYfnqlbZ8.png) |