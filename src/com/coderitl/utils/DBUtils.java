package com.coderitl.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils {

    // 声明连接池对象
    private static DruidDataSource ds;

    static {
        Properties properties = new Properties();
        // 创建流
        InputStream is = DBUtils.class.getResourceAsStream("/database.properties");
        // 加载
        try {
            properties.load(is);
            //
            ds = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        try {
            // 通过连接池获得连接对象
            return ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static DataSource getDataSource() {
        return ds;
    }


}
