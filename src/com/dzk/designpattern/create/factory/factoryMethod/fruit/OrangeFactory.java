package com.dzk.designpattern.create.factory.factoryMethod.fruit;

import com.dzk.designpattern.create.factory.factoryMethod.interfaces.FruitFactory;
import com.dzk.designpattern.entity.Fruit;
import com.dzk.designpattern.entity.fruit.Orange;

/**
 * 工厂方法模式
 */
public class OrangeFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Orange();
    }
}
