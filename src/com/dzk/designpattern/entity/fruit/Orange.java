package com.dzk.designpattern.entity.fruit;

import com.dzk.designpattern.action.visit.Visit;
import com.dzk.designpattern.entity.Bag;
import com.dzk.designpattern.entity.Fruit;

public class Orange implements Fruit {
    int price = 70;
    String name="";
    public Orange() {
    }

    public Orange(String name,int price) {
        this.name = name;
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
        System.out.println("蜜糖橘");
    }

    @Override
    public void pack(Bag bag) {
        if (null != bag){
            bag.pack();
        }
    }

    @Override
    public int accept(Visit visit) {
        if (null != visit){
            return visit.sell(this);
        }
        return 0;
    }
}
