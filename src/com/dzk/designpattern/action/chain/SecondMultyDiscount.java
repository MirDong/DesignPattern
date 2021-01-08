package com.dzk.designpattern.action.chain;

public class SecondMultyDiscount extends MultyDiscount {
    public SecondMultyDiscount(MultyDiscount multyDiscount) {
        super(multyDiscount);
    }

    @Override
    public int calculate(int money) {
        if (money > 0){
            System.out.println("第二单九折");
            money *= 0.9;
        }
        return super.calculate(money);
    }
}
