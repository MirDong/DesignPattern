package com.dzk.designpattern.action.chain;

/**
 * 责任链模式,购物车优惠结算
 */
public class ChainCartClient {
    public static void main(String[] args) {
        calculateCartChain(100);
    }

    private static void calculateCartChain(int totalPrice) {
        MultyDiscount discount = new FullMultyDiscount(null);
        discount = new HolidayMultyDiscount(discount);
        discount = new SecondMultyDiscount(discount);
        discount = new NewerMultyDiscount(discount);
        int pay = discount.calculate(totalPrice);
        System.out.println("支付金额: " + pay);
    }
}
