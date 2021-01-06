package com.dzk.designpattern.structure.adapter;

import com.dzk.designpattern.create.factory.factoryMethod.fruit.OrangeFactory;
import com.dzk.designpattern.create.factory.factoryMethod.interfaces.FruitFactory;
import com.dzk.designpattern.entity.Fruit;
import com.dzk.designpattern.entity.bag.AppleBag;
import com.dzk.designpattern.entity.bag.OrangeBag;

/**
 * 橘子包装不够了，使用苹果包装代替，需要适配器来转换，苹果箱子装橘子
 */
public class AdapterClient {
    public static void main(String[] args) {
        FruitFactory fruitFactory = new OrangeFactory();
        Fruit fruit = fruitFactory.getFruit();
        OrangeBag bag = getBag();
        fruit.pack(bag);
    }

    private static OrangeBag getBag() {
        //准备用苹果纸箱代替
        AppleBag appleBag = new AppleBag();
        //苹果包装盒适配成橘子包装盒
        OrangeBag orangeBag = new OrangeBagAdapter(appleBag);
        return orangeBag;
    }
}
