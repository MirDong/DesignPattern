package com.dzk.designpattern.create.builder;

import com.dzk.designpattern.entity.fruit.Apple;
import com.dzk.designpattern.entity.fruit.Banana;
import com.dzk.designpattern.entity.fruit.Orange;

/**
 * 构建假日套餐
 */
public class HolidayBuilder implements Builder{
    FruitMeal fruitMeal = new FruitMeal();
    @Override
    public void builderApple(int price) {
        Apple apple = new Apple();
        apple.setPrice(price);
        fruitMeal.setApple(apple);
    }

    @Override
    public void builderBanana(int price) {
        Banana banana = new Banana();
        banana.setPrice(price);
        fruitMeal.setBanana(banana);
    }

    @Override
    public void builderOrange(int price) {
        Orange orange = new Orange();
        orange.setPrice(price);
        fruitMeal.setOrange(orange);
    }

    @Override
    public FruitMeal getFruitMeal() {
        fruitMeal.setDiscount(15);//折扣价
        fruitMeal.calculateTotalPrice();
        return fruitMeal;
    }

}
