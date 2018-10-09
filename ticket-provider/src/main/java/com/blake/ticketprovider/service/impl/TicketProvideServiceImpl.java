package com.blake.ticketprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.blake.ticketprovider.service.TicketProvideService;
import org.springframework.stereotype.Component;

/**
 * Created by Blake on 2018/10/8
 *
 * com.alibaba.dubbo.config.annotation.Service
 */
@Component
@Service
public class TicketProvideServiceImpl implements TicketProvideService {

    @Override
    public String getTicket() {
        return "《厉害了，我的国！》";
    }

}
