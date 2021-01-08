package com.dzk.designpattern.action.visit;


import com.dzk.designpattern.create.factory.simpleFactory.StaticFactory;
import com.dzk.designpattern.entity.Fruit;

import java.util.ArrayList;
import java.util.List;

/**
 * 访问者设计模式，解决多态引起的无法识别具体实例(Apple，Orange,Banana)的问题
 * 将visit传入对应的水果，在水果类内部将对象this传入，达到多态无法识别具体对象的问题
 */
public class VisitClient {
    private static List<Fruit> fruits = new ArrayList<>();
    private static Visit visit = new Visit();
    static {
        fruits.add(StaticFactory.getOrangeFruit());
        fruits.add(StaticFactory.getAppleFruit());
        fruits.add(StaticFactory.getBananaFruit());
        fruits.add(StaticFactory.getAppleFruit());
        fruits.add(StaticFactory.getOrangeFruit());
        fruits.add(StaticFactory.getOrangeFruit());
    }
    public static void main(String[] args) {
        //统计库存
        collectionLibrary();
    }

    private static void collectionLibrary() {
        int price = 0;
        for (Fruit fruit : fruits) {
            price += fruit.accept(visit);
        }
        System.out.println("商品总额: " + price);
    }
}
