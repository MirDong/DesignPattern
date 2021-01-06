package com.dzk.designpattern.create.factory.factoryMethod.bag;

import com.dzk.designpattern.entity.Bag;
import com.dzk.designpattern.entity.bag.AppleBag;
import com.dzk.designpattern.entity.bag.BananaBag;

public class BananaBagFactory implements BagFactory{
    @Override
    public Bag getBag() {
        return new BananaBag();
    }
}
