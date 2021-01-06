package com.dzk.designpattern.structure.facade;

/**
 * 外观模式,客户服务一条龙，隐藏内部细节
 */
public class ConsumerClient {
    public static void main(String[] args) {
//        doOrder();
        doOrderFacade();
    }

    private static void doOrderFacade() {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.doOrder();
    }

    //由消费者实现所有细节，太累
    private static void doOrder() {
        PickService pickService = new PickService();
        PackService packService = new PackService();
        SendService sendService = new SendService();

        //采摘
        System.out.println("---------------");
        pickService.doPick();

        //打包
        System.out.println("---------------");
        packService.doPack();

        //运输
        System.out.println("---------------");
        sendService.doSend();

    }
}
