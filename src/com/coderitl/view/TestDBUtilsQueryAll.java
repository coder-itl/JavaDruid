package com.coderitl.view;

import com.coderitl.dao.UserInfoDao;
import com.coderitl.dao.impl.UserInfoDaoImpl;
import com.coderitl.entity.UserInfo;

import java.util.List;

public class TestDBUtilsQueryAll {
    public static void main(String[] args) {
        UserInfoDao userInfoDao = new UserInfoDaoImpl();
        List<UserInfo> userList = userInfoDao.selectAll();
        // Labbda ?  userList.forEach(System.out::println);

        for (int i = 0; i < userList.size(); i++) {
            System.out.println(userList.get(i));
        }
    }
}
