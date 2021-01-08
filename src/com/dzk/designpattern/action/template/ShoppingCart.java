package com.dzk.designpattern.action.template;

import com.dzk.designpattern.action.strategy.Discount;
import com.dzk.designpattern.entity.Fruit;

import java.util.ArrayList;
import java.util.List;

public abstract class ShoppingCart {
    private Discount discount;
    private List<Fruit> products = new ArrayList<>();

    public ShoppingCart(List<Fruit> products) {
        this.products = products;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public void submitOrder(){
        int money = balance();
        System.out.println("商品总金额: " +money);
        if ( null != discount){
            money = discount.calculate(money);
            System.out.println("优惠后: " + money);
        }
        //订单支付
        pay();
        //送货上门
        sendHome();
    }

    private void sendHome(){
        System.out.println("三公里以内送货上门");
    }

    protected abstract void pay();

    //计算金额
    private  int balance(){
        System.out.println("商品清单: ");
        int money = 0;
        for (Fruit fruit : products) {
            fruit.draw();
            money += fruit.price();
        }
        return money;
    }

}
