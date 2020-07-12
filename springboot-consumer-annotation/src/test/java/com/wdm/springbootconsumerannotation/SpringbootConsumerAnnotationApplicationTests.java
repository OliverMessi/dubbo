package com.wdm.springbootconsumerannotation;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wdm.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootConsumerAnnotationApplicationTests {

    @Reference
    private IUserService userService;
    @Test
    public void contextLoads() {
        System.out.println(userService.hello());
    }

}
