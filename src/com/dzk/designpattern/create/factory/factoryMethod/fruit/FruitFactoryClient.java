package com.dzk.designpattern.create.factory.factoryMethod.fruit;

import com.dzk.designpattern.create.factory.factoryMethod.interfaces.FruitFactory;
import com.dzk.designpattern.create.factory.simpleFactory.StaticFactory;
import com.dzk.designpattern.entity.Fruit;

public class FruitFactoryClient {

    public static void main(String[] args) {
        lisonDo();
        jamesDo();
        peterDo();
    }
    //  lison切开吃
    private static void lisonDo() {
        FruitFactory fruitFactory = new AppleFactory();
        Fruit fruit = fruitFactory.getFruit();
        fruit.draw();
        System.out.println("-------------");
    }
    //james直接吃
    private static void jamesDo() {
        FruitFactory fruitFactory = new BananaFactory();
        Fruit fruit = fruitFactory.getFruit();
        fruit.draw();
        System.out.println("-------------");
    }
    //peter喝
    private static void peterDo() {
        FruitFactory fruitFactory = new OrangeFactory();
        Fruit fruit = fruitFactory.getFruit();
        fruit.draw();
        System.out.println("-------------");
    }
}
