package com.coderitl.dao;

import com.coderitl.entity.UserInfo;

import java.util.List;

public interface UserInfoDao {
    // 约束
    public int insert(UserInfo userInfo);

    public int update(UserInfo userInfo);

    public int delete(int id);

    public UserInfo selectOne(int id);

    public List<UserInfo> selectAll();

}
