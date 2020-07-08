package com.wdm.consumer;

import com.wdm.service.IUserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author wdm
 * @create 2020-07-08 21:15
 * 调用服务
 **/
public class Consumer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"classpath:dubbo-consumer.xml"});
        context.start();
        for (int i = 0; i < 4; i++) {
            //获取远程服务
            IUserService userService = context.getBean(IUserService.class);
            //
            System.out.println("获取服务端的反馈信息："+userService.hello());
        }

        System.in.read(); // 按任意键退出
    }
}