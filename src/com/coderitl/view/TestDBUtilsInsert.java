package com.coderitl.view;

import com.coderitl.dao.UserInfoDao;
import com.coderitl.dao.impl.UserInfoDaoImpl;
import com.coderitl.entity.UserInfo;

public class TestDBUtilsInsert {
    public static void main(String[] args) {
        UserInfoDao userInfoDao = new UserInfoDaoImpl();
        UserInfo userInfo = new UserInfo(6, "queryRun", "queryPwd");
        int insertRes = userInfoDao.insert(userInfo);
        System.out.println(insertRes);
    }
}
