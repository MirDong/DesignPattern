package com.dzk.designpattern.action.chain;

public class HolidayMultyDiscount extends MultyDiscount {

    public HolidayMultyDiscount(MultyDiscount multyDiscount) {
        super(multyDiscount);
    }

    @Override
    public int calculate(int money) {
        if (money > 150){
            System.out.println("节假日优惠10元");
            money -= 10;
        }
            return super.calculate(money);
    }
}
