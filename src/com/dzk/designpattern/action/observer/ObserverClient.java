package com.dzk.designpattern.action.observer;

/**
 * 观察者模式，顾客关注可青芒，降价时通知他们
 */
public class ObserverClient {
    public static void main(String[] args) {
        Attention attention = new MangoAttention();
        attention.addObserver(new ConsumerObserver("peter"));
        attention.addObserver(new ConsumerObserver("Jim"));
        attention.addObserver(new ConsumerObserver("leo"));
        attention.addObserver(new ConsumerObserver("ham"));

        attention.notifyObservers();
    }
}
