package com.coderitl.dao.impl;

import com.coderitl.dao.UserInfoDao;
import com.coderitl.entity.UserInfo;
import com.coderitl.utils.DBUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class UserInfoDaoImpl implements UserInfoDao {
    // 定义一个成员变量 不要使用无参构造
    private QueryRunner queryRunner = new QueryRunner(DBUtils.getDataSource());


    @Override
    public int insert(UserInfo userInfo) {
        Object[] params = {userInfo.getId(), userInfo.getUsername(), userInfo.getPassword()};
        String sql = "insert into userinfo(id,username,password) values(?,?,?);";
        try {
            int updateRes = queryRunner.update(sql, params);
            return updateRes;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(UserInfo userInfo) {
        String sql = "update userinfo set username=?,password=? where id=?";
        Object[] params = {userInfo.getUsername(), userInfo.getPassword(), userInfo.getId()};

        try {
            int updateRes = queryRunner.update(sql, params);
            return updateRes;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

    @Override
    public int delete(int id) {
        String sql = "delete from userinfo  where id=?";
        try {
            int daleteRes = queryRunner.update(sql, id);
            return daleteRes;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public UserInfo selectOne(int id) {
        try {
            UserInfo userInfo = queryRunner.query("select * from userinfo where id=?;", new BeanHandler<UserInfo>(UserInfo.class), id);
            return userInfo;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<UserInfo> selectAll() {

        try {
            List<UserInfo> userlist = queryRunner.query("select * from userinfo;", new BeanListHandler<UserInfo>(UserInfo.class));
            return userlist;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
