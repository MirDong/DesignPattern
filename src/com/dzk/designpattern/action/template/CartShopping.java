package com.dzk.designpattern.action.template;

import com.dzk.designpattern.entity.Fruit;

import java.util.List;

/**
 * 模板方法模式
 * 结算
 */
public class CartShopping extends ShoppingCart{
    public CartShopping(List<Fruit> products) {
        super(products);
    }

    @Override
    protected void pay() {
        System.out.println("购物车结算成功");
    }
}
