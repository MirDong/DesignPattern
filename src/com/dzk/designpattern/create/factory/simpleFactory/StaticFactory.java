package com.dzk.designpattern.create.factory.simpleFactory;

import com.dzk.designpattern.entity.Fruit;
import com.dzk.designpattern.entity.fruit.Apple;
import com.dzk.designpattern.entity.fruit.Banana;
import com.dzk.designpattern.entity.fruit.Orange;

/**
 * 简单工厂模式-->静态工厂
 */
public class StaticFactory {
    public static final int TYPE_APPLE = 1;
    public static final int TYPE_BANANA = 2;
    public static final int TYPE_ORANGE = 3;

    public static Fruit getFruit(int type) {
        switch (type) {
            case TYPE_APPLE:
                return new Apple();
            case TYPE_BANANA:
                return new Banana();
            case TYPE_ORANGE:
                return new Orange("peter",80);
        }
        return null;
    }


    /**
     * 多工厂方法
     */
    public static Fruit getAppleFruit(){ return new Apple();}
    public static Fruit getBananaFruit(){ return new Banana();}
    public static Fruit getOrangeFruit(){ return new Orange("peter",30);}
}
