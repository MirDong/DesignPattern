package com.dzk.designpattern.action.strategy;

/**
 * 第二份九折优惠
 */
public class SecondDiscount implements Discount{
    @Override
    public int calculate(int money) {
            System.out.println("第二件九折优惠");
            return (int)(money * 0.9);
    }
}
