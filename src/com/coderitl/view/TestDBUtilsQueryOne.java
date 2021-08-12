package com.coderitl.view;

import com.coderitl.dao.UserInfoDao;
import com.coderitl.dao.impl.UserInfoDaoImpl;
import com.coderitl.entity.UserInfo;

public class TestDBUtilsQueryOne {
    // TODO: java.sql.SQLException: Cannot create com.coderitl.entity.UserInfo: com.coderitl.entity.UserInfo Query: select * from userinfo where id=?; Parameters: [1001]
    public static void main(String[] args) {
        UserInfoDao userInfoDao = new UserInfoDaoImpl();
        UserInfo userInfo = userInfoDao.selectOne(1001);
        System.out.println(userInfo);
    }
}
