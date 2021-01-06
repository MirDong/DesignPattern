package com.dzk.designpattern.entity.bag;

import com.dzk.designpattern.entity.Bag;

public class AppleBag implements Bag {
    @Override
    public void pack() {
        System.out.println("苹果使用纸箱包装");
    }
}
