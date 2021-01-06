package com.dzk.designpattern.create.builder;

public class FruitMealController {
    public static void main(String[] args) {
        build();
    }

    private static void build() {
//        Builder builder = new HolidayBuilder();
        Builder builder = new OldConsumerBuilder();
        builder.builderApple(100);
        builder.builderBanana(60);
        builder.builderOrange(80);
        FruitMeal fruitMeal = builder.getFruitMeal();
        int cost = fruitMeal.cost();
        System.out.println("套餐优惠后总价: " + cost);
    }
}
