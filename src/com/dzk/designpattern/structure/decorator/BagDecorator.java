package com.dzk.designpattern.structure.decorator;

import com.dzk.designpattern.entity.Bag;

public class BagDecorator implements Bag {
    private Bag bag;//维持一个对抽象构建的引用

    public BagDecorator(Bag bag) {//注入一个抽象构建类型的对象
        this.bag = bag;
    }

    @Override
    public void pack() {
        if (null != bag){
            bag.pack();
        }
    }
}
