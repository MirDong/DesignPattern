package com.dzk.designpattern.structure.facade;

import com.dzk.designpattern.create.factory.abstractFactory.AbstractFactory;
import com.dzk.designpattern.create.factory.abstractFactory.AppleFactory;
import com.dzk.designpattern.entity.Bag;
import com.dzk.designpattern.structure.bridge.bag.AbstractBag;
import com.dzk.designpattern.structure.bridge.bag.SmallBag;
import com.dzk.designpattern.structure.bridge.material.Material;
import com.dzk.designpattern.structure.bridge.material.Paper;
import com.dzk.designpattern.structure.decorator.CheckedBagDecorator;
import com.dzk.designpattern.structure.decorator.ReforenceBagDecorator;
import com.dzk.designpattern.structure.decorator.SpeedBagDecorator;

/**
 * 包装服务
 */
public class PackService {
    //打包水果
    public void doPack(){
        AbstractFactory factory = new AppleFactory();
        //得到包装
        Bag bag = factory.getBag();
        //增加防伪，加固，加急处理
        bag = new CheckedBagDecorator(bag);
        bag = new ReforenceBagDecorator(bag);
        bag = new SpeedBagDecorator(bag);
        //开始打包
        bag.pack();

    }
}
