package com.dzk.designpattern.action.chain;

public class NewerMultyDiscount extends MultyDiscount {

    public NewerMultyDiscount(MultyDiscount multyDiscount) {
        super(multyDiscount);
    }

    @Override
    public int calculate(int money) {
        if (money > 100){
            System.out.println("新顾客优惠20元");
            money -= 20;
        }
        return super.calculate(money);
    }
}
