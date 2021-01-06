package com.dzk.designpattern.entity.fruit;

import com.dzk.designpattern.entity.Bag;
import com.dzk.designpattern.entity.Fruit;

public class Apple implements Fruit {
    int price = 100;

    public Apple() {
    }

    public Apple(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public void draw() {
        System.out.println("红富士苹果");
    }

    @Override
    public void pack(Bag bag) {
        if (null != bag){
            bag.pack();
        }
    }
}
