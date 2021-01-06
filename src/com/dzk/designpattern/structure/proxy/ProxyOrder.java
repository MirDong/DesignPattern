package com.dzk.designpattern.structure.proxy;

import com.dzk.designpattern.service.OrderService;
import com.dzk.designpattern.service.impl.OutOrderServiceImpl;

public class ProxyOrder implements OrderService {
    //真实的订单服务
    private OrderService orderService = new OutOrderServiceImpl();
    @Override
    public int acceptOrder() {
        return orderService.acceptOrder();
    }
}
