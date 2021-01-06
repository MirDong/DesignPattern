package com.dzk.designpattern.create.factory.abstractFactory;

import com.dzk.designpattern.entity.Bag;
import com.dzk.designpattern.entity.Fruit;

public class OrderSendClient {
    public static void main(String[] args) {
        sendFruit();
    }

    private static void sendFruit() {
        //初始化工厂
        AbstractFactory factory = new AppleFactory();
        //得到工厂
        Fruit fruit = factory.getFruit();
        fruit.draw();

        //获取包装
        Bag bag = factory.getBag();
        bag.pack();
        //....物流业务

    }
}
