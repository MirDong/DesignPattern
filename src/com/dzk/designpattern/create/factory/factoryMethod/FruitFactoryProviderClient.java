package com.dzk.designpattern.create.factory.factoryMethod;

import com.dzk.designpattern.create.factory.factoryMethod.bag.AppleBagFactory;
import com.dzk.designpattern.create.factory.factoryMethod.bag.BagFactory;
import com.dzk.designpattern.create.factory.factoryMethod.fruit.AppleFactory;
import com.dzk.designpattern.create.factory.factoryMethod.interfaces.FruitFactory;
import com.dzk.designpattern.entity.Bag;
import com.dzk.designpattern.entity.Fruit;

/**
 * 模板方法符合单一职责原则，一种水果使用一个工厂
 */
public class FruitFactoryProviderClient {
    public static void main(String[] args) {
        //初始化苹果工厂
        FruitFactory fruitFactory = new AppleFactory();
        Fruit fruit = fruitFactory.getFruit();
        fruit.draw();

        //初始化包装工厂
        BagFactory bagFactory = new AppleBagFactory();
        Bag bag = bagFactory.getBag();
        bag.pack();//打包


        //...........运输..........
    }
}
