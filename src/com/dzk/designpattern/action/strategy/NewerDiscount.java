package com.dzk.designpattern.action.strategy;

/**
 * 新顾客优惠
 */
public class NewerDiscount implements Discount{
    @Override
    public int calculate(int money) {
        if (money > 100){
            System.out.println("新顾客满100，优惠20元");
            return money - 20;
        }
        return money;
    }
}
