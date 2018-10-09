package com.blake.ticketconsumer;

import com.blake.ticketconsumer.service.TicketConsumerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TicketConsumerApplicationTests {

    @Autowired
    private TicketConsumerService ticketConsumerService;

    @Test
    public void contextLoads() {

        String ticket = ticketConsumerService.getTicket();
        Date date = new Date();

        System.out.println("=========> 买到电影票：" + ticket + date);
    }

}
