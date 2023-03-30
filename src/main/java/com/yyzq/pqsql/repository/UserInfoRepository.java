package com.yyzq.pqsql.repository;


import com.yyzq.pqsql.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserInfoRepository  extends JpaRepository<UserInfo,Integer> {
//    @Query(value = "select * from userinfo",nativeQuery = true)
//    List<UserInfo> GetAllData();

    @Query(value = "select * from userinfo where name = :name",nativeQuery = true)
    List<UserInfo> GetByName(@Param("name") String name);


}
