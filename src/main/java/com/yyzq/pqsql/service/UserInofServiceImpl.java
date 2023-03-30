package com.yyzq.pqsql.service;

import com.yyzq.pqsql.entity.UserInfo;
import com.yyzq.pqsql.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInofServiceImpl implements UserInfoService{
    @Autowired
    UserInfoRepository userInfoRepository;

    @Override
    public int save(UserInfo userInfo) {
        UserInfo userInfo1 = userInfoRepository.save(userInfo);
        return userInfo1==null?1:0;
    }

    @Override
    public int delete(UserInfo userInfo) {
        userInfoRepository.delete(userInfo);
        return 0;
    }

    @Override
    public List<UserInfo> List() {
        return userInfoRepository.findAll();
    }

    @Override
    public List<UserInfo> GetByName(UserInfo userInfo) {
        return userInfoRepository.GetByName(userInfo.getName());
    }
}
