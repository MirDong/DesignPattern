package com.dzk.designpattern.structure.adapter;

import com.dzk.designpattern.entity.Bag;
import com.dzk.designpattern.entity.bag.OrangeBag;

/**
 * 适配器模式,橘子包装适配
 */
public class OrangeBagAdapter extends OrangeBag {
    Bag bag;

    public OrangeBagAdapter(Bag bag) {
        this.bag = bag;
    }

    @Override
    public void pack() {
        bag.pack();
    }
}
