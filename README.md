###  Apache的`DBUtils`使用

+ `DBUtils`简介

  {% tip key %}

  + `DBUtils`是`java`编程中数据库操作实用的小工具，小巧，简单，实用
    + 对于数据表的查询操作，可以把结果转换为`List`,`Array`,`Set`等集合，偏于操作
    + 对于数据表`DML`操作，也变得简单(`只需要写SQL语句`)

  {% endtip %}

+ `DBUtils`主要包含

  {% tip key %}

  + `ResultSetHandler`接口: 转换类型接口
    + `BeanHandler`类: 实现类，把一条记录转换成对象
    + `BeanListHandler`类，把多条记录转换成`List`集合
    + `ScalarHandler`类：实现类，适合获取一行一列的数据
  + `QueryRunner`:执行`sql`语句的类
    + 增、删、改:`update()`
    + 查询: `query()`

  {% endtip %}

+ 练习使用

  + 获取`Apache Commons DbUtils`,`QueryRunner`所需依赖

    |                           自行下载                           |                       个人阿里网盘获取                       |
    | :----------------------------------------------------------: | :----------------------------------------------------------: |
    | {% link Apache Commons DbUtils,https://mvnrepository.com/artifact/commons-dbutils,https://mvnrepository.com/assets/images/7080b8b0f6f48e6fbaffd5f9d85fcc7f-favicon.ico %} | {% link Java-Jar, https://www.aliyundrive.com/s/z21pTCo7QzP,https://gw.alicdn.com/imgextra/i3/O1CN01aj9rdD1GS0E8io11t_!!6000000000620-73-tps-16-16.ico %} |

    

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