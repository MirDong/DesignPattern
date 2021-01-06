package com.dzk.designpattern.action.strategy;

/**
 * 满减
 */
public class FullDiscount implements Discount{
    @Override
    public int calculate(int money) {
        if (money > 200){
            System.out.println("优惠20元");
            return money - 20;
        }
        return money;
    }
}
