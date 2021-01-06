package com.dzk.designpattern.create.factory.simpleFactory;

import com.dzk.designpattern.entity.Fruit;

public class StaticFactoryClient {
    public static void main(String[] args) {
        lisonDo();
        jamesDo();
        peterDo();
    }
    //  lison切开吃
    private static void lisonDo() {
        Fruit fruit = StaticFactory.getFruit(StaticFactory.TYPE_APPLE);
        fruit.draw();
        System.out.println("-------------");
    }
    //james直接吃
    private static void jamesDo() {
        Fruit fruit = StaticFactory.getBananaFruit();
        fruit.draw();
        System.out.println("-------------");
    }
    //peter喝
    private static void peterDo() {
        Fruit fruit = StaticFactory.getOrangeFruit();
        fruit.draw();
        System.out.println("-------------");
    }
}
