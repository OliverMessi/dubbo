package com.wdm.springbootproviderannotation.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.wdm.service.IUserService;
import org.springframework.stereotype.Component;


/**
 * @author wdm
 * @create 2020-07-09 22:59
 **/
@Component  //表明正式一个Spring组件，受Spring管理
@Service  //发布服务
public class UserServiceImp implements IUserService {
    @Override
    public String hello() {
        return "springboot-annotation";
    }
}