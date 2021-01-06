package com.dzk.designpattern.service.impl;

import com.dzk.designpattern.service.OrderService;

public class OrderServiceImpl implements OrderService {
    @Override
    public int acceptOrder() {
        System.out.println("下单成功,订单号:888888");
        return 888888;
    }
}
