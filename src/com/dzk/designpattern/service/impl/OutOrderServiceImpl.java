package com.dzk.designpattern.service.impl;

import com.dzk.designpattern.service.OrderService;

public class OutOrderServiceImpl implements OrderService {
    @Override
    public int acceptOrder() {
        System.out.println("外部下单成功,订单号:666666");
        return 666666;
    }
}
