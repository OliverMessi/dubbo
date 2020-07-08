package com.wdm.service.imp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author wdm
 * @create 2020-07-08 20:22
 * 启动Spring容器，自动发布服务
 **/
public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"classpath:dubbo-provider.xml"});
        context.start();
        System.out.println("发布服务成功！");
        System.in.read(); // 按任意键退出
    }
}