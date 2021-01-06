package com.dzk.designpattern.create.factory.factoryMethod.bag;

import com.dzk.designpattern.entity.Bag;
import com.dzk.designpattern.entity.bag.AppleBag;
import com.dzk.designpattern.entity.bag.OrangeBag;

public class OrangeBagFactory implements BagFactory{
    @Override
    public Bag getBag() {
        return new OrangeBag();
    }
}
