package com.dzk.designpattern.action.template;

import com.dzk.designpattern.entity.Fruit;

import java.util.List;

/**
 * 模板方法模式
 * 他人代付结算
 */
public class OtherPayShopping extends ShoppingCart{
    public OtherPayShopping(List<Fruit> products) {
        super(products);
    }

    @Override
    protected void pay() {
        System.out.println("代付成功");
    }
}
