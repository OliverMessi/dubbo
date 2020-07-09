package com.wdm.springbootproviderxml.service;

import com.wdm.service.IUserService;

public class UserServiceImp implements IUserService {
    @Override
    public String hello() {
        return "dubbo+springboot!!";
    }
}
