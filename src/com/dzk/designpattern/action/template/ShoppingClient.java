package com.dzk.designpattern.action.template;

import com.dzk.designpattern.action.strategy.FullDiscount;
import com.dzk.designpattern.action.strategy.HolidayDiscount;
import com.dzk.designpattern.create.factory.simpleFactory.StaticFactory;
import com.dzk.designpattern.entity.Fruit;

import java.util.ArrayList;
import java.util.List;

/**
 * 模板方法结算,创建订单的一系列流程，支付过程交由子类实现
 */
public class ShoppingClient {
    private static List<Fruit>products;
    public static void main(String[] args) {
        shopping();
    }
    static {
        products = new ArrayList<>();
        products.add(StaticFactory.getAppleFruit());
        products.add(StaticFactory.getBananaFruit());
        products.add(StaticFactory.getOrangeFruit());
    }
    private static void shopping() {
        ShoppingCart cart = new CashShopping(products);
        cart.setDiscount(new HolidayDiscount());
        cart.submitOrder();

    }
}
