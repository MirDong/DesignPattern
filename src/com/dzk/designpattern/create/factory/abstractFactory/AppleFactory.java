package com.dzk.designpattern.create.factory.abstractFactory;

import com.dzk.designpattern.entity.Bag;
import com.dzk.designpattern.entity.Fruit;
import com.dzk.designpattern.entity.bag.AppleBag;
import com.dzk.designpattern.entity.fruit.Apple;

public class AppleFactory extends AbstractFactory {
    @Override
    public Fruit getFruit() {
        return new Apple();
    }

    @Override
    public Bag getBag() {
        return new AppleBag();
    }
}
