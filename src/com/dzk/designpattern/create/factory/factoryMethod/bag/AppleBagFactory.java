package com.dzk.designpattern.create.factory.factoryMethod.bag;

import com.dzk.designpattern.entity.Bag;
import com.dzk.designpattern.entity.bag.AppleBag;

public class AppleBagFactory implements BagFactory{
    @Override
    public Bag getBag() {
        return new AppleBag();
    }
}
