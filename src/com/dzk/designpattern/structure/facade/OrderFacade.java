package com.dzk.designpattern.structure.facade;

/**
 * 客户服务全部内部实现，让客户更轻松，不必在意处理流程
 */
public class OrderFacade {
    private PickService pickService;
    private PackService packService;
    private SendService sendService;

    public OrderFacade() {
        this.pickService = new PickService();
        this.packService = new PackService();
        this.sendService = new SendService();
    }

    /**
     * 客户订单处理
     */
    public void doOrder(){
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
