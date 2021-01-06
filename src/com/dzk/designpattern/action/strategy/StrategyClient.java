package com.dzk.designpattern.action.strategy;



public class StrategyClient {
    public static void main(String[] args) {
        int totalPrice = 300;
//      Discount discount = new FullDiscount();
      Discount discount = new NewerDiscount();
      int discountPrice = discount.calculate(totalPrice);
        System.out.println("优惠后价格: " + discountPrice);
    }
}
