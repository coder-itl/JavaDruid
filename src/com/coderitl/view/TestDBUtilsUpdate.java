package com.coderitl.view;

import com.coderitl.dao.UserInfoDao;
import com.coderitl.dao.impl.UserInfoDaoImpl;
import com.coderitl.entity.UserInfo;

public class TestDBUtilsUpdate {
    public static void main(String[] args) {
        UserInfoDao userInfoDao = new UserInfoDaoImpl();
        UserInfo userInfo = new UserInfo(6, "newName", "newPassword");
        int updateRes = userInfoDao.update(userInfo);
        System.out.println(updateRes);
    }
}
