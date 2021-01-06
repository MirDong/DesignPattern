package com.dzk.designpattern.action.chain;

import com.dzk.designpattern.action.strategy.Discount;

public class MultyDiscount implements Discount {
    @Override
    public int calculate(int money) {
        return 0;
    }
}
