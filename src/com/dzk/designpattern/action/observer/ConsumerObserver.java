package com.dzk.designpattern.action.observer;

/**
 * 消费者接收到降价通知
 */
public class ConsumerObserver implements Observer{
    public ConsumerObserver(String name) {
        this.name = name;
    }

    private String name;
    @Override
    public void update() {
        System.out.println( name + "购买青芒");
    }
}
