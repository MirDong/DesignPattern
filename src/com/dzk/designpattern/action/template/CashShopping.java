package com.dzk.designpattern.action.template;

import com.dzk.designpattern.entity.Fruit;

import java.util.List;

/**
 * 模板方法模式
 * 结算
 */
public class CashShopping extends ShoppingCart{
    public CashShopping(List<Fruit> products) {
        super(products);
    }

    @Override
    protected void pay() {
        System.out.println("现金支付，不支持假币");
    }
}
