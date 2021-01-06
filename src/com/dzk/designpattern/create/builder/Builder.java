package com.dzk.designpattern.create.builder;

/**
 * 创建一个MealBuilder类,实际的builder创建Meal对象
 */
public interface Builder {

    void builderApple(int price);//设置苹果
    void builderBanana(int price);//设置香蕉
    void builderOrange(int price);//设置橘子
    FruitMeal getFruitMeal();//返回创建的套餐

}
