package com.dzk.designpattern.structure.proxy;

import com.dzk.designpattern.service.OrderService;

/**
 * 代理模式，代售进口水果
 */
public class ProxyClient {
    public static void main(String[] args) {
        //本地代理商
        OrderService orderService = new ProxyOrder();
        orderService.acceptOrder();
    }
}
