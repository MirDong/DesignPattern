package com.dzk.designpattern.action.chain;

import com.dzk.designpattern.action.strategy.Discount;

public class MultyDiscount implements Discount {
    private MultyDiscount multyDiscount;

    public MultyDiscount(MultyDiscount multyDiscount) {
        this.multyDiscount = multyDiscount;
    }

    @Override
    public int calculate(int money) {
        if (null != multyDiscount){
            return multyDiscount.calculate(money);
        }
        return money;
    }
}
