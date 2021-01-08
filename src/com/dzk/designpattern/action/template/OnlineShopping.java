package com.dzk.designpattern.action.template;

import com.dzk.designpattern.entity.Fruit;

import java.util.List;

/**
 * 模板方法模式
 * 结算
 */
public class OnlineShopping extends ShoppingCart{
    public OnlineShopping(List<Fruit> products) {
        super(products);
    }

    @Override
    protected void pay() {
        System.out.println("支付宝/微信支付成功");
    }
}
