package com.wdm.springbootconsumerxml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:dubbo-consumer.xml")
public class SpringbootConsumerXmlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootConsumerXmlApplication.class, args);
    }

}
