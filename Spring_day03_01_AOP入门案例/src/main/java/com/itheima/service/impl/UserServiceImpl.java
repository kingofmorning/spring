package com.itheima.service.impl;

import com.itheima.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    public int save(){

        //0.将共性功能抽取出来
        //System.out.println("共性功能");
        System.out.println("user service running...");

        int x=1;int y=2;

        return 888;
    }

}
