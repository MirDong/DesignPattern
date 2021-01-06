package com.dzk.designpattern.create.factory.abstractFactory;

import com.dzk.designpattern.entity.Bag;
import com.dzk.designpattern.entity.Fruit;
import com.dzk.designpattern.entity.bag.OrangeBag;
import com.dzk.designpattern.entity.fruit.Orange;

public class OrangeFactory extends AbstractFactory {
    @Override
    public Fruit getFruit() {
        return new Orange();
    }

    @Override
    public Bag getBag() {
        return new OrangeBag();
    }
}
