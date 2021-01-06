package com.dzk.designpattern.create.factory.abstractFactory;

import com.dzk.designpattern.entity.Bag;
import com.dzk.designpattern.entity.Fruit;
import com.dzk.designpattern.entity.bag.BananaBag;
import com.dzk.designpattern.entity.fruit.Banana;

public class BananaFactory extends AbstractFactory {
    @Override
    public Fruit getFruit() {
        return new Banana();
    }

    @Override
    public Bag getBag() {
        return new BananaBag();
    }
}
