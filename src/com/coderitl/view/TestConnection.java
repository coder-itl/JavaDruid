package com.coderitl.view;

import com.coderitl.utils.DBUtils;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            // 初始化容量 10个
            Connection connection = DBUtils.getConnection();
            System.out.println(connection);

            try {
                // 关闭 => 放回池中
                connection.close(); // 调用的是 DruidPoolConnection实现类里的 close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
