package com.dzk.designpattern.action.visit;

import com.dzk.designpattern.entity.Fruit;
import com.dzk.designpattern.entity.fruit.Apple;
import com.dzk.designpattern.entity.fruit.Banana;
import com.dzk.designpattern.entity.fruit.Orange;

/**
 * 访问者模式
 */
public class Visit {
    //苹果计价
    public int sell(Apple apple){
        System.out.println("apple's price : ￥30");
        return 30;
    }
    //香蕉计价
    public int sell(Banana banana){
        System.out.println("banana's price : ￥80");
        return 80;
    }
    //橘子计价
    public int sell(Orange orange){
        System.out.println("orange's price : ￥50");
        return 50;
    }
    //其他水果计价
    public int sell(Fruit fruit){
        System.out.println("fruit's price : ￥10");
        return 10;
    }
}
