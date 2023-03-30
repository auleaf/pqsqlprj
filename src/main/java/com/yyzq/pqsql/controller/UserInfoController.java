package com.yyzq.pqsql.controller;

import com.yyzq.pqsql.entity.UserInfo;
import com.yyzq.pqsql.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserInfoController {
    @Autowired
    UserInfoService userInfoService;

    @ResponseBody
    @RequestMapping(value="/getalldata.action",method = {RequestMethod.GET, RequestMethod.POST})
    public Object getAllData(){
        return userInfoService.List();
    }
}
