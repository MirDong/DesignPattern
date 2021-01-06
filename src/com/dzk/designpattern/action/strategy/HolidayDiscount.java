package com.dzk.designpattern.action.strategy;

/**
 * 节假日优惠
 */
public class HolidayDiscount implements Discount{
    @Override
    public int calculate(int money) {
        if (money > 100){
            System.out.println("节假日满100，优惠10元");
            return money - 10;
        }
        return money;
    }
}
