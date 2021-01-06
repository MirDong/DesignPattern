package com.dzk.designpattern.entity.fruit;

import com.dzk.designpattern.entity.Bag;
import com.dzk.designpattern.entity.Fruit;

public class Banana implements Fruit {
    int price = 60;

    public Banana() {
    }

    public Banana(int price) {
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
        System.out.println("仙人蕉");
    }

    @Override
    public void pack(Bag bag) {
        if (null != bag){
            bag.pack();
        }
    }
}
