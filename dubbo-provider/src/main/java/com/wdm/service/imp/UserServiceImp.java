package com.wdm.service.imp;

import com.wdm.service.IUserService;

/**
 * @author wdm
 * @create 2020-07-07 20:48
 **/
public class UserServiceImp implements IUserService {
    @Override
    public String hello() {
        return "hell,dubbo!";
    }
}