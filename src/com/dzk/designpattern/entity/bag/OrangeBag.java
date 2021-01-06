package com.dzk.designpattern.entity.bag;

import com.dzk.designpattern.entity.Bag;

public class OrangeBag implements Bag {
    @Override
    public void pack() {
        System.out.println("橘子使用网兜包装");
    }
}
