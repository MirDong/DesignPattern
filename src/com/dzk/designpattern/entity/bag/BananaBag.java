package com.dzk.designpattern.entity.bag;

import com.dzk.designpattern.entity.Bag;

public class BananaBag implements Bag {
    @Override
    public void pack() {
        System.out.println("香蕉使用竹箩筐包装");
    }
}
