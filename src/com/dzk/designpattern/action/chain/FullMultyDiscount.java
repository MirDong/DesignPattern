package com.dzk.designpattern.action.chain;

import com.dzk.designpattern.action.strategy.Discount;

public class FullMultyDiscount extends MultyDiscount {

    public FullMultyDiscount(MultyDiscount multyDiscount) {
        super(multyDiscount);
    }

    @Override
    public int calculate(int money) {
        if (money > 200){
            System.out.println("满200减30");
            money -= 30;
        }
        return super.calculate(money);
    }
}
