package com.blake.ticketconsumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.blake.ticketprovider.service.TicketProvideService;
import org.springframework.stereotype.Service;

/**
 * Created by Blake on 2018/10/8
 * <p>
 * org.springframework.stereotype.Service
 */
@Service
public class TicketConsumerService {

    /**
     * 使用 @Reference 标识服务引用方（即消费者终端）
     */
    @Reference
    private TicketProvideService ticketProvideService;

    public String getTicket() {

        return ticketProvideService.getTicket();
    }
}
