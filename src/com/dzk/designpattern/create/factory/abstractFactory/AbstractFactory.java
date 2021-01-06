package com.dzk.designpattern.create.factory.abstractFactory;

import com.dzk.designpattern.entity.Bag;
import com.dzk.designpattern.entity.Fruit;

/**
 * 抽象工厂模式  解决：当水果工厂与打包工厂在业务上容易人为发生不匹配时使用，将两者绑定起来
 * 例如，苹果装入了橘子的包装，需要通过抽象，将水果与包装绑定起来
 */
public abstract class AbstractFactory {
    public abstract Fruit getFruit();
    public abstract Bag getBag();
}
