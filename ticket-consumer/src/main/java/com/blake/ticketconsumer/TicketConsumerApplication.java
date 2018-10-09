package com.blake.ticketconsumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class TicketConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TicketConsumerApplication.class, args);
    }
}
