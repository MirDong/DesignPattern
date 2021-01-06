package com.dzk.designpattern.create.factory.factoryMethod.fruit;

import com.dzk.designpattern.create.factory.factoryMethod.interfaces.FruitFactory;
import com.dzk.designpattern.entity.Fruit;
import com.dzk.designpattern.entity.fruit.Banana;
/**
 * 工厂方法模式
 */
public class BananaFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Banana();
    }
}
