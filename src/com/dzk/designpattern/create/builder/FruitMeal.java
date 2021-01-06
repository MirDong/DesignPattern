package com.dzk.designpattern.create.builder;

import com.dzk.designpattern.entity.fruit.Apple;
import com.dzk.designpattern.entity.fruit.Banana;
import com.dzk.designpattern.entity.fruit.Orange;

/**
 * 创建一个水果套餐
 */
public class FruitMeal {
    private Apple apple;//苹果--价格
    private Banana banana;//香蕉--价格
    private Orange orange;//橘子--价格
    private int discount;//折扣
    private int totalPrice;//套餐总价

    public void setApple(Apple apple) {
        this.apple = apple;
    }

    public void setBanana(Banana banana) {
        this.banana = banana;
    }

    public void setOrange(Orange orange) {
        this.orange = orange;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int cost(){
        return totalPrice;
    }

    public void calculateTotalPrice(){
        if (null != apple){
            totalPrice += apple.price();
        }

        if (null != banana){
            totalPrice += banana.price();
        }

        if (null != orange){
            totalPrice += orange.price();
        }
        if (totalPrice > 0){
            totalPrice -= discount;
        }
    }

    public void showItem(){
        System.out.println("total price: " + totalPrice);
    }
}
