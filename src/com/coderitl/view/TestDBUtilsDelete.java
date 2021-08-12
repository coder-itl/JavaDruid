package com.coderitl.view;

import com.coderitl.dao.UserInfoDao;
import com.coderitl.dao.impl.UserInfoDaoImpl;
import com.coderitl.entity.UserInfo;

public class TestDBUtilsDelete {
    public static void main(String[] args) {
        UserInfoDao userInfoDao = new UserInfoDaoImpl();
        int deleteRes = userInfoDao.delete(6);
        System.out.println(deleteRes);
    }
}
