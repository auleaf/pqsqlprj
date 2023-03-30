package com.yyzq.pqsql.service;

import com.yyzq.pqsql.entity.UserInfo;

import java.util.List;

public interface UserInfoService {
    int save(UserInfo userInfo);
    int delete(UserInfo userInfo);
    List<UserInfo> List();
    List<UserInfo> GetByName(UserInfo userInfo);
}
