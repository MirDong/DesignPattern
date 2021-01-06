package com.dzk.designpattern.structure.decorator;

import com.dzk.designpattern.entity.Bag;

public class SpeedBagDecorator extends BagDecorator{

    public SpeedBagDecorator(Bag bag) {
        super(bag);
    }

    @Override
    public void pack() {
        super.pack();
        checked();
    }
    //增加防伪标志
    private void checked() {
        System.out.println("-----------");
        System.out.println("加急投递处理");
    }


}
