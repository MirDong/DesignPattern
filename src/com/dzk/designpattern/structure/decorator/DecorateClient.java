package com.dzk.designpattern.structure.decorator;

import com.dzk.designpattern.create.factory.abstractFactory.AbstractFactory;
import com.dzk.designpattern.create.factory.abstractFactory.AppleFactory;
import com.dzk.designpattern.entity.Bag;

/**
 * 装饰器模式
 */
public class DecorateClient {
    public static void main(String[] args) {
        AbstractFactory factory = new AppleFactory();
        //得到水果
        factory.getFruit().draw();
        //得到包装
        Bag bag = factory.getBag();

        bag = new CheckedBagDecorator(bag);//防伪
        bag = new ReforenceBagDecorator(bag);//加固
        bag = new SpeedBagDecorator(bag);//加急

        bag.pack();
    }
}
